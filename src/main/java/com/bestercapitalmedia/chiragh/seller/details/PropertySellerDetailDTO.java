package com.bestercapitalmedia.chiragh.seller.details;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.FetchType;

import org.springframework.web.multipart.MultipartFile;

// TODO: Auto-generated Javadoc
/**
 * The Class PropertySellerDetailDTO.
 */
public class PropertySellerDetailDTO {
	
	/** The user name. */
	String userName;
	
	/** The property id. */
	int propertyId;
	
	/** The property seller id. */
	Integer propertySellerId;
	
	/** The first name. */
	String firstName;
	
	/** The middle name. */
	String middleName;
	
	/** The last name. */
	String lastName;
	
	/** The passport no. */
	String passportNo;
	
	/** The telephone. */
	String telephone;
	
	/** The mobile. */
	String mobile;
	
	/** The address. */
	String address;
	
	/** The nationality. */
	String nationality;
	
	/** The id card no. */
	String idCardNo;
	
	/** The id card expiration. */
	String idCardExpiration;
	
	/** The passport expiry date. */
	String passportExpiryDate;
	
	/** The email. */
	String email;
	
	/** The pobox. */
	String pobox;
	
	/** The passport copy upload. */
	String passportCopyUpload;
	
	/** The scanned id copy. */
	String scannedIdCopy;
//	String propertyDocument1Upload;
//	String propertyDocument2Upload;
//	String propertyDocument3Upload;
//	String propertyDocument4Upload;
/** The owner type. */
//	String sellerProfilepic;
	String ownerType;
	
	/** The poa agreement expiry. */
	String poaAgreementExpiry;
	
	/** The poa property authority. */
	String poaPropertyAuthority;
	
	/** The title deed upload. */
	String titleDeedUpload;
	
	/** The scanned notorized copy. */
	String scannedNotorizedCopy;
	
	/** The fax. */
	String fax;
	
	/** The poa number. */
	String poaNumber;
	
	/** The is poa accepted. */
	String isPoaAccepted;
	
	/** The specific property. */
	String specificProperty;
	
	/** The is personal details verified. */
	String isPersonalDetailsVerified;
	


	/**
	 * Instantiates a new property seller detail DTO.
	 */
	public PropertySellerDetailDTO() {

	}
	
	

	/**
	 * Gets the specific property.
	 *
	 * @return the specific property
	 */
	public String getSpecificProperty() {
		return specificProperty;
	}



	/**
	 * Sets the specific property.
	 *
	 * @param specificProperty the new specific property
	 */
	public void setSpecificProperty(String specificProperty) {
		this.specificProperty = specificProperty;
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
	 * Gets the scanned id copy.
	 *
	 * @return the scanned id copy
	 */
	public String getScannedIdCopy() {
		return scannedIdCopy;
	}

	/**
	 * Sets the scanned id copy.
	 *
	 * @param scannedIdCopy the new scanned id copy
	 */
	public void setScannedIdCopy(String scannedIdCopy) {
		this.scannedIdCopy = scannedIdCopy;
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

	/**
	 * Gets the property seller id.
	 *
	 * @return the property seller id
	 */
	public Integer getPropertySellerId() {
		return propertySellerId;
	}

	/**
	 * Sets the property seller id.
	 *
	 * @param propertySellerId the new property seller id
	 */
	public void setPropertySellerId(Integer propertySellerId) {
		this.propertySellerId = propertySellerId;
	}

	/**
	 * Gets the poa number.
	 *
	 * @return the poa number
	 */
	public String getPoaNumber() {
		return poaNumber;
	}

	/**
	 * Sets the poa number.
	 *
	 * @param poaNumber the new poa number
	 */
	public void setPoaNumber(String poaNumber) {
		this.poaNumber = poaNumber;
	}

	/**
	 * Gets the title deed upload.
	 *
	 * @return the title deed upload
	 */
	public String getTitleDeedUpload() {
		return titleDeedUpload;
	}

	/**
	 * Sets the title deed upload.
	 *
	 * @param titleDeedUpload the new title deed upload
	 */
	public void setTitleDeedUpload(String titleDeedUpload) {
		this.titleDeedUpload = titleDeedUpload;
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
	 * Gets the checks if is poa accepted.
	 *
	 * @return the checks if is poa accepted
	 */
	public String getIsPoaAccepted() {
		return isPoaAccepted;
	}

	/**
	 * Sets the checks if is poa accepted.
	 *
	 * @param isPoaAccepted the new checks if is poa accepted
	 */
	public void setIsPoaAccepted(String isPoaAccepted) {
		this.isPoaAccepted = isPoaAccepted;
	}



	/**
	 * Gets the checks if is personal details verified.
	 *
	 * @return the checks if is personal details verified
	 */
	public String getIsPersonalDetailsVerified() {
		return isPersonalDetailsVerified;
	}



	/**
	 * Sets the checks if is personal details verified.
	 *
	 * @param isPersonalDetailsVerified the new checks if is personal details verified
	 */
	public void setIsPersonalDetailsVerified(String isPersonalDetailsVerified) {
		this.isPersonalDetailsVerified = isPersonalDetailsVerified;
	}





	

}
