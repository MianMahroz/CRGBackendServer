package com.bestercapitalmedia.chiragh.buyer.details;

import javax.validation.constraints.Size;

// TODO: Auto-generated Javadoc
/**
 * The Class PropertyBuyerCurrentAuctionDTO.
 */
public class PropertyBuyerCurrentAuctionDTO {

	/** The property id. */
	private int propertyId;
	
	/** The property title. */
	@Size(min=8,max=25)
	private String propertyTitle;
	
	/** The property description. */
	@Size(min=8,max=25)
	private String propertyDescription;
	
	/** The location. */
	@Size(min=8,max=25)
	private String location;
	
	/** The address. */
	/*@Size(min=8,max=25)
	private float sizePerSqft;*/
	@Size(min=8,max=25)
	private String address;
	
	/** The no of bedrooms. */
	@Size(min=8,max=25)
	/*private float  pricePerSqft;
	@Size(min=1,max=1)*/
	private Integer noOfBedrooms;
	
	/** The no of baths. */
	@Size(min=1,max=1)
	private Integer noOfBaths;
	
	/** The outdoor type. */
	@Size(min=1,max=1)
	private String outdoorType;
	
	/** The is furnished. */
	@Size(min=1,max=1)
	private Integer isFurnished;
	
	/** The kitchen type. */
	@Size(min=1,max=1)
	private Integer kitchenType;
	
	/** The is maid room. */
	@Size(min=1,max=1)
	private Integer isMaidRoom;
	
	/** The is swimming pool. */
	@Size(min=1,max=1)
	private Integer isSwimmingPool;
	
	/** The is gym. */
	@Size(min=1,max=1)
	private Integer isGym;
	
	/** The is heli pad. */
	@Size(min=1,max=1)
	private Integer isHeliPad;
	
	/** The no of parking. */
	@Size(min=1,max=1)
	private Integer noOfParking;
	
	/** The no of floors. */
	@Size(min=1,max=1)
	private Integer noOfFloors;
	
	/** The no units. */
	@Size(min=1,max=1)
	private Integer noUnits;
	
	/** The no shops. */
	@Size(min=1,max=1)
	private Integer noShops;
	
	/** The no facilities. */
	/*@Size(min=1,max=1)
	private float listedPrice;
	@Size(min=1,max=1)
	private float originalPrice;
	@Size(min=8,max=25)*/
	private String noFacilities ;
	
	/** The bid end date. */
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
	
	/** The total bid placed. */
	@Size(min=8,max=25)
	private int totalBidPlaced;
	
	/** The time remaning. */
	@Size(min=8,max=25)
	private String timeRemaning;
	
	/** The bid start date. */
	@Size(min=8,max=25)
	private String bidStartDate;
	
	
	
	

	/**
	 * Instantiates a new property buyer current auction DTO.
	 */
	public PropertyBuyerCurrentAuctionDTO() {
		
	}

	/**
	 * Gets the property title.
	 *
	 * @return the property title
	 */
	public String getPropertyTitle() {
		return propertyTitle;
	}

	/**
	 * Sets the property title.
	 *
	 * @param propertyTitle the new property title
	 */
	public void setPropertyTitle(String propertyTitle) {
		this.propertyTitle = propertyTitle;
	}

	/**
	 * Gets the property description.
	 *
	 * @return the property description
	 */
	public String getPropertyDescription() {
		return propertyDescription;
	}

	/**
	 * Sets the property description.
	 *
	 * @param propertyDescription the new property description
	 */
	public void setPropertyDescription(String propertyDescription) {
		this.propertyDescription = propertyDescription;
	}

	/**
	 * Gets the location.
	 *
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * Sets the location.
	 *
	 * @param location the new location
	 */
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
	
	/**
	 * Gets the no of bedrooms.
	 *
	 * @return the no of bedrooms
	 */
	public Integer getNoOfBedrooms() {
		return noOfBedrooms;
	}

	/**
	 * Sets the no of bedrooms.
	 *
	 * @param noOfBedrooms the new no of bedrooms
	 */
	public void setNoOfBedrooms(Integer noOfBedrooms) {
		this.noOfBedrooms = noOfBedrooms;
	}

