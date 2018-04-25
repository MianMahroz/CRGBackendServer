package com.bestercapitalmedia.chiragh.user;

import java.util.Base64;
import java.util.List;
import java.util.Optional;

import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.providers.encoding.Md5PasswordEncoder;
import org.springframework.util.Assert;
import org.springframework.util.DigestUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.bestercapitalmedia.chiragh.mail.MailService;

import com.bestercapitalmedia.chiragh.systemactivitylogs.SystemActivityLogController;
import com.bestercapitalmedia.chiragh.utill.ChiragUtill;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@CrossOrigin
@RequestMapping("/api/user")
public class UserController {
	private static final Logger log = LoggerFactory.getLogger(UserController.class);
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private ChiragUtill chiraghUtil;
	@Autowired
	private MailService mailService;

	@RequestMapping(value = "/getAll", method = RequestMethod.GET)
	public String list() {
		log.info("GET: /api/Users/getAll");
		ObjectMapper objectMapper = new ObjectMapper();
		List<Chiraghuser> userList = userRepository.findAllUser();
		String rtnObject = "";
		try {
			rtnObject = objectMapper.writeValueAsString(userList);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}

		log.info("Output: " + rtnObject);
		log.info("--------------------------------------------------------");
		return rtnObject;
	}// end of list method

	@RequestMapping(value = "/hello")
	public String getMsg() {
		return DigestUtils.md5DigestAsHex("123".getBytes());
	}

	@RequestMapping(value = "/post", method = RequestMethod.POST)
	public String create(@RequestBody String data) {
		log.info("Post: /api/Users/post");
		log.info("Input: " + data);

		Chiraghuser user = new Chiraghuser();
		ObjectMapper objectMapper = new ObjectMapper();
		String rtnObject = "";

		String msg = "";

		try {
			JSONObject jsonObj = new JSONObject(data);
			if (jsonObj.has("userName") && jsonObj.has("userEmail") && jsonObj.has("userPassword")
					&& jsonObj.has("firstName") && jsonObj.has("middleName") && jsonObj.has("lastName")
					&& jsonObj.has("mobileNo") && jsonObj.has("streetAddress") && jsonObj.has("buildingAddress")
					&& jsonObj.has("emailVerificationCode") && jsonObj.has("mobileOtpCode")) {

				if (jsonObj.has("userName")) {
					String userName = jsonObj.getString("userName");
					if (userName.equals("") || userName == null) {
						return "User Name is Empty!";
					} else {
						user.setUserName(jsonObj.getString("userName"));
						Chiraghuser v_user = userRepository.findByUserName(jsonObj.getString("userName"));
						if (v_user != null)
							return "UserName Already Exist!";
					}

				}
				if (jsonObj.has("userEmail")) {
					String email = jsonObj.getString("userEmail");
					if (email.equals("") || email == null) {
						return "Email Address is Empty!";
					} else {
						String status = chiraghUtil.validateEmailAddress(email);
						if (status.equals("valid")) {
							user.setUserEmail(jsonObj.getString("userEmail"));
							Chiraghuser v_user = userRepository.findByEmail(jsonObj.getString("userEmail"));
							if (v_user != null)
								return "Email Already Exist";
						} else {
							return status;
						}

					}

				}
				if (jsonObj.has("userPassword")) {
					String password = jsonObj.getString("userPassword");
					if (password.equals("") || password == null)
						return "PLease Enter Password!";
					String status = "";
					int point = chiraghUtil.passwordValidation(user.getUserName(), password);
					status = "" + point;
					switch (point) {
					case 0:
						status = "Invalid Password";
						break;
					case 2:
						status = "weak";
						break;
					case 4:
						status = "medium";
						break;
					case 6:
						status = "good";
						break;
					case 8:
						status = "strong";
						break;
					default:
						break;
					}

					if (status.equals("good") || status.equals("strong")) {
						String encrptedPassword = chiraghUtil.getencodedUserPassword(password);
						user.setUserPassword(encrptedPassword);
					} else {
						return status;
					}
				}
				if (jsonObj.has("firstName")) {
					String firstName = jsonObj.getString("firstName");
					if (firstName.equals("") || firstName == null) {
						return "Please Enter First Name!";
					} else {
						String status = chiraghUtil.textInputValidation(jsonObj.getString("firstName"));
						if (status.equals("valid"))
							user.setFirstName(jsonObj.getString("firstName"));
						else
							return status;

					}
				}
				if (jsonObj.has("middleName")) {
					String middleName = jsonObj.getString("middleName");
					if (middleName.equals("") || middleName == null) {
						user.setMiddleName("");
					} else {

						String status = chiraghUtil.textInputValidation(jsonObj.getString("middleName"));
						if (status.equals("valid"))
							user.setMiddleName(jsonObj.getString("middleName"));
						else
							return status;
					}
				}
				if (jsonObj.has("lastName")) {
					String lastName = jsonObj.getString("lastName");
					if (lastName.equals("") || lastName == null) {
						return "Please Enter Last Name!";
					} else {

						String status = chiraghUtil.textInputValidation(jsonObj.getString("lastName"));
						if (status.equals("valid"))
							user.setLastName(jsonObj.getString("lastName"));
						else
							return status;
					}
				}
				if (jsonObj.has("mobileNo")) {
					String mobileNo = jsonObj.getString("mobileNo");
					if (mobileNo.equals("") || mobileNo == null)
						return "Please Enter Mobile No !";
					else
						user.setMobileNo(jsonObj.getString("mobileNo"));
				}
				if (jsonObj.has("streetAddress")) {
					String streetAddress = jsonObj.getString("streetAddress");
					if (streetAddress.equals("") || streetAddress == null)
						return "Please Enter Street Address!";
					else
						user.setStreetAddress(jsonObj.getString("streetAddress"));
				}
				if (jsonObj.has("buildingAddress")) {
					String buildingAddress = jsonObj.getString("buildingAddress");
					if (buildingAddress.equals("") || buildingAddress == null)
						return "Please Enter Building Address!";
					else
						user.setBuildingAddress(jsonObj.getString("buildingAddress"));
				}
				if (jsonObj.has("emailVerificationCode")) {
					String emailVerificationCode = jsonObj.getString("emailVerificationCode");
					if (emailVerificationCode.equals("") || emailVerificationCode == null)
						return "Please Enter Email Verification Code!";
					else
						user.setEmailVerificationCode(jsonObj.getString("emailVerificationCode"));
				}
				if (jsonObj.has("mobileOtpCode")) {
					String mobileOtpCode = jsonObj.getString("mobileOtpCode");
					if (mobileOtpCode.equals("") || mobileOtpCode == null)
						return "Please Enter Mobile Otp Code!";
					else
						user.setMobileOtpCode(jsonObj.getString("mobileOtpCode"));
				}

				 userRepository.save(user);
				rtnObject = objectMapper.writeValueAsString(userRepository.findByUserName(user.getUserName()));
				msg = "success";
			} // end of outer if
			else {
				msg = "Sended Object is Invalid";
			}
		} catch (Exception ee) {
			msg = "Error" + ee.getMessage();
		} // end of catch

		if (msg.equals("success")) {
			log.info("Output: " + rtnObject);
			log.info("--------------------------------------------------------");
			return rtnObject;
		} else {
			log.info("Output: " + msg);
			log.info("--------------------------------------------------------");
			return msg;
		}

	}// end of create

