package com.bestercapitalmedia.chiragh.user;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

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
	private Calendar idCardExpiryDate;
	
	/** The passport expiry date. */
	private Calendar passportExpiryDate;
	
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
	private String oldPassword;
	private Calendar passwordChangeDate;
	
	/**
	 * Instantiates a new personal info DTO.
	 */
	public PersonalInfoDTO () {
		
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
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

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getMobileOtpCode() {
		return mobileOtpCode;
	}

	public void setMobileOtpCode(String mobileOtpCode) {
		this.mobileOtpCode = mobileOtpCode;
	}

	public Calendar getOtpCodeExpiration() {
		return otpCodeExpiration;
	}

	public void setOtpCodeExpiration(Calendar otpCodeExpiration) {
		this.otpCodeExpiration = otpCodeExpiration;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getIdCardNumber() {
		return idCardNumber;
	}

	public void setIdCardNumber(String idCardNumber) {
		this.idCardNumber = idCardNumber;
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

	public String getScannedPassportCopyUpload() {
		return scannedPassportCopyUpload;
	}

	public void setScannedPassportCopyUpload(String scannedPassportCopyUpload) {
		this.scannedPassportCopyUpload = scannedPassportCopyUpload;
	}

	public String getScannedIdCopyUpload() {
		return scannedIdCopyUpload;
	}

	public void setScannedIdCopyUpload(String scannedIdCopyUpload) {
		this.scannedIdCopyUpload = scannedIdCopyUpload;
	}

	public String getClassifyYourself() {
		return classifyYourself;
	}

	public void setClassifyYourself(String classifyYourself) {
		this.classifyYourself = classifyYourself;
	}

	public String getOldPassword() {
		return oldPassword;
	}

	public void setOldPassword(String oldPassword) {
		this.oldPassword = oldPassword;
	}

	public Calendar getPasswordChangeDate() {
		return passwordChangeDate;
	}

	public void setPasswordChangeDate(Calendar passwordChangeDate) {
		this.passwordChangeDate = passwordChangeDate;
	}
		
}
