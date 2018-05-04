package com.bestercapitalmedia.chiragh.auction;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.FetchType;

public class ChiraghPropertyAuctionDetailsDTO {

	String auctionDuration;
	String auctionCost;
	String securityDeposit;

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
		super();
		// TODO Auto-generated constructor stub
	}

}
