package com.bestercapitalmedia.chiragh.user;

import java.io.Serializable;
import java.util.Calendar;

// TODO: Auto-generated Javadoc
/**
 * The Class PersonalInfoDTO.
 */
public class PersonalInfoDTO implements Serializable {

	
	/** The user id. */
	private int userId;
	
	/** The user name. */
	private String userName;
//	@Size(min=8,max=15)
/** The first name. */
//	@Pattern(regexp = "[a-zA-Z_.]*")
	private String firstName;

/** The middle name. */
//	@Pattern(regexp = "[a-zA-Z_.]*")
	private String middleName;
//	@Pattern(regexp = "[a-zA-Z_.]*")
/** The last name. */
//	@Size(min=8,max=15)
	private String lastName;
//	@Size(min=8,max=15)
/** The mobile no. */
//	@Pattern(regexp = "[0-9-+]*")
	private String mobileNo;

/** The street address. */
//  @Size(min=8,max=25)
	private String streetAddress;
	
	/** The user email. */
	private String userEmail;
//	@Size(min=4,max=8)
/** The mobile otp code. */
//	@Pattern(regexp = "[0-9]*")	BesterCapital2-
	private String mobileOtpCode;
	
	/** The otp code expiration. */
	private Calendar otpCodeExpiration;
	
	/** The nationality. */
	private String nationality;
	
	/** The id card number. */
	private String idCardNumber;
	
	/** The id card expiry date. */
	private String idCardExpiryDate;
	
	/** The passport expiry date. */
	private String passportExpiryDate;
	
	/** The passport number. */
	private String passportNumber;
	
	/** The phone number. */
	private String phoneNumber;
	
	/** The fax. */
	private String fax;
	
	/** The country. */
	private String country;
	
	/** The user city. */
	private String userCity;
	
	/** The scanned passport copy upload. */
	private String scannedPassportCopyUpload;
	
	/** The scanned id copy upload. */
	private String scannedIdCopyUpload;
	
	/** The classify yourself. */
	private String classifyYourself;
	
	/**
	 * Instantiates a new personal info DTO.
	 */
	public PersonalInfoDTO () {
		
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
	 * Gets the user id.
	 *
	 * @return the user id
	 */
	public int getUserId() {
		return userId;
	}

	/**
	 * Sets the user id.
	 *
	 * @param userId the new user id
	 */
	public void setUserId(int userId) {
		this.userId = userId;
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
	
	

	
}
