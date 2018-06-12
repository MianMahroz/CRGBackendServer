
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
import com.bestercapitalmedia.chiragh.property.marketanalysis.Propertymarketanalysis;
import com.bestercapitalmedia.chiragh.property.type.Propertytype;
import com.bestercapitalmedia.chiragh.seller.details.Propertysellerdetails;
import com.bestercapitalmedia.chiragh.seller.payments.SellerPayments;
import com.bestercapitalmedia.chiragh.user.Chiraghuser;
import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

/**
 */

@Entity
@Table(catalog = "chiraghdatabase", name = "chiraghproperty")
public class Chiraghproperty implements Serializable {
	private static final long serialVersionUID = 1L;

	

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

	String isRented;
	/**
	 */
	@Column(name = "is_Vacant")
	@Basic(fetch = FetchType.EAGER)
	String isVacant;

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
	
	@Column(name = "rental_Expiry_Date")
	@Basic(fetch = FetchType.EAGER)

	 Calendar rentalExpiryDate;
	
	
	
	@Column(name = "floor_No")
	@Basic(fetch = FetchType.EAGER)

	Integer floorNo;
	/**
	 */

	@Column(name = "kitchens")
	@Basic(fetch = FetchType.EAGER)

	Integer kitchens;
	/**
	 */

	@Column(name = "property_Type")
	@Basic(fetch = FetchType.EAGER)

	String propertyType;	
	
	@Column(name = "car_Parks")
	@Basic(fetch = FetchType.EAGER)

	Integer carParks;
	/**
	 */

	@Column(name = "public_Parking")
	@Basic(fetch = FetchType.EAGER)

	String publicParking;
	/**
	 */

	@Column(name = "balcony")
	@Basic(fetch = FetchType.EAGER)

	String balcony;
	
	
	@Column(name = "property_Status")
	@Basic(fetch = FetchType.EAGER)

	String  propertyStatus;
	/**
	 */

	@Column(name = "basement_Parking")
	@Basic(fetch = FetchType.EAGER)

	String basementParking;
	/**
	 */

	@Column(name = "bbq_Area")
	@Basic(fetch = FetchType.EAGER)

	String bbqArea;
	/**
	 */

	@Column(name = "broadband_Ready")
	@Basic(fetch = FetchType.EAGER)

	String broadbandReady;
	/**
	 */

	@Column(name = "carpets")
	@Basic(fetch = FetchType.EAGER)

	String carpets;
	/**
	 */

	@Column(name = "no_Of_Floors")
	@Basic(fetch = FetchType.EAGER)

	Integer noOfFloors;
	/**
	 */


	@Column(name = "central_Air_Conditioning")
	@Basic(fetch = FetchType.EAGER)

	String centralAirConditioning;
	/**
	 */

	@Column(name = "central_Heating")
	@Basic(fetch = FetchType.EAGER)

	String centralHeating;
	/**
	 */

	@Column(name = "scanned_Title_Deed", length = 25)
	@Basic(fetch = FetchType.EAGER)

	String scannedTitleDeed;
	/**
	 */
	
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

	@Column(name = "community_View")
	@Basic(fetch = FetchType.EAGER)

	String communityView;
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

	@Column(name = "payment_Structure", length = 25)
	@Basic(fetch = FetchType.EAGER)

	String paymentStructure;
	/**
	 */

	@Column(name = "tenancy_Contract_Upload", length = 25)
	@Basic(fetch = FetchType.EAGER)

	String tenancyContractUpload;
	/**
	 */

	@Column(name = "covered_Parking")
	@Basic(fetch = FetchType.EAGER)

	String coveredParking;
	/**
	 */

	@Column(name = "driver_Room")
	@Basic(fetch = FetchType.EAGER)

	String driverRoom;
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
	@Column(name = "maid_Room")
	@Basic(fetch = FetchType.EAGER)

	String maidRoom;
	
	
	@Column(name = "built_In_Wardrobes")
	@Basic(fetch = FetchType.EAGER)

	String builtInWardrobes;
	
	
	@Column(name = "property_No", length = 25)
	@Basic(fetch = FetchType.EAGER)

	String propertyNo;

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
	

	/**
	 */
	@Column(name = "paid_Amount", precision = 12)
	@Basic(fetch = FetchType.EAGER)

	float paidAmount;

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
	
	@Column(name = "payment_Schedule")
	@Basic(fetch = FetchType.EAGER)

	String paymentSchedule;
	/**
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "Date")
	@Basic(fetch = FetchType.EAGER)

	Calendar date;
	/**
	 */
	@Column(name="balance_Amount")
	float balanceAmount;
	
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
	@Column(name = "agree_Vat_Commission")
	@Basic(fetch = FetchType.EAGER)
	int agreeVatCommission;
	
