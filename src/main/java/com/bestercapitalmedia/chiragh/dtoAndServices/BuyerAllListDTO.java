package com.bestercapitalmedia.chiragh.dtoAndServices;

import javax.validation.constraints.Size;

public class BuyerAllListDTO {
	
	private int propertyId;
	@Size(min=8,max=25)
	private String propertyTitle;
	private int propertyBuyerId;
	private String address;
	private String active;
	private String bidding;
	private String unSold;
	
	public int getPropertyId() {
		return propertyId;
	}
	public void setPropertyId(int propertyId) {
		this.propertyId = propertyId;
	}
	public String getPropertyTitle() {
		return propertyTitle;
	}
	public void setPropertyTitle(String propertyTitle) {
		this.propertyTitle = propertyTitle;
	}
	public int getPropertyBuyerId() {
		return propertyBuyerId;
	}
	public void setPropertyBuyerId(int propertyBuyerId) {
		this.propertyBuyerId = propertyBuyerId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getActive() {
		return active;
	}
	public void setActive(String active) {
		this.active = active;
	}
	public String getBidding() {
		return bidding;
	}
	public void setBidding(String bidding) {
		this.bidding = bidding;
	}
	public String getUnSold() {
		return unSold;
	}
	public void setUnSold(String unSold) {
		this.unSold = unSold;
	}
	
	

}
