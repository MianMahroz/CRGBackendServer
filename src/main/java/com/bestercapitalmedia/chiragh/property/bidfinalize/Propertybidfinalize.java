
package com.bestercapitalmedia.chiragh.property.bidfinalize;

import java.io.Serializable;

import java.lang.StringBuilder;

import java.util.Set;

import javax.persistence.Id;



import com.bestercapitalmedia.chiragh.property.bidprocess.Propertybidprocess;
import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

// TODO: Auto-generated Javadoc
/**
 * The Class Propertybidfinalize.
 */

@Entity
@Table(catalog = "chiraghdatabase", name = "propertybidfinalize")


public class Propertybidfinalize implements Serializable {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The bid finalize id. */

	@Column(name = "bid_Finalize_Id", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	Integer bidFinalizeId;
	
	/** The brokerage mou document. */

	@Column(name = "brokerage_Mou_Document", length = 225)
	@Basic(fetch = FetchType.EAGER)

	
	String brokerageMouDocument;
	
	/** The is commission payment. */

	@Column(name = "is_Commission_Payment", length = 225)
	@Basic(fetch = FetchType.EAGER)

	
	String isCommissionPayment;
	
	/** The is final payment. */

	@Column(name = "is_Final_Payment", length = 225)
	@Basic(fetch = FetchType.EAGER)

	
	String isFinalPayment;

	/** The propertybidprocess. */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "bid_Id", referencedColumnName = "bid_Id") })
	@JsonBackReference
	Propertybidprocess propertybidprocess;

	/**
	 * Sets the bid finalize id.
	 *
	 * @param bidFinalizeId the new bid finalize id
	 */
	public void setBidFinalizeId(Integer bidFinalizeId) {
		this.bidFinalizeId = bidFinalizeId;
	}

	/**
	 * Gets the bid finalize id.
	 *
	 * @return the bid finalize id
	 */
	public Integer getBidFinalizeId() {
		return this.bidFinalizeId;
	}

	/**
	 * Sets the brokerage mou document.
	 *
	 * @param brokerageMouDocument the new brokerage mou document
	 */
	public void setBrokerageMouDocument(String brokerageMouDocument) {
		this.brokerageMouDocument = brokerageMouDocument;
	}

	/**
	 * Gets the brokerage mou document.
	 *
	 * @return the brokerage mou document
	 */
	public String getBrokerageMouDocument() {
		return this.brokerageMouDocument;
	}

	/**
	 * Sets the checks if is commission payment.
	 *
	 * @param isCommissionPayment the new checks if is commission payment
	 */
	public void setIsCommissionPayment(String isCommissionPayment) {
		this.isCommissionPayment = isCommissionPayment;
	}

	/**
	 * Gets the checks if is commission payment.
	 *
	 * @return the checks if is commission payment
	 */
	public String getIsCommissionPayment() {
		return this.isCommissionPayment;
	}

	/**
	 * Sets the checks if is final payment.
	 *
	 * @param isFinalPayment the new checks if is final payment
	 */
	public void setIsFinalPayment(String isFinalPayment) {
		this.isFinalPayment = isFinalPayment;
	}

	/**
	 * Gets the checks if is final payment.
	 *
	 * @return the checks if is final payment
	 */
	public String getIsFinalPayment() {
		return this.isFinalPayment;
	}

	/**
	 * Sets the propertybidprocess.
	 *
	 * @param propertybidprocess the new propertybidprocess
	 */
	public void setPropertybidprocess(Propertybidprocess propertybidprocess) {
		this.propertybidprocess = propertybidprocess;
	}

	/**
	 * Gets the propertybidprocess.
	 *
	 * @return the propertybidprocess
	 */
	public Propertybidprocess getPropertybidprocess() {
		return propertybidprocess;
	}

	/**
	 * Instantiates a new propertybidfinalize.
	 */
	public Propertybidfinalize() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 * @param that the that
	 */
	public void copy(Propertybidfinalize that) {
		setBidFinalizeId(that.getBidFinalizeId());
		setBrokerageMouDocument(that.getBrokerageMouDocument());
		setIsCommissionPayment(that.getIsCommissionPayment());
		setIsFinalPayment(that.getIsFinalPayment());
		setPropertybidprocess(that.getPropertybidprocess());
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 * @return the string
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("bidFinalizeId=[").append(bidFinalizeId).append("] ");
		buffer.append("brokerageMouDocument=[").append(brokerageMouDocument).append("] ");
		buffer.append("isCommissionPayment=[").append(isCommissionPayment).append("] ");
		buffer.append("isFinalPayment=[").append(isFinalPayment).append("] ");

		return buffer.toString();
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (int) (prime * result + ((bidFinalizeId == null) ? 0 : bidFinalizeId.hashCode()));
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof Propertybidfinalize))
			return false;
		Propertybidfinalize equalCheck = (Propertybidfinalize) obj;
		if ((bidFinalizeId == null && equalCheck.bidFinalizeId != null) || (bidFinalizeId != null && equalCheck.bidFinalizeId == null))
			return false;
		if (bidFinalizeId != null && !bidFinalizeId.equals(equalCheck.bidFinalizeId))
			return false;
		return true;
	}
}
