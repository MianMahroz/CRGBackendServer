
package com.bestercapitalmedia.chiragh.property;

import java.io.Serializable;

import java.lang.StringBuilder;

import java.util.Calendar;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.Id;

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

// TODO: Auto-generated Javadoc
/**
 * The Class Chiraghproperty.
 */

@Entity
@Table(catalog = "chiraghdatabase", name = "chiraghproperty")
public class Chiraghproperty implements Serializable {
	 
 	/** The Constant serialVersionUID. */
 	static final long serialVersionUID = 1L;

	/** The property id. */
	@Column(name = "property_Id", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer propertyId;
	
	/** The property title. */

	@Column(name = "property_Title", length = 50)
	@Basic(fetch = FetchType.EAGER)

	String propertyTitle;
	
	/** The area. */
	@Column(name="area")
	@Basic(fetch = FetchType.EAGER)
	String area;
	
	/** The property description. */

	@Column(name = "property_Description", length = 50)
	@Basic(fetch = FetchType.EAGER)

	String propertyDescription;
	
	/** The location. */

	@Column(name = "location", length = 50)
	@Basic(fetch = FetchType.EAGER)

	String location;
	
	/** The size per sqft. */

	@Column(name = "size_Per_Sqft", precision = 12)
	@Basic(fetch = FetchType.EAGER)

	float sizePerSqft;
	
	/** The address. */

	@Column(name = "address", length = 50)
	@Basic(fetch = FetchType.EAGER)

	String address;
	
	/** The asking price. */

	@Column(name = "asking_Price", precision = 12)
	@Basic(fetch = FetchType.EAGER)

	float askingPrice;
	
	/** The area permit no. */

	@Column(name = "area_Permit_No", length = 50)
	@Basic(fetch = FetchType.EAGER)

	String areaPermitNo;
	
	/** The property reference no. */

	@Column(name = "property_Reference_No", length = 50)
	@Basic(fetch = FetchType.EAGER)

	String propertyReferenceNo;
	
	/** The price per sqft. */

	@Column(name = "price_Per_Sqft", precision = 12)
	@Basic(fetch = FetchType.EAGER)

	float pricePerSqft;
	
	/** The is md approved. */

	@Column(name = "is_Md_Approved")
	@Basic(fetch = FetchType.EAGER)

	int isMdApproved;
	
	/** The is published. */

	@Column(name = "is_Published")
	@Basic(fetch = FetchType.EAGER)

	int isPublished;
	
	/** The no of bedrooms. */
	/**
	 */

	@Column(name = "no_Of_Bedrooms")
	@Basic(fetch = FetchType.EAGER)

	Integer noOfBedrooms;
	
	/** The no of baths. */

	@Column(name = "no_Of_Baths")
	@Basic(fetch = FetchType.EAGER)

	Integer noOfBaths;
	
	/** The is mortgage. */

	@Column(name = "is_Mortgage")
	@Basic(fetch = FetchType.EAGER)

	Integer isMortgage;
	
	/** The mortgage value. */

	@Column(name = "mortgage_Value", precision = 12)
	@Basic(fetch = FetchType.EAGER)

	float mortgageValue;
	
	/** The mortage bank. */

	@Column(name = "mortage_Bank", length = 45)
	@Basic(fetch = FetchType.EAGER)

	String mortageBank;
	
	/** The mortgage year. */

	@Column(name = "mortgage_Year")
	@Basic(fetch = FetchType.EAGER)

	Integer mortgageYear;
	
	/** The is rented. */

	@Column(name = "is_Rented")
	@Basic(fetch = FetchType.EAGER)

	String isRented;
	
	/** The is vacant. */
	@Column(name = "is_Vacant")
	@Basic(fetch = FetchType.EAGER)
	String isVacant;

	/** The rental ejari no. */
	@Column(name = "rental_Ejari_No")
	@Basic(fetch = FetchType.EAGER)

	Integer rentalEjariNo;
	
	/** The rental annual rent. */

	@Column(name = "rental_Annual_Rent")
	@Basic(fetch = FetchType.EAGER)

	float rentalAnnualRent;
	
	/** The rental payment checks. */

	@Column(name = "rental_Payment_Checks")
	@Basic(fetch = FetchType.EAGER)

	Integer rentalPaymentChecks;
	
	/** The rental expiry date. */

	@Column(name = "rental_Expiry_Date")
	@Basic(fetch = FetchType.EAGER)

	Calendar rentalExpiryDate;

	/** The floor no. */
	@Column(name = "floor_No")
	@Basic(fetch = FetchType.EAGER)

	Integer floorNo;
	
	/** The kitchens. */

	@Column(name = "kitchens")
	@Basic(fetch = FetchType.EAGER)

	Integer kitchens;
	
	/** The property type. */

	@Column(name = "property_Type")
	@Basic(fetch = FetchType.EAGER)

	String propertyType;

	/** The car parks. */
	@Column(name = "car_Parks")
	@Basic(fetch = FetchType.EAGER)

	Integer carParks;
	
	/** The public parking. */

	@Column(name = "public_Parking")
	@Basic(fetch = FetchType.EAGER)

	String publicParking;
	
	/** The balcony. */

	@Column(name = "balcony")
	@Basic(fetch = FetchType.EAGER)

	String balcony;

	/** The property status. */
	@Column(name = "property_Status")
	@Basic(fetch = FetchType.EAGER)

	String propertyStatus;
	
	/** The basement parking. */

	@Column(name = "basement_Parking")
	@Basic(fetch = FetchType.EAGER)

	String basementParking;
	
	/** The bbq area. */

	@Column(name = "bbq_Area")
	@Basic(fetch = FetchType.EAGER)

	String bbqArea;
	
	/** The broadband ready. */

	@Column(name = "broadband_Ready")
	@Basic(fetch = FetchType.EAGER)

	String broadbandReady;
	
	/** The carpets. */

	@Column(name = "carpets")
	@Basic(fetch = FetchType.EAGER)

	String carpets;
	
	/** The no of floors. */

	@Column(name = "no_Of_Floors")
	@Basic(fetch = FetchType.EAGER)

	Integer noOfFloors;
	
	/** The central air conditioning. */

	@Column(name = "central_Air_Conditioning")
	@Basic(fetch = FetchType.EAGER)

	String centralAirConditioning;
	
	/** The central heating. */

	@Column(name = "central_Heating")
	@Basic(fetch = FetchType.EAGER)

	String centralHeating;
	
	/** The scanned title deed. */

	@Column(name = "scanned_Title_Deed")
	@Basic(fetch = FetchType.EAGER)

	String scannedTitleDeed;
	
	/** The map location. */

	/**
	 */

	@Column(name = "map_Location", length = 50)
	@Basic(fetch = FetchType.EAGER)

	String mapLocation;

	/** The plot no. */

	@Column(name = "plot_No", length = 50)
	@Basic(fetch = FetchType.EAGER)

	String plotNo;
	
	/** The title deed no. */

	@Column(name = "title_Deed_No", length = 50)
	@Basic(fetch = FetchType.EAGER)

	String titleDeedNo;
	
	/** The type area. */

	@Column(name = "type_Area", length = 50)
	@Basic(fetch = FetchType.EAGER)

	String typeArea;
	
	/** The project name. */

	@Column(name = "project_Name", length = 25)
	@Basic(fetch = FetchType.EAGER)

	String projectName;
	
	/** The owner association no. */

	@Column(name = "owner_Association_No", length = 25)
	@Basic(fetch = FetchType.EAGER)

	String ownerAssociationNo;
	
	/** The present use. */

	@Column(name = "present_Use", length = 25)
	@Basic(fetch = FetchType.EAGER)

	String presentUse;
	
	/** The community no. */

	@Column(name = "community_No", length = 25)
	@Basic(fetch = FetchType.EAGER)

	String communityNo;
	
	/** The property age. */

	@Column(name = "property_Age", length = 50)
	@Basic(fetch = FetchType.EAGER)

	String propertyAge;
	
	/** The no units. */

	@Column(name = "no_Units")
	@Basic(fetch = FetchType.EAGER)

	Integer noUnits;
	
	/** The no shops. */

	@Column(name = "no_Shops")
	@Basic(fetch = FetchType.EAGER)

	Integer noShops;
	
	/** The community view. */

	@Column(name = "community_View")
	@Basic(fetch = FetchType.EAGER)

	String communityView;
	
	
	
	/** The tenant name. */

	@Column(name = "tenant_Name", length = 25)
	@Basic(fetch = FetchType.EAGER)

	String tenantName;
	
	/** The payment structure. */

	@Column(name = "payment_Structure", length = 25)
	@Basic(fetch = FetchType.EAGER)

	String paymentStructure;
	
	/** The tenancy contract upload. */

	@Column(name = "tenancy_Contract_Upload", length = 25)
	@Basic(fetch = FetchType.EAGER)

	String tenancyContractUpload;
	
	/** The covered parking. */

	@Column(name = "covered_Parking")
	@Basic(fetch = FetchType.EAGER)

	String coveredParking;
	
	/** The driver room. */

	@Column(name = "driver_Room")
	@Basic(fetch = FetchType.EAGER)

	String driverRoom;
	
	/** The area unit. */

	@Column(name = "area_Unit")
	@Basic(fetch = FetchType.EAGER)

	String areaUnit;
	
	/** The third party verification. */
	@Column(name = "third_Party_Verification")
	@Basic(fetch = FetchType.EAGER)
	String thirdPartyVerification;
	
	/** The is third party payment. */

	@Column(name = "is_Third_Party_Payment")
	@Basic(fetch = FetchType.EAGER)

	String isThirdPartyPayment;
	
	/** The verification hod approved. */

	@Column(name = "verification_Hod_Approved")
	@Basic(fetch = FetchType.EAGER)

	String verificationHodApproved;
	
	/** The maid room. */
	@Column(name = "maid_Room")
	@Basic(fetch = FetchType.EAGER)

	String maidRoom;

	/** The built in wardrobes. */
	@Column(name = "built_In_Wardrobes")
	@Basic(fetch = FetchType.EAGER)

	String builtInWardrobes;

	/** The property no. */
	@Column(name = "property_No", length = 25)
	@Basic(fetch = FetchType.EAGER)

	String propertyNo;

	/** The valuation report document. */
	@Column(name = "valuation_Report_Document", length = 25)
	@Basic(fetch = FetchType.EAGER)

	String valuationReportDocument;
	
	/** The valuation hod approved. */

	@Column(name = "valuation_Hod_Approved")
	@Basic(fetch = FetchType.EAGER)

	int valuationHodApproved;
	
	/** The listed price. */

	@Column(name = "listed_Price", precision = 12)
	@Basic(fetch = FetchType.EAGER)

	float listedPrice;
	
	/** The original price. */

	@Column(name = "original_Price", precision = 12)
	@Basic(fetch = FetchType.EAGER)

	float originalPrice;
	
	/** The paid amount. */

	/**
	 */
	@Column(name = "paid_Amount", precision = 12)
	@Basic(fetch = FetchType.EAGER)

	float paidAmount;

	/** The service charge. */
	@Column(name = "service_Charge", precision = 12)
	@Basic(fetch = FetchType.EAGER)

	float serviceCharge;
	
	/** The morgage status. */

	@Column(name = "morgage_Status", length = 45)
	@Basic(fetch = FetchType.EAGER)

	String morgageStatus;
	
	/** The morgage reg no. */

	@Column(name = "morgage_Reg_No", length = 45)
	@Basic(fetch = FetchType.EAGER)

	String morgageRegNo;
	
	/** The bank. */

	@Column(name = "bank", length = 45)
	@Basic(fetch = FetchType.EAGER)

	String bank;
	
	/** The morgage amount. */

	@Column(name = "morgage_Amount", precision = 12)
	@Basic(fetch = FetchType.EAGER)

	float morgageAmount;
	
	/** The pre closure charges. */

	@Column(name = "pre_Closure_Charges", precision = 12)
	@Basic(fetch = FetchType.EAGER)

	float preClosureCharges;
	
	/** The payment schedule. */

	@Column(name = "payment_Schedule")
	@Basic(fetch = FetchType.EAGER)

	String paymentSchedule;
	
	/** The date. */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "Date")
	@Basic(fetch = FetchType.EAGER)

