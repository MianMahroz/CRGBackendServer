package com.bestercapitalmedia.chiragh.dtoAndServices;

import javax.validation.constraints.Size;

public class UserPropertySeenDTO {
	
	private int userId;
	private int propertyBuyerId;
	private int propertyId;
	@Size(min=8,max=25)
	private String propertyTitle;
	@Size(min=8,max=25)
	
	
	
	
	/*public void setPropertyBuyerId(Integer propertyBuyerId) {
		this.propertyBuyerId = propertyBuyerId;
	}

	
	public Integer getPropertyBuyerId() {
		return this.propertyBuyerId;
	}*/
	
	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	
	
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

}
