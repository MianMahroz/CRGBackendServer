package com.bestercapitalmedia.chiragh.utill;

import java.io.Serializable;
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
		
		if (password.length() > 15 || password.length() < 8)
			return "Password should be less than 15 and more than 8 characters in length.";

		if (password.indexOf(userName) > -1)
			return "Password Should not be same as user name";

		String upperCaseChars = "(.*[A-Z].*)";
		if (!password.matches(upperCaseChars))
			return "Password should contain atleast one upper case alphabet";

		String lowerCaseChars = "(.*[a-z].*)";
		if (!password.matches(lowerCaseChars))
			return "Password should contain atleast one lower case alphabet";

		String numbers = "(.*[0-9].*)";
		if (!password.matches(numbers))
			return "Password should contain atleast one number.";

//		String specialChars = "(.*[,~,!,@,#,$,%,^,&,*,(,),-,_,=,+,[,{,],},|,;,:,<,>,/,?].*$)";
//		if (!password.matches(specialChars))
//			return "Password should contain atleast one special character";

		return "valid";

	}// end of method
	
public String textInputValidation(String input) {
		
      String upperCaseChars = "(.*[A-Z].*)(.*[a-z].*)";
		if (!input.matches(upperCaseChars))
			return "Name should contain only alphabets";		
		return "valid";

	}// end of method
public String validateEmailAddress(String emailAddress) {

    Pattern regexPattern = Pattern.compile("^[(a-zA-Z-0-9-\\_\\+\\.)]+@[(a-z-A-z)]+\\.[(a-zA-z)]{2,3}$");
    Matcher regMatcher   = regexPattern.matcher(emailAddress);
    if(regMatcher.matches()) {
        return "valid";
    } else {
        return "Invalid Email Address";
    }
}
}// end of class
