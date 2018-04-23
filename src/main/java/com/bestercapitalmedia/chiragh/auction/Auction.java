
package com.bestercapitalmedia.chiragh.auction;

import java.io.Serializable;

import java.lang.StringBuilder;

import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.Id;

import javax.xml.bind.annotation.*;

import com.bestercapitalmedia.chiragh.property.auctionprocess.Propertyauctionprocess;

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
	@GeneratedValue(strategy = GenerationType.IDENTITY)

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
	@OneToMany(mappedBy = "auction", fetch = FetchType.LAZY)
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

}
