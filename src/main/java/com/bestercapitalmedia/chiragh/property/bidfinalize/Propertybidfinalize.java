
package com.bestercapitalmedia.chiragh.property.bidfinalize;

import java.io.Serializable;

import java.lang.StringBuilder;

import java.util.Set;

import javax.persistence.Id;

import javax.xml.bind.annotation.*;

import com.bestercapitalmedia.chiragh.property.bidprocess.Propertybidprocess;
import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

/**
 */

@Entity
@Table(catalog = "chiraghdatabase", name = "propertybidfinalize")


public class Propertybidfinalize implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 */

	@Column(name = "bid_Finalize_Id", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	Integer bidFinalizeId;
	/**
	 */

	@Column(name = "brokerage_Mou_Document", length = 225)
	@Basic(fetch = FetchType.EAGER)

	
	String brokerageMouDocument;
	/**
	 */

	@Column(name = "is_Commission_Payment", length = 225)
	@Basic(fetch = FetchType.EAGER)

	
	String isCommissionPayment;
	/**
	 */

	@Column(name = "is_Final_Payment", length = 225)
	@Basic(fetch = FetchType.EAGER)

	
	String isFinalPayment;

	/**
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "bid_Id", referencedColumnName = "bid_Id") })
	@JsonBackReference
	Propertybidprocess propertybidprocess;

	/**
	 */
	public void setBidFinalizeId(Integer bidFinalizeId) {
		this.bidFinalizeId = bidFinalizeId;
	}

	/**
	 */
	public Integer getBidFinalizeId() {
		return this.bidFinalizeId;
	}

	/**
	 */
	public void setBrokerageMouDocument(String brokerageMouDocument) {
		this.brokerageMouDocument = brokerageMouDocument;
	}

	/**
	 */
	public String getBrokerageMouDocument() {
		return this.brokerageMouDocument;
	}

	/**
	 */
	public void setIsCommissionPayment(String isCommissionPayment) {
		this.isCommissionPayment = isCommissionPayment;
	}

	/**
	 */
	public String getIsCommissionPayment() {
		return this.isCommissionPayment;
	}

	/**
	 */
	public void setIsFinalPayment(String isFinalPayment) {
		this.isFinalPayment = isFinalPayment;
	}

	/**
	 */
	public String getIsFinalPayment() {
		return this.isFinalPayment;
	}

	/**
	 */
	public void setPropertybidprocess(Propertybidprocess propertybidprocess) {
		this.propertybidprocess = propertybidprocess;
	}

	/**
	 */
	public Propertybidprocess getPropertybidprocess() {
		return propertybidprocess;
	}

	/**
	 */
	public Propertybidfinalize() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
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
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("bidFinalizeId=[").append(bidFinalizeId).append("] ");
		buffer.append("brokerageMouDocument=[").append(brokerageMouDocument).append("] ");
		buffer.append("isCommissionPayment=[").append(isCommissionPayment).append("] ");
		buffer.append("isFinalPayment=[").append(isFinalPayment).append("] ");

		return buffer.toString();
	}

	/**
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (int) (prime * result + ((bidFinalizeId == null) ? 0 : bidFinalizeId.hashCode()));
		return result;
	}

	/**
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
