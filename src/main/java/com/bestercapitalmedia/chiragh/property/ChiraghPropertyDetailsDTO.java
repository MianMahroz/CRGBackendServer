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
	

	private String areaUnit;

	
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
	
	private String bankOther;
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
    String bulidingName; 
    String bulidingNumber;
    String typePropertyOther;
    String propertyStatusOther;
	String floorPlanUpload;
	String grossArea;
	String netArea;

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

	public String getAreaUnit() {
		return areaUnit;
	}

	public void setAreaUnit(String areaUnit) {
		this.areaUnit = areaUnit;
	}

	public int getPropertyId() {
		return propertyId;
	}

	public void setPropertyId(int propertyId) {
		this.propertyId = propertyId;
	}

	public String getBankOther() {
		return bankOther;
	}

	public void setBankOther(String bankOther) {
		this.bankOther = bankOther;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getTypeTitle() {
		return typeTitle;
	}

	public void setTypeTitle(String typeTitle) {
		this.typeTitle = typeTitle;
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

	public String getPropertyNo() {
		return propertyNo;
	}

	public void setPropertyNo(String propertyNo) {
		this.propertyNo = propertyNo;
	}

	public String getBuiltInWardrobes() {
		return builtInWardrobes;
	}

	public void setBuiltInWardrobes(String builtInWardrobes) {
		this.builtInWardrobes = builtInWardrobes;
	}

	public String getMaidRoom() {
		return maidRoom;
	}

	public void setMaidRoom(String maidRoom) {
		this.maidRoom = maidRoom;
	}

	public String getPropertyStatus() {
		return propertyStatus;
	}

	public void setPropertyStatus(String propertyStatus) {
		this.propertyStatus = propertyStatus;
	}

	public String getPropertyType() {
		return propertyType;
	}

	public void setPropertyType(String propertyType) {
		this.propertyType = propertyType;
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

	public float getAskingPrice() {
		return askingPrice;
	}

	public void setAskingPrice(float askingPrice) {
		this.askingPrice = askingPrice;
	}

	public String getAreaPermitNo() {
		return areaPermitNo;
	}

	public void setAreaPermitNo(String areaPermitNo) {
		this.areaPermitNo = areaPermitNo;
	}

	public String getPropertyReferenceNo() {
		return propertyReferenceNo;
	}

	public void setPropertyReferenceNo(String propertyReferenceNo) {
		this.propertyReferenceNo = propertyReferenceNo;
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

	public Integer getFloorNo() {
		return floorNo;
	}

	public void setFloorNo(Integer floorNo) {
		this.floorNo = floorNo;
	}

	public Integer getKitchens() {
		return kitchens;
	}

	public void setKitchens(Integer kitchens) {
		this.kitchens = kitchens;
	}

	public Integer getCarParks() {
		return carParks;
	}

	public void setCarParks(Integer carParks) {
		this.carParks = carParks;
	}

	public int getPublicParking() {
		return publicParking;
	}

	public void setPublicParking(int publicParking) {
		this.publicParking = publicParking;
	}

	public String getBalcony() {
		return balcony;
	}

	public void setBalcony(String balcony) {
		this.balcony = balcony;
	}

	public String getBasementParking() {
		return basementParking;
	}

	public void setBasementParking(String basementParking) {
		this.basementParking = basementParking;
	}

	public String getBbqArea() {
		return bbqArea;
	}

	public void setBbqArea(String bbqArea) {
		this.bbqArea = bbqArea;
	}

	public String getBroadbandReady() {
		return broadbandReady;
	}

	public void setBroadbandReady(String broadbandReady) {
		this.broadbandReady = broadbandReady;
	}

	public Integer getNoOfFloors() {
		return noOfFloors;
	}

	public void setNoOfFloors(Integer noOfFloors) {
		this.noOfFloors = noOfFloors;
	}

	public String getScannedTitleDeed() {
		return scannedTitleDeed;
	}

	public void setScannedTitleDeed(String scannedTitleDeed) {
		this.scannedTitleDeed = scannedTitleDeed;
	}

	public int getAgreeVatCommission() {
		return agreeVatCommission;
	}

	public void setAgreeVatCommission(int agreeVatCommission) {
		this.agreeVatCommission = agreeVatCommission;
	}

	public String getMapLocation() {
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

	public String getTitleDeedNo() {
		return titleDeedNo;
	}

	public void setTitleDeedNo(String titleDeedNo) {
		this.titleDeedNo = titleDeedNo;
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

	public String getOwnerAssociationNo() {
		return ownerAssociationNo;
	}

	public void setOwnerAssociationNo(String ownerAssociationNo) {
		this.ownerAssociationNo = ownerAssociationNo;
	}

	public String getPresentUse() {
		return presentUse;
	}

	public void setPresentUse(String presentUse) {
		this.presentUse = presentUse;
	}

	public String getCommunityNo() {
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

	public String getValuationReportDocument() {
		return valuationReportDocument;
	}

	public void setValuationReportDocument(String valuationReportDocument) {
		this.valuationReportDocument = valuationReportDocument;
	}

	public int getValuationHodApproved() {
		return valuationHodApproved;
	}

	public void setValuationHodApproved(int valuationHodApproved) {
		this.valuationHodApproved = valuationHodApproved;
	}

	public float getListedPrice() {
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
	}

	public float getPaidAmount() {
		return paidAmount;
	}

	public void setPaidAmount(float paidAmount) {
		this.paidAmount = paidAmount;
	}

	public float getServiceCharge() {
		return serviceCharge;
	}

	public void setServiceCharge(float serviceCharge) {
		this.serviceCharge = serviceCharge;
	}

	public String getPaymentSchedule() {
		return paymentSchedule;
	}

	public void setPaymentSchedule(String paymentSchedule) {
		this.paymentSchedule = paymentSchedule;
	}

	public String getCarpets() {
		return carpets;
	}

	public void setCarpets(String carpets) {
		this.carpets = carpets;
	}

	public String getCentralAirConditioning() {
		return centralAirConditioning;
	}

	public void setCentralAirConditioning(String centralAirConditioning) {
		this.centralAirConditioning = centralAirConditioning;
	}

	public String getCentralHeating() {
		return centralHeating;
	}

	public void setCentralHeating(String centralHeating) {
		this.centralHeating = centralHeating;
	}

	public String getCommunityView() {
		return communityView;
	}

	public void setCommunityView(String communityView) {
		this.communityView = communityView;
	}

	public String getCoveredParking() {
		return coveredParking;
	}

	public void setCoveredParking(String coveredParking) {
		this.coveredParking = coveredParking;
	}

	public String getDriverRoom() {
		return driverRoom;
	}

	public void setDriverRoom(String driverRoom) {
		this.driverRoom = driverRoom;
	}

	public String getFullyFittedKitchen() {
		return fullyFittedKitchen;
	}

	public void setFullyFittedKitchen(String fullyFittedKitchen) {
		this.fullyFittedKitchen = fullyFittedKitchen;
	}

	public String getFullyFurnished() {
		return fullyFurnished;
	}

	public void setFullyFurnished(String fullyFurnished) {
		this.fullyFurnished = fullyFurnished;
	}

	public String getGymnasium() {
		return gymnasium;
	}

	public void setGymnasium(String gymnasium) {
		this.gymnasium = gymnasium;
	}

	public String getIntercom() {
		return intercom;
	}

	public void setIntercom(String intercom) {
		this.intercom = intercom;
	}

	public String getJacuzzi() {
		return jacuzzi;
	}

	public void setJacuzzi(String jacuzzi) {
		this.jacuzzi = jacuzzi;
	}

	public String getOnHighFloor() {
		return onHighFloor;
	}

	public void setOnHighFloor(String onHighFloor) {
		this.onHighFloor = onHighFloor;
	}

	public String getPublicTransport() {
		return publicTransport;
	}

	public void setPublicTransport(String publicTransport) {
		this.publicTransport = publicTransport;
	}

	public String getRecreationalFacilities() {
		return recreationalFacilities;
	}

	public void setRecreationalFacilities(String recreationalFacilities) {
		this.recreationalFacilities = recreationalFacilities;
	}

	public String getRestaurants() {
		return restaurants;
	}

	public void setRestaurants(String restaurants) {
		this.restaurants = restaurants;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public String getShoppingMall() {
		return shoppingMall;
	}

	public void setShoppingMall(String shoppingMall) {
		this.shoppingMall = shoppingMall;
	}

	public String getShops() {
		return shops;
	}

	public void setShops(String shops) {
		this.shops = shops;
	}

	public String getSportsAcademies() {
		return sportsAcademies;
	}

	public void setSportsAcademies(String sportsAcademies) {
		this.sportsAcademies = sportsAcademies;
	}

	public String getSquashCourts() {
		return squashCourts;
	}

	public void setSquashCourts(String squashCourts) {
		this.squashCourts = squashCourts;
	}

	public String getTennisCourts() {
		return tennisCourts;
	}

	public void setTennisCourts(String tennisCourts) {
		this.tennisCourts = tennisCourts;
	}

	public String getValetService() {
		return valetService;
	}

	public void setValetService(String valetService) {
		this.valetService = valetService;
	}

	public String getLaundryWashingRoom() {
		return laundryWashingRoom;
	}

	public void setLaundryWashingRoom(String laundryWashingRoom) {
		this.laundryWashingRoom = laundryWashingRoom;
	}

	public String getWalkingTrails() {
		return walkingTrails;
	}

	public void setWalkingTrails(String walkingTrails) {
		this.walkingTrails = walkingTrails;
	}

	public String getSchoolsInNeighbourhood() {
		return schoolsInNeighbourhood;
	}

	public void setSchoolsInNeighbourhood(String schoolsInNeighbourhood) {
		this.schoolsInNeighbourhood = schoolsInNeighbourhood;
	}

	public String getMetros() {
		return metros;
	}

	public void setMetros(String metros) {
		this.metros = metros;
	}

	public String getMedicalCenters() {
		return medicalCenters;
	}

	public void setMedicalCenters(String medicalCenters) {
		this.medicalCenters = medicalCenters;
	}

	public String getShoppingMalls() {
		return shoppingMalls;
	}

	public void setShoppingMalls(String shoppingMalls) {
		this.shoppingMalls = shoppingMalls;
	}

	public String getMosquesInNeighbourhood() {
		return mosquesInNeighbourhood;
	}

	public void setMosquesInNeighbourhood(String mosquesInNeighbourhood) {
		this.mosquesInNeighbourhood = mosquesInNeighbourhood;
	}

	public String getBeaches() {
		return beaches;
	}

	public void setBeaches(String beaches) {
		this.beaches = beaches;
	}

	public String getSupermarkets() {
		return supermarkets;
	}

	public void setSupermarkets(String supermarkets) {
		this.supermarkets = supermarkets;
	}

	public String getPetsAllowed() {
		return petsAllowed;
	}

	public void setPetsAllowed(String petsAllowed) {
		this.petsAllowed = petsAllowed;
	}

	public String getMarbleFloors() {
		return marbleFloors;
	}

	public void setMarbleFloors(String marbleFloors) {
		this.marbleFloors = marbleFloors;
	}

	public String getOnLowFloor() {
		return onLowFloor;
	}

	public void setOnLowFloor(String onLowFloor) {
		this.onLowFloor = onLowFloor;
	}

	public String getOnMidFloor() {
		return onMidFloor;
	}

	public void setOnMidFloor(String onMidFloor) {
		this.onMidFloor = onMidFloor;
	}

	public String getPartFurnished() {
		return partFurnished;
	}

	public void setPartFurnished(String partFurnished) {
		this.partFurnished = partFurnished;
	}

	public String getPrivateGarage() {
		return privateGarage;
	}

	public void setPrivateGarage(String privateGarage) {
		this.privateGarage = privateGarage;
	}

	public String getPrivateGarden() {
		return privateGarden;
	}

	public void setPrivateGarden(String privateGarden) {
		this.privateGarden = privateGarden;
	}

	public String getSatelliteCableTV() {
		return satelliteCableTV;
	}

	public void setSatelliteCableTV(String satelliteCableTV) {
		this.satelliteCableTV = satelliteCableTV;
	}

	public String getSauna() {
		return sauna;
	}

	public void setSauna(String sauna) {
		this.sauna = sauna;
	}

	public String getSolidWoodFloors() {
		return solidWoodFloors;
	}

	public void setSolidWoodFloors(String solidWoodFloors) {
		this.solidWoodFloors = solidWoodFloors;
	}

	public String getSteamRoom() {
		return steamRoom;
	}

	public void setSteamRoom(String steamRoom) {
		this.steamRoom = steamRoom;
	}

	public String getStorageRoom() {
		return storageRoom;
	}

	public void setStorageRoom(String storageRoom) {
		this.storageRoom = storageRoom;
	}

	public String getStudy() {
		return study;
	}

	public void setStudy(String study) {
		this.study = study;
	}

	public String getUpgradedInterior() {
		return upgradedInterior;
	}

	public void setUpgradedInterior(String upgradedInterior) {
		this.upgradedInterior = upgradedInterior;
	}

	public String getViewOfGardens() {
		return viewOfGardens;
	}

	public void setViewOfGardens(String viewOfGardens) {
		this.viewOfGardens = viewOfGardens;
	}

	public String getViewOfGolfcourse() {
		return viewOfGolfcourse;
	}

	public void setViewOfGolfcourse(String viewOfGolfcourse) {
		this.viewOfGolfcourse = viewOfGolfcourse;
	}

	public String getViewOfParkland() {
		return viewOfParkland;
	}

	public void setViewOfParkland(String viewOfParkland) {
		this.viewOfParkland = viewOfParkland;
	}

	public String getViewOfSeaWater() {
		return viewOfSeaWater;
	}

	public void setViewOfSeaWater(String viewOfSeaWater) {
		this.viewOfSeaWater = viewOfSeaWater;
	}

	public String getLaundrywashingRoom() {
		return laundrywashingRoom;
	}

	public void setLaundrywashingRoom(String laundrywashingRoom) {
		this.laundrywashingRoom = laundrywashingRoom;
	}

	public String getPrivateSwimmingPool() {
		return privateSwimmingPool;
	}

	public void setPrivateSwimmingPool(String privateSwimmingPool) {
		this.privateSwimmingPool = privateSwimmingPool;
	}

	public String getSharedSwimmingPool() {
		return sharedSwimmingPool;
	}

	public void setSharedSwimmingPool(String sharedSwimmingPool) {
		this.sharedSwimmingPool = sharedSwimmingPool;
	}

	public String getGazeboAndOutdoorEntertainingArea() {
		return gazeboAndOutdoorEntertainingArea;
	}

	public void setGazeboAndOutdoorEntertainingArea(String gazeboAndOutdoorEntertainingArea) {
		this.gazeboAndOutdoorEntertainingArea = gazeboAndOutdoorEntertainingArea;
	}

	public String getKitchenWhiteGoods() {
		return kitchenWhiteGoods;
	}

	public void setKitchenWhiteGoods(String kitchenWhiteGoods) {
		this.kitchenWhiteGoods = kitchenWhiteGoods;
	}

	public String getLandscapedGarden() {
		return landscapedGarden;
	}

	public void setLandscapedGarden(String landscapedGarden) {
		this.landscapedGarden = landscapedGarden;
	}

	public String getHoursMaintenance() {
		return HoursMaintenance;
	}

	public void setHoursMaintenance(String hoursMaintenance) {
		HoursMaintenance = hoursMaintenance;
	}

	public String getBankatmFacility() {
		return bankatmFacility;
	}

	public void setBankatmFacility(String bankatmFacility) {
		this.bankatmFacility = bankatmFacility;
	}

	public String getBasketballCourt() {
		return basketballCourt;
	}

	public void setBasketballCourt(String basketballCourt) {
		this.basketballCourt = basketballCourt;
	}

	public String getBeachAccess() {
		return beachAccess;
	}

	public void setBeachAccess(String beachAccess) {
		this.beachAccess = beachAccess;
	}

	public String getBusServices() {
		return busServices;
	}

	public void setBusServices(String busServices) {
		this.busServices = busServices;
	}

	public String getBusinessCenter() {
		return businessCenter;
	}

	public void setBusinessCenter(String businessCenter) {
		this.businessCenter = businessCenter;
	}

	public String getChildrenNursery() {
		return childrenNursery;
	}

	public void setChildrenNursery(String childrenNursery) {
		this.childrenNursery = childrenNursery;
	}

	public String getChildrenPlayArea() {
		return childrenPlayArea;
	}

	public void setChildrenPlayArea(String childrenPlayArea) {
		this.childrenPlayArea = childrenPlayArea;
	}

	public String getClubhouse() {
		return clubhouse;
	}

	public void setClubhouse(String clubhouse) {
		this.clubhouse = clubhouse;
	}

	public String getCommunalGardens() {
		return communalGardens;
	}

	public void setCommunalGardens(String communalGardens) {
		this.communalGardens = communalGardens;
	}

	public String getConciergeService() {
		return conciergeService;
	}

	public void setConciergeService(String conciergeService) {
		this.conciergeService = conciergeService;
	}

	public String getCyclingTracks() {
		return cyclingTracks;
	}

	public void setCyclingTracks(String cyclingTracks) {
		this.cyclingTracks = cyclingTracks;
	}

	public String getFitnessCenter() {
		return fitnessCenter;
	}

	public void setFitnessCenter(String fitnessCenter) {
		this.fitnessCenter = fitnessCenter;
	}

	public String getGolfClubAndClubhouse() {
		return golfClubAndClubhouse;
	}

	public void setGolfClubAndClubhouse(String golfClubAndClubhouse) {
		this.golfClubAndClubhouse = golfClubAndClubhouse;
	}

	public String getLaundryService() {
		return laundryService;
	}

	public void setLaundryService(String laundryService) {
		this.laundryService = laundryService;
	}

	public String getMarinaBerth() {
		return marinaBerth;
	}

	public void setMarinaBerth(String marinaBerth) {
		this.marinaBerth = marinaBerth;
	}

	public String getMetroStation() {
		return metroStation;
	}

	public void setMetroStation(String metroStation) {
		this.metroStation = metroStation;
	}

	public String getMosque() {
		return mosque;
	}

	public void setMosque(String mosque) {
		this.mosque = mosque;
	}

	public String getPoloClubAndClubhouse() {
		return poloClubAndClubhouse;
	}

	public void setPoloClubAndClubhouse(String poloClubAndClubhouse) {
		this.poloClubAndClubhouse = poloClubAndClubhouse;
	}

	public String getPublicPark() {
		return publicPark;
	}

	public void setPublicPark(String publicPark) {
		this.publicPark = publicPark;
	}

	public String getPark() {
		return park;
	}

	public void setPark(String park) {
		this.park = park;
	}

	public String getMorgageStatus() {
		return morgageStatus;
	}

	public void setMorgageStatus(String morgageStatus) {
		this.morgageStatus = morgageStatus;
	}

	public String getMorgageRegNo() {
		return morgageRegNo;
	}

	public void setMorgageRegNo(String morgageRegNo) {
		this.morgageRegNo = morgageRegNo;
	}

	public String getBank() {
		return bank;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}

	public float getMorgageAmount() {
		return morgageAmount;
	}

	public void setMorgageAmount(float morgageAmount) {
		this.morgageAmount = morgageAmount;
	}

	public float getPreClosureCharges() {
		return preClosureCharges;
	}

	public void setPreClosureCharges(float preClosureCharges) {
		this.preClosureCharges = preClosureCharges;
	}

	public Calendar getDate() {
		return date;
	}

	public void setDate(Calendar date) {
		this.date = date;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public String getMorgageNoc() {
		return morgageNoc;
	}

	public void setMorgageNoc(String morgageNoc) {
		this.morgageNoc = morgageNoc;
	}

	public float getBalanceAmount() {
		return balanceAmount;
	}

	public void setBalanceAmount(float balanceAmount) {
		this.balanceAmount = balanceAmount;
	}

	public Calendar getLeaseStartDate() {
		return leaseStartDate;
	}

	public void setLeaseStartDate(Calendar leaseStartDate) {
		this.leaseStartDate = leaseStartDate;
	}

	public Calendar getLeaseExpiryDate() {
		return leaseExpiryDate;
	}

	public void setLeaseExpiryDate(Calendar leaseExpiryDate) {
		this.leaseExpiryDate = leaseExpiryDate;
	}

	public String getTenantName() {
		return tenantName;
	}

	public void setTenantName(String tenantName) {
		this.tenantName = tenantName;
	}

	public String getTenancyContractUpload() {
		return tenancyContractUpload;
	}

	public void setTenancyContractUpload(String tenancyContractUpload) {
		this.tenancyContractUpload = tenancyContractUpload;
	}

	public String getIsRented() {
		return isRented;
	}

	public void setIsRented(String isRented) {
		this.isRented = isRented;
	}

	public String getIsVacant() {
		return isVacant;
	}

	public void setIsVacant(String isVacant) {
		this.isVacant = isVacant;
	}

	public Integer getRentalEjariNo() {
		return rentalEjariNo;
	}

	public void setRentalEjariNo(Integer rentalEjariNo) {
		this.rentalEjariNo = rentalEjariNo;
	}

	public float getRentalAnnualRent() {
		return rentalAnnualRent;
	}

	public void setRentalAnnualRent(float rentalAnnualRent) {
		this.rentalAnnualRent = rentalAnnualRent;
	}

	public Integer getRentalPaymentChecks() {
		return rentalPaymentChecks;
	}

	public void setRentalPaymentChecks(Integer rentalPaymentChecks) {
		this.rentalPaymentChecks = rentalPaymentChecks;
	}

	public String getPaymentStructure() {
		return paymentStructure;
	}

	public void setPaymentStructure(String paymentStructure) {
		this.paymentStructure = paymentStructure;
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

	public String getBulidingName() {
		return bulidingName;
	}

	public void setBulidingName(String bulidingName) {
		this.bulidingName = bulidingName;
	}

	public String getBulidingNumber() {
		return bulidingNumber;
	}

	public void setBulidingNumber(String bulidingNumber) {
		this.bulidingNumber = bulidingNumber;
	}

	public String getTypePropertyOther() {
		return typePropertyOther;
	}

	public void setTypePropertyOther(String typePropertyOther) {
		this.typePropertyOther = typePropertyOther;
	}

	public String getPropertyStatusOther() {
		return propertyStatusOther;
	}

	public void setPropertyStatusOther(String propertyStatusOther) {
		this.propertyStatusOther = propertyStatusOther;
	}

	public String getFloorPlanUpload() {
		return floorPlanUpload;
	}

	public void setFloorPlanUpload(String floorPlanUpload) {
		this.floorPlanUpload = floorPlanUpload;
	}

	public String getGrossArea() {
		return grossArea;
	}

	public void setGrossArea(String grossArea) {
		this.grossArea = grossArea;
	}

	public String getNetArea() {
		return netArea;
	}

	public void setNetArea(String netArea) {
		this.netArea = netArea;
	}

	public ChiraghPropertyDetailsDTO() {
		
	}
		
}
