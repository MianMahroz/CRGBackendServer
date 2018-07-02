package com.bestercapitalmedia.chiragh.seller.dashboard;

import java.util.Calendar;

// TODO: Auto-generated Javadoc
/**
 * The Class SellingBuyingHistoryDTO.
 */
public class SellingBuyingHistoryDTO {

 
	/** The seller ids. */
	private String sellerIds;
	
	/** The seller user ids. */
	private int sellerUserIds;
	
	/** The buyer ids. */
	private String buyerIds;
    
    /** The buyer user ids. */
    private int buyerUserIds;
    
    /** The property id. */
    private int propertyId;
    
    /** The date. */
    private  Calendar date;
    
    /** The status. */
    private String status;

    
	/**
	 * Gets the status.
	 *
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}


	/**
	 * Sets the status.
	 *
	 * @param status the new status
	 */
	public void setStatus(String status) {
		this.status = status;
	}




	/** The bid id. */
	//for testing propose it will remove later
	private int bidId;
    
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
	 * Gets the bid id.
	 *
	 * @return the bid id
	 */
	public int getBidId() {
		return bidId;
	}


	/**
	 * Sets the bid id.
	 *
	 * @param bidId the new bid id
	 */
	public void setBidId(int bidId) {
		this.bidId = bidId;
	}




	/**
	 * Gets the seller user ids.
	 *
	 * @return the seller user ids
	 */
	public int getSellerUserIds() {
		return sellerUserIds;
	}




	/**
	 * Sets the seller user ids.
	 *
	 * @param sellerUserIds the new seller user ids
	 */
	public void setSellerUserIds(int sellerUserIds) {
		this.sellerUserIds = sellerUserIds;
	}



	/**
	 * Gets the seller ids.
	 *
	 * @return the seller ids
	 */
	public String getSellerIds() {
		return sellerIds;
	}


	/**
	 * Sets the seller ids.
	 *
	 * @param sellerIds the new seller ids
	 */
	public void setSellerIds(String sellerIds) {
		this.sellerIds = sellerIds;
	}


	/**
	 * Gets the buyer ids.
	 *
	 * @return the buyer ids
	 */
	public String getBuyerIds() {
		return buyerIds;
	}


	/**
	 * Sets the buyer ids.
	 *
	 * @param buyerIds the new buyer ids
	 */
	public void setBuyerIds(String buyerIds) {
		this.buyerIds = buyerIds;
	}


	/**
	 * Gets the buyer user ids.
	 *
	 * @return the buyer user ids
	 */
	public int getBuyerUserIds() {
		return buyerUserIds;
	}




	/**
	 * Sets the buyer user ids.
	 *
	 * @param buyerUserIds the new buyer user ids
	 */
	public void setBuyerUserIds(int buyerUserIds) {
		this.buyerUserIds = buyerUserIds;
	}




	/**
	 * Gets the date.
	 *
	 * @return the date
	 */
	public Calendar getDate() {
		return date;
	}




	/**
	 * Sets the date.
	 *
	 * @param date the new date
	 */
	public void setDate(Calendar date) {
		this.date = date;
	}




	/**
	 * Instantiates a new selling buying history DTO.
	 */
	public   SellingBuyingHistoryDTO(){
}
}