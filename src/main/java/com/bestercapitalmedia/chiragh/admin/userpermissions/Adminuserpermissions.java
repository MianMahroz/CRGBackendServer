
package com.bestercapitalmedia.chiragh.admin.userpermissions;

import java.io.Serializable;

import java.lang.StringBuilder;

import java.util.Set;

import javax.persistence.Id;



import com.bestercapitalmedia.chiragh.admin.persissions.Adminpermissions;
import com.bestercapitalmedia.chiragh.admin.users.Adminusers;
import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

// TODO: Auto-generated Javadoc
/**
 * The Class Adminuserpermissions.
 */

@Entity

@Table(catalog = "chiraghdatabase", name = "adminuserpermissions")
public class Adminuserpermissions implements Serializable {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The admin user permissions id. */

	@Column(name = "admin_User_Permissions_Id", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	Integer adminUserPermissionsId;

	/** The adminusers. */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "admin_Users_Id", referencedColumnName = "admin_Users_Id") })
	@JsonBackReference
	Adminusers adminusers;
	
	/** The adminpermissions. */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "admin_Permissions_Id", referencedColumnName = "admin_Permissions_Id") })
	@JsonBackReference
	Adminpermissions adminpermissions;

	/**
	 * Sets the admin user permissions id.
	 *
	 * @param adminUserPermissionsId the new admin user permissions id
	 */
	public void setAdminUserPermissionsId(Integer adminUserPermissionsId) {
		this.adminUserPermissionsId = adminUserPermissionsId;
	}

	/**
	 * Gets the admin user permissions id.
	 *
	 * @return the admin user permissions id
	 */
	public Integer getAdminUserPermissionsId() {
		return this.adminUserPermissionsId;
	}

	/**
	 * Sets the adminusers.
	 *
	 * @param adminusers the new adminusers
	 */
	public void setAdminusers(Adminusers adminusers) {
		this.adminusers = adminusers;
	}

	/**
	 * Gets the adminusers.
	 *
	 * @return the adminusers
	 */
	public Adminusers getAdminusers() {
		return adminusers;
	}

	/**
	 * Sets the adminpermissions.
	 *
	 * @param adminpermissions the new adminpermissions
	 */
	public void setAdminpermissions(Adminpermissions adminpermissions) {
		this.adminpermissions = adminpermissions;
	}

	/**
	 * Gets the adminpermissions.
	 *
	 * @return the adminpermissions
	 */
	public Adminpermissions getAdminpermissions() {
		return adminpermissions;
	}

	/**
	 * Instantiates a new adminuserpermissions.
	 */
	public Adminuserpermissions() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 * @param that the that
	 */
	public void copy(Adminuserpermissions that) {
		setAdminUserPermissionsId(that.getAdminUserPermissionsId());
		setAdminusers(that.getAdminusers());
		setAdminpermissions(that.getAdminpermissions());
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 * @return the string
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("adminUserPermissionsId=[").append(adminUserPermissionsId).append("] ");

		return buffer.toString();
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (int) (prime * result + ((adminUserPermissionsId == null) ? 0 : adminUserPermissionsId.hashCode()));
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof Adminuserpermissions))
			return false;
		Adminuserpermissions equalCheck = (Adminuserpermissions) obj;
		if ((adminUserPermissionsId == null && equalCheck.adminUserPermissionsId != null) || (adminUserPermissionsId != null && equalCheck.adminUserPermissionsId == null))
			return false;
		if (adminUserPermissionsId != null && !adminUserPermissionsId.equals(equalCheck.adminUserPermissionsId))
			return false;
		return true;
	}
}
