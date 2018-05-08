package com.bestercapitalmedia.chiragh.buyer.bidding.history;



import java.io.Serializable;

import java.lang.StringBuilder;

import java.util.LinkedHashSet;
import java.util.Set;

import javax.xml.bind.annotation.*;

import com.bestercapitalmedia.chiragh.buyer.details.PropertyBuyerDetails;
import com.bestercapitalmedia.chiragh.property.Chiraghproperty;
import com.bestercapitalmedia.chiragh.user.Chiraghuser;
import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

/**
 */

@Entity

@Table(catalog = "chiraghdatabase", name = "buyerbiddinghistory")
public class BuyerBiddingHistory implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 */

	@Column(name = "buyer_Bidding_History_Id", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Integer buyerBiddingHistoryId;
	/**
	 */

	@Column(name = "bid_Reference_No")
	@Basic(fetch = FetchType.EAGER)

	String bidReferenceNo;
	/**
	 */

	@Column(name = "bidding_Status", length = 25)
	@Basic(fetch = FetchType.EAGER)

	String biddingStatus;

	/**
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "user_Id", referencedColumnName = "user_Id") })
	@JsonBackReference
	Chiraghuser chiraghuser;
	/**
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "property_Id", referencedColumnName = "property_Id") })
	@JsonBackReference
	Chiraghproperty chiraghproperty;
	
	/**
	 */
	@OneToMany(mappedBy = "buyerbiddinghistory", fetch = FetchType.LAZY)

	/**
	 */
	public void setBuyerBiddingHistoryId(Integer buyerBiddingHistoryId) {
		this.buyerBiddingHistoryId = buyerBiddingHistoryId;
	}

	/**
	 */
	public Integer getBuyerBiddingHistoryId() {
		return this.buyerBiddingHistoryId;
	}

	/**
	 */
	public void setBidReferenceNo(String bidReferenceNo) {
		this.bidReferenceNo = bidReferenceNo;
	}

	/**
	 */
	public String getBidReferenceNo() {
		return this.bidReferenceNo;
	}

	/**
	 */
	public void setBiddingStatus(String biddingStatus) {
		this.biddingStatus = biddingStatus;
	}

	/**
	 */
	public String getBiddingStatus() {
		return this.biddingStatus;
	}

	/**
	 */
	public void setChiraghuser(Chiraghuser chiraghuser) {
		this.chiraghuser = chiraghuser;
	}

	/**
	 */
	public Chiraghuser getChiraghuser() {
		return chiraghuser;
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


	public BuyerBiddingHistory() {
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	

}

	
