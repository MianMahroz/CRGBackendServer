package com.bestercapitalmedia.chiragh.utill;

import java.io.Serializable;
import java.nio.file.Path;
import java.security.Principal;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import com.bestercapitalmedia.chiragh.oauth.dao.UserDao;
import com.bestercapitalmedia.chiragh.oauth.model.User;
import com.bestercapitalmedia.chiragh.user.Chiraghuser;
import com.bestercapitalmedia.chiragh.user.UserRepository;

@Service
public class ChiragUtill {

	@Value("${app.secret}")
	private String applicationSecret;
	@Autowired
	private UserRepository userRepository;
	@Autowired
	UserDao userDao;

	public ChiraghMessage getMessageObject(String msg) {
		ChiraghMessage chiraghMessage=new ChiraghMessage();
		chiraghMessage.setMsg(msg);
		return chiraghMessage;
	}
	public String genearteRandomNo(String prefix) {
		return prefix + "-" + RandomStringUtils.randomNumeric(6) + "-"
				+ RandomStringUtils.randomAlphabetic(3).toUpperCase();
	}

	public Chiraghuser getSessionUser(HttpServletRequest httpServletRequest) {
		return (Chiraghuser) httpServletRequest.getSession(false).getAttribute("user");
	}

	public boolean isValidSession(HttpServletRequest httpServletRequest) {
		boolean status = false;
		try {
			
			Chiraghuser chiraghuser = getSessionUser(httpServletRequest);
			if (chiraghuser == null)
				status = false;
			else
				status = true;

		} catch (Exception e) {
			System.out.println("Invalid Session");
		}
		return status;
	}

	public boolean isValidChiraghSession(HttpServletRequest httpServletRequest) {
		Principal principal = httpServletRequest.getUserPrincipal();
		System.out.println(principal.getName());
		User user = userDao.findByUsername(principal.getName());
		if (user == null) {
			return false;
		} else {
			return true;
		}
	}

	public String validatePassword(String password) {
		String status = "";
		// total score of passwords
		int iPasswordScore = 0;

		if (password.length() < 8 || password.length() > 15)
			iPasswordScore = 0;

		// if it contains one digit, add 2 to total score
		if (password.matches("(?=.*[0-9]).*"))
			iPasswordScore += 2;

		// if it contains one lower case letter, add 2 to total score
		if (password.matches("(?=.*[a-z]).*"))
			iPasswordScore += 2;

		// if it contains one upper case letter, add 2 to total score
		if (password.matches("(?=.*[A-Z]).*"))
			iPasswordScore += 2;

		// if it contains one special character, add 2 to total score
		if (password.matches("(?=.*[~!@#$%^&*()_-]).*"))
			iPasswordScore += 2;

		switch (iPasswordScore) {
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

		return status;

	}// end of method

	public String createActivationToken(Chiraghuser user, Boolean save) {
		String activationToken = DigestUtils.md5DigestAsHex(user.getUserName().getBytes());
		if (save) {
			user.setToken(activationToken);
			userRepository.save(user);
		}
		return activationToken;
	}

	public Calendar getDate(String date1) {
		System.out.println("Date" + date1);
		DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		Calendar calendar = null;
		try {
			Date date = formatter.parse(date1);
			calendar = Calendar.getInstance();
			calendar.setTime(date);
		} catch (ParseException ex) {

		}
		return calendar;
	}
	// public String encodeUserPassword(String password) {
	// BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
	// return passwordEncoder.encode(password);
	// }

	public String getencodedUserPasswordForReset(String password) {
		return DigestUtils.md5DigestAsHex(password.getBytes());
	}

	public String getBCryptEndodedPassword(String password) {
		return new BCryptPasswordEncoder().encode(password);
	}

	public String getencodedUserPassword(String password) {
		return DigestUtils.md5DigestAsHex(password.getBytes());
	}

	public String createResetPasswordToken(Chiraghuser user, Boolean save) {
		String resetToken = "";
		if (save) {
			resetToken = getencodedUserPasswordForReset(user.getUserEmail());
			user.setToken(resetToken);
			userRepository.save(user);
		}
		return resetToken;
	}

	/*
	 * Password should be less than 15 and more than 8 characters in length.
	 * Password should contain at least one upper case and one lower case alphabet.
	 * Password should contain at least one number. Password should contain at least
	 * one special character.
	 */

	public String textInputValidation(String input) {

		String upperCaseChars = "[a-zA-Z_]+";
		if (!input.matches(upperCaseChars))
			return "Name should contain only alphabets";
		else
			return "valid";

	}// end of method

	public String validateEmailAddress(String emailAddress) {

		Pattern regexPattern = Pattern.compile("^[(a-zA-Z-0-9-\\_\\+\\.)]+@[(a-z-A-z)]+\\.[(a-zA-z)]{2,3}$");
		Matcher regMatcher = regexPattern.matcher(emailAddress);
		if (regMatcher.matches()) {
			return "valid";
		} else {
			return "Invalid Email Address";
		}
	}
	
//	public Resource loadFile(String filename) {
//		try {
//			Path file = rootLocation.resolve(filename);
//			Resource resource = new UrlResource(file.toUri());
//			if (resource.exists() || resource.isReadable()) {
//				return resource;
//			} else {
//				throw new RuntimeException("FAIL!");
//			}
//		} catch (MalformedURLException e) {
//			throw new RuntimeException("FAIL!");
//		}
//	}

}// end of class
