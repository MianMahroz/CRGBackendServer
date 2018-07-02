
package com.bestercapitalmedia.chiragh.property.auctionprocess;

import java.io.Serializable;

import java.lang.StringBuilder;

import java.util.Calendar;
import java.util.Set;




import com.bestercapitalmedia.chiragh.auction.Auction;
import com.bestercapitalmedia.chiragh.property.Chiraghproperty;
import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

// TODO: Auto-generated Javadoc
/**
 * The Class Propertyauctionprocess.
 */

@Entity
@Table(catalog = "chiraghdatabase", name = "propertyauctionprocess")
public class Propertyauctionprocess implements Serializable {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The property id auction process. */

	@Column(name = "property_Id_Auction_Process", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Integer propertyIdAuctionProcess;
	
	/** The bid start date. */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "bid_Start_Date", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	Calendar bidStartDate;
	
	/** The bid end date. */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "bid_End_Date", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	Calendar bidEndDate;
	
	/** The final amount. */

	@Column(name = "final_Amount", length = 25)
	@Basic(fetch = FetchType.EAGER)

	String finalAmount;
	
	/** The is active. */

	@Column(name = "is_Active")
	@Basic(fetch = FetchType.EAGER)

	Boolean isActive;
	
	/** The auction. */


	/**
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "auction_Duration_Id", referencedColumnName = "auction_Duration_Id") })
	@JsonBackReference
	Auction auction;
	
	/** The chiraghproperty. */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "property_Id", referencedColumnName = "property_Id") })
	@JsonBackReference
	Chiraghproperty chiraghproperty;

	/**
	 * Sets the property id auction process.
	 *
	 * @param propertyIdAuctionProcess the new property id auction process
	 */
	public void setPropertyIdAuctionProcess(Integer propertyIdAuctionProcess) {
		this.propertyIdAuctionProcess = propertyIdAuctionProcess;
	}

	/**
	 * Gets the property id auction process.
	 *
	 * @return the property id auction process
	 */
	public Integer getPropertyIdAuctionProcess() {
		return this.propertyIdAuctionProcess;
	}

	/**
	 * Sets the bid start date.
	 *
	 * @param bidStartDate the new bid start date
	 */
	public void setBidStartDate(Calendar bidStartDate) {
		this.bidStartDate = bidStartDate;
	}

	/**
	 * Gets the bid start date.
	 *
	 * @return the bid start date
	 */
	public Calendar getBidStartDate() {
		return this.bidStartDate;
	}

	/**
	 * Sets the bid end date.
	 *
	 * @param bidEndDate the new bid end date
	 */
	public void setBidEndDate(Calendar bidEndDate) {
		this.bidEndDate = bidEndDate;
	}

	/**
	 * Gets the bid end date.
	 *
	 * @return the bid end date
	 */
	public Calendar getBidEndDate() {
		return this.bidEndDate;
	}

	/**
	 * Sets the final amount.
	 *
	 * @param finalAmount the new final amount
	 */
	public void setFinalAmount(String finalAmount) {
		this.finalAmount = finalAmount;
	}

	/**
	 * Gets the final amount.
	 *
	 * @return the final amount
	 */
	public String getFinalAmount() {
		return this.finalAmount;
	}

	/**
	 * Sets the checks if is active.
	 *
	 * @param isActive the new checks if is active
	 */
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	/**
	 * Gets the checks if is active.
	 *
	 * @return the checks if is active
	 */
	public Boolean getIsActive() {
		return this.isActive;
	}


	/**
	 * Sets the auction.
	 *
	 * @param auction the new auction
	 */
	public void setAuction(Auction auction) {
		this.auction = auction;
	}

	/**
	 * Gets the auction.
	 *
	 * @return the auction
	 */
	public Auction getAuction() {
		return auction;
	}

	/**
	 * Sets the chiraghproperty.
	 *
	 * @param chiraghproperty the new chiraghproperty
	 */
	public void setChiraghproperty(Chiraghproperty chiraghproperty) {
		this.chiraghproperty = chiraghproperty;
	}

	/**
	 * Gets the chiraghproperty.
	 *
	 * @return the chiraghproperty
	 */
	public Chiraghproperty getChiraghproperty() {
		return chiraghproperty;
	}

	/**
	 * Instantiates a new propertyauctionprocess.
	 */
	public Propertyauctionprocess() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
}
