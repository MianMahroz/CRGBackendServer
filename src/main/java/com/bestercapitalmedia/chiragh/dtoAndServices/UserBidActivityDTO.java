package com.bestercapitalmedia.chiragh.dtoAndServices;

import javax.validation.constraints.Size;

public class UserBidActivityDTO {
	
	
	//private int propertyBuyerId;
	private int userId;
	private int propertyId;
	@Size(min=8,max=25)
	private String propertyTitle;
	@Size(min=8,max=25)
	private String ownerName;
	@Size(min=8,max=25)
	private String poaName;
    private  String highestBid;
    private String reservePrice;
    private String auctionEnd;
    private String totalBids;
    private String timeRemaning;
    
    
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getHighestBid() {
		return highestBid;
	}
	public void setHighestBid(String highestBid) {
		this.highestBid = highestBid;
	}
	public String getReservePrice() {
		return reservePrice;
	}
	public void setReservePrice(String reservePrice) {
		this.reservePrice = reservePrice;
	}
	public String getAuctionEnd() {
		return auctionEnd;
	}
	public void setAuctionEnd(String auctionEnd) {
		this.auctionEnd = auctionEnd;
	}
	public String getTotalBids() {
		return totalBids;
	}
	public void setTotalBids(String totalBids) {
		this.totalBids = totalBids;
	}
	public String getTimeRemaning() {
		return timeRemaning;
	}
	public void setTimeRemaning(String timeRemaning) {
		this.timeRemaning = timeRemaning;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public String getPoaName() {
		return poaName;
	}
	public void setPoaName(String poaName) {
		this.poaName = poaName;
	}
	private int buyerBiddingHistoryId;
	private int bidId;

	/*public void setPropertyBuyerId(Integer propertyBuyerId) {
		this.propertyBuyerId = propertyBuyerId;
	}

	
	public Integer getPropertyBuyerId() {
		return this.propertyBuyerId;
	}*/
	
	public Integer getPropertyId() {
		return propertyId;
	}

	public void setPropertyId(Integer propertyId) {
		this.propertyId = propertyId;
	}

	public String getPropertyTitle() {
		return propertyTitle;
	}

	public void setPropertyTitle(String propertyTitle) {
		this.propertyTitle = propertyTitle;
	}


	public int getBuyerBiddingHistoryId() {
		return buyerBiddingHistoryId;
	}


	public void setBuyerBiddingHistoryId(int buyerBiddingHistoryId) {
		this.buyerBiddingHistoryId = buyerBiddingHistoryId;
	}


	public int getBidId() {
		return bidId;
	}


	public void setBidId(int bidId) {
		this.bidId = bidId;
	}



}