	Calendar date;
	
	/** The balance amount. */
	@Column(name = "balance_Amount")
	float balanceAmount;

	/** The amount. */
	@Column(name = "amount")
	@Basic(fetch = FetchType.EAGER)
	float amount;
	
	/** The morgage noc. */

	@Column(name = "morgage_Noc", length = 45)
	@Basic(fetch = FetchType.EAGER)
	String morgageNoc;

	/** The agree vat commission. */
	@Column(name = "agree_Vat_Commission")
	@Basic(fetch = FetchType.EAGER)
	int agreeVatCommission;

	/** The fully fitted kitchen. */
	@Column(name = "fully_Fitted_Kitchen")
	@Basic(fetch = FetchType.EAGER)
	String fullyFittedKitchen;

	/** The fully furnished. */
	@Column(name = "fully_Furnished")
	@Basic(fetch = FetchType.EAGER)
	String fullyFurnished;

	/** The gymnasium. */
	@Column(name = "gymnasium")
	@Basic(fetch = FetchType.EAGER)
	String gymnasium;

	/** The intercom. */
	@Column(name = "intercom")
	@Basic(fetch = FetchType.EAGER)
	String intercom;

	/** The jacuzzi. */
	@Column(name = "jacuzzi")
	@Basic(fetch = FetchType.EAGER)
	String jacuzzi;

