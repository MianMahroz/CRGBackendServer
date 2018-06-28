package com.bestercapitalmedia.chiragh.user;

import java.io.Serializable;
import java.util.Calendar;

public class PersonalInfoDTO implements Serializable {

	
	private int userId;
	private String userName;
//	@Size(min=8,max=15)
//	@Pattern(regexp = "[a-zA-Z_.]*")
	private String firstName;
//	@Pattern(regexp = "[a-zA-Z_.]*")
	private String middleName;
//	@Pattern(regexp = "[a-zA-Z_.]*")
//	@Size(min=8,max=15)
	private String lastName;
//	@Size(min=8,max=15)
//	@Pattern(regexp = "[0-9-+]*")
	private String mobileNo;
//  @Size(min=8,max=25)
	private String streetAddress;
	private String userEmail;
//	@Size(min=4,max=8)
//	@Pattern(regexp = "[0-9]*")	BesterCapital2-
	private String mobileOtpCode;
	private Calendar otpCodeExpiration;
	private String nationality;
	private String idCardNumber;
	private String idCardExpiryDate;
	private String passportExpiryDate;
	private String passportNumber;
	private String phoneNumber;
	private String fax;
	private String country;
	private String userCity;
	private String scannedPassportCopyUpload;
	private String scannedIdCopyUpload;
	private String classifyYourself;
	
	public PersonalInfoDTO () {
		
	}
	
	

	public String getUserName() {
		return userName;
	}




	public void setUserName(String userName) {
		this.userName = userName;
	}




	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
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

	public String getIdCardExpiryDate() {
		return idCardExpiryDate;
	}

	public void setIdCardExpiryDate(String idCardExpiryDate) {
		this.idCardExpiryDate = idCardExpiryDate;
	}

	public String getPassportExpiryDate() {
		return passportExpiryDate;
	}

	public void setPassportExpiryDate(String passportExpiryDate) {
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
	
	

	
}
