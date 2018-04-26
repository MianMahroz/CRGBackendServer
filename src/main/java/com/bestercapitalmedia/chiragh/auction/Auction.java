
package com.bestercapitalmedia.chiragh.auction;

import java.io.Serializable;

import java.lang.StringBuilder;

import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.Id;

import javax.xml.bind.annotation.*;

import com.bestercapitalmedia.chiragh.property.Chiraghproperty;
import com.bestercapitalmedia.chiragh.property.auctionprocess.Propertyauctionprocess;
import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

/**
 */

@Entity
@Table(catalog = "chiraghdatabase", name = "auction")
public class Auction implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 */

	@Column(name = "auction_Duration_Id", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Integer auctionDurationId;
	/**
	 */

	@Column(name = "auction_Duration", length = 25)
	@Basic(fetch = FetchType.EAGER)

	
	String auctionDuration;
	/**
	 */

	@Column(name = "auction_Cost", length = 25)
	@Basic(fetch = FetchType.EAGER)

	
	String auctionCost;
	/**
	 */

	@Column(name = "is_Published", length = 25)
	@Basic(fetch = FetchType.EAGER)

	
	String isPublished;
	/**
	 */

	@Column(name = "security_Deposit", length = 25)
	@Basic(fetch = FetchType.EAGER)

	
	String securityDeposit;

	/**
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "property_Id", referencedColumnName = "property_Id") })
	@JsonBackReference
	Chiraghproperty chiraghproperty;
	/**
	 */
	@OneToMany(mappedBy = "auction", fetch = FetchType.LAZY)

	@XmlElement(name = "", namespace = "")
	java.util.Set<Propertyauctionprocess> propertyauctionprocesses;

	/**
	 */
	public void setAuctionDurationId(Integer auctionDurationId) {
		this.auctionDurationId = auctionDurationId;
	}

	/**
	 */
	public Integer getAuctionDurationId() {
		return this.auctionDurationId;
	}

	/**
	 */
	public void setAuctionDuration(String auctionDuration) {
		this.auctionDuration = auctionDuration;
	}

	/**
	 */
	public String getAuctionDuration() {
		return this.auctionDuration;
	}

	/**
	 */
	public void setAuctionCost(String auctionCost) {
		this.auctionCost = auctionCost;
	}

	/**
	 */
	public String getAuctionCost() {
		return this.auctionCost;
	}

	/**
	 */
	public void setIsPublished(String isPublished) {
		this.isPublished = isPublished;
	}

	/**
	 */
	public String getIsPublished() {
		return this.isPublished;
	}

	/**
	 */
	public void setSecurityDeposit(String securityDeposit) {
		this.securityDeposit = securityDeposit;
	}

	/**
	 */
	public String getSecurityDeposit() {
		return this.securityDeposit;
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
	public void setPropertyauctionprocesses(Set<Propertyauctionprocess> propertyauctionprocesses) {
		this.propertyauctionprocesses = propertyauctionprocesses;
	}

	/**
	 */
	public Set<Propertyauctionprocess> getPropertyauctionprocesses() {
		if (propertyauctionprocesses == null) {
			propertyauctionprocesses = new java.util.LinkedHashSet<Propertyauctionprocess>();
		}
		return propertyauctionprocesses;
	}

	/**
	 */
	public Auction() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
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

	/**
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (int) (prime * result + ((auctionDurationId == null) ? 0 : auctionDurationId.hashCode()));
		return result;
	}

	/**
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
}
