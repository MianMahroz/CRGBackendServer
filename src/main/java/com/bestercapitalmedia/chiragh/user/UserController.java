package com.bestercapitalmedia.chiragh.user;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.json.JSONObject;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

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

import com.bestercapitalmedia.chiragh.utill.ChiragUtill;
import com.bestercapitalmedia.chiragh.utill.LogUtill;
import com.bestercapitalmedia.chiragh.utill.ValidatedInput;
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
	@Autowired
	private LogUtill logUtill;
	@Autowired
	private ChiraghUserService chiraghUserService;

	// @RequestMapping(value = "/getAll", method = RequestMethod.GET)
	// public @ResponseBody List<UserDTO> list() {
	// return chiraghUserService.getList();
	// }// end of list method

	@RequestMapping(value = "/registerUser", method = RequestMethod.POST)
	public @ResponseBody UserRegisterationDTO create(@Valid @RequestBody UserRegisterationDTO data,
			HttpServletRequest httpServletRequest) {
		ObjectMapper mapper = new ObjectMapper();
		UserRegisterationDTO userRegisterationDTO = chiraghUserService.save(data);
		if (userRegisterationDTO == null) {
			return null;
		}
		try {
			logUtill.inputLog(httpServletRequest.getRemoteAddr(), userRegisterationDTO.getUserName(),
					"/api/user/registerUser", mapper.writeValueAsString(data),
					mapper.writeValueAsString(userRegisterationDTO));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return userRegisterationDTO;
	}

	@RequestMapping(value = "/get/{userName}", method = RequestMethod.GET)
	public @ResponseBody UserRegisterationDTO get(@PathVariable(value = "userName") String userName,
			HttpServletRequest httpServletRequest) {
		ObjectMapper mapper = new ObjectMapper();
		UserRegisterationDTO userRegisterationDTO = chiraghUserService.getUserByName(userName);
		if (userRegisterationDTO == null) {
			return null;
		}
		try {
			logUtill.inputLog(httpServletRequest.getRemoteAddr(), userName, "/api/user/get/{userName}",
					mapper.writeValueAsString(userName), mapper.writeValueAsString(userRegisterationDTO));
		} catch (Exception e) {
			e.printStackTrace();
		}

		return userRegisterationDTO;
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public @ResponseBody UserLoginDTO login(@Valid @RequestBody UserLoginDTO userLoginDTO,
			HttpServletRequest httpServletRequest) {
		ObjectMapper mapper = new ObjectMapper();
		UserLoginDTO loginDTO = chiraghUserService.login(userLoginDTO);
		try {
			userLoginDTO.setUserPassword("");
			logUtill.inputLog(httpServletRequest.getRemoteAddr(), loginDTO.getUserName(), "/api/user/login",
					mapper.writeValueAsString(userLoginDTO), mapper.writeValueAsString(loginDTO));
		} catch (Exception e) {
			e.printStackTrace();
		}

		return userLoginDTO;
	}// end of method

	@RequestMapping(value = "/resetPasswordRequest", method = RequestMethod.POST)
	public @ResponseBody String resetPasswordRequest(@RequestBody UserForgetPasswordDTO userForgetPasswordDTO,
			HttpServletRequest httpServletRequest) {
		ObjectMapper mapper = new ObjectMapper();
		String msg = "";
		Chiraghuser chiraghuser = chiraghUserService.resetPasswordRequest(userForgetPasswordDTO);
		if (chiraghuser == null) {
			msg = "Email Seding Fail..";
			return null;
		}
		msg = "Sent";
		try {
			logUtill.inputLog(httpServletRequest.getRemoteAddr(), chiraghuser.getUserName(), "/api/user/reset-password",
					mapper.writeValueAsString(userForgetPasswordDTO), msg);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return msg;
	}

	@RequestMapping(value = "/resetPassword", method = RequestMethod.POST)
	public String resetPasswordChangePost(@RequestBody UserNewPasswordDTO userNewPasswordDTO,
			HttpServletRequest httpServletRequest) {
		ObjectMapper mapper = new ObjectMapper();
		String msg = "";
		Chiraghuser chiraghuser = chiraghUserService.resetPassword(userNewPasswordDTO);
		if (chiraghuser == null)
			return null;

		msg = "success";
		try {
			logUtill.inputLog(httpServletRequest.getRemoteAddr(), chiraghuser.getUserName(), "/api/user/resetPassword",
					mapper.writeValueAsString(userNewPasswordDTO), msg);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return msg;
	}

}// end of class
