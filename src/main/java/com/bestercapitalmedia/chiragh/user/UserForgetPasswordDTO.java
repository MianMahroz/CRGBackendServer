package com.bestercapitalmedia.chiragh.user;

import javax.validation.constraints.Email;

public class UserForgetPasswordDTO {
	
	@Email
	private String userEmail;
	
	
	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	
}
