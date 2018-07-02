
package com.bestercapitalmedia.chiragh.buyer.details;

import java.io.Serializable;

import java.lang.StringBuilder;

import java.util.Set;

import javax.persistence.Id;



import org.codehaus.jackson.annotate.JsonBackReference;

import com.bestercapitalmedia.chiragh.buyer.bidding.history.BuyerBiddingHistory;

import javax.persistence.*;

// TODO: Auto-generated Javadoc
/**
 * The Class PropertyBuyerDetails.
 */

@Entity

@Table(catalog = "dbchiraghupdated", name = "propertybuyerdetails")
public class PropertyBuyerDetails implements Serializable {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The property buyer id. */

	@Column(name = "property_Buyer_Id", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@Id
	
	Integer propertyBuyerId;
	
	/** The first name. */

	@Column(name = "first_Name", length = 25)
	@Basic(fetch = FetchType.EAGER)


	String firstName;
	
	/** The middle name. */

	@Column(name = "middle_Name", length = 25)
	@Basic(fetch = FetchType.EAGER)


	String middleName;
	
	/** The last name. */

	@Column(name = "last_Name", length = 25)
	@Basic(fetch = FetchType.EAGER)

	
	String lastName;
	
	/** The passport no. */


	@Column(name = "passport_No", length = 25)
	@Basic(fetch = FetchType.EAGER)


	String passportNo;
	
	/** The telephone. */

	@Column(name = "telephone", length = 25)
	@Basic(fetch = FetchType.EAGER)


	String telephone;
	
	/** The mobile. */

	@Column(name = "mobile", length = 25)
	@Basic(fetch = FetchType.EAGER)

	
	String mobile;
	
	/** The address. */

	@Column(name = "address", length = 25)
	@Basic(fetch = FetchType.EAGER)


	String address;
	
	/** The nationality. */

	@Column(name = "nationality", length = 25)
	@Basic(fetch = FetchType.EAGER)

	String nationality;
	

	/** The poa clear deed upload. */
	@Column(name = "poa_Clear_Deed_Upload", length = 25)
	@Basic(fetch = FetchType.EAGER)

	
	String poaClearDeedUpload;
	
	/** The id card no. */

	@Column(name = "id_Card_No", length = 25)
	@Basic(fetch = FetchType.EAGER)

	
	String idCardNo;
	
	/** The id card expiration. */

	@Column(name = "id_Card_Expiration", length = 45)
	@Basic(fetch = FetchType.EAGER)

	
	String idCardExpiration;
	
	/** The passport id document upload. */

	@Column(name = "passport_Id_Document_Upload", length = 45)
	@Basic(fetch = FetchType.EAGER)


	String passportIdDocumentUpload;
	
	/** The passport expiry date. */

	@Column(name = "passport_Expiry_Date", length = 45)
	@Basic(fetch = FetchType.EAGER)

	
	String passportExpiryDate;
	
	/** The email. */

	@Column(name = "email", length = 45)
	@Basic(fetch = FetchType.EAGER)

	
	String email;
	
	/** The email verification code. */

	@Column(name = "email_Verification_Code", length = 45)
	@Basic(fetch = FetchType.EAGER)

	
	String emailVerificationCode;
	
	/** The pobox. */

	@Column(name = "pobox", length = 45)
	@Basic(fetch = FetchType.EAGER)

	
	String pobox;
	
	/** The passport copy upload. */

	@Column(name = "passport_Copy_Upload", length = 45)
	@Basic(fetch = FetchType.EAGER)


	String passportCopyUpload;
	
	/** The id copy upload. */

	@Column(name = "id_Copy_Upload", length = 45)
	@Basic(fetch = FetchType.EAGER)


	String idCopyUpload;
	
	/** The owner type. */

	@Column(name = "owner_Type", length = 10)
	@Basic(fetch = FetchType.EAGER)


	String ownerType;
	
	/** The poa agreement expiry. */

	@Column(name = "poa_Agreement_Expiry", length = 25)
	@Basic(fetch = FetchType.EAGER)


	String poaAgreementExpiry;
	
	/** The poa property authority. */

	@Column(name = "poa_Property_Authority", length = 10)
	@Basic(fetch = FetchType.EAGER)

	String poaPropertyAuthority;
	
	/** The title deed upload. */

	@Column(name = "title_Deed_Upload", length = 25)
	@Basic(fetch = FetchType.EAGER)

	String titleDeedUpload;
	
	/** The scanned notorized copy. */

	@Column(name = "scanned_Notorized_Copy", length = 25)
	@Basic(fetch = FetchType.EAGER)


	String scannedNotorizedCopy;
	
	/** The is poa accepted. */

	@Column(name = "is_Poa_Accepted")
	@Basic(fetch = FetchType.EAGER)

	Boolean isPoaAccepted;

	/** The buyerbiddinghistory. */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "buyer_Bidding_History_Id", referencedColumnName = "buyer_Bidding_History_Id") })
	@JsonBackReference
	BuyerBiddingHistory buyerbiddinghistory;

	/**
	 * Sets the property buyer id.
	 *
	 * @param propertyBuyerId the new property buyer id
	 */
	public void setPropertyBuyerId(Integer propertyBuyerId) {
		this.propertyBuyerId = propertyBuyerId;
	}

	/**
	 * Gets the property buyer id.
	 *
	 * @return the property buyer id
	 */
	public Integer getPropertyBuyerId() {
		return this.propertyBuyerId;
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
	 * Sets the poa clear deed upload.
	 *
	 * @param poaClearDeedUpload the new poa clear deed upload
	 */
	public void setPoaClearDeedUpload(String poaClearDeedUpload) {
		this.poaClearDeedUpload = poaClearDeedUpload;
	}

	/**
	 * Gets the poa clear deed upload.
	 *
	 * @return the poa clear deed upload
	 */
	public String getPoaClearDeedUpload() {
		return this.poaClearDeedUpload;
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
	 * Sets the passport id document upload.
	 *
	 * @param passportIdDocumentUpload the new passport id document upload
	 */
	public void setPassportIdDocumentUpload(String passportIdDocumentUpload) {
		this.passportIdDocumentUpload = passportIdDocumentUpload;
	}

	/**
	 * Gets the passport id document upload.
	 *
	 * @return the passport id document upload
	 */
	public String getPassportIdDocumentUpload() {
		return this.passportIdDocumentUpload;
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
	 * Sets the id copy upload.
	 *
	 * @param idCopyUpload the new id copy upload
	 */
	public void setIdCopyUpload(String idCopyUpload) {
		this.idCopyUpload = idCopyUpload;
	}

	/**
	 * Gets the id copy upload.
	 *
	 * @return the id copy upload
	 */
	public String getIdCopyUpload() {
		return this.idCopyUpload;
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
	 * Sets the checks if is poa accepted.
	 *
	 * @param isPoaAccepted the new checks if is poa accepted
	 */
	public void setIsPoaAccepted(Boolean isPoaAccepted) {
		this.isPoaAccepted = isPoaAccepted;
	}

	/**
	 * Gets the checks if is poa accepted.
	 *
	 * @return the checks if is poa accepted
	 */
	public Boolean getIsPoaAccepted() {
		return this.isPoaAccepted;
	}

	/**
	 * Sets the buyerbiddinghistory.
	 *
	 * @param buyerbiddinghistory the new buyerbiddinghistory
	 */
	public void setBuyerbiddinghistory(BuyerBiddingHistory buyerbiddinghistory) {
		this.buyerbiddinghistory = buyerbiddinghistory;
	}

	/**
	 * Gets the buyerbiddinghistory.
	 *
	 * @return the buyerbiddinghistory
	 */
	public BuyerBiddingHistory getBuyerbiddinghistory() {
		return buyerbiddinghistory;
	}

	
	/**
	 * Instantiates a new property buyer details.
	 */
	public PropertyBuyerDetails() {
	}

	
}
