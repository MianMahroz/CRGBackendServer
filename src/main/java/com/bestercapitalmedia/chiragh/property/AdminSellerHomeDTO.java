package com.bestercapitalmedia.chiragh.property;

import java.util.Date;

// TODO: Auto-generated Javadoc
/**
 * The Class AdminSellerHomeDTO.
 */
public class AdminSellerHomeDTO {

	/** The property id. */
	int propertyId;
	
	/** The seller user name. */
	String sellerUserName;
	
	/** The last action performed. */
	String lastActionPerformed;
	
	/** The date received. */
	Date dateReceived;
	
	/** The last action. */
	Date lastAction;
	
	/** The action performed by. */
	String actionPerformedBy;
	
	/**
	 * Gets the seller user name.
	 *
	 * @return the seller user name
	 */
	public String getSellerUserName() {
		return sellerUserName;
	}
	
	/**
	 * Sets the seller user name.
	 *
	 * @param sellerUserName the new seller user name
	 */
	public void setSellerUserName(String sellerUserName) {
		this.sellerUserName = sellerUserName;
	}
	
	/**
	 * Gets the last action performed.
	 *
	 * @return the last action performed
	 */
	public String getLastActionPerformed() {
		return lastActionPerformed;
	}
	
	/**
	 * Sets the last action performed.
	 *
	 * @param lastActionPerformed the new last action performed
	 */
	public void setLastActionPerformed(String lastActionPerformed) {
		this.lastActionPerformed = lastActionPerformed;
	}
	
	/**
	 * Gets the date received.
	 *
	 * @return the date received
	 */
	public Date getDateReceived() {
		return dateReceived;
	}
	
	/**
	 * Sets the date received.
	 *
	 * @param dateReceived the new date received
	 */
	public void setDateReceived(Date dateReceived) {
		this.dateReceived = dateReceived;
	}
	
	/**
	 * Gets the last action.
	 *
	 * @return the last action
	 */
	public Date getLastAction() {
		return lastAction;
	}
	
	/**
	 * Sets the last action.
	 *
	 * @param lastAction the new last action
	 */
	public void setLastAction(Date lastAction) {
		this.lastAction = lastAction;
	}
	
	/**
	 * Gets the action performed by.
	 *
	 * @return the action performed by
	 */
	public String getActionPerformedBy() {
		return actionPerformedBy;
	}
	
	/**
	 * Sets the action performed by.
	 *
	 * @param actionPerformedBy the new action performed by
	 */
	public void setActionPerformedBy(String actionPerformedBy) {
		this.actionPerformedBy = actionPerformedBy;
	}
	
	/**
	 * Instantiates a new admin seller home DTO.
	 */
	public AdminSellerHomeDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
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
	
}
