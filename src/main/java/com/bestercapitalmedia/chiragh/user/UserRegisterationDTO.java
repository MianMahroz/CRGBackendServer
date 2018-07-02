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

// TODO: Auto-generated Javadoc
/**
 * The Class UserRegisterationDTO.
 */
public class UserRegisterationDTO implements Serializable{
	
	
	/** The user id. */
	private int userId;
//	@Size(min=8,max=15)
/** The first name. */
//	@Pattern(regexp = "[a-zA-Z_.]*")
	private String firstName;

/** The middle name. */
//	@Pattern(regexp = "[a-zA-Z_.]*")
	private String middleName;
//	@Pattern(regexp = "[a-zA-Z_.]*")
/** The last name. */
//	@Size(min=8,max=15)
	private String lastName;
//	@Size(min=8,max=15)
/** The mobile no. */
//	@Pattern(regexp = "[0-9-+]*")
	private String mobileNo;
//	@Pattern(regexp = "[a-zA-Z0-9_.,#]*")
//	@Size(min=8,max=25)
//	private String streetAddress;
//	@Size(min=8,max=25)
//	@Pattern(regexp = "[a-zA-Z0-9_.,#]*")
//	private String buildingAddress;
//	@Size(min=8,max=15)
/** The user name. */
//	@Pattern(regexp = "[a-zA-Z0-9_.]*")
	private String userName;

/** The user password. */
//	@Size(min=8,max=15)
	private String userPassword;
//	@Email
//	@NotEmpty
/** The user email. */
//	@NotEmpty
	private String userEmail;
//	@Size(min=4,max=8)
/** The mobile otp code. */
//	@Pattern(regexp = "[0-9]*")	BesterCapital2-
	private String mobileOtpCode;

/** The confirm password. */
//	@Size(min=8,max=15)
	private String confirmPassword;
	
	/** The role. */
	private String role;
	
	
	
	
	//Personal details
	
	
	/**
	 * Gets the first name.
	 *
	 * @return the first name
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Sets the first name.
	 *
	 * @param firstName the new first name
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * Gets the middle name.
	 *
	 * @return the middle name
	 */
	public String getMiddleName() {
		return middleName;
	}

	/**
	 * Sets the middle name.
	 *
	 * @param middleName the new middle name
	 */
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	/**
	 * Gets the last name.
	 *
	 * @return the last name
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Sets the last name.
	 *
	 * @param lastName the new last name
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	


    /**
     * Gets the user name.
     *
     * @return the user name
     */
    //Account Details
	public String getUserName() {
		return userName;
	}

	/**
	 * Sets the user name.
	 *
	 * @param userName the new user name
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	/**
	 * Gets the user password.
	 *
	 * @return the user password
	 */
	public String getUserPassword() {
		return userPassword;
	}

	/**
	 * Sets the user password.
	 *
	 * @param userPassword the new user password
	 */
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	
      
	//Contact Details
	
	/**
	 * Gets the user email.
	 *
	 * @return the user email
	 */
	public String getUserEmail() {
		return userEmail;
	}

	/**
	 * Sets the user email.
	 *
	 * @param userEmail the new user email
	 */
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	
	/**
	 * Gets the mobile no.
	 *
	 * @return the mobile no
	 */
	public String getMobileNo() {
		return mobileNo;
	}

	/**
	 * Sets the mobile no.
	 *
	 * @param mobileNo the new mobile no
	 */
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	 
	/**
	 * Gets the mobile otp code.
	 *
	 * @return the mobile otp code
	 */
	public String getMobileOtpCode() {
		return mobileOtpCode;
	}

	/**
	 * Sets the mobile otp code.
	 *
	 * @param mobileOtpCode the new mobile otp code
	 */
	public void setMobileOtpCode(String mobileOtpCode) {
		this.mobileOtpCode = mobileOtpCode;
	}
	
	
	

	/**
	 * Instantiates a new user registeration DTO.
	 */
	public UserRegisterationDTO() {
		
	}

	/**
	 * Gets the confirm password.
	 *
	 * @return the confirm password
	 */
	public String getConfirmPassword() {
		return confirmPassword;
	}

	/**
	 * Sets the confirm password.
	 *
	 * @param confirmPassword the new confirm password
	 */
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	/**
	 * Gets the user id.
	 *
	 * @return the user id
	 */
	public int getUserId() {
		return userId;
	}

	/**
	 * Sets the user id.
	 *
	 * @param userId the new user id
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}

	/**
	 * Gets the role.
	 *
	 * @return the role
	 */
	public String getRole() {
		return role;
	}

	/**
	 * Sets the role.
	 *
	 * @param role the new role
	 */
	public void setRole(String role) {
		this.role = role;
	}
	 
}
