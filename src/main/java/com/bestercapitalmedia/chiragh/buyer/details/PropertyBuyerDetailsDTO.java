package com.bestercapitalmedia.chiragh.buyer.details;


import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.bestercapitalmedia.chiragh.property.Chiraghproperty;
import com.bestercapitalmedia.chiragh.user.Chiraghuser;

// TODO: Auto-generated Javadoc
/**
 * The Class PropertyBuyerDetailsDTO.
 */
public class PropertyBuyerDetailsDTO {
	
	
	//@Size(min=3,max=15)
	/** The first name. */
	//@Pattern(regexp = "[a-zA-Z_.]*")
	private String firstName;
	//@Size(min=5,max=15)
	/** The middle name. */
	//@Pattern(regexp = "[a-zA-Z_.]*")
	private String middleName;
	//@Size(min=8,max=15)
	/** The last name. */
	//@Pattern(regexp = "[a-zA-Z_.]*")
	private String lastName;
	//@Size(min=8,max=15)
	/** The mobile. */
	//@Pattern(regexp = "[0-9-+]*")
	private String mobile;
	//@Pattern(regexp = "[a-zA-Z0-9_.,#]*")
	/** The street address. */
	//@Size(min=8,max=25)
	private String streetAddress;
	//@Size(min=8,max=25)
	/** The building address. */
	//@Pattern(regexp = "[a-zA-Z0-9_.,#]*")
	private String buildingAddress;
	
	/** The passport no. */
	//@Size(min=8,max=25)
	private String passportNo;
	
	/** The telephone. */
	//@Size(min=8,max=25)
	private String telephone;
	
	/** The address. */
	//@Size(min=8,max=25)
	private String address;
	
	/** The nationality. */
	//@Size(min=8,max=25)
	private String nationality;
	
	/** The id card no. */
	//@Size(min=8,max=25)
	private String idCardNo;
	
	/** The id card expiration. */
	//@Size(min=8,max=25)
	private String idCardExpiration;
	
	/** The passport expiry date. */
	//@Size(min=8,max=25)
	private String passportExpiryDate;
	//@Email
	//@NotEmpty
	/** The email. */
	//@NotEmpty
	private String email;
	
	/** The email verification code. */
	//@Size(min=8,max=25)
	private String emailVerificationCode;
	
	/** The pobox. */
	//@Size(min=8,max=25)
	private String pobox;
	
	/** The passport copy upload. */
	//@Size(min=8,max=25)
	private String passportCopyUpload;
	
	/** The id copy upload. */
	//@Size(min=8,max=25)
	private String idCopyUpload;
	
	/** The owner type. */
	//@Size(min=3,max=5)
	private String  ownerType;
	
	/** The poa property authority. */
	//@Size(min=8,max=25)
	private String poaPropertyAuthority;
	//@Size(min=8,max=25)
	//private String titleDeedUpload;
	/** The poa agreement expiry. */
	//@Size(min=8,max=25)
	private String poaAgreementExpiry;
	//@Size(min=8,max=25)
	//private String poaClearDeedUpload;
	/** The scanned notorized copy. */
	//@Size(min=8,max=25)
	private String scannedNotorizedCopy;
   
   /** The is poa accepted. */
   //  @Size(min=1,max=1)
	private Integer isPoaAccepted;
	//@Size(min=8,max=25)
	/** The property id. */
	//private String BidReferenceNo;
	private int propertyId;
	
	/**
	 * Gets the first name.
	 *
	 * @return the first name
	 */
	//Personal Details
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
	 * Gets the mobile.
	 *
	 * @return the mobile
	 */
	public String getMobile() {
		return mobile;
	}
	
	/**
	 * Sets the mobile.
	 *
	 * @param mobile the new mobile
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
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
	 * Gets the passport no.
	 *
	 * @return the passport no
	 */
	public String getPassportNo() {
		return passportNo;
	}
	
	/**
	 * Sets the passport no.
	 *
	 * @param passportNo the new passport no
	 */
	public void setPassportNo(String passportNo) {
		this.passportNo = passportNo;
	}
	
	/**
	 * Gets the telephone.
	 *
	 * @return the telephone
	 */
	public String getTelephone() {
		return telephone;
	}
	
