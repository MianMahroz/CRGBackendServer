package com.bestercapitalmedia.chiragh.property;

import java.util.Calendar;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
// TODO: Auto-generated Javadoc

/**
 * The Class ChiraghPropertyDetailsDTO.
 */
public class ChiraghPropertyDetailsDTO {
	
	/** The user name. */
	private String userName;
	private String isPropertyDetailsVerified;
	private String isPOADetailsVerified;
	private String isPersonalDetailsVerified;
	private String isAcknowledgementCall;
	String lastActionPerformed;
	Date lastAction;
	String actionPerformedBy;
	
	
	/** The property id. */
	private int propertyId;
	
	/**
	 * Gets the user name.
	 *
	 * @return the user name
	 */
	public String getUserName() {
		return userName;
	}
	
	/**
	 * Sets the user name.
	 *
	 * @param userName the new user name
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	/** The area. */
	private String area;
	
	/** The type title. */
	private String typeTitle;
	
	/** The property title. */
	private String propertyTitle;
	
	/** The property description. */
	private String propertyDescription;
	
	/** The property no. */
	private String propertyNo;
	
	/** The built in wardrobes. */
	private String builtInWardrobes;
	
	/** The maid room. */
	private String maidRoom;
	
	/** The property status. */
	private String propertyStatus;
	
	/** The property type. */
	private String propertyType;
	
	/** The location. */
	private String location;
	
	/** The size per sqft. */
	private float sizePerSqft;
	
	/** The address. */
	private String address;
	
	/** The asking price. */
	private float askingPrice;
	
	/** The area permit no. */
	private String areaPermitNo;
	
	/** The property reference no. */
	private String propertyReferenceNo;
	
	/** The price per sqft. */
	private float pricePerSqft;
	
	/** The no of bedrooms. */
	private Integer noOfBedrooms;
	
	/** The no of baths. */
	private Integer noOfBaths;
	
	/** The floor no. */
	private Integer floorNo;
	
	/** The kitchens. */
	private Integer kitchens;
	
	/** The car parks. */
	private Integer carParks;
	
	/** The public parking. */
	private int publicParking;
	
	/** The balcony. */
	private String balcony;
	
	/** The basement parking. */
	private String basementParking;
	
	/** The bbq area. */
	private String bbqArea;
	
	/** The broadband ready. */
	private String broadbandReady;
	
	/** The no of floors. */
	private Integer noOfFloors;
	
	/** The scanned title deed. */
	private String scannedTitleDeed;
	
	/** The agree vat commission. */
	private int agreeVatCommission;
	
	/** The map location. */
	private String mapLocation;
	
	/** The plot no. */
	private String plotNo;
	
	/** The title deed no. */
	private String titleDeedNo;
	
	/** The type area. */
	private String typeArea;
	
	/** The project name. */
	private String projectName;
	
	/** The owner association no. */
	private String ownerAssociationNo;
	
	/** The present use. */
	private String presentUse;
	
	/** The community no. */
	private String communityNo;
	
	/** The property age. */
	private String propertyAge;
	
	/** The no units. */
	private Integer noUnits;
	
	/** The no shops. */
	private Integer noShops;
	
	/** The third party verification. */
	private String thirdPartyVerification;
	
	/** The is third party payment. */
	private String isThirdPartyPayment;
	
	/** The verification hod approved. */
	private String verificationHodApproved;
	
//	String	isPropertyFinancialDetailsVerified;
//	
//	String	isPropertyRentalDetailsVerified;
	
	/** The valuation report document. */
	private String valuationReportDocument;
	
	/** The valuation hod approved. */
	private int valuationHodApproved;
	
	/** The listed price. */
	private float listedPrice;
	
	/** The original price. */
	private float originalPrice;
	
	/** The paid amount. */
	private float paidAmount;
	
	/** The service charge. */
	private float serviceCharge;
	
	/** The payment schedule. */
	private String paymentSchedule;
	
	
	
	/** The carpets. */
	private String carpets;
	
	/** The central air conditioning. */
	private String centralAirConditioning;
	
	/** The central heating. */
	private String centralHeating;
	
	/** The community view. */
	private String communityView;
	
	/** The covered parking. */
	private String coveredParking;
	
	/** The driver room. */
	private String driverRoom;
	
	/** The fully fitted kitchen. */
	private String fullyFittedKitchen;
	
	/** The fully furnished. */
	private String fullyFurnished;
	
	/** The gymnasium. */
	private String gymnasium;
	
	/** The intercom. */
	private String intercom;
	
	/** The jacuzzi. */
	private String jacuzzi;
	
	/** The on high floor. */
	private String onHighFloor;
	
	/** The public transport. */
	private String publicTransport;
	
	/** The recreational facilities. */
	private String recreationalFacilities;
	
	/** The restaurants. */
	private String restaurants;
	
	/** The school. */
	private String school;
	
	/** The shopping mall. */
	private String shoppingMall;
	
	/** The shops. */
	private String shops;
	
	/** The sports academies. */
	private String sportsAcademies;
	
	/** The squash courts. */
	private String squashCourts;
	
	/** The tennis courts. */
	private String tennisCourts;
	
	/** The valet service. */
	private String valetService;
	
	/** The laundry washing room. */
	private String laundryWashingRoom;
	
	/** The walking trails. */
	private String walkingTrails;
	
	/** The schools in neighbourhood. */
	private String schoolsInNeighbourhood;
	
	/** The metros. */
	private String metros;
	
	/** The medical centers. */
	private String medicalCenters;
	
	/** The shopping malls. */
	private String shoppingMalls;
	
	/** The mosques in neighbourhood. */
	private String mosquesInNeighbourhood;
	
	/** The beaches. */
	private String beaches;
	
	/** The supermarkets. */
	private String supermarkets;
	
	/** The pets allowed. */
	private String petsAllowed;
	
	/** The marble floors. */
	private String marbleFloors;
	
	/** The on low floor. */
	private String onLowFloor;
	
	/** The on mid floor. */
	private String onMidFloor;
	
	/** The part furnished. */
	private String partFurnished;
	
	/** The private garage. */
	private String privateGarage;
	
	/** The private garden. */
	private String privateGarden;
	
	/** The satellite cable TV. */
	private String satelliteCableTV;
	
	/** The sauna. */
	private String sauna;
	
	/** The solid wood floors. */
	private String solidWoodFloors;
	
	/** The steam room. */
	private String steamRoom;
	
	/** The storage room. */
	private String storageRoom;
	
	/** The study. */
	private String study;
	
	/** The upgraded interior. */
	private String upgradedInterior;
	
	/** The view of gardens. */
	private String viewOfGardens;
	
	/** The view of golfcourse. */
	private String viewOfGolfcourse;
	
	/** The view of parkland. */
	private String viewOfParkland;
	
	/** The view of sea water. */
	private String viewOfSeaWater;
	
	/** The laundrywashing room. */
	private String laundrywashingRoom;
	
	/** The private swimming pool. */
	private String privateSwimmingPool;
	
	/** The shared swimming pool. */
	private String sharedSwimmingPool;
	
	/** The gazebo and outdoor entertaining area. */
	private String gazeboAndOutdoorEntertainingArea;
	
	/** The kitchen white goods. */
	private String kitchenWhiteGoods;
	
	/** The landscaped garden. */
	private String landscapedGarden;
	
	/** The Hours maintenance. */
	private String HoursMaintenance;
	
	/** The bankatm facility. */
	private String bankatmFacility;
	
	/** The basketball court. */
	private String basketballCourt;
	
	/** The beach access. */
	private String beachAccess;
	
	/** The bus services. */
	private String busServices;
	
	/** The business center. */
	private String businessCenter;
	
	/** The children nursery. */
	private String childrenNursery;
	
	/** The children play area. */
	private String childrenPlayArea;
	
	/** The clubhouse. */
	private String clubhouse;
	
	/** The communal gardens. */
	private String communalGardens;
	
