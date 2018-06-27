package com.bestercapitalmedia.chiragh.user;

import java.io.Serializable;
import java.util.Calendar;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Range;

import com.bestercapitalmedia.chiragh.city.City;

public class UserRegisterationDTO implements Serializable{
	
	
	private int userId;
//	@Size(min=8,max=15)
//	@Pattern(regexp = "[a-zA-Z_.]*")
	private String firstName;
//	@Pattern(regexp = "[a-zA-Z_.]*")
	private String middleName;
//	@Pattern(regexp = "[a-zA-Z_.]*")
//	@Size(min=8,max=15)
	private String lastName;
//	@Size(min=8,max=15)
//	@Pattern(regexp = "[0-9-+]*")
	private String mobileNo;
//	@Pattern(regexp = "[a-zA-Z0-9_.,#]*")
//	@Size(min=8,max=25)
//	private String streetAddress;
//	@Size(min=8,max=25)
//	@Pattern(regexp = "[a-zA-Z0-9_.,#]*")
//	private String buildingAddress;
//	@Size(min=8,max=15)
//	@Pattern(regexp = "[a-zA-Z0-9_.]*")
	private String userName;
//	@Size(min=8,max=15)
	private String userPassword;
//	@Email
//	@NotEmpty
//	@NotEmpty
	private String userEmail;
//	@Size(min=4,max=8)
//	@Pattern(regexp = "[0-9]*")	BesterCapital2-
	private String mobileOtpCode;
//	@Size(min=8,max=15)
	private String confirmPassword;
	private String role;
	
	
	
	
	//Personal details
	
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	


    //Account Details
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

	
      
	//Contact Details
	
	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	
	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	 
	public String getMobileOtpCode() {
		return mobileOtpCode;
	}

	public void setMobileOtpCode(String mobileOtpCode) {
		this.mobileOtpCode = mobileOtpCode;
	}
	
	
	

	public UserRegisterationDTO() {
		
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	 
}
