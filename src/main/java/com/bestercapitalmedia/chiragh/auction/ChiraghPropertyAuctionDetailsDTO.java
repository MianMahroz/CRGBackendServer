package com.bestercapitalmedia.chiragh.auction;

import java.util.Calendar;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.FetchType;

// TODO: Auto-generated Javadoc
/**
 * The Class ChiraghPropertyAuctionDetailsDTO.
 */
public class ChiraghPropertyAuctionDetailsDTO {

	/** The property id. */
	int propertyId;
	
	/** The user name. */
	String userName;
	
	/** The auction duration. */
	String auctionDuration;
	
	/** The auction cost. */
	String auctionCost;
	
	/** The security deposit. */
	String securityDeposit;
	
	/** The auction start date. */
	Calendar auctionStartDate;
	
	

	/**
	 * Gets the auction duration.
	 *
	 * @return the auction duration
	 */
	public String getAuctionDuration() {
		return auctionDuration;
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
	 * Gets the auction cost.
	 *
	 * @return the auction cost
	 */
	public String getAuctionCost() {
		return auctionCost;
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
	 * Gets the security deposit.
	 *
	 * @return the security deposit
	 */
	public String getSecurityDeposit() {
		return securityDeposit;
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
	 * Instantiates a new chiragh property auction details DTO.
	 */
	public ChiraghPropertyAuctionDetailsDTO() {
		
		// TODO Auto-generated constructor stub
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
	 * Gets the property id.
	 *
	 * @return the property id
	 */
	public int getPropertyId() {
		return propertyId;
	}

	/**
	 * Sets the property id.
	 *
	 * @param propertyId the new property id
	 */
	public void setPropertyId(int propertyId) {
		this.propertyId = propertyId;
	}

	/**
	 * Gets the user name.
	 *
	 * @return the user name
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * Sets the user name.
	 *
	 * @param userName the new user name
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

}
