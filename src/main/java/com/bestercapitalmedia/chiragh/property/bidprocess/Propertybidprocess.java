
package com.bestercapitalmedia.chiragh.property.bidprocess;

import java.io.Serializable;

import java.lang.StringBuilder;

import java.math.BigDecimal;

import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.Id;



import com.bestercapitalmedia.chiragh.property.Chiraghproperty;
import com.bestercapitalmedia.chiragh.property.bidfinalize.Propertybidfinalize;
import com.bestercapitalmedia.chiragh.user.Chiraghuser;
import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

// TODO: Auto-generated Javadoc
/**
 * The Class Propertybidprocess.
 */

@Entity
@Table(catalog = "chiraghdatabase", name = "propertybidprocess")
public class Propertybidprocess implements Serializable {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The bid id. */

	@Column(name = "bid_Id", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Integer bidId;
	
	/** The bid amount. */

	@Column(name = "bid_Amount", precision = 12)
	@Basic(fetch = FetchType.EAGER)
    float bidAmount;

	/** The chiraghuser. */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "user_Id", referencedColumnName = "user_Id") })
	@JsonBackReference
	Chiraghuser chiraghuser;
	
	/** The chiraghproperty. */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "property_Id", referencedColumnName = "property_Id") })
	@JsonBackReference
	Chiraghproperty chiraghproperty;
	
	/** The propertybidfinalizes. */
	@OneToMany(mappedBy = "propertybidprocess", fetch = FetchType.LAZY)
	java.util.Set<Propertybidfinalize> propertybidfinalizes;

	/**
	 * Sets the bid id.
	 *
	 * @param bidId the new bid id
	 */
	public void setBidId(Integer bidId) {
		this.bidId = bidId;
	}

	/**
	 * Gets the bid id.
	 *
	 * @return the bid id
	 */
	public Integer getBidId() {
		return this.bidId;
	}

	/**
	 * Sets the bid amount.
	 *
	 * @param bidAmount the new bid amount
	 */
	public void setBidAmount(float bidAmount) {
		this.bidAmount = bidAmount;
	}

	/**
	 * Gets the bid amount.
	 *
	 * @return the bid amount
	 */
	public float getBidAmount() {
		return this.bidAmount;
	}

	/**
	 * Sets the chiraghuser.
	 *
	 * @param chiraghuser the new chiraghuser
	 */
	public void setChiraghuser(Chiraghuser chiraghuser) {
		this.chiraghuser = chiraghuser;
	}

	/**
	 * Gets the chiraghuser.
	 *
	 * @return the chiraghuser
	 */
	public Chiraghuser getChiraghuser() {
		return chiraghuser;
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
	 * Sets the propertybidfinalizes.
	 *
	 * @param propertybidfinalizes the new propertybidfinalizes
	 */
	public void setPropertybidfinalizes(Set<Propertybidfinalize> propertybidfinalizes) {
		this.propertybidfinalizes = propertybidfinalizes;
	}

	/**
	 * Gets the propertybidfinalizes.
	 *
	 * @return the propertybidfinalizes
	 */
	public Set<Propertybidfinalize> getPropertybidfinalizes() {
		if (propertybidfinalizes == null) {
			propertybidfinalizes = new java.util.LinkedHashSet<Propertybidfinalize>();
		}
		return propertybidfinalizes;
	}

	/**
	 * Instantiates a new propertybidprocess.
	 */
	public Propertybidprocess() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 * @param that the that
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
	 * @return the string
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("bidId=[").append(bidId).append("] ");
		buffer.append("bidAmount=[").append(bidAmount).append("] ");

		return buffer.toString();
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (int) (prime * result + ((bidId == null) ? 0 : bidId.hashCode()));
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
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
