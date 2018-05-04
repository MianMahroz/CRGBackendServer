package com.bestercapitalmedia.chiragh.dtoAndServices;

import javax.validation.constraints.Size;

public class UserHistoryDTO {

	//private int propertyBuyerId;
	private int propertyId;
	@Size(min=8,max=25)
	private String propertyTitle;
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
