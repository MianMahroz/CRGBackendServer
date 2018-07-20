package com.bestercapitalmedia.chiragh.propertyactivitylogs;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.bestercapitalmedia.chiragh.property.Chiraghproperty;
import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity

@Table(catalog = "chiraghdatabase", name = "propertyactivitylogs")
public class PropertyActivityLogs implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 */

	@Column(name = "id", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@Id
	 @GeneratedValue(strategy=GenerationType.IDENTITY)
	Integer id;
	/**
	 */
	@Column(name="property_Id",insertable=false,updatable=false)
	int propertyId;

	@Column(name = "department", length = 200)
	@Basic(fetch = FetchType.EAGER)

	
	String department;
	/**
	 */

	@Column(name = "adminUserName", length = 250)
	@Basic(fetch = FetchType.EAGER)

	
	String adminUserName;
	/**
	 */

	@Column(name = "task", length = 350)
	@Basic(fetch = FetchType.EAGER)

	
	String task;
	/**
	 */

	@Column(name = "task_Status", length = 100)
	@Basic(fetch = FetchType.EAGER)

	
	String taskStatus;
	/**
	 */
	@Temporal(TemporalType.DATE)
	@Column(name = "task_Complete_Date")
	@Basic(fetch = FetchType.EAGER)

	
	Date taskCompleteDate;
	/**
	 */
	@Temporal(TemporalType.DATE)
	@Column(name = "task_Start_Date")
	@Basic(fetch = FetchType.EAGER)

	
	Date taskStartDate;
	/**
	 */

	@Column(name = "changes", length = 450)
	@Basic(fetch = FetchType.EAGER)

	
	String changes;
	/**
	 */
	@Temporal(TemporalType.DATE)
	@Column(name = "date")
	@Basic(fetch = FetchType.EAGER)

	
	Date date;
	/**
	 */

	@Column(name = "task_Type", length = 200)
	@Basic(fetch = FetchType.EAGER)

	
	String taskType;

	/**
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "property_Id", referencedColumnName = "property_Id") })
	@JsonBackReference
	Chiraghproperty chiraghproperty;

	/**
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 */
	public Integer getId() {
		return this.id;
	}

	/**
	 */
	public void setDepartment(String department) {
		this.department = department;
	}

	/**
	 */
	public String getDepartment() {
		return this.department;
	}

	/**
	 */
	public void setAdminUserName(String adminUserName) {
		this.adminUserName = adminUserName;
	}

	/**
	 */
	public String getAdminUserName() {
		return this.adminUserName;
	}

	/**
	 */
	public void setTask(String task) {
		this.task = task;
	}

	/**
	 */
	public String getTask() {
		return this.task;
	}

	/**
	 */
	public void setTaskStatus(String taskStatus) {
		this.taskStatus = taskStatus;
	}

	/**
	 */
	public String getTaskStatus() {
		return this.taskStatus;
	}

	/**
	 */
	
	/**
	 */
	public void setChanges(String changes) {
		this.changes = changes;
	}

	/**
	 */
	public String getChanges() {
		return this.changes;
	}

	/**
	 */
	
	/**
	 */
	public void setTaskType(String taskType) {
		this.taskType = taskType;
	}

	/**
	 */
	public String getTaskType() {
		return this.taskType;
	}

	/**
	 */
	public void setChiraghproperty(Chiraghproperty chiraghproperty) {
		this.chiraghproperty = chiraghproperty;
	}

	/**
	 */
	public Chiraghproperty getChiraghproperty() {
		return chiraghproperty;
	}

	/**
	 */
	public PropertyActivityLogs() {
	}

	public Date getTaskCompleteDate() {
		return taskCompleteDate;
	}

	public void setTaskCompleteDate(Date taskCompleteDate) {
		this.taskCompleteDate = taskCompleteDate;
	}

	public Date getTaskStartDate() {
		return taskStartDate;
	}

	public void setTaskStartDate(Date taskStartDate) {
		this.taskStartDate = taskStartDate;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getPropertyId() {
		return propertyId;
	}

	public void setPropertyId(int propertyId) {
		this.propertyId = propertyId;
	}

	
}