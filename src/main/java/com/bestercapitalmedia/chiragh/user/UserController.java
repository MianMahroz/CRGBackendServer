package com.bestercapitalmedia.chiragh.user;

import java.security.Principal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.aspectj.weaver.ast.Var;
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
import org.springframework.stereotype.Controller;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.SessionScope;

import com.bestercapitalmedia.chiragh.buyer.bidding.history.BuyerBiddingHistoryDTO;
import com.bestercapitalmedia.chiragh.mail.MailService;
import com.bestercapitalmedia.chiragh.oauth.dao.UserDao;
import com.bestercapitalmedia.chiragh.oauth.model.User;
import com.bestercapitalmedia.chiragh.property.ChiraghPropertyFinancialsDTO;
import com.bestercapitalmedia.chiragh.property.ChiraghPropertyRentDetailsDTO;
import com.bestercapitalmedia.chiragh.property.Chiraghproperty;
import com.bestercapitalmedia.chiragh.utill.ChiragUtill;
import com.bestercapitalmedia.chiragh.utill.ChiraghMessage;
import com.bestercapitalmedia.chiragh.utill.LogUtill;
import com.bestercapitalmedia.chiragh.utill.ValidatedInput;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

// TODO: Auto-generated Javadoc
/**
 * The Class UserController.
 */
@Controller
// @SessionScope
@CrossOrigin
@RequestMapping("/api/user")
@SuppressWarnings({ "unchecked", "rawtypes" })
public class UserController {
	
	/** The user repository. */
	@Autowired
	private UserRepository userRepository;
	
	/** The chiragh util. */
	@Autowired
	private ChiragUtill chiraghUtil;

	/** The log utill. */
	@Autowired
	private LogUtill logUtill;
	
	/** The chiragh user service. */
	@Autowired
	private ChiraghUserService chiraghUserService;

	/**
	 * Gets the user with complete properties.
	 *
	 * @param userName the user name
	 * @return the user with complete properties
	 */
	@RequestMapping(value = "/getUserWithCompleteProperties/{userName}", method = RequestMethod.GET)
	public List<ChiraghAdminDashboardDTO> getUserWithCompleteProperties(@PathVariable(value = "userName") String userName) {
		if (userName.equals("") || userName == null) {
//			return new ResponseEntity(chiraghUtil.getMessageObject("Invalid Session"), HttpStatus.OK);
		}
		List<ChiraghAdminDashboardDTO> adminDtoList = new ArrayList<ChiraghAdminDashboardDTO>();

		List<Chiraghuser> userList = chiraghUserService.getUserWithCompleteProperties();
		ModelMapper mapper = new ModelMapper();
		userList.stream().map(s -> adminDtoList.add(mapper.map(s, ChiraghAdminDashboardDTO.class)))
				.collect(Collectors.toList());

		return adminDtoList;
////		if (userList != null) {
////			return new ResponseEntity(adminDtoList, HttpStatus.OK);
//		} else {
////			return new ResponseEntity(chiraghUtil.getMessageObject("User Not Found!"), HttpStatus.OK);
//		}
	}// end of method

	/**
	 * List.
	 *
	 * @param httpServletRequest the http servlet request
	 * @return the iterable
	 * @throws JsonProcessingException the json processing exception
	 */
	@RequestMapping(value = "/getAll", method = RequestMethod.GET)
	public @ResponseBody Iterable<Chiraghuser> list(HttpServletRequest httpServletRequest)
			throws JsonProcessingException {
		return userRepository.findAll();

	}// end of list method

	/**
	 * Gets the session user.
	 *
	 * @param httpServletRequest the http servlet request
	 * @param httpServletResponse the http servlet response
	 * @return the session user
	 * @throws JsonProcessingException the json processing exception
	 */
	@RequestMapping(value = "/getSessionUser", method = RequestMethod.GET)
	public @ResponseBody String getSessionUser(HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse) throws JsonProcessingException {
		HttpSession session = httpServletRequest.getSession(false);
		System.out.println((Chiraghuser) session.getAttribute("user"));
		Cookie[] a = httpServletRequest.getCookies();
		System.out.println(a[0]);
		return "";
	}// end of list method

