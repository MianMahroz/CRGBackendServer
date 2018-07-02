
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
	String idCardExpiryDate;
	
	
	/** The passport expiry date. */
	@Column(name = "passport_Expiry_Date")
	@Basic(fetch = FetchType.EAGER)
	String passportExpiryDate;
	
	
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

	/**
	 * Gets the id card expiry date.
	 *
	 * @return the id card expiry date
	 */
	public String getIdCardExpiryDate() {
		return idCardExpiryDate;
	}

	/**
	 * Sets the id card expiry date.
	 *
	 * @param idCardExpiryDate the new id card expiry date
	 */
	public void setIdCardExpiryDate(String idCardExpiryDate) {
		this.idCardExpiryDate = idCardExpiryDate;
	}

	/**
	 * Gets the passport expiry date.
	 *
	 * @return the passport expiry date
	 */
	public String getPassportExpiryDate() {
		return passportExpiryDate;
	}

	/**
	 * Sets the passport expiry date.
	 *
	 * @param passportExpiryDate the new passport expiry date
	 */
	public void setPassportExpiryDate(String passportExpiryDate) {
		this.passportExpiryDate = passportExpiryDate;
	}

	/**
	 * Gets the passport number.
	 *
	 * @return the passport number
	 */
	public String getPassportNumber() {
		return passportNumber;
	}

	/**
	 * Sets the passport number.
	 *
	 * @param passportNumber the new passport number
	 */
	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}

	/**
	 * Gets the phone number.
	 *
	 * @return the phone number
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * Sets the phone number.
	 *
	 * @param phoneNumber the new phone number
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/**
	 * Gets the fax.
	 *
	 * @return the fax
	 */
	public String getFax() {
		return fax;
	}

	/**
	 * Sets the fax.
	 *
	 * @param fax the new fax
	 */
	public void setFax(String fax) {
		this.fax = fax;
	}

	/**
	 * Gets the country.
	 *
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * Sets the country.
	 *
	 * @param country the new country
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * Gets the user city.
	 *
	 * @return the user city
	 */
	public String getUserCity() {
		return userCity;
	}

	/**
	 * Sets the user city.
	 *
	 * @param userCity the new user city
	 */
	public void setUserCity(String userCity) {
		this.userCity = userCity;
	}
	
	

	/**
	 * Gets the classify yourself.
	 *
	 * @return the classify yourself
	 */
	public String getClassifyYourself() {
		return classifyYourself;
	}

	/**
	 * Sets the classify yourself.
	 *
	 * @param classifyYourself the new classify yourself
	 */
	public void setClassifyYourself(String classifyYourself) {
		this.classifyYourself = classifyYourself;
	}

	/**
	 * Gets the user password.
	 *
	 * @return the user password
	 */
	public String getUserPassword() {
		return userPassword;
	}
	
	/**
	 * Sets the user password.
	 *
	 * @param userPassword the new user password
	 */
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	
	/**
	 * Gets the first name.
	 *
	 * @return the first name
	 */
	public String getFirstName() {
		return firstName;
	}
	
	/**
	 * Sets the first name.
	 *
	 * @param firstName the new first name
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	/**
	 * Gets the middle name.
	 *
	 * @return the middle name
	 */
	public String getMiddleName() {
		return middleName;
	}
	
	/**
	 * Sets the middle name.
	 *
	 * @param middleName the new middle name
	 */
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	
	/**
	 * Gets the last name.
	 *
	 * @return the last name
	 */
	public String getLastName() {
		return lastName;
	}
	
	/**
	 * Sets the last name.
	 *
	 * @param lastName the new last name
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	/**
	 * Gets the mobile no.
	 *
	 * @return the mobile no
	 */
	public String getMobileNo() {
		return mobileNo;
	}
	
	/**
	 * Sets the mobile no.
	 *
	 * @param mobileNo the new mobile no
	 */
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	
	/**
	 * Gets the street address.
	 *
	 * @return the street address
	 */
	public String getStreetAddress() {
		return streetAddress;
	}
	
	/**
	 * Sets the street address.
	 *
	 * @param streetAddress the new street address
	 */
	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}
	
	/**
	 * Gets the building address.
	 *
	 * @return the building address
	 */
	public String getBuildingAddress() {
		return buildingAddress;
	}
	
	/**
	 * Sets the building address.
	 *
	 * @param buildingAddress the new building address
	 */
	public void setBuildingAddress(String buildingAddress) {
		this.buildingAddress = buildingAddress;
	}
	
	/**
	 * Gets the email verification code.
	 *
	 * @return the email verification code
	 */
	public String getEmailVerificationCode() {
		return emailVerificationCode;
	}
	
	/**
	 * Sets the email verification code.
	 *
	 * @param emailVerificationCode the new email verification code
	 */
	public void setEmailVerificationCode(String emailVerificationCode) {
		this.emailVerificationCode = emailVerificationCode;
	}
	
	/**
	 * Gets the mobile otp code.
	 *
	 * @return the mobile otp code
	 */
	public String getMobileOtpCode() {
		return mobileOtpCode;
	}
	
	/**
	 * Sets the mobile otp code.
	 *
	 * @param mobileOtpCode the new mobile otp code
	 */
	public void setMobileOtpCode(String mobileOtpCode) {
		this.mobileOtpCode = mobileOtpCode;
	}
	
	/**
	 * Gets the password verification code.
	 *
	 * @return the password verification code
	 */
	public String getPasswordVerificationCode() {
		return passwordVerificationCode;
	}
	
	/**
	 * Sets the password verification code.
	 *
	 * @param passwordVerificationCode the new password verification code
	 */
	public void setPasswordVerificationCode(String passwordVerificationCode) {
		this.passwordVerificationCode = passwordVerificationCode;
	}
	
	/**
	 * Gets the otp code expiration.
	 *
	 * @return the otp code expiration
	 */
	public Calendar getOtpCodeExpiration() {
		return otpCodeExpiration;
	}
	
	/**
	 * Sets the otp code expiration.
	 *
	 * @param otpCodeExpiration the new otp code expiration
	 */
	public void setOtpCodeExpiration(Calendar otpCodeExpiration) {
		this.otpCodeExpiration = otpCodeExpiration;
	}
	
	/**
	 * Gets the profile pic upload.
	 *
	 * @return the profile pic upload
	 */
	public String getProfilePicUpload() {
		return profilePicUpload;
	}
	
	/**
	 * Sets the profile pic upload.
	 *
	 * @param profilePicUpload the new profile pic upload
	 */
	public void setProfilePicUpload(String profilePicUpload) {
		this.profilePicUpload = profilePicUpload;
	}
	
	/**
	 * Gets the role.
	 *
	 * @return the role
	 */
	public String getRole() {
		return role;
	}
	
	/**
	 * Sets the role.
	 *
	 * @param role the new role
	 */
	public void setRole(String role) {
		this.role = role;
	}
	
	/**
	 * Gets the city.
	 *
	 * @return the city
	 */
	public City getCity() {
		return city;
	}
	
	/**
	 * Sets the city.
	 *
	 * @param city the new city
	 */
	public void setCity(City city) {
		this.city = city;
	}

	/**
	 * Gets the token.
	 *
	 * @return the token
	 */
	public String getToken() {
		return token;
	}
	
	/**
	 * Sets the token.
	 *
	 * @param token the new token
	 */
	public void setToken(String token) {
		this.token = token;
	}
	
	/**
	 * Gets the serialversionuid.
	 *
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	/**
	 * Instantiates a new chiraghuser.
	 */
	public Chiraghuser() {
		
	}
	
	/**
	 * Gets the chiraghproperties.
	 *
	 * @return the chiraghproperties
	 */
	public java.util.List<Chiraghproperty> getChiraghproperties() {
		return chiraghproperties;
	}
	
	/**
	 * Sets the chiraghproperties.
	 *
	 * @param chiraghproperties the new chiraghproperties
	 */
	public void setChiraghproperties(java.util.List<Chiraghproperty> chiraghproperties) {
		this.chiraghproperties = chiraghproperties;
	}

		
}
