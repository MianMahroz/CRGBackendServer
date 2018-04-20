
package com.bestercapitalmedia.chiragh.user;

import java.io.Serializable;

import java.lang.StringBuilder;

import java.util.Calendar;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.xml.bind.annotation.*;

import com.bestercapitalmedia.chiragh.buyer.details.Propertybuyerdetails;
import com.bestercapitalmedia.chiragh.buyer.payments.Buyerpayments;
import com.bestercapitalmedia.chiragh.city.City;
import com.bestercapitalmedia.chiragh.property.Chiraghproperty;
import com.bestercapitalmedia.chiragh.property.bidprocess.Propertybidprocess;
import com.bestercapitalmedia.chiragh.seller.details.Propertysellerdetails;
import com.bestercapitalmedia.chiragh.seller.payments.Sellerpayments;
import com.bestercapitalmedia.chiragh.systemactivitylogs.Systemactivitylogs;

import javax.persistence.*;

/**
 */

@Entity
@Table(catalog = "chiraghdatabase", name = "chiraghuser")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "TestEntities/com/bestercapitalmedia/chiragh", name = "Chiraghuser")
@XmlRootElement(namespace = "TestEntities/com/bestercapitalmedia/chiragh")
public class Chiraghuser implements Serializable {
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

	@Column(name = "password_Verification_Code", length = 225)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String passwordVerificationCode;
	/**
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "otp_Code_Expiration")
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	Calendar otpCodeExpiration;
	/**
	 */

	@Column(name = "profile_Pic_Upload", length = 50)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String profilePicUpload;

	/**
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "city_Id", referencedColumnName = "city_Id") })
	@XmlTransient
	City city;
	/**
	 */
	@OneToMany(mappedBy = "chiraghuser", fetch = FetchType.LAZY)

	@XmlElement(name = "", namespace = "")
	java.util.Set<Systemactivitylogs> systemactivitylogses;
	/**
	 */
	@OneToMany(mappedBy = "chiraghuser", fetch = FetchType.LAZY)

	@XmlElement(name = "", namespace = "")
	java.util.Set<Propertybidprocess> propertybidprocesses;
	/**
	 */
	@OneToMany(mappedBy = "chiraghuser", fetch = FetchType.LAZY)

	@XmlElement(name = "", namespace = "")
	java.util.Set<Propertybuyerdetails> propertybuyerdetailses;
	/**
	 */
	@OneToMany(mappedBy = "chiraghuser", fetch = FetchType.LAZY)

	@XmlElement(name = "", namespace = "")
	java.util.Set<Buyerpayments> buyerpaymentses;
	/**
	 */
	@OneToMany(mappedBy = "chiraghuser", fetch = FetchType.LAZY)

	@XmlElement(name = "", namespace = "")
	java.util.Set<Sellerpayments> sellerpaymentses;
	/**
	 */
	@OneToMany(mappedBy = "chiraghuser", fetch = FetchType.LAZY)

	@XmlElement(name = "", namespace = "")
	java.util.Set<Propertysellerdetails> propertysellerdetailses;
	/**
	 */
	@OneToMany(mappedBy = "chiraghuser", fetch = FetchType.LAZY)

	@XmlElement(name = "", namespace = "")
	java.util.Set<Chiraghproperty> chiraghproperties;
    
	@Column(name="token")
	String token;
	
	
	
	
	
	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

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
	public void setPasswordVerificationCode(String passwordVerificationCode) {
		this.passwordVerificationCode = passwordVerificationCode;
	}

	/**
	 */
	public String getPasswordVerificationCode() {
		return this.passwordVerificationCode;
	}

	/**
	 */
	public void setOtpCodeExpiration(Calendar otpCodeExpiration) {
		this.otpCodeExpiration = otpCodeExpiration;
	}

	/**
	 */
	public Calendar getOtpCodeExpiration() {
		return this.otpCodeExpiration;
	}

	/**
	 */
	public void setProfilePicUpload(String profilePicUpload) {
		this.profilePicUpload = profilePicUpload;
	}

	/**
	 */
	public String getProfilePicUpload() {
		return this.profilePicUpload;
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

	public java.util.Set<Systemactivitylogs> getSystemactivitylogses() {
		return systemactivitylogses;
	}

	public void setSystemactivitylogses(java.util.Set<Systemactivitylogs> systemactivitylogses) {
		this.systemactivitylogses = systemactivitylogses;
	}

	public java.util.Set<Propertybidprocess> getPropertybidprocesses() {
		return propertybidprocesses;
	}

	public void setPropertybidprocesses(java.util.Set<Propertybidprocess> propertybidprocesses) {
		this.propertybidprocesses = propertybidprocesses;
	}

	public java.util.Set<Propertybuyerdetails> getPropertybuyerdetailses() {
		return propertybuyerdetailses;
	}

	public void setPropertybuyerdetailses(java.util.Set<Propertybuyerdetails> propertybuyerdetailses) {
		this.propertybuyerdetailses = propertybuyerdetailses;
	}

	public java.util.Set<Buyerpayments> getBuyerpaymentses() {
		return buyerpaymentses;
	}

	public void setBuyerpaymentses(java.util.Set<Buyerpayments> buyerpaymentses) {
		this.buyerpaymentses = buyerpaymentses;
	}

	public java.util.Set<Sellerpayments> getSellerpaymentses() {
		return sellerpaymentses;
	}

	public void setSellerpaymentses(java.util.Set<Sellerpayments> sellerpaymentses) {
		this.sellerpaymentses = sellerpaymentses;
	}

	public java.util.Set<Propertysellerdetails> getPropertysellerdetailses() {
		return propertysellerdetailses;
	}

	public void setPropertysellerdetailses(java.util.Set<Propertysellerdetails> propertysellerdetailses) {
		this.propertysellerdetailses = propertysellerdetailses;
	}

	public java.util.Set<Chiraghproperty> getChiraghproperties() {
		return chiraghproperties;
	}

	public void setChiraghproperties(java.util.Set<Chiraghproperty> chiraghproperties) {
		this.chiraghproperties = chiraghproperties;
	}

	public Chiraghuser() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
