
package com.bestercapitalmedia.chiragh.propertyownerdetails;

import java.io.Serializable;

import java.lang.StringBuilder;

import javax.xml.bind.annotation.*;

import javax.persistence.*;

/**
 */

@Entity

@Table(catalog = "dbchiraghupdated", name = "propertyownerdetails")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "TestEntities/com/bestercapitalmedia/chiragh/domain", name = "Propertyownerdetails")

public class Propertyownerdetails implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 */

	@Column(name = "property_Owner_Id", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@XmlElement
	Integer propertyOwnerId;
	/**
	 */

	@Column(name = "property_Id")
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	Integer propertyId;
	/**
	 */

	@Column(name = "owner_Type", length = 225)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String ownerType;
	/**
	 */

	@Column(name = "first_Name", length = 225)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String firstName;
	/**
	 */

	@Column(name = "middle_Name", length = 225)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String middleName;
	/**
	 */

	@Column(name = "last_Name", length = 225)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String lastName;
	/**
	 */

	@Column(name = "emmirates_Id_No", length = 225)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String emmiratesIdNo;
	/**
	 */

	@Column(name = "passport_No", length = 225)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String passportNo;
	/**
	 */

	@Column(name = "telephone", length = 225)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String telephone;
	/**
	 */

	@Column(name = "mobile", length = 225)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String mobile;
	/**
	 */

	@Column(name = "address", length = 225)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String address;
	/**
	 */

	@Column(name = "emirates_Id_Document_Upload")
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	Integer emiratesIdDocumentUpload;
	/**
	 */

	@Column(name = "passport_Id_Document_Upload")
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	Integer passportIdDocumentUpload;
	/**
	 */

	@Column(name = "poa_Clear_Deed_Upload")
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	Integer poaClearDeedUpload;

	/**
	 */
	public void setPropertyOwnerId(Integer propertyOwnerId) {
		this.propertyOwnerId = propertyOwnerId;
	}

	/**
	 */
	public Integer getPropertyOwnerId() {
		return this.propertyOwnerId;
	}

	/**
	 */
	public void setPropertyId(Integer propertyId) {
		this.propertyId = propertyId;
	}

	/**
	 */
	public Integer getPropertyId() {
		return this.propertyId;
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
	public Propertyownerdetails() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(Propertyownerdetails that) {
		setPropertyOwnerId(that.getPropertyOwnerId());
		setPropertyId(that.getPropertyId());
		setOwnerType(that.getOwnerType());
		setFirstName(that.getFirstName());
		setMiddleName(that.getMiddleName());
		setLastName(that.getLastName());
		setEmmiratesIdNo(that.getEmmiratesIdNo());
		setPassportNo(that.getPassportNo());
		setTelephone(that.getTelephone());
		setMobile(that.getMobile());
		setAddress(that.getAddress());
		setEmiratesIdDocumentUpload(that.getEmiratesIdDocumentUpload());
		setPassportIdDocumentUpload(that.getPassportIdDocumentUpload());
		setPoaClearDeedUpload(that.getPoaClearDeedUpload());
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("propertyOwnerId=[").append(propertyOwnerId).append("] ");
		buffer.append("propertyId=[").append(propertyId).append("] ");
		buffer.append("ownerType=[").append(ownerType).append("] ");
		buffer.append("firstName=[").append(firstName).append("] ");
		buffer.append("middleName=[").append(middleName).append("] ");
		buffer.append("lastName=[").append(lastName).append("] ");
		buffer.append("emmiratesIdNo=[").append(emmiratesIdNo).append("] ");
		buffer.append("passportNo=[").append(passportNo).append("] ");
		buffer.append("telephone=[").append(telephone).append("] ");
		buffer.append("mobile=[").append(mobile).append("] ");
		buffer.append("address=[").append(address).append("] ");
		buffer.append("emiratesIdDocumentUpload=[").append(emiratesIdDocumentUpload).append("] ");
		buffer.append("passportIdDocumentUpload=[").append(passportIdDocumentUpload).append("] ");
		buffer.append("poaClearDeedUpload=[").append(poaClearDeedUpload).append("] ");

		return buffer.toString();
	}

	/**
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (int) (prime * result + ((propertyOwnerId == null) ? 0 : propertyOwnerId.hashCode()));
		return result;
	}

	/**
	 */
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof Propertyownerdetails))
			return false;
		Propertyownerdetails equalCheck = (Propertyownerdetails) obj;
		if ((propertyOwnerId == null && equalCheck.propertyOwnerId != null) || (propertyOwnerId != null && equalCheck.propertyOwnerId == null))
			return false;
		if (propertyOwnerId != null && !propertyOwnerId.equals(equalCheck.propertyOwnerId))
			return false;
		return true;
	}
}
