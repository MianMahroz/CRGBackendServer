
package com.bestercapitalmedia.chiragh.property;

import java.io.Serializable;

import java.lang.StringBuilder;

import java.util.Calendar;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.Id;

import com.bestercapitalmedia.chiragh.buyer.details.PropertyBuyerDetails;
import com.bestercapitalmedia.chiragh.buyer.payments.BuyerPayments;
import com.bestercapitalmedia.chiragh.property.auctionprocess.Propertyauctionprocess;
import com.bestercapitalmedia.chiragh.property.bidprocess.Propertybidprocess;
import com.bestercapitalmedia.chiragh.property.brokerage.Propertybrokerage;
import com.bestercapitalmedia.chiragh.property.marketanalysis.Propertymarketanalysis;
import com.bestercapitalmedia.chiragh.property.type.Propertytype;
import com.bestercapitalmedia.chiragh.propertyactivitylogs.PropertyActivityLogs;
import com.bestercapitalmedia.chiragh.seller.details.Propertysellerdetails;
import com.bestercapitalmedia.chiragh.seller.payments.SellerPayments;
import com.bestercapitalmedia.chiragh.user.Chiraghuser;
import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

// TODO: Auto-generated Javadoc
/**
 * The Class Chiraghproperty.
 */



import java.io.Serializable;

import java.lang.StringBuilder;



import java.util.Calendar;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.Id;

import javax.xml.bind.annotation.*;

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
	@GeneratedValue(strategy=GenerationType.AUTO)
	Integer propertyId;
	/**
	 */

	@Column(name = "property_Title", length = 50)
	@Basic(fetch = FetchType.EAGER)

	String propertyTitle;
	
