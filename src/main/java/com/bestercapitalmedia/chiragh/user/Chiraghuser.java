
package com.bestercapitalmedia.chiragh.user;

import java.io.Serializable;

import java.lang.StringBuilder;

import java.util.Calendar;
import java.util.LinkedHashSet;
import java.util.Set;



import org.hibernate.validator.constraints.Range;

import com.bestercapitalmedia.chiragh.buyer.details.PropertyBuyerDetails;
import com.bestercapitalmedia.chiragh.buyer.payments.BuyerPayments;
import com.bestercapitalmedia.chiragh.city.City;
import com.bestercapitalmedia.chiragh.property.Chiraghproperty;
import com.bestercapitalmedia.chiragh.property.bidprocess.Propertybidprocess;
import com.bestercapitalmedia.chiragh.seller.details.Propertysellerdetails;
import com.bestercapitalmedia.chiragh.seller.payments.SellerPayments;
import com.bestercapitalmedia.chiragh.systemactivitylogs.Systemactivitylogs;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 */

@Entity
@Table(catalog = "chiraghdatabase", name = "chiraghuser")
public class Chiraghuser implements Serializable {
	 static final long serialVersionUID = 2L;

	

	@Column(name = "user_Id", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Integer userId;
	/**
	 */

	@Column(name = "user_Name")
	@Basic(fetch = FetchType.EAGER)
	@NotNull
	
	String userName;
	/**
	 */

	@Column(name = "user_Email", length = 225)
	@Basic(fetch = FetchType.EAGER)
	String userEmail;
	/**
	 */

	@Column(name = "user_Password", length = 225)
	@Basic(fetch = FetchType.EAGER)
	String userPassword;
	/**
	 */

	@Column(name = "first_Name", length = 225)
	@Basic(fetch = FetchType.EAGER)
	String firstName;
	/**
	 */

	@JsonInclude(Include.NON_NULL)
	@Column(name = "middle_Name", length = 225)
	@Basic(fetch = FetchType.EAGER)
	String middleName;
	/**
	 */

	@Column(name = "last_Name", length = 225)
	@Basic(fetch = FetchType.EAGER)
	String lastName;
	/**
	 */

	@Column(name = "mobile_No", length = 225)
	@Basic(fetch = FetchType.EAGER)
	String mobileNo;
	/**
	 */

	@Column(name = "street_Address", length = 225)
	@Basic(fetch = FetchType.EAGER)
	String streetAddress;
	/**
	 */

	@Column(name = "building_Address", length = 225)
	@Basic(fetch = FetchType.EAGER)
	String buildingAddress;
	/**
	 */

	@Column(name = "email_Verification_Code", length = 225)
	@Basic(fetch = FetchType.EAGER)
	String emailVerificationCode;
	/**
	 */

	@Column(name = "mobile_OTP_Code", length = 225)
	@Basic(fetch = FetchType.EAGER)
	String mobileOtpCode;
	/**
	 */

	@Column(name = "password_Verification_Code", length = 225)
	@Basic(fetch = FetchType.EAGER)
	String passwordVerificationCode;
	/**
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "otp_Code_Expiration")
	@Basic(fetch = FetchType.EAGER)
	Calendar otpCodeExpiration;
	/**
	 */

	@Column(name = "profile_Pic_Upload", length = 50)
	@Basic(fetch = FetchType.EAGER)
	String profilePicUpload;
	
	@Column(name="role")
	String role;

	//	@Transient
//	String errorMsg;

	/**
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonBackReference
	@JoinColumns({ @JoinColumn(name = "city_Id", referencedColumnName = "city_Id") })
	City city;
	/**
	 */
	
//	@OneToMany(mappedBy = "chiraghuser", fetch = FetchType.LAZY)
//	java.util.Set<Systemactivitylogs> systemactivitylogses;
	/**
	 */
//	@OneToMany(mappedBy = "chiraghuser", fetch = FetchType.LAZY)
//	java.util.Set<Propertybidprocess> propertybidprocesses;
//	/**
//	 */
//	
//	/**
//	 */
//	@OneToMany(mappedBy = "chiraghuser", fetch = FetchType.LAZY)
//	java.util.Set<BuyerPayments> buyerpaymentses;
//	/**
//	 */
//	@OneToMany(mappedBy = "chiraghuser", fetch = FetchType.LAZY)
//	java.util.Set<SellerPayments> sellerpaymentses;
////	/**
////	 */
//	@OneToMany(mappedBy = "chiraghuser", fetch = FetchType.LAZY)
//	java.util.List<Propertysellerdetails> propertysellerdetailses;

	@OneToMany(mappedBy = "chiraghuser", fetch = FetchType.LAZY)
	java.util.List<Chiraghproperty> chiraghproperties;
    
	
	@Column(name="token")
	String token;
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getStreetAddress() {
		return streetAddress;
	}
	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}
	public String getBuildingAddress() {
		return buildingAddress;
	}
	public void setBuildingAddress(String buildingAddress) {
		this.buildingAddress = buildingAddress;
	}
	public String getEmailVerificationCode() {
		return emailVerificationCode;
	}
	public void setEmailVerificationCode(String emailVerificationCode) {
		this.emailVerificationCode = emailVerificationCode;
	}
	public String getMobileOtpCode() {
		return mobileOtpCode;
	}
	public void setMobileOtpCode(String mobileOtpCode) {
		this.mobileOtpCode = mobileOtpCode;
	}
	public String getPasswordVerificationCode() {
		return passwordVerificationCode;
	}
	public void setPasswordVerificationCode(String passwordVerificationCode) {
		this.passwordVerificationCode = passwordVerificationCode;
	}
	public Calendar getOtpCodeExpiration() {
		return otpCodeExpiration;
	}
	public void setOtpCodeExpiration(Calendar otpCodeExpiration) {
		this.otpCodeExpiration = otpCodeExpiration;
	}
	public String getProfilePicUpload() {
		return profilePicUpload;
	}
	public void setProfilePicUpload(String profilePicUpload) {
		this.profilePicUpload = profilePicUpload;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public City getCity() {
		return city;
	}
	public void setCity(City city) {
		this.city = city;
	}

	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Chiraghuser() {
		
	}
	public java.util.List<Chiraghproperty> getChiraghproperties() {
		return chiraghproperties;
	}
	public void setChiraghproperties(java.util.List<Chiraghproperty> chiraghproperties) {
		this.chiraghproperties = chiraghproperties;
	}

	

	

	


	
		
}
