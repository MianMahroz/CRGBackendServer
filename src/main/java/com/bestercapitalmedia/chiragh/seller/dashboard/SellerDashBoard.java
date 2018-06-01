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

	
	@Entity

	@Table(catalog = "chiraghdatabase", name = "sellingbuyinghistory")
	public class SellerDashBoard implements Serializable {
		private static final long serialVersionUID = 1L;

		

		@Column(name = "selling_buying_history_Id", nullable = false)
		@Basic(fetch = FetchType.EAGER)

		@Id
	    @GeneratedValue(strategy=GenerationType.IDENTITY)	
		Integer sellingbuyinghistoryId;
		
		@Column(name = "seller_Ids", length = 25)
		@Basic(fetch = FetchType.EAGER)
		String sellerIds;
		
		@Column(name = "seller_User_Ids", length = 11)
		@Basic(fetch = FetchType.EAGER)
		
		Integer sellerUserIds;
	

		@Column(name = "buyer_Ids", length = 25)
		@Basic(fetch = FetchType.EAGER)
		String buyerIds;
		
		@Column(name = "buyer_User_Ids", length = 11)
		@Basic(fetch = FetchType.EAGER)
		Integer buyerUserIds;
		



		@Column(name = "property_Id", length = 11)
		@Basic(fetch = FetchType.EAGER)
		Integer propertyId;
		
		public void setPropertyId(Integer propertyId) {
			this.propertyId = propertyId;
		}



		@Temporal(TemporalType.TIMESTAMP)
		@Column(name = "date", nullable = false)
		@Basic(fetch = FetchType.EAGER)
		Calendar date;
		
		@Column(name = "status", length = 25)
		@Basic(fetch = FetchType.EAGER)
		String status;


		public String getBuyerIds() {
			return buyerIds;
		}

		public void setBuyerIds(String buyerIds) {
			this.buyerIds = buyerIds;
		}


		public Integer getSellerUserIds() {
			return sellerUserIds;
		}

		public void setSellerUserIds(Integer sellerUserIds) {
			this.sellerUserIds = sellerUserIds;
		}

		public Integer getBuyerUserIds() {
			return buyerUserIds;
		}

		public void setBuyerUserIds(Integer buyerUserIds) {
			this.buyerUserIds = buyerUserIds;
		}

		public Calendar getDate() {
			return date;
		}

		public void setDate(Calendar date) {
			this.date = date;
		}

		public String getStatus() {
			return status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Integer getSellingbuyinghistoryId() {
			return sellingbuyinghistoryId;
		}

		public void setSellingbuyinghistoryId(Integer sellingbuyinghistoryId) {
			this.sellingbuyinghistoryId = sellingbuyinghistoryId;
		}

		public String getSellerIds() {
			return sellerIds;
		}

		public void setSellerIds(String sellerIds) {
			this.sellerIds = sellerIds;
		}
	
		
	    
		public SellerDashBoard() {
		}
		
}

