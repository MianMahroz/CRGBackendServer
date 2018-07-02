package com.bestercapitalmedia.chiragh.admin.activitylogs;

import java.io.Serializable;

import java.lang.StringBuilder;

import java.util.Calendar;
import java.util.Set;

import javax.persistence.Id;



import com.bestercapitalmedia.chiragh.admin.users.Adminusers;
import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

// TODO: Auto-generated Javadoc
/**
 * The Class Adminactivitylogs.
 */

@Entity
@Table(catalog = "chiraghdatabase", name = "adminactivitylogs")
public class Adminactivitylogs implements Serializable {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The admin activity logs id. */

	@Column(name = "admin_Activity_Logs_Id", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	Integer adminActivityLogsId;
	
	/** The action performed. */

	@Column(name = "action_Performed", length = 25)
	@Basic(fetch = FetchType.EAGER)

	
	String actionPerformed;
	
	/** The action performed datetime. */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "action_Performed_Datetime")
	@Basic(fetch = FetchType.EAGER)

	
	Calendar actionPerformedDatetime;
	
	/** The remote ip address. */

	@Column(name = "remote_Ip_Address", length = 50)
	@Basic(fetch = FetchType.EAGER)

	
	String remoteIpAddress;

	/** The adminusers. */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "admin_Users_Id", referencedColumnName = "admin_Users_Id") })
	@JsonBackReference
	Adminusers adminusers;

	/**
	 * Sets the admin activity logs id.
	 *
	 * @param adminActivityLogsId the new admin activity logs id
	 */
	public void setAdminActivityLogsId(Integer adminActivityLogsId) {
		this.adminActivityLogsId = adminActivityLogsId;
	}

	/**
	 * Gets the admin activity logs id.
	 *
	 * @return the admin activity logs id
	 */
	public Integer getAdminActivityLogsId() {
		return this.adminActivityLogsId;
	}

	/**
	 * Sets the action performed.
	 *
	 * @param actionPerformed the new action performed
	 */
	public void setActionPerformed(String actionPerformed) {
		this.actionPerformed = actionPerformed;
	}

	/**
	 * Gets the action performed.
	 *
	 * @return the action performed
	 */
	public String getActionPerformed() {
		return this.actionPerformed;
	}

	/**
	 * Sets the action performed datetime.
	 *
	 * @param actionPerformedDatetime the new action performed datetime
	 */
	public void setActionPerformedDatetime(Calendar actionPerformedDatetime) {
		this.actionPerformedDatetime = actionPerformedDatetime;
	}

	/**
	 * Gets the action performed datetime.
	 *
	 * @return the action performed datetime
	 */
	public Calendar getActionPerformedDatetime() {
		return this.actionPerformedDatetime;
	}

	/**
	 * Sets the remote ip address.
	 *
	 * @param remoteIpAddress the new remote ip address
	 */
	public void setRemoteIpAddress(String remoteIpAddress) {
		this.remoteIpAddress = remoteIpAddress;
	}

	/**
	 * Gets the remote ip address.
	 *
	 * @return the remote ip address
	 */
	public String getRemoteIpAddress() {
		return this.remoteIpAddress;
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
	 * Instantiates a new adminactivitylogs.
	 */
	public Adminactivitylogs() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 * @param that the that
	 */
	public void copy(Adminactivitylogs that) {
		setAdminActivityLogsId(that.getAdminActivityLogsId());
		setActionPerformed(that.getActionPerformed());
		setActionPerformedDatetime(that.getActionPerformedDatetime());
		setRemoteIpAddress(that.getRemoteIpAddress());
		setAdminusers(that.getAdminusers());
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 * @return the string
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("adminActivityLogsId=[").append(adminActivityLogsId).append("] ");
		buffer.append("actionPerformed=[").append(actionPerformed).append("] ");
		buffer.append("actionPerformedDatetime=[").append(actionPerformedDatetime).append("] ");
		buffer.append("remoteIpAddress=[").append(remoteIpAddress).append("] ");

		return buffer.toString();
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (int) (prime * result + ((adminActivityLogsId == null) ? 0 : adminActivityLogsId.hashCode()));
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof Adminactivitylogs))
			return false;
		Adminactivitylogs equalCheck = (Adminactivitylogs) obj;
		if ((adminActivityLogsId == null && equalCheck.adminActivityLogsId != null) || (adminActivityLogsId != null && equalCheck.adminActivityLogsId == null))
			return false;
		if (adminActivityLogsId != null && !adminActivityLogsId.equals(equalCheck.adminActivityLogsId))
			return false;
		return true;
	}
}