	/**
	 * Sets the telephone.
	 *
	 * @param telephone the new telephone
	 */
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	
	/**
	 * Gets the address.
	 *
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	
	/**
	 * Sets the address.
	 *
	 * @param address the new address
	 */
	public void setAddress(String address) {
		this.address = address;
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
	 * Gets the id card no.
	 *
	 * @return the id card no
	 */
	public String getIdCardNo() {
		return idCardNo;
	}
	
	/**
	 * Sets the id card no.
	 *
	 * @param idCardNo the new id card no
	 */
	public void setIdCardNo(String idCardNo) {
		this.idCardNo = idCardNo;
	}
	
	/**
	 * Gets the id card expiration.
	 *
	 * @return the id card expiration
	 */
	public String getIdCardExpiration() {
		return idCardExpiration;
	}
	
	/**
	 * Sets the id card expiration.
	 *
	 * @param idCardExpiration the new id card expiration
	 */
	public void setIdCardExpiration(String idCardExpiration) {
		this.idCardExpiration = idCardExpiration;
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
	 * Gets the email.
	 *
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	
	/**
	 * Sets the email.
	 *
	 * @param email the new email
	 */
	public void setEmail(String email) {
		this.email = email;
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
	 * Gets the pobox.
	 *
	 * @return the pobox
	 */
	public String getPobox() {
		return pobox;
	}
	
	/**
	 * Sets the pobox.
	 *
	 * @param pobox the new pobox
	 */
	public void setPobox(String pobox) {
		this.pobox = pobox;
	}
	
	/**
	 * Gets the passport copy upload.
	 *
	 * @return the passport copy upload
	 */
	public String getPassportCopyUpload() {
		return passportCopyUpload;
	}
	
	/**
	 * Sets the passport copy upload.
	 *
	 * @param passportCopyUpload the new passport copy upload
	 */
	public void setPassportCopyUpload(String passportCopyUpload) {
		this.passportCopyUpload = passportCopyUpload;
	}
	
	/**
	 * Gets the id copy upload.
	 *
	 * @return the id copy upload
	 */
	public String getIdCopyUpload() {
		return idCopyUpload;
	}
	
	/**
	 * Sets the id copy upload.
	 *
	 * @param idCopyUpload the new id copy upload
	 */
	public void setIdCopyUpload(String idCopyUpload) {
		this.idCopyUpload = idCopyUpload;
	}
	
	/**
	 * Gets the owner type.
	 *
	 * @return the owner type
	 */
	public String getOwnerType() {
		return ownerType;
	}
	
	/**
	 * Sets the owner type.
	 *
	 * @param ownerType the new owner type
	 */
	public void setOwnerType(String ownerType) {
		this.ownerType = ownerType;
	}
	
	/**
	 * Gets the poa property authority.
	 *
	 * @return the poa property authority
	 */
	public String getPoaPropertyAuthority() {
		return poaPropertyAuthority;
	}
	
	/**
	 * Sets the poa property authority.
	 *
	 * @param poaPropertyAuthority the new poa property authority
	 */
	public void setPoaPropertyAuthority(String poaPropertyAuthority) {
		this.poaPropertyAuthority = poaPropertyAuthority;
	}
	
	/**
	 * Gets the poa agreement expiry.
	 *
	 * @return the poa agreement expiry
	 */
	public String getPoaAgreementExpiry() {
		return poaAgreementExpiry;
	}
	
	/**
	 * Sets the poa agreement expiry.
	 *
	 * @param poaAgreementExpiry the new poa agreement expiry
	 */
	public void setPoaAgreementExpiry(String poaAgreementExpiry) {
		this.poaAgreementExpiry = poaAgreementExpiry;
	}
	
	/**
	 * Gets the scanned notorized copy.
	 *
	 * @return the scanned notorized copy
	 */
	public String getScannedNotorizedCopy() {
		return scannedNotorizedCopy;
	}
	
	/**
	 * Sets the scanned notorized copy.
	 *
	 * @param scannedNotorizedCopy the new scanned notorized copy
	 */
	public void setScannedNotorizedCopy(String scannedNotorizedCopy) {
		this.scannedNotorizedCopy = scannedNotorizedCopy;
	}
	
	/**
	 * Gets the checks if is poa accepted.
	 *
	 * @return the checks if is poa accepted
	 */
	public Integer getIsPoaAccepted() {
		return isPoaAccepted;
	}
	
	/**
	 * Sets the checks if is poa accepted.
	 *
	 * @param isPoaAccepted the new checks if is poa accepted
	 */
	public void setIsPoaAccepted(Integer isPoaAccepted) {
		this.isPoaAccepted = isPoaAccepted;
	}
	
	/**
	 * Gets the property id.
	 *
	 * @return the property id
	 */
	public int getPropertyId() {
		return propertyId;
	}
	
	/**
	 * Sets the property id.
	 *
	 * @param propertyId the new property id
	 */
	public void setPropertyId(int propertyId) {
		this.propertyId = propertyId;
	}
	                              
	
}
