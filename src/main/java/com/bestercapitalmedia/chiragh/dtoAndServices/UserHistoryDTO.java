package com.bestercapitalmedia.chiragh.dtoAndServices;

import javax.validation.constraints.Size;

// TODO: Auto-generated Javadoc
/**
 * The Class UserHistoryDTO.
 */
public class UserHistoryDTO {

	/** The property id. */
	//private int propertyBuyerId;
	private int propertyId;
	
	/** The property title. */
	@Size(min=8,max=25)
	private String propertyTitle;
	
	/** The buyer bidding history id. */
	private int buyerBiddingHistoryId;
	
	/** The bid id. */
	private int bidId;
	
	
	
	/*public void setPropertyBuyerId(Integer propertyBuyerId) {
		this.propertyBuyerId = propertyBuyerId;
	}

	
	public Integer getPropertyBuyerId() {
		return this.propertyBuyerId;
	}*/
	
	/**
	 * Gets the property id.
	 *
	 * @return the property id
	 */
	public Integer getPropertyId() {
		return propertyId;
	}

	/**
	 * Sets the property id.
	 *
	 * @param propertyId the new property id
	 */
	public void setPropertyId(Integer propertyId) {
		this.propertyId = propertyId;
	}

	/**
	 * Gets the property title.
	 *
	 * @return the property title
	 */
	public String getPropertyTitle() {
		return propertyTitle;
	}

	/**
	 * Sets the property title.
	 *
	 * @param propertyTitle the new property title
	 */
	public void setPropertyTitle(String propertyTitle) {
		this.propertyTitle = propertyTitle;
	}


	/**
	 * Gets the buyer bidding history id.
	 *
	 * @return the buyer bidding history id
	 */
	public int getBuyerBiddingHistoryId() {
		return buyerBiddingHistoryId;
	}


	/**
	 * Sets the buyer bidding history id.
	 *
	 * @param buyerBiddingHistoryId the new buyer bidding history id
	 */
	public void setBuyerBiddingHistoryId(int buyerBiddingHistoryId) {
		this.buyerBiddingHistoryId = buyerBiddingHistoryId;
	}


	/**
	 * Gets the bid id.
	 *
	 * @return the bid id
	 */
	public int getBidId() {
		return bidId;
	}


	/**
	 * Sets the bid id.
	 *
	 * @param bidId the new bid id
	 */
	public void setBidId(int bidId) {
		this.bidId = bidId;
	}

	
	
}
