package com.bestercapitalmedia.chiragh.user;

import java.security.Principal;
import java.util.List;
import java.util.Optional;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.json.JSONObject;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.bestercapitalmedia.chiragh.mail.MailService;
import com.bestercapitalmedia.chiragh.oauth.dao.UserDao;
import com.bestercapitalmedia.chiragh.oauth.model.User;
import com.bestercapitalmedia.chiragh.utill.ChiragUtill;
import com.bestercapitalmedia.chiragh.utill.ChiraghMessage;
import com.bestercapitalmedia.chiragh.utill.LogUtill;
import com.bestercapitalmedia.chiragh.utill.ValidatedInput;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@CrossOrigin
@RequestMapping("/api/user")
@Scope("session")
@SuppressWarnings({ "unchecked", "rawtypes" })
public class UserController {
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private ChiragUtill chiraghUtil;
	@Autowired
	private LogUtill logUtill;
	@Autowired
	private ChiraghUserService chiraghUserService;

	@RequestMapping(value = "/getAll", method = RequestMethod.GET)
	public @ResponseBody String list(HttpServletRequest httpServletRequest) throws JsonProcessingException {
		ObjectMapper mapper = new ObjectMapper();
		Chiraghuser chiraghuser = (Chiraghuser) httpServletRequest.getSession().getAttribute("user");
		return mapper.writeValueAsString(chiraghuser);

	}// end of list method

