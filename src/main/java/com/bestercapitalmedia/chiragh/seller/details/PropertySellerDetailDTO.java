package com.bestercapitalmedia.chiragh.seller.details;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.FetchType;

import org.springframework.web.multipart.MultipartFile;

public class PropertySellerDetailDTO {
	Integer propertySellerId;
	String firstName;
	String middleName;
	String lastName;
	String passportNo;
	String telephone;
	String mobile;
	String address;
	String nationality;
	String idCardNo;
	String idCardExpiration;
	String passportExpiryDate;
	String email;
	String pobox;
	String passportCopyUpload;
	String scannedIdCopy;
	String propertyDocument1Upload;
	String propertyDocument2Upload;
	String propertyDocument3Upload;
	String propertyDocument4Upload;
	String sellerProfilepic;
	String ownerType;
	String poaAgreementExpiry;
	String poaPropertyAuthority;
	String titleDeedUpload;
	String scannedNotorizedCopy;

	public PropertySellerDetailDTO() {

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

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
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

	public String getPobox() {
		return pobox;
	}

	public void setPobox(String pobox) {
		this.pobox = pobox;
	}

	public String getPropertyDocument1Upload() {
		return propertyDocument1Upload;
	}

	public void setPropertyDocument1Upload(String propertyDocument1Upload) {
		this.propertyDocument1Upload = propertyDocument1Upload;
	}

	public String getPropertyDocument2Upload() {
		return propertyDocument2Upload;
	}

	public void setPropertyDocument2Upload(String propertyDocument2Upload) {
		this.propertyDocument2Upload = propertyDocument2Upload;
	}

	public String getPropertyDocument3Upload() {
		return propertyDocument3Upload;
	}

	public void setPropertyDocument3Upload(String propertyDocument3Upload) {
		this.propertyDocument3Upload = propertyDocument3Upload;
	}

	public String getPropertyDocument4Upload() {
		return propertyDocument4Upload;
	}

	public void setPropertyDocument4Upload(String propertyDocument4Upload) {
		this.propertyDocument4Upload = propertyDocument4Upload;
	}

	public String getSellerProfilepic() {
		return sellerProfilepic;
	}

	public void setSellerProfilepic(String sellerProfilepic) {
		this.sellerProfilepic = sellerProfilepic;
	}

	public String getOwnerType() {
		return ownerType;
	}

	public void setOwnerType(String ownerType) {
		this.ownerType = ownerType;
	}

	public String getPoaAgreementExpiry() {
		return poaAgreementExpiry;
	}

	public void setPoaAgreementExpiry(String poaAgreementExpiry) {
		this.poaAgreementExpiry = poaAgreementExpiry;
	}

	public String getPoaPropertyAuthority() {
		return poaPropertyAuthority;
	}

	public void setPoaPropertyAuthority(String poaPropertyAuthority) {
		this.poaPropertyAuthority = poaPropertyAuthority;
	}

	public String getTitleDeedUpload() {
		return titleDeedUpload;
	}

	public void setTitleDeedUpload(String titleDeedUpload) {
		this.titleDeedUpload = titleDeedUpload;
	}

	public String getScannedNotorizedCopy() {
		return scannedNotorizedCopy;
	}

	public void setScannedNotorizedCopy(String scannedNotorizedCopy) {
		this.scannedNotorizedCopy = scannedNotorizedCopy;
	}

	public Integer getPropertySellerId() {
		return propertySellerId;
	}

	public void setPropertySellerId(Integer propertySellerId) {
		this.propertySellerId = propertySellerId;
	}

	public String getPassportCopyUpload() {
		return passportCopyUpload;
	}

	public void setPassportCopyUpload(String passportCopyUpload) {
		this.passportCopyUpload = passportCopyUpload;
	}

	public String getScannedIdCopy() {
		return scannedIdCopy;
	}

	public void setScannedIdCopy(String scannedIdCopy) {
		this.scannedIdCopy = scannedIdCopy;
	}

	

}
