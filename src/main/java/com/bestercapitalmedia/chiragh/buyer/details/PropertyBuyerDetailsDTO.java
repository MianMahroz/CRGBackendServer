package com.bestercapitalmedia.chiragh.buyer.details;


import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.bestercapitalmedia.chiragh.property.Chiraghproperty;
import com.bestercapitalmedia.chiragh.user.Chiraghuser;

public class PropertyBuyerDetailsDTO {
	
	
	//@Size(min=3,max=15)
	//@Pattern(regexp = "[a-zA-Z_.]*")
	private String firstName;
	//@Size(min=5,max=15)
	//@Pattern(regexp = "[a-zA-Z_.]*")
	private String middleName;
	//@Size(min=8,max=15)
	//@Pattern(regexp = "[a-zA-Z_.]*")
	private String lastName;
	//@Size(min=8,max=15)
	//@Pattern(regexp = "[0-9-+]*")
	private String mobile;
	//@Pattern(regexp = "[a-zA-Z0-9_.,#]*")
	//@Size(min=8,max=25)
	private String streetAddress;
	//@Size(min=8,max=25)
	//@Pattern(regexp = "[a-zA-Z0-9_.,#]*")
	private String buildingAddress;
	//@Size(min=8,max=25)
	private String passportNo;
	//@Size(min=8,max=25)
	private String telephone;
	//@Size(min=8,max=25)
	private String address;
	//@Size(min=8,max=25)
	private String nationality;
	//@Size(min=8,max=25)
	private String idCardNo;
	//@Size(min=8,max=25)
	private String idCardExpiration;
	//@Size(min=8,max=25)
	private String passportExpiryDate;
	//@Email
	//@NotEmpty
	//@NotEmpty
	private String email;
	//@Size(min=8,max=25)
	private String emailVerificationCode;
	//@Size(min=8,max=25)
	private String pobox;
	//@Size(min=8,max=25)
	private String passportCopyUpload;
	//@Size(min=8,max=25)
	private String idCopyUpload;
	//@Size(min=3,max=5)
	private String  ownerType;
	//@Size(min=8,max=25)
	private String poaPropertyAuthority;
	//@Size(min=8,max=25)
	//private String titleDeedUpload;
	//@Size(min=8,max=25)
	private String poaAgreementExpiry;
	//@Size(min=8,max=25)
	//private String poaClearDeedUpload;
	//@Size(min=8,max=25)
	private String scannedNotorizedCopy;
   //  @Size(min=1,max=1)
	private Integer isPoaAccepted;
	//@Size(min=8,max=25)
	//private String BidReferenceNo;
	private int propertyId;
	//Personal Details
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
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
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
	public String getPassportNo() {
		return passportNo;
	}
	public void setPassportNo(String passportNo) {
		this.passportNo = passportNo;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getIdCardNo() {
		return idCardNo;
	}
	public void setIdCardNo(String idCardNo) {
		this.idCardNo = idCardNo;
	}
	public String getIdCardExpiration() {
		return idCardExpiration;
	}
	public void setIdCardExpiration(String idCardExpiration) {
		this.idCardExpiration = idCardExpiration;
	}
	public String getPassportExpiryDate() {
		return passportExpiryDate;
	}
	public void setPassportExpiryDate(String passportExpiryDate) {
		this.passportExpiryDate = passportExpiryDate;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmailVerificationCode() {
		return emailVerificationCode;
	}
	public void setEmailVerificationCode(String emailVerificationCode) {
		this.emailVerificationCode = emailVerificationCode;
	}
	public String getPobox() {
		return pobox;
	}
	public void setPobox(String pobox) {
		this.pobox = pobox;
	}
	public String getPassportCopyUpload() {
		return passportCopyUpload;
	}
	public void setPassportCopyUpload(String passportCopyUpload) {
		this.passportCopyUpload = passportCopyUpload;
	}
	public String getIdCopyUpload() {
		return idCopyUpload;
	}
	public void setIdCopyUpload(String idCopyUpload) {
		this.idCopyUpload = idCopyUpload;
	}
	public String getOwnerType() {
		return ownerType;
	}
	public void setOwnerType(String ownerType) {
		this.ownerType = ownerType;
	}
	public String getPoaPropertyAuthority() {
		return poaPropertyAuthority;
	}
	public void setPoaPropertyAuthority(String poaPropertyAuthority) {
		this.poaPropertyAuthority = poaPropertyAuthority;
	}
	public String getPoaAgreementExpiry() {
		return poaAgreementExpiry;
	}
	public void setPoaAgreementExpiry(String poaAgreementExpiry) {
		this.poaAgreementExpiry = poaAgreementExpiry;
	}
	public String getScannedNotorizedCopy() {
		return scannedNotorizedCopy;
	}
	public void setScannedNotorizedCopy(String scannedNotorizedCopy) {
		this.scannedNotorizedCopy = scannedNotorizedCopy;
	}
	public Integer getIsPoaAccepted() {
		return isPoaAccepted;
	}
	public void setIsPoaAccepted(Integer isPoaAccepted) {
		this.isPoaAccepted = isPoaAccepted;
	}
	public int getPropertyId() {
		return propertyId;
	}
	public void setPropertyId(int propertyId) {
		this.propertyId = propertyId;
	}
	                              
	
}
