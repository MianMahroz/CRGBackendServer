package com.bestercapitalmedia.chiragh.user;

import javax.validation.constraints.Size;

// TODO: Auto-generated Javadoc
/**
 * The Class UserNewPasswordDTO.
 */
public class UserNewPasswordDTO {

	/** The user password. */
	@Size(min=8,max=15)
	String userPassword;
	
	/** The confirm password. */
	@Size(min=8,max=15)
	String confirmPassword;
	
	/** The token. */
	String token;
	
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
	
	/**
	 * Gets the token.
	 *
	 * @return the token
	 */
	public String getToken() {
		return token;
	}
	
	/**
	 * Sets the token.
	 *
	 * @param token the new token
	 */
	public void setToken(String token) {
		this.token = token;
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
	
}
