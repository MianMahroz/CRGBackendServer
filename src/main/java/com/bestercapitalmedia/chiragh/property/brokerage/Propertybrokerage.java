
package com.bestercapitalmedia.chiragh.property.brokerage;

import java.io.Serializable;

import java.lang.StringBuilder;

import java.util.Set;



import com.bestercapitalmedia.chiragh.property.Chiraghproperty;
import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

// TODO: Auto-generated Javadoc
/**
 * The Class Propertybrokerage.
 */

@Entity
@Table(catalog = "chiraghdatabase", name = "propertybrokerage")
public class Propertybrokerage implements Serializable {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The property brokerage id. */

	@Column(name = "property_Brokerage_Id", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Integer propertyBrokerageId;
	
	/** The price aggrement document. */

	@Column(name = "price_Aggrement_Document", length = 225)
	@Basic(fetch = FetchType.EAGER)
	String priceAggrementDocument;
	
	/** The legal document. */

	@Column(name = "legal_Document", length = 225)
	@Basic(fetch = FetchType.EAGER)
	String legalDocument;
	
	/** The is approved. */

	@Column(name = "is_Approved")
	@Basic(fetch = FetchType.EAGER)

	
	Integer isApproved;
	
	/** The send verification code payment. */

	@Column(name = "send_Verification_Code_Payment", length = 225)
	@Basic(fetch = FetchType.EAGER)

	
	String sendVerificationCodePayment;
	
	/** The is payment made before listing. */

	@Column(name = "is_Payment_made_Before_Listing")
	@Basic(fetch = FetchType.EAGER)

	
	Integer isPaymentMadeBeforeListing;

	/** The chiraghproperty. */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "property_Id", referencedColumnName = "property_Id") })
	@JsonBackReference
	Chiraghproperty chiraghproperty;

	/**
	 * Sets the property brokerage id.
	 *
	 * @param propertyBrokerageId the new property brokerage id
	 */
	public void setPropertyBrokerageId(Integer propertyBrokerageId) {
		this.propertyBrokerageId = propertyBrokerageId;
	}

	/**
	 * Gets the property brokerage id.
	 *
	 * @return the property brokerage id
	 */
	public Integer getPropertyBrokerageId() {
		return this.propertyBrokerageId;
	}

	/**
	 * Sets the price aggrement document.
	 *
	 * @param priceAggrementDocument the new price aggrement document
	 */
	public void setPriceAggrementDocument(String priceAggrementDocument) {
		this.priceAggrementDocument = priceAggrementDocument;
	}

	/**
	 * Gets the price aggrement document.
	 *
	 * @return the price aggrement document
	 */
	public String getPriceAggrementDocument() {
		return this.priceAggrementDocument;
	}

	/**
	 * Sets the legal document.
	 *
	 * @param legalDocument the new legal document
	 */
	public void setLegalDocument(String legalDocument) {
		this.legalDocument = legalDocument;
	}

	/**
	 * Gets the legal document.
	 *
	 * @return the legal document
	 */
	public String getLegalDocument() {
		return this.legalDocument;
	}

	/**
	 * Sets the checks if is approved.
	 *
	 * @param isApproved the new checks if is approved
	 */
	public void setIsApproved(Integer isApproved) {
		this.isApproved = isApproved;
	}

	/**
	 * Gets the checks if is approved.
	 *
	 * @return the checks if is approved
	 */
	public Integer getIsApproved() {
		return this.isApproved;
	}

	/**
	 * Sets the send verification code payment.
	 *
	 * @param sendVerificationCodePayment the new send verification code payment
	 */
	public void setSendVerificationCodePayment(String sendVerificationCodePayment) {
		this.sendVerificationCodePayment = sendVerificationCodePayment;
	}

	/**
	 * Gets the send verification code payment.
	 *
	 * @return the send verification code payment
	 */
	public String getSendVerificationCodePayment() {
		return this.sendVerificationCodePayment;
	}

	/**
	 * Sets the checks if is payment made before listing.
	 *
	 * @param isPaymentMadeBeforeListing the new checks if is payment made before listing
	 */
	public void setIsPaymentMadeBeforeListing(Integer isPaymentMadeBeforeListing) {
		this.isPaymentMadeBeforeListing = isPaymentMadeBeforeListing;
	}

	/**
	 * Gets the checks if is payment made before listing.
	 *
	 * @return the checks if is payment made before listing
	 */
	public Integer getIsPaymentMadeBeforeListing() {
		return this.isPaymentMadeBeforeListing;
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
	 * Gets the chiraghproperty.
	 *
	 * @return the chiraghproperty
	 */
	public Chiraghproperty getChiraghproperty() {
		return chiraghproperty;
	}

	/**
	 * Instantiates a new propertybrokerage.
	 */
	public Propertybrokerage() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 * @param that the that
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
	 * @return the string
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

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (int) (prime * result + ((propertyBrokerageId == null) ? 0 : propertyBrokerageId.hashCode()));
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
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