	/**
	 * Creates the.
	 *
	 * @param data the data
	 * @param httpServletRequest the http servlet request
	 * @return the response entity
	 */
	@RequestMapping(value = "/registerUser", method = RequestMethod.POST)
	public @ResponseBody ResponseEntity create(@Valid @RequestBody UserRegisterationDTO data,
			HttpServletRequest httpServletRequest) {
		try {
			ObjectMapper mapper = new ObjectMapper();
			UserRegisterationDTO userRegisterationDTO = chiraghUserService.save(data);
			if (userRegisterationDTO == null) {
				return new ResponseEntity(chiraghUtil.getMessageObject("Registration Fail"), HttpStatus.OK);
			}

			try {
				logUtill.inputLog(httpServletRequest, userRepository.findByUserName(userRegisterationDTO.getUserName()),
						"/api/user/registerUser", mapper.writeValueAsString(data),
						mapper.writeValueAsString(userRegisterationDTO));
			} catch (Exception e) {
				e.printStackTrace();
				new ResponseEntity(chiraghUtil.getMessageObject("Log not Generated"), HttpStatus.OK);
			}

			return new ResponseEntity(chiraghUtil.getMessageObject("User Created Successfully"), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity(chiraghUtil.getMessageObject("Internal Server Error!" + e.getMessage()),
					HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	/**
	 * Gets the password.
	 *
	 * @param password the password
	 * @return the password
	 */
	@RequestMapping(value = "/getPassword/{password}", method = RequestMethod.GET)
	public String getPassword(@PathVariable(value = "password") String password) {
		return DigestUtils.md5DigestAsHex(password.getBytes());
	}

	// @RequestMapping(value="/getUser/{userId}",method=RequestMethod.GET)
	// public @ResponseBody UserLoginDTO getSessionUser(@PathVariable(value =
	// "userId") int userId,HttpServletRequest httpServletRequest) {
	// System.out.println("Session Api");
	// ModelMapper mapper=new ModelMapper();
	// Chiraghuser chiraghuser1=chiraghUtil.getSessionUser(httpServletRequest);
	// System.out.println(chiraghuser1.getUserId());
	// return mapper.map(chiraghuser1, UserLoginDTO.class);
	//
	// }

	/**
	 * Gets the cookie value.
	 *
	 * @param req the req
	 * @param cookieName the cookie name
	 * @return the cookie value
	 */
	private String getCookieValue(HttpServletRequest req, String cookieName) {
		return Arrays.stream(req.getCookies()).filter(c -> c.getName().equals(cookieName)).findFirst()
				.map(Cookie::getValue).orElse(null);
	}

	/**
	 * Gets the.
	 *
	 * @param userId the user id
	 * @param httpServletRequest the http servlet request
	 * @return the response entity
	 */
	@RequestMapping(value = "/get/{userId}", method = RequestMethod.GET)
	public @ResponseBody ResponseEntity get(@PathVariable(value = "userId") int userId,
			HttpServletRequest httpServletRequest) {

		try {
			// if (chiraghUtil.isValidSession(httpServletRequest) == false)
			// return new ResponseEntity(chiraghUtil.getMessageObject("Invalid Session!!!"),
			// HttpStatus.OK);

			String user = getCookieValue(httpServletRequest, "user");
			System.out.println(user);
			ObjectMapper mapper = new ObjectMapper();
			UserRegisterationDTO userRegisterationDTO = chiraghUserService.getUserByUserId(userId);
			if (userRegisterationDTO == null)
				return new ResponseEntity(chiraghUtil.getMessageObject("User Not Found"), HttpStatus.OK);

			// try {
			// logUtill.inputLog(httpServletRequest,
			// chiraghUtil.getSessionUser(httpServletRequest),
			// "/api/user/get/{userName}", mapper.writeValueAsString(userId),
			// mapper.writeValueAsString(userRegisterationDTO));
			// } catch (Exception e) {
			// return new ResponseEntity(chiraghUtil.getMessageObject("Log Generation
			// Fail!"), HttpStatus.OK);
			// }

			return new ResponseEntity(userRegisterationDTO, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity(chiraghUtil.getMessageObject("Internal Server Error!" + e.getMessage()),
					HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	/**
	 * Log out.
	 *
	 * @param httpServletRequest the http servlet request
	 */
	public void logOut(HttpServletRequest httpServletRequest) {
		httpServletRequest.getSession(false).invalidate();
	}

	/**
	 * Login.
	 *
	 * @param userLoginDTO the user login DTO
	 * @param httpServletRequest the http servlet request
	 * @param httpServletResponse the http servlet response
	 * @return the response entity
	 */
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public @ResponseBody ResponseEntity login(@Valid @RequestBody UserLoginDTO userLoginDTO,
			HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {
		try {
			ObjectMapper mapper = new ObjectMapper();
			UserLoginDTO loginDTO = chiraghUserService.login(userLoginDTO);
			// if (loginDTO == null)
			// return new ResponseEntity(chiraghUtil.getMessageObject("User Not Found!"),
			// HttpStatus.OK);
			//

			// session
			// httpServletRequest.getSession().invalidate();
			// HttpSession session = httpServletRequest.getSession(true);
			//
			// session.setAttribute("user",
			// userRepository.findByUserName(loginDTO.getUserName()));
			//
			// try {
			// logUtill.inputLog(httpServletRequest,
			// chiraghUtil.getSessionUser(httpServletRequest), "/api/user/login",
			// mapper.writeValueAsString(userLoginDTO),
			// mapper.writeValueAsString(userLoginDTO));
			// } catch (Exception e) {
			// return new ResponseEntity(chiraghUtil.getMessageObject("Log Generation
			// Fail!"), HttpStatus.OK);
			// }
			// // return new ResponseEntity(loginDTO, HttpStatus.OK);
			return new ResponseEntity(loginDTO, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity(chiraghUtil.getMessageObject("Internal Server Error!" + e.getMessage()),
					HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}// end of method

	/**
	 * Reset password request.
	 *
	 * @param userForgetPasswordDTO the user forget password DTO
	 * @param httpServletRequest the http servlet request
	 * @return the response entity
	 */
	@RequestMapping(value = "/resetPasswordRequest", method = RequestMethod.POST)
	public @ResponseBody ResponseEntity resetPasswordRequest(
			@Valid @RequestBody UserForgetPasswordDTO userForgetPasswordDTO, HttpServletRequest httpServletRequest) {
		try {
			ObjectMapper mapper = new ObjectMapper();
			Chiraghuser chiraghuser = chiraghUserService.resetPasswordRequest(userForgetPasswordDTO);
			if (chiraghuser == null)
				return new ResponseEntity(chiraghUtil.getMessageObject("Email Sending Fail!!"), HttpStatus.OK);

			try {
				logUtill.inputLog(httpServletRequest, chiraghuser, "/api/user/resetPasswordRequest",
						mapper.writeValueAsString(userForgetPasswordDTO), mapper.writeValueAsString("Email Sent"));
			} catch (Exception e) {
				return new ResponseEntity(chiraghUtil.getMessageObject("Log Generation Fail!"), HttpStatus.OK);
			}

			return new ResponseEntity(
					chiraghUtil.getMessageObject("Email Sent to " + userForgetPasswordDTO.getUserEmail()),
					HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity(chiraghUtil.getMessageObject("Internal Server Error!" + e.getMessage()),
					HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	/**
	 * Reset password change post.
	 *
	 * @param userNewPasswordDTO the user new password DTO
	 * @param httpServletRequest the http servlet request
	 * @return the response entity
	 */
	@RequestMapping(value = "/resetPassword", method = RequestMethod.POST)
	public ResponseEntity resetPasswordChangePost(@Valid @RequestBody UserNewPasswordDTO userNewPasswordDTO,
			HttpServletRequest httpServletRequest) {
		try {
			ObjectMapper mapper = new ObjectMapper();
			String msg = "";
			Chiraghuser chiraghuser = chiraghUserService.onConfirm(userNewPasswordDTO);
			if (chiraghuser == null)
				return new ResponseEntity(chiraghUtil.getMessageObject("Reset Password Fail! User not verified!"),
						HttpStatus.OK);

			try {
				logUtill.inputLog(httpServletRequest, chiraghuser, "/api/user/resetPassword",
						mapper.writeValueAsString(userNewPasswordDTO), mapper.writeValueAsString(msg));
			} catch (Exception e) {
				return new ResponseEntity(chiraghUtil.getMessageObject("Log Generation Fail!"), HttpStatus.OK);
			}

			return new ResponseEntity(chiraghUtil.getMessageObject("Password Change Successfully!"), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity(chiraghUtil.getMessageObject("Internal Server Error!" + e.getMessage()),
					HttpStatus.OK);
		}
	}

	/**
	 * Confirm email request.
	 *
	 * @param userName the user name
	 * @param httpServletRequest the http servlet request
	 * @return the response entity
	 */
	@RequestMapping(value = "/confirmEmailRequest", method = RequestMethod.POST)
	public @ResponseBody ResponseEntity confirmEmailRequest(@Valid @RequestBody String userName,
			HttpServletRequest httpServletRequest) {
		try {
			System.out.println(userName);
			ObjectMapper mapper = new ObjectMapper();
			Chiraghuser chiraghuser = chiraghUserService.confirmEmail(userName);
			if (chiraghuser == null)
				return new ResponseEntity(chiraghUtil.getMessageObject("Email Sending Fail!!"), HttpStatus.OK);

			return new ResponseEntity(chiraghUtil.getMessageObject("Email Sent"), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity(chiraghUtil.getMessageObject("Internal Server Error!" + e.getMessage()),
					HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	/**
	 * Check email.
	 *
	 * @param token the token
	 * @param httpServletRequest the http servlet request
	 * @return the response entity
	 */
	@RequestMapping(value = "/confirmEmailByToken", method = RequestMethod.POST)
	public @ResponseBody ResponseEntity checkEmail(@Valid @RequestBody String token,
			HttpServletRequest httpServletRequest) {
		try {
			ObjectMapper mapper = new ObjectMapper();
			Chiraghuser chiraghuser = chiraghUserService.confirmEmailByToken(token);
			if (chiraghuser == null)
				return new ResponseEntity(chiraghUtil.getMessageObject("User Not Fount!!"), HttpStatus.OK);

			return new ResponseEntity(chiraghUtil.getMessageObject("Verified"), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity(chiraghUtil.getMessageObject("Internal Server Error!" + e.getMessage()),
					HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	//   Dashboard Personal info
	
	/**
	 * Gets the personalinfo.
	 *
	 * @param userName the user name
	 * @param httpServletRequest the http servlet request
	 * @return the personalinfo
	 */
	@RequestMapping(value = "/getpersonalinfo/{userName}", method = RequestMethod.GET)
	public @ResponseBody ResponseEntity getpersonalinfo(@PathVariable(value = "userName") String userName,
			HttpServletRequest httpServletRequest) {
		try {
		    Chiraghuser chiraghuser = userRepository.findByUserName(userName);
		    System.out.println(chiraghuser.getUserEmail());
			if (chiraghuser == null)
				return new ResponseEntity(chiraghUtil.getMessageObject("User Not Found"), HttpStatus.OK);

			return new ResponseEntity(chiraghuser, HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity(chiraghUtil.getMessageObject("Internal Server Error!" + e.getMessage()),
					HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	/**
	 * Change password.
	 *
	 * @param userName the user name
	 * @param userNewPasswordDTO the user new password DTO
	 * @param httpServletRequest the http servlet request
	 * @return the response entity
	 */
	@RequestMapping(value = "/changePassword/{userName}", method = RequestMethod.PUT)
	public @ResponseBody ResponseEntity changePassword(@PathVariable(value = "userName") String userName,@Valid @RequestBody ChangePasswordDTO userNewPasswordDTO,
			HttpServletRequest httpServletRequest) {
		try {
			
			
			ObjectMapper objmapper = new ObjectMapper();
			ModelMapper mapper = new ModelMapper(); 
			String msg = chiraghUserService.changePassword(userName, userNewPasswordDTO);			
			return new ResponseEntity(chiraghUtil.getMessageObject(msg), HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity(chiraghUtil.getMessageObject("Internal Server Error!" + e.getMessage()),
					HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	
	
	@RequestMapping(value = "/updatePersonalInfo/{userName}", method = RequestMethod.PUT)
	public ResponseEntity updateRentDetails(@PathVariable(value = "userName") String userName, @Valid @RequestBody PersonalInfoDTO personallinfoDTO,
			HttpServletRequest httpServletRequest) {
		try {

			//String userName = persoanlinfoDTO.getUserName();
			if (userName.equals("") || userName == null) {
				return new ResponseEntity(chiraghUtil.getMessageObject("Invalid Session"), HttpStatus.OK);
			}
			ObjectMapper mapper = new ObjectMapper();
			Chiraghuser chiraghuser = chiraghUserService
					.updatePersonallInfo(userName,personallinfoDTO, httpServletRequest);
			if (chiraghuser  == null)
				return new ResponseEntity(chiraghUtil.getMessageObject("Personal Info Not Updated!"),
						HttpStatus.OK);

			logUtill.inputLog(httpServletRequest,
					userRepository.findByUserName(personallinfoDTO.getUserName()),
					"/api/user/updatePersonalInfo", mapper.writeValueAsString(personallinfoDTO),
					mapper.writeValueAsString("Personal Info Updated Successfully"));

			return new ResponseEntity(chiraghUtil.getMessageObject("Personal Info Updated Successfully"),
					HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity(chiraghUtil.getMessageObject("Internal Server Error!" + e.getMessage()),
					HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	
	
	
	

}// end of class
