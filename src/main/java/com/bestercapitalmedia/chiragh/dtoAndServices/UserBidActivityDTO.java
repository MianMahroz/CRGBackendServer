package com.bestercapitalmedia.chiragh.dtoAndServices;

import javax.validation.constraints.Size;

// TODO: Auto-generated Javadoc
/**
 * The Class UserBidActivityDTO.
 */
public class UserBidActivityDTO {
	
	
	/** The user id. */
	//private int propertyBuyerId;
	private int userId;
	
	/** The property id. */
	private int propertyId;
	
	/** The property title. */
	@Size(min=8,max=25)
	private String propertyTitle;
	
	/** The owner name. */
	@Size(min=8,max=25)
	private String ownerName;
	
	/** The poa name. */
	@Size(min=8,max=25)
	private String poaName;
    
    /** The highest bid. */
    private  String highestBid;
    
    /** The reserve price. */
    private String reservePrice;
    
    /** The auction end. */
    private String auctionEnd;
    
    /** The total bids. */
    private String totalBids;
    
    /** The time remaning. */
    private String timeRemaning;
    
    
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
	 * Gets the highest bid.
	 *
	 * @return the highest bid
	 */
	public String getHighestBid() {
		return highestBid;
	}
	
	/**
	 * Sets the highest bid.
	 *
	 * @param highestBid the new highest bid
	 */
	public void setHighestBid(String highestBid) {
		this.highestBid = highestBid;
	}
	
	/**
	 * Gets the reserve price.
	 *
	 * @return the reserve price
	 */
	public String getReservePrice() {
		return reservePrice;
	}
	
	/**
	 * Sets the reserve price.
	 *
	 * @param reservePrice the new reserve price
	 */
	public void setReservePrice(String reservePrice) {
		this.reservePrice = reservePrice;
	}
	
	/**
	 * Gets the auction end.
	 *
	 * @return the auction end
	 */
	public String getAuctionEnd() {
		return auctionEnd;
	}
	
	/**
	 * Sets the auction end.
	 *
	 * @param auctionEnd the new auction end
	 */
	public void setAuctionEnd(String auctionEnd) {
		this.auctionEnd = auctionEnd;
	}
	
	/**
	 * Gets the total bids.
	 *
	 * @return the total bids
	 */
	public String getTotalBids() {
		return totalBids;
	}
	
	/**
	 * Sets the total bids.
	 *
	 * @param totalBids the new total bids
	 */
	public void setTotalBids(String totalBids) {
		this.totalBids = totalBids;
	}
	
	/**
	 * Gets the time remaning.
	 *
	 * @return the time remaning
	 */
	public String getTimeRemaning() {
		return timeRemaning;
	}
	
	/**
	 * Sets the time remaning.
	 *
	 * @param timeRemaning the new time remaning
	 */
	public void setTimeRemaning(String timeRemaning) {
		this.timeRemaning = timeRemaning;
	}
	
	/**
	 * Gets the owner name.
	 *
	 * @return the owner name
	 */
	public String getOwnerName() {
		return ownerName;
	}
	
	/**
	 * Sets the owner name.
	 *
	 * @param ownerName the new owner name
	 */
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	
	/**
	 * Gets the poa name.
	 *
	 * @return the poa name
	 */
	public String getPoaName() {
		return poaName;
	}
	
	/**
	 * Sets the poa name.
	 *
	 * @param poaName the new poa name
	 */
	public void setPoaName(String poaName) {
		this.poaName = poaName;
	}
	
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
