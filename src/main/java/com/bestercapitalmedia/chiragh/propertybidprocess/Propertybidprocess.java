
package com.bestercapitalmedia.chiragh.propertybidprocess;

import java.io.Serializable;

import java.lang.StringBuilder;

import java.math.BigDecimal;

import java.util.Set;

import javax.xml.bind.annotation.*;

import com.bestercapitalmedia.chiragh.property.Chiraghproperty;
import com.bestercapitalmedia.chiragh.user.ChiraghUser;

import javax.persistence.*;

/**
 */

@Entity

@Table(catalog = "dbchiraghupdated", name = "propertybidprocess")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "TestEntities/com/bestercapitalmedia/chiragh/domain", name = "Propertybidprocess")

public class Propertybidprocess implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 */

	@Column(name = "bid_Id", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@XmlElement
	Integer bidId;
	/**
	 */

	@Column(name = "bid_Amount", precision = 12)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	BigDecimal bidAmount;

	/**
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "user_Id", referencedColumnName = "user_Id") })
	@XmlTransient
	ChiraghUser chiraghUser;
	/**
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "property_Id", referencedColumnName = "property_Id") })
	@XmlTransient
	Chiraghproperty chiraghproperty;

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
	public void setBidAmount(BigDecimal bidAmount) {
		this.bidAmount = bidAmount;
	}

	/**
	 */
	public BigDecimal getBidAmount() {
		return this.bidAmount;
	}

	/**
	 */
	public void setChiraghUser(ChiraghUser chiraghUser) {
		this.chiraghUser = chiraghUser;
	}

	/**
	 */
	public ChiraghUser getChiraghUser() {
		return chiraghUser;
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
	public Propertybidprocess() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(Propertybidprocess that) {
		setBidId(that.getBidId());
		setBidAmount(that.getBidAmount());
		setChiraghUser(that.getChiraghUser());
		setChiraghproperty(that.getChiraghproperty());
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("bidId=[").append(bidId).append("] ");
		buffer.append("bidAmount=[").append(bidAmount).append("] ");

		return buffer.toString();
	}

	/**
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (int) (prime * result + ((bidId == null) ? 0 : bidId.hashCode()));
		return result;
	}

	/**
	 */
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof Propertybidprocess))
			return false;
		Propertybidprocess equalCheck = (Propertybidprocess) obj;
		if ((bidId == null && equalCheck.bidId != null) || (bidId != null && equalCheck.bidId == null))
			return false;
		if (bidId != null && !bidId.equals(equalCheck.bidId))
			return false;
		return true;
	}
}