	/** The on high floor. */
	@Column(name = "on_High_Floor")
	@Basic(fetch = FetchType.EAGER)
	String onHighFloor;

	/** The public transport. */
	@Column(name = "public_Transport")
	@Basic(fetch = FetchType.EAGER)
	String publicTransport;

	/** The restaurants. */
	@Column(name = "restaurants")
	@Basic(fetch = FetchType.EAGER)
	String restaurants;

	/** The recreational facilities. */
	@Column(name = "recreational_Facilities")
	@Basic(fetch = FetchType.EAGER)
	String recreationalFacilities;

	/** The school. */
	@Column(name = "school")
	@Basic(fetch = FetchType.EAGER)
	String school;

	/** The shopping mall. */
	@Column(name = "shopping_Mall")
	@Basic(fetch = FetchType.EAGER)
	String shoppingMall;

	/** The shops. */
	@Column(name = "shops")
	@Basic(fetch = FetchType.EAGER)
	String shops;

	/** The sports academies. */
	@Column(name = "sports_Academies")
	@Basic(fetch = FetchType.EAGER)
	String sportsAcademies;

	/** The squash courts. */
	@Column(name = "squash_Courts")
	@Basic(fetch = FetchType.EAGER)
	String squashCourts;

	/** The tennis courts. */
	@Column(name = "tennis_Courts")
	@Basic(fetch = FetchType.EAGER)
	String tennisCourts;

