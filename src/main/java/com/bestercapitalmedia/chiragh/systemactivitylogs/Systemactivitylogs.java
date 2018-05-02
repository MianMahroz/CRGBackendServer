
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

	@Column(name = "api", length = 45)
	@Basic(fetch = FetchType.EAGER)
	String api;
	/**
	 */
    @Column(name="input")
	String input;
    @Column(name="output")
	String output;
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


	public String getApi() {
		return api;
	}

	public void setApi(String api) {
		this.api = api;
	}

	public String getInput() {
		return input;
	}

	public void setInput(String input) {
		this.input = input;
	}

	public String getOutput() {
		return output;
	}

	public void setOutput(String output) {
		this.output = output;
	}
}
