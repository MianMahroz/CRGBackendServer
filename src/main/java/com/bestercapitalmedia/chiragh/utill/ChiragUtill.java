package com.bestercapitalmedia.chiragh.utill;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.providers.encoding.Md5PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import com.bestercapitalmedia.chiragh.systemactivitylogs.SystemActivityLog;
import com.bestercapitalmedia.chiragh.user.ChiraghUser;
import com.bestercapitalmedia.chiragh.user.UserRepository;

@Service
public class ChiragUtill {

	@Value("${app.secret}")
	private String applicationSecret;
	@Autowired
	private UserRepository userRepository;

	public String createActivationToken(ChiraghUser user, Boolean save) {
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
		return 	DigestUtils.md5DigestAsHex(password.getBytes());
	}

	public String createResetPasswordToken(ChiraghUser user, Boolean save) {		
		String resetToken="";
		if (save) {
			 resetToken=getencodedUserPasswordForReset(user.getUserEmail());
			user.setToken(resetToken);
			userRepository.save(user);
		}
		return resetToken;
	}

}// end of class