	/** The valet service. */
	@Column(name = "valet_Service")
	@Basic(fetch = FetchType.EAGER)
	String valetService;

	/** The laundry washing room. */
	@Column(name = "laundry_WashingRoom")
	@Basic(fetch = FetchType.EAGER)
	String laundryWashingRoom;

	/** The walking trails. */
	@Column(name = "walking_Trails")
	@Basic(fetch = FetchType.EAGER)
	String walkingTrails;

	/** The schools in neighbourhood. */
	@Column(name = "schools_In_Neighbourhood")
	@Basic(fetch = FetchType.EAGER)
	String schoolsInNeighbourhood;

	/** The metros. */
	@Column(name = "metros")
	@Basic(fetch = FetchType.EAGER)
	String metros;

	/** The medical centers. */
	@Column(name = "medical_Centers")
	@Basic(fetch = FetchType.EAGER)
	String medicalCenters;

	/** The shopping malls. */
	@Column(name = "shopping_Malls")
	@Basic(fetch = FetchType.EAGER)
	String shoppingMalls;

	/** The mosques in neighbourhood. */
	@Column(name = "mosques_In_Neighbourhood")
	@Basic(fetch = FetchType.EAGER)
	String mosquesInNeighbourhood;

	/** The beaches. */
	@Column(name = "beaches")
	@Basic(fetch = FetchType.EAGER)
	String beaches;

	/** The supermarkets. */
	@Column(name = "supermarkets")
	@Basic(fetch = FetchType.EAGER)
	String supermarkets;

	/** The pets allowed. */
	@Column(name = "pets_Allowed")
	@Basic(fetch = FetchType.EAGER)
	String petsAllowed;

	/** The marble floors. */
	@Column(name = "marble_Floors")
	@Basic(fetch = FetchType.EAGER)
	String marbleFloors;

	/** The on low floor. */
	@Column(name = "on_Low_Floor")
	@Basic(fetch = FetchType.EAGER)
	String onLowFloor;

	/** The on mid floor. */
	@Column(name = "on_Mid_Floor")
	@Basic(fetch = FetchType.EAGER)
	String onMidFloor;

	/** The part furnished. */
	@Column(name = "part_Furnished")
	@Basic(fetch = FetchType.EAGER)
	String partFurnished;

	/** The private garage. */
	@Column(name = "private_Garage")
	@Basic(fetch = FetchType.EAGER)
	 String privateGarage;

	/** The satellite cable TV. */
	@Column(name = "satellite_Cable_TV")
	@Basic(fetch = FetchType.EAGER)
	String satelliteCableTV;

	/** The private garden. */
	@Column(name = "private_Garden")
	@Basic(fetch = FetchType.EAGER)
	String privateGarden;

	/** The sauna. */
	@Column(name = "sauna")
	@Basic(fetch = FetchType.EAGER)
	String sauna;

	/** The solid wood floors. */
	@Column(name = "solid_Wood_Floors")
	@Basic(fetch = FetchType.EAGER)
	String solidWoodFloors;

	/** The steam room. */
	@Column(name = "steam_Room")
	@Basic(fetch = FetchType.EAGER)
	String steamRoom;

	/** The storage room. */
	@Column(name = "storage_Room")
	@Basic(fetch = FetchType.EAGER)
	String storageRoom;

	/** The study. */
	@Column(name = "study")
	@Basic(fetch = FetchType.EAGER)
	String study;

	/** The upgraded interior. */
	@Column(name = "upgraded_Interior")
	@Basic(fetch = FetchType.EAGER)
	String upgradedInterior;

	/** The view of gardens. */
	@Column(name = "view_Of_Gardens")
	@Basic(fetch = FetchType.EAGER)
	String viewOfGardens;

	/** The view of golfcourse. */
	@Column(name = "view_Of_Golfcourse")
	@Basic(fetch = FetchType.EAGER)
	String viewOfGolfcourse;

