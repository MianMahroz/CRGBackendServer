
package com.bestercapitalmedia.chiragh.property;

import java.io.Serializable;

import java.lang.StringBuilder;

import java.util.Calendar;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.Id;

import javax.xml.bind.annotation.*;

import com.bestercapitalmedia.chiragh.buyer.details.PropertyBuyerDetails;
import com.bestercapitalmedia.chiragh.property.auctionprocess.Propertyauctionprocess;
import com.bestercapitalmedia.chiragh.property.bidprocess.Propertybidprocess;
import com.bestercapitalmedia.chiragh.property.brokerage.Propertybrokerage;
import com.bestercapitalmedia.chiragh.property.images.Propertyimages;
import com.bestercapitalmedia.chiragh.property.marketanalysis.Propertymarketanalysis;
import com.bestercapitalmedia.chiragh.property.type.Propertytype;
import com.bestercapitalmedia.chiragh.seller.details.Propertysellerdetails;
import com.bestercapitalmedia.chiragh.seller.payments.Sellerpayments;
import com.bestercapitalmedia.chiragh.user.Chiraghuser;
import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

/**
 */

@Entity
@Table(catalog = "chiraghdatabase", name = "chiraghproperty")
public class Chiraghproperty implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 */

	@Column(name = "property_Id", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer propertyId;
	/**
	 */

	@Column(name = "property_Title", length = 50)
	@Basic(fetch = FetchType.EAGER)

	String propertyTitle;
	/**
	 */

	@Column(name = "property_Description", length = 50)
	@Basic(fetch = FetchType.EAGER)

	String propertyDescription;
	/**
	 */

	@Column(name = "location", length = 50)
	@Basic(fetch = FetchType.EAGER)

	String location;
	/**
	 */

	@Column(name = "size_Per_Sqft", precision = 12)
	@Basic(fetch = FetchType.EAGER)

	float sizePerSqft;
	/**
	 */

	@Column(name = "address", length = 50)
	@Basic(fetch = FetchType.EAGER)

	String address;
	/**
	 */

	@Column(name = "asking_Price", precision = 12)
	@Basic(fetch = FetchType.EAGER)

	float askingPrice;
	/**
	 */

	@Column(name = "area_Permit_No", length = 50)
	@Basic(fetch = FetchType.EAGER)

	String areaPermitNo;
	/**
	 */

	@Column(name = "property_Reference_No", length = 50)
	@Basic(fetch = FetchType.EAGER)

	String propertyReferenceNo;
	/**
	 */

	@Column(name = "price_Per_Sqft", precision = 12)
	@Basic(fetch = FetchType.EAGER)

	float pricePerSqft;
	/**
	 */

	@Column(name = "is_Md_Approved")
	@Basic(fetch = FetchType.EAGER)

	int isMdApproved;
	/**
	 */

	@Column(name = "is_Published")
	@Basic(fetch = FetchType.EAGER)

	int isPublished;
	/**
	 */

	@Column(name = "payment_Verification_Code", length = 50)
	@Basic(fetch = FetchType.EAGER)

	String paymentVerificationCode;
	/**
	 */

	@Column(name = "no_Of_Bedrooms")
	@Basic(fetch = FetchType.EAGER)

	Integer noOfBedrooms;
	/**
	 */

	@Column(name = "no_Of_Baths")
	@Basic(fetch = FetchType.EAGER)

	Integer noOfBaths;
	/**
	 */

	@Column(name = "is_Mortgage")
	@Basic(fetch = FetchType.EAGER)

	Integer isMortgage;
	/**
	 */

	@Column(name = "mortgage_Value", precision = 12)
	@Basic(fetch = FetchType.EAGER)

	float mortgageValue;
	/**
	 */

	@Column(name = "mortage_Bank", length = 45)
	@Basic(fetch = FetchType.EAGER)

	String mortageBank;
	/**
	 */

	@Column(name = "mortgage_Year")
	@Basic(fetch = FetchType.EAGER)

	Integer mortgageYear;
	/**
	 */

	@Column(name = "is_Rented")
	@Basic(fetch = FetchType.EAGER)

	Integer isRented;
	/**
	 */
	@Column(name = "is_Vacant")
	@Basic(fetch = FetchType.EAGER)
	Integer isVacant;

	@Column(name = "rental_Ejari_No")
	@Basic(fetch = FetchType.EAGER)

	Integer rentalEjariNo;
	/**
	 */

	@Column(name = "rental_Annual_Rent")
	@Basic(fetch = FetchType.EAGER)

	float rentalAnnualRent;
	/**
	 */

	@Column(name = "rental_Payment_Checks")
	@Basic(fetch = FetchType.EAGER)

	Integer rentalPaymentChecks;
	/**
	 */
	@Temporal(TemporalType.DATE)
	@Column(name = "rental_Expiry_Date")
	@Basic(fetch = FetchType.EAGER)

	Calendar rentalExpiryDate;
	/**
	 */

	@Column(name = "outdoor_Type", length = 25)
	@Basic(fetch = FetchType.EAGER)

	String outdoorType;
	/**
	 */

	@Column(name = "is_Furnished")
	@Basic(fetch = FetchType.EAGER)

	int isFurnished;
	/**
	 */

	@Column(name = "kitchen_Type")
	@Basic(fetch = FetchType.EAGER)

	int kitchenType;
	/**
	 */

	@Column(name = "is_Maid_Room")
	@Basic(fetch = FetchType.EAGER)

	int isMaidRoom;
	/**
	 */

	@Column(name = "is_Swimming_Pool")
	@Basic(fetch = FetchType.EAGER)

	int isSwimmingPool;
	/**
	 */

	@Column(name = "is_Gym")
	@Basic(fetch = FetchType.EAGER)

	int isGym;
	/**
	 */

	@Column(name = "is_Heli_Pad")
	@Basic(fetch = FetchType.EAGER)

	int isHeliPad;
	/**
	 */

	@Column(name = "no_Of_Parking")
	@Basic(fetch = FetchType.EAGER)

	Integer noOfParking;
	/**
	 */

	@Column(name = "no_Of_Floors")
	@Basic(fetch = FetchType.EAGER)

	Integer noOfFloors;
	/**
	 */

	@Column(name = "payment_Method", length = 25)
	@Basic(fetch = FetchType.EAGER)

	String paymentMethod;
	/**
	 */

	@Column(name = "seller_Security_Deposit", length = 25)
	@Basic(fetch = FetchType.EAGER)

	String sellerSecurityDeposit;
	/**
	 */

	@Column(name = "seller_Commission_Deposit", length = 25)
	@Basic(fetch = FetchType.EAGER)

	String sellerCommissionDeposit;
	/**
	 */

	@Column(name = "scanned_Title_Deed", length = 25)
	@Basic(fetch = FetchType.EAGER)

	String scannedTitleDeed;
	/**
	 */

	@Column(name = "agree_Vat_Commission")
	@Basic(fetch = FetchType.EAGER)

	int agreeVatCommission;
	/**
	 */

	@Column(name = "map_Location", length = 50)
	@Basic(fetch = FetchType.EAGER)

	String mapLocation;
	/**
	 */

	@Column(name = "plot_No", length = 50)
	@Basic(fetch = FetchType.EAGER)

	String plotNo;
	/**
	 */

	@Column(name = "title_Deed_No", length = 50)
	@Basic(fetch = FetchType.EAGER)

	String titleDeedNo;
	/**
	 */

	@Column(name = "type_Area", length = 50)
	@Basic(fetch = FetchType.EAGER)

	String typeArea;
	/**
	 */

	@Column(name = "project_Name", length = 25)
	@Basic(fetch = FetchType.EAGER)

	String projectName;
	/**
	 */

	@Column(name = "owner_Association_No", length = 25)
	@Basic(fetch = FetchType.EAGER)

	String ownerAssociationNo;
	/**
	 */

	@Column(name = "present_Use", length = 25)
	@Basic(fetch = FetchType.EAGER)

	String presentUse;
	/**
	 */

	@Column(name = "community_No", length = 25)
	@Basic(fetch = FetchType.EAGER)

	String communityNo;
	/**
	 */

	@Column(name = "property_Age", length = 50)
	@Basic(fetch = FetchType.EAGER)

	String propertyAge;
	/**
	 */

	@Column(name = "no_Units")
	@Basic(fetch = FetchType.EAGER)

	Integer noUnits;
	/**
	 */

	@Column(name = "no_Shops")
	@Basic(fetch = FetchType.EAGER)

	Integer noShops;
	/**
	 */

	@Column(name = "no_Facilities", length = 25)
	@Basic(fetch = FetchType.EAGER)

	String noFacilities;
	/**
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "lease_Start_Date")
	@Basic(fetch = FetchType.EAGER)

	Calendar leaseStartDate;
	/**
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "lease_Expiry_Date")
	@Basic(fetch = FetchType.EAGER)

	Calendar leaseExpiryDate;
	/**
	 */

	@Column(name = "tenant_Name", length = 25)
	@Basic(fetch = FetchType.EAGER)

	String tenantName;
	/**
	 */

	@Column(name = "payement_Structure", length = 25)
	@Basic(fetch = FetchType.EAGER)

	String payementStructure;
	/**
	 */

	@Column(name = "tenancy_Contract_Upload", length = 25)
	@Basic(fetch = FetchType.EAGER)

	String tenancyContractUpload;
	/**
	 */

	@Column(name = "buyer_Security_Deposit", length = 25)
	@Basic(fetch = FetchType.EAGER)

	String buyerSecurityDeposit;
	/**
	 */

	@Column(name = "buyer_Commission_Deposit", length = 25)
	@Basic(fetch = FetchType.EAGER)

	String buyerCommissionDeposit;
	/**
	 */

	@Column(name = "third_Party_Verification")
	@Basic(fetch = FetchType.EAGER)

	int thirdPartyVerification;
	/**
	 */

	@Column(name = "is_Third_Party_Payment")
	@Basic(fetch = FetchType.EAGER)

	int isThirdPartyPayment;
	/**
	 */

	@Column(name = "verification_Hod_Approved")
	@Basic(fetch = FetchType.EAGER)

	int verificationHodApproved;
	/**
	 */

	@Column(name = "valuation_Report_Document", length = 25)
	@Basic(fetch = FetchType.EAGER)

	String valuationReportDocument;
	/**
	 */

	@Column(name = "valuation_Hod_Approved")
	@Basic(fetch = FetchType.EAGER)

	int valuationHodApproved;
	/**
	 */

	@Column(name = "listed_Price", precision = 12)
	@Basic(fetch = FetchType.EAGER)

	float listedPrice;
	/**
	 */

	@Column(name = "original_Price", precision = 12)
	@Basic(fetch = FetchType.EAGER)

	float originalPrice;
	/**
	 */

	@Column(name = "paid_Amount", precision = 12)
	@Basic(fetch = FetchType.EAGER)

	float paidAmount;
	/**
	 */

	@Column(name = "service_Charge", precision = 12)
	@Basic(fetch = FetchType.EAGER)

	float serviceCharge;
	/**
	 */

	@Column(name = "morgage_Status", length = 45)
	@Basic(fetch = FetchType.EAGER)

	String morgageStatus;
	/**
	 */

	@Column(name = "morgage_Reg_No", length = 45)
	@Basic(fetch = FetchType.EAGER)

	String morgageRegNo;
	/**
	 */

	@Column(name = "bank", length = 45)
	@Basic(fetch = FetchType.EAGER)

	String bank;
	/**
	 */

	@Column(name = "morgage_Amount", precision = 12)
	@Basic(fetch = FetchType.EAGER)

	float morgageAmount;
	/**
	 */

	@Column(name = "pre_Closure_Charges", precision = 12)
	@Basic(fetch = FetchType.EAGER)

	float preClosureCharges;
	/**
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "payment_Schedule")
	@Basic(fetch = FetchType.EAGER)

	Calendar paymentSchedule;
	/**
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "Date")
	@Basic(fetch = FetchType.EAGER)

	Calendar date;
	/**
	 */

	@Column(name = "amount")
	@Basic(fetch = FetchType.EAGER)
	float amount;
	/**
	 */

	@Column(name = "morgage_Noc", length = 45)
	@Basic(fetch = FetchType.EAGER)
	String morgageNoc;

	/**
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "property_Type_Id", referencedColumnName = "property_Type_Id") })
	@JsonBackReference
	Propertytype propertytype;
	/**
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "user_Id", referencedColumnName = "user_Id") })
	@JsonBackReference
	Chiraghuser chiraghuser;
	/**
	 */
	@OneToMany(mappedBy = "chiraghproperty", fetch = FetchType.LAZY)

	java.util.Set<Propertymarketanalysis> propertymarketanalysises;
	/**
	 */
	@OneToMany(mappedBy = "chiraghproperty", fetch = FetchType.LAZY)

	java.util.Set<Propertyauctionprocess> propertyauctionprocesses;
	/**
	 */
	@OneToMany(mappedBy = "chiraghproperty", fetch = FetchType.LAZY)

	java.util.Set<Propertybidprocess> propertybidprocesses;
	/**
	 */
	@OneToMany(mappedBy = "chiraghproperty", fetch = FetchType.LAZY)

	java.util.Set<Sellerpayments> sellerpaymentses;

	@OneToMany(mappedBy = "chiraghproperty", fetch = FetchType.LAZY)

	java.util.Set<Propertysellerdetails> propertysellerdetailses;
	/**
	 */
	@OneToMany(mappedBy = "chiraghproperty", fetch = FetchType.LAZY)

	java.util.Set<Propertyimages> propertyimageses;
	/**
	 */
	@OneToMany(mappedBy = "chiraghproperty", fetch = FetchType.LAZY)

	java.util.Set<Propertybrokerage> propertybrokerages;

	/**
	 */
	public Chiraghproperty() {
	}

	public Integer getPropertyId() {
		return propertyId;
	}

	public void setPropertyId(Integer propertyId) {
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

	public int getIsMdApproved() {
		return isMdApproved;
	}

	public void setIsMdApproved(int isMdApproved) {
		this.isMdApproved = isMdApproved;
	}

	public int getIsPublished() {
		return isPublished;
	}

	public void setIsPublished(int isPublished) {
		this.isPublished = isPublished;
	}

	public String getPaymentVerificationCode() {
		return paymentVerificationCode;
	}

	public void setPaymentVerificationCode(String paymentVerificationCode) {
		this.paymentVerificationCode = paymentVerificationCode;
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

	public Integer getRentalEjariNo() {
		return rentalEjariNo;
	}

	public void setRentalEjariNo(Integer rentalEjariNo) {
		this.rentalEjariNo = rentalEjariNo;
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

	public Propertytype getPropertytype() {
		return propertytype;
	}

	public void setPropertytype(Propertytype propertytype) {
		this.propertytype = propertytype;
	}

	public Chiraghuser getChiraghuser() {
		return chiraghuser;
	}

	public void setChiraghuser(Chiraghuser chiraghuser) {
		this.chiraghuser = chiraghuser;
	}

	public java.util.Set<Propertymarketanalysis> getPropertymarketanalysises() {
		return propertymarketanalysises;
	}

	public void setPropertymarketanalysises(java.util.Set<Propertymarketanalysis> propertymarketanalysises) {
		this.propertymarketanalysises = propertymarketanalysises;
	}

	public java.util.Set<Propertyauctionprocess> getPropertyauctionprocesses() {
		return propertyauctionprocesses;
	}

	public void setPropertyauctionprocesses(java.util.Set<Propertyauctionprocess> propertyauctionprocesses) {
		this.propertyauctionprocesses = propertyauctionprocesses;
	}

	public java.util.Set<Propertybidprocess> getPropertybidprocesses() {
		return propertybidprocesses;
	}

	public void setPropertybidprocesses(java.util.Set<Propertybidprocess> propertybidprocesses) {
		this.propertybidprocesses = propertybidprocesses;
	}

	public java.util.Set<Sellerpayments> getSellerpaymentses() {
		return sellerpaymentses;
	}

	public void setSellerpaymentses(java.util.Set<Sellerpayments> sellerpaymentses) {
		this.sellerpaymentses = sellerpaymentses;
	}

	public java.util.Set<Propertysellerdetails> getPropertysellerdetailses() {
		return propertysellerdetailses;
	}

	public void setPropertysellerdetailses(java.util.Set<Propertysellerdetails> propertysellerdetailses) {
		this.propertysellerdetailses = propertysellerdetailses;
	}

	public java.util.Set<Propertyimages> getPropertyimageses() {
		return propertyimageses;
	}

	public void setPropertyimageses(java.util.Set<Propertyimages> propertyimageses) {
		this.propertyimageses = propertyimageses;
	}

	public java.util.Set<Propertybrokerage> getPropertybrokerages() {
		return propertybrokerages;
	}

	public void setPropertybrokerages(java.util.Set<Propertybrokerage> propertybrokerages) {
		this.propertybrokerages = propertybrokerages;
	}

	public Integer getIsVacant() {
		return isVacant;
	}

	public void setIsVacant(Integer isVacant) {
		this.isVacant = isVacant;
	}

	public void setRentalAnnualRent(float rentalAnnualRent) {
		this.rentalAnnualRent = rentalAnnualRent;
	}

	public float getRentalAnnualRent() {
		return rentalAnnualRent;
	}

}
