
package com.bestercapitalmedia.chiragh.propertybidfinalize;

import java.io.Serializable;

import java.lang.StringBuilder;

import javax.xml.bind.annotation.*;

import javax.persistence.*;

/**
 */

@Entity

@Table(catalog = "dbchiraghupdated", name = "propertybidfinalize")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "TestEntities/com/bestercapitalmedia/chiragh/domain", name = "Propertybidfinalize")

public class Propertybidfinalize implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 */

	@Column(name = "bid_Finalize_Id", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@XmlElement
	Integer bidFinalizeId;
	/**
	 */

	@Column(name = "bid_Id")
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	Integer bidId;
	/**
	 */

	@Column(name = "brokerage_Mou_Document", length = 225)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String brokerageMouDocument;
	/**
	 */

	@Column(name = "is_Commission_Payment", length = 225)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String isCommissionPayment;
	/**
	 */

	@Column(name = "is_Final_Payment", length = 225)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String isFinalPayment;
	/**
	 */

	@Column(name = "PropertyBidFinalizecol", length = 45)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String propertyBidFinalizecol;

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
	public void setBidId(Integer bidId) {
		this.bidId = bidId;
	}

	/**
	 */
	public Integer getBidId() {
		return this.bidId;
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
	public void setPropertyBidFinalizecol(String propertyBidFinalizecol) {
		this.propertyBidFinalizecol = propertyBidFinalizecol;
	}

	/**
	 */
	public String getPropertyBidFinalizecol() {
		return this.propertyBidFinalizecol;
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
		setBidId(that.getBidId());
		setBrokerageMouDocument(that.getBrokerageMouDocument());
		setIsCommissionPayment(that.getIsCommissionPayment());
		setIsFinalPayment(that.getIsFinalPayment());
		setPropertyBidFinalizecol(that.getPropertyBidFinalizecol());
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("bidFinalizeId=[").append(bidFinalizeId).append("] ");
		buffer.append("bidId=[").append(bidId).append("] ");
		buffer.append("brokerageMouDocument=[").append(brokerageMouDocument).append("] ");
		buffer.append("isCommissionPayment=[").append(isCommissionPayment).append("] ");
		buffer.append("isFinalPayment=[").append(isFinalPayment).append("] ");
		buffer.append("propertyBidFinalizecol=[").append(propertyBidFinalizecol).append("] ");

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
