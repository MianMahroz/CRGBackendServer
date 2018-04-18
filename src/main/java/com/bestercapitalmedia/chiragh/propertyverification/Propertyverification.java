
package com.bestercapitalmedia.chiragh.propertyverification;

import java.io.Serializable;

import java.lang.StringBuilder;

import java.util.Set;

import javax.xml.bind.annotation.*;

import com.bestercapitalmedia.chiragh.property.Chiraghproperty;

import javax.persistence.*;

/**
 */

@Entity

@Table(catalog = "dbchiraghupdated", name = "propertyverification")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "TestEntities/com/bestercapitalmedia/chiragh/domain", name = "Propertyverification")

public class Propertyverification implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 */

	@Column(name = "property_Verification_Id", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@XmlElement
	Integer propertyVerificationId;
	/**
	 */

	@Column(name = "third_Party_Verification")
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	Integer thirdPartyVerification;
	/**
	 */

	@Column(name = "passport_Copy", length = 225)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String passportCopy;
	/**
	 */

	@Column(name = "uae_Id_Copy", length = 225)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String uaeIdCopy;
	/**
	 */

	@Column(name = "clear_Title_Deed", length = 225)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String clearTitleDeed;
	/**
	 */

	@Column(name = "clear_Nolorized_Poa", length = 225)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String clearNolorizedPoa;
	/**
	 */

	@Column(name = "is_Approved")
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	Integer isApproved;
	/**
	 */

	@Column(name = "is_Third_Party_Payment")
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	Integer isThirdPartyPayment;

	/**
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "property_Id", referencedColumnName = "property_Id") })
	@XmlTransient
	Chiraghproperty chiraghproperty;

	/**
	 */
	public void setPropertyVerificationId(Integer propertyVerificationId) {
		this.propertyVerificationId = propertyVerificationId;
	}

	/**
	 */
	public Integer getPropertyVerificationId() {
		return this.propertyVerificationId;
	}

	/**
	 */
	public void setThirdPartyVerification(Integer thirdPartyVerification) {
		this.thirdPartyVerification = thirdPartyVerification;
	}

	/**
	 */
	public Integer getThirdPartyVerification() {
		return this.thirdPartyVerification;
	}

	/**
	 */
	public void setPassportCopy(String passportCopy) {
		this.passportCopy = passportCopy;
	}

	/**
	 */
	public String getPassportCopy() {
		return this.passportCopy;
	}

	/**
	 */
	public void setUaeIdCopy(String uaeIdCopy) {
		this.uaeIdCopy = uaeIdCopy;
	}

	/**
	 */
	public String getUaeIdCopy() {
		return this.uaeIdCopy;
	}

	/**
	 */
	public void setClearTitleDeed(String clearTitleDeed) {
		this.clearTitleDeed = clearTitleDeed;
	}

	/**
	 */
	public String getClearTitleDeed() {
		return this.clearTitleDeed;
	}

	/**
	 */
	public void setClearNolorizedPoa(String clearNolorizedPoa) {
		this.clearNolorizedPoa = clearNolorizedPoa;
	}

	/**
	 */
	public String getClearNolorizedPoa() {
		return this.clearNolorizedPoa;
	}

	/**
	 */
	public void setIsApproved(Integer isApproved) {
		this.isApproved = isApproved;
	}

	/**
	 */
	public Integer getIsApproved() {
		return this.isApproved;
	}

	/**
	 */
	public void setIsThirdPartyPayment(Integer isThirdPartyPayment) {
		this.isThirdPartyPayment = isThirdPartyPayment;
	}

	/**
	 */
	public Integer getIsThirdPartyPayment() {
		return this.isThirdPartyPayment;
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
	public Propertyverification() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(Propertyverification that) {
		setPropertyVerificationId(that.getPropertyVerificationId());
		setThirdPartyVerification(that.getThirdPartyVerification());
		setPassportCopy(that.getPassportCopy());
		setUaeIdCopy(that.getUaeIdCopy());
		setClearTitleDeed(that.getClearTitleDeed());
		setClearNolorizedPoa(that.getClearNolorizedPoa());
		setIsApproved(that.getIsApproved());
		setIsThirdPartyPayment(that.getIsThirdPartyPayment());
		setChiraghproperty(that.getChiraghproperty());
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("propertyVerificationId=[").append(propertyVerificationId).append("] ");
		buffer.append("thirdPartyVerification=[").append(thirdPartyVerification).append("] ");
		buffer.append("passportCopy=[").append(passportCopy).append("] ");
		buffer.append("uaeIdCopy=[").append(uaeIdCopy).append("] ");
		buffer.append("clearTitleDeed=[").append(clearTitleDeed).append("] ");
		buffer.append("clearNolorizedPoa=[").append(clearNolorizedPoa).append("] ");
		buffer.append("isApproved=[").append(isApproved).append("] ");
		buffer.append("isThirdPartyPayment=[").append(isThirdPartyPayment).append("] ");

		return buffer.toString();
	}

	/**
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (int) (prime * result + ((propertyVerificationId == null) ? 0 : propertyVerificationId.hashCode()));
		return result;
	}

	/**
	 */
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof Propertyverification))
			return false;
		Propertyverification equalCheck = (Propertyverification) obj;
		if ((propertyVerificationId == null && equalCheck.propertyVerificationId != null) || (propertyVerificationId != null && equalCheck.propertyVerificationId == null))
			return false;
		if (propertyVerificationId != null && !propertyVerificationId.equals(equalCheck.propertyVerificationId))
			return false;
		return true;
	}
}
