
package com.bestercapitalmedia.chiragh.auction;

import java.io.Serializable;

import java.lang.StringBuilder;
import java.util.Calendar;
import java.util.LinkedHashSet;
import java.util.Set;



import com.bestercapitalmedia.chiragh.property.Chiraghproperty;
import com.bestercapitalmedia.chiragh.property.auctionprocess.Propertyauctionprocess;
import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

// TODO: Auto-generated Javadoc
/**
 * The Class Auction.
 */

@Entity
@Table(catalog = "chiraghdatabase", name = "auction")
public class Auction implements Serializable {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The auction duration id. */

	@Column(name = "auction_Duration_Id", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Integer auctionDurationId;
	
	/** The auction duration. */

	@Column(name = "auction_Duration", length = 25)
	@Basic(fetch = FetchType.EAGER)

	
	String auctionDuration;
	
	/** The auction cost. */

	@Column(name = "auction_Cost", length = 25)
	@Basic(fetch = FetchType.EAGER)

	
	String auctionCost;
	
	/** The is published. */

	@Column(name = "is_Published", length = 25)
	@Basic(fetch = FetchType.EAGER)

	
	String isPublished;
	
	/** The security deposit. */

	@Column(name = "security_Deposit", length = 25)
	@Basic(fetch = FetchType.EAGER)

	
	String securityDeposit;
	
	/** The auction start date. */
	@Temporal(TemporalType.TIMESTAMP)
	@Basic(fetch = FetchType.EAGER)
	@Column(name="auction_Start_Date")
	Calendar auctionStartDate;
	
	/** The auction end date. */
	@Column(name="auction_End_Date")
	Calendar auctionEndDate;
	

	/** The chiraghproperty. */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "property_Id", referencedColumnName = "property_Id") })
	@JsonBackReference
	Chiraghproperty chiraghproperty;
	
	/** The propertyauctionprocesses. */
	@OneToMany(mappedBy = "auction", fetch = FetchType.LAZY)

	
	java.util.Set<Propertyauctionprocess> propertyauctionprocesses;

	/**
	 * Sets the auction duration id.
	 *
	 * @param auctionDurationId the new auction duration id
	 */
	public void setAuctionDurationId(Integer auctionDurationId) {
		this.auctionDurationId = auctionDurationId;
	}

	/**
	 * Gets the auction duration id.
	 *
	 * @return the auction duration id
	 */
	public Integer getAuctionDurationId() {
		return this.auctionDurationId;
	}

	/**
	 * Sets the auction duration.
	 *
	 * @param auctionDuration the new auction duration
	 */
	public void setAuctionDuration(String auctionDuration) {
		this.auctionDuration = auctionDuration;
	}

	/**
	 * Gets the auction duration.
	 *
	 * @return the auction duration
	 */
	public String getAuctionDuration() {
		return this.auctionDuration;
	}

	/**
	 * Sets the auction cost.
	 *
	 * @param auctionCost the new auction cost
	 */
	public void setAuctionCost(String auctionCost) {
		this.auctionCost = auctionCost;
	}

	/**
	 * Gets the auction cost.
	 *
	 * @return the auction cost
	 */
	public String getAuctionCost() {
		return this.auctionCost;
	}

	/**
	 * Sets the checks if is published.
	 *
	 * @param isPublished the new checks if is published
	 */
	public void setIsPublished(String isPublished) {
		this.isPublished = isPublished;
	}

	/**
	 * Gets the checks if is published.
	 *
	 * @return the checks if is published
	 */
	public String getIsPublished() {
		return this.isPublished;
	}

	/**
	 * Sets the security deposit.
	 *
	 * @param securityDeposit the new security deposit
	 */
	public void setSecurityDeposit(String securityDeposit) {
		this.securityDeposit = securityDeposit;
	}

	/**
	 * Gets the security deposit.
	 *
	 * @return the security deposit
	 */
	public String getSecurityDeposit() {
		return this.securityDeposit;
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
	 * Sets the propertyauctionprocesses.
	 *
	 * @param propertyauctionprocesses the new propertyauctionprocesses
	 */
	public void setPropertyauctionprocesses(Set<Propertyauctionprocess> propertyauctionprocesses) {
		this.propertyauctionprocesses = propertyauctionprocesses;
	}

	/**
	 * Gets the propertyauctionprocesses.
	 *
	 * @return the propertyauctionprocesses
	 */
	public Set<Propertyauctionprocess> getPropertyauctionprocesses() {
		if (propertyauctionprocesses == null) {
			propertyauctionprocesses = new java.util.LinkedHashSet<Propertyauctionprocess>();
		}
		return propertyauctionprocesses;
	}

	/**
	 * Instantiates a new auction.
	 */
	public Auction() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 * @param that the that
	 */
	public void copy(Auction that) {
		setAuctionDurationId(that.getAuctionDurationId());
		setAuctionDuration(that.getAuctionDuration());
		setAuctionCost(that.getAuctionCost());
		setIsPublished(that.getIsPublished());
		setSecurityDeposit(that.getSecurityDeposit());
		setChiraghproperty(that.getChiraghproperty());
		setPropertyauctionprocesses(new java.util.LinkedHashSet<Propertyauctionprocess>(that.getPropertyauctionprocesses()));
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 * @return the string
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("auctionDurationId=[").append(auctionDurationId).append("] ");
		buffer.append("auctionDuration=[").append(auctionDuration).append("] ");
		buffer.append("auctionCost=[").append(auctionCost).append("] ");
		buffer.append("isPublished=[").append(isPublished).append("] ");
		buffer.append("securityDeposit=[").append(securityDeposit).append("] ");

		return buffer.toString();
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (int) (prime * result + ((auctionDurationId == null) ? 0 : auctionDurationId.hashCode()));
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof Auction))
			return false;
		Auction equalCheck = (Auction) obj;
		if ((auctionDurationId == null && equalCheck.auctionDurationId != null) || (auctionDurationId != null && equalCheck.auctionDurationId == null))
			return false;
		if (auctionDurationId != null && !auctionDurationId.equals(equalCheck.auctionDurationId))
			return false;
		return true;
	}

	/**
	 * Gets the auction start date.
	 *
	 * @return the auction start date
	 */
	public Calendar getAuctionStartDate() {
		return auctionStartDate;
	}

	/**
	 * Sets the auction start date.
	 *
	 * @param auctionStartDate the new auction start date
	 */
	public void setAuctionStartDate(Calendar auctionStartDate) {
		this.auctionStartDate = auctionStartDate;
	}

	/**
	 * Gets the auction end date.
	 *
	 * @return the auction end date
	 */
	public Calendar getAuctionEndDate() {
		return auctionEndDate;
	}

	/**
	 * Sets the auction end date.
	 *
	 * @param auctionEndDate the new auction end date
	 */
	public void setAuctionEndDate(Calendar auctionEndDate) {
		this.auctionEndDate = auctionEndDate;
	}
}
