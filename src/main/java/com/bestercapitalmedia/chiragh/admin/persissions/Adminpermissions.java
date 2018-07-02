
package com.bestercapitalmedia.chiragh.admin.persissions;

import java.io.Serializable;

import java.lang.StringBuilder;

import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.Id;



import com.bestercapitalmedia.chiragh.admin.userpermissions.Adminuserpermissions;

import javax.persistence.*;

// TODO: Auto-generated Javadoc
/**
 * The Class Adminpermissions.
 */

@Entity
@Table(catalog = "chiraghdatabase", name = "adminpermissions")
public class Adminpermissions implements Serializable {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The admin permissions id. */

	@Column(name = "admin_Permissions_Id", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	Integer adminPermissionsId;
	
	/** The permission title. */

	@Column(name = "permission_Title", length = 25)
	@Basic(fetch = FetchType.EAGER)

	String permissionTitle;
	
	/** The description. */

	@Column(name = "description", length = 25)
	@Basic(fetch = FetchType.EAGER)

	String description;
	
	/** The controller name. */

	@Column(name = "controller_name", length = 25)
	@Basic(fetch = FetchType.EAGER)
	String controllerName;

	/** The adminuserpermissionses. */
	@OneToMany(mappedBy = "adminpermissions", fetch = FetchType.LAZY)
	java.util.Set<Adminuserpermissions> adminuserpermissionses;

	/**
	 * Sets the admin permissions id.
	 *
	 * @param adminPermissionsId the new admin permissions id
	 */
	public void setAdminPermissionsId(Integer adminPermissionsId) {
		this.adminPermissionsId = adminPermissionsId;
	}

	/**
	 * Gets the admin permissions id.
	 *
	 * @return the admin permissions id
	 */
	public Integer getAdminPermissionsId() {
		return this.adminPermissionsId;
	}

	/**
	 * Sets the permission title.
	 *
	 * @param permissionTitle the new permission title
	 */
	public void setPermissionTitle(String permissionTitle) {
		this.permissionTitle = permissionTitle;
	}

	/**
	 * Gets the permission title.
	 *
	 * @return the permission title
	 */
	public String getPermissionTitle() {
		return this.permissionTitle;
	}

	/**
	 * Sets the description.
	 *
	 * @param description the new description
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Gets the description.
	 *
	 * @return the description
	 */
	public String getDescription() {
		return this.description;
	}

	/**
	 * Sets the controller name.
	 *
	 * @param controllerName the new controller name
	 */
	public void setControllerName(String controllerName) {
		this.controllerName = controllerName;
	}

	/**
	 * Gets the controller name.
	 *
	 * @return the controller name
	 */
	public String getControllerName() {
		return this.controllerName;
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
	 * Instantiates a new adminpermissions.
	 */
	public Adminpermissions() {
	}

}