	/**
	 * Gets the no of baths.
	 *
	 * @return the no of baths
	 */
	public Integer getNoOfBaths() {
		return noOfBaths;
	}

	/**
	 * Sets the no of baths.
	 *
	 * @param noOfBaths the new no of baths
	 */
	public void setNoOfBaths(Integer noOfBaths) {
		this.noOfBaths = noOfBaths;
	}
	
	/**
	 * Gets the outdoor type.
	 *
	 * @return the outdoor type
	 */
	public String getOutdoorType() {
		return outdoorType;
	}

	/**
	 * Sets the outdoor type.
	 *
	 * @param outdoorType the new outdoor type
	 */
	public void setOutdoorType(String outdoorType) {
		this.outdoorType = outdoorType;
	}

	/**
	 * Gets the checks if is furnished.
	 *
	 * @return the checks if is furnished
	 */
	public int getIsFurnished() {
		return isFurnished;
	}

	/**
	 * Sets the checks if is furnished.
	 *
	 * @param isFurnished the new checks if is furnished
	 */
	public void setIsFurnished(int isFurnished) {
		this.isFurnished = isFurnished;
	}

	/**
	 * Gets the kitchen type.
	 *
	 * @return the kitchen type
	 */
	public int getKitchenType() {
		return kitchenType;
	}

	/**
	 * Sets the kitchen type.
	 *
	 * @param kitchenType the new kitchen type
	 */
	public void setKitchenType(int kitchenType) {
		this.kitchenType = kitchenType;
	}

	/**
	 * Gets the checks if is maid room.
	 *
	 * @return the checks if is maid room
	 */
	public int getIsMaidRoom() {
		return isMaidRoom;
	}

	/**
	 * Sets the checks if is maid room.
	 *
	 * @param isMaidRoom the new checks if is maid room
	 */
	public void setIsMaidRoom(int isMaidRoom) {
		this.isMaidRoom = isMaidRoom;
	}

	/**
	 * Gets the checks if is swimming pool.
	 *
	 * @return the checks if is swimming pool
	 */
	public int getIsSwimmingPool() {
		return isSwimmingPool;
	}

	/**
	 * Sets the checks if is swimming pool.
	 *
	 * @param isSwimmingPool the new checks if is swimming pool
	 */
	public void setIsSwimmingPool(int isSwimmingPool) {
		this.isSwimmingPool = isSwimmingPool;
	}

	/**
	 * Gets the checks if is gym.
	 *
	 * @return the checks if is gym
	 */
	public int getIsGym() {
		return isGym;
	}

	/**
	 * Sets the checks if is gym.
	 *
	 * @param isGym the new checks if is gym
	 */
	public void setIsGym(int isGym) {
		this.isGym = isGym;
	}

	/**
	 * Gets the checks if is heli pad.
	 *
	 * @return the checks if is heli pad
	 */
	public int getIsHeliPad() {
		return isHeliPad;
	}

	/**
	 * Sets the checks if is heli pad.
	 *
	 * @param isHeliPad the new checks if is heli pad
	 */
	public void setIsHeliPad(int isHeliPad) {
		this.isHeliPad = isHeliPad;
	}

	/**
	 * Gets the no of parking.
	 *
	 * @return the no of parking
	 */
	public Integer getNoOfParking() {
		return noOfParking;
	}

	/**
	 * Sets the no of parking.
	 *
	 * @param noOfParking the new no of parking
	 */
	public void setNoOfParking(Integer noOfParking) {
		this.noOfParking = noOfParking;
	}

	/**
	 * Gets the no of floors.
	 *
	 * @return the no of floors
	 */
	public Integer getNoOfFloors() {
		return noOfFloors;
	}

	/**
	 * Sets the no of floors.
	 *
	 * @param noOfFloors the new no of floors
	 */
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

	/**
	 * Gets the no units.
	 *
	 * @return the no units
	 */
	public Integer getNoUnits() {
		return noUnits;
	}

