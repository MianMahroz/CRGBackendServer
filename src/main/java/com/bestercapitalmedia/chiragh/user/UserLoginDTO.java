package com.bestercapitalmedia.chiragh.user;

import java.io.Serializable;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.bestercapitalmedia.chiragh.property.Chiraghproperty;

public class UserLoginDTO implements Serializable{

	@Size(min=8,max=15)
	@Pattern(regexp = "[a-zA-Z0-9_.]*")
	private String userName;
	@Size(min=8,max=15)
	private String userPassword;
	
	public UserLoginDTO() {
	}
	
	
	

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}




}
