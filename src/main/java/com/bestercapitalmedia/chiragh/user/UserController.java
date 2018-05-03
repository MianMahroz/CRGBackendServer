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
import com.bestercapitalmedia.chiragh.utill.LogUtill;
import com.bestercapitalmedia.chiragh.utill.ValidatedInput;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@CrossOrigin
@RequestMapping("/api/user")
public class UserController {
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private ChiragUtill chiraghUtil;
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
		if (userRegisterationDTO == null)
			return null;

		try {
			logUtill.inputLog(httpServletRequest, userRepository.findByUserName(userRegisterationDTO.getUserName()),
					"/api/user/registerUser", mapper.writeValueAsString(data),
					mapper.writeValueAsString(userRegisterationDTO));
		} catch (Exception e) {
			e.printStackTrace();
		}

		return userRegisterationDTO;
	}

	@RequestMapping(value = "/get/{userId}", method = RequestMethod.GET)
	public @ResponseBody UserRegisterationDTO get(@PathVariable(value = "userId") int userId,
			HttpServletRequest httpServletRequest) {
		if (chiraghUtil.isValidSession(httpServletRequest) == false)
			return null;

		ObjectMapper mapper = new ObjectMapper();
		UserRegisterationDTO userRegisterationDTO = chiraghUserService.getUserByUserId(userId);
		if (userRegisterationDTO == null)
			return null;
		try {
			logUtill.inputLog(httpServletRequest, userRepository.findByUserId(userId), "/api/user/get/{userName}",
					mapper.writeValueAsString(userId), mapper.writeValueAsString(userRegisterationDTO));
		} catch (Exception e) {
			e.printStackTrace();
		}

		return userRegisterationDTO;
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public @ResponseBody UserLoginDTO login(@Valid @RequestBody UserLoginDTO userLoginDTO,
			HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {
		ObjectMapper mapper = new ObjectMapper();
		UserLoginDTO loginDTO = chiraghUserService.login(userLoginDTO);
		HttpSession httpSession = httpServletRequest.getSession(true);// true means new Session & false means old
		
		loginDTO.setUserPassword("");							
		// session
		httpSession.setAttribute("user", userRepository.findByUserName(loginDTO.getUserName()));
		Cookie cookie = new Cookie("user", loginDTO.toString());
		httpServletResponse.addCookie(cookie);

		try {
			logUtill.inputLog(httpServletRequest, userRepository.findByUserName(loginDTO.getUserName()),
					"/api/user/login", mapper.writeValueAsString(userLoginDTO),
					mapper.writeValueAsString(userLoginDTO));
		} catch (Exception e) {
			e.printStackTrace();
		}

		return userLoginDTO;
	}// end of method

	@RequestMapping(value = "/resetPasswordRequest", method = RequestMethod.POST)
	public @ResponseBody String resetPasswordRequest(@Valid @RequestBody UserForgetPasswordDTO userForgetPasswordDTO,
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
			logUtill.inputLog(httpServletRequest, chiraghuser, "/api/user/resetPasswordRequest",
					mapper.writeValueAsString(userForgetPasswordDTO), mapper.writeValueAsString(msg));
		} catch (Exception e) {
			e.printStackTrace();
		}

		return msg;
	}

	@RequestMapping(value = "/resetPassword", method = RequestMethod.POST)
	public String resetPasswordChangePost(@Valid @RequestBody UserNewPasswordDTO userNewPasswordDTO,
			HttpServletRequest httpServletRequest) {
		ObjectMapper mapper = new ObjectMapper();
		String msg = "";
		Chiraghuser chiraghuser = chiraghUserService.resetPassword(userNewPasswordDTO);
		if (chiraghuser == null)
			return null;

		msg = "success";
		try {
			logUtill.inputLog(httpServletRequest, chiraghuser, "/api/user/resetPassword",
					mapper.writeValueAsString(userNewPasswordDTO), mapper.writeValueAsString(msg));
		} catch (Exception e) {
			e.printStackTrace();
		}

		return msg;
	}

}// end of class