	/** The view of parkland. */
	@Column(name = "view_Of_Parkland")
	@Basic(fetch = FetchType.EAGER)
	String viewOfParkland;

	/** The view of sea water. */
	@Column(name = "view_Of_Sea_Water")
	@Basic(fetch = FetchType.EAGER)
	String viewOfSeaWater;

	/** The laundrywashing room. */
	@Column(name = "laundry_washing_Room")
	@Basic(fetch = FetchType.EAGER)
	String laundrywashingRoom;

	/** The private swimming pool. */
	@Column(name = "private_Swimming_Pool")
	@Basic(fetch = FetchType.EAGER)
	String privateSwimmingPool;

	/** The shared swimming pool. */
	@Column(name = "shared_Swimming_Pool")
	@Basic(fetch = FetchType.EAGER)
	String sharedSwimmingPool;

	/** The gazebo and outdoor entertaining area. */
	@Column(name = "gazebo_And_Outdoor_Entertaining_Area")
	@Basic(fetch = FetchType.EAGER)
	String gazeboAndOutdoorEntertainingArea;

	/** The kitchen white goods. */
	@Column(name = "kitchen_White_Goods")
	@Basic(fetch = FetchType.EAGER)
	String kitchenWhiteGoods;

	/** The landscaped garden. */
	@Column(name = "landscaped_Garden")
	@Basic(fetch = FetchType.EAGER)
	String landscapedGarden;

	/** The Hours maintenance. */
	@Column(name = "Hours24_Maintenance")
	@Basic(fetch = FetchType.EAGER)
	String HoursMaintenance;

	/** The bankatm facility. */
	@Column(name = "bank_atm_Facility")
	@Basic(fetch = FetchType.EAGER)
	String bankatmFacility;

	/** The basketball court. */
	@Column(name = "basketball_Court")
	@Basic(fetch = FetchType.EAGER)
	String basketballCourt;

	/** The beach access. */
	@Column(name = "beach_Access")
	@Basic(fetch = FetchType.EAGER)
	String beachAccess;

	/** The bus services. */
	@Column(name = "bus_Services")
	@Basic(fetch = FetchType.EAGER)
	String busServices;

	/** The business center. */
	@Column(name = "business_Center")
	@Basic(fetch = FetchType.EAGER)
	String businessCenter;

	/** The children nursery. */
	@Column(name = "childrens_Nursery")
	@Basic(fetch = FetchType.EAGER)
	String childrenNursery;

	/** The children play area. */
	@Column(name = "childrens_Play_Area")
	@Basic(fetch = FetchType.EAGER)
	String childrenPlayArea;

	/** The communal gardens. */
	@Column(name = "communal_Gardens")
	@Basic(fetch = FetchType.EAGER)
	String communalGardens;

	/** The clubhouse. */
	@Column(name = "clubhouse")
	@Basic(fetch = FetchType.EAGER)
	String clubhouse;

	/** The concierge service. */
	@Column(name = "concierge_Service")
	@Basic(fetch = FetchType.EAGER)
	String conciergeService;

	/** The cycling tracks. */
	@Column(name = "cycling_Tracks")
	@Basic(fetch = FetchType.EAGER)
	String cyclingTracks;

	/** The fitness center. */
	@Column(name = "fitness_Center")
	@Basic(fetch = FetchType.EAGER)
	String fitnessCenter;

	/** The golf club and clubhouse. */
	@Column(name = "golf_Club_And_Clubhouse")
	@Basic(fetch = FetchType.EAGER)
	String golfClubAndClubhouse;

	/** The laundry service. */
	@Column(name = "laundry_Service")
	@Basic(fetch = FetchType.EAGER)
	String laundryService;

	/** The marina berth. */
	@Column(name = "marina_Berth")
	@Basic(fetch = FetchType.EAGER)
	String marinaBerth;

	/** The metro station. */
	@Column(name = "metro_Station")
	@Basic(fetch = FetchType.EAGER)
	String metroStation;

	/** The mosque. */
	@Column(name = "mosque")
	@Basic(fetch = FetchType.EAGER)
	String mosque;

	/** The polo club and clubhouse. */
	@Column(name = "polo_Club_And_Clubhouse")
	@Basic(fetch = FetchType.EAGER)
	String poloClubAndClubhouse;

	/** The public park. */
	@Column(name = "public_Park")
	@Basic(fetch = FetchType.EAGER)
	String publicPark;

	/** The park. */
	@Column(name = "park")
	@Basic(fetch = FetchType.EAGER)
	String park;
	
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
	

