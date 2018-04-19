
package com.bestercapitalmedia.chiragh.systemactivitylogs;

import java.io.Serializable;

import java.lang.StringBuilder;

import java.util.Calendar;
import java.util.Set;

import javax.persistence.Id;

import javax.xml.bind.annotation.*;

import com.bestercapitalmedia.chiragh.user.ChiraghUser;

import javax.persistence.*;

/**
 */

@Entity

@Table(catalog = "dbchiraghupdated", name = "system_activity_log")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "TestEntities/com/bestercapitalmedia/chiragh/domain", name = "SystemActivityLog")

public class SystemActivityLog implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 */

	@Column(name = "activity_Log_Id", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Integer activityLogId;
	/**
	 */

	@Column(name = "input_Data", length = 225)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String inputData;
	/**
	 */

	@Column(name = "api", length = 50)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String api;
	/**
	 */

	@Column(name = "output_Data", length = 225)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String outputData;
	/**
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "Date")
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	Calendar date;

	/**
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "user_Id", referencedColumnName = "user_Id") })
	@XmlTransient
	ChiraghUser chiraghUser;

	/**
	 */
	public void setActivityLogId(Integer activityLogId) {
		this.activityLogId = activityLogId;
	}

	/**
	 */
	public Integer getActivityLogId() {
		return this.activityLogId;
	}

	/**
	 */
	public void setInputData(String inputData) {
		this.inputData = inputData;
	}

	/**
	 */
	public String getInputData() {
		return this.inputData;
	}

	/**
	 */
	public void setApi(String api) {
		this.api = api;
	}

	/**
	 */
	public String getApi() {
		return this.api;
	}

	/**
	 */
	public void setOutputData(String outputData) {
		this.outputData = outputData;
	}

	/**
	 */
	public String getOutputData() {
		return this.outputData;
	}

	/**
	 */
	public void setDate(Calendar date) {
		this.date = date;
	}

	/**
	 */
	public Calendar getDate() {
		return this.date;
	}

	/**
	 */
	public void setChiraghUser(ChiraghUser chiraghUser) {
		this.chiraghUser = chiraghUser;
	}

	/**
	 */
	public ChiraghUser getChiraghUser() {
		return chiraghUser;
	}

	/**
	 */
	public SystemActivityLog() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(SystemActivityLog that) {
		setActivityLogId(that.getActivityLogId());
		setInputData(that.getInputData());
		setApi(that.getApi());
		setOutputData(that.getOutputData());
		setDate(that.getDate());
		setChiraghUser(that.getChiraghUser());
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("activityLogId=[").append(activityLogId).append("] ");
		buffer.append("inputData=[").append(inputData).append("] ");
		buffer.append("api=[").append(api).append("] ");
		buffer.append("outputData=[").append(outputData).append("] ");
		buffer.append("date=[").append(date).append("] ");

		return buffer.toString();
	}

	/**
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (int) (prime * result + ((activityLogId == null) ? 0 : activityLogId.hashCode()));
		return result;
	}

	/**
	 */
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof SystemActivityLog))
			return false;
		SystemActivityLog equalCheck = (SystemActivityLog) obj;
		if ((activityLogId == null && equalCheck.activityLogId != null) || (activityLogId != null && equalCheck.activityLogId == null))
			return false;
		if (activityLogId != null && !activityLogId.equals(equalCheck.activityLogId))
			return false;
		return true;
	}
}