//	/** The area. */
//	@Column(name="area")
//	@Basic(fetch = FetchType.EAGER)
//	String area;

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

	
	Integer isMdApproved;
	/**
	 */

	@Column(name = "is_Published")
	@Basic(fetch = FetchType.EAGER)

	
	Integer isPublished;
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

	@Column(name = "is_Rented", length = 25)
	@Basic(fetch = FetchType.EAGER)

	
	String isRented;
	/**
	 */

	@Column(name = "rental_Ejari_No")
	@Basic(fetch = FetchType.EAGER)

	
	Integer rentalEjariNo;
	/**
	 */

	@Column(name = "rental_Annual_Rent", precision = 12)
	@Basic(fetch = FetchType.EAGER)

	
	float rentalAnnualRent;
	/**
	 */

	@Column(name = "rental_Payment_Checks")
	@Basic(fetch = FetchType.EAGER)

	
	Integer rentalPaymentChecks;
	/**
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "rental_Expiry_Date")
	@Basic(fetch = FetchType.EAGER)

	
	Calendar rentalExpiryDate;
	/**
	 */

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

	@Column(name = "car_Parks")
	@Basic(fetch = FetchType.EAGER)

	
	Integer carParks;
	/**
	 */

	@Column(name = "no_Of_Floors")
	@Basic(fetch = FetchType.EAGER)

	
	Integer noOfFloors;
	/**
	 */

	@Column(name = "scanned_Title_Deed", length = 500)
	@Basic(fetch = FetchType.EAGER)

	
	String scannedTitleDeed;
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

	@Column(name = "tenancy_Contract_Upload", length = 500)
	@Basic(fetch = FetchType.EAGER)

	
	String tenancyContractUpload;
	/**
	 */

	@Column(name = "third_Party_Verification", length = 10)
	@Basic(fetch = FetchType.EAGER)

	
	String thirdPartyVerification;
	/**
	 */

	@Column(name = "is_Third_Party_Payment", length = 10)
	@Basic(fetch = FetchType.EAGER)

	
	String isThirdPartyPayment;
	/**
	 */

	@Column(name = "verification_Hod_Approved", length = 10)
	@Basic(fetch = FetchType.EAGER)

	
	String verificationHodApproved;
	/**
	 */

	@Column(name = "valuation_Report_Document", length = 25)
	@Basic(fetch = FetchType.EAGER)

	
	String valuationReportDocument;
	/**
	 */

	@Column(name = "valuation_Hod_Approved")
	@Basic(fetch = FetchType.EAGER)

	
	Integer valuationHodApproved;
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

	@Column(name = "payment_Schedule", length = 50)
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

	@Column(name = "morgage_Noc", length = 500)
	@Basic(fetch = FetchType.EAGER)

	
	String morgageNoc;
	/**
	 */

	@Column(name = "is_Vacant", length = 25)
	@Basic(fetch = FetchType.EAGER)

	
	String isVacant;
	/**
	 */

	@Column(name = "agree_Vat_Commission")
	@Basic(fetch = FetchType.EAGER)

	
	Integer agreeVatCommission;
	/**
	 */

	@Column(name = "amount", precision = 12)
	@Basic(fetch = FetchType.EAGER)

	
	float amount;
	/**
	 */

	@Column(name = "balance_Amount", precision = 12)
	@Basic(fetch = FetchType.EAGER)

	
	float balanceAmount;
	/**
	 */

	@Column(name = "public_Parking", length = 25)
	@Basic(fetch = FetchType.EAGER)

	
	String publicParking;
	/**
	 */

	@Column(name = "balcony", length = 25)
	@Basic(fetch = FetchType.EAGER)

	
	String balcony;
	/**
	 */

	@Column(name = "basement_Parking", length = 25)
	@Basic(fetch = FetchType.EAGER)

	
	String basementParking;
	/**
	 */

	@Column(name = "bbq_Area", length = 25)
	@Basic(fetch = FetchType.EAGER)

	
	String bbqArea;
	/**
	 */

	@Column(name = "broadband_Ready", length = 25)
	@Basic(fetch = FetchType.EAGER)

	
	String broadbandReady;
	/**
	 */

	@Column(name = "carpets", length = 25)
	@Basic(fetch = FetchType.EAGER)

	
	String carpets;
	/**
	 */

	@Column(name = "central_Air_Conditioning", length = 25)
	@Basic(fetch = FetchType.EAGER)

	
	String centralAirConditioning;
	/**
	 */

	@Column(name = "central_Heating", length = 25)
	@Basic(fetch = FetchType.EAGER)

	
	String centralHeating;
	/**
	 */

	@Column(name = "community_View", length = 25)
	@Basic(fetch = FetchType.EAGER)

	
	String communityView;
	/**
	 */

	@Column(name = "covered_Parking", length = 25)
	@Basic(fetch = FetchType.EAGER)

	
	String coveredParking;
	/**
	 */

	@Column(name = "driver_Room", length = 25)
	@Basic(fetch = FetchType.EAGER)

	
	String driverRoom;
	/**
	 */

	@Column(name = "fully_Fitted_Kitchen", length = 25)
	@Basic(fetch = FetchType.EAGER)

	
	String fullyFittedKitchen;
	/**
	 */

	@Column(name = "fully_Furnished", length = 25)
	@Basic(fetch = FetchType.EAGER)

	
	String fullyFurnished;
	/**
	 */

	@Column(name = "gymnasium", length = 25)
	@Basic(fetch = FetchType.EAGER)

	
	String gymnasium;
	/**
	 */

	@Column(name = "intercom", length = 25)
	@Basic(fetch = FetchType.EAGER)

	
	String intercom;
	/**
	 */

	@Column(name = "jacuzzi", length = 25)
	@Basic(fetch = FetchType.EAGER)

	
	String jacuzzi;
	/**
	 */

	@Column(name = "on_High_Floor", length = 25)
	@Basic(fetch = FetchType.EAGER)

	
	String onHighFloor;
	/**
	 */

	@Column(name = "public_Transport", length = 25)
	@Basic(fetch = FetchType.EAGER)

	
	String publicTransport;
	/**
	 */

	@Column(name = "recreational_Facilities", length = 25)
	@Basic(fetch = FetchType.EAGER)

	
	String recreationalFacilities;
	/**
	 */

	@Column(name = "restaurants", length = 25)
	@Basic(fetch = FetchType.EAGER)

	
	String restaurants;
	/**
	 */

	@Column(name = "school", length = 25)
	@Basic(fetch = FetchType.EAGER)

	
	String school;
	/**
	 */

	@Column(name = "shopping_Mall", length = 25)
	@Basic(fetch = FetchType.EAGER)

	
	String shoppingMall;
	/**
	 */

	@Column(name = "shops", length = 25)
	@Basic(fetch = FetchType.EAGER)

	
	String shops;
	/**
	 */

	@Column(name = "sports_Academies", length = 25)
	@Basic(fetch = FetchType.EAGER)

	
	String sportsAcademies;
	/**
	 */

	@Column(name = "squash_Courts", length = 25)
	@Basic(fetch = FetchType.EAGER)

	
	String squashCourts;
	/**
	 */

	@Column(name = "tennis_Courts", length = 25)
	@Basic(fetch = FetchType.EAGER)

	
	String tennisCourts;
	/**
	 */

	@Column(name = "valet_Service", length = 25)
	@Basic(fetch = FetchType.EAGER)

	
	String valetService;
	/**
	 */

	@Column(name = "laundry_WashingRoom", length = 25)
	@Basic(fetch = FetchType.EAGER)

	
	String laundryWashingRoom;
	/**
	 */

	@Column(name = "walking_Trails", length = 25)
	@Basic(fetch = FetchType.EAGER)

	
	String walkingTrails;
	/**
	 */

	@Column(name = "schools_In_Neighbourhood", length = 25)
	@Basic(fetch = FetchType.EAGER)

	
	String schoolsInNeighbourhood;
	/**
	 */

	@Column(name = "metros", length = 25)
	@Basic(fetch = FetchType.EAGER)

	
	String metros;
	/**
	 */

	@Column(name = "medical_Centers", length = 25)
	@Basic(fetch = FetchType.EAGER)
	String medicalCenters;
	
	@Column(name = "buliding_Number")
	@Basic(fetch = FetchType.EAGER)

	String bulidingNumber;
	
	@Column(name = "buliding_Name")
	@Basic(fetch = FetchType.EAGER)

	String bulidingName;
	
	
	@Column(name = "property_Status_Other")
	@Basic(fetch = FetchType.EAGER)

	String propertyStatusOther;
	
	
	@Column(name = "type_Property_Other")
	@Basic(fetch = FetchType.EAGER)

	String typePropertyOther;
	
	@Column(name = "floor_Plan_Upload")
	@Basic(fetch = FetchType.EAGER)

	String floorPlanUpload;
	
	@Column(name = "gross_Area")
	@Basic(fetch = FetchType.EAGER)

	String grossArea;
	
	@Column(name ="net_Area")
	@Basic(fetch = FetchType.EAGER)

	String netArea;
	
	@Column(name = "bank_Other")
	@Basic(fetch = FetchType.EAGER)

	String bankOther;
	


	
	
	/**
	 */

	@Column(name = "shopping_Malls", length = 25)
	@Basic(fetch = FetchType.EAGER)

	
	String shoppingMalls;
	/**
	 */

	@Column(name = "mosques_In_Neighbourhood", length = 25)
	@Basic(fetch = FetchType.EAGER)

	
	String mosquesInNeighbourhood;
	/**
	 */

	@Column(name = "beaches", length = 25)
	@Basic(fetch = FetchType.EAGER)

	
	String beaches;
	/**
	 */

	@Column(name = "supermarkets", length = 25)
	@Basic(fetch = FetchType.EAGER)

	
	String supermarkets;
	/**
	 */

	@Column(name = "pets_Allowed", length = 25)
	@Basic(fetch = FetchType.EAGER)

	
	String petsAllowed;
	/**
	 */

	@Column(name = "marble_Floors", length = 25)
	@Basic(fetch = FetchType.EAGER)

	
	String marbleFloors;
	/**
	 */

	@Column(name = "on_Low_Floor", length = 25)
	@Basic(fetch = FetchType.EAGER)

	
	String onLowFloor;
	/**
	 */

	@Column(name = "on_Mid_Floor", length = 25)
	@Basic(fetch = FetchType.EAGER)

	
	String onMidFloor;
	/**
	 */

	@Column(name = "part_Furnished", length = 25)
	@Basic(fetch = FetchType.EAGER)

	
	String partFurnished;
	/**
	 */

	@Column(name = "private_Garage", length = 25)
	@Basic(fetch = FetchType.EAGER)

	
	String privateGarage;
	/**
	 */

	@Column(name = "private_Garden", length = 25)
	@Basic(fetch = FetchType.EAGER)

	
	String privateGarden;
	/**
	 */

	@Column(name = "satellite_Cable_TV", length = 25)
	@Basic(fetch = FetchType.EAGER)

	
	String satelliteCableTv;
	/**
	 */

	@Column(name = "sauna", length = 25)
	@Basic(fetch = FetchType.EAGER)

	
	String sauna;
	/**
	 */

	@Column(name = "solid_Wood_Floors", length = 25)
	@Basic(fetch = FetchType.EAGER)

	
	String solidWoodFloors;
	/**
	 */

	@Column(name = "steam_Room", length = 25)
	@Basic(fetch = FetchType.EAGER)

	
	String steamRoom;
	/**
	 */

	@Column(name = "storage_Room", length = 25)
	@Basic(fetch = FetchType.EAGER)

	
	String storageRoom;
	/**
	 */

	@Column(name = "study", length = 25)
	@Basic(fetch = FetchType.EAGER)

	
	String study;
	/**
	 */

	@Column(name = "upgraded_Interior", length = 25)
	@Basic(fetch = FetchType.EAGER)

	
	String upgradedInterior;
	/**
	 */

	@Column(name = "view_Of_Gardens", length = 25)
	@Basic(fetch = FetchType.EAGER)

	
	String viewOfGardens;
	/**
	 */

	@Column(name = "view_Of_Golfcourse", length = 25)
	@Basic(fetch = FetchType.EAGER)

	
	String viewOfGolfcourse;
	/**
	 */

	@Column(name = "view_Of_Parkland", length = 25)
	@Basic(fetch = FetchType.EAGER)

	
	String viewOfParkland;
	/**
	 */

	@Column(name = "view_Of_Sea_Water", length = 25)
	@Basic(fetch = FetchType.EAGER)

	
	String viewOfSeaWater;
	/**
	 */

	@Column(name = "laundry_washing_Room", length = 25)
	@Basic(fetch = FetchType.EAGER)

	
	String laundryWashingRoom_1;
	/**
	 */

	@Column(name = "private_Swimming_Pool", length = 25)
	@Basic(fetch = FetchType.EAGER)

	
	String privateSwimmingPool;
	/**
	 */

	@Column(name = "shared_Swimming_Pool", length = 25)
	@Basic(fetch = FetchType.EAGER)

	
	String sharedSwimmingPool;
	/**
	 */

	@Column(name = "gazebo_And_Outdoor_Entertaining_Area", length = 25)
	@Basic(fetch = FetchType.EAGER)

	
	String gazeboAndOutdoorEntertainingArea;
	/**
	 */

	@Column(name = "kitchen_White_Goods", length = 25)
	@Basic(fetch = FetchType.EAGER)

	
	String kitchenWhiteGoods;
	/**
	 */

	@Column(name = "landscaped_Garden", length = 25)
	@Basic(fetch = FetchType.EAGER)

	
	String landscapedGarden;
	/**
	 */

	@Column(name = "Hours24_Maintenance", length = 25)
	@Basic(fetch = FetchType.EAGER)

	
	String hours24Maintenance;
	/**
	 */

	@Column(name = "bank_atm_Facility", length = 25)
	@Basic(fetch = FetchType.EAGER)

	
	String bankAtmFacility;
	/**
	 */

	@Column(name = "basketball_Court", length = 25)
	@Basic(fetch = FetchType.EAGER)

	
	String basketballCourt;
	/**
	 */

	@Column(name = "beach_Access", length = 25)
	@Basic(fetch = FetchType.EAGER)

	
	String beachAccess;
	/**
	 */

	@Column(name = "bus_Services", length = 25)
	@Basic(fetch = FetchType.EAGER)

	
	String busServices;
	/**
	 */

	@Column(name = "business_Center", length = 25)
	@Basic(fetch = FetchType.EAGER)

	
	String businessCenter;
	/**
	 */

	@Column(name = "childrens_Nursery", length = 25)
	@Basic(fetch = FetchType.EAGER)

	
	String childrensNursery;
	/**
	 */

	@Column(name = "childrens_Play_Area", length = 25)
	@Basic(fetch = FetchType.EAGER)

	
	String childrensPlayArea;
	/**
	 */

	@Column(name = "clubhouse", length = 25)
	@Basic(fetch = FetchType.EAGER)

	
	String clubhouse;
	/**
	 */

	@Column(name = "communal_Gardens", length = 25)
	@Basic(fetch = FetchType.EAGER)

	
	String communalGardens;
	/**
	 */

	@Column(name = "concierge_Service", length = 25)
	@Basic(fetch = FetchType.EAGER)

	
	String conciergeService;
	/**
	 */

	@Column(name = "cycling_Tracks", length = 25)
	@Basic(fetch = FetchType.EAGER)

	
	String cyclingTracks;
	/**
	 */

	@Column(name = "fitness_Center", length = 25)
	@Basic(fetch = FetchType.EAGER)

	
	String fitnessCenter;
	/**
	 */

	@Column(name = "golf_Club_And_Clubhouse", length = 25)
	@Basic(fetch = FetchType.EAGER)

	
	String golfClubAndClubhouse;
	/**
	 */

	@Column(name = "laundry_Service", length = 25)
	@Basic(fetch = FetchType.EAGER)

	
	String laundryService;
	/**
	 */

	@Column(name = "marina_Berth", length = 25)
	@Basic(fetch = FetchType.EAGER)

	
	String marinaBerth;
	/**
	 */

	@Column(name = "metro_Station", length = 25)
	@Basic(fetch = FetchType.EAGER)

	
	String metroStation;
	/**
	 */

	@Column(name = "mosque", length = 25)
	@Basic(fetch = FetchType.EAGER)

	
	String mosque;
	/**
	 */

	@Column(name = "polo_Club_And_Clubhouse", length = 25)
	@Basic(fetch = FetchType.EAGER)

	
	String poloClubAndClubhouse;
	/**
	 */

	@Column(name = "public_Park", length = 25)
	@Basic(fetch = FetchType.EAGER)

	
	String publicPark;
	/**
	 */

	@Column(name = "park", length = 25)
	@Basic(fetch = FetchType.EAGER)

	
	String park;
	/**
	 */

	@Column(name = "payment_Structure", length = 25)
	@Basic(fetch = FetchType.EAGER)

	
	String paymentStructure;
	/**
	 */

	@Column(name = "property_No", length = 25)
	@Basic(fetch = FetchType.EAGER)

	
	String propertyNo;
	/**
	 */

	@Column(name = "maid_Room", length = 25)
	@Basic(fetch = FetchType.EAGER)

	
	String maidRoom;
	/**
	 */

	@Column(name = "built_In_Wardrobes", length = 25)
	@Basic(fetch = FetchType.EAGER)

	
	String builtInWardrobes;
	/**
	 */

	@Column(name = "property_Status", length = 25)
	@Basic(fetch = FetchType.EAGER)

	
	String propertyStatus;
	/**
	 */

	@Column(name = "property_Type", length = 25)
	@Basic(fetch = FetchType.EAGER)

	
	String propertyType;
	/**
	 */

	@Column(name = "area", length = 300)
	@Basic(fetch = FetchType.EAGER)

	
	String area;
	/**
	 */

	@Column(name = "last_Action_Performed", length = 100)
	@Basic(fetch = FetchType.EAGER)

	
	String lastActionPerformed;
	/**
	 */

	@Column(name = "is_Personal_Details_Verified", length = 45)
	@Basic(fetch = FetchType.EAGER)

	
	String isPersonalDetailsVerified;
	/**
	 */

	@Column(name = "is_POA_Details_Verified", length = 45)
	@Basic(fetch = FetchType.EAGER)

	
	String isPoaDetailsVerified;
	/**
	 */

	@Column(name = "is_Property_Details_Verified", length = 45)
	@Basic(fetch = FetchType.EAGER)

	
	String isPropertyDetailsVerified;
	/**
	 */

	@Column(name = "is_Acknowledgement_Call", length = 45)
	@Basic(fetch = FetchType.EAGER)

	
	String isAcknowledgementCall;
	/**
	 */
	@Temporal(TemporalType.DATE)
	@Column(name = "date_Received")
	@Basic(fetch = FetchType.EAGER)

	
	Date dateReceived;
	/**
	 */
	@Temporal(TemporalType.DATE)
	@Column(name = "last_Action")
	@Basic(fetch = FetchType.EAGER)

	
	Date lastAction;
	/**
	 */

	@Column(name = "action_Performed_By", length = 200)
	@Basic(fetch = FetchType.EAGER)

	
	String actionPerformedBy;
	/**
	 */

	@Column(name = "seller_User_Name", length = 200)
	@Basic(fetch = FetchType.EAGER)

	
	String sellerUserName;
	/**
	 */

	@Column(name = "status", length = 200)
	@Basic(fetch = FetchType.EAGER)

	
	String status;
	/**
	 */

	@Column(name = "area_Unit", length = 100)
	@Basic(fetch = FetchType.EAGER)

	
	String areaUnit;
	/**
	 */

	@Column(name = "is_Property_Financial_Details_Verified", length = 45)
	@Basic(fetch = FetchType.EAGER)

	
	String isPropertyFinancialDetailsVerified;
	/**
	 */

	@Column(name = "is_Property_Rental_Details_Verified", length = 45)
	@Basic(fetch = FetchType.EAGER)

	
	String isPropertyRentalDetailsVerified;

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

	
	java.util.Set<PropertyActivityLogs> propertyactivitylogses;
	/**
	 */
	@OneToMany(mappedBy = "chiraghproperty", fetch = FetchType.LAZY)

	
	java.util.Set<BuyerPayments> buyerpaymentses;
	/**
	 */
