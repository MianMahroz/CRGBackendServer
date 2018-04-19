
package com.bestercapitalmedia.chiragh.user;

import java.io.Serializable;

import java.lang.StringBuilder;

import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.Id;

import javax.xml.bind.annotation.*;

import com.bestercapitalmedia.chiragh.city.City;
import com.bestercapitalmedia.chiragh.propertybidprocess.Propertybidprocess;
import com.bestercapitalmedia.chiragh.systemactivitylogs.SystemActivityLog;

import javax.persistence.*;

/**
 */

@Entity

@Table(catalog = "dbchiraghupdated", name = "chiragh_user")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "TestEntities/com/bestercapitalmedia/chiragh/domain", name = "ChiraghUser")
@XmlRootElement(namespace = "TestEntities/com/bestercapitalmedia/chiragh/domain")
public class ChiraghUser implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 */

	@Column(name = "user_Id", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@XmlElement
	Integer userId;
	/**
	 */

	@Column(name = "user_Name", length = 225)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String userName;
	/**
	 */

	@Column(name = "user_Email", length = 225)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String userEmail;
	/**
	 */

	@Column(name = "user_Password", length = 225)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String userPassword;
	/**
	 */

	@Column(name = "first_Name", length = 225)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String firstName;
	/**
	 */

	@Column(name = "middle_Name", length = 225)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String middleName;
	/**
	 */

	@Column(name = "last_Name", length = 225)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String lastName;
	/**
	 */

	@Column(name = "mobile_No", length = 225)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String mobileNo;
	/**
	 */

	@Column(name = "street_Address", length = 225)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String streetAddress;
	/**
	 */

	@Column(name = "building_Address", length = 225)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String buildingAddress;
	/**
	 */

	@Column(name = "email_Verification_Code", length = 225)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String emailVerificationCode;
	/**
	 */

	@Column(name = "mobile_OTP_Code", length = 225)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String mobileOtpCode;

	/**
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "city_Id", referencedColumnName = "city_Id") })
	@XmlTransient
	City city;
	/**
	 */
	@OneToMany(mappedBy = "chiraghUser", fetch = FetchType.LAZY)

	@XmlElement(name = "", namespace = "")
	java.util.Set<SystemActivityLog> systemActivityLogs;
	/**
	 */
	@OneToMany(mappedBy = "chiraghUser", fetch = FetchType.LAZY)

	@XmlElement(name = "", namespace = "")
	java.util.Set<Propertybidprocess> propertybidprocesses;

	@Column(name = "token", length = 225)
	private String token;
	
	
	
	/**
	 */
	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	/**
	 */
	public Integer getUserId() {
		return this.userId;
	}

	/**
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 */
	public String getUserName() {
		return this.userName;
	}

	/**
	 */
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	/**
	 */
	public String getUserEmail() {
		return this.userEmail;
	}

	/**
	 */
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	/**
	 */
	public String getUserPassword() {
		return this.userPassword;
	}

	/**
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 */
	public String getFirstName() {
		return this.firstName;
	}

	/**
	 */
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	/**
	 */
	public String getMiddleName() {
		return this.middleName;
	}

	/**
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 */
	public String getLastName() {
		return this.lastName;
	}

	/**
	 */
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	/**
	 */
	public String getMobileNo() {
		return this.mobileNo;
	}

	/**
	 */
	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	/**
	 */
	public String getStreetAddress() {
		return this.streetAddress;
	}

	/**
	 */
	public void setBuildingAddress(String buildingAddress) {
		this.buildingAddress = buildingAddress;
	}

	/**
	 */
	public String getBuildingAddress() {
		return this.buildingAddress;
	}

	/**
	 */
	public void setEmailVerificationCode(String emailVerificationCode) {
		this.emailVerificationCode = emailVerificationCode;
	}

	/**
	 */
	public String getEmailVerificationCode() {
		return this.emailVerificationCode;
	}

	/**
	 */
	public void setMobileOtpCode(String mobileOtpCode) {
		this.mobileOtpCode = mobileOtpCode;
	}

	/**
	 */
	public String getMobileOtpCode() {
		return this.mobileOtpCode;
	}

	/**
	 */
	public void setCity(City city) {
		this.city = city;
	}

	/**
	 */
	public City getCity() {
		return city;
	}

	/**
	 */
	public void setSystemActivityLogs(Set<SystemActivityLog> systemActivityLogs) {
		this.systemActivityLogs = systemActivityLogs;
	}

	/**
	 */
	public Set<SystemActivityLog> getSystemActivityLogs() {
		if (systemActivityLogs == null) {
			systemActivityLogs = new java.util.LinkedHashSet<SystemActivityLog>();
		}
		return systemActivityLogs;
	}

	/**
	 */
	public void setPropertybidprocesses(Set<Propertybidprocess> propertybidprocesses) {
		this.propertybidprocesses = propertybidprocesses;
	}

	/**
	 */
	public Set<Propertybidprocess> getPropertybidprocesses() {
		if (propertybidprocesses == null) {
			propertybidprocesses = new java.util.LinkedHashSet<Propertybidprocess>();
		}
		return propertybidprocesses;
	}

	/**
	 */
	public ChiraghUser() {
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}


}
