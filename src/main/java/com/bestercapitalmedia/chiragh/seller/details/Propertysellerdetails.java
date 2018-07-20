
package com.bestercapitalmedia.chiragh.seller.details;

import java.io.Serializable;

import java.lang.StringBuilder;

import java.util.Set;

import javax.persistence.Id;


import com.bestercapitalmedia.chiragh.property.Chiraghproperty;
import com.bestercapitalmedia.chiragh.user.Chiraghuser;
import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

// TODO: Auto-generated Javadoc
/**
 * The Class Propertysellerdetails.
 */

@Entity
@Table(catalog = "chiraghdatabase", name = "propertysellerdetails")

public class Propertysellerdetails implements Serializable {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The property seller id. */

	@Column(name = "property_Seller_Id", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	Integer propertySellerId;
	
	/** The first name. */

	@Column(name = "first_Name", length = 225)
	@Basic(fetch = FetchType.EAGER)

	String firstName;
	
	/** The middle name. */

	@Column(name = "middle_Name", length = 225)
	@Basic(fetch = FetchType.EAGER)

	String middleName;
	
	/** The last name. */

	@Column(name = "last_Name", length = 225)
	@Basic(fetch = FetchType.EAGER)

	String lastName;

	/** The passport no. */
	@Column(name = "passport_No", length = 225)
	@Basic(fetch = FetchType.EAGER)

	String passportNo;
	
	/** The telephone. */

	@Column(name = "telephone", length = 225)
	@Basic(fetch = FetchType.EAGER)
	String telephone;
	
	/** The mobile. */

	@Column(name = "mobile", length = 225)
	@Basic(fetch = FetchType.EAGER)

	String mobile;
	
	/** The address. */

	@Column(name = "address", length = 225)
	@Basic(fetch = FetchType.EAGER)

	String address;
	
	/** The nationality. */

	@Column(name = "nationality", length = 25, nullable = false)
	@Basic(fetch = FetchType.EAGER)

	String nationality;

	/** The fax. */
	@Column(name = "fax")
	String fax;
	
	/** The id card no. */

	@Column(name = "id_Card_No", length = 25, nullable = false)
	@Basic(fetch = FetchType.EAGER)

	String idCardNo;
	
	/** The passport id document upload. */

	@Column(name = "passport_Id_Document_Upload")
	@Basic(fetch = FetchType.EAGER)

	Integer passportIdDocumentUpload;
	
	/** The id card expiration. */

	@Column(name = "id_Card_Expiration", length = 25, nullable = false)
	@Basic(fetch = FetchType.EAGER)

	String idCardExpiration;
	
	/** The passport expiry date. */

	@Column(name = "passport_Expiry_Date", length = 25)
	@Basic(fetch = FetchType.EAGER)

	String passportExpiryDate;
	
	/** The email. */

	@Column(name = "email", length = 50, nullable = false)
	@Basic(fetch = FetchType.EAGER)

	String email;
	
	/** The email verification code. */

	@Column(name = "email_Verification_Code", length = 25, nullable = false)
	@Basic(fetch = FetchType.EAGER)

	String emailVerificationCode;
	
	/** The pobox. */

	@Column(name = "pobox", length = 25)
	@Basic(fetch = FetchType.EAGER)

	String pobox;
	
	/** The passport copy upload. */

	@Column(name = "passport_Copy_Upload", length = 50)
	@Basic(fetch = FetchType.EAGER)

	String passportCopyUpload;
	
	/** The scanned id copy. */

	@Column(name = "scanned_Id_Copy", length = 50, nullable = false)
	@Basic(fetch = FetchType.EAGER)

	String scannedIdCopy;
	
	/** The property document 1 upload. */

	@Column(name = "property_Document1_upload", length = 25, nullable = false)
	@Basic(fetch = FetchType.EAGER)

	String propertyDocument1Upload;
	
	/** The property document 2 upload. */

	@Column(name = "property_Document2_Upload", length = 25, nullable = false)
	@Basic(fetch = FetchType.EAGER)

	String propertyDocument2Upload;
	
	/** The property document 3 upload. */

	@Column(name = "property_Document3_Upload", length = 25, nullable = false)
	@Basic(fetch = FetchType.EAGER)

	String propertyDocument3Upload;
	
	/** The property document 4 upload. */

	@Column(name = "property_Document4_upload", length = 25, nullable = false)
	@Basic(fetch = FetchType.EAGER)

	String propertyDocument4Upload;
	
	/** The seller profilepic. */

	@Column(name = "seller_Profilepic", length = 25)
	@Basic(fetch = FetchType.EAGER)

	String sellerProfilepic;
	
	/** The owner type. */

	@Column(name = "owner_Type", length = 10)
	@Basic(fetch = FetchType.EAGER)

	String ownerType;
	
	/** The poa agreement expiry. */

	@Column(name = "poa_Agreement_Expiry", length = 25, nullable = false)
	@Basic(fetch = FetchType.EAGER)

	String poaAgreementExpiry;
	
	/** The specific property. */
	
	@Column(name = "specific_Property", length = 25, nullable = false)
	@Basic(fetch = FetchType.EAGER)

	String specificProperty;

	/** The poa property authority. */
	@Column(name = "poa_Property_Authority", length = 10, nullable = false)
	@Basic(fetch = FetchType.EAGER)

	String poaPropertyAuthority;
	
	/** The title deed upload. */

	@Column(name = "title_Deed_Upload", length = 25, nullable = false)
	@Basic(fetch = FetchType.EAGER)

	String titleDeedUpload;
	
	/** The scanned notorized copy. */

	@Column(name = "scanned_Notorized_Copy", length = 25, nullable = false)
	@Basic(fetch = FetchType.EAGER)

	String scannedNotorizedCopy;
	
	/** The is poa accepted. */

	@Column(name = "is_Poa_Accepted")
	@Basic(fetch = FetchType.EAGER)

	String isPoaAccepted;
	
	
	/** The poa number. */
	@Column(name = "poa_Number")
	String poaNumber;
	
	/** The is personal details verified. */
	@Column(name="is_Personal_Details_Verified")
	String isPersonalDetailsVerified;

	/** The chiraghuser. */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "user_Id", referencedColumnName = "user_Id") })
	@JsonBackReference
	Chiraghuser chiraghuser;
	
	/** The chiraghproperty. */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "property_Id", referencedColumnName = "property_Id") })
	@JsonBackReference
	Chiraghproperty chiraghproperty;

	/**
	 * Sets the property seller id.
	 *
	 * @param propertySellerId the new property seller id
	 */
	public void setPropertySellerId(Integer propertySellerId) {
		this.propertySellerId = propertySellerId;
	}

	/**
	 * Gets the property seller id.
	 *
	 * @return the property seller id
	 */
	public Integer getPropertySellerId() {
		return this.propertySellerId;
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
	 * Gets the first name.
	 *
	 * @return the first name
	 */
	public String getFirstName() {
		return this.firstName;
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
	 * Gets the middle name.
	 *
	 * @return the middle name
	 */
	public String getMiddleName() {
		return this.middleName;
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
	 * Gets the last name.
	 *
	 * @return the last name
	 */
	public String getLastName() {
		return this.lastName;
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
	 * Gets the passport no.
	 *
	 * @return the passport no
	 */
	public String getPassportNo() {
		return this.passportNo;
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
	 * Gets the telephone.
	 *
	 * @return the telephone
	 */
	public String getTelephone() {
		return this.telephone;
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
	 * Gets the mobile.
	 *
	 * @return the mobile
	 */
	public String getMobile() {
		return this.mobile;
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
	 * Gets the address.
	 *
	 * @return the address
	 */
	public String getAddress() {
		return this.address;
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
	 * Gets the nationality.
	 *
	 * @return the nationality
	 */
	public String getNationality() {
		return this.nationality;
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
	 * Gets the id card no.
	 *
	 * @return the id card no
	 */
	public String getIdCardNo() {
		return this.idCardNo;
	}

	/**
	 * Sets the passport id document upload.
	 *
	 * @param passportIdDocumentUpload the new passport id document upload
	 */
	public void setPassportIdDocumentUpload(Integer passportIdDocumentUpload) {
		this.passportIdDocumentUpload = passportIdDocumentUpload;
	}

	/**
	 * Gets the passport id document upload.
	 *
	 * @return the passport id document upload
	 */
	public Integer getPassportIdDocumentUpload() {
		return this.passportIdDocumentUpload;
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
	 * Gets the id card expiration.
	 *
	 * @return the id card expiration
	 */
	public String getIdCardExpiration() {
		return this.idCardExpiration;
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
	 * Gets the passport expiry date.
	 *
	 * @return the passport expiry date
	 */
	public String getPassportExpiryDate() {
		return this.passportExpiryDate;
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
	 * Gets the email.
	 *
	 * @return the email
	 */
	public String getEmail() {
		return this.email;
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
	 * Gets the email verification code.
	 *
	 * @return the email verification code
	 */
	public String getEmailVerificationCode() {
		return this.emailVerificationCode;
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
	 * Gets the pobox.
	 *
	 * @return the pobox
	 */
	public String getPobox() {
		return this.pobox;
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
	 * Gets the passport copy upload.
	 *
	 * @return the passport copy upload
	 */
	public String getPassportCopyUpload() {
		return this.passportCopyUpload;
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
	 * Gets the scanned id copy.
	 *
	 * @return the scanned id copy
	 */
	public String getScannedIdCopy() {
		return this.scannedIdCopy;
	}

	/**
	 * Sets the property document 1 upload.
	 *
	 * @param propertyDocument1Upload the new property document 1 upload
	 */
	public void setPropertyDocument1Upload(String propertyDocument1Upload) {
		this.propertyDocument1Upload = propertyDocument1Upload;
	}

	/**
	 * Gets the property document 1 upload.
	 *
	 * @return the property document 1 upload
	 */
	public String getPropertyDocument1Upload() {
		return this.propertyDocument1Upload;
	}

	/**
	 * Sets the property document 2 upload.
	 *
	 * @param propertyDocument2Upload the new property document 2 upload
	 */
	public void setPropertyDocument2Upload(String propertyDocument2Upload) {
		this.propertyDocument2Upload = propertyDocument2Upload;
	}

	/**
	 * Gets the property document 2 upload.
	 *
	 * @return the property document 2 upload
	 */
	public String getPropertyDocument2Upload() {
		return this.propertyDocument2Upload;
	}

	/**
	 * Sets the property document 3 upload.
	 *
	 * @param propertyDocument3Upload the new property document 3 upload
	 */
	public void setPropertyDocument3Upload(String propertyDocument3Upload) {
		this.propertyDocument3Upload = propertyDocument3Upload;
	}

	/**
	 * Gets the property document 3 upload.
	 *
	 * @return the property document 3 upload
	 */
	public String getPropertyDocument3Upload() {
		return this.propertyDocument3Upload;
	}

	/**
	 * Sets the property document 4 upload.
	 *
	 * @param propertyDocument4Upload the new property document 4 upload
	 */
	public void setPropertyDocument4Upload(String propertyDocument4Upload) {
		this.propertyDocument4Upload = propertyDocument4Upload;
	}

	/**
	 * Gets the property document 4 upload.
	 *
	 * @return the property document 4 upload
	 */
	public String getPropertyDocument4Upload() {
		return this.propertyDocument4Upload;
	}

	/**
	 * Sets the seller profilepic.
	 *
	 * @param sellerProfilepic the new seller profilepic
	 */
	public void setSellerProfilepic(String sellerProfilepic) {
		this.sellerProfilepic = sellerProfilepic;
	}

	/**
	 * Gets the seller profilepic.
	 *
	 * @return the seller profilepic
	 */
	public String getSellerProfilepic() {
		return this.sellerProfilepic;
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
	 * Gets the owner type.
	 *
	 * @return the owner type
	 */
	public String getOwnerType() {
		return this.ownerType;
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
	 * Gets the poa agreement expiry.
	 *
	 * @return the poa agreement expiry
	 */
	public String getPoaAgreementExpiry() {
		return this.poaAgreementExpiry;
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
	 * Gets the poa property authority.
	 *
	 * @return the poa property authority
	 */
	public String getPoaPropertyAuthority() {
		return this.poaPropertyAuthority;
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
	 * Gets the title deed upload.
	 *
	 * @return the title deed upload
	 */
	public String getTitleDeedUpload() {
		return this.titleDeedUpload;
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
	 * Gets the scanned notorized copy.
	 *
	 * @return the scanned notorized copy
	 */
	public String getScannedNotorizedCopy() {
		return this.scannedNotorizedCopy;
	}

	/**
	 * Sets the chiraghuser.
	 *
	 * @param chiraghuser the new chiraghuser
	 */

	/**
	 */
	public void setChiraghuser(Chiraghuser chiraghuser) {
		this.chiraghuser = chiraghuser;
	}

	/**
	 * Gets the chiraghuser.
	 *
	 * @return the chiraghuser
	 */
	public Chiraghuser getChiraghuser() {
		return chiraghuser;
	}

	/**
	 * Sets the chiraghproperty.
	 *
	 * @param chiraghproperty the new chiraghproperty
	 */
	public void setChiraghproperty(Chiraghproperty chiraghproperty) {
		this.chiraghproperty = chiraghproperty;
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
	 * Gets the chiraghproperty.
	 *
	 * @return the chiraghproperty
	 */
	public Chiraghproperty getChiraghproperty() {
		return chiraghproperty;
	}

	/**
	 * Instantiates a new propertysellerdetails.
	 */
	public Propertysellerdetails() {
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