	/** The concierge service. */
	private String conciergeService;
	
	/** The cycling tracks. */
	private String cyclingTracks;
	
	/** The fitness center. */
	private String fitnessCenter;
	
	/** The golf club and clubhouse. */
	private String golfClubAndClubhouse;
	
	/** The laundry service. */
	private String laundryService;
	
	/** The marina berth. */
	private String marinaBerth;
	
	/** The metro station. */
	private String metroStation;
	
	/** The mosque. */
	private String mosque;
	
	/** The polo club and clubhouse. */
	private String poloClubAndClubhouse;
	
	/** The public park. */
	private String publicPark;
	
	/** The park. */
	private String park;
	
	/** The morgage status. */
	//financial Dto
	String morgageStatus;
	
	/** The morgage reg no. */
	String morgageRegNo;
	
	/** The bank. */
	String bank;
	
	/** The morgage amount. */
	float morgageAmount;
	
	/** The pre closure charges. */
	float preClosureCharges;
	
	/** The date. */
	Calendar date;
	
	/** The amount. */
	float amount;
	
	/** The morgage noc. */
	String morgageNoc;
	
	/** The balance amount. */
	float balanceAmount;
	
	/** The lease start date. */
	//rental dto
	Calendar leaseStartDate;
	
	/** The lease expiry date. */
	Calendar leaseExpiryDate;
	
	/** The tenant name. */
	String tenantName;
	
	/** The tenancy contract upload. */
	String tenancyContractUpload;
	
	/** The is rented. */
	String isRented;
	
	/** The is vacant. */
	String isVacant;
	
	/** The rental ejari no. */
	Integer rentalEjariNo;
	
	/** The rental annual rent. */
	float rentalAnnualRent;
	
	/** The rental payment checks. */
	Integer rentalPaymentChecks;
	
	/** The payment structure. */
	String paymentStructure;
	
	String status;
	
	String sellerUserName;
	/**
	 * Gets the statusval.
	 *
	 * @return the statusval
	 */

	
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
	 * Gets the property status.
	 *
	 * @return the property status
	 */
	public String getPropertyStatus() {
		return propertyStatus;
	}
	
	/**
	 * Sets the property status.
	 *
	 * @param propertyStatus the new property status
	 */
	public void setPropertyStatus(String propertyStatus) {
		this.propertyStatus = propertyStatus;
	}
	
	
	/**
	 * Sets the location.
	 *
	 * @param location the new location
	 */
	public void setLocation(String location) {
		this.location = location;
	}
	
	/**
	 * Gets the size per sqft.
	 *
	 * @return the size per sqft
	 */
	public float getSizePerSqft() {
		return sizePerSqft;
	}
	
