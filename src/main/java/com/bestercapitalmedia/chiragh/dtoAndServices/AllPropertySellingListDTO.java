package com.bestercapitalmedia.chiragh.dtoAndServices;

import javax.validation.constraints.Size;

public class AllPropertySellingListDTO {
	
	private int propertyId;
	@Size(min=8,max=25)
	private String propertyTitle;
	@Size(min=8,max=25)
	private String address;
	private String scheduled;
	private String sold;
	private String unsold;
	private String active;
	
	
	
	
	
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

}
