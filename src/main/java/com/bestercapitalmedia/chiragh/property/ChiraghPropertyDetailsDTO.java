package com.bestercapitalmedia.chiragh.property;

import java.util.Calendar;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
public class ChiraghPropertyDetailsDTO {
	
	String typeTitle;
	String propertyTitle;
	String propertyDescription;
	String location;
	float sizePerSqft;
	String address;
	float askingPrice;
	String areaPermitNo;
	String propertyReferenceNo;
	float pricePerSqft;
	
	Integer noOfBedrooms;
	Integer noOfBaths;
	Integer isMortgage;
	float mortgageValue;
	String mortageBank;
	Integer mortgageYear;
	Integer isRented;
	Integer isVacant;
	Integer rentalEjariNo;
	float rentalAnnualRent;
	Integer rentalPaymentChecks;
	Calendar rentalExpiryDate;
	String outdoorType;
	int isFurnished;
	int kitchenType;
	int isMaidRoom;
	int isSwimmingPool;
	int isGym;
	int isHeliPad;
	Integer noOfParking;
	Integer noOfFloors;
	String paymentMethod;
	String sellerSecurityDeposit;
	String sellerCommissionDeposit;
	String scannedTitleDeed;
	int agreeVatCommission;
	String mapLocation;
	String plotNo;
	String titleDeedNo;
	String typeArea;
	String projectName;
	String ownerAssociationNo;
	String presentUse;
	String communityNo;
	String propertyAge;
	Integer noUnits;
	Integer noShops;
	String noFacilities;
	Calendar leaseStartDate;
	Calendar leaseExpiryDate;
	String tenantName;
	String payementStructure;
	String tenancyContractUpload;
	String buyerSecurityDeposit;
	String buyerCommissionDeposit;
	int thirdPartyVerification;
	int isThirdPartyPayment;
	int verificationHodApproved;
	String valuationReportDocument;
	int valuationHodApproved;
	float listedPrice;
	float originalPrice;
	float paidAmount;
	float serviceCharge;
	String morgageStatus;
	String morgageRegNo;
	String bank;
	float morgageAmount;
	float preClosureCharges;
	Calendar paymentSchedule;
	Calendar date;
	float amount;
	String morgageNoc;
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
	public Integer getIsMortgage() {
		return isMortgage;
	}
	public void setIsMortgage(Integer isMortgage) {
		this.isMortgage = isMortgage;
	}
	public float getMortgageValue() {
		return mortgageValue;
	}
	public void setMortgageValue(float mortgageValue) {
		this.mortgageValue = mortgageValue;
	}
	public String getMortageBank() {
		return mortageBank;
	}
	public void setMortageBank(String mortageBank) {
		this.mortageBank = mortageBank;
	}
	public Integer getMortgageYear() {
		return mortgageYear;
	}
	public void setMortgageYear(Integer mortgageYear) {
		this.mortgageYear = mortgageYear;
	}
	public Integer getIsRented() {
		return isRented;
	}
	public void setIsRented(Integer isRented) {
		this.isRented = isRented;
	}
	public Integer getIsVacant() {
		return isVacant;
	}
	public void setIsVacant(Integer isVacant) {
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
	public Calendar getRentalExpiryDate() {
		return rentalExpiryDate;
	}
	public void setRentalExpiryDate(Calendar rentalExpiryDate) {
		this.rentalExpiryDate = rentalExpiryDate;
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
	public String getPaymentMethod() {
		return paymentMethod;
	}
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	public String getSellerSecurityDeposit() {
		return sellerSecurityDeposit;
	}
	public void setSellerSecurityDeposit(String sellerSecurityDeposit) {
		this.sellerSecurityDeposit = sellerSecurityDeposit;
	}
	public String getSellerCommissionDeposit() {
		return sellerCommissionDeposit;
	}
	public void setSellerCommissionDeposit(String sellerCommissionDeposit) {
		this.sellerCommissionDeposit = sellerCommissionDeposit;
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
	public String getNoFacilities() {
		return noFacilities;
	}
	public void setNoFacilities(String noFacilities) {
		this.noFacilities = noFacilities;
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
	public String getPayementStructure() {
		return payementStructure;
	}
	public void setPayementStructure(String payementStructure) {
		this.payementStructure = payementStructure;
	}
	public String getTenancyContractUpload() {
		return tenancyContractUpload;
	}
	public void setTenancyContractUpload(String tenancyContractUpload) {
		this.tenancyContractUpload = tenancyContractUpload;
	}
	public String getBuyerSecurityDeposit() {
		return buyerSecurityDeposit;
	}
	public void setBuyerSecurityDeposit(String buyerSecurityDeposit) {
		this.buyerSecurityDeposit = buyerSecurityDeposit;
	}
	public String getBuyerCommissionDeposit() {
		return buyerCommissionDeposit;
	}
	public void setBuyerCommissionDeposit(String buyerCommissionDeposit) {
		this.buyerCommissionDeposit = buyerCommissionDeposit;
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
	public Calendar getPaymentSchedule() {
		return paymentSchedule;
	}
	public void setPaymentSchedule(Calendar paymentSchedule) {
		this.paymentSchedule = paymentSchedule;
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
	public ChiraghPropertyDetailsDTO() {
		super();
		// TODO Auto-generated constructor stub
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
}
