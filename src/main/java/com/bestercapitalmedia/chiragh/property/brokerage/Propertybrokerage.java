
package com.bestercapitalmedia.chiragh.property.brokerage;

import java.io.Serializable;

import java.lang.StringBuilder;

import java.util.Set;

import javax.xml.bind.annotation.*;

import com.bestercapitalmedia.chiragh.property.Chiraghproperty;
import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

/**
 */

@Entity
@Table(catalog = "chiraghdatabase", name = "propertybrokerage")
public class Propertybrokerage implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 */

	@Column(name = "property_Brokerage_Id", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Integer propertyBrokerageId;
	/**
	 */

	@Column(name = "price_Aggrement_Document", length = 225)
	@Basic(fetch = FetchType.EAGER)
	String priceAggrementDocument;
	/**
	 */

	@Column(name = "legal_Document", length = 225)
	@Basic(fetch = FetchType.EAGER)
	String legalDocument;
	/**
	 */

	@Column(name = "is_Approved")
	@Basic(fetch = FetchType.EAGER)

	
	Integer isApproved;
	/**
	 */

	@Column(name = "send_Verification_Code_Payment", length = 225)
	@Basic(fetch = FetchType.EAGER)

	
	String sendVerificationCodePayment;
	/**
	 */

	@Column(name = "is_Payment_made_Before_Listing")
	@Basic(fetch = FetchType.EAGER)

	
	Integer isPaymentMadeBeforeListing;

	/**
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "property_Id", referencedColumnName = "property_Id") })
	@JsonBackReference
	Chiraghproperty chiraghproperty;

	/**
	 */
	public void setPropertyBrokerageId(Integer propertyBrokerageId) {
		this.propertyBrokerageId = propertyBrokerageId;
	}

	/**
	 */
	public Integer getPropertyBrokerageId() {
		return this.propertyBrokerageId;
	}

	/**
	 */
	public void setPriceAggrementDocument(String priceAggrementDocument) {
		this.priceAggrementDocument = priceAggrementDocument;
	}

	/**
	 */
	public String getPriceAggrementDocument() {
		return this.priceAggrementDocument;
	}

	/**
	 */
	public void setLegalDocument(String legalDocument) {
		this.legalDocument = legalDocument;
	}

	/**
	 */
	public String getLegalDocument() {
		return this.legalDocument;
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
	public void setSendVerificationCodePayment(String sendVerificationCodePayment) {
		this.sendVerificationCodePayment = sendVerificationCodePayment;
	}

	/**
	 */
	public String getSendVerificationCodePayment() {
		return this.sendVerificationCodePayment;
	}

	/**
	 */
	public void setIsPaymentMadeBeforeListing(Integer isPaymentMadeBeforeListing) {
		this.isPaymentMadeBeforeListing = isPaymentMadeBeforeListing;
	}

	/**
	 */
	public Integer getIsPaymentMadeBeforeListing() {
		return this.isPaymentMadeBeforeListing;
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
	public Propertybrokerage() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(Propertybrokerage that) {
		setPropertyBrokerageId(that.getPropertyBrokerageId());
		setPriceAggrementDocument(that.getPriceAggrementDocument());
		setLegalDocument(that.getLegalDocument());
		setIsApproved(that.getIsApproved());
		setSendVerificationCodePayment(that.getSendVerificationCodePayment());
		setIsPaymentMadeBeforeListing(that.getIsPaymentMadeBeforeListing());
		setChiraghproperty(that.getChiraghproperty());
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("propertyBrokerageId=[").append(propertyBrokerageId).append("] ");
		buffer.append("priceAggrementDocument=[").append(priceAggrementDocument).append("] ");
		buffer.append("legalDocument=[").append(legalDocument).append("] ");
		buffer.append("isApproved=[").append(isApproved).append("] ");
		buffer.append("sendVerificationCodePayment=[").append(sendVerificationCodePayment).append("] ");
		buffer.append("isPaymentMadeBeforeListing=[").append(isPaymentMadeBeforeListing).append("] ");

		return buffer.toString();
	}

	/**
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (int) (prime * result + ((propertyBrokerageId == null) ? 0 : propertyBrokerageId.hashCode()));
		return result;
	}

	/**
	 */
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof Propertybrokerage))
			return false;
		Propertybrokerage equalCheck = (Propertybrokerage) obj;
		if ((propertyBrokerageId == null && equalCheck.propertyBrokerageId != null) || (propertyBrokerageId != null && equalCheck.propertyBrokerageId == null))
			return false;
		if (propertyBrokerageId != null && !propertyBrokerageId.equals(equalCheck.propertyBrokerageId))
			return false;
		return true;
	}
}
