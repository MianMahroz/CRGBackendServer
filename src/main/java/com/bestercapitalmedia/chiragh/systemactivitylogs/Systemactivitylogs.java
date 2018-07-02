
package com.bestercapitalmedia.chiragh.systemactivitylogs;

import java.io.Serializable;

import java.lang.StringBuilder;

import java.util.Set;

import javax.persistence.Id;



import com.bestercapitalmedia.chiragh.user.Chiraghuser;
import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

// TODO: Auto-generated Javadoc
/**
 * The Class Systemactivitylogs.
 */

@Entity
@Table(catalog = "chiraghdatabase", name = "systemactivitylogs")
public class Systemactivitylogs implements Serializable {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The system activity logs id. */

	@Column(name = "system_Activity_Logs_Id", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	Integer systemActivityLogsId;
	
	/** The api. */

	@Column(name = "api", length = 45)
	@Basic(fetch = FetchType.EAGER)
	String api;
	
	/** The input. */
    @Column(name="input")
	String input;
    
    /** The output. */
    @Column(name="output")
	String output;
	
	/** The action performed datetime. */
	@Column(name = "action_Performed_Datetime", length = 45)
	@Basic(fetch = FetchType.EAGER)
	String actionPerformedDatetime;
	
	/** The remote ip address. */

	@Column(name = "remote_Ip_Address", length = 45)
	@Basic(fetch = FetchType.EAGER)
	String remoteIpAddress;

	/** The chiraghuser. */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "user_Id", referencedColumnName = "user_Id") })
	@JsonBackReference
	Chiraghuser chiraghuser;

	/**
	 * Sets the system activity logs id.
	 *
	 * @param systemActivityLogsId the new system activity logs id
	 */
	public void setSystemActivityLogsId(Integer systemActivityLogsId) {
		this.systemActivityLogsId = systemActivityLogsId;
	}

	/**
	 * Gets the system activity logs id.
	 *
	 * @return the system activity logs id
	 */
	public Integer getSystemActivityLogsId() {
		return this.systemActivityLogsId;
	}

	

	/**
	 * Sets the action performed datetime.
	 *
	 * @param actionPerformedDatetime the new action performed datetime
	 */
	public void setActionPerformedDatetime(String actionPerformedDatetime) {
		this.actionPerformedDatetime = actionPerformedDatetime;
	}

	/**
	 * Gets the action performed datetime.
	 *
	 * @return the action performed datetime
	 */
	public String getActionPerformedDatetime() {
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
	 * Sets the chiraghuser.
	 *
	 * @param chiraghuser the new chiraghuser
	 */
	public void setChiraghuser(Chiraghuser chiraghuser) {
		this.chiraghuser = chiraghuser;
	}

	/**
	 * Gets the chiraghuser.
	 *
	 * @return the chiraghuser
	 */
	public Chiraghuser getChiraghuser() {
		return chiraghuser;
	}

	/**
	 * Instantiates a new systemactivitylogs.
	 */
	public Systemactivitylogs() {
	}


	/**
	 * Gets the api.
	 *
	 * @return the api
	 */
	public String getApi() {
		return api;
	}

	/**
	 * Sets the api.
	 *
	 * @param api the new api
	 */
	public void setApi(String api) {
		this.api = api;
	}

	/**
	 * Gets the input.
	 *
	 * @return the input
	 */
	public String getInput() {
		return input;
	}

	/**
	 * Sets the input.
	 *
	 * @param input the new input
	 */
	public void setInput(String input) {
		this.input = input;
	}

	/**
	 * Gets the output.
	 *
	 * @return the output
	 */
	public String getOutput() {
		return output;
	}

	/**
	 * Sets the output.
	 *
	 * @param output the new output
	 */
	public void setOutput(String output) {
		this.output = output;
	}
}
