
package com.bestercapitalmedia.chiragh.buyer.details;

import java.io.Serializable;

import java.lang.StringBuilder;

import java.util.Set;

import javax.persistence.Id;

import javax.xml.bind.annotation.*;

import com.bestercapitalmedia.chiragh.property.Chiraghproperty;
import com.bestercapitalmedia.chiragh.user.Chiraghuser;

import javax.persistence.*;

/**
 */

@Entity

@Table(catalog = "chiraghdatabase", name = "propertybuyerdetails")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "TestEntities/com/bestercapitalmedia/chiragh", name = "Propertybuyerdetails")

public class Propertybuyerdetails implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 */

	@Column(name = "property_Buyer_Id", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@XmlElement
	Integer propertyBuyerId;
	/**
	 */

	@Column(name = "first_Name", length = 25)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String firstName;
	/**
	 */

	@Column(name = "middle_Name", length = 25)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String middleName;
	/**
	 */

	@Column(name = "last_Name", length = 25)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String lastName;
	/**
	 */

	@Column(name = "emmirates_Id_No", length = 25)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String emmiratesIdNo;
	/**
	 */

	@Column(name = "passport_No", length = 25)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String passportNo;
	/**
	 */

	@Column(name = "telephone", length = 25)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String telephone;
	/**
	 */

	@Column(name = "mobile", length = 25)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String mobile;
	/**
	 */

	@Column(name = "address", length = 25)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String address;
	/**
	 */

	@Column(name = "nationality", length = 25)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String nationality;
	/**
	 */

	@Column(name = "emirates_Id_Document_Upload", length = 25, nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String emiratesIdDocumentUpload;
	/**
	 */

	@Column(name = "poa_Clear_Deed_Upload", length = 25, nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String poaClearDeedUpload;
	/**
	 */

	@Column(name = "id_Card_No", length = 25, nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String idCardNo;
	/**
	 */

	@Column(name = "id_Card_Expiration", length = 45, nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String idCardExpiration;
	/**
	 */

	@Column(name = "passport_Id_Document_Upload", length = 45)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String passportIdDocumentUpload;
	/**
	 */

	@Column(name = "passport_Expiry_Date", length = 45)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String passportExpiryDate;
	/**
	 */

	@Column(name = "email", length = 45)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String email;
	/**
	 */

	@Column(name = "email_Verification_Code", length = 45)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String emailVerificationCode;
	/**
	 */

	@Column(name = "pobox", length = 45)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String pobox;
	/**
	 */

	@Column(name = "passport_Copy_Upload", length = 45)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String passportCopyUpload;
	/**
	 */

	@Column(name = "id_Copy_Upload", length = 45, nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String idCopyUpload;
	/**
	 */

	@Column(name = "owner_Type", length = 10)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String ownerType;
	/**
	 */

	@Column(name = "poa_Agreement_Expiry", length = 25, nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String poaAgreementExpiry;
	/**
	 */

	@Column(name = "poa_Property_Authority", length = 10, nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String poaPropertyAuthority;
	/**
	 */

	@Column(name = "title_Deed_Upload", length = 25, nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String titleDeedUpload;
	/**
	 */

	@Column(name = "scanned_Notorized_Copy", length = 25, nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String scannedNotorizedCopy;
	/**
	 */

	@Column(name = "is_Poa_Accepted")
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	Boolean isPoaAccepted;

	/**
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "user_Id", referencedColumnName = "user_Id") })
	@XmlTransient
	Chiraghuser chiraghuser;
	/**
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "property_Id", referencedColumnName = "property_Id") })
	@XmlTransient
	Chiraghproperty chiraghproperty;

	/**
	 */
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
	public void setEmiratesIdDocumentUpload(String emiratesIdDocumentUpload) {
		this.emiratesIdDocumentUpload = emiratesIdDocumentUpload;
	}

	/**
	 */
	public String getEmiratesIdDocumentUpload() {
		return this.emiratesIdDocumentUpload;
	}

	/**
	 */
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
	public Propertybuyerdetails() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(Propertybuyerdetails that) {
		setPropertyBuyerId(that.getPropertyBuyerId());
		setFirstName(that.getFirstName());
		setMiddleName(that.getMiddleName());
		setLastName(that.getLastName());
		setEmmiratesIdNo(that.getEmmiratesIdNo());
		setPassportNo(that.getPassportNo());
		setTelephone(that.getTelephone());
		setMobile(that.getMobile());
		setAddress(that.getAddress());
		setNationality(that.getNationality());
		setEmiratesIdDocumentUpload(that.getEmiratesIdDocumentUpload());
		setPoaClearDeedUpload(that.getPoaClearDeedUpload());
		setIdCardNo(that.getIdCardNo());
		setIdCardExpiration(that.getIdCardExpiration());
		setPassportIdDocumentUpload(that.getPassportIdDocumentUpload());
		setPassportExpiryDate(that.getPassportExpiryDate());
		setEmail(that.getEmail());
		setEmailVerificationCode(that.getEmailVerificationCode());
		setPobox(that.getPobox());
		setPassportCopyUpload(that.getPassportCopyUpload());
		setIdCopyUpload(that.getIdCopyUpload());
		setOwnerType(that.getOwnerType());
		setPoaAgreementExpiry(that.getPoaAgreementExpiry());
		setPoaPropertyAuthority(that.getPoaPropertyAuthority());
		setTitleDeedUpload(that.getTitleDeedUpload());
		setScannedNotorizedCopy(that.getScannedNotorizedCopy());
		setIsPoaAccepted(that.getIsPoaAccepted());
		setChiraghuser(that.getChiraghuser());
		setChiraghproperty(that.getChiraghproperty());
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("propertyBuyerId=[").append(propertyBuyerId).append("] ");
		buffer.append("firstName=[").append(firstName).append("] ");
		buffer.append("middleName=[").append(middleName).append("] ");
		buffer.append("lastName=[").append(lastName).append("] ");
		buffer.append("emmiratesIdNo=[").append(emmiratesIdNo).append("] ");
		buffer.append("passportNo=[").append(passportNo).append("] ");
		buffer.append("telephone=[").append(telephone).append("] ");
		buffer.append("mobile=[").append(mobile).append("] ");
		buffer.append("address=[").append(address).append("] ");
		buffer.append("nationality=[").append(nationality).append("] ");
		buffer.append("emiratesIdDocumentUpload=[").append(emiratesIdDocumentUpload).append("] ");
		buffer.append("poaClearDeedUpload=[").append(poaClearDeedUpload).append("] ");
		buffer.append("idCardNo=[").append(idCardNo).append("] ");
		buffer.append("idCardExpiration=[").append(idCardExpiration).append("] ");
		buffer.append("passportIdDocumentUpload=[").append(passportIdDocumentUpload).append("] ");
		buffer.append("passportExpiryDate=[").append(passportExpiryDate).append("] ");
		buffer.append("email=[").append(email).append("] ");
		buffer.append("emailVerificationCode=[").append(emailVerificationCode).append("] ");
		buffer.append("pobox=[").append(pobox).append("] ");
		buffer.append("passportCopyUpload=[").append(passportCopyUpload).append("] ");
		buffer.append("idCopyUpload=[").append(idCopyUpload).append("] ");
		buffer.append("ownerType=[").append(ownerType).append("] ");
		buffer.append("poaAgreementExpiry=[").append(poaAgreementExpiry).append("] ");
		buffer.append("poaPropertyAuthority=[").append(poaPropertyAuthority).append("] ");
		buffer.append("titleDeedUpload=[").append(titleDeedUpload).append("] ");
		buffer.append("scannedNotorizedCopy=[").append(scannedNotorizedCopy).append("] ");
		buffer.append("isPoaAccepted=[").append(isPoaAccepted).append("] ");

		return buffer.toString();
	}

	/**
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (int) (prime * result + ((propertyBuyerId == null) ? 0 : propertyBuyerId.hashCode()));
		return result;
	}

	/**
	 */
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof Propertybuyerdetails))
			return false;
		Propertybuyerdetails equalCheck = (Propertybuyerdetails) obj;
		if ((propertyBuyerId == null && equalCheck.propertyBuyerId != null) || (propertyBuyerId != null && equalCheck.propertyBuyerId == null))
			return false;
		if (propertyBuyerId != null && !propertyBuyerId.equals(equalCheck.propertyBuyerId))
			return false;
		return true;
	}
}
