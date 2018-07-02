package com.bestercapitalmedia.chiragh.dtoAndServices;

import javax.validation.constraints.Size;

// TODO: Auto-generated Javadoc
/**
 * The Class UserPropertySeenDTO.
 */
public class UserPropertySeenDTO {
	
	/** The user id. */
	private int userId;
	
	/** The property buyer id. */
	private int propertyBuyerId;
	
	/** The property id. */
	private int propertyId;
	
	/** The property title. */
	@Size(min=8,max=25)
	private String propertyTitle;
	
	/**
	 * Gets the user id.
	 *
	 * @return the user id
	 */
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

	/**
	 * Sets the user id.
	 *
	 * @param userId the new user id
	 */
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	
	
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

}
