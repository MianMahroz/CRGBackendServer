
package com.bestercapitalmedia.chiragh.property;

import java.io.Serializable;

import java.lang.StringBuilder;


import java.util.Calendar;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.Id;

import javax.xml.bind.annotation.*;

import com.bestercapitalmedia.chiragh.buyer.details.Propertybuyerdetails;
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

	@Column(name = "property_Id")
	@Basic(fetch = FetchType.EAGER)
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
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

	@XmlElement
	String propertyDescription;
	/**
	 */

	@Column(name = "location", length = 50)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String location;
	/**
	 */

	@Column(name = "size_Per_Sqft", precision = 12)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
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

	@Column(name = "rental_Ejari_No")
	@Basic(fetch = FetchType.EAGER)

	
	Integer rentalEjariNo;
	/**
	 */

	@Column(name = "rental_Annual_Rent")
	@Basic(fetch = FetchType.EAGER)

	
	Integer rentalAnnualRent;
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

	@Column(name = "is_Gyma")
	@Basic(fetch = FetchType.EAGER)

	
	int isGyma;
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

	@Column(name = "scanned_Title_Deed", length = 25, nullable = false)
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

	@Column(name = "property_Status", length = 25)
	@Basic(fetch = FetchType.EAGER)

	
	String propertyStatus;
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
	@Column(name = "lease_Start_Date", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	
	Calendar leaseStartDate;
	/**
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "lease_Expiry_Date", nullable = false)
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

	@Column(name = "tenancy_Contract_Upload", length = 25, nullable = false)
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
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "property_Type_Id", referencedColumnName = "property_Type_Id") })
	@JsonBackReference
	Propertytype propertytype;
	/**
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "user_Id", referencedColumnName = "user_Id", nullable = false) })
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
	/**
	 */
	@OneToMany(mappedBy = "chiraghproperty", fetch = FetchType.LAZY)

	
	java.util.Set<Propertybuyerdetails> propertybuyerdetailses;
	/**
	 */
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
	public void setPropertyId(Integer propertyId) {
		this.propertyId = propertyId;
	}

	/**
	 */
	public Integer getPropertyId() {
		return this.propertyId;
	}

	/**
	 */
	public void setPropertyTitle(String propertyTitle) {
		this.propertyTitle = propertyTitle;
	}

	/**
	 */
	public String getPropertyTitle() {
		return this.propertyTitle;
	}

	/**
	 */
	public void setPropertyDescription(String propertyDescription) {
		this.propertyDescription = propertyDescription;
	}

	/**
	 */
	public String getPropertyDescription() {
		return this.propertyDescription;
	}

	/**
	 */
	public void setLocation(String location) {
		this.location = location;
	}

	/**
	 */
	public String getLocation() {
		return this.location;
	}

	/**
	 */
	public void setSizePerSqft(float sizePerSqft) {
		this.sizePerSqft = sizePerSqft;
	}

	/**
	 */
	public float getSizePerSqft() {
		return this.sizePerSqft;
	}

	/**
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 */
	public String getAddress() {
		return this.address;
	}

	/**
	 */
	public void setAskingPrice(float askingPrice) {
		this.askingPrice = askingPrice;
	}

	/**
	 */
	public float getAskingPrice() {
		return this.askingPrice;
	}

	/**
	 */
	public void setAreaPermitNo(String areaPermitNo) {
		this.areaPermitNo = areaPermitNo;
	}

	/**
	 */
	public String getAreaPermitNo() {
		return this.areaPermitNo;
	}

	/**
	 */
	public void setPropertyReferenceNo(String propertyReferenceNo) {
		this.propertyReferenceNo = propertyReferenceNo;
	}

	/**
	 */
	public String getPropertyReferenceNo() {
		return this.propertyReferenceNo;
	}

	/**
	 */
	public void setPricePerSqft(float pricePerSqft) {
		this.pricePerSqft = pricePerSqft;
	}

	/**
	 */
	public float getPricePerSqft() {
		return this.pricePerSqft;
	}

	/**
	 */
	public void setIsMdApproved(int isMdApproved) {
		this.isMdApproved = isMdApproved;
	}

	/**
	 */
	public int getIsMdApproved() {
		return this.isMdApproved;
	}

	/**
	 */
	public void setIsPublished(int isPublished) {
		this.isPublished = isPublished;
	}

	/**
	 */
	public int getIsPublished() {
		return this.isPublished;
	}

	/**
	 */
	public void setPaymentVerificationCode(String paymentVerificationCode) {
		this.paymentVerificationCode = paymentVerificationCode;
	}

	/**
	 */
	public String getPaymentVerificationCode() {
		return this.paymentVerificationCode;
	}

	/**
	 */
	public void setNoOfBedrooms(Integer noOfBedrooms) {
		this.noOfBedrooms = noOfBedrooms;
	}

	/**
	 */
	public Integer getNoOfBedrooms() {
		return this.noOfBedrooms;
	}

	/**
	 */
	public void setNoOfBaths(Integer noOfBaths) {
		this.noOfBaths = noOfBaths;
	}

	/**
	 */
	public Integer getNoOfBaths() {
		return this.noOfBaths;
	}

	/**
	 */
	public void setIsMortgage(Integer isMortgage) {
		this.isMortgage = isMortgage;
	}

	/**
	 */
	public Integer getIsMortgage() {
		return this.isMortgage;
	}

	/**
	 */
	public void setMortgageValue(float mortgageValue) {
		this.mortgageValue = mortgageValue;
	}

	/**
	 */
	public float getMortgageValue() {
		return this.mortgageValue;
	}

	/**
	 */
	public void setMortageBank(String mortageBank) {
		this.mortageBank = mortageBank;
	}

	/**
	 */
	public String getMortageBank() {
		return this.mortageBank;
	}

	/**
	 */
	public void setMortgageYear(Integer mortgageYear) {
		this.mortgageYear = mortgageYear;
	}

	/**
	 */
	public Integer getMortgageYear() {
		return this.mortgageYear;
	}

	/**
	 */
	public void setIsRented(Integer isRented) {
		this.isRented = isRented;
	}

	/**
	 */
	public Integer getIsRented() {
		return this.isRented;
	}

	/**
	 */
	public void setRentalEjariNo(Integer rentalEjariNo) {
		this.rentalEjariNo = rentalEjariNo;
	}

	/**
	 */
	public Integer getRentalEjariNo() {
		return this.rentalEjariNo;
	}

	/**
	 */
	public void setRentalAnnualRent(Integer rentalAnnualRent) {
		this.rentalAnnualRent = rentalAnnualRent;
	}

	/**
	 */
	public Integer getRentalAnnualRent() {
		return this.rentalAnnualRent;
	}

	/**
	 */
	public void setRentalPaymentChecks(Integer rentalPaymentChecks) {
		this.rentalPaymentChecks = rentalPaymentChecks;
	}

	/**
	 */
	public Integer getRentalPaymentChecks() {
		return this.rentalPaymentChecks;
	}

	/**
	 */
	public void setRentalExpiryDate(Calendar rentalExpiryDate) {
		this.rentalExpiryDate = rentalExpiryDate;
	}

	/**
	 */
	public Calendar getRentalExpiryDate() {
		return this.rentalExpiryDate;
	}

	/**
	 */
	public void setOutdoorType(String outdoorType) {
		this.outdoorType = outdoorType;
	}

	/**
	 */
	public String getOutdoorType() {
		return this.outdoorType;
	}

	/**
	 */
	public void setIsFurnished(int isFurnished) {
		this.isFurnished = isFurnished;
	}

	/**
	 */
	public int getIsFurnished() {
		return this.isFurnished;
	}

	/**
	 */
	public void setKitchenType(int kitchenType) {
		this.kitchenType = kitchenType;
	}

	/**
	 */
	public int getKitchenType() {
		return this.kitchenType;
	}

	/**
	 */
	public void setIsMaidRoom(int isMaidRoom) {
		this.isMaidRoom = isMaidRoom;
	}

	/**
	 */
	public int getIsMaidRoom() {
		return this.isMaidRoom;
	}

	/**
	 */
	public void setIsSwimmingPool(int isSwimmingPool) {
		this.isSwimmingPool = isSwimmingPool;
	}

	/**
	 */
	public int getIsSwimmingPool() {
		return this.isSwimmingPool;
	}

	/**
	 */
	public void setIsGyma(int isGyma) {
		this.isGyma = isGyma;
	}

	/**
	 */
	public int getIsGyma() {
		return this.isGyma;
	}

	/**
	 */
	public void setIsHeliPad(int isHeliPad) {
		this.isHeliPad = isHeliPad;
	}

	/**
	 */
	public int getIsHeliPad() {
		return this.isHeliPad;
	}

	/**
	 */
	public void setNoOfParking(Integer noOfParking) {
		this.noOfParking = noOfParking;
	}

	/**
	 */
	public Integer getNoOfParking() {
		return this.noOfParking;
	}

	/**
	 */
	public void setNoOfFloors(Integer noOfFloors) {
		this.noOfFloors = noOfFloors;
	}

	/**
	 */
	public Integer getNoOfFloors() {
		return this.noOfFloors;
	}

	/**
	 */
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	/**
	 */
	public String getPaymentMethod() {
		return this.paymentMethod;
	}

	/**
	 */
	public void setSellerSecurityDeposit(String sellerSecurityDeposit) {
		this.sellerSecurityDeposit = sellerSecurityDeposit;
	}

	/**
	 */
	public String getSellerSecurityDeposit() {
		return this.sellerSecurityDeposit;
	}

	/**
	 */
	public void setSellerCommissionDeposit(String sellerCommissionDeposit) {
		this.sellerCommissionDeposit = sellerCommissionDeposit;
	}

	/**
	 */
	public String getSellerCommissionDeposit() {
		return this.sellerCommissionDeposit;
	}

	/**
	 */
	public void setScannedTitleDeed(String scannedTitleDeed) {
		this.scannedTitleDeed = scannedTitleDeed;
	}

	/**
	 */
	public String getScannedTitleDeed() {
		return this.scannedTitleDeed;
	}

	/**
	 */
	public void setAgreeVatCommission(int agreeVatCommission) {
		this.agreeVatCommission = agreeVatCommission;
	}

	/**
	 */
	public int getAgreeVatCommission() {
		return this.agreeVatCommission;
	}

	/**
	 */
	public void setMapLocation(String mapLocation) {
		this.mapLocation = mapLocation;
	}

	/**
	 */
	public String getMapLocation() {
		return this.mapLocation;
	}

	/**
	 */
	public void setPlotNo(String plotNo) {
		this.plotNo = plotNo;
	}

	/**
	 */
	public String getPlotNo() {
		return this.plotNo;
	}

	/**
	 */
	public void setTitleDeedNo(String titleDeedNo) {
		this.titleDeedNo = titleDeedNo;
	}

	/**
	 */
	public String getTitleDeedNo() {
		return this.titleDeedNo;
	}

	/**
	 */
	public void setPropertyStatus(String propertyStatus) {
		this.propertyStatus = propertyStatus;
	}

	/**
	 */
	public String getPropertyStatus() {
		return this.propertyStatus;
	}

	/**
	 */
	public void setTypeArea(String typeArea) {
		this.typeArea = typeArea;
	}

	/**
	 */
	public String getTypeArea() {
		return this.typeArea;
	}

	/**
	 */
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	/**
	 */
	public String getProjectName() {
		return this.projectName;
	}

	/**
	 */
	public void setOwnerAssociationNo(String ownerAssociationNo) {
		this.ownerAssociationNo = ownerAssociationNo;
	}

	/**
	 */
	public String getOwnerAssociationNo() {
		return this.ownerAssociationNo;
	}

	/**
	 */
	public void setPresentUse(String presentUse) {
		this.presentUse = presentUse;
	}

	/**
	 */
	public String getPresentUse() {
		return this.presentUse;
	}

	/**
	 */
	public void setCommunityNo(String communityNo) {
		this.communityNo = communityNo;
	}

	/**
	 */
	public String getCommunityNo() {
		return this.communityNo;
	}

	/**
	 */
	public void setPropertyAge(String propertyAge) {
		this.propertyAge = propertyAge;
	}

	/**
	 */
	public String getPropertyAge() {
		return this.propertyAge;
	}

	/**
	 */
	public void setNoUnits(Integer noUnits) {
		this.noUnits = noUnits;
	}

	/**
	 */
	public Integer getNoUnits() {
		return this.noUnits;
	}

	/**
	 */
	public void setNoShops(Integer noShops) {
		this.noShops = noShops;
	}

	/**
	 */
	public Integer getNoShops() {
		return this.noShops;
	}

	/**
	 */
	public void setNoFacilities(String noFacilities) {
		this.noFacilities = noFacilities;
	}

	/**
	 */
	public String getNoFacilities() {
		return this.noFacilities;
	}

	/**
	 */
	public void setLeaseStartDate(Calendar leaseStartDate) {
		this.leaseStartDate = leaseStartDate;
	}

	/**
	 */
	public Calendar getLeaseStartDate() {
		return this.leaseStartDate;
	}

	/**
	 */
	public void setLeaseExpiryDate(Calendar leaseExpiryDate) {
		this.leaseExpiryDate = leaseExpiryDate;
	}

	/**
	 */
	public Calendar getLeaseExpiryDate() {
		return this.leaseExpiryDate;
	}

	/**
	 */
	public void setTenantName(String tenantName) {
		this.tenantName = tenantName;
	}

	/**
	 */
	public String getTenantName() {
		return this.tenantName;
	}

	/**
	 */
	public void setPayementStructure(String payementStructure) {
		this.payementStructure = payementStructure;
	}

	/**
	 */
	public String getPayementStructure() {
		return this.payementStructure;
	}

	/**
	 */
	public void setTenancyContractUpload(String tenancyContractUpload) {
		this.tenancyContractUpload = tenancyContractUpload;
	}

	/**
	 */
	public String getTenancyContractUpload() {
		return this.tenancyContractUpload;
	}

	/**
	 */
	public void setBuyerSecurityDeposit(String buyerSecurityDeposit) {
		this.buyerSecurityDeposit = buyerSecurityDeposit;
	}

	/**
	 */
	public String getBuyerSecurityDeposit() {
		return this.buyerSecurityDeposit;
	}

	/**
	 */
	public void setBuyerCommissionDeposit(String buyerCommissionDeposit) {
		this.buyerCommissionDeposit = buyerCommissionDeposit;
	}

	/**
	 */
	public String getBuyerCommissionDeposit() {
		return this.buyerCommissionDeposit;
	}

	/**
	 */
	public void setThirdPartyVerification(int thirdPartyVerification) {
		this.thirdPartyVerification = thirdPartyVerification;
	}

	/**
	 */
	public int getThirdPartyVerification() {
		return this.thirdPartyVerification;
	}

	/**
	 */
	public void setIsThirdPartyPayment(int isThirdPartyPayment) {
		this.isThirdPartyPayment = isThirdPartyPayment;
	}

	/**
	 */
	public int getIsThirdPartyPayment() {
		return this.isThirdPartyPayment;
	}

	/**
	 */
	public void setVerificationHodApproved(int verificationHodApproved) {
		this.verificationHodApproved = verificationHodApproved;
	}

	/**
	 */
	public int getVerificationHodApproved() {
		return this.verificationHodApproved;
	}

	/**
	 */
	public void setValuationReportDocument(String valuationReportDocument) {
		this.valuationReportDocument = valuationReportDocument;
	}

	/**
	 */
	public String getValuationReportDocument() {
		return this.valuationReportDocument;
	}

	/**
	 */
	public void setValuationHodApproved(int valuationHodApproved) {
		this.valuationHodApproved = valuationHodApproved;
	}

	/**
	 */
	public int getValuationHodApproved() {
		return this.valuationHodApproved;
	}

	/**
	 */
	public void setPropertytype(Propertytype propertytype) {
		this.propertytype = propertytype;
	}

	/**
	 */
	public Propertytype getPropertytype() {
		return propertytype;
	}

	/**
	 */
	public void setChiraghuser(Chiraghuser chiraghuser) {
		this.chiraghuser = chiraghuser;
	}

	/**
	 */
	public Chiraghuser getChiraghuser() {
		return chiraghuser;
	}

	/**
	 */
	public void setPropertymarketanalysises(Set<Propertymarketanalysis> propertymarketanalysises) {
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

	public java.util.Set<Propertybuyerdetails> getPropertybuyerdetailses() {
		return propertybuyerdetailses;
	}

	public void setPropertybuyerdetailses(java.util.Set<Propertybuyerdetails> propertybuyerdetailses) {
		this.propertybuyerdetailses = propertybuyerdetailses;
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

	public java.util.Set<Propertymarketanalysis> getPropertymarketanalysises() {
		return propertymarketanalysises;
	}


	

	
}
