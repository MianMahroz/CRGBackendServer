package com.bestercapitalmedia.chiragh.dtoAndServices;

import javax.validation.constraints.Size;

// TODO: Auto-generated Javadoc
/**
 * The Class BuyerAllListDTO.
 */
public class BuyerAllListDTO {
	
	/** The property id. */
	private int propertyId;
	
	/** The property title. */
	@Size(min=8,max=25)
	private String propertyTitle;
	
	/** The property buyer id. */
	private int propertyBuyerId;
	
	/** The address. */
	private String address;
	
	/** The active. */
	private String active;
	
	/** The bidding. */
	private String bidding;
	
	/** The un sold. */
	private String unSold;
	
	/**
	 * Gets the property id.
	 *
	 * @return the property id
	 */
	public int getPropertyId() {
		return propertyId;
	}
	
	/**
	 * Sets the property id.
	 *
	 * @param propertyId the new property id
	 */
	public void setPropertyId(int propertyId) {
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
	 * Gets the property buyer id.
	 *
	 * @return the property buyer id
	 */
	public int getPropertyBuyerId() {
		return propertyBuyerId;
	}
	
	/**
	 * Sets the property buyer id.
	 *
	 * @param propertyBuyerId the new property buyer id
	 */
	public void setPropertyBuyerId(int propertyBuyerId) {
		this.propertyBuyerId = propertyBuyerId;
	}
	
	/**
	 * Gets the address.
	 *
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	
	/**
	 * Sets the address.
	 *
	 * @param address the new address
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	
	/**
	 * Gets the active.
	 *
	 * @return the active
	 */
	public String getActive() {
		return active;
	}
	
	/**
	 * Sets the active.
	 *
	 * @param active the new active
	 */
	public void setActive(String active) {
		this.active = active;
	}
	
	/**
	 * Gets the bidding.
	 *
	 * @return the bidding
	 */
	public String getBidding() {
		return bidding;
	}
	
	/**
	 * Sets the bidding.
	 *
	 * @param bidding the new bidding
	 */
	public void setBidding(String bidding) {
		this.bidding = bidding;
	}
	
	/**
	 * Gets the un sold.
	 *
	 * @return the un sold
	 */
	public String getUnSold() {
		return unSold;
	}
	
	/**
	 * Sets the un sold.
	 *
	 * @param unSold the new un sold
	 */
	public void setUnSold(String unSold) {
		this.unSold = unSold;
	}
	
	

}
