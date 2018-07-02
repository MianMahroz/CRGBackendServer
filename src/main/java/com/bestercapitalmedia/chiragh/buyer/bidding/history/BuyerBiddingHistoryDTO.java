package com.bestercapitalmedia.chiragh.buyer.bidding.history;

import javax.validation.constraints.Size;

// TODO: Auto-generated Javadoc
/**
 * The Class BuyerBiddingHistoryDTO.
 */
public class BuyerBiddingHistoryDTO {
	
	/** The bidding status. */
	@Size(min=8,max=15)
	private String biddingStatus;

	/** The user id. */
	private int userId;
	
	/** The property id. */
	private int propertyId;
	
	/**
	 * Sets the bidding status.
	 *
	 * @param biddingStatus the new bidding status
	 */
	public void setBiddingStatus(String biddingStatus) {
		this.biddingStatus = biddingStatus;
	}
	
	/**
	 * Gets the bidding status.
	 *
	 * @return the bidding status
	 */
	public String getBiddingStatus() {
		return this.biddingStatus;
	}
	
	/**
	 * Gets the user id.
	 *
	 * @return the user id
	 */
	public int getUserId() {
		return userId;
	}
	
	/**
	 * Sets the user id.
	 *
	 * @param userId the new user id
	 */
	public void setUserId(int userId) {
		this.userId = userId;
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

}