	/**
	 * Sets the no units.
	 *
	 * @param noUnits the new no units
	 */
	public void setNoUnits(Integer noUnits) {
		this.noUnits = noUnits;
	}

	/**
	 * Gets the no shops.
	 *
	 * @return the no shops
	 */
	public Integer getNoShops() {
		return noShops;
	}

	/**
	 * Sets the no shops.
	 *
	 * @param noShops the new no shops
	 */
	public void setNoShops(Integer noShops) {
		this.noShops = noShops;
	}

	/**
	 * Gets the no facilities.
	 *
	 * @return the no facilities
	 */
	public String getNoFacilities() {
		return noFacilities;
	}

	/**
	 * Sets the no facilities.
	 *
	 * @param noFacilities the new no facilities
	 */
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

	
	/**
	 * Sets the checks if is furnished.
	 *
	 * @param isFurnished the new checks if is furnished
	 */
	public void setIsFurnished(Integer isFurnished) {
		this.isFurnished = isFurnished;
	}

	/**
	 * Sets the kitchen type.
	 *
	 * @param kitchenType the new kitchen type
	 */
	public void setKitchenType(Integer kitchenType) {
		this.kitchenType = kitchenType;
	}

	/**
	 * Sets the checks if is maid room.
	 *
	 * @param isMaidRoom the new checks if is maid room
	 */
	public void setIsMaidRoom(Integer isMaidRoom) {
		this.isMaidRoom = isMaidRoom;
	}

	/**
	 * Sets the checks if is swimming pool.
	 *
	 * @param isSwimmingPool the new checks if is swimming pool
	 */
	public void setIsSwimmingPool(Integer isSwimmingPool) {
		this.isSwimmingPool = isSwimmingPool;
	}

	/**
	 * Sets the checks if is gym.
	 *
	 * @param isGym the new checks if is gym
	 */
	public void setIsGym(Integer isGym) {
		this.isGym = isGym;
	}

	/**
	 * Sets the checks if is heli pad.
	 *
	 * @param isHeliPad the new checks if is heli pad
	 */
	public void setIsHeliPad(Integer isHeliPad) {
		this.isHeliPad = isHeliPad;
	}

	
	/**
	 * Gets the time remaning.
	 *
	 * @return the time remaning
	 */
	public String getTimeRemaning() {
		return timeRemaning;
	}

	/**
	 * Sets the time remaning.
	 *
	 * @param timeRemaning the new time remaning
	 */
	public void setTimeRemaning(String timeRemaning) {
		this.timeRemaning = timeRemaning;
	}

	/**
	 * Gets the property id.
	 *
	 * @return the property id
	 */
	public int getPropertyId() {
		return propertyId;
	}

	/**
	 * Sets the property id.
	 *
	 * @param propertyId the new property id
	 */
	public void setPropertyId(int propertyId) {
		this.propertyId = propertyId;
	}

	/**
	 * Gets the address.
	 *
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * Sets the address.
	 *
	 * @param address the new address
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * Gets the total bid placed.
	 *
	 * @return the total bid placed
	 */
	public int getTotalBidPlaced() {
		return totalBidPlaced;
	}

	/**
	 * Sets the total bid placed.
	 *
	 * @param totalBidPlaced the new total bid placed
	 */
	public void setTotalBidPlaced(int totalBidPlaced) {
		this.totalBidPlaced = totalBidPlaced;
	}

	/**
	 * Gets the bid end date.
	 *
	 * @return the bid end date
	 */
	public String getBidEndDate() {
		return bidEndDate;
	}

	/**
	 * Sets the bid end date.
	 *
	 * @param bidEndDate the new bid end date
	 */
	public void setBidEndDate(String bidEndDate) {
		this.bidEndDate = bidEndDate;
	}

	/**
	 * Gets the bid start date.
	 *
	 * @return the bid start date
	 */
	public String getBidStartDate() {
		return bidStartDate;
	}

	/**
	 * Sets the bid start date.
	 *
	 * @param bidStartDate the new bid start date
	 */
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
