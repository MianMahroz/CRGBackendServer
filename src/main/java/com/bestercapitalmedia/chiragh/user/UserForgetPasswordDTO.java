package com.bestercapitalmedia.chiragh.user;

import javax.validation.constraints.Email;

// TODO: Auto-generated Javadoc
/**
 * The Class UserForgetPasswordDTO.
 */
public class UserForgetPasswordDTO {
	
	/** The user email. */
	@Email
	private String userEmail;
	
	
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

	
}
