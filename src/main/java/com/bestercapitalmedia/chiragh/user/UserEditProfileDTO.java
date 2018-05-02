package com.bestercapitalmedia.chiragh.user;

import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

public class UserEditProfileDTO {
	@Size(min=8,max=15)
	private String firstName;
	private String middleName;
	@Size(min=8,max=15)
	private String lastName;
	@Size(min=8,max=15)
	private String mobileNo;
	@Size(min=8,max=25)
	private String streetAddress;
	@Size(min=8,max=25)
	private String buildingAddress;
	@Size(min=8,max=15)
	private String userName;
	@Size(min=8,max=15)
	private String userPassword;
	@Email
	private String userEmail;
	@Size(min=4,max=8)
	private String mobileOtpCode;
	@Size(min=4,max=8)
	private String confirmPassword;
	@Size(min=3,max=10)
	
	public UserEditProfileDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	
	
}
