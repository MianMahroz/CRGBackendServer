
package com.bestercapitalmedia.chiragh.property.auctionprocess;

import java.io.Serializable;

import java.lang.StringBuilder;

import java.util.Calendar;
import java.util.Set;




import com.bestercapitalmedia.chiragh.auction.Auction;
import com.bestercapitalmedia.chiragh.property.Chiraghproperty;
import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

/**
 */

@Entity
@Table(catalog = "chiraghdatabase", name = "propertyauctionprocess")
public class Propertyauctionprocess implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 */

	@Column(name = "property_Id_Auction_Process", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Integer propertyIdAuctionProcess;
	/**
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "bid_Start_Date", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	Calendar bidStartDate;
	/**
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "bid_End_Date", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	Calendar bidEndDate;
	/**
	 */

	@Column(name = "final_Amount", length = 25)
	@Basic(fetch = FetchType.EAGER)

	String finalAmount;
	/**
	 */

	@Column(name = "is_Active")
	@Basic(fetch = FetchType.EAGER)

	Boolean isActive;
	/**
	 */


	/**
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "auction_Duration_Id", referencedColumnName = "auction_Duration_Id") })
	@JsonBackReference
	Auction auction;
	/**
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "property_Id", referencedColumnName = "property_Id") })
	@JsonBackReference
	Chiraghproperty chiraghproperty;

	/**
	 */
	public void setPropertyIdAuctionProcess(Integer propertyIdAuctionProcess) {
		this.propertyIdAuctionProcess = propertyIdAuctionProcess;
	}

	/**
	 */
	public Integer getPropertyIdAuctionProcess() {
		return this.propertyIdAuctionProcess;
	}

	/**
	 */
	public void setBidStartDate(Calendar bidStartDate) {
		this.bidStartDate = bidStartDate;
	}

	/**
	 */
	public Calendar getBidStartDate() {
		return this.bidStartDate;
	}

	/**
	 */
	public void setBidEndDate(Calendar bidEndDate) {
		this.bidEndDate = bidEndDate;
	}

	/**
	 */
	public Calendar getBidEndDate() {
		return this.bidEndDate;
	}

	/**
	 */
	public void setFinalAmount(String finalAmount) {
		this.finalAmount = finalAmount;
	}

	/**
	 */
	public String getFinalAmount() {
		return this.finalAmount;
	}

	/**
	 */
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	/**
	 */
	public Boolean getIsActive() {
		return this.isActive;
	}


	/**
	 */
	public void setAuction(Auction auction) {
		this.auction = auction;
	}

	/**
	 */
	public Auction getAuction() {
		return auction;
	}

	/**
	 */
	public void setChiraghproperty(Chiraghproperty chiraghproperty) {
		this.chiraghproperty = chiraghproperty;
	}

	/**
	 */
	public Chiraghproperty getChiraghproperty() {
		return chiraghproperty;
	}

	/**
	 */
	public Propertyauctionprocess() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
}
