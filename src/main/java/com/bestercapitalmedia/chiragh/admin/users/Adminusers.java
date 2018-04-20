
package com.bestercapitalmedia.chiragh.admin.users;

import java.io.Serializable;

import java.lang.StringBuilder;

import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.Id;

import javax.xml.bind.annotation.*;


import com.bestercapitalmedia.chiragh.admin.userpermissions.Adminuserpermissions;

import javax.persistence.*;

/**
 */

@Entity
@Table(catalog = "chiraghdatabase", name = "adminusers")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "TestEntities/com/bestercapitalmedia/chiragh", name = "Adminusers")
@XmlRootElement(namespace = "TestEntities/com/bestercapitalmedia/chiragh")
public class Adminusers implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 */

	@Column(name = "admin_Users_Id", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@XmlElement
	Integer adminUsersId;
	/**
	 */

	@Column(name = "username", length = 25)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String username;
	/**
	 */

	@Column(name = "password", length = 25)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String password;

	/**
	 */
	@OneToMany(mappedBy = "adminusers", fetch = FetchType.LAZY)

	@XmlElement(name = "", namespace = "")
	java.util.Set<Adminuserpermissions> adminuserpermissionses;
	/**
	 */
	@OneToMany(mappedBy = "adminusers", fetch = FetchType.LAZY)

	@XmlElement(name = "", namespace = "")
	java.util.Set<com.bestercapitalmedia.chiragh.admin.activitylogs.Adminactivitylogs> adminactivitylogses;

	/**
	 */
	public void setAdminUsersId(Integer adminUsersId) {
		this.adminUsersId = adminUsersId;
	}

	/**
	 */
	public Integer getAdminUsersId() {
		return this.adminUsersId;
	}

	/**
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 */
	public String getUsername() {
		return this.username;
	}

	/**
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 */
	public String getPassword() {
		return this.password;
	}

	/**
	 */
	public void setAdminuserpermissionses(Set<Adminuserpermissions> adminuserpermissionses) {
		this.adminuserpermissionses = adminuserpermissionses;
	}

	/**
	 */
	public Set<Adminuserpermissions> getAdminuserpermissionses() {
		if (adminuserpermissionses == null) {
			adminuserpermissionses = new java.util.LinkedHashSet<Adminuserpermissions>();
		}
		return adminuserpermissionses;
	}

	/**
	 */
	public void setAdminactivitylogses(Set<com.bestercapitalmedia.chiragh.admin.activitylogs.Adminactivitylogs> adminactivitylogses) {
		this.adminactivitylogses = adminactivitylogses;
	}

	/**
	 */
	public Set<com.bestercapitalmedia.chiragh.admin.activitylogs.Adminactivitylogs> getAdminactivitylogses() {
		if (adminactivitylogses == null) {
			adminactivitylogses = new java.util.LinkedHashSet<com.bestercapitalmedia.chiragh.admin.activitylogs.Adminactivitylogs>();
		}
		return adminactivitylogses;
	}

	/**
	 */
	public Adminusers() {
	}

	
}