	@RequestMapping(value = "/put/{id}", method = RequestMethod.PUT)
	public String update(@RequestBody String data) {
		log.info("Put: /api/Users/put");
		log.info("Input: " + data);

		Chiraghuser user = new Chiraghuser();
		ObjectMapper objectMapper = new ObjectMapper();
		String rtnObject = "";
		String msg = "";

		try {
			JSONObject jsonObj = new JSONObject(data);
			if (jsonObj.has("userId") && jsonObj.has("userName") && jsonObj.has("userEmail")
					&& jsonObj.has("userPassword") && jsonObj.has("firstName") && jsonObj.has("middleName")
					&& jsonObj.has("lastName") && jsonObj.has("mobileNo") && jsonObj.has("streetAddress")
					&& jsonObj.has("buildingAddress") && jsonObj.has("emailVerificationCode")
					&& jsonObj.has("mobileOtpCode")) {

				if (jsonObj.has("userId")) {
					try {
						user.setUserId(Integer.parseInt(jsonObj.getString("userId")));
					} catch (Exception ee) {
						return "Invalid User Id!";
					}
				}

				if (jsonObj.has("userName")) {
					user.setUserName(jsonObj.getString("userName"));
				}
				if (jsonObj.has("userEmail")) {
					user.setUserEmail(jsonObj.getString("userEmail"));
				}
				if (jsonObj.has("userPassword")) {
					String password = jsonObj.getString("userPassword");
					if (password.equals("") || password == null)
						return "PLease Enter Password!";
					String encrptedPassword = chiraghUtil.getencodedUserPassword(password);
					user.setUserPassword(encrptedPassword);
				}
				if (jsonObj.has("firstName")) {
					String firstName = jsonObj.getString("firstName");
					if (firstName.equals("") || firstName == null)
						return "Please Enter First Name!";
					else
						user.setFirstName(jsonObj.getString("firstName"));
				}
				if (jsonObj.has("middleName")) {
					String middleName = jsonObj.getString("middleName");
					if (middleName.equals("") || middleName == null)
						return "Please Enter Middle Name !";
					else
						user.setMiddleName(jsonObj.getString("middleName"));
				}
				if (jsonObj.has("lastName")) {
					String lastName = jsonObj.getString("lastName");
					if (lastName.equals("") || lastName == null)
						return "Please Enter Last Name!";
					else
						user.setLastName(jsonObj.getString("lastName"));
				}
				if (jsonObj.has("mobileNo")) {
					String mobileNo = jsonObj.getString("mobileNo");
					if (mobileNo.equals("") || mobileNo == null)
						return "Please Enter Mobile No !";
					else
						user.setMobileNo(jsonObj.getString("mobileNo"));
				}
				if (jsonObj.has("streetAddress")) {
					String streetAddress = jsonObj.getString("streetAddress");
					if (streetAddress.equals("") || streetAddress == null)
						return "Please Enter Street Address!";
					else
						user.setStreetAddress(jsonObj.getString("streetAddress"));
				}
				if (jsonObj.has("buildingAddress")) {
					String buildingAddress = jsonObj.getString("buildingAddress");
					if (buildingAddress.equals("") || buildingAddress == null)
						return "Please Enter Building Address!";
					else
						user.setBuildingAddress(jsonObj.getString("buildingAddress"));
				}
				if (jsonObj.has("emailVerificationCode")) {
					String emailVerificationCode = jsonObj.getString("emailVerificationCode");
					if (emailVerificationCode.equals("") || emailVerificationCode == null)
						return "Please Enter Email Verification Code!";
					else
						user.setEmailVerificationCode(jsonObj.getString("emailVerificationCode"));
				}
				if (jsonObj.has("mobileOtpCode")) {
					String mobileOtpCode = jsonObj.getString("mobileOtpCode");
					if (mobileOtpCode.equals("") || mobileOtpCode == null)
						return "Please Enter Mobile Otp Code!";
					else
						user.setMobileOtpCode(jsonObj.getString("mobileOtpCode"));
				}

				rtnObject = objectMapper.writeValueAsString(user);
				userRepository.save(user);
				msg = "success";
			} // end of outer if
			else {
				msg = "Sended Object is Invalid";
			}
		} catch (Exception ee) {
			msg = "Error" + ee.getMessage();
		} // end of catch

		if (msg.equals("success")) {
			log.info("Output: " + rtnObject);
			log.info("--------------------------------------------------------");
			return rtnObject;
		} else {
			log.info("Output: " + msg);
			log.info("--------------------------------------------------------");
			return msg;
		}

	}

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable(value = "id") int id) {
		userRepository.deleteById(id);
	}

	@RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
	public Optional<Chiraghuser> get(@PathVariable(value = "id") int id) {
		return userRepository.findById(id);
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(@RequestBody String data) {
		log.info("Post: /api/Users/login");
		log.info("Input: " + data);

		ObjectMapper objectMapper = new ObjectMapper();
		Chiraghuser Chiraghuser = null;
		String inputPassword = "", userName = "", msg = "", rtnObject = "";

		try {
			JSONObject jsonObj = new JSONObject(data);
			if (jsonObj.has("userPassword"))
				inputPassword = chiraghUtil.getencodedUserPassword(jsonObj.getString("userPassword"));
			if (jsonObj.has("userName"))
				userName = jsonObj.getString("userName");
			Chiraghuser = userRepository.findByUserNameNPassword(userName, inputPassword);
			// checking userName and Password
			if (Chiraghuser != null) {
				if (inputPassword.equals(Chiraghuser.getUserPassword())) {
					msg = "success";
					rtnObject = objectMapper.writeValueAsString(Chiraghuser);
					log.info("Output: " + rtnObject);
					log.info("--------------------------------------------------------");
				} // end of inner if
			} // end of outer if
			else {
				msg = "User or Password is Invalid";
			}

		} catch (Exception e) {
			return e.getMessage();
		}
		if (msg.equals("success"))
			return rtnObject;
		else
			return msg;

	}// end of method

	@RequestMapping(value = "/reset-password", method = RequestMethod.POST)
	public String resetPasswordEmailPost(@RequestBody String data) {
		log.info("Post: /api/Users/reset-password");
		log.info("Input: " + data);
		String msg = "";
		try {
			JSONObject jsonObj = new JSONObject(data);
			Chiraghuser u = userRepository.findByEmail(jsonObj.getString("userEmail"));
			if (u == null) {
				msg = "User not found";
			} else {
				String resetToken = chiraghUtil.createResetPasswordToken(u, true);
				mailService.sendResetPassword(u.getUserEmail(), resetToken);
				msg = "Email Sent";
			}
		} catch (Exception e) {
			e.printStackTrace();
			msg = "Something Went Wrong!!Check your Internet Connection...";
		}
		log.info("Output: " + msg);
		log.info("--------------------------------------------------------");
		return msg;
	}

	@RequestMapping(value = "/reset-password-change", method = RequestMethod.POST)
	public String resetPasswordChangePost(@RequestBody String data) {

		ObjectMapper objectMapper = new ObjectMapper();
		String rtnObject = "";
		try {
			JSONObject jsonObject = new JSONObject(data);
			if (jsonObject.has("token")) {
				Chiraghuser user = userRepository.findByToken(jsonObject.getString("token"));
				if (user != null) {
					user.setUserPassword(chiraghUtil.getencodedUserPassword(jsonObject.getString("userPassword")));
					user.setToken("1");
					userRepository.save(user);
					rtnObject = objectMapper.writeValueAsString(user);
				} // end of inner if
				else {
					return "User Not Found!";
				} // end of inner else
			} // end of outer if
			else {
				return "Invalid Sended Object";
			} // end of outer else
		} catch (Exception ee) {
			return ee.getMessage();
		}
		return rtnObject;
	}

}// end of class
