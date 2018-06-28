package com.bestercapitalmedia.chiragh.user;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
import com.bestercapitalmedia.chiragh.utill.ChiragUtill;
import com.bestercapitalmedia.chiragh.utill.ValidatedInput;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.monitorjbl.json.JsonView;
import com.monitorjbl.json.JsonViewModule;
import com.monitorjbl.json.Match;

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

	public UserLoginDTO login(UserLoginDTO userLoginDTO) {
		ModelMapper mapper = new ModelMapper();
		Chiraghuser u1 = userRepository.findByUserName(userLoginDTO.getUserName());
		System.out.println("User" + u1);
		Chiraghuser chiraghuser = userRepository.findByUserNameNPassword(userLoginDTO.getUserName(),
				chiragUtill.getencodedUserPassword(userLoginDTO.getUserPassword()));

		if (u1 == null) {
			userLoginDTO.setMsg("Invalid User Name!");
		} else if (chiraghuser == null) {
			userLoginDTO.setMsg("Invalid Password!");
		}
		if (u1 != null && chiraghuser != null) {
			userLoginDTO.setMsg("Login Successfully");
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
			msg="Password not match!!";
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

}// end of userService