	/**
	 * Sets the size per sqft.
	 *
	 * @param sizePerSqft the new size per sqft
	 */
	public void setSizePerSqft(float sizePerSqft) {
		this.sizePerSqft = sizePerSqft;
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
	 * Gets the asking price.
	 *
	 * @return the asking price
	 */
	public float getAskingPrice() {
		return askingPrice;
	}
	
	/**
	 * Sets the asking price.
	 *
	 * @param askingPrice the new asking price
	 */
	public void setAskingPrice(float askingPrice) {
		this.askingPrice = askingPrice;
	}
	
	/**
	 * Gets the area permit no.
	 *
	 * @return the area permit no
	 */
	public String getAreaPermitNo() {
		return areaPermitNo;
	}
	
	/**
	 * Sets the area permit no.
	 *
	 * @param areaPermitNo the new area permit no
	 */
	public void setAreaPermitNo(String areaPermitNo) {
		this.areaPermitNo = areaPermitNo;
	}
	
	/**
	 * Gets the property reference no.
	 *
	 * @return the property reference no
	 */
	public String getPropertyReferenceNo() {
		return propertyReferenceNo;
	}
	
	/**
	 * Sets the property reference no.
	 *
	 * @param propertyReferenceNo the new property reference no
	 */
	public void setPropertyReferenceNo(String propertyReferenceNo) {
		this.propertyReferenceNo = propertyReferenceNo;
	}
	
	/**
	 * Gets the price per sqft.
	 *
	 * @return the price per sqft
	 */
	public float getPricePerSqft() {
		return pricePerSqft;
	}
	
	/**
	 * Sets the price per sqft.
	 *
	 * @param pricePerSqft the new price per sqft
	 */
	public void setPricePerSqft(float pricePerSqft) {
		this.pricePerSqft = pricePerSqft;
	}
	
	
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
	
	/**
	 * Gets the scanned title deed.
	 *
	 * @return the scanned title deed
	 */
	public String getScannedTitleDeed() {
		return scannedTitleDeed;
	}
	
	/**
	 * Sets the scanned title deed.
	 *
	 * @param scannedTitleDeed the new scanned title deed
	 */
	public void setScannedTitleDeed(String scannedTitleDeed) {
		this.scannedTitleDeed = scannedTitleDeed;
	}
	
	/**
	 * Gets the agree vat commission.
	 *
	 * @return the agree vat commission
	 */
	public int getAgreeVatCommission() {
		return agreeVatCommission;
	}
	
	/**
	 * Sets the agree vat commission.
	 *
	 * @param agreeVatCommission the new agree vat commission
	 */
	public void setAgreeVatCommission(int agreeVatCommission) {
		this.agreeVatCommission = agreeVatCommission;
	}
	
	/**
	 * Gets the map location.
	 *
	 * @return the map location
	 */
	public String getMapLocation() {
		return mapLocation;
	}
	
	/**
	 * Sets the map location.
	 *
	 * @param mapLocation the new map location
	 */
	public void setMapLocation(String mapLocation) {
		this.mapLocation = mapLocation;
	}
	
	/**
	 * Gets the plot no.
	 *
	 * @return the plot no
	 */
	public String getPlotNo() {
		return plotNo;
	}
	
	/**
	 * Sets the plot no.
	 *
	 * @param plotNo the new plot no
	 */
	public void setPlotNo(String plotNo) {
		this.plotNo = plotNo;
	}
	
	/**
	 * Gets the title deed no.
	 *
	 * @return the title deed no
	 */
	public String getTitleDeedNo() {
		return titleDeedNo;
	}
	
	/**
	 * Sets the title deed no.
	 *
	 * @param titleDeedNo the new title deed no
	 */
	public void setTitleDeedNo(String titleDeedNo) {
		this.titleDeedNo = titleDeedNo;
	}
	
	/**
	 * Gets the type area.
	 *
	 * @return the type area
	 */
	public String getTypeArea() {
		return typeArea;
	}
	
	/**
	 * Sets the type area.
	 *
	 * @param typeArea the new type area
	 */
	public void setTypeArea(String typeArea) {
		this.typeArea = typeArea;
	}
	
	/**
	 * Gets the project name.
	 *
	 * @return the project name
	 */
	public String getProjectName() {
		return projectName;
	}
	
	/**
	 * Sets the project name.
	 *
	 * @param projectName the new project name
	 */
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	
	/**
	 * Gets the owner association no.
	 *
	 * @return the owner association no
	 */
	public String getOwnerAssociationNo() {
		return ownerAssociationNo;
	}
	
	/**
	 * Sets the owner association no.
	 *
	 * @param ownerAssociationNo the new owner association no
	 */
	public void setOwnerAssociationNo(String ownerAssociationNo) {
		this.ownerAssociationNo = ownerAssociationNo;
	}
	
	/**
	 * Gets the present use.
	 *
	 * @return the present use
	 */
	public String getPresentUse() {
		return presentUse;
	}
	
	/**
	 * Sets the present use.
	 *
	 * @param presentUse the new present use
	 */
	public void setPresentUse(String presentUse) {
		this.presentUse = presentUse;
	}
	
	/**
	 * Gets the community no.
	 *
	 * @return the community no
	 */
	public String getCommunityNo() {
		return communityNo;
	}
	
	/**
	 * Sets the community no.
	 *
	 * @param communityNo the new community no
	 */
	public void setCommunityNo(String communityNo) {
		this.communityNo = communityNo;
	}
	
	/**
	 * Gets the property age.
	 *
	 * @return the property age
	 */
	public String getPropertyAge() {
		return propertyAge;
	}
	
	/**
	 * Sets the property age.
	 *
	 * @param propertyAge the new property age
	 */
	public void setPropertyAge(String propertyAge) {
		this.propertyAge = propertyAge;
	}
	
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
	 * Gets the third party verification.
	 *
	 * @return the third party verification
	 */
	
	/**
	 * Gets the valuation report document.
	 *
	 * @return the valuation report document
	 */
	public String getValuationReportDocument() {
		return valuationReportDocument;
	}
	
	/**
	 * Sets the valuation report document.
	 *
	 * @param valuationReportDocument the new valuation report document
	 */
	public void setValuationReportDocument(String valuationReportDocument) {
		this.valuationReportDocument = valuationReportDocument;
	}
	
	/**
	 * Gets the valuation hod approved.
	 *
	 * @return the valuation hod approved
	 */
	public int getValuationHodApproved() {
		return valuationHodApproved;
	}
	
	/**
	 * Sets the valuation hod approved.
	 *
	 * @param valuationHodApproved the new valuation hod approved
	 */
	public void setValuationHodApproved(int valuationHodApproved) {
		this.valuationHodApproved = valuationHodApproved;
	}
	
	/**
	 * Gets the listed price.
	 *
	 * @return the listed price
	 */
	public float getListedPrice() {
		return listedPrice;
	}
	
	/**
	 * Sets the listed price.
	 *
	 * @param listedPrice the new listed price
	 */
	public void setListedPrice(float listedPrice) {
		this.listedPrice = listedPrice;
	}
	
	/**
	 * Gets the original price.
	 *
	 * @return the original price
	 */
	public float getOriginalPrice() {
		return originalPrice;
	}
	
	/**
	 * Sets the original price.
	 *
	 * @param originalPrice the new original price
	 */
	public void setOriginalPrice(float originalPrice) {
		this.originalPrice = originalPrice;
	}
	
	/**
	 * Gets the paid amount.
	 *
	 * @return the paid amount
	 */
	public float getPaidAmount() {
		return paidAmount;
	}
	
	/**
	 * Sets the paid amount.
	 *
	 * @param paidAmount the new paid amount
	 */
	public void setPaidAmount(float paidAmount) {
		this.paidAmount = paidAmount;
	}
	
	/**
	 * Gets the service charge.
	 *
	 * @return the service charge
	 */
	public float getServiceCharge() {
		return serviceCharge;
	}
	
	/**
	 * Sets the service charge.
	 *
	 * @param serviceCharge the new service charge
	 */
	public void setServiceCharge(float serviceCharge) {
		this.serviceCharge = serviceCharge;
	}

	
	/**
	 * Instantiates a new chiragh property details DTO.
	 */
	public ChiraghPropertyDetailsDTO() {
	
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
	 * Gets the type title.
	 *
	 * @return the type title
	 */
	public String getTypeTitle() {
		return typeTitle;
	}
	
	/**
	 * Sets the type title.
	 *
	 * @param typeTitle the new type title
	 */
	public void setTypeTitle(String typeTitle) {
		this.typeTitle = typeTitle;
	}
	
	/**
	 * Gets the floor no.
	 *
	 * @return the floor no
	 */
	public Integer getFloorNo() {
		return floorNo;
	}
	
	/**
	 * Sets the floor no.
	 *
	 * @param floorNo the new floor no
	 */
	public void setFloorNo(Integer floorNo) {
		this.floorNo = floorNo;
	}
	
	/**
	 * Gets the kitchens.
	 *
	 * @return the kitchens
	 */
	public Integer getKitchens() {
		return kitchens;
	}
	
	/**
	 * Sets the kitchens.
	 *
	 * @param kitchens the new kitchens
	 */
	public void setKitchens(Integer kitchens) {
		this.kitchens = kitchens;
	}
	
	/**
	 * Gets the car parks.
	 *
	 * @return the car parks
	 */
	public Integer getCarParks() {
		return carParks;
	}
	
	/**
	 * Sets the car parks.
	 *
	 * @param carParks the new car parks
	 */
	public void setCarParks(Integer carParks) {
		this.carParks = carParks;
	}
	
	/**
	 * Gets the public parking.
	 *
	 * @return the public parking
	 */
	public int getPublicParking() {
		return publicParking;
	}
	
	/**
	 * Sets the public parking.
	 *
	 * @param publicParking the new public parking
	 */
	public void setPublicParking(int publicParking) {
		this.publicParking = publicParking;
	}
	
	/**
	 * Gets the property type.
	 *
	 * @return the property type
	 */
	public String getPropertyType() {
		return propertyType;
	}
	
	/**
	 * Sets the property type.
	 *
	 * @param propertyType the new property type
	 */
	public void setPropertyType(String propertyType) {
		this.propertyType = propertyType;
	}
	
	/**
	 * Gets the property no.
	 *
	 * @return the property no
	 */
	public String getPropertyNo() {
		return propertyNo;
	}
	
	/**
	 * Sets the property no.
	 *
	 * @param propertyNo the new property no
	 */
	public void setPropertyNo(String propertyNo) {
		this.propertyNo = propertyNo;
	}
	
	/**
	 * Gets the balcony.
	 *
	 * @return the balcony
	 */
	public String getBalcony() {
		return balcony;
	}
	
	/**
	 * Sets the balcony.
	 *
	 * @param balcony the new balcony
	 */
	public void setBalcony(String balcony) {
		this.balcony = balcony;
	}
	
	/**
	 * Gets the basement parking.
	 *
	 * @return the basement parking
	 */
	public String getBasementParking() {
		return basementParking;
	}
	
	/**
	 * Sets the basement parking.
	 *
	 * @param basementParking the new basement parking
	 */
	public void setBasementParking(String basementParking) {
		this.basementParking = basementParking;
	}
	
	/**
	 * Gets the bbq area.
	 *
	 * @return the bbq area
	 */
	public String getBbqArea() {
		return bbqArea;
	}
	
	/**
	 * Sets the bbq area.
	 *
	 * @param bbqArea the new bbq area
	 */
	public void setBbqArea(String bbqArea) {
		this.bbqArea = bbqArea;
	}
	
	/**
	 * Gets the broadband ready.
	 *
	 * @return the broadband ready
	 */
	public String getBroadbandReady() {
		return broadbandReady;
	}
	
	/**
	 * Sets the broadband ready.
	 *
	 * @param broadbandReady the new broadband ready
	 */
	public void setBroadbandReady(String broadbandReady) {
		this.broadbandReady = broadbandReady;
	}
	
	/**
	 * Gets the carpets.
	 *
	 * @return the carpets
	 */
	public String getCarpets() {
		return carpets;
	}
	
	/**
	 * Sets the carpets.
	 *
	 * @param carpets the new carpets
	 */
	public void setCarpets(String carpets) {
		this.carpets = carpets;
	}
	
	/**
	 * Gets the central air conditioning.
	 *
	 * @return the central air conditioning
	 */
	public String getCentralAirConditioning() {
		return centralAirConditioning;
	}
	
	/**
	 * Sets the central air conditioning.
	 *
	 * @param centralAirConditioning the new central air conditioning
	 */
	public void setCentralAirConditioning(String centralAirConditioning) {
		this.centralAirConditioning = centralAirConditioning;
	}
	
	/**
	 * Gets the central heating.
	 *
	 * @return the central heating
	 */
	public String getCentralHeating() {
		return centralHeating;
	}
	
	/**
	 * Sets the central heating.
	 *
	 * @param centralHeating the new central heating
	 */
	public void setCentralHeating(String centralHeating) {
		this.centralHeating = centralHeating;
	}
	
	/**
	 * Gets the community view.
	 *
	 * @return the community view
	 */
	public String getCommunityView() {
		return communityView;
	}
	
	/**
	 * Sets the community view.
	 *
	 * @param communityView the new community view
	 */
	public void setCommunityView(String communityView) {
		this.communityView = communityView;
	}
	
	/**
	 * Gets the covered parking.
	 *
	 * @return the covered parking
	 */
	public String getCoveredParking() {
		return coveredParking;
	}
	
	/**
	 * Sets the covered parking.
	 *
	 * @param coveredParking the new covered parking
	 */
	public void setCoveredParking(String coveredParking) {
		this.coveredParking = coveredParking;
	}
	
	/**
	 * Gets the driver room.
	 *
	 * @return the driver room
	 */
	public String getDriverRoom() {
		return driverRoom;
	}
	
	/**
	 * Sets the driver room.
	 *
	 * @param driverRoom the new driver room
	 */
	public void setDriverRoom(String driverRoom) {
		this.driverRoom = driverRoom;
	}
	
	/**
	 * Gets the fully fitted kitchen.
	 *
	 * @return the fully fitted kitchen
	 */
	public String getFullyFittedKitchen() {
		return fullyFittedKitchen;
	}
	
	/**
	 * Sets the fully fitted kitchen.
	 *
	 * @param fullyFittedKitchen the new fully fitted kitchen
	 */
	public void setFullyFittedKitchen(String fullyFittedKitchen) {
		this.fullyFittedKitchen = fullyFittedKitchen;
	}
	
	/**
	 * Gets the fully furnished.
	 *
	 * @return the fully furnished
	 */
	public String getFullyFurnished() {
		return fullyFurnished;
	}
	
	/**
	 * Sets the fully furnished.
	 *
	 * @param fullyFurnished the new fully furnished
	 */
	public void setFullyFurnished(String fullyFurnished) {
		this.fullyFurnished = fullyFurnished;
	}
	
	/**
	 * Gets the gymnasium.
	 *
	 * @return the gymnasium
	 */
	public String getGymnasium() {
		return gymnasium;
	}
	
	/**
	 * Sets the gymnasium.
	 *
	 * @param gymnasium the new gymnasium
	 */
	public void setGymnasium(String gymnasium) {
		this.gymnasium = gymnasium;
	}
	
	/**
	 * Gets the intercom.
	 *
	 * @return the intercom
	 */
	public String getIntercom() {
		return intercom;
	}
	
	/**
	 * Sets the intercom.
	 *
	 * @param intercom the new intercom
	 */
	public void setIntercom(String intercom) {
		this.intercom = intercom;
	}
	
	/**
	 * Gets the jacuzzi.
	 *
	 * @return the jacuzzi
	 */
	public String getJacuzzi() {
		return jacuzzi;
	}
	
	/**
	 * Sets the jacuzzi.
	 *
	 * @param jacuzzi the new jacuzzi
	 */
	public void setJacuzzi(String jacuzzi) {
		this.jacuzzi = jacuzzi;
	}
	
	/**
	 * Gets the on high floor.
	 *
	 * @return the on high floor
	 */
	public String getOnHighFloor() {
		return onHighFloor;
	}
	
	/**
	 * Sets the on high floor.
	 *
	 * @param onHighFloor the new on high floor
	 */
	public void setOnHighFloor(String onHighFloor) {
		this.onHighFloor = onHighFloor;
	}
	
	/**
	 * Gets the public transport.
	 *
	 * @return the public transport
	 */
	public String getPublicTransport() {
		return publicTransport;
	}
	
	/**
	 * Sets the public transport.
	 *
	 * @param publicTransport the new public transport
	 */
	public void setPublicTransport(String publicTransport) {
		this.publicTransport = publicTransport;
	}
	
	/**
	 * Gets the recreational facilities.
	 *
	 * @return the recreational facilities
	 */
	public String getRecreationalFacilities() {
		return recreationalFacilities;
	}
	
	/**
	 * Sets the recreational facilities.
	 *
	 * @param recreationalFacilities the new recreational facilities
	 */
	public void setRecreationalFacilities(String recreationalFacilities) {
		this.recreationalFacilities = recreationalFacilities;
	}
	
	/**
	 * Gets the restaurants.
	 *
	 * @return the restaurants
	 */
	public String getRestaurants() {
		return restaurants;
	}
	
	/**
	 * Sets the restaurants.
	 *
	 * @param restaurants the new restaurants
	 */
	public void setRestaurants(String restaurants) {
		this.restaurants = restaurants;
	}
	
	/**
	 * Gets the school.
	 *
	 * @return the school
	 */
	public String getSchool() {
		return school;
	}
	
	/**
	 * Sets the school.
	 *
	 * @param school the new school
	 */
	public void setSchool(String school) {
		this.school = school;
	}
	
	/**
	 * Gets the shopping mall.
	 *
	 * @return the shopping mall
	 */
	public String getShoppingMall() {
		return shoppingMall;
	}
	
	/**
	 * Sets the shopping mall.
	 *
	 * @param shoppingMall the new shopping mall
	 */
	public void setShoppingMall(String shoppingMall) {
		this.shoppingMall = shoppingMall;
	}
	
	/**
	 * Gets the shops.
	 *
	 * @return the shops
	 */
	public String getShops() {
		return shops;
	}
	
	/**
	 * Sets the shops.
	 *
	 * @param shops the new shops
	 */
	public void setShops(String shops) {
		this.shops = shops;
	}
	
	/**
	 * Gets the sports academies.
	 *
	 * @return the sports academies
	 */
	public String getSportsAcademies() {
		return sportsAcademies;
	}
	
	/**
	 * Sets the sports academies.
	 *
	 * @param sportsAcademies the new sports academies
	 */
	public void setSportsAcademies(String sportsAcademies) {
		this.sportsAcademies = sportsAcademies;
	}
	
	/**
	 * Gets the squash courts.
	 *
	 * @return the squash courts
	 */
	public String getSquashCourts() {
		return squashCourts;
	}
	
	/**
	 * Sets the squash courts.
	 *
	 * @param squashCourts the new squash courts
	 */
	public void setSquashCourts(String squashCourts) {
		this.squashCourts = squashCourts;
	}
	
	/**
	 * Gets the tennis courts.
	 *
	 * @return the tennis courts
	 */
	public String getTennisCourts() {
		return tennisCourts;
	}
	
	/**
	 * Sets the tennis courts.
	 *
	 * @param tennisCourts the new tennis courts
	 */
	public void setTennisCourts(String tennisCourts) {
		this.tennisCourts = tennisCourts;
	}
	
	/**
	 * Gets the valet service.
	 *
	 * @return the valet service
	 */
	public String getValetService() {
		return valetService;
	}
	
	/**
	 * Sets the valet service.
	 *
	 * @param valetService the new valet service
	 */
	public void setValetService(String valetService) {
		this.valetService = valetService;
	}
	
	/**
	 * Gets the laundry washing room.
	 *
	 * @return the laundry washing room
	 */
	public String getLaundryWashingRoom() {
		return laundryWashingRoom;
	}
	
	/**
	 * Sets the laundry washing room.
	 *
	 * @param laundryWashingRoom the new laundry washing room
	 */
	public void setLaundryWashingRoom(String laundryWashingRoom) {
		this.laundryWashingRoom = laundryWashingRoom;
	}
	
	/**
	 * Gets the walking trails.
	 *
	 * @return the walking trails
	 */
	public String getWalkingTrails() {
		return walkingTrails;
	}
	
	/**
	 * Sets the walking trails.
	 *
	 * @param walkingTrails the new walking trails
	 */
	public void setWalkingTrails(String walkingTrails) {
		this.walkingTrails = walkingTrails;
	}
	
	/**
	 * Gets the schools in neighbourhood.
	 *
	 * @return the schools in neighbourhood
	 */
	public String getSchoolsInNeighbourhood() {
		return schoolsInNeighbourhood;
	}
	
	/**
	 * Sets the schools in neighbourhood.
	 *
	 * @param schoolsInNeighbourhood the new schools in neighbourhood
	 */
	public void setSchoolsInNeighbourhood(String schoolsInNeighbourhood) {
		this.schoolsInNeighbourhood = schoolsInNeighbourhood;
	}
	
	/**
	 * Gets the metros.
	 *
	 * @return the metros
	 */
	public String getMetros() {
		return metros;
	}
	
	/**
	 * Sets the metros.
	 *
	 * @param metros the new metros
	 */
	public void setMetros(String metros) {
		this.metros = metros;
	}
	
	/**
	 * Gets the medical centers.
	 *
	 * @return the medical centers
	 */
	public String getMedicalCenters() {
		return medicalCenters;
	}
	
	/**
	 * Sets the medical centers.
	 *
	 * @param medicalCenters the new medical centers
	 */
	public void setMedicalCenters(String medicalCenters) {
		this.medicalCenters = medicalCenters;
	}
	
	/**
	 * Gets the shopping malls.
	 *
	 * @return the shopping malls
	 */
	public String getShoppingMalls() {
		return shoppingMalls;
	}
	
	/**
	 * Sets the shopping malls.
	 *
	 * @param shoppingMalls the new shopping malls
	 */
	public void setShoppingMalls(String shoppingMalls) {
		this.shoppingMalls = shoppingMalls;
	}
	
	/**
	 * Gets the mosques in neighbourhood.
	 *
	 * @return the mosques in neighbourhood
	 */
	public String getMosquesInNeighbourhood() {
		return mosquesInNeighbourhood;
	}
	
	/**
	 * Sets the mosques in neighbourhood.
	 *
	 * @param mosquesInNeighbourhood the new mosques in neighbourhood
	 */
	public void setMosquesInNeighbourhood(String mosquesInNeighbourhood) {
		this.mosquesInNeighbourhood = mosquesInNeighbourhood;
	}
	
	/**
	 * Gets the beaches.
	 *
	 * @return the beaches
	 */
	public String getBeaches() {
		return beaches;
	}
	
	/**
	 * Sets the beaches.
	 *
	 * @param beaches the new beaches
	 */
	public void setBeaches(String beaches) {
		this.beaches = beaches;
	}
	
	/**
	 * Gets the supermarkets.
	 *
	 * @return the supermarkets
	 */
	public String getSupermarkets() {
		return supermarkets;
	}
	
	/**
	 * Sets the supermarkets.
	 *
	 * @param supermarkets the new supermarkets
	 */
	public void setSupermarkets(String supermarkets) {
		this.supermarkets = supermarkets;
	}
	
	/**
	 * Gets the pets allowed.
	 *
	 * @return the pets allowed
	 */
	public String getPetsAllowed() {
		return petsAllowed;
	}
	
	/**
	 * Sets the pets allowed.
	 *
	 * @param petsAllowed the new pets allowed
	 */
	public void setPetsAllowed(String petsAllowed) {
		this.petsAllowed = petsAllowed;
	}
	
	/**
	 * Gets the marble floors.
	 *
	 * @return the marble floors
	 */
	public String getMarbleFloors() {
		return marbleFloors;
	}
	
	/**
	 * Sets the marble floors.
	 *
	 * @param marbleFloors the new marble floors
	 */
	public void setMarbleFloors(String marbleFloors) {
		this.marbleFloors = marbleFloors;
	}
	
	/**
	 * Gets the on low floor.
	 *
	 * @return the on low floor
	 */
	public String getOnLowFloor() {
		return onLowFloor;
	}
	
	/**
	 * Sets the on low floor.
	 *
	 * @param onLowFloor the new on low floor
	 */
	public void setOnLowFloor(String onLowFloor) {
		this.onLowFloor = onLowFloor;
	}
	
	/**
	 * Gets the on mid floor.
	 *
	 * @return the on mid floor
	 */
	public String getOnMidFloor() {
		return onMidFloor;
	}
	
	/**
	 * Sets the on mid floor.
	 *
	 * @param onMidFloor the new on mid floor
	 */
	public void setOnMidFloor(String onMidFloor) {
		this.onMidFloor = onMidFloor;
	}
	
	/**
	 * Gets the part furnished.
	 *
	 * @return the part furnished
	 */
	public String getPartFurnished() {
		return partFurnished;
	}
	
	/**
	 * Sets the part furnished.
	 *
	 * @param partFurnished the new part furnished
	 */
	public void setPartFurnished(String partFurnished) {
		this.partFurnished = partFurnished;
	}
	
	/**
	 * Gets the private garage.
	 *
	 * @return the private garage
	 */
	public String getPrivateGarage() {
		return privateGarage;
	}
	
	/**
	 * Sets the private garage.
	 *
	 * @param privateGarage the new private garage
	 */
	public void setPrivateGarage(String privateGarage) {
		this.privateGarage = privateGarage;
	}
	
	/**
	 * Gets the private garden.
	 *
	 * @return the private garden
	 */
	public String getPrivateGarden() {
		return privateGarden;
	}
	
	/**
	 * Sets the private garden.
	 *
	 * @param privateGarden the new private garden
	 */
	public void setPrivateGarden(String privateGarden) {
		this.privateGarden = privateGarden;
	}
	
	/**
	 * Gets the satellite cable TV.
	 *
	 * @return the satellite cable TV
	 */
	public String getSatelliteCableTV() {
		return satelliteCableTV;
	}
	
	/**
	 * Sets the satellite cable TV.
	 *
	 * @param satelliteCableTV the new satellite cable TV
	 */
	public void setSatelliteCableTV(String satelliteCableTV) {
		this.satelliteCableTV = satelliteCableTV;
	}
	
	/**
	 * Gets the sauna.
	 *
	 * @return the sauna
	 */
	public String getSauna() {
		return sauna;
	}
	
	/**
	 * Sets the sauna.
	 *
	 * @param sauna the new sauna
	 */
	public void setSauna(String sauna) {
		this.sauna = sauna;
	}
	
	/**
	 * Gets the solid wood floors.
	 *
	 * @return the solid wood floors
	 */
	public String getSolidWoodFloors() {
		return solidWoodFloors;
	}
	
	/**
	 * Sets the solid wood floors.
	 *
	 * @param solidWoodFloors the new solid wood floors
	 */
	public void setSolidWoodFloors(String solidWoodFloors) {
		this.solidWoodFloors = solidWoodFloors;
	}
	
	/**
	 * Gets the steam room.
	 *
	 * @return the steam room
	 */
	public String getSteamRoom() {
		return steamRoom;
	}
	
	/**
	 * Sets the steam room.
	 *
	 * @param steamRoom the new steam room
	 */
	public void setSteamRoom(String steamRoom) {
		this.steamRoom = steamRoom;
	}
	
	/**
	 * Gets the storage room.
	 *
	 * @return the storage room
	 */
	public String getStorageRoom() {
		return storageRoom;
	}
	
	/**
	 * Sets the storage room.
	 *
	 * @param storageRoom the new storage room
	 */
	public void setStorageRoom(String storageRoom) {
		this.storageRoom = storageRoom;
	}
	
	/**
	 * Gets the study.
	 *
	 * @return the study
	 */
	public String getStudy() {
		return study;
	}
	
	/**
	 * Sets the study.
	 *
	 * @param study the new study
	 */
	public void setStudy(String study) {
		this.study = study;
	}
	
	/**
	 * Gets the upgraded interior.
	 *
	 * @return the upgraded interior
	 */
	public String getUpgradedInterior() {
		return upgradedInterior;
	}
	
	/**
	 * Sets the upgraded interior.
	 *
	 * @param upgradedInterior the new upgraded interior
	 */
	public void setUpgradedInterior(String upgradedInterior) {
		this.upgradedInterior = upgradedInterior;
	}
	
	/**
	 * Gets the view of gardens.
	 *
	 * @return the view of gardens
	 */
	public String getViewOfGardens() {
		return viewOfGardens;
	}
	
	/**
	 * Sets the view of gardens.
	 *
	 * @param viewOfGardens the new view of gardens
	 */
	public void setViewOfGardens(String viewOfGardens) {
		this.viewOfGardens = viewOfGardens;
	}
	
	/**
	 * Gets the view of golfcourse.
	 *
	 * @return the view of golfcourse
	 */
	public String getViewOfGolfcourse() {
		return viewOfGolfcourse;
	}
	
	/**
	 * Sets the view of golfcourse.
	 *
	 * @param viewOfGolfcourse the new view of golfcourse
	 */
	public void setViewOfGolfcourse(String viewOfGolfcourse) {
		this.viewOfGolfcourse = viewOfGolfcourse;
	}
	
	/**
	 * Gets the view of parkland.
	 *
	 * @return the view of parkland
	 */
	public String getViewOfParkland() {
		return viewOfParkland;
	}
	
	/**
	 * Sets the view of parkland.
	 *
	 * @param viewOfParkland the new view of parkland
	 */
	public void setViewOfParkland(String viewOfParkland) {
		this.viewOfParkland = viewOfParkland;
	}
	
	/**
	 * Gets the view of sea water.
	 *
	 * @return the view of sea water
	 */
	public String getViewOfSeaWater() {
		return viewOfSeaWater;
	}
	
	/**
	 * Sets the view of sea water.
	 *
	 * @param viewOfSeaWater the new view of sea water
	 */
	public void setViewOfSeaWater(String viewOfSeaWater) {
		this.viewOfSeaWater = viewOfSeaWater;
	}
	
	/**
	 * Gets the laundrywashing room.
	 *
	 * @return the laundrywashing room
	 */
	public String getLaundrywashingRoom() {
		return laundrywashingRoom;
	}
	
	/**
	 * Sets the laundrywashing room.
	 *
	 * @param laundrywashingRoom the new laundrywashing room
	 */
	public void setLaundrywashingRoom(String laundrywashingRoom) {
		this.laundrywashingRoom = laundrywashingRoom;
	}
	
	/**
	 * Gets the private swimming pool.
	 *
	 * @return the private swimming pool
	 */
	public String getPrivateSwimmingPool() {
		return privateSwimmingPool;
	}
	
	/**
	 * Sets the private swimming pool.
	 *
	 * @param privateSwimmingPool the new private swimming pool
	 */
	public void setPrivateSwimmingPool(String privateSwimmingPool) {
		this.privateSwimmingPool = privateSwimmingPool;
	}
	
	/**
	 * Gets the shared swimming pool.
	 *
	 * @return the shared swimming pool
	 */
	public String getSharedSwimmingPool() {
		return sharedSwimmingPool;
	}
	
	/**
	 * Sets the shared swimming pool.
	 *
	 * @param sharedSwimmingPool the new shared swimming pool
	 */
	public void setSharedSwimmingPool(String sharedSwimmingPool) {
		this.sharedSwimmingPool = sharedSwimmingPool;
	}
	
	/**
	 * Gets the gazebo and outdoor entertaining area.
	 *
	 * @return the gazebo and outdoor entertaining area
	 */
	public String getGazeboAndOutdoorEntertainingArea() {
		return gazeboAndOutdoorEntertainingArea;
	}
	
	/**
	 * Sets the gazebo and outdoor entertaining area.
	 *
	 * @param gazeboAndOutdoorEntertainingArea the new gazebo and outdoor entertaining area
	 */
	public void setGazeboAndOutdoorEntertainingArea(String gazeboAndOutdoorEntertainingArea) {
		this.gazeboAndOutdoorEntertainingArea = gazeboAndOutdoorEntertainingArea;
	}
	
	/**
	 * Gets the kitchen white goods.
	 *
	 * @return the kitchen white goods
	 */
	public String getKitchenWhiteGoods() {
		return kitchenWhiteGoods;
	}
	
	/**
	 * Sets the kitchen white goods.
	 *
	 * @param kitchenWhiteGoods the new kitchen white goods
	 */
	public void setKitchenWhiteGoods(String kitchenWhiteGoods) {
		this.kitchenWhiteGoods = kitchenWhiteGoods;
	}
	
	/**
	 * Gets the landscaped garden.
	 *
	 * @return the landscaped garden
	 */
	public String getLandscapedGarden() {
		return landscapedGarden;
	}
	
	/**
	 * Sets the landscaped garden.
	 *
	 * @param landscapedGarden the new landscaped garden
	 */
	public void setLandscapedGarden(String landscapedGarden) {
		this.landscapedGarden = landscapedGarden;
	}
	
	/**
	 * Gets the hours maintenance.
	 *
	 * @return the hours maintenance
	 */
	public String getHoursMaintenance() {
		return HoursMaintenance;
	}
	
	/**
	 * Sets the hours maintenance.
	 *
	 * @param hoursMaintenance the new hours maintenance
	 */
	public void setHoursMaintenance(String hoursMaintenance) {
		HoursMaintenance = hoursMaintenance;
	}
	
	/**
	 * Gets the bankatm facility.
	 *
	 * @return the bankatm facility
	 */
	public String getBankatmFacility() {
		return bankatmFacility;
	}
	
	/**
	 * Sets the bankatm facility.
	 *
	 * @param bankatmFacility the new bankatm facility
	 */
	public void setBankatmFacility(String bankatmFacility) {
		this.bankatmFacility = bankatmFacility;
	}
	
	/**
	 * Gets the basketball court.
	 *
	 * @return the basketball court
	 */
	public String getBasketballCourt() {
		return basketballCourt;
	}
	
	/**
	 * Sets the basketball court.
	 *
	 * @param basketballCourt the new basketball court
	 */
	public void setBasketballCourt(String basketballCourt) {
		this.basketballCourt = basketballCourt;
	}
	
	/**
	 * Gets the beach access.
	 *
	 * @return the beach access
	 */
	public String getBeachAccess() {
		return beachAccess;
	}
	
	/**
	 * Sets the beach access.
	 *
	 * @param beachAccess the new beach access
	 */
	public void setBeachAccess(String beachAccess) {
		this.beachAccess = beachAccess;
	}
	
	/**
	 * Gets the bus services.
	 *
	 * @return the bus services
	 */
	public String getBusServices() {
		return busServices;
	}
	
	/**
	 * Sets the bus services.
	 *
	 * @param busServices the new bus services
	 */
	public void setBusServices(String busServices) {
		this.busServices = busServices;
	}
	
	/**
	 * Gets the business center.
	 *
	 * @return the business center
	 */
	public String getBusinessCenter() {
		return businessCenter;
	}
	
	/**
	 * Sets the business center.
	 *
	 * @param businessCenter the new business center
	 */
	public void setBusinessCenter(String businessCenter) {
		this.businessCenter = businessCenter;
	}
	
	/**
	 * Gets the children nursery.
	 *
	 * @return the children nursery
	 */
	public String getChildrenNursery() {
		return childrenNursery;
	}
	
	/**
	 * Sets the children nursery.
	 *
	 * @param childrenNursery the new children nursery
	 */
	public void setChildrenNursery(String childrenNursery) {
		this.childrenNursery = childrenNursery;
	}
	
	/**
	 * Gets the children play area.
	 *
	 * @return the children play area
	 */
	public String getChildrenPlayArea() {
		return childrenPlayArea;
	}
	
	/**
	 * Sets the children play area.
	 *
	 * @param childrenPlayArea the new children play area
	 */
	public void setChildrenPlayArea(String childrenPlayArea) {
		this.childrenPlayArea = childrenPlayArea;
	}
	
	/**
	 * Gets the clubhouse.
	 *
	 * @return the clubhouse
	 */
	public String getClubhouse() {
		return clubhouse;
	}
	
	/**
	 * Sets the clubhouse.
	 *
	 * @param clubhouse the new clubhouse
	 */
	public void setClubhouse(String clubhouse) {
		this.clubhouse = clubhouse;
	}
	
	/**
	 * Gets the communal gardens.
	 *
	 * @return the communal gardens
	 */
	public String getCommunalGardens() {
		return communalGardens;
	}
	
	/**
	 * Sets the communal gardens.
	 *
	 * @param communalGardens the new communal gardens
	 */
	public void setCommunalGardens(String communalGardens) {
		this.communalGardens = communalGardens;
	}
	
	/**
	 * Gets the concierge service.
	 *
	 * @return the concierge service
	 */
	public String getConciergeService() {
		return conciergeService;
	}
	
	/**
	 * Sets the concierge service.
	 *
	 * @param conciergeService the new concierge service
	 */
	public void setConciergeService(String conciergeService) {
		this.conciergeService = conciergeService;
	}
	
	/**
	 * Gets the cycling tracks.
	 *
	 * @return the cycling tracks
	 */
	public String getCyclingTracks() {
		return cyclingTracks;
	}
	
	/**
	 * Sets the cycling tracks.
	 *
	 * @param cyclingTracks the new cycling tracks
	 */
	public void setCyclingTracks(String cyclingTracks) {
		this.cyclingTracks = cyclingTracks;
	}
	
	/**
	 * Gets the fitness center.
	 *
	 * @return the fitness center
	 */
	public String getFitnessCenter() {
		return fitnessCenter;
	}
	
	/**
	 * Sets the fitness center.
	 *
	 * @param fitnessCenter the new fitness center
	 */
	public void setFitnessCenter(String fitnessCenter) {
		this.fitnessCenter = fitnessCenter;
	}
	
	/**
	 * Gets the golf club and clubhouse.
	 *
	 * @return the golf club and clubhouse
	 */
	public String getGolfClubAndClubhouse() {
		return golfClubAndClubhouse;
	}
	
	/**
	 * Sets the golf club and clubhouse.
	 *
	 * @param golfClubAndClubhouse the new golf club and clubhouse
	 */
	public void setGolfClubAndClubhouse(String golfClubAndClubhouse) {
		this.golfClubAndClubhouse = golfClubAndClubhouse;
	}
	
	/**
	 * Gets the laundry service.
	 *
	 * @return the laundry service
	 */
	public String getLaundryService() {
		return laundryService;
	}
	
	/**
	 * Sets the laundry service.
	 *
	 * @param laundryService the new laundry service
	 */
	public void setLaundryService(String laundryService) {
		this.laundryService = laundryService;
	}
	
	/**
	 * Gets the marina berth.
	 *
	 * @return the marina berth
	 */
	public String getMarinaBerth() {
		return marinaBerth;
	}
	
	/**
	 * Sets the marina berth.
	 *
	 * @param marinaBerth the new marina berth
	 */
	public void setMarinaBerth(String marinaBerth) {
		this.marinaBerth = marinaBerth;
	}
	
	/**
	 * Gets the metro station.
	 *
	 * @return the metro station
	 */
	public String getMetroStation() {
		return metroStation;
	}
	
	/**
	 * Sets the metro station.
	 *
	 * @param metroStation the new metro station
	 */
	public void setMetroStation(String metroStation) {
		this.metroStation = metroStation;
	}
	
	/**
	 * Gets the mosque.
	 *
	 * @return the mosque
	 */
	public String getMosque() {
		return mosque;
	}
	
	/**
	 * Sets the mosque.
	 *
	 * @param mosque the new mosque
	 */
	public void setMosque(String mosque) {
		this.mosque = mosque;
	}
	
	/**
	 * Gets the polo club and clubhouse.
	 *
	 * @return the polo club and clubhouse
	 */
	public String getPoloClubAndClubhouse() {
		return poloClubAndClubhouse;
	}
	
	/**
	 * Sets the polo club and clubhouse.
	 *
	 * @param poloClubAndClubhouse the new polo club and clubhouse
	 */
	public void setPoloClubAndClubhouse(String poloClubAndClubhouse) {
		this.poloClubAndClubhouse = poloClubAndClubhouse;
	}
	
	/**
	 * Gets the public park.
	 *
	 * @return the public park
	 */
	public String getPublicPark() {
		return publicPark;
	}
	
	/**
	 * Sets the public park.
	 *
	 * @param publicPark the new public park
	 */
	public void setPublicPark(String publicPark) {
		this.publicPark = publicPark;
	}
	
	/**
	 * Gets the park.
	 *
	 * @return the park
	 */
	public String getPark() {
		return park;
	}
	
	/**
	 * Sets the park.
	 *
	 * @param park the new park
	 */
	public void setPark(String park) {
		this.park = park;
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
	 * Gets the built in wardrobes.
	 *
	 * @return the built in wardrobes
	 */
	public String getBuiltInWardrobes() {
		return builtInWardrobes;
	}
	
	/**
	 * Sets the built in wardrobes.
	 *
	 * @param builtInWardrobes the new built in wardrobes
	 */
	public void setBuiltInWardrobes(String builtInWardrobes) {
		this.builtInWardrobes = builtInWardrobes;
	}
	
	/**
	 * Gets the maid room.
	 *
	 * @return the maid room
	 */
	public String getMaidRoom() {
		return maidRoom;
	}
	
	/**
	 * Sets the maid room.
	 *
	 * @param maidRoom the new maid room
	 */
	public void setMaidRoom(String maidRoom) {
		this.maidRoom = maidRoom;
	}
	
	/**
	 * Gets the payment schedule.
	 *
	 * @return the payment schedule
	 */
	public String getPaymentSchedule() {
		return paymentSchedule;
	}
	
	/**
	 * Sets the payment schedule.
	 *
	 * @param paymentSchedule the new payment schedule
	 */
	public void setPaymentSchedule(String paymentSchedule) {
		this.paymentSchedule = paymentSchedule;
	}
	
	/**
	 * Gets the area.
	 *
	 * @return the area
	 */
	public String getArea() {
		return area;
	}
	
	/**
	 * Sets the area.
	 *
	 * @param area the new area
	 */
	public void setArea(String area) {
		this.area = area;
	}
	
	/**
	 * Gets the morgage status.
	 *
	 * @return the morgage status
	 */
	public String getMorgageStatus() {
		return morgageStatus;
	}
	
	/**
	 * Sets the morgage status.
	 *
	 * @param morgageStatus the new morgage status
	 */
	public void setMorgageStatus(String morgageStatus) {
		this.morgageStatus = morgageStatus;
	}
	
	/**
	 * Gets the morgage reg no.
	 *
	 * @return the morgage reg no
	 */
	public String getMorgageRegNo() {
		return morgageRegNo;
	}
	
	/**
	 * Sets the morgage reg no.
	 *
	 * @param morgageRegNo the new morgage reg no
	 */
	public void setMorgageRegNo(String morgageRegNo) {
		this.morgageRegNo = morgageRegNo;
	}
	
	/**
	 * Gets the bank.
	 *
	 * @return the bank
	 */
	public String getBank() {
		return bank;
	}
	
	/**
	 * Sets the bank.
	 *
	 * @param bank the new bank
	 */
	public void setBank(String bank) {
		this.bank = bank;
	}
	
	/**
	 * Gets the morgage amount.
	 *
	 * @return the morgage amount
	 */
	public float getMorgageAmount() {
		return morgageAmount;
	}
	
	/**
	 * Sets the morgage amount.
	 *
	 * @param morgageAmount the new morgage amount
	 */
	public void setMorgageAmount(float morgageAmount) {
		this.morgageAmount = morgageAmount;
	}
	
	/**
	 * Gets the pre closure charges.
	 *
	 * @return the pre closure charges
	 */
	public float getPreClosureCharges() {
		return preClosureCharges;
	}
	
	/**
	 * Sets the pre closure charges.
	 *
	 * @param preClosureCharges the new pre closure charges
	 */
	public void setPreClosureCharges(float preClosureCharges) {
		this.preClosureCharges = preClosureCharges;
	}
	
	/**
	 * Gets the date.
	 *
	 * @return the date
	 */
	public Calendar getDate() {
		return date;
	}
	
	/**
	 * Sets the date.
	 *
	 * @param date the new date
	 */
	public void setDate(Calendar date) {
		this.date = date;
	}
	
	/**
	 * Gets the amount.
	 *
	 * @return the amount
	 */
	public float getAmount() {
		return amount;
	}
	
	/**
	 * Sets the amount.
	 *
	 * @param amount the new amount
	 */
	public void setAmount(float amount) {
		this.amount = amount;
	}
	
	/**
	 * Gets the morgage noc.
	 *
	 * @return the morgage noc
	 */
	public String getMorgageNoc() {
		return morgageNoc;
	}
	
	/**
	 * Sets the morgage noc.
	 *
	 * @param morgageNoc the new morgage noc
	 */
	public void setMorgageNoc(String morgageNoc) {
		this.morgageNoc = morgageNoc;
	}
	
	/**
	 * Gets the balance amount.
	 *
	 * @return the balance amount
	 */
	public float getBalanceAmount() {
		return balanceAmount;
	}
	
	/**
	 * Sets the balance amount.
	 *
	 * @param balanceAmount the new balance amount
	 */
	public void setBalanceAmount(float balanceAmount) {
		this.balanceAmount = balanceAmount;
	}
	
	/**
	 * Gets the lease start date.
	 *
	 * @return the lease start date
	 */
	public Calendar getLeaseStartDate() {
		return leaseStartDate;
	}
	
	/**
	 * Sets the lease start date.
	 *
	 * @param leaseStartDate the new lease start date
	 */
	public void setLeaseStartDate(Calendar leaseStartDate) {
		this.leaseStartDate = leaseStartDate;
	}
	
	/**
	 * Gets the lease expiry date.
	 *
	 * @return the lease expiry date
	 */
	public Calendar getLeaseExpiryDate() {
		return leaseExpiryDate;
	}
	
	/**
	 * Sets the lease expiry date.
	 *
	 * @param leaseExpiryDate the new lease expiry date
	 */
	public void setLeaseExpiryDate(Calendar leaseExpiryDate) {
		this.leaseExpiryDate = leaseExpiryDate;
	}
	
	/**
	 * Gets the tenant name.
	 *
	 * @return the tenant name
	 */
	public String getTenantName() {
		return tenantName;
	}
	
	/**
	 * Sets the tenant name.
	 *
	 * @param tenantName the new tenant name
	 */
	public void setTenantName(String tenantName) {
		this.tenantName = tenantName;
	}
	
	/**
	 * Gets the tenancy contract upload.
	 *
	 * @return the tenancy contract upload
	 */
	public String getTenancyContractUpload() {
		return tenancyContractUpload;
	}
	
	/**
	 * Sets the tenancy contract upload.
	 *
	 * @param tenancyContractUpload the new tenancy contract upload
	 */
	public void setTenancyContractUpload(String tenancyContractUpload) {
		this.tenancyContractUpload = tenancyContractUpload;
	}
	
	/**
	 * Gets the checks if is rented.
	 *
	 * @return the checks if is rented
	 */
	public String getIsRented() {
		return isRented;
	}
	
	/**
	 * Sets the checks if is rented.
	 *
	 * @param isRented the new checks if is rented
	 */
	public void setIsRented(String isRented) {
		this.isRented = isRented;
	}
	
	/**
	 * Gets the checks if is vacant.
	 *
	 * @return the checks if is vacant
	 */
	public String getIsVacant() {
		return isVacant;
	}
	
	/**
	 * Sets the checks if is vacant.
	 *
	 * @param isVacant the new checks if is vacant
	 */
	public void setIsVacant(String isVacant) {
		this.isVacant = isVacant;
	}
	
	/**
	 * Gets the rental ejari no.
	 *
	 * @return the rental ejari no
	 */
	public Integer getRentalEjariNo() {
		return rentalEjariNo;
	}
	
	/**
	 * Sets the rental ejari no.
	 *
	 * @param rentalEjariNo the new rental ejari no
	 */
	public void setRentalEjariNo(Integer rentalEjariNo) {
		this.rentalEjariNo = rentalEjariNo;
	}
	
	/**
	 * Gets the rental annual rent.
	 *
	 * @return the rental annual rent
	 */
	public float getRentalAnnualRent() {
		return rentalAnnualRent;
	}
	
	/**
	 * Sets the rental annual rent.
	 *
	 * @param rentalAnnualRent the new rental annual rent
	 */
	public void setRentalAnnualRent(float rentalAnnualRent) {
		this.rentalAnnualRent = rentalAnnualRent;
	}
	
	/**
	 * Gets the rental payment checks.
	 *
	 * @return the rental payment checks
	 */
	public Integer getRentalPaymentChecks() {
		return rentalPaymentChecks;
	}
	
	/**
	 * Sets the rental payment checks.
	 *
	 * @param rentalPaymentChecks the new rental payment checks
	 */
	public void setRentalPaymentChecks(Integer rentalPaymentChecks) {
		this.rentalPaymentChecks = rentalPaymentChecks;
	}
	
	/**
	 * Gets the payment structure.
	 *
	 * @return the payment structure
	 */
	public String getPaymentStructure() {
		return paymentStructure;
	}
	
	/**
	 * Sets the payment structure.
	 *
	 * @param paymentStructure the new payment structure
	 */
	public void setPaymentStructure(String paymentStructure) {
		this.paymentStructure = paymentStructure;
	}

	public String getThirdPartyVerification() {
		return thirdPartyVerification;
	}

	public void setThirdPartyVerification(String thirdPartyVerification) {
		this.thirdPartyVerification = thirdPartyVerification;
	}

	public String getIsThirdPartyPayment() {
		return isThirdPartyPayment;
	}

	public void setIsThirdPartyPayment(String isThirdPartyPayment) {
		this.isThirdPartyPayment = isThirdPartyPayment;
	}

	public String getVerificationHodApproved() {
		return verificationHodApproved;
	}

	public void setVerificationHodApproved(String verificationHodApproved) {
		this.verificationHodApproved = verificationHodApproved;
	}

	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getSellerUserName() {
		return sellerUserName;
	}

	public void setSellerUserName(String sellerUserName) {
		this.sellerUserName = sellerUserName;
	}

	public String getIsPropertyDetailsVerified() {
		return isPropertyDetailsVerified;
	}

	public void setIsPropertyDetailsVerified(String isPropertyDetailsVerified) {
		this.isPropertyDetailsVerified = isPropertyDetailsVerified;
	}

	public String getIsPOADetailsVerified() {
		return isPOADetailsVerified;
	}

	public void setIsPOADetailsVerified(String isPOADetailsVerified) {
		this.isPOADetailsVerified = isPOADetailsVerified;
	}

	public String getIsPersonalDetailsVerified() {
		return isPersonalDetailsVerified;
	}

	public void setIsPersonalDetailsVerified(String isPersonalDetailsVerified) {
		this.isPersonalDetailsVerified = isPersonalDetailsVerified;
	}

	public String getIsAcknowledgementCall() {
		return isAcknowledgementCall;
	}

	public void setIsAcknowledgementCall(String isAcknowledgementCall) {
		this.isAcknowledgementCall = isAcknowledgementCall;
	}

	public String getLastActionPerformed() {
		return lastActionPerformed;
	}

	public void setLastActionPerformed(String lastActionPerformed) {
		this.lastActionPerformed = lastActionPerformed;
	}

	public Date getLastAction() {
		return lastAction;
	}

	public void setLastAction(Date lastAction) {
		this.lastAction = lastAction;
	}

	public String getActionPerformedBy() {
		return actionPerformedBy;
	}

	public void setActionPerformedBy(String actionPerformedBy) {
		this.actionPerformedBy = actionPerformedBy;
	}
	

	
}