	@Column(name = "fully_Fitted_Kitchen")
	@Basic(fetch = FetchType.EAGER)
	String fullyFittedKitchen;
	
	@Column(name = "fully_Furnished")
	@Basic(fetch = FetchType.EAGER)
	String fullyFurnished;


	@Column(name = "gymnasium")
	@Basic(fetch = FetchType.EAGER)
	String gymnasium;
	
	@Column(name = "intercom")
	@Basic(fetch = FetchType.EAGER)
	String intercom;
	
	@Column(name = "jacuzzi")
	@Basic(fetch = FetchType.EAGER)
	String jacuzzi;
	
	@Column(name = "on_High_Floor")
	@Basic(fetch = FetchType.EAGER)
	String onHighFloor;
	
	@Column(name = "public_Transport")
	@Basic(fetch = FetchType.EAGER)
	String publicTransport;
	
	@Column(name = "restaurants")
	@Basic(fetch = FetchType.EAGER)
	String restaurants;
	

	@Column(name = "recreational_Facilities")
	@Basic(fetch = FetchType.EAGER)
	String recreationalFacilities;
	

	@Column(name = "school")
	@Basic(fetch = FetchType.EAGER)
	String school;
	

	@Column(name = "shopping_Mall")
	@Basic(fetch = FetchType.EAGER)
	String shoppingMall;
	

	@Column(name = "shops")
	@Basic(fetch = FetchType.EAGER)
	String shops;
	

	@Column(name = "sports_Academies")
	@Basic(fetch = FetchType.EAGER)
	String sportsAcademies;
	

	@Column(name = "squash_Courts")
	@Basic(fetch = FetchType.EAGER)
	String squashCourts;
	

	@Column(name = "tennis_Courts")
	@Basic(fetch = FetchType.EAGER)
	String tennisCourts;
	

	@Column(name = "valet_Service")
	@Basic(fetch = FetchType.EAGER)
	String valetService;
	
	
	@Column(name = "laundry_WashingRoom")
	@Basic(fetch = FetchType.EAGER)
	String laundryWashingRoom;
	
	@Column(name = "walking_Trails")
	@Basic(fetch = FetchType.EAGER)
	String walkingTrails;
	
	@Column(name = "schools_In_Neighbourhood")
	@Basic(fetch = FetchType.EAGER)
	String schoolsInNeighbourhood;
	
	@Column(name = "metros")
	@Basic(fetch = FetchType.EAGER)
	String metros;
	
	@Column(name = "medical_Centers")
	@Basic(fetch = FetchType.EAGER)
	String medicalCenters;
	
	@Column(name = "shopping_Malls")
	@Basic(fetch = FetchType.EAGER)
	String shoppingMalls;
	
	@Column(name = "mosques_In_Neighbourhood")
	@Basic(fetch = FetchType.EAGER)
	String mosquesInNeighbourhood;
	
	@Column(name = "beaches")
	@Basic(fetch = FetchType.EAGER)
	String beaches;
	
	@Column(name = "supermarkets")
	@Basic(fetch = FetchType.EAGER)
	String supermarkets;
	
	@Column(name = "pets_Allowed")
	@Basic(fetch = FetchType.EAGER)
	String petsAllowed;
	
	@Column(name = "marble_Floors")
	@Basic(fetch = FetchType.EAGER)
	String marbleFloors;
	
	@Column(name = "on_Low_Floor")
	@Basic(fetch = FetchType.EAGER)
	String onLowFloor;
	
	@Column(name = "on_Mid_Floor")
	@Basic(fetch = FetchType.EAGER)
	String onMidFloor;
	
	@Column(name = "part_Furnished")
	@Basic(fetch = FetchType.EAGER)
	String partFurnished;
	
	@Column(name = "private_Garage")
	@Basic(fetch = FetchType.EAGER)
	String privateGarage;
	
	@Column(name = "satellite_Cable_TV")
	@Basic(fetch = FetchType.EAGER)
	String satelliteCableTV;
	
	@Column(name = "private_Garden")
	@Basic(fetch = FetchType.EAGER)
	String privateGarden;
	
	@Column(name = "sauna")
	@Basic(fetch = FetchType.EAGER)
	String sauna;
	
	@Column(name = "solid_Wood_Floors")
	@Basic(fetch = FetchType.EAGER)
	String solidWoodFloors;
	
	
	@Column(name = "steam_Room")
	@Basic(fetch = FetchType.EAGER)
	String steamRoom;
	
	
	@Column(name = "storage_Room")
	@Basic(fetch = FetchType.EAGER)
	String storageRoom;
	
	@Column(name = "study")
	@Basic(fetch = FetchType.EAGER)
	String study;
	
	
	@Column(name = "upgraded_Interior")
	@Basic(fetch = FetchType.EAGER)
	String upgradedInterior;
	
