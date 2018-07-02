package com.bestercapitalmedia.chiragh.user;

import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

// TODO: Auto-generated Javadoc
/**
 * The Class UserEditProfileDTO.
 */
public class UserEditProfileDTO {
	
	/** The first name. */
	@Size(min=8,max=15)
	private String firstName;
	
	/** The middle name. */
	private String middleName;
	
	/** The last name. */
	@Size(min=8,max=15)
	private String lastName;
	
	/** The mobile no. */
	@Size(min=8,max=15)
	private String mobileNo;
	
	/** The street address. */
	@Size(min=8,max=25)
	private String streetAddress;
	
	/** The building address. */
	@Size(min=8,max=25)
	private String buildingAddress;
	
	/** The user name. */
	@Size(min=8,max=15)
	private String userName;
	
	/** The user password. */
	@Size(min=8,max=15)
	private String userPassword;
	
	/** The user email. */
	@Email
	private String userEmail;
	
	/** The mobile otp code. */
	@Size(min=4,max=8)
	private String mobileOtpCode;
	
	/** The confirm password. */
	@Size(min=4,max=8)
	private String confirmPassword;
	
	/**
	 * Instantiates a new user edit profile DTO.
	 */
	@Size(min=3,max=10)
	
	public UserEditProfileDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	
	
}
