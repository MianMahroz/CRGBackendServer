
package com.bestercapitalmedia.chiragh.seller.details;

import java.io.Serializable;

import java.lang.StringBuilder;

import java.util.Set;

import javax.persistence.Id;

import javax.xml.bind.annotation.*;

import com.bestercapitalmedia.chiragh.property.Chiraghproperty;
import com.bestercapitalmedia.chiragh.user.Chiraghuser;
import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

/**
 */

@Entity
@Table(catalog = "chiraghdatabase", name = "propertysellerdetails")

public class Propertysellerdetails implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 */

	@Column(name = "property_Seller_Id", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	Integer propertySellerId;
	/**
	 */

	@Column(name = "first_Name", length = 225)
	@Basic(fetch = FetchType.EAGER)

	String firstName;
	/**
	 */

	@Column(name = "middle_Name", length = 225)
	@Basic(fetch = FetchType.EAGER)

	String middleName;
	/**
	 */

	@Column(name = "last_Name", length = 225)
	@Basic(fetch = FetchType.EAGER)

	String lastName;
	/**
	 */

	@Column(name = "emmirates_Id_No", length = 225)
	@Basic(fetch = FetchType.EAGER)

	String emmiratesIdNo;
	/**
	 */

	@Column(name = "passport_No", length = 225)
	@Basic(fetch = FetchType.EAGER)

	String passportNo;
	/**
	 */

	@Column(name = "telephone", length = 225)
	@Basic(fetch = FetchType.EAGER)
	String telephone;
	/**
	 */

	@Column(name = "mobile", length = 225)
	@Basic(fetch = FetchType.EAGER)

	String mobile;
	/**
	 */

	@Column(name = "address", length = 225)
	@Basic(fetch = FetchType.EAGER)

	String address;
	/**
	 */

	@Column(name = "emirates_Id_Document_Upload", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	Integer emiratesIdDocumentUpload;
	/**
	 */

	@Column(name = "poa_Clear_Deed_Upload")
	@Basic(fetch = FetchType.EAGER)

	Integer poaClearDeedUpload;
	/**
	 */

	@Column(name = "nationality", length = 25, nullable = false)
	@Basic(fetch = FetchType.EAGER)

	String nationality;
	/**
	 */

	@Column(name = "id_Card_No", length = 25, nullable = false)
	@Basic(fetch = FetchType.EAGER)

	String idCardNo;
	/**
	 */

	@Column(name = "passport_Id_Document_Upload")
	@Basic(fetch = FetchType.EAGER)

	Integer passportIdDocumentUpload;
	/**
	 */

	@Column(name = "id_Card_Expiration", length = 25, nullable = false)
	@Basic(fetch = FetchType.EAGER)

	String idCardExpiration;
	/**
	 */

	@Column(name = "passport_Expiry_Date", length = 25)
	@Basic(fetch = FetchType.EAGER)

	String passportExpiryDate;
	/**
	 */

	@Column(name = "email", length = 25, nullable = false)
	@Basic(fetch = FetchType.EAGER)

	String email;
	/**
	 */

	@Column(name = "email_Verification_Code", length = 25, nullable = false)
	@Basic(fetch = FetchType.EAGER)

	String emailVerificationCode;
	/**
	 */

	@Column(name = "pobox", length = 25)
	@Basic(fetch = FetchType.EAGER)

	String pobox;
	/**
	 */

	@Column(name = "passport_Copy_Upload", length = 50)
	@Basic(fetch = FetchType.EAGER)

	String passportCopyUpload;
	/**
	 */

	@Column(name = "scanned_Id_Copy", length = 50, nullable = false)
	@Basic(fetch = FetchType.EAGER)

	String scannedIdCopy;
	/**
	 */

	@Column(name = "property_Document1_upload", length = 25, nullable = false)
	@Basic(fetch = FetchType.EAGER)

	String propertyDocument1Upload;
	/**
	 */

	@Column(name = "property_Document2_Upload", length = 25, nullable = false)
	@Basic(fetch = FetchType.EAGER)

	String propertyDocument2Upload;
	/**
	 */

	@Column(name = "property_Document3_Upload", length = 25, nullable = false)
	@Basic(fetch = FetchType.EAGER)

	String propertyDocument3Upload;
	/**
	 */

	@Column(name = "property_Document4_upload", length = 25, nullable = false)
	@Basic(fetch = FetchType.EAGER)

	String propertyDocument4Upload;
	/**
	 */

	@Column(name = "seller_Profilepic", length = 25)
	@Basic(fetch = FetchType.EAGER)

	String sellerProfilepic;
	/**
	 */

	@Column(name = "owner_Type", length = 10)
	@Basic(fetch = FetchType.EAGER)

	String ownerType;
	/**
	 */

	@Column(name = "poa_Agreement_Expiry", length = 25, nullable = false)
	@Basic(fetch = FetchType.EAGER)

	String poaAgreementExpiry;
	/**
	 */

	@Column(name = "poa_Property_Authority", length = 10, nullable = false)
	@Basic(fetch = FetchType.EAGER)

	String poaPropertyAuthority;
	/**
	 */

	@Column(name = "title_Deed_Upload", length = 25, nullable = false)
	@Basic(fetch = FetchType.EAGER)

	String titleDeedUpload;
	/**
	 */

	@Column(name = "scanned_Notorized_Copy", length = 25, nullable = false)
	@Basic(fetch = FetchType.EAGER)

	String scannedNotorizedCopy;
	/**
	 */

	@Column(name = "is_Poa_Accepted")
	@Basic(fetch = FetchType.EAGER)

	int isPoaAccepted;

	/**
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "user_Id", referencedColumnName = "user_Id") })
	@JsonBackReference
	Chiraghuser chiraghuser;
	/**
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "property_Id", referencedColumnName = "property_Id") })
	@JsonBackReference
	Chiraghproperty chiraghproperty;

	/**
	 */
	public void setPropertySellerId(Integer propertySellerId) {
		this.propertySellerId = propertySellerId;
	}

	/**
	 */
	public Integer getPropertySellerId() {
		return this.propertySellerId;
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

	/**
	 */
	public void setEmmiratesIdNo(String emmiratesIdNo) {
		this.emmiratesIdNo = emmiratesIdNo;
	}

	/**
	 */
	public String getEmmiratesIdNo() {
		return this.emmiratesIdNo;
	}

	/**
	 */
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
	public void setEmiratesIdDocumentUpload(Integer emiratesIdDocumentUpload) {
		this.emiratesIdDocumentUpload = emiratesIdDocumentUpload;
	}

	/**
	 */
	public Integer getEmiratesIdDocumentUpload() {
		return this.emiratesIdDocumentUpload;
	}

	/**
	 */
	public void setPoaClearDeedUpload(Integer poaClearDeedUpload) {
		this.poaClearDeedUpload = poaClearDeedUpload;
	}

	/**
	 */
	public Integer getPoaClearDeedUpload() {
		return this.poaClearDeedUpload;
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
	public void setPassportIdDocumentUpload(Integer passportIdDocumentUpload) {
		this.passportIdDocumentUpload = passportIdDocumentUpload;
	}

	/**
	 */
	public Integer getPassportIdDocumentUpload() {
		return this.passportIdDocumentUpload;
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
	public void setScannedIdCopy(String scannedIdCopy) {
		this.scannedIdCopy = scannedIdCopy;
	}

	/**
	 */
	public String getScannedIdCopy() {
		return this.scannedIdCopy;
	}

	/**
	 */
	public void setPropertyDocument1Upload(String propertyDocument1Upload) {
		this.propertyDocument1Upload = propertyDocument1Upload;
	}

	/**
	 */
	public String getPropertyDocument1Upload() {
		return this.propertyDocument1Upload;
	}

	/**
	 */
	public void setPropertyDocument2Upload(String propertyDocument2Upload) {
		this.propertyDocument2Upload = propertyDocument2Upload;
	}

	/**
	 */
	public String getPropertyDocument2Upload() {
		return this.propertyDocument2Upload;
	}

	/**
	 */
	public void setPropertyDocument3Upload(String propertyDocument3Upload) {
		this.propertyDocument3Upload = propertyDocument3Upload;
	}

	/**
	 */
	public String getPropertyDocument3Upload() {
		return this.propertyDocument3Upload;
	}

	/**
	 */
	public void setPropertyDocument4Upload(String propertyDocument4Upload) {
		this.propertyDocument4Upload = propertyDocument4Upload;
	}

	/**
	 */
	public String getPropertyDocument4Upload() {
		return this.propertyDocument4Upload;
	}

	/**
	 */
	public void setSellerProfilepic(String sellerProfilepic) {
		this.sellerProfilepic = sellerProfilepic;
	}

	/**
	 */
	public String getSellerProfilepic() {
		return this.sellerProfilepic;
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
	public void setIsPoaAccepted(int isPoaAccepted) {
		this.isPoaAccepted = isPoaAccepted;
	}

	/**
	 */
	public int getIsPoaAccepted() {
		return this.isPoaAccepted;
	}

	/**
	 */
	public void setChiraghuser(Chiraghuser chiraghuser) {
		this.chiraghuser = chiraghuser;
	}

	/**
	 */
	public Chiraghuser getChiraghuser() {
		return chiraghuser;
	}

	/**
	 */
	public void setChiraghproperty(Chiraghproperty chiraghproperty) {
		this.chiraghproperty = chiraghproperty;
	}

	/**
	 */
	public Chiraghproperty getChiraghproperty() {
		return chiraghproperty;
	}

	/**
	 */
	public Propertysellerdetails() {
	}

}
