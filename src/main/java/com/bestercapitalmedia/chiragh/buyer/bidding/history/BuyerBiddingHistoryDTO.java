package com.bestercapitalmedia.chiragh.buyer.bidding.history;

import javax.validation.constraints.Size;

public class BuyerBiddingHistoryDTO {
	
	@Size(min=8,max=15)
	private String biddingStatus;

	private int userId;
	private int propertyId;
	
	public void setBiddingStatus(String biddingStatus) {
		this.biddingStatus = biddingStatus;
	}
	public String getBiddingStatus() {
		return this.biddingStatus;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getPropertyId() {
		return propertyId;
	}
	public void setPropertyId(int propertyId) {
		this.propertyId = propertyId;
	}

}