//	@OneToMany(mappedBy = "chiraghproperty", fetch = FetchType.LAZY)

	
//	java.util.Set<Propertyvisittypes> propertyvisittypeses;
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
	/**
	 */
//	@OneToMany(mappedBy = "chiraghproperty", fetch = FetchType.LAZY)

	
//	java.util.Set<Buyerprocess> buyerprocesses;
	/**
	 */
//	@OneToMany(mappedBy = "chiraghproperty", fetch = FetchType.LAZY)

	
//	java.util.Set<Buyerdashboard> buyerdashboards;
	/**
	 */
	@OneToMany(mappedBy = "chiraghproperty", fetch = FetchType.LAZY)

	
	java.util.Set<Propertysellerdetails> propertysellerdetailses;
	/**
	 */
	@OneToMany(mappedBy = "chiraghproperty", fetch = FetchType.LAZY)

	
//	java.util.Set<Propertyimages> propertyimageses;
//	/**
//	 */
//	@OneToMany(mappedBy = "chiraghproperty", fetch = FetchType.LAZY)

	
	java.util.Set<Propertybrokerage> propertybrokerages;
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
	public Integer getIsMdApproved() {
		return isMdApproved;
	}
	public void setIsMdApproved(Integer isMdApproved) {
		this.isMdApproved = isMdApproved;
	}
	public Integer getIsPublished() {
		return isPublished;
	}
	public void setIsPublished(Integer isPublished) {
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
	public String getIsRented() {
		return isRented;
	}
	public void setIsRented(String isRented) {
		this.isRented = isRented;
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
	public String getTenancyContractUpload() {
		return tenancyContractUpload;
	}
	public void setTenancyContractUpload(String tenancyContractUpload) {
		this.tenancyContractUpload = tenancyContractUpload;
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
	public Integer getValuationHodApproved() {
		return valuationHodApproved;
	}
	public void setValuationHodApproved(Integer valuationHodApproved) {
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
	public String getPaymentSchedule() {
		return paymentSchedule;
	}
	public void setPaymentSchedule(String paymentSchedule) {
		this.paymentSchedule = paymentSchedule;
	}
	public Calendar getDate() {
		return date;
	}
	public void setDate(Calendar date) {
		this.date = date;
	}
	public String getMorgageNoc() {
		return morgageNoc;
	}
	public void setMorgageNoc(String morgageNoc) {
		this.morgageNoc = morgageNoc;
	}
	public String getIsVacant() {
		return isVacant;
	}
	public void setIsVacant(String isVacant) {
		this.isVacant = isVacant;
	}
	public Integer getAgreeVatCommission() {
		return agreeVatCommission;
	}
	public void setAgreeVatCommission(Integer agreeVatCommission) {
		this.agreeVatCommission = agreeVatCommission;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	public float getBalanceAmount() {
		return balanceAmount;
	}
	public void setBalanceAmount(float balanceAmount) {
		this.balanceAmount = balanceAmount;
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
	public String getSatelliteCableTv() {
		return satelliteCableTv;
	}
	public void setSatelliteCableTv(String satelliteCableTv) {
		this.satelliteCableTv = satelliteCableTv;
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
	public String getLaundryWashingRoom_1() {
		return laundryWashingRoom_1;
	}
	public void setLaundryWashingRoom_1(String laundryWashingRoom_1) {
		this.laundryWashingRoom_1 = laundryWashingRoom_1;
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
	public String getHours24Maintenance() {
		return hours24Maintenance;
	}
	public void setHours24Maintenance(String hours24Maintenance) {
		this.hours24Maintenance = hours24Maintenance;
	}
	public String getBankAtmFacility() {
		return bankAtmFacility;
	}
	public void setBankAtmFacility(String bankAtmFacility) {
		this.bankAtmFacility = bankAtmFacility;
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
	public String getChildrensNursery() {
		return childrensNursery;
	}
	public void setChildrensNursery(String childrensNursery) {
		this.childrensNursery = childrensNursery;
	}
	public String getChildrensPlayArea() {
		return childrensPlayArea;
	}
	public void setChildrensPlayArea(String childrensPlayArea) {
		this.childrensPlayArea = childrensPlayArea;
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
	public String getMaidRoom() {
		return maidRoom;
	}
	public void setMaidRoom(String maidRoom) {
		this.maidRoom = maidRoom;
	}
	public String getBuiltInWardrobes() {
		return builtInWardrobes;
	}
	public void setBuiltInWardrobes(String builtInWardrobes) {
		this.builtInWardrobes = builtInWardrobes;
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
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getLastActionPerformed() {
		return lastActionPerformed;
	}
	public void setLastActionPerformed(String lastActionPerformed) {
		this.lastActionPerformed = lastActionPerformed;
	}
	public String getIsPersonalDetailsVerified() {
		return isPersonalDetailsVerified;
	}
	public void setIsPersonalDetailsVerified(String isPersonalDetailsVerified) {
		this.isPersonalDetailsVerified = isPersonalDetailsVerified;
	}
	public String getIsPoaDetailsVerified() {
		return isPoaDetailsVerified;
	}
	public void setIsPoaDetailsVerified(String isPoaDetailsVerified) {
		this.isPoaDetailsVerified = isPoaDetailsVerified;
	}
	public String getIsPropertyDetailsVerified() {
		return isPropertyDetailsVerified;
	}
	public void setIsPropertyDetailsVerified(String isPropertyDetailsVerified) {
		this.isPropertyDetailsVerified = isPropertyDetailsVerified;
	}
	public String getIsAcknowledgementCall() {
		return isAcknowledgementCall;
	}
	public void setIsAcknowledgementCall(String isAcknowledgementCall) {
		this.isAcknowledgementCall = isAcknowledgementCall;
	}
	
	
	public String getActionPerformedBy() {
		return actionPerformedBy;
	}
	public void setActionPerformedBy(String actionPerformedBy) {
		this.actionPerformedBy = actionPerformedBy;
	}
	public String getSellerUserName() {
		return sellerUserName;
	}
	public void setSellerUserName(String sellerUserName) {
		this.sellerUserName = sellerUserName;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getAreaUnit() {
		return areaUnit;
	}
	public void setAreaUnit(String areaUnit) {
		this.areaUnit = areaUnit;
	}
	public String getIsPropertyFinancialDetailsVerified() {
		return isPropertyFinancialDetailsVerified;
	}
	public void setIsPropertyFinancialDetailsVerified(String isPropertyFinancialDetailsVerified) {
		this.isPropertyFinancialDetailsVerified = isPropertyFinancialDetailsVerified;
	}
	public String getIsPropertyRentalDetailsVerified() {
		return isPropertyRentalDetailsVerified;
	}
	public void setIsPropertyRentalDetailsVerified(String isPropertyRentalDetailsVerified) {
		this.isPropertyRentalDetailsVerified = isPropertyRentalDetailsVerified;
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
	public java.util.Set<PropertyActivityLogs> getPropertyactivitylogses() {
		return propertyactivitylogses;
	}
	public void setPropertyactivitylogses(java.util.Set<PropertyActivityLogs> propertyactivitylogses) {
		this.propertyactivitylogses = propertyactivitylogses;
	}
	public java.util.Set<BuyerPayments> getBuyerpaymentses() {
		return buyerpaymentses;
	}
	public void setBuyerpaymentses(java.util.Set<BuyerPayments> buyerpaymentses) {
		this.buyerpaymentses = buyerpaymentses;
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
	public Chiraghproperty() {
//		super();
		// TODO Auto-generated constructor stub
	}
	public Date getDateReceived() {
		return dateReceived;
	}
	public void setDateReceived(Date dateReceived) {
		this.dateReceived = dateReceived;
	}
	public Date getLastAction() {
		return lastAction;
	}
	public void setLastAction(Date lastAction) {
		this.lastAction = lastAction;
	}

	public String getBulidingNumber() {
		return bulidingNumber;
	}

	public void setBulidingNumber(String bulidingNumber) {
		this.bulidingNumber = bulidingNumber;
	}

	public String getBulidingName() {
		return bulidingName;
	}

	public void setBulidingName(String bulidingName) {
		this.bulidingName = bulidingName;
	}

	public String getPropertyStatusOther() {
		return propertyStatusOther;
	}

	public void setPropertyStatusOther(String propertyStatusOther) {
		this.propertyStatusOther = propertyStatusOther;
	}

	public String getTypePropertyOther() {
		return typePropertyOther;
	}

	public void setTypePropertyOther(String typePropertyOther) {
		this.typePropertyOther = typePropertyOther;
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

	public String getBankOther() {
		return bankOther;
	}

	public void setBankOther(String bankOther) {
		this.bankOther = bankOther;
	}
	

	
}