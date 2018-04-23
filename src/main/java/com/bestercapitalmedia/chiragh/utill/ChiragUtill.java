package com.bestercapitalmedia.chiragh.utill;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.providers.encoding.Md5PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import com.bestercapitalmedia.chiragh.user.Chiraghuser;
import com.bestercapitalmedia.chiragh.user.UserRepository;

@Service
public class ChiragUtill {

	@Value("${app.secret}")
	private String applicationSecret;
	@Autowired
	private UserRepository userRepository;

	public String createActivationToken(Chiraghuser user, Boolean save) {
		Md5PasswordEncoder encoder = new Md5PasswordEncoder();
		String activationToken = encoder.encodePassword(user.getUserName(), applicationSecret);
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
		Md5PasswordEncoder encoder = new Md5PasswordEncoder();
		String resetToken = encoder.encodePassword(password, applicationSecret);
		return resetToken;
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
	public String passwordValidation(String userName, String password) {

		// total score of password
		int iPasswordScore = 0;

		if (password.length() < 8)
			return "" + 0;
		else if (password.length() >= 10)
			iPasswordScore += 2;
		else
			iPasswordScore += 1;

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
		System.out.println(iPasswordScore);
		return "" + iPasswordScore;

	}// end of method

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

}// end of class
