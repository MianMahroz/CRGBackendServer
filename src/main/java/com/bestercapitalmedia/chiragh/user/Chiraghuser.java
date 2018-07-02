
package com.bestercapitalmedia.chiragh.user;

import java.io.Serializable;

import java.lang.StringBuilder;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;
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

// TODO: Auto-generated Javadoc
/**
 * The Class Chiraghuser.
 */

@Entity
@Table(catalog = "chiraghdatabase", name = "chiraghuser")
public class Chiraghuser implements Serializable {
	 
 	/** The Constant serialVersionUID. */
 	static final long serialVersionUID = 2L;

	/** The user id. */
	@Column(name = "user_Id", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Integer userId;
	
	/** The user name. */

	@Column(name = "user_Name")
	@Basic(fetch = FetchType.EAGER)
	@NotNull
	
	String userName;
	
	/** The user email. */

	@Column(name = "user_Email", length = 225)
	@Basic(fetch = FetchType.EAGER)
	String userEmail;
	
	/** The user password. */

	@Column(name = "user_Password", length = 225)
	@Basic(fetch = FetchType.EAGER)
	String userPassword;
	
	/** The first name. */

	@Column(name = "first_Name", length = 225)
	@Basic(fetch = FetchType.EAGER)
	String firstName;
	
	/** The middle name. */

	@JsonInclude(Include.NON_NULL)
	@Column(name = "middle_Name", length = 225)
	@Basic(fetch = FetchType.EAGER)
	String middleName;
	
	/** The last name. */

	@Column(name = "last_Name", length = 225)
	@Basic(fetch = FetchType.EAGER)
	String lastName;
	
	/** The mobile no. */

	@Column(name = "mobile_No", length = 225)
	@Basic(fetch = FetchType.EAGER)
	String mobileNo;
	
	/** The street address. */

	@Column(name = "street_Address", length = 225)
	@Basic(fetch = FetchType.EAGER)
	String streetAddress;
	
	/** The building address. */

	@Column(name = "building_Address", length = 225)
	@Basic(fetch = FetchType.EAGER)
	String buildingAddress;
	
	/** The email verification code. */

	@Column(name = "email_Verification_Code", length = 225)
	@Basic(fetch = FetchType.EAGER)
	String emailVerificationCode;
	
	/** The mobile otp code. */

	@Column(name = "old_Passsword", length = 225)
	@Basic(fetch = FetchType.EAGER)
	String oldPasssword;
	
	
	@Column(name = "password_Change_Date")
	@Basic(fetch = FetchType.EAGER)
	String passwordChangeDate;
	
	
	@Column(name = "mobile_OTP_Code", length = 225)
	@Basic(fetch = FetchType.EAGER)
	String mobileOtpCode;
	
	/** The password verification code. */

	@Column(name = "password_Verification_Code", length = 225)
	@Basic(fetch = FetchType.EAGER)
	String passwordVerificationCode;
	
	/** The otp code expiration. */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "otp_Code_Expiration")
	@Basic(fetch = FetchType.EAGER)
	Calendar otpCodeExpiration;
	
	/** The nationality. */

	@Column(name = "nationality", length = 25)
	@Basic(fetch = FetchType.EAGER)
	String nationality;
	
	
	/** The id card number. */
	@Column(name = "id_Card_Number", length = 25)
	@Basic(fetch = FetchType.EAGER)
	String idCardNumber;
	
	/** The id card expiry date. */
	@Column(name = "id_Card_Expiry_Date")
	@Basic(fetch = FetchType.EAGER)
	Calendar idCardExpiryDate;
	
	
	/** The passport expiry date. */
	@Column(name = "passport_Expiry_Date")
	@Basic(fetch = FetchType.EAGER)
	Calendar passportExpiryDate;
	
	
	/** The passport number. */
	@Column(name = "passport_Number")
	@Basic(fetch = FetchType.EAGER)
	String passportNumber;
	
	
	/** The phone number. */
	@Column(name = "phone_Number")
	@Basic(fetch = FetchType.EAGER)
	String phoneNumber;
	
	/** The fax. */
	@Column(name = "fax")
	@Basic(fetch = FetchType.EAGER)
	String fax;
	
	/** The country. */
	@Column(name = "country")
	@Basic(fetch = FetchType.EAGER)
	String country;
	
	/** The user city. */
	@Column(name = "user_City")
	@Basic(fetch = FetchType.EAGER)
	String userCity;
	
	
	/** The classify yourself. */
	@Column(name = "classify_Yourself")
	@Basic(fetch = FetchType.EAGER)
	String classifyYourself;
	