	@Column(name = "view_Of_Gardens")
	@Basic(fetch = FetchType.EAGER)
	String viewOfGardens;
	
	@Column(name = "view_Of_Golfcourse")
	@Basic(fetch = FetchType.EAGER)
	String viewOfGolfcourse;
	
	@Column(name = "view_Of_Parkland")
	@Basic(fetch = FetchType.EAGER)
	String viewOfParkland;
	
	@Column(name = "view_Of_Sea_Water")
	@Basic(fetch = FetchType.EAGER)
	String viewOfSeaWater;
	
	
	@Column(name = "laundry_washing_Room")
	@Basic(fetch = FetchType.EAGER)
	String laundrywashingRoom;
	
	@Column(name = "private_Swimming_Pool")
	@Basic(fetch = FetchType.EAGER)
	String privateSwimmingPool;
	
	@Column(name = "shared_Swimming_Pool")
	@Basic(fetch = FetchType.EAGER)
	String sharedSwimmingPool;
	
	@Column(name = "gazebo_And_Outdoor_Entertaining_Area")
	@Basic(fetch = FetchType.EAGER)
	String gazeboAndOutdoorEntertainingArea;
	
	@Column(name = "kitchen_White_Goods")
	@Basic(fetch = FetchType.EAGER)
	String kitchenWhiteGoods;
	
	@Column(name = "landscaped_Garden")
	@Basic(fetch = FetchType.EAGER)
	String landscapedGarden;
	
	@Column(name = "Hours24_Maintenance")
	@Basic(fetch = FetchType.EAGER)
	String HoursMaintenance;
	
	@Column(name = "bank_atm_Facility")
	@Basic(fetch = FetchType.EAGER)
	String bankatmFacility;
	
	
	@Column(name = "basketball_Court")
	@Basic(fetch = FetchType.EAGER)
	String basketballCourt;
	
	@Column(name = "beach_Access")
	@Basic(fetch = FetchType.EAGER)
	String beachAccess;
	
	@Column(name = "bus_Services")
	@Basic(fetch = FetchType.EAGER)
	String busServices;
	
	@Column(name = "business_Center")
	@Basic(fetch = FetchType.EAGER)
	String businessCenter;
	
	@Column(name = "childrens_Nursery")
	@Basic(fetch = FetchType.EAGER)
	String childrenNursery;
	
	@Column(name = "childrens_Play_Area")
	@Basic(fetch = FetchType.EAGER)
	String childrenPlayArea;
	
	@Column(name = "communal_Gardens")
	@Basic(fetch = FetchType.EAGER)
	String communalGardens;
	
	@Column(name = "clubhouse")
	@Basic(fetch = FetchType.EAGER)
	String clubhouse;
	
	@Column(name = "concierge_Service")
	@Basic(fetch = FetchType.EAGER)
	String conciergeService;
	
	@Column(name = "cycling_Tracks")
	@Basic(fetch = FetchType.EAGER)
	String cyclingTracks;
	
	@Column(name = "fitness_Center")
	@Basic(fetch = FetchType.EAGER)
	String fitnessCenter;
	
	@Column(name = "golf_Club_And_Clubhouse")
	@Basic(fetch = FetchType.EAGER)
	String golfClubAndClubhouse;
	
	@Column(name = "laundry_Service")
	@Basic(fetch = FetchType.EAGER)
	String laundryService;
	
	@Column(name = "marina_Berth")
	@Basic(fetch = FetchType.EAGER)
	String marinaBerth;
	
	@Column(name = "metro_Station")
	@Basic(fetch = FetchType.EAGER)
	String metroStation;
	
	@Column(name = "mosque")
	@Basic(fetch = FetchType.EAGER)
	String mosque;
	
	@Column(name = "polo_Club_And_Clubhouse")
	@Basic(fetch = FetchType.EAGER)
	String poloClubAndClubhouse;
	
	@Column(name = "public_Park")
	@Basic(fetch = FetchType.EAGER)
	String publicPark;
	
	@Column(name = "park")
	@Basic(fetch = FetchType.EAGER)
	String park;
	

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

	java.util.Set<SellerPayments> sellerpaymentses;

	@OneToMany(mappedBy = "chiraghproperty", fetch = FetchType.LAZY)

	java.util.Set<Propertysellerdetails> propertysellerdetailses;
	/**
	 */
//	@OneToMany(mappedBy = "chiraghproperty", fetch = FetchType.LAZY)
//
//	java.util.Set<PropertyImages> propertyimageses;
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
	



	public String getPropertyStatus() {
		return propertyStatus;
	}

	public void setPropertyStatus(String propertyStatus) {
		this.propertyStatus = propertyStatus;
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
		return paymentStructure;
	}

	public void setPayementStructure(String payementStructure) {
		this.paymentStructure = payementStructure;
	}

	public String getTenancyContractUpload() {
		return tenancyContractUpload;
	}

