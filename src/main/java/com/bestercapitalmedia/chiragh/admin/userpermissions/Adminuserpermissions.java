
package com.bestercapitalmedia.chiragh.admin.userpermissions;

import java.io.Serializable;

import java.lang.StringBuilder;

import java.util.Set;

import javax.persistence.Id;

import javax.xml.bind.annotation.*;

import com.bestercapitalmedia.chiragh.admin.persissions.Adminpermissions;
import com.bestercapitalmedia.chiragh.admin.users.Adminusers;
import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

/**
 */

@Entity

@Table(catalog = "chiraghdatabase", name = "adminuserpermissions")
public class Adminuserpermissions implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 */

	@Column(name = "admin_User_Permissions_Id", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	Integer adminUserPermissionsId;

	/**
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "admin_Users_Id", referencedColumnName = "admin_Users_Id") })
	@JsonBackReference
	Adminusers adminusers;
	/**
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "admin_Permissions_Id", referencedColumnName = "admin_Permissions_Id") })
	@JsonBackReference
	Adminpermissions adminpermissions;

	/**
	 */
	public void setAdminUserPermissionsId(Integer adminUserPermissionsId) {
		this.adminUserPermissionsId = adminUserPermissionsId;
	}

	/**
	 */
	public Integer getAdminUserPermissionsId() {
		return this.adminUserPermissionsId;
	}

	/**
	 */
	public void setAdminusers(Adminusers adminusers) {
		this.adminusers = adminusers;
	}

	/**
	 */
	public Adminusers getAdminusers() {
		return adminusers;
	}

	/**
	 */
	public void setAdminpermissions(Adminpermissions adminpermissions) {
		this.adminpermissions = adminpermissions;
	}

	/**
	 */
	public Adminpermissions getAdminpermissions() {
		return adminpermissions;
	}

	/**
	 */
	public Adminuserpermissions() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(Adminuserpermissions that) {
		setAdminUserPermissionsId(that.getAdminUserPermissionsId());
		setAdminusers(that.getAdminusers());
		setAdminpermissions(that.getAdminpermissions());
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("adminUserPermissionsId=[").append(adminUserPermissionsId).append("] ");

		return buffer.toString();
	}

	/**
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (int) (prime * result + ((adminUserPermissionsId == null) ? 0 : adminUserPermissionsId.hashCode()));
		return result;
	}

	/**
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
