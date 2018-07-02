package com.bestercapitalmedia.chiragh.seller.dashboard;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

	
	// TODO: Auto-generated Javadoc
/**
	 * The Class SellerDashBoard.
	 */
	@Entity

	@Table(catalog = "chiraghdatabase", name = "sellingbuyinghistory")
	public class SellerDashBoard implements Serializable {
		
		/** The Constant serialVersionUID. */
		private static final long serialVersionUID = 1L;

		

		/** The sellingbuyinghistory id. */
		@Column(name = "selling_buying_history_Id", nullable = false)
		@Basic(fetch = FetchType.EAGER)

		@Id
	    @GeneratedValue(strategy=GenerationType.IDENTITY)	
		Integer sellingbuyinghistoryId;
		
		/** The seller ids. */
		@Column(name = "seller_Ids", length = 25)
		@Basic(fetch = FetchType.EAGER)
		String sellerIds;
		
		/** The seller user ids. */
		@Column(name = "seller_User_Ids", length = 11)
		@Basic(fetch = FetchType.EAGER)
		
		Integer sellerUserIds;
	

		/** The buyer ids. */
		@Column(name = "buyer_Ids", length = 25)
		@Basic(fetch = FetchType.EAGER)
		String buyerIds;
		
		/** The buyer user ids. */
		@Column(name = "buyer_User_Ids", length = 11)
		@Basic(fetch = FetchType.EAGER)
		Integer buyerUserIds;
		



		/** The property id. */
		@Column(name = "property_Id", length = 11)
		@Basic(fetch = FetchType.EAGER)
		Integer propertyId;
		
		/**
		 * Sets the property id.
		 *
		 * @param propertyId the new property id
		 */
		public void setPropertyId(Integer propertyId) {
			this.propertyId = propertyId;
		}



		/** The date. */
		@Temporal(TemporalType.TIMESTAMP)
		@Column(name = "date", nullable = false)
		@Basic(fetch = FetchType.EAGER)
		Calendar date;
		
		/** The status. */
		@Column(name = "status", length = 25)
		@Basic(fetch = FetchType.EAGER)
		String status;


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
		 * Gets the seller user ids.
		 *
		 * @return the seller user ids
		 */
		public Integer getSellerUserIds() {
			return sellerUserIds;
		}

		/**
		 * Sets the seller user ids.
		 *
		 * @param sellerUserIds the new seller user ids
		 */
		public void setSellerUserIds(Integer sellerUserIds) {
			this.sellerUserIds = sellerUserIds;
		}

		/**
		 * Gets the buyer user ids.
		 *
		 * @return the buyer user ids
		 */
		public Integer getBuyerUserIds() {
			return buyerUserIds;
		}

		/**
		 * Sets the buyer user ids.
		 *
		 * @param buyerUserIds the new buyer user ids
		 */
		public void setBuyerUserIds(Integer buyerUserIds) {
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

		/**
		 * Gets the sellingbuyinghistory id.
		 *
		 * @return the sellingbuyinghistory id
		 */
		public Integer getSellingbuyinghistoryId() {
			return sellingbuyinghistoryId;
		}

		/**
		 * Sets the sellingbuyinghistory id.
		 *
		 * @param sellingbuyinghistoryId the new sellingbuyinghistory id
		 */
		public void setSellingbuyinghistoryId(Integer sellingbuyinghistoryId) {
			this.sellingbuyinghistoryId = sellingbuyinghistoryId;
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
		 * Instantiates a new seller dash board.
		 */
		public SellerDashBoard() {
		}
		
}

