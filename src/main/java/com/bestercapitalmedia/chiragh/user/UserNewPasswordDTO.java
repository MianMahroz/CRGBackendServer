package com.bestercapitalmedia.chiragh.user;

import javax.validation.constraints.Size;

public class UserNewPasswordDTO {

	@Size(min=8,max=15)
	String userPassword;
	@Size(min=8,max=15)
	String confirmPassword;
	String token;
	
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	
}
