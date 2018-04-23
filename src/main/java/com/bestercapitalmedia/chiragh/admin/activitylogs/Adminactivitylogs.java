
package com.bestercapitalmedia.chiragh.admin.activitylogs;

import java.io.Serializable;

import java.lang.StringBuilder;

import java.util.Calendar;
import java.util.Set;

import javax.persistence.Id;

import javax.xml.bind.annotation.*;

import com.bestercapitalmedia.chiragh.admin.users.Adminusers;
import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

/**
 */

@Entity
@Table(catalog = "chiraghdatabase", name = "adminactivitylogs")
public class Adminactivitylogs implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 */

	@Column(name = "admin_Activity_Logs_Id", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	Integer adminActivityLogsId;
	/**
	 */

	@Column(name = "action_Performed", length = 25)
	@Basic(fetch = FetchType.EAGER)

	
	String actionPerformed;
	/**
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "action_Performed_Datetime")
	@Basic(fetch = FetchType.EAGER)

	
	Calendar actionPerformedDatetime;
	/**
	 */

	@Column(name = "remote_Ip_Address", length = 50)
	@Basic(fetch = FetchType.EAGER)

	
	String remoteIpAddress;

	/**
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "admin_Users_Id", referencedColumnName = "admin_Users_Id") })
	@JsonBackReference
	Adminusers adminusers;

	/**
	 */
	public void setAdminActivityLogsId(Integer adminActivityLogsId) {
		this.adminActivityLogsId = adminActivityLogsId;
	}

	/**
	 */
	public Integer getAdminActivityLogsId() {
		return this.adminActivityLogsId;
	}

	/**
	 */
	public void setActionPerformed(String actionPerformed) {
		this.actionPerformed = actionPerformed;
	}

	/**
	 */
	public String getActionPerformed() {
		return this.actionPerformed;
	}

	/**
	 */
	public void setActionPerformedDatetime(Calendar actionPerformedDatetime) {
		this.actionPerformedDatetime = actionPerformedDatetime;
	}

	/**
	 */
	public Calendar getActionPerformedDatetime() {
		return this.actionPerformedDatetime;
	}

	/**
	 */
	public void setRemoteIpAddress(String remoteIpAddress) {
		this.remoteIpAddress = remoteIpAddress;
	}

	/**
	 */
	public String getRemoteIpAddress() {
		return this.remoteIpAddress;
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
	public Adminactivitylogs() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
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
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("adminActivityLogsId=[").append(adminActivityLogsId).append("] ");
		buffer.append("actionPerformed=[").append(actionPerformed).append("] ");
		buffer.append("actionPerformedDatetime=[").append(actionPerformedDatetime).append("] ");
		buffer.append("remoteIpAddress=[").append(remoteIpAddress).append("] ");

		return buffer.toString();
	}

	/**
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (int) (prime * result + ((adminActivityLogsId == null) ? 0 : adminActivityLogsId.hashCode()));
		return result;
	}

	/**
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
