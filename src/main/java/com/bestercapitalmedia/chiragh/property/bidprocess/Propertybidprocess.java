
package com.bestercapitalmedia.chiragh.property.bidprocess;

import java.io.Serializable;

import java.lang.StringBuilder;

import java.math.BigDecimal;

import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.Id;

import javax.xml.bind.annotation.*;

import com.bestercapitalmedia.chiragh.property.Chiraghproperty;
import com.bestercapitalmedia.chiragh.property.bidfinalize.Propertybidfinalize;
import com.bestercapitalmedia.chiragh.user.Chiraghuser;
import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

/**
 */

@Entity
@Table(catalog = "chiraghdatabase", name = "propertybidprocess")
public class Propertybidprocess implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 */

	@Column(name = "bid_Id", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Integer bidId;
	/**
	 */

	@Column(name = "bid_Amount", precision = 12)
	@Basic(fetch = FetchType.EAGER)
    float bidAmount;

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
	@OneToMany(mappedBy = "propertybidprocess", fetch = FetchType.LAZY)
	java.util.Set<Propertybidfinalize> propertybidfinalizes;

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
	public void setBidAmount(float bidAmount) {
		this.bidAmount = bidAmount;
	}

	/**
	 */
	public float getBidAmount() {
		return this.bidAmount;
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
	public void setPropertybidfinalizes(Set<Propertybidfinalize> propertybidfinalizes) {
		this.propertybidfinalizes = propertybidfinalizes;
	}

	/**
	 */
	public Set<Propertybidfinalize> getPropertybidfinalizes() {
		if (propertybidfinalizes == null) {
			propertybidfinalizes = new java.util.LinkedHashSet<Propertybidfinalize>();
		}
		return propertybidfinalizes;
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
		setChiraghuser(that.getChiraghuser());
		setChiraghproperty(that.getChiraghproperty());
		setPropertybidfinalizes(new java.util.LinkedHashSet<Propertybidfinalize>(that.getPropertybidfinalizes()));
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
