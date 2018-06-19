
package com.bestercapitalmedia.chiragh.buyer.details;

import java.io.Serializable;

import java.lang.StringBuilder;

import java.util.Set;

import javax.persistence.Id;



import org.codehaus.jackson.annotate.JsonBackReference;

import com.bestercapitalmedia.chiragh.buyer.bidding.history.BuyerBiddingHistory;

import javax.persistence.*;

/**
 */

@Entity

@Table(catalog = "dbchiraghupdated", name = "propertybuyerdetails")
public class PropertyBuyerDetails implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 */

	@Column(name = "property_Buyer_Id", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@Id
	
	Integer propertyBuyerId;
	/**
	 */

	@Column(name = "first_Name", length = 25)
	@Basic(fetch = FetchType.EAGER)


	String firstName;
	/**
	 */

	@Column(name = "middle_Name", length = 25)
	@Basic(fetch = FetchType.EAGER)


	String middleName;
	/**
	 */

	@Column(name = "last_Name", length = 25)
	@Basic(fetch = FetchType.EAGER)

	
	String lastName;
	/**
	 */


	@Column(name = "passport_No", length = 25)
	@Basic(fetch = FetchType.EAGER)


	String passportNo;
	/**
	 */

	@Column(name = "telephone", length = 25)
	@Basic(fetch = FetchType.EAGER)


	String telephone;
	/**
	 */

	@Column(name = "mobile", length = 25)
	@Basic(fetch = FetchType.EAGER)

	
	String mobile;
	/**
	 */

	@Column(name = "address", length = 25)
	@Basic(fetch = FetchType.EAGER)


	String address;
	/**
	 */

	@Column(name = "nationality", length = 25)
	@Basic(fetch = FetchType.EAGER)

	String nationality;
	

	@Column(name = "poa_Clear_Deed_Upload", length = 25)
	@Basic(fetch = FetchType.EAGER)

	
	String poaClearDeedUpload;
	/**
	 */

	@Column(name = "id_Card_No", length = 25)
	@Basic(fetch = FetchType.EAGER)

	
	String idCardNo;
	/**
	 */

	@Column(name = "id_Card_Expiration", length = 45)
	@Basic(fetch = FetchType.EAGER)

	
	String idCardExpiration;
	/**
	 */

	@Column(name = "passport_Id_Document_Upload", length = 45)
	@Basic(fetch = FetchType.EAGER)


	String passportIdDocumentUpload;
	/**
	 */

	@Column(name = "passport_Expiry_Date", length = 45)
	@Basic(fetch = FetchType.EAGER)

	
	String passportExpiryDate;
	/**
	 */

	@Column(name = "email", length = 45)
	@Basic(fetch = FetchType.EAGER)

	
	String email;
	/**
	 */

	@Column(name = "email_Verification_Code", length = 45)
	@Basic(fetch = FetchType.EAGER)

	
	String emailVerificationCode;
	/**
	 */

	@Column(name = "pobox", length = 45)
	@Basic(fetch = FetchType.EAGER)

	
	String pobox;
	/**
	 */

	@Column(name = "passport_Copy_Upload", length = 45)
	@Basic(fetch = FetchType.EAGER)


	String passportCopyUpload;
	/**
	 */

	@Column(name = "id_Copy_Upload", length = 45)
	@Basic(fetch = FetchType.EAGER)


	String idCopyUpload;
	/**
	 */

	@Column(name = "owner_Type", length = 10)
	@Basic(fetch = FetchType.EAGER)


	String ownerType;
	/**
	 */

	@Column(name = "poa_Agreement_Expiry", length = 25)
	@Basic(fetch = FetchType.EAGER)


	String poaAgreementExpiry;
	/**
	 */

	@Column(name = "poa_Property_Authority", length = 10)
	@Basic(fetch = FetchType.EAGER)

	String poaPropertyAuthority;
	/**
	 */

	@Column(name = "title_Deed_Upload", length = 25)
	@Basic(fetch = FetchType.EAGER)

	String titleDeedUpload;
	/**
	 */

	@Column(name = "scanned_Notorized_Copy", length = 25)
	@Basic(fetch = FetchType.EAGER)


	String scannedNotorizedCopy;
	/**
	 */

	@Column(name = "is_Poa_Accepted")
	@Basic(fetch = FetchType.EAGER)

	Boolean isPoaAccepted;

	/**
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "buyer_Bidding_History_Id", referencedColumnName = "buyer_Bidding_History_Id") })
	@JsonBackReference
	BuyerBiddingHistory buyerbiddinghistory;

	public void setPropertyBuyerId(Integer propertyBuyerId) {
		this.propertyBuyerId = propertyBuyerId;
	}

	/**
	 */
	public Integer getPropertyBuyerId() {
		return this.propertyBuyerId;
	}

	/**
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 */
	public String getFirstName() {
		return this.firstName;
	}

	/**
	 */
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	/**
	 */
	public String getMiddleName() {
		return this.middleName;
	}

	/**
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 */
	public String getLastName() {
		return this.lastName;
	}


	public void setPassportNo(String passportNo) {
		this.passportNo = passportNo;
	}

	/**
	 */
	public String getPassportNo() {
		return this.passportNo;
	}

	/**
	 */
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	/**
	 */
	public String getTelephone() {
		return this.telephone;
	}

	/**
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	/**
	 */
	public String getMobile() {
		return this.mobile;
	}

	/**
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 */
	public String getAddress() {
		return this.address;
	}

	/**
	 */
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	/**
	 */
	public String getNationality() {
		return this.nationality;
	}
	public void setPoaClearDeedUpload(String poaClearDeedUpload) {
		this.poaClearDeedUpload = poaClearDeedUpload;
	}

	/**
	 */
	public String getPoaClearDeedUpload() {
		return this.poaClearDeedUpload;
	}

	/**
	 */
	public void setIdCardNo(String idCardNo) {
		this.idCardNo = idCardNo;
	}

	/**
	 */
	public String getIdCardNo() {
		return this.idCardNo;
	}

	/**
	 */
	public void setIdCardExpiration(String idCardExpiration) {
		this.idCardExpiration = idCardExpiration;
	}

	/**
	 */
	public String getIdCardExpiration() {
		return this.idCardExpiration;
	}

	/**
	 */
	public void setPassportIdDocumentUpload(String passportIdDocumentUpload) {
		this.passportIdDocumentUpload = passportIdDocumentUpload;
	}

	/**
	 */
	public String getPassportIdDocumentUpload() {
		return this.passportIdDocumentUpload;
	}

	/**
	 */
	public void setPassportExpiryDate(String passportExpiryDate) {
		this.passportExpiryDate = passportExpiryDate;
	}

	/**
	 */
	public String getPassportExpiryDate() {
		return this.passportExpiryDate;
	}

	/**
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 */
	public String getEmail() {
		return this.email;
	}

	/**
	 */
	public void setEmailVerificationCode(String emailVerificationCode) {
		this.emailVerificationCode = emailVerificationCode;
	}

	/**
	 */
	public String getEmailVerificationCode() {
		return this.emailVerificationCode;
	}

	/**
	 */
	public void setPobox(String pobox) {
		this.pobox = pobox;
	}

	/**
	 */
	public String getPobox() {
		return this.pobox;
	}

	/**
	 */
	public void setPassportCopyUpload(String passportCopyUpload) {
		this.passportCopyUpload = passportCopyUpload;
	}

	/**
	 */
	public String getPassportCopyUpload() {
		return this.passportCopyUpload;
	}

	/**
	 */
	public void setIdCopyUpload(String idCopyUpload) {
		this.idCopyUpload = idCopyUpload;
	}

	/**
	 */
	public String getIdCopyUpload() {
		return this.idCopyUpload;
	}

	/**
	 */
	public void setOwnerType(String ownerType) {
		this.ownerType = ownerType;
	}

	/**
	 */
	public String getOwnerType() {
		return this.ownerType;
	}

	/**
	 */
	public void setPoaAgreementExpiry(String poaAgreementExpiry) {
		this.poaAgreementExpiry = poaAgreementExpiry;
	}

	/**
	 */
	public String getPoaAgreementExpiry() {
		return this.poaAgreementExpiry;
	}

	/**
	 */
	public void setPoaPropertyAuthority(String poaPropertyAuthority) {
		this.poaPropertyAuthority = poaPropertyAuthority;
	}

	/**
	 */
	public String getPoaPropertyAuthority() {
		return this.poaPropertyAuthority;
	}

	/**
	 */
	public void setTitleDeedUpload(String titleDeedUpload) {
		this.titleDeedUpload = titleDeedUpload;
	}

	/**
	 */
	public String getTitleDeedUpload() {
		return this.titleDeedUpload;
	}

	/**
	 */
	public void setScannedNotorizedCopy(String scannedNotorizedCopy) {
		this.scannedNotorizedCopy = scannedNotorizedCopy;
	}

	/**
	 */
	public String getScannedNotorizedCopy() {
		return this.scannedNotorizedCopy;
	}

	/**
	 */
	public void setIsPoaAccepted(Boolean isPoaAccepted) {
		this.isPoaAccepted = isPoaAccepted;
	}

	/**
	 */
	public Boolean getIsPoaAccepted() {
		return this.isPoaAccepted;
	}

	/**
	 */
	public void setBuyerbiddinghistory(BuyerBiddingHistory buyerbiddinghistory) {
		this.buyerbiddinghistory = buyerbiddinghistory;
	}

	/**
	 */
	public BuyerBiddingHistory getBuyerbiddinghistory() {
		return buyerbiddinghistory;
	}

	
	public PropertyBuyerDetails() {
	}

	
}