	/** The scanned passport copy upload. */
	@Column(name = "scanned_Passport_Copy_Upload")
	@Basic(fetch = FetchType.EAGER)
	String scannedPassportCopyUpload;
	
	/** The scanned id copy upload. */
	@Column(name = "scanned_Id_Copy_Upload")
	@Basic(fetch = FetchType.EAGER)
	String scannedIdCopyUpload;
	
	
	
	
	
	/** The profile pic upload. */
	@Column(name = "profile_Pic_Upload", length = 50)
	@Basic(fetch = FetchType.EAGER)
	String profilePicUpload;
	

	/** The role. */
	@Column(name="role")
	String role;

		/** The error msg. */
		@Transient
	String errorMsg;

	/** The city. */
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonBackReference
	@JoinColumns({ @JoinColumn(name = "city_Id", referencedColumnName = "city_Id") })
	City city;
	
	/** The chiraghproperties. */
	
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
    
	
	/** The token. */
	@Column(name="token")
	String token;
	
	/**
	 * Gets the user id.
	 *
	 * @return the user id
	 */
	public Integer getUserId() {
		return userId;
	}
	
	/**
	 * Sets the user id.
	 *
	 * @param userId the new user id
	 */
	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	

	/**
	 * Gets the scanned passport copy upload.
	 *
	 * @return the scanned passport copy upload
	 */
	public String getScannedPassportCopyUpload() {
		return scannedPassportCopyUpload;
	}

	/**
	 * Sets the scanned passport copy upload.
	 *
	 * @param scannedPassportCopyUpload the new scanned passport copy upload
	 */
	public void setScannedPassportCopyUpload(String scannedPassportCopyUpload) {
		this.scannedPassportCopyUpload = scannedPassportCopyUpload;
	}

	/**
	 * Gets the scanned id copy upload.
	 *
	 * @return the scanned id copy upload
	 */
	public String getScannedIdCopyUpload() {
		return scannedIdCopyUpload;
	}

	/**
	 * Sets the scanned id copy upload.
	 *
	 * @param scannedIdCopyUpload the new scanned id copy upload
	 */
	public void setScannedIdCopyUpload(String scannedIdCopyUpload) {
		this.scannedIdCopyUpload = scannedIdCopyUpload;
	}
	
	/**
	 * Gets the user name.
	 *
	 * @return the user name
	 */
	public String getUserName() {
		return userName;
	}
	
	/**
	 * Sets the user name.
	 *
	 * @param userName the new user name
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	/**
	 * Gets the user email.
	 *
	 * @return the user email
	 */
	public String getUserEmail() {
		return userEmail;
	}
	
	/**
	 * Sets the user email.
	 *
	 * @param userEmail the new user email
	 */
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	
	
	

	/**
	 * Gets the nationality.
	 *
	 * @return the nationality
	 */
	public String getNationality() {
		return nationality;
	}

	/**
	 * Sets the nationality.
	 *
	 * @param nationality the new nationality
	 */
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	/**
	 * Gets the id card number.
	 *
	 * @return the id card number
	 */
	public String getIdCardNumber() {
		return idCardNumber;
	}

	/**
	 * Sets the id card number.
	 *
	 * @param idCardNumber the new id card number
	 */
	public void setIdCardNumber(String idCardNumber) {
		this.idCardNumber = idCardNumber;
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

	public String getOldPasssword() {
		return oldPasssword;
	}

	public void setOldPasssword(String oldPasssword) {
		this.oldPasssword = oldPasssword;
	}

	public String getPasswordChangeDate() {
		return passwordChangeDate;
	}

	public void setPasswordChangeDate(String passwordChangeDate) {
		this.passwordChangeDate = passwordChangeDate;
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

	public Calendar getIdCardExpiryDate() {
		return idCardExpiryDate;
	}

	public void setIdCardExpiryDate(Calendar idCardExpiryDate) {
		this.idCardExpiryDate = idCardExpiryDate;
	}

	public Calendar getPassportExpiryDate() {
		return passportExpiryDate;
	}

	public void setPassportExpiryDate(Calendar passportExpiryDate) {
		this.passportExpiryDate = passportExpiryDate;
	}

	public String getPassportNumber() {
		return passportNumber;
	}

	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getUserCity() {
		return userCity;
	}

	public void setUserCity(String userCity) {
		this.userCity = userCity;
	}

	public String getClassifyYourself() {
		return classifyYourself;
	}

	public void setClassifyYourself(String classifyYourself) {
		this.classifyYourself = classifyYourself;
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

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public java.util.List<Chiraghproperty> getChiraghproperties() {
		return chiraghproperties;
	}

	public void setChiraghproperties(java.util.List<Chiraghproperty> chiraghproperties) {
		this.chiraghproperties = chiraghproperties;
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

	
		
}
