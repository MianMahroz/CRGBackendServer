package com.bestercapitalmedia.chiragh.seller.dashboard;

import java.util.Calendar;

public class SellingBuyingHistoryDTO {

 
	private String sellerIds;
	private int sellerUserIds;
	private String buyerIds;
    private int buyerUserIds;
    private int propertyId;
    private  Calendar date;
    private String status;

    
	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}




	//for testing propose it will remove later
	private int bidId;
    
	public int getPropertyId() {
		return propertyId;
	}


	public void setPropertyId(int propertyId) {
		this.propertyId = propertyId;
	}

	
	
	public int getBidId() {
		return bidId;
	}


	public void setBidId(int bidId) {
		this.bidId = bidId;
	}




	public int getSellerUserIds() {
		return sellerUserIds;
	}




	public void setSellerUserIds(int sellerUserIds) {
		this.sellerUserIds = sellerUserIds;
	}



	public String getSellerIds() {
		return sellerIds;
	}


	public void setSellerIds(String sellerIds) {
		this.sellerIds = sellerIds;
	}


	public String getBuyerIds() {
		return buyerIds;
	}


	public void setBuyerIds(String buyerIds) {
		this.buyerIds = buyerIds;
	}


	public int getBuyerUserIds() {
		return buyerUserIds;
	}




	public void setBuyerUserIds(int buyerUserIds) {
		this.buyerUserIds = buyerUserIds;
	}




	public Calendar getDate() {
		return date;
	}




	public void setDate(Calendar date) {
		this.date = date;
	}




	public   SellingBuyingHistoryDTO(){
}
}