	public void setTenancyContractUpload(String tenancyContractUpload) {
		this.tenancyContractUpload = tenancyContractUpload;
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
	
	

	public String getPropertyType() {
		return propertyType;
	}

	public void setPropertyType(String propertyType) {
		this.propertyType = propertyType;
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
	public Integer getAgreeVatCommission() {
		return agreeVatCommission;
	}

	public void setAgreeVatCommission(Integer agreeVatCommission) {
		this.agreeVatCommission = agreeVatCommission;
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

	public java.util.Set<SellerPayments> getSellerpaymentses() {
		return sellerpaymentses;
	}

	public void setSellerpaymentses(java.util.Set<SellerPayments> sellerpaymentses) {
		this.sellerpaymentses = sellerpaymentses;
	}

	public java.util.Set<Propertysellerdetails> getPropertysellerdetailses() {
		return propertysellerdetailses;
	}

	public void setPropertysellerdetailses(java.util.Set<Propertysellerdetails> propertysellerdetailses) {
		this.propertysellerdetailses = propertysellerdetailses;
	}

	

	public java.util.Set<Propertybrokerage> getPropertybrokerages() {
		return propertybrokerages;
	}

	public void setPropertybrokerages(java.util.Set<Propertybrokerage> propertybrokerages) {
		this.propertybrokerages = propertybrokerages;
	}

	

	public void setRentalAnnualRent(float rentalAnnualRent) {
		this.rentalAnnualRent = rentalAnnualRent;
	}

	public float getRentalAnnualRent() {
		return rentalAnnualRent;
	}

	public Integer getFloor_No() {
		return floorNo;
	}

	public void setFloor_No(Integer floor_No) {
		this.floorNo = floor_No;
	}



	public Integer getCarParks() {
		return carParks;
	}

	public void setCarParks(Integer carParks) {
		this.carParks = carParks;
	}

	
	

	public Integer getFloorNo() {
		return floorNo;
	}

	public void setFloorNo(Integer floorNo) {
		this.floorNo = floorNo;
	}

	public String getPaymentStructure() {
		return paymentStructure;
	}

	public void setPaymentStructure(String paymentStructure) {
		this.paymentStructure = paymentStructure;
	}

	public String getPropertyNo() {
		return propertyNo;
	}

	public void setPropertyNo(String propertyNo) {
		this.propertyNo = propertyNo;
	}

	public void setAgreeVatCommission(int agreeVatCommission) {
		this.agreeVatCommission = agreeVatCommission;
	}

	public String getIsVacant() {
		return isVacant;
	}

	public void setIsVacant(String isVacant) {
		this.isVacant = isVacant;
	}

	public Integer getKitchens() {
		return kitchens;
	}

	public void setKitchens(Integer kitchens) {
		this.kitchens = kitchens;
	}

	public String getPublicParking() {
		return publicParking;
	}

	public void setPublicParking(String publicParking) {
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

	public String getMaidRoom() {
		return maidRoom;
	}

	public void setMaidRoom(String maidRoom) {
		this.maidRoom = maidRoom;
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

	public String getRestaurants() {
		return restaurants;
	}

	public void setRestaurants(String restaurants) {
		this.restaurants = restaurants;
	}

	public String getRecreationalFacilities() {
		return recreationalFacilities;
	}

	public void setRecreationalFacilities(String recreationalFacilities) {
		this.recreationalFacilities = recreationalFacilities;
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

	public String getSatelliteCableTV() {
		return satelliteCableTV;
	}

	public void setSatelliteCableTV(String satelliteCableTV) {
		this.satelliteCableTV = satelliteCableTV;
	}

	public String getPrivateGarden() {
		return privateGarden;
	}

	public void setPrivateGarden(String privateGarden) {
		this.privateGarden = privateGarden;
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

	public String getCommunalGardens() {
		return communalGardens;
	}

	public void setCommunalGardens(String communalGardens) {
		this.communalGardens = communalGardens;
	}

	public String getClubhouse() {
		return clubhouse;
	}

	public void setClubhouse(String clubhouse) {
		this.clubhouse = clubhouse;
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

	public float getBalanceAmount() {
		return balanceAmount;
	}

	public void setBalanceAmount(float balanceAmount) {
		this.balanceAmount = balanceAmount;
	}

	public String getIsRented() {
		return isRented;
	}

	public void setIsRented(String isRented) {
		this.isRented = isRented;
	}

	public String getBuiltInWardrobes() {
		return builtInWardrobes;
	}

	public void setBuiltInWardrobes(String builtInWardrobes) {
		this.builtInWardrobes = builtInWardrobes;
	}

	public String getPaymentSchedule() {
		return paymentSchedule;
	}

	public void setPaymentSchedule(String paymentSchedule) {
		this.paymentSchedule = paymentSchedule;
	}

	


	
	
}













