
package com.bestercapitalmedia.chiragh.systemactivitylogs;

import java.io.Serializable;

import java.lang.StringBuilder;

import java.util.Set;

import javax.persistence.Id;

import javax.xml.bind.annotation.*;

import com.bestercapitalmedia.chiragh.user.Chiraghuser;
import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

/**
 */

@Entity
@Table(catalog = "chiraghdatabase", name = "systemactivitylogs")


public class Systemactivitylogs implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 */

	@Column(name = "system_Activity_Logs_Id", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	Integer systemActivityLogsId;
	/**
	 */

	@Column(name = "action_Performed", length = 45)
	@Basic(fetch = FetchType.EAGER)

	
	String actionPerformed;
	/**
	 */

	@Column(name = "action_Performed_Datetime", length = 45)
	@Basic(fetch = FetchType.EAGER)

	
	String actionPerformedDatetime;
	/**
	 */

	@Column(name = "remote_Ip_Address", length = 45)
	@Basic(fetch = FetchType.EAGER)

	
	String remoteIpAddress;

	/**
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "user_Id", referencedColumnName = "user_Id") })
	@JsonBackReference
	Chiraghuser chiraghuser;

	/**
	 */
	public void setSystemActivityLogsId(Integer systemActivityLogsId) {
		this.systemActivityLogsId = systemActivityLogsId;
	}

	/**
	 */
	public Integer getSystemActivityLogsId() {
		return this.systemActivityLogsId;
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
	public void setActionPerformedDatetime(String actionPerformedDatetime) {
		this.actionPerformedDatetime = actionPerformedDatetime;
	}

	/**
	 */
	public String getActionPerformedDatetime() {
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
	public void setChiraghuser(Chiraghuser chiraghuser) {
		this.chiraghuser = chiraghuser;
	}

	/**
	 */
	public Chiraghuser getChiraghuser() {
		return chiraghuser;
	}

	/**
	 */
	public Systemactivitylogs() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(Systemactivitylogs that) {
		setSystemActivityLogsId(that.getSystemActivityLogsId());
		setActionPerformed(that.getActionPerformed());
		setActionPerformedDatetime(that.getActionPerformedDatetime());
		setRemoteIpAddress(that.getRemoteIpAddress());
		setChiraghuser(that.getChiraghuser());
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("systemActivityLogsId=[").append(systemActivityLogsId).append("] ");
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
		result = (int) (prime * result + ((systemActivityLogsId == null) ? 0 : systemActivityLogsId.hashCode()));
		return result;
	}

	/**
	 */
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof Systemactivitylogs))
			return false;
		Systemactivitylogs equalCheck = (Systemactivitylogs) obj;
		if ((systemActivityLogsId == null && equalCheck.systemActivityLogsId != null) || (systemActivityLogsId != null && equalCheck.systemActivityLogsId == null))
			return false;
		if (systemActivityLogsId != null && !systemActivityLogsId.equals(equalCheck.systemActivityLogsId))
			return false;
		return true;
	}
}
