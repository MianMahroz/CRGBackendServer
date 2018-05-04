package com.bestercapitalmedia.chiragh.dtoAndServices;

public class AuctionFeesDetailsDTO {
	
	
	
	private String auctionCost;
	private String auctionDuration;
	private String securityDeposit;
	
	public String getAuctionDuration() {
		return this.auctionDuration;
	}
	
	public void setAuctionDuration(String auctionDuration) {
		this.auctionDuration = auctionDuration;
	}

	
	public void setAuctionCost(String auctionCost) {
		this.auctionCost = auctionCost;
	}

	/**
	 */
	public String getAuctionCost() {
		return this.auctionCost;
	}
	
	public void setSecurityDeposit(String securityDeposit) {
		this.securityDeposit = securityDeposit;
	}

	/**
	 */
	public String getSecurityDeposit() {
		return this.securityDeposit;
	}

}