	@RequestMapping(value = "/registerUser", method = RequestMethod.POST)
	public @ResponseBody ResponseEntity create(@Valid @RequestBody UserRegisterationDTO data,
			HttpServletRequest httpServletRequest) {
		try {
			ObjectMapper mapper = new ObjectMapper();
			UserRegisterationDTO userRegisterationDTO = chiraghUserService.save(data);
			if (userRegisterationDTO == null) {
				return new ResponseEntity(chiraghUtil.getMessageObject("Registration Fail"), HttpStatus.BAD_REQUEST);
			}

			try {
				logUtill.inputLog(httpServletRequest, userRepository.findByUserName(userRegisterationDTO.getUserName()),
						"/api/user/registerUser", mapper.writeValueAsString(data),
						mapper.writeValueAsString(userRegisterationDTO));
			} catch (Exception e) {
				new ResponseEntity(chiraghUtil.getMessageObject("Log not Generated"), HttpStatus.BAD_REQUEST);
			}

			return new ResponseEntity(chiraghUtil.getMessageObject("User Created Successfully"), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity(chiraghUtil.getMessageObject("Internal Server Error!" + e.getMessage()),
					HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@RequestMapping(value = "/get/{userId}", method = RequestMethod.GET)
	public @ResponseBody ResponseEntity get(@PathVariable(value = "userId") int userId,
			HttpServletRequest httpServletRequest) {
		try {
			if (chiraghUtil.isValidSession(httpServletRequest) == false)
				return new ResponseEntity(chiraghUtil.getMessageObject("Invalid Session!"), HttpStatus.BAD_REQUEST);

			ObjectMapper mapper = new ObjectMapper();
			UserRegisterationDTO userRegisterationDTO = chiraghUserService.getUserByUserId(userId);
			if (userRegisterationDTO == null)
				return new ResponseEntity(chiraghUtil.getMessageObject("User Not Found"), HttpStatus.NOT_FOUND);

			try {
				logUtill.inputLog(httpServletRequest, chiraghUtil.getSessionUser(httpServletRequest), "/api/user/get/{userName}",
						mapper.writeValueAsString(userId), mapper.writeValueAsString(userRegisterationDTO));
			} catch (Exception e) {
				return new ResponseEntity(chiraghUtil.getMessageObject("Log Generation Fail!"), HttpStatus.BAD_REQUEST);
			}

			return new ResponseEntity(userRegisterationDTO, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity(chiraghUtil.getMessageObject("Internal Server Error!" + e.getMessage()),
					HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public @ResponseBody ResponseEntity login(@Valid @RequestBody UserLoginDTO userLoginDTO,
			HttpServletRequest httpServletRequest) {
		try {
			ObjectMapper mapper = new ObjectMapper();
			UserLoginDTO loginDTO = chiraghUserService.login(userLoginDTO);
			if (loginDTO == null)
				return new ResponseEntity(chiraghUtil.getMessageObject("User Not Found!"), HttpStatus.BAD_REQUEST);
			// session
			httpServletRequest.getSession().invalidate();
			httpServletRequest.getSession(true).setAttribute("user",
					userRepository.findByUserName(loginDTO.getUserName()));

			if (httpServletRequest.getSession(false).getAttribute("user") == null)
				return new ResponseEntity(chiraghUtil.getMessageObject("Invalid Session!"), HttpStatus.BAD_REQUEST);

			try {
				logUtill.inputLog(httpServletRequest, userRepository.findByUserName(loginDTO.getUserName()),
						"/api/user/login", mapper.writeValueAsString(userLoginDTO),
						mapper.writeValueAsString(userLoginDTO));
			} catch (Exception e) {
				return new ResponseEntity(chiraghUtil.getMessageObject("Log Generation Fail!"), HttpStatus.BAD_REQUEST);
			}

			return new ResponseEntity(chiraghUtil.getMessageObject("Login Successfully"), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity(chiraghUtil.getMessageObject("Internal Server Error!" + e.getMessage()),
					HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}// end of method

	@RequestMapping(value = "/resetPasswordRequest", method = RequestMethod.POST)
	public @ResponseBody ResponseEntity resetPasswordRequest(
			@Valid @RequestBody UserForgetPasswordDTO userForgetPasswordDTO, HttpServletRequest httpServletRequest) {
		try {
			ObjectMapper mapper = new ObjectMapper();
			Chiraghuser chiraghuser = chiraghUserService.resetPasswordRequest(userForgetPasswordDTO);
			if (chiraghuser == null)
				return new ResponseEntity(chiraghUtil.getMessageObject("Email Sending Fail!!"), HttpStatus.BAD_REQUEST);

			try {
				logUtill.inputLog(httpServletRequest, chiraghuser, "/api/user/resetPasswordRequest",
						mapper.writeValueAsString(userForgetPasswordDTO), mapper.writeValueAsString("Email Sent"));
			} catch (Exception e) {
				return new ResponseEntity(chiraghUtil.getMessageObject("Log Generation Fail!"), HttpStatus.BAD_REQUEST);
			}

			return new ResponseEntity(chiraghUtil.getMessageObject("Email Sent"), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity(chiraghUtil.getMessageObject("Internal Server Error!" + e.getMessage()),
					HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	
	@RequestMapping(value = "/resetPassword", method = RequestMethod.POST)
	public ResponseEntity resetPasswordChangePost(@Valid @RequestBody UserNewPasswordDTO userNewPasswordDTO,
			HttpServletRequest httpServletRequest) {
		try {
			ObjectMapper mapper = new ObjectMapper();
			String msg = "";
			Chiraghuser chiraghuser = chiraghUserService.resetPassword(userNewPasswordDTO);
			if (chiraghuser == null)
				return new ResponseEntity(chiraghUtil.getMessageObject("Reset Password Fail!"), HttpStatus.BAD_REQUEST);

			try {
				logUtill.inputLog(httpServletRequest, chiraghuser, "/api/user/resetPassword",
						mapper.writeValueAsString(userNewPasswordDTO), mapper.writeValueAsString(msg));
			} catch (Exception e) {
				return new ResponseEntity(chiraghUtil.getMessageObject("Log Generation Fail!"), HttpStatus.BAD_REQUEST);
			}

			return new ResponseEntity(chiraghUtil.getMessageObject("Password Change Successfully!"), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity(chiraghUtil.getMessageObject("Internal Server Error!" + e.getMessage()),
					HttpStatus.BAD_REQUEST);
		}
	}

}// end of class
