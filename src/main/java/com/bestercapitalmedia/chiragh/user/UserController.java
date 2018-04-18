package com.bestercapitalmedia.chiragh.user;

import java.util.Base64;
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
import org.springframework.web.bind.annotation.RestController;

import com.bestercapitalmedia.chirag.mail.MailService;
import com.bestercapitalmedia.chirag.systemactivitylogs.SystemActivityLog;
import com.bestercapitalmedia.chirag.systemactivitylogs.SystemActivityLogController;
import com.bestercapitalmedia.chirag.utill.ChiragUtill;
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
		Iterable<ChiraghUser> userList = userRepository.findAll();
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

		ChiraghUser user = new ChiraghUser();
		ObjectMapper objectMapper = new ObjectMapper();
		String rtnObject = "";

		String msg = "";
		try {
			JSONObject jsonObj = new JSONObject(data);

			if (jsonObj.has("userName"))
				user.setUserName(jsonObj.getString("userName"));
			if (jsonObj.has("userEmail"))
				user.setUserEmail(jsonObj.getString("userEmail"));
			if (jsonObj.has("userPassword")) {
				String password = DigestUtils.md5DigestAsHex(jsonObj.getString("userPassword").getBytes());
				user.setUserPassword(password);
			}
			if (jsonObj.has("firstName"))
				user.setFirstName(jsonObj.getString("firstName"));
			if (jsonObj.has("middleName"))
				user.setMiddleName(jsonObj.getString("middleName"));
			if (jsonObj.has("lastName"))
				user.setLastName(jsonObj.getString("lastName"));
			if (jsonObj.has("mobileNo"))
				user.setMobileNo(jsonObj.getString("mobileNo"));
			if (jsonObj.has("streetAddress"))
				user.setStreetAddress(jsonObj.getString("streetAddress"));
			if (jsonObj.has("buildingAddress"))
				user.setBuildingAddress(jsonObj.getString("buildingAddress"));
			if (jsonObj.has("emailVerificationCode"))
				user.setEmailVerificationCode(jsonObj.getString("emailVerificationCode"));
			if (jsonObj.has("mobileOtpCode"))
				user.setMobileOtpCode(jsonObj.getString("mobileOtpCode"));
			rtnObject = objectMapper.writeValueAsString(user);
			userRepository.save(user);
			msg = "success";
		} catch (Exception ee) {
			ee.printStackTrace();
			msg = "Error";
		} // end of catch
		log.info("Output: " + rtnObject);
		log.info("--------------------------------------------------------");

		return rtnObject;
	}// end of create

	@RequestMapping(value = "/put/{id}", method = RequestMethod.PUT)
	public ChiraghUser update(@PathVariable(value = "id") long id, @RequestBody String data) {
		log.info("Put: /api/Users/put");
		ChiraghUser user = new ChiraghUser();
		ObjectMapper objectMapper = new ObjectMapper();
		String rtnObject = "";
		try {
			JSONObject jsonObj = new JSONObject(data);

			if (jsonObj.has("userName"))
				user.setUserName(jsonObj.getString("userName"));
			if (jsonObj.has("userEmail"))
				user.setUserEmail(jsonObj.getString("userEmail"));
			if (jsonObj.has("userPassword"))
				user.setUserPassword(jsonObj.getString("userPassword"));
			if (jsonObj.has("firstName"))
				user.setFirstName(jsonObj.getString("firstName"));
			if (jsonObj.has("middleName"))
				user.setMiddleName(jsonObj.getString("middleName"));
			if (jsonObj.has("lastName"))
				user.setLastName(jsonObj.getString("lastName"));
			if (jsonObj.has("mobileNo"))
				user.setMobileNo(jsonObj.getString("mobileNo"));
			if (jsonObj.has("streetAddress"))
				user.setStreetAddress(jsonObj.getString("streetAddress"));
			if (jsonObj.has("buildingAddress"))
				user.setBuildingAddress(jsonObj.getString("buildingAddress"));
			if (jsonObj.has("emailVerificationCode"))
				user.setEmailVerificationCode(jsonObj.getString("emailVerificationCode"));
			if (jsonObj.has("mobileOtpCode"))
				user.setMobileOtpCode(jsonObj.getString("mobileOtpCode"));
			rtnObject = objectMapper.writeValueAsString(user);
		} catch (Exception ee) {
			ee.printStackTrace();
		}
		log.info("Output: " + rtnObject);
		log.info("--------------------------------------------------------");
		return userRepository.save(user);
	}

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable(value = "id") int id) {
		userRepository.deleteById(id);
	}

	@RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
	public Optional<ChiraghUser> get(@PathVariable(value = "id") int id) {
		return userRepository.findById(id);
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ChiraghUser login(@RequestBody String data) {
		log.info("Post: /api/Users/login");
		log.info("Input: " + data);

		ObjectMapper objectMapper = new ObjectMapper();
		ChiraghUser chiraghUser = null;
		String inputPassword = "", userName = "", msg = "", rtnObject = "";

		try {
			JSONObject jsonObj = new JSONObject(data);
			if (jsonObj.has("userPassword"))
				inputPassword = DigestUtils.md5DigestAsHex(jsonObj.getString("userPassword").getBytes());
			if (jsonObj.has("userName"))
				userName = jsonObj.getString("userName");
			chiraghUser = userRepository.findByUserNameNPassword(userName, inputPassword);
			// checking userName and Password
			if (chiraghUser != null) {
				if (inputPassword.equals(chiraghUser.getUserPassword())) {
					msg = "found";
					rtnObject = objectMapper.writeValueAsString(chiraghUser);
					log.info("Output: " + rtnObject);
					log.info("--------------------------------------------------------");
				} // end of inner if
			} // end of outer if
			else {
				msg = "User Not found";
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return chiraghUser;
	}// end of method

	@RequestMapping(value = "/reset-password", method = RequestMethod.POST)
	public String resetPasswordEmailPost(@RequestBody String data) {

		try {
			JSONObject jsonObj = new JSONObject(data);
			ChiraghUser u = userRepository.findByEmail(jsonObj.getString("userEmail"));
			if (u == null) {
				return "User is null";
			} else {
				String resetToken = chiraghUtil.createResetPasswordToken(u, true);
				
				mailService.sendResetPassword(u.getUserEmail(), resetToken);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "Email Sent";
	}
	
	 @RequestMapping(value = "/reset-password-change", method = RequestMethod.POST)
	    public String resetPasswordChangePost(@RequestBody String data) {
		   return data;
	    }

}// end of class
