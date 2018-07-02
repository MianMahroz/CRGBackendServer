package com.bestercapitalmedia.chiragh.buyer.bidding.history;



import java.io.Serializable;

import java.lang.StringBuilder;

import java.util.LinkedHashSet;
import java.util.Set;



import com.bestercapitalmedia.chiragh.buyer.details.PropertyBuyerDetails;
import com.bestercapitalmedia.chiragh.property.Chiraghproperty;
import com.bestercapitalmedia.chiragh.user.Chiraghuser;
import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

// TODO: Auto-generated Javadoc
/**
 * The Class BuyerBiddingHistory.
 */

@Entity

@Table(catalog = "chiraghdatabase", name = "buyerbiddinghistory")
public class BuyerBiddingHistory implements Serializable {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The buyer bidding history id. */

	@Column(name = "buyer_Bidding_History_Id", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Integer buyerBiddingHistoryId;
	
	/** The bid reference no. */

	@Column(name = "bid_Reference_No")
	@Basic(fetch = FetchType.EAGER)

	String bidReferenceNo;
	
	/** The bidding status. */

	@Column(name = "bidding_Status", length = 25)
	@Basic(fetch = FetchType.EAGER)

	String biddingStatus;

	/** The chiraghuser. */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "user_Id", referencedColumnName = "user_Id") })
	@JsonBackReference
	Chiraghuser chiraghuser;
	
	/** The chiraghproperty. */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "property_Id", referencedColumnName = "property_Id") })
	@JsonBackReference
	Chiraghproperty chiraghproperty;
	
	/**
	 * Sets the buyer bidding history id.
	 *
	 * @param buyerBiddingHistoryId the new buyer bidding history id
	 */
	@OneToMany(mappedBy = "buyerbiddinghistory", fetch = FetchType.LAZY)

	/**
	 */
	public void setBuyerBiddingHistoryId(Integer buyerBiddingHistoryId) {
		this.buyerBiddingHistoryId = buyerBiddingHistoryId;
	}

	/**
	 * Gets the buyer bidding history id.
	 *
	 * @return the buyer bidding history id
	 */
	public Integer getBuyerBiddingHistoryId() {
		return this.buyerBiddingHistoryId;
	}

	/**
	 * Sets the bid reference no.
	 *
	 * @param bidReferenceNo the new bid reference no
	 */
	public void setBidReferenceNo(String bidReferenceNo) {
		this.bidReferenceNo = bidReferenceNo;
	}

	/**
	 * Gets the bid reference no.
	 *
	 * @return the bid reference no
	 */
	public String getBidReferenceNo() {
		return this.bidReferenceNo;
	}

	/**
	 * Sets the bidding status.
	 *
	 * @param biddingStatus the new bidding status
	 */
	public void setBiddingStatus(String biddingStatus) {
		this.biddingStatus = biddingStatus;
	}

	/**
	 * Gets the bidding status.
	 *
	 * @return the bidding status
	 */
	public String getBiddingStatus() {
		return this.biddingStatus;
	}

	/**
	 * Sets the chiraghuser.
	 *
	 * @param chiraghuser the new chiraghuser
	 */
	public void setChiraghuser(Chiraghuser chiraghuser) {
		this.chiraghuser = chiraghuser;
	}

	/**
	 * Gets the chiraghuser.
	 *
	 * @return the chiraghuser
	 */
	public Chiraghuser getChiraghuser() {
		return chiraghuser;
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
	 * Instantiates a new buyer bidding history.
	 */
	public BuyerBiddingHistory() {
	}

	/**
	 * Gets the serialversionuid.
	 *
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	

}

	
