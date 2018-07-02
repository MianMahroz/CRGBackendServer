
package com.bestercapitalmedia.chiragh.admin.users;

import java.io.Serializable;

import java.lang.StringBuilder;

import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.Id;




import com.bestercapitalmedia.chiragh.admin.userpermissions.Adminuserpermissions;

import javax.persistence.*;

// TODO: Auto-generated Javadoc
/**
 * The Class Adminusers.
 */

@Entity
@Table(catalog = "chiraghdatabase", name = "adminusers")
public class Adminusers implements Serializable {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The admin users id. */

	@Column(name = "admin_Users_Id", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Integer adminUsersId;
	
	/** The username. */

	@Column(name = "username", length = 25)
	@Basic(fetch = FetchType.EAGER)

	String username;
	
	/** The password. */

	@Column(name = "password", length = 25)
	@Basic(fetch = FetchType.EAGER)

	
	String password;

	/** The adminuserpermissionses. */
	@OneToMany(mappedBy = "adminusers", fetch = FetchType.LAZY)
	java.util.Set<Adminuserpermissions> adminuserpermissionses;
	
	/** The adminactivitylogses. */
	@OneToMany(mappedBy = "adminusers", fetch = FetchType.LAZY)
	java.util.Set<com.bestercapitalmedia.chiragh.admin.activitylogs.Adminactivitylogs> adminactivitylogses;

	/**
	 * Sets the admin users id.
	 *
	 * @param adminUsersId the new admin users id
	 */
	public void setAdminUsersId(Integer adminUsersId) {
		this.adminUsersId = adminUsersId;
	}

	/**
	 * Gets the admin users id.
	 *
	 * @return the admin users id
	 */
	public Integer getAdminUsersId() {
		return this.adminUsersId;
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
	 * Gets the username.
	 *
	 * @return the username
	 */
	public String getUsername() {
		return this.username;
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
	 * Gets the password.
	 *
	 * @return the password
	 */
	public String getPassword() {
		return this.password;
	}

	/**
	 * Sets the adminuserpermissionses.
	 *
	 * @param adminuserpermissionses the new adminuserpermissionses
	 */
	public void setAdminuserpermissionses(Set<Adminuserpermissions> adminuserpermissionses) {
		this.adminuserpermissionses = adminuserpermissionses;
	}

	/**
	 * Gets the adminuserpermissionses.
	 *
	 * @return the adminuserpermissionses
	 */
	public Set<Adminuserpermissions> getAdminuserpermissionses() {
		if (adminuserpermissionses == null) {
			adminuserpermissionses = new java.util.LinkedHashSet<Adminuserpermissions>();
		}
		return adminuserpermissionses;
	}

	/**
	 * Sets the adminactivitylogses.
	 *
	 * @param adminactivitylogses the new adminactivitylogses
	 */
	public void setAdminactivitylogses(Set<com.bestercapitalmedia.chiragh.admin.activitylogs.Adminactivitylogs> adminactivitylogses) {
		this.adminactivitylogses = adminactivitylogses;
	}

	/**
	 * Gets the adminactivitylogses.
	 *
	 * @return the adminactivitylogses
	 */
	public Set<com.bestercapitalmedia.chiragh.admin.activitylogs.Adminactivitylogs> getAdminactivitylogses() {
		if (adminactivitylogses == null) {
			adminactivitylogses = new java.util.LinkedHashSet<com.bestercapitalmedia.chiragh.admin.activitylogs.Adminactivitylogs>();
		}
		return adminactivitylogses;
	}

	/**
	 * Instantiates a new adminusers.
	 */
	public Adminusers() {
	}

	
}
