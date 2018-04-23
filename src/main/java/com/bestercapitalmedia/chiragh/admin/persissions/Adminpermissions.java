
package com.bestercapitalmedia.chiragh.admin.persissions;

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
@Table(catalog = "chiraghdatabase", name = "adminpermissions")
public class Adminpermissions implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 */

	@Column(name = "admin_Permissions_Id", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	Integer adminPermissionsId;
	/**
	 */

	@Column(name = "permission_Title", length = 25)
	@Basic(fetch = FetchType.EAGER)

	String permissionTitle;
	/**
	 */

	@Column(name = "description", length = 25)
	@Basic(fetch = FetchType.EAGER)

	String description;
	/**
	 */

	@Column(name = "controller_name", length = 25)
	@Basic(fetch = FetchType.EAGER)
	String controllerName;

	/**
	 */
	@OneToMany(mappedBy = "adminpermissions", fetch = FetchType.LAZY)
	java.util.Set<Adminuserpermissions> adminuserpermissionses;

	/**
	 */
	public void setAdminPermissionsId(Integer adminPermissionsId) {
		this.adminPermissionsId = adminPermissionsId;
	}

	/**
	 */
	public Integer getAdminPermissionsId() {
		return this.adminPermissionsId;
	}

	/**
	 */
	public void setPermissionTitle(String permissionTitle) {
		this.permissionTitle = permissionTitle;
	}

	/**
	 */
	public String getPermissionTitle() {
		return this.permissionTitle;
	}

	/**
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 */
	public String getDescription() {
		return this.description;
	}

	/**
	 */
	public void setControllerName(String controllerName) {
		this.controllerName = controllerName;
	}

	/**
	 */
	public String getControllerName() {
		return this.controllerName;
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
	public Adminpermissions() {
	}

}
