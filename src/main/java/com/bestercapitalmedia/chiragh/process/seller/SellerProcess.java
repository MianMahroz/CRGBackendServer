package com.bestercapitalmedia.chiragh.process.seller;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="seller_process")
public class SellerProcess {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="SellerProcessId")
	private int sellerProcessId;
	
	@Column(name="ownerDetails")
	private String ownerDetails;
	
	@Column(name="poaDetails")
	private String poaDetails;
	
	@Column(name="propertyDetails")
	private String propertyDetails;
	
	@Column(name="propertyFinancials")
	private String propertyFinancials;
	
	@Column(name="propertyRent")
	private String propertyRent;
	
	@Column(name="auctionDetails")
	private String auctionDetails;
	
	@Column(name="sessionId")
	private String sessionId;
	
	@Column(name="userId")
	private int userId;
	
	@Column(name="propertyCode")
	private String propertyCode;
	
	public SellerProcess() {
		
	}

	public int getSellerProcessId() {
		return sellerProcessId;
	}

	public void setSellerProcessId(int sellerProcessId) {
		this.sellerProcessId = sellerProcessId;
	}

	public String getOwnerDetails() {
		return ownerDetails;
	}

	public void setOwnerDetails(String ownerDetails) {
		this.ownerDetails = ownerDetails;
	}

	public String getPoaDetails() {
		return poaDetails;
	}

	public void setPoaDetails(String poaDetails) {
		this.poaDetails = poaDetails;
	}

	public String getPropertyDetails() {
		return propertyDetails;
	}

	public void setPropertyDetails(String propertyDetails) {
		this.propertyDetails = propertyDetails;
	}

	public String getPropertyFinancials() {
		return propertyFinancials;
	}

	public void setPropertyFinancials(String propertyFinancials) {
		this.propertyFinancials = propertyFinancials;
	}

	public String getPropertyRent() {
		return propertyRent;
	}

	public void setPropertyRent(String propertyRent) {
		this.propertyRent = propertyRent;
	}

	public String getAuctionDetails() {
		return auctionDetails;
	}

	public void setAuctionDetails(String auctionDetails) {
		this.auctionDetails = auctionDetails;
	}

	public String getSessionId() {
		return sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getPropertyCode() {
		return propertyCode;
	}

	public void setPropertyCode(String propertyCode) {
		this.propertyCode = propertyCode;
	}
	
	
	
}//end of class
