package com.bestercapitalmedia.chiragh.dtoAndServices;

import javax.validation.constraints.Size;

public class HomePageCurrentAuctionsDTO {
	
	
	private int propertyId;
	@Size(min=8,max=25)
	private String propertyTitle;
	@Size(min=8,max=25)
	private String propertyDescription;
	@Size(min=8,max=25)
	private String location;
	@Size(min=8,max=25)
	private float sizePerSqft;
	@Size(min=8,max=25)
	private String address;
	@Size(min=8,max=25)
	private float  pricePerSqft;
	@Size(min=1,max=1)
	private Integer noOfBedrooms;
	@Size(min=1,max=1)
	private Integer noOfBaths;
	@Size(min=1,max=1)
	private String outdoorType;
	@Size(min=1,max=1)
	private Integer isFurnished;
	@Size(min=1,max=1)
	private Integer kitchenType;
	@Size(min=1,max=1)
	private Integer isMaidRoom;
	@Size(min=1,max=1)
	private Integer isSwimmingPool;
	@Size(min=1,max=1)
	private Integer isGym;
	@Size(min=1,max=1)
	private Integer isHeliPad;
	@Size(min=1,max=1)
	private Integer noOfParking;
	@Size(min=1,max=1)
	private Integer noOfFloors;
	@Size(min=1,max=1)
	private Integer noUnits;
	@Size(min=1,max=1)
	private Integer noShops;
	@Size(min=8,max=25)
	private String noFacilities ;
	@Size(min=8,max=25)
	private String bidEndDate;
	@Size(min=8,max=25)
	private int totalBidPlaced;
	@Size(min=8,max=25)
	private String timeRemaning;
	@Size(min=8,max=25)
	private String bidStartDate;
	public int getPropertyId() {
		return propertyId;
	}
	public void setPropertyId(int propertyId) {
		this.propertyId = propertyId;
	}
	public String getPropertyTitle() {
		return propertyTitle;
	}
	public void setPropertyTitle(String propertyTitle) {
		this.propertyTitle = propertyTitle;
	}
	public String getPropertyDescription() {
		return propertyDescription;
	}
	public void setPropertyDescription(String propertyDescription) {
		this.propertyDescription = propertyDescription;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public float getSizePerSqft() {
		return sizePerSqft;
	}
	public void setSizePerSqft(float sizePerSqft) {
		this.sizePerSqft = sizePerSqft;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public float getPricePerSqft() {
		return pricePerSqft;
	}
	public void setPricePerSqft(float pricePerSqft) {
		this.pricePerSqft = pricePerSqft;
	}
	public Integer getNoOfBedrooms() {
		return noOfBedrooms;
	}
	public void setNoOfBedrooms(Integer noOfBedrooms) {
		this.noOfBedrooms = noOfBedrooms;
	}
	public Integer getNoOfBaths() {
		return noOfBaths;
	}
	public void setNoOfBaths(Integer noOfBaths) {
		this.noOfBaths = noOfBaths;
	}
	public String getOutdoorType() {
		return outdoorType;
	}
	public void setOutdoorType(String outdoorType) {
		this.outdoorType = outdoorType;
	}
	public Integer getIsFurnished() {
		return isFurnished;
	}
	public void setIsFurnished(Integer isFurnished) {
		this.isFurnished = isFurnished;
	}
	public Integer getKitchenType() {
		return kitchenType;
	}
	public void setKitchenType(Integer kitchenType) {
		this.kitchenType = kitchenType;
	}
	public Integer getIsMaidRoom() {
		return isMaidRoom;
	}
	public void setIsMaidRoom(Integer isMaidRoom) {
		this.isMaidRoom = isMaidRoom;
	}
	public Integer getIsSwimmingPool() {
		return isSwimmingPool;
	}
	public void setIsSwimmingPool(Integer isSwimmingPool) {
		this.isSwimmingPool = isSwimmingPool;
	}
	public Integer getIsGym() {
		return isGym;
	}
	public void setIsGym(Integer isGym) {
		this.isGym = isGym;
	}
	public Integer getIsHeliPad() {
		return isHeliPad;
	}
	public void setIsHeliPad(Integer isHeliPad) {
		this.isHeliPad = isHeliPad;
	}
	public Integer getNoOfParking() {
		return noOfParking;
	}
	public void setNoOfParking(Integer noOfParking) {
		this.noOfParking = noOfParking;
	}
	public Integer getNoOfFloors() {
		return noOfFloors;
	}
	public void setNoOfFloors(Integer noOfFloors) {
		this.noOfFloors = noOfFloors;
	}
	public Integer getNoUnits() {
		return noUnits;
	}
	public void setNoUnits(Integer noUnits) {
		this.noUnits = noUnits;
	}
	public Integer getNoShops() {
		return noShops;
	}
	public void setNoShops(Integer noShops) {
		this.noShops = noShops;
	}
	public String getNoFacilities() {
		return noFacilities;
	}
	public void setNoFacilities(String noFacilities) {
		this.noFacilities = noFacilities;
	}
	public String getBidEndDate() {
		return bidEndDate;
	}
	public void setBidEndDate(String bidEndDate) {
		this.bidEndDate = bidEndDate;
	}
	public int getTotalBidPlaced() {
		return totalBidPlaced;
	}
	public void setTotalBidPlaced(int totalBidPlaced) {
		this.totalBidPlaced = totalBidPlaced;
	}
	public String getTimeRemaning() {
		return timeRemaning;
	}
	public void setTimeRemaning(String timeRemaning) {
		this.timeRemaning = timeRemaning;
	}
	public String getBidStartDate() {
		return bidStartDate;
	}
	public void setBidStartDate(String bidStartDate) {
		this.bidStartDate = bidStartDate;
	}

}