	/** The propertytype. */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "property_Type_Id", referencedColumnName = "property_Type_Id") })
	@JsonBackReference
	Propertytype propertytype;
	
	/** The chiraghuser. */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "user_Id", referencedColumnName = "user_Id") })
	@JsonBackReference
	Chiraghuser chiraghuser;
	
	/** The propertymarketanalysises. */
	@OneToMany(mappedBy = "chiraghproperty", fetch = FetchType.LAZY)

	java.util.Set<Propertymarketanalysis> propertymarketanalysises;
	
	/** The propertyauctionprocesses. */
	@OneToMany(mappedBy = "chiraghproperty", fetch = FetchType.LAZY)

	java.util.Set<Propertyauctionprocess> propertyauctionprocesses;
	
	/** The propertybidprocesses. */
	@OneToMany(mappedBy = "chiraghproperty", fetch = FetchType.LAZY)

	java.util.Set<Propertybidprocess> propertybidprocesses;
	
	/** The sellerpaymentses. */
	@OneToMany(mappedBy = "chiraghproperty", fetch = FetchType.LAZY)

	java.util.Set<SellerPayments> sellerpaymentses;

	/** The propertysellerdetailses. */
	@OneToMany(mappedBy = "chiraghproperty", fetch = FetchType.LAZY)

	java.util.Set<Propertysellerdetails> propertysellerdetailses;
	
	/** The last action performed. */
	// @OneToMany(mappedBy = "chiraghproperty", fetch = FetchType.LAZY)
	//
	// java.util.Set<PropertyImages> propertyimageses;
	/**
	 */
