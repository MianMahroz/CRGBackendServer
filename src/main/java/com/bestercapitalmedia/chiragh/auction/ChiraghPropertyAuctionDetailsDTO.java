package com.bestercapitalmedia.chiragh.auction;

import java.util.Calendar;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.FetchType;

public class ChiraghPropertyAuctionDetailsDTO {

	int propertyId;
	String userName;
	String auctionDuration;
	String auctionCost;
	String securityDeposit;
	Calendar auctionStartDate;
	
	

	public String getAuctionDuration() {
		return auctionDuration;
	}

	public void setAuctionDuration(String auctionDuration) {
		this.auctionDuration = auctionDuration;
	}

	public String getAuctionCost() {
		return auctionCost;
	}

	public void setAuctionCost(String auctionCost) {
		this.auctionCost = auctionCost;
	}

	public String getSecurityDeposit() {
		return securityDeposit;
	}

	public void setSecurityDeposit(String securityDeposit) {
		this.securityDeposit = securityDeposit;
	}

	public ChiraghPropertyAuctionDetailsDTO() {
		
		// TODO Auto-generated constructor stub
	}

	public Calendar getAuctionStartDate() {
		return auctionStartDate;
	}

	public void setAuctionStartDate(Calendar auctionStartDate) {
		this.auctionStartDate = auctionStartDate;
	}

	

	public int getPropertyId() {
		return propertyId;
	}

	public void setPropertyId(int propertyId) {
		this.propertyId = propertyId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}
