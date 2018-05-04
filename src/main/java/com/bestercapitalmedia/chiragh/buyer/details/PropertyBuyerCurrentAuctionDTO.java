package com.bestercapitalmedia.chiragh.buyer.details;

import javax.validation.constraints.Size;

public class PropertyBuyerCurrentAuctionDTO {

	private int propertyId;
	@Size(min=8,max=25)
	private String propertyTitle;
	@Size(min=8,max=25)
	private String propertyDescription;
	@Size(min=8,max=25)
	private String location;
	/*@Size(min=8,max=25)
	private float sizePerSqft;*/
	@Size(min=8,max=25)
	private String address;
	@Size(min=8,max=25)
	/*private float  pricePerSqft;
	@Size(min=1,max=1)*/
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
	/*@Size(min=1,max=1)
	private float listedPrice;
	@Size(min=1,max=1)
	private float originalPrice;
	@Size(min=8,max=25)*/
	private String noFacilities ;
	@Size(min=8,max=25)
	/*private String propertyAge;
	@Size(min=8,max=25)
	private String communityNo;*/
	@Size(min=8,max=25)
	/*private String mapLocation;
	@Size(min=8,max=25)
	private String plotNo;
	@Size(min=8,max=25)
	private String typeArea;
	@Size(min=8,max=25)
	private String projectName;*/
	@Size(min=8,max=25)
	private String bidEndDate;
	@Size(min=8,max=25)
	private int totalBidPlaced;
	@Size(min=8,max=25)
	private String timeRemaning;
	@Size(min=8,max=25)
	private String bidStartDate;
	
	
	
	

	public PropertyBuyerCurrentAuctionDTO() {
		
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

	/*public float getSizePerSqft() {
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
	}*/
	
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

	public int getIsFurnished() {
		return isFurnished;
	}

	public void setIsFurnished(int isFurnished) {
		this.isFurnished = isFurnished;
	}

	public int getKitchenType() {
		return kitchenType;
	}

	public void setKitchenType(int kitchenType) {
		this.kitchenType = kitchenType;
	}

	public int getIsMaidRoom() {
		return isMaidRoom;
	}

	public void setIsMaidRoom(int isMaidRoom) {
		this.isMaidRoom = isMaidRoom;
	}

	public int getIsSwimmingPool() {
		return isSwimmingPool;
	}

	public void setIsSwimmingPool(int isSwimmingPool) {
		this.isSwimmingPool = isSwimmingPool;
	}

	public int getIsGym() {
		return isGym;
	}

	public void setIsGym(int isGym) {
		this.isGym = isGym;
	}

	public int getIsHeliPad() {
		return isHeliPad;
	}

	public void setIsHeliPad(int isHeliPad) {
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
	
	/*public String getMapLocation() {
		return mapLocation;
	}

	public void setMapLocation(String mapLocation) {
		this.mapLocation = mapLocation;
	}

	public String getPlotNo() {
		return plotNo;
	}

	public void setPlotNo(String plotNo) {
		this.plotNo = plotNo;
	}

	public String getTypeArea() {
		return typeArea;
	}

	public void setTypeArea(String typeArea) {
		this.typeArea = typeArea;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	
	public String getPresentUse() {
		return presentUse;
	}

	public void setPresentUse(String presentUse) {
		this.presentUse = presentUse;
	}*/

	/*public String getCommunityNo() {
		return communityNo;
	}

	public void setCommunityNo(String communityNo) {
		this.communityNo = communityNo;
	}

	public String getPropertyAge() {
		return propertyAge;
	}

	public void setPropertyAge(String propertyAge) {
		this.propertyAge = propertyAge;
	}*/

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
	
	/*public float getListedPrice() {
		return listedPrice;
	}

	public void setListedPrice(float listedPrice) {
		this.listedPrice = listedPrice;
	}

	public float getOriginalPrice() {
		return originalPrice;
	}

	public void setOriginalPrice(float originalPrice) {
		this.originalPrice = originalPrice;
	}*/

	
	public void setIsFurnished(Integer isFurnished) {
		this.isFurnished = isFurnished;
	}

	public void setKitchenType(Integer kitchenType) {
		this.kitchenType = kitchenType;
	}

	public void setIsMaidRoom(Integer isMaidRoom) {
		this.isMaidRoom = isMaidRoom;
	}

	public void setIsSwimmingPool(Integer isSwimmingPool) {
		this.isSwimmingPool = isSwimmingPool;
	}

	public void setIsGym(Integer isGym) {
		this.isGym = isGym;
	}

	public void setIsHeliPad(Integer isHeliPad) {
		this.isHeliPad = isHeliPad;
	}

	
	public String getTimeRemaning() {
		return timeRemaning;
	}

	public void setTimeRemaning(String timeRemaning) {
		this.timeRemaning = timeRemaning;
	}

	public int getPropertyId() {
		return propertyId;
	}

	public void setPropertyId(int propertyId) {
		this.propertyId = propertyId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getTotalBidPlaced() {
		return totalBidPlaced;
	}

	public void setTotalBidPlaced(int totalBidPlaced) {
		this.totalBidPlaced = totalBidPlaced;
	}

	public String getBidEndDate() {
		return bidEndDate;
	}

	public void setBidEndDate(String bidEndDate) {
		this.bidEndDate = bidEndDate;
	}

	public String getBidStartDate() {
		return bidStartDate;
	}

	public void setBidStartDate(String bidStartDate) {
		this.bidStartDate = bidStartDate;
	}

	/*public String getBidStartDate() {
		return bidStartDate;
	}

	public void setBidStartDate(String bidStartDate) {
		this.bidStartDate = bidStartDate;
	}

	public String getBidEndDate() {
		return bidEndDate;
	}

	public void setBidEndDate(String bidEndDate) {
		this.bidEndDate = bidEndDate;
	}

	public String getAuctionDuration() {
		return auctionDuration;
	}

	public void setAuctionDuration(String auctionDuration) {
		this.auctionDuration = auctionDuration;
	}*/

}