//	@OneToMany(mappedBy = "chiraghproperty", fetch = FetchType.LAZY)
//	java.util.Set<Propertybrokerage> propertybrokerages;

	@Column(name = "last_Action_Performed")
	 String lastActionPerformed;

	/** The is personal details verified. */
	@Column(name = "is_Personal_Details_Verified")
	 String isPersonalDetailsVerified;

	/** The is POA details verified. */
	@Column(name = "is_POA_Details_Verified")
	 String isPOADetailsVerified;

	/** The is property details verified. */
	@Column(name = "is_Property_Details_Verified")
	 String isPropertyDetailsVerified;

	/** The is acknowledgement call. */
	@Column(name = "is_Acknowledgement_Call")
	 String isAcknowledgementCall;

	/** The date received. */
	@Column(name = "date_Received")
	 Date dateReceived;

	/** The last action. */
	@Column(name = "last_Action")
	 Calendar lastAction;

	/** The action performed by. */
	@Column(name = "action_Performed_By")
	String actionPerformedBy;
	
	/** The seller user name. */
	@Column(name = "seller_User_Name")
	String sellerUserName;
	
	/** The status. */
	@Column(name="status")
	String status;

	@Column(name="is_Property_Financial_Details_Verified")
	String	isPropertyFinancialDetailsVerified;
	
	@Column(name="is_Property_Rental_Details_Verified")
	String	isPropertyRentalDetailsVerified;
	
	/**
	 * Instantiates a new chiraghproperty.
	 */
	public Chiraghproperty() {
	}

	/**
	 * Gets the property id.
	 *
	 * @return the property id
	 */
	public Integer getPropertyId() {
		return propertyId;
	}

	/**
	 * Sets the property id.
	 *
	 * @param propertyId the new property id
	 */
	public void setPropertyId(Integer propertyId) {
		this.propertyId = propertyId;
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
	 * Gets the checks if is md approved.
	 *
	 * @return the checks if is md approved
	 */
	public int getIsMdApproved() {
		return isMdApproved;
	}

	/**
	 * Sets the checks if is md approved.
	 *
	 * @param isMdApproved the new checks if is md approved
	 */
	public void setIsMdApproved(int isMdApproved) {
		this.isMdApproved = isMdApproved;
	}

	/**
	 * Gets the checks if is published.
	 *
	 * @return the checks if is published
	 */
	public int getIsPublished() {
		return isPublished;
	}

	/**
	 * Sets the checks if is published.
	 *
	 * @param isPublished the new checks if is published
	 */
	public void setIsPublished(int isPublished) {
		this.isPublished = isPublished;
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
	 * Gets the checks if is mortgage.
	 *
	 * @return the checks if is mortgage
	 */
	public Integer getIsMortgage() {
		return isMortgage;
	}

	/**
	 * Sets the checks if is mortgage.
	 *
	 * @param isMortgage the new checks if is mortgage
	 */
	public void setIsMortgage(Integer isMortgage) {
		this.isMortgage = isMortgage;
	}

	/**
	 * Gets the mortgage value.
	 *
	 * @return the mortgage value
	 */
	public float getMortgageValue() {
		return mortgageValue;
	}

	/**
	 * Sets the mortgage value.
	 *
	 * @param mortgageValue the new mortgage value
	 */
	public void setMortgageValue(float mortgageValue) {
		this.mortgageValue = mortgageValue;
	}

	/**
	 * Gets the mortage bank.
	 *
	 * @return the mortage bank
	 */
	public String getMortageBank() {
		return mortageBank;
	}

	/**
	 * Sets the mortage bank.
	 *
	 * @param mortageBank the new mortage bank
	 */
	public void setMortageBank(String mortageBank) {
		this.mortageBank = mortageBank;
	}

	/**
	 * Gets the mortgage year.
	 *
	 * @return the mortgage year
	 */
	public Integer getMortgageYear() {
		return mortgageYear;
	}

	/**
	 * Sets the mortgage year.
	 *
	 * @param mortgageYear the new mortgage year
	 */
	public void setMortgageYear(Integer mortgageYear) {
		this.mortgageYear = mortgageYear;
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
	 * Gets the rental expiry date.
	 *
	 * @return the rental expiry date
	 */
	public Calendar getRentalExpiryDate() {
		return rentalExpiryDate;
	}

	/**
	 * Sets the rental expiry date.
	 *
	 * @param rentalExpiryDate the new rental expiry date
	 */
	public void setRentalExpiryDate(Calendar rentalExpiryDate) {
		this.rentalExpiryDate = rentalExpiryDate;
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
	public String getPublicParking() {
		return publicParking;
	}

	/**
	 * Sets the public parking.
	 *
	 * @param publicParking the new public parking
	 */
	public void setPublicParking(String publicParking) {
		this.publicParking = publicParking;
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
	 * Gets the lease start date.
	 *
	 * @return the lease start date
	 */
	
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
	 * Gets the third party verification.
	 *
	 * @return the third party verification
	 */

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
	 * Gets the area unit.
	 *
	 * @return the area unit
	 */
	public String getAreaUnit() {
		return areaUnit;
	}

	/**
	 * Sets the area unit.
	 *
	 * @param areaUnit the new area unit
	 */
	public void setAreaUnit(String areaUnit) {
		this.areaUnit = areaUnit;
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
	 * Gets the propertytype.
	 *
	 * @return the propertytype
	 */
	public Propertytype getPropertytype() {
		return propertytype;
	}

	/**
	 * Sets the propertytype.
	 *
	 * @param propertytype the new propertytype
	 */
	public void setPropertytype(Propertytype propertytype) {
		this.propertytype = propertytype;
	}

	/**
	 * Gets the chiraghuser.
	 *
	 * @return the chiraghuser
	 */
	public Chiraghuser getChiraghuser() {
		return chiraghuser;
	}

	/**
	 * Sets the chiraghuser.
	 *
	 * @param chiraghuser the new chiraghuser
	 */
	public void setChiraghuser(Chiraghuser chiraghuser) {
		this.chiraghuser = chiraghuser;
	}

	/**
	 * Gets the propertymarketanalysises.
	 *
	 * @return the propertymarketanalysises
	 */
	public java.util.Set<Propertymarketanalysis> getPropertymarketanalysises() {
		return propertymarketanalysises;
	}

	/**
	 * Sets the propertymarketanalysises.
	 *
	 * @param propertymarketanalysises the new propertymarketanalysises
	 */
	public void setPropertymarketanalysises(java.util.Set<Propertymarketanalysis> propertymarketanalysises) {
		this.propertymarketanalysises = propertymarketanalysises;
	}

	/**
	 * Gets the propertyauctionprocesses.
	 *
	 * @return the propertyauctionprocesses
	 */
	public java.util.Set<Propertyauctionprocess> getPropertyauctionprocesses() {
		return propertyauctionprocesses;
	}

	/**
	 * Sets the propertyauctionprocesses.
	 *
	 * @param propertyauctionprocesses the new propertyauctionprocesses
	 */
	public void setPropertyauctionprocesses(java.util.Set<Propertyauctionprocess> propertyauctionprocesses) {
		this.propertyauctionprocesses = propertyauctionprocesses;
	}

	/**
	 * Gets the propertybidprocesses.
	 *
	 * @return the propertybidprocesses
	 */
	public java.util.Set<Propertybidprocess> getPropertybidprocesses() {
		return propertybidprocesses;
	}

	/**
	 * Sets the propertybidprocesses.
	 *
	 * @param propertybidprocesses the new propertybidprocesses
	 */
	public void setPropertybidprocesses(java.util.Set<Propertybidprocess> propertybidprocesses) {
		this.propertybidprocesses = propertybidprocesses;
	}

	/**
	 * Gets the sellerpaymentses.
	 *
	 * @return the sellerpaymentses
	 */
	public java.util.Set<SellerPayments> getSellerpaymentses() {
		return sellerpaymentses;
	}

	/**
	 * Sets the sellerpaymentses.
	 *
	 * @param sellerpaymentses the new sellerpaymentses
	 */
	public void setSellerpaymentses(java.util.Set<SellerPayments> sellerpaymentses) {
		this.sellerpaymentses = sellerpaymentses;
	}

	/**
	 * Gets the propertysellerdetailses.
	 *
	 * @return the propertysellerdetailses
	 */
	public java.util.Set<Propertysellerdetails> getPropertysellerdetailses() {
		return propertysellerdetailses;
	}

	/**
	 * Sets the propertysellerdetailses.
	 *
	 * @param propertysellerdetailses the new propertysellerdetailses
	 */
	public void setPropertysellerdetailses(java.util.Set<Propertysellerdetails> propertysellerdetailses) {
		this.propertysellerdetailses = propertysellerdetailses;
	}

	/**
	 * Gets the last action performed.
	 *
	 * @return the last action performed
	 */
	public String getLastActionPerformed() {
		return lastActionPerformed;
	}

	/**
	 * Sets the last action performed.
	 *
	 * @param lastActionPerformed the new last action performed
	 */
	public void setLastActionPerformed(String lastActionPerformed) {
		this.lastActionPerformed = lastActionPerformed;
	}

	/**
	 * Gets the checks if is personal details verified.
	 *
	 * @return the checks if is personal details verified
	 */
	public String getIsPersonalDetailsVerified() {
		return isPersonalDetailsVerified;
	}

	/**
	 * Sets the checks if is personal details verified.
	 *
	 * @param isPersonalDetailsVerified the new checks if is personal details verified
	 */
	public void setIsPersonalDetailsVerified(String isPersonalDetailsVerified) {
		this.isPersonalDetailsVerified = isPersonalDetailsVerified;
	}

	/**
	 * Gets the checks if is POA details verified.
	 *
	 * @return the checks if is POA details verified
	 */
	public String getIsPOADetailsVerified() {
		return isPOADetailsVerified;
	}

	/**
	 * Sets the checks if is POA details verified.
	 *
	 * @param isPOADetailsVerified the new checks if is POA details verified
	 */
	public void setIsPOADetailsVerified(String isPOADetailsVerified) {
		this.isPOADetailsVerified = isPOADetailsVerified;
	}

	/**
	 * Gets the checks if is property details verified.
	 *
	 * @return the checks if is property details verified
	 */
	public String getIsPropertyDetailsVerified() {
		return isPropertyDetailsVerified;
	}

	/**
	 * Sets the checks if is property details verified.
	 *
	 * @param isPropertyDetailsVerified the new checks if is property details verified
	 */
	public void setIsPropertyDetailsVerified(String isPropertyDetailsVerified) {
		this.isPropertyDetailsVerified = isPropertyDetailsVerified;
	}

	/**
	 * Gets the checks if is acknowledgement call.
	 *
	 * @return the checks if is acknowledgement call
	 */
	public String getIsAcknowledgementCall() {
		return isAcknowledgementCall;
	}

	/**
	 * Sets the checks if is acknowledgement call.
	 *
	 * @param isAcknowledgementCall the new checks if is acknowledgement call
	 */
	public void setIsAcknowledgementCall(String isAcknowledgementCall) {
		this.isAcknowledgementCall = isAcknowledgementCall;
	}

	

	/**
	 * Gets the last action.
	 *
	 * @return the last action
	 */
	public Calendar getLastAction() {
		return lastAction;
	}

	/**
	 * Sets the last action.
	 *
	 * @param lastAction the new last action
	 */
	public void setLastAction(Calendar lastAction) {
		this.lastAction = lastAction;
	}

	

	/**
	 * Gets the serialversionuid.
	 *
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
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
	 * Gets the seller user name.
	 *
	 * @return the seller user name
	 */
	public String getSellerUserName() {
		return sellerUserName;
	}

	/**
	 * Sets the seller user name.
	 *
	 * @param sellerUserName the new seller user name
	 */
	public void setSellerUserName(String sellerUserName) {
		this.sellerUserName = sellerUserName;
	}

	/**
	 * Gets the date received.
	 *
	 * @return the date received
	 */
	public Date getDateReceived() {
		return dateReceived;
	}

	/**
	 * Sets the date received.
	 *
	 * @param dateReceived the new date received
	 */
	public void setDateReceived(Date dateReceived) {
		this.dateReceived = dateReceived;
	}

	/**
	 * Gets the action performed by.
	 *
	 * @return the action performed by
	 */
	public String getActionPerformedBy() {
		return actionPerformedBy;
	}

	/**
	 * Sets the action performed by.
	 *
	 * @param actionPerformedBy the new action performed by
	 */
	public void setActionPerformedBy(String actionPerformedBy) {
		this.actionPerformedBy = actionPerformedBy;
	}

	/**
	 * Gets the status.
	 *
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Sets the status.
	 *
	 * @param status the new status
	 */
	public void setStatus(String status) {
		this.status = status;
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
