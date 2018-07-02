package com.bestercapitalmedia.chiragh.user;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.temporal.TemporalAmount;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bestercapitalmedia.chiragh.mail.MailService;
import com.bestercapitalmedia.chiragh.oauth.dao.UserDao;
import com.bestercapitalmedia.chiragh.oauth.model.User;
import com.bestercapitalmedia.chiragh.property.ChiraghPropertyRentDetailsDTO;
import com.bestercapitalmedia.chiragh.property.Chiraghproperty;
import com.bestercapitalmedia.chiragh.utill.ChiragUtill;
import com.bestercapitalmedia.chiragh.utill.ValidatedInput;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.monitorjbl.json.JsonView;
import com.monitorjbl.json.JsonViewModule;
import com.monitorjbl.json.Match;
import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class ChiraghUserService {

	@Autowired
	private UserRepository userRepository;
	@Autowired
	private ValidatedInput validatedInput;
	@Autowired
	private ChiragUtill chiragUtill;
	@Autowired
	private MailService mailService;
	@Autowired
	private UserDao userDao;

	
	
	public List<Chiraghuser> getUserWithCompleteProperties(){
		return userRepository.findUserWithCompleteProperties();
	}
	
	public UserRegisterationDTO getUserByUserId(int userId) {
		ModelMapper mapper = new ModelMapper();
		Chiraghuser chiraghuser = userRepository.findByUserId(userId);
		if (chiraghuser != null)
			return mapper.map(chiraghuser, UserRegisterationDTO.class);
		else
			return null;
	}

	public UserRegisterationDTO getUserByName(String name) {
		ModelMapper mapper = new ModelMapper();
		Chiraghuser chiraghuser = userRepository.findByUserName(name);
		if (chiraghuser != null)
			return mapper.map(chiraghuser, UserRegisterationDTO.class);
		else
			return null;
	}

	public UserRegisterationDTO save(UserRegisterationDTO userRegisterationDTO) {
		ModelMapper mapper = new ModelMapper();
		try {
			if (userRepository.findByUserName(userRegisterationDTO.getUserName()) == null
					&& userRepository.findByEmail(userRegisterationDTO.getUserEmail()) == null
					&& userRegisterationDTO.getUserPassword().equals(userRegisterationDTO.getConfirmPassword())
					&& chiragUtill.validatePassword(userRegisterationDTO.getUserPassword()).equals("good")
					|| chiragUtill.validatePassword(userRegisterationDTO.getUserPassword()).equals("strong")) {
				userRegisterationDTO
						.setUserPassword(chiragUtill.getencodedUserPassword(userRegisterationDTO.getUserPassword()));
				Chiraghuser newChiraghuser = userRepository.save(mapper.map(userRegisterationDTO, Chiraghuser.class));
				return mapper.map(newChiraghuser, UserRegisterationDTO.class);
			} else
				return null;
		} catch (Exception e) {
			return null;
		}
	}

	public UserLoginDTO login(UserLoginDTO userLoginDTO) throws ParseException {
		ModelMapper mapper = new ModelMapper();
		Chiraghuser u1 = userRepository.findByUserName(userLoginDTO.getUserName());
		System.out.println(u1.getUserName());
		System.out.println(userLoginDTO.getRole());
		
		Chiraghuser chiraghuser=null;
		if (u1.getRole().equals("chiraghuser")) {
			chiraghuser=null;
			String enterpassword=chiragUtill.getencodedUserPassword(userLoginDTO.getUserPassword());
			  if(enterpassword.equals(u1.getOldPasssword())) {
				 
//				  SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
//
//				  String dateString = format.format( new Date());
//				  String olddate=u1.getPasswordChangeDate();
//				  Date  date = format.parse (olddate);    
//				  System.out.println(enterpassword);
//   				  userLoginDTO.setMsg("Your Password Changed"+date );
					
					return userLoginDTO; 
				
				
			}
			  
			else if(chiragUtill.getencodedUserPassword(userLoginDTO.getUserPassword()).equals(u1.getUserPassword())) {
				chiraghuser = userRepository.findByUserNameNPassword(userLoginDTO.getUserName(),
						chiragUtill.getencodedUserPassword(userLoginDTO.getUserPassword()));					
			}
			
		} else {
			 chiraghuser=null;
			 chiraghuser = userRepository.findAdminUserByUserNameNPasswordNRole(userLoginDTO.getUserName(),
					chiragUtill.getencodedUserPassword(userLoginDTO.getUserPassword()),u1.getRole());
		}

		if (u1 == null) {
			userLoginDTO.setMsg("Invalid User Name!");
		} else if (chiraghuser == null) {
			userLoginDTO.setMsg("Invalid Password!");
		}
		if (u1 != null && chiraghuser != null) {
			userLoginDTO.setMsg("Login Successfully");
			userLoginDTO.setRole(u1.getRole());
			return userLoginDTO;
		} else {
			return userLoginDTO;
		}

	}

	public Chiraghuser resetPasswordRequest(UserForgetPasswordDTO userForgetPasswordDTO) {
		Chiraghuser chiraghuser = userRepository.findByEmail(userForgetPasswordDTO.getUserEmail());
		if (chiraghuser == null) {
			return null;
		} else {
			String resetToken = chiragUtill.createResetPasswordToken(chiraghuser, true);
			mailService.sendResetPassword(chiraghuser.getUserEmail(), resetToken);
			return chiraghuser;
		}

	}

	public Chiraghuser onConfirm(UserNewPasswordDTO userNewPasswordDTO) {
		if (userNewPasswordDTO.getUserPassword().equals(userNewPasswordDTO.getConfirmPassword())) {
			Chiraghuser chiraghuser = userRepository.findByToken(userNewPasswordDTO.getToken());
			if (chiraghuser != null) {
				chiraghuser.setUserPassword(chiragUtill.getencodedUserPassword(userNewPasswordDTO.getUserPassword()));
				chiraghuser.setToken("1");
				userRepository.save(chiraghuser);
				return chiraghuser;
			}
		}
		return null;
	}

	public Chiraghuser resetPassword(UserNewPasswordDTO userNewPasswordDTO) {
		if (userNewPasswordDTO.getUserPassword().equals(userNewPasswordDTO.getConfirmPassword())) {
			Chiraghuser chiraghuser = userRepository.findByToken(userNewPasswordDTO.getToken());
			if (chiraghuser != null) {
				chiraghuser.setUserPassword(chiragUtill.getencodedUserPassword(userNewPasswordDTO.getUserPassword()));
				chiraghuser.setToken("1");
				userRepository.save(chiraghuser);
				return chiraghuser;
			}
		}
		return null;
	}

	public String changePassword(String userName,ChangePasswordDTO changepasswordDTO) {
    String msg="";
		if (changepasswordDTO.getUserPassword().equals(changepasswordDTO.getConfirmPassword())) {
			Chiraghuser chiraghuser = userRepository.findByUserName(userName);
			if (chiraghuser != null) {
				String oldPassword=chiraghuser.getUserPassword();
				String newPassword=chiragUtill.getencodedUserPassword(changepasswordDTO.getUserPassword());
				chiraghuser.setOldPasssword(oldPassword);
				DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
				Date date = new Date();
				System.out.println(dateFormat.format(date));
				chiraghuser.setPasswordChangeDate(dateFormat.format(date));
				if(oldPassword.equals(newPassword))
				{
					
					msg="Use different password from the previous!";
				  
				}
				else {
					 chiraghuser.setUserPassword(newPassword);
					  userRepository.save(chiraghuser);
					  msg="Your Password Changed Successfully";
				}
				
			}
			else {
				msg="User not found!";
			}
		}
		else {
			msg="Password not match!";
		}
		return msg;
	}
	
	public Chiraghuser confirmEmail(String userName) {
		Chiraghuser chiraghuser = userRepository.findByUserName(userName);
		if (chiraghuser == null) {
			return null;
		} else {
			String resetToken = chiragUtill.createResetPasswordToken(chiraghuser, true);
			mailService.sendNewRegistration(chiraghuser.getUserEmail(), resetToken);
			return chiraghuser;
		}

	}

	public Chiraghuser confirmEmailByToken(String token) {
		Chiraghuser chiraghuser = userRepository.findByToken(token);
		if (chiraghuser != null) {
			chiraghuser.setToken("1");
			userRepository.save(chiraghuser);
			return chiraghuser;
		}
		return null;
	}
	
	
	
	public Chiraghuser updatePersonallInfo(String userName,PersonalInfoDTO personallinfoDTO,
			HttpServletRequest httpServletRequest) {
		try {
			 
			Chiraghuser chiraghuser = userRepository.findByUserName(userName);
		    chiraghuser.setFirstName(personallinfoDTO.getFirstName());
			chiraghuser.setMiddleName(personallinfoDTO.getMiddleName());
			chiraghuser.setLastName(personallinfoDTO.getLastName());
			chiraghuser.setNationality(personallinfoDTO.getNationality());
			chiraghuser.setIdCardNumber(personallinfoDTO.getIdCardNumber());
			chiraghuser.setIdCardExpiryDate(personallinfoDTO.getIdCardExpiryDate());
			chiraghuser.setPassportNumber(personallinfoDTO.getPassportNumber());
			chiraghuser.setPassportExpiryDate(personallinfoDTO.getPassportExpiryDate());
			chiraghuser.setPhoneNumber(personallinfoDTO.getPhoneNumber());
			chiraghuser.setMobileNo(personallinfoDTO.getMobileNo());
			chiraghuser.setUserEmail(personallinfoDTO.getUserEmail());
			chiraghuser.setFax(personallinfoDTO.getFax());
			chiraghuser.setCountry(personallinfoDTO.getCountry());
			chiraghuser.setUserCity(personallinfoDTO.getUserCity());
			chiraghuser.setStreetAddress(personallinfoDTO.getStreetAddress());
			chiraghuser.setMobileOtpCode(personallinfoDTO.getMobileOtpCode());
			chiraghuser.setOtpCodeExpiration(personallinfoDTO.getOtpCodeExpiration());
			chiraghuser.setScannedIdCopyUpload(personallinfoDTO.getScannedIdCopyUpload());
			chiraghuser.setScannedPassportCopyUpload(personallinfoDTO.getScannedPassportCopyUpload());
			chiraghuser.setClassifyYourself(personallinfoDTO.getClassifyYourself());
			return userRepository.save(chiraghuser);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}


}// end of userService
