package com.bestercapitalmedia.chiragh.property;

import java.util.Calendar;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
public class ChiraghPropertyDetailsDTO {
	
	private String userName;
	private int propertyId;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	private String typeTitle;
	private String propertyTitle;
	private String propertyDescription;
	private String propertyNo;
	private String builtInWardrobes;
	private String maidRoom;
	private String propertyStatus;
	private String propertyType;
	private String location;
	private float sizePerSqft;
	private String address;
	private float askingPrice;
	private String areaPermitNo;
	private String propertyReferenceNo;
	private float pricePerSqft;
	private Integer noOfBedrooms;
	private Integer noOfBaths;
	private Integer floorNo;
	private Integer kitchens;
	private Integer carParks;
	private int publicParking;
	private String balcony;
	private String basementParking;
	private String bbqArea;
	private String broadbandReady;
	private Integer noOfFloors;
	private String scannedTitleDeed;
	private int agreeVatCommission;
	private String mapLocation;
	private String plotNo;
	private String titleDeedNo;
	private String typeArea;
	private String projectName;
	private String ownerAssociationNo;
	private String presentUse;
	private String communityNo;
	private String propertyAge;
	private Integer noUnits;
	private Integer noShops;
	private int thirdPartyVerification;
	private int isThirdPartyPayment;
	private int verificationHodApproved;
	private String valuationReportDocument;
	private int valuationHodApproved;
	private float listedPrice;
	private float originalPrice;
	private float paidAmount;
	private float serviceCharge;
	private String paymentSchedule;
	private int statusval;
	private String carpets;
	private String centralAirConditioning;
	private String centralHeating;
	private String communityView;
	private String coveredParking;
	private String driverRoom;
	private String fullyFittedKitchen;
	private String fullyFurnished;
	private String gymnasium;
	private String intercom;
	private String jacuzzi;
	private String onHighFloor;
	private String publicTransport;
	private String recreationalFacilities;
	private String restaurants;
	private String school;
	private String shoppingMall;
	private String shops;
	private String sportsAcademies;
	private String squashCourts;
	private String tennisCourts;
	private String valetService;
	private String laundryWashingRoom;
	private String walkingTrails;
	private String schoolsInNeighbourhood;
	private String metros;
	private String medicalCenters;
	private String shoppingMalls;
	private String mosquesInNeighbourhood;
	private String beaches;
	private String supermarkets;
	private String petsAllowed;
	private String marbleFloors;
	private String onLowFloor;
	private String onMidFloor;
	private String partFurnished;
	private String privateGarage;
	private String privateGarden;
	private String satelliteCableTV;
	private String sauna;
	private String solidWoodFloors;
	private String steamRoom;
	private String storageRoom;
	private String study;
	private String upgradedInterior;
	private String viewOfGardens;
	private String viewOfGolfcourse;
	private String viewOfParkland;
	private String viewOfSeaWater;
	private String laundrywashingRoom;
	private String privateSwimmingPool;
	private String sharedSwimmingPool;
	private String gazeboAndOutdoorEntertainingArea;
	private String kitchenWhiteGoods;
	private String landscapedGarden;
	private String HoursMaintenance;
	private String bankatmFacility;
	private String basketballCourt;
	private String beachAccess;
	private String busServices;
	private String businessCenter;
	private String childrenNursery;
	private String childrenPlayArea;
	private String clubhouse;
	private String communalGardens;
	private String conciergeService;
	private String cyclingTracks;
	private String fitnessCenter;
	private String golfClubAndClubhouse;
	private String laundryService;
	private String marinaBerth;
	private String metroStation;
	private String mosque;
	private String poloClubAndClubhouse;
	private String publicPark;
	private String park;
	
	public int getStatusval() {
		return statusval;
	}
	public void setStatusval(int statusval) {
		this.statusval = statusval;
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
	
	public String getPropertyStatus() {
		return propertyStatus;
	}
	public void setPropertyStatus(String propertyStatus) {
		this.propertyStatus = propertyStatus;
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

	public int getThirdPartyVerification() {
		return thirdPartyVerification;
	}
	public void setThirdPartyVerification(int thirdPartyVerification) {
		this.thirdPartyVerification = thirdPartyVerification;
	}
	public int getIsThirdPartyPayment() {
		return isThirdPartyPayment;
	}
	public void setIsThirdPartyPayment(int isThirdPartyPayment) {
		this.isThirdPartyPayment = isThirdPartyPayment;
	}
	public int getVerificationHodApproved() {
		return verificationHodApproved;
	}
	public void setVerificationHodApproved(int verificationHodApproved) {
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

	
	public ChiraghPropertyDetailsDTO() {
	
	}
	public String getPropertyTitle() {
		return propertyTitle;
	}
	public void setPropertyTitle(String propertyTitle) {
		this.propertyTitle = propertyTitle;
	}
	
	public String getTypeTitle() {
		return typeTitle;
	}
	public void setTypeTitle(String typeTitle) {
		this.typeTitle = typeTitle;
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
	
	public String getPropertyType() {
		return propertyType;
	}
	public void setPropertyType(String propertyType) {
		this.propertyType = propertyType;
	}
	public String getPropertyNo() {
		return propertyNo;
	}
	public void setPropertyNo(String propertyNo) {
		this.propertyNo = propertyNo;
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
	public int getPropertyId() {
		return propertyId;
	}
	public void setPropertyId(int propertyId) {
		this.propertyId = propertyId;
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
	public String getPaymentSchedule() {
		return paymentSchedule;
	}
	public void setPaymentSchedule(String paymentSchedule) {
		this.paymentSchedule = paymentSchedule;
	}
	

	
}
