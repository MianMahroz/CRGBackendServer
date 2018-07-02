package com.bestercapitalmedia.chiragh.oauth.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

// TODO: Auto-generated Javadoc
/**
 * The Class User.
 */
@Entity
@Table(name="oauthUser")
//@Table(name="chiraghuser")
public class User {

    /** The user id. */
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="user_Id")
    private long userId;
    
    /** The username. */
    @Column(name="user_Name")
    private String username;
    
    /** The password. */
    @Column(name="user_Password")
    @JsonIgnore
    private String password;
    
    
    

    /**
     * Gets the username.
     *
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the username.
     *
     * @param username the new username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Gets the password.
     *
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the password.
     *
     * @param password the new password
     */
    public void setPassword(String password) {
        this.password = password;
    }

	/**
	 * Instantiates a new user.
	 */
	public User() {
		
	}

	/**
	 * Gets the user id.
	 *
	 * @return the user id
	 */
	public long getUserId() {
		return userId;
	}

	/**
	 * Sets the user id.
	 *
	 * @param userId the new user id
	 */
	public void setUserId(long userId) {
		this.userId = userId;
	}

   

    
}
