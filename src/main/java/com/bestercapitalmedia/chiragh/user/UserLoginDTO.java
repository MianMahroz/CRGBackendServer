package com.bestercapitalmedia.chiragh.user;

import java.io.Serializable;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.bestercapitalmedia.chiragh.property.Chiraghproperty;

// TODO: Auto-generated Javadoc
/**
 * The Class UserLoginDTO.
 */
public class UserLoginDTO implements Serializable{

//	@Size(min=8,max=15)
/** The user name. */
//	@Pattern(regexp = "[a-zA-Z0-9_.]*")
	private String userName;

/** The user password. */
//	@Size(min=8,max=15)
	private String userPassword;
	
	/** The msg. */
	String msg;
	
	/** The role. */
	String role;
	
	/**
	 * Instantiates a new user login DTO.
	 */
	public UserLoginDTO() {
	}
	
	

	/**
	 * Gets the user name.
	 *
	 * @return the user name
	 */
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



	/**
	 * Gets the msg.
	 *
	 * @return the msg
	 */
	public String getMsg() {
		return msg;
	}



	/**
	 * Sets the msg.
	 *
	 * @param msg the new msg
	 */
	public void setMsg(String msg) {
		this.msg = msg;
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
