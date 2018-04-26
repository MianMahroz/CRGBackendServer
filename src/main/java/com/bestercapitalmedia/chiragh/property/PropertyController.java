package com.bestercapitalmedia.chiragh.property;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Optional;

import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bestercapitalmedia.chiragh.city.CityRepository;
import com.bestercapitalmedia.chiragh.property.type.Propertytype;
import com.bestercapitalmedia.chiragh.property.type.PropertytypeRepository;
import com.bestercapitalmedia.chiragh.user.Chiraghuser;
import com.bestercapitalmedia.chiragh.user.UserController;
import com.bestercapitalmedia.chiragh.user.UserRepository;
import com.bestercapitalmedia.chiragh.utill.ChiragUtill;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@RequestMapping("/api/property/")
public class PropertyController {
	private static final Logger log = LoggerFactory.getLogger(PropertyController.class);

	@Autowired
	ChiragUtill chiraghUtil;
	@Autowired
	UserRepository userRepository;

	@Autowired
	PropertytypeRepository propertyTypeRepository;
	@Autowired
	private PropertyRepository propertyRepository;

	private Chiraghproperty chiraghpropertNew;

	@RequestMapping(value = "/getAll", method = RequestMethod.GET)
	public Iterable<Chiraghproperty> list() {
		log.info("GET: /api/property/getAll");
		ObjectMapper objectMapper = new ObjectMapper();
		Iterable<Chiraghproperty> userList = propertyRepository.findAll();
		String rtnObject = "";
		try {
			rtnObject = objectMapper.writeValueAsString(userList);
		} catch (JsonProcessingException e) {

		}

		log.info("Output: " + rtnObject);
		log.info("--------------------------------------------------------");
		return userList;
	}// end of list method

	@RequestMapping(value = "/post")
	public String create(@RequestBody String data) {
		log.info("Post: /api/property/post");
		log.info("Input: " + data);

		Chiraghproperty chiraghproperty = new Chiraghproperty();
		ObjectMapper objectMapper = new ObjectMapper();
		String rtnObject = "";
		String msg = "";
		try {
			JSONObject jsonObj = new JSONObject(data);
			if (jsonObj.has("scannedTitleDeed") && jsonObj.has("propertyTitle") && jsonObj.has("propertyDescription")
					&& jsonObj.has("location") && jsonObj.has("sizePerSqft") && jsonObj.has("address")
					&& jsonObj.has("askingPrice") && jsonObj.has("areaPermitNo") && jsonObj.has("propertyReferenceNo")
					&& jsonObj.has("pricePerSqft") && jsonObj.has("isMdApproved") && jsonObj.has("isPublished")
					&& jsonObj.has("paymentVerificationCode") && jsonObj.has("noOfBedrooms") && jsonObj.has("noOfBaths")
					&& jsonObj.has("isMortgage") && jsonObj.has("mortgageValue") && jsonObj.has("mortageBank")
					&& jsonObj.has("mortgageYear") && jsonObj.has("isRented") && jsonObj.has("rentalEjariNo")
					&& jsonObj.has("rentalAnnualRent") && jsonObj.has("rentalPaymentChecks")
					&& jsonObj.has("rentalExpiryDate") && jsonObj.has("outdoorType") && jsonObj.has("isFurnished")
					&& jsonObj.has("kitchenType") && jsonObj.has("isMaidRoom") && jsonObj.has("isSwimmingPool")
					&& jsonObj.has("isGym") && jsonObj.has("isHeliPad") && jsonObj.has("noOfParking")
					&& jsonObj.has("noOfFloors") && jsonObj.has("paymentMethod") && jsonObj.has("sellerSecurityDeposit")
					&& jsonObj.has("sellerCommissionDeposit") && jsonObj.has("agreeVatCommission")
					&& jsonObj.has("mapLocation") && jsonObj.has("plotNo") && jsonObj.has("titleDeedNo")
					&& jsonObj.has("propertyStatus") && jsonObj.has("typeArea") && jsonObj.has("projectName")
					&& jsonObj.has("ownerAssociationNo") && jsonObj.has("presentUse") && jsonObj.has("communityNo")
					&& jsonObj.has("propertyAge") && jsonObj.has("noUnits") && jsonObj.has("noShops")
					&& jsonObj.has("noFacilities") && jsonObj.has("leaseStartDate") && jsonObj.has("leaseExpiryDate")
					&& jsonObj.has("tenantName") && jsonObj.has("payementStructure")
					&& jsonObj.has("tenancyContractUpload") && jsonObj.has("buyerSecurityDeposit")
					&& jsonObj.has("buyerCommissionDeposit") && jsonObj.has("thirdPartyVerification")
					&& jsonObj.has("isThirdPartyPayment") && jsonObj.has("verificationHodApproved")
					&& jsonObj.has("valuationReportDocument") && jsonObj.has("valuationHodApproved")
					&& jsonObj.has("propertyTypeTitle") && jsonObj.has("userName")) {

				chiraghproperty.setPropertyTitle(jsonObj.getString("propertyTitle"));
				chiraghproperty.setPropertyDescription(jsonObj.getString("propertyDescription"));
				chiraghproperty.setLocation(jsonObj.getString("location"));
				chiraghproperty.setSizePerSqft(Float.parseFloat(jsonObj.getString("sizePerSqft")));
				chiraghproperty.setAddress(jsonObj.getString("address"));
				chiraghproperty.setAskingPrice(Float.parseFloat(jsonObj.getString("askingPrice")));
				chiraghproperty.setAreaPermitNo(jsonObj.getString("areaPermitNo"));
				chiraghproperty.setPricePerSqft(Float.parseFloat(jsonObj.getString("pricePerSqft")));
				chiraghproperty.setIsMdApproved(Integer.parseInt(jsonObj.getString("isMdApproved")));
				chiraghproperty.setIsPublished(Integer.parseInt(jsonObj.getString("isPublished")));
				chiraghproperty.setPaymentVerificationCode(jsonObj.getString("paymentVerificationCode"));
				chiraghproperty.setNoOfBedrooms(Integer.parseInt(jsonObj.getString("noOfBedrooms")));
				chiraghproperty.setNoOfBaths(Integer.parseInt(jsonObj.getString("noOfBaths")));
				chiraghproperty.setIsMortgage(Integer.parseInt(jsonObj.getString("isMortgage")));
				chiraghproperty.setMortgageValue(Float.parseFloat(jsonObj.getString("mortgageValue")));
				chiraghproperty.setMortageBank(jsonObj.getString("mortageBank"));
				chiraghproperty.setMortgageYear(Integer.parseInt(jsonObj.getString("mortgageYear")));
				chiraghproperty.setIsRented(Integer.parseInt(jsonObj.getString("isRented")));
				chiraghproperty.setRentalEjariNo(Integer.parseInt(jsonObj.getString("rentalEjariNo")));
				chiraghproperty.setRentalAnnualRent(Integer.parseInt(jsonObj.getString("rentalAnnualRent")));
				chiraghproperty.setRentalPaymentChecks(Integer.parseInt(jsonObj.getString("rentalPaymentChecks")));
				chiraghproperty.setRentalExpiryDate(chiraghUtil.getDate(jsonObj.getString("rentalExpiryDate")));
				chiraghproperty.setOutdoorType(jsonObj.getString("outdoorType"));
				chiraghproperty.setIsFurnished(Integer.parseInt(jsonObj.getString("isFurnished")));
				chiraghproperty.setIsMaidRoom(Integer.parseInt(jsonObj.getString("isMaidRoom")));
				chiraghproperty.setIsSwimmingPool(Integer.parseInt(jsonObj.getString("isSwimmingPool")));
				chiraghproperty.setIsGym(Integer.parseInt(jsonObj.getString("isGym")));
				chiraghproperty.setIsHeliPad(Integer.parseInt(jsonObj.getString("isHeliPad")));
				chiraghproperty.setNoOfParking(Integer.parseInt(jsonObj.getString("noOfParking")));
				chiraghproperty.setNoOfFloors(Integer.parseInt(jsonObj.getString("noOfFloors")));
				chiraghproperty.setPaymentMethod(jsonObj.getString("paymentMethod"));
				chiraghproperty.setSellerSecurityDeposit(jsonObj.getString("sellerSecurityDeposit"));
				chiraghproperty.setSellerCommissionDeposit(jsonObj.getString("sellerCommissionDeposit"));
				chiraghproperty.setAgreeVatCommission(Integer.parseInt(jsonObj.getString("agreeVatCommission")));
				chiraghproperty.setMapLocation(jsonObj.getString("mapLocation"));
				chiraghproperty.setPlotNo(jsonObj.getString("plotNo"));
				chiraghproperty.setTitleDeedNo(jsonObj.getString("titleDeedNo"));
				chiraghproperty.setTypeArea(jsonObj.getString("typeArea"));
				chiraghproperty.setProjectName(jsonObj.getString("projectName"));
				chiraghproperty.setOwnerAssociationNo(jsonObj.getString("ownerAssociationNo"));
				chiraghproperty.setPresentUse(jsonObj.getString("presentUse"));
				chiraghproperty.setCommunityNo(jsonObj.getString("communityNo"));
				chiraghproperty.setPropertyAge(jsonObj.getString("propertyAge"));
				chiraghproperty.setNoFacilities(jsonObj.getString("noFacilities"));
				chiraghproperty.setLeaseStartDate(chiraghUtil.getDate(jsonObj.getString("leaseStartDate")));
				chiraghproperty.setLeaseExpiryDate(chiraghUtil.getDate(jsonObj.getString("leaseExpiryDate")));
				chiraghproperty.setTenantName(jsonObj.getString("tenantName"));
				chiraghproperty.setTenancyContractUpload(jsonObj.getString("tenancyContractUpload"));
				chiraghproperty.setBuyerSecurityDeposit(jsonObj.getString("buyerSecurityDeposit"));
				chiraghproperty.setBuyerCommissionDeposit(jsonObj.getString("buyerCommissionDeposit"));
				chiraghproperty
						.setThirdPartyVerification(Integer.parseInt(jsonObj.getString("thirdPartyVerification")));
				chiraghproperty.setIsThirdPartyPayment(Integer.parseInt(jsonObj.getString("isThirdPartyPayment")));
				chiraghproperty
						.setVerificationHodApproved(Integer.parseInt(jsonObj.getString("verificationHodApproved")));
				chiraghproperty.setValuationHodApproved(Integer.parseInt(jsonObj.getString("valuationHodApproved")));
				chiraghproperty.setScannedTitleDeed(jsonObj.getString("scannedTitleDeed"));
				chiraghproperty.setValuationReportDocument(jsonObj.getString("valuationReportDocument"));
				chiraghproperty.setValuationReportDocument(jsonObj.getString("valuationReportDocument"));
				chiraghproperty.setValuationReportDocument(jsonObj.getString("valuationReportDocument"));
				Propertytype propertytype1 = propertyTypeRepository
						.findBytypeTitle(jsonObj.getString("propertyTypeTitle"));
				chiraghproperty.setPropertytype(propertytype1);
				Chiraghuser chiraghuser = userRepository.findByUserName(jsonObj.getString("userName"));
				chiraghproperty.setChiraghuser(chiraghuser);
				chiraghpropertNew = propertyRepository.save(chiraghproperty);
				rtnObject = objectMapper.writeValueAsString(chiraghpropertNew);
				msg = "success";
			} // end of if
			else {
				msg = "Invalid  Object!";
			}
		} catch (Exception ee) {
			msg = "Error!" + ee.getMessage();
		}

		if (msg.equals("success")) {
			log.info("Output: " + rtnObject);
			log.info("--------------------------------------------------------");
			return rtnObject;
		} else {
			log.info("Output: " + msg);
			log.info("--------------------------------------------------------");
			return msg;
		}
	}

	@RequestMapping(value = "/post/advance/{userName}")
	public int createnew(@PathVariable(value = "userName") String userName) {
		log.info("Post: /api/property/post/advance");
		log.info("Input: " + userName);
		Chiraghproperty chiraghproperty = new Chiraghproperty();
		try {
			Chiraghuser chiraghuser = userRepository.findByUserName(userName);
			chiraghproperty.setChiraghuser(chiraghuser);
			Propertytype propertytype = propertyTypeRepository.findBytypeTitle("TypeTitle");// rough PropertyTitle
			chiraghproperty.setPropertytype(propertytype);
			chiraghpropertNew = propertyRepository.save(chiraghproperty);
		} catch (Exception ee) {
			ee.printStackTrace();
		}
		return chiraghpropertNew.getPropertyId();

	}

	@RequestMapping(value = "/put", method = RequestMethod.PUT)
	public String update(@RequestBody String data) {
		log.info("Post: /api/property/put");
		log.info("Input: " + data);

		Chiraghproperty chiraghproperty = new Chiraghproperty();
		ObjectMapper objectMapper = new ObjectMapper();
		String rtnObject = "";
		String msg = "";
		try {
			JSONObject jsonObj = new JSONObject(data);
			if (jsonObj.has("scannedTitleDeed") && jsonObj.has("propertyTitle") && jsonObj.has("propertyDescription")
					&& jsonObj.has("location") && jsonObj.has("sizePerSqft") && jsonObj.has("address")
					&& jsonObj.has("askingPrice") && jsonObj.has("areaPermitNo") && jsonObj.has("propertyReferenceNo")
					&& jsonObj.has("pricePerSqft") && jsonObj.has("isMdApproved") && jsonObj.has("isPublished")
					&& jsonObj.has("paymentVerificationCode") && jsonObj.has("noOfBedrooms") && jsonObj.has("noOfBaths")
					&& jsonObj.has("isMortgage") && jsonObj.has("mortgageValue") && jsonObj.has("mortageBank")
					&& jsonObj.has("mortgageYear") && jsonObj.has("isRented") && jsonObj.has("rentalEjariNo")
					&& jsonObj.has("rentalAnnualRent") && jsonObj.has("rentalPaymentChecks")
					&& jsonObj.has("rentalExpiryDate") && jsonObj.has("outdoorType") && jsonObj.has("isFurnished")
					&& jsonObj.has("kitchenType") && jsonObj.has("isMaidRoom") && jsonObj.has("isSwimmingPool")
					&& jsonObj.has("isGym") && jsonObj.has("isHeliPad") && jsonObj.has("noOfParking")
					&& jsonObj.has("noOfFloors") && jsonObj.has("paymentMethod") && jsonObj.has("sellerSecurityDeposit")
					&& jsonObj.has("sellerCommissionDeposit") && jsonObj.has("agreeVatCommission")
					&& jsonObj.has("mapLocation") && jsonObj.has("plotNo") && jsonObj.has("titleDeedNo")
					&& jsonObj.has("propertyStatus") && jsonObj.has("typeArea") && jsonObj.has("projectName")
					&& jsonObj.has("ownerAssociationNo") && jsonObj.has("presentUse") && jsonObj.has("communityNo")
					&& jsonObj.has("propertyAge") && jsonObj.has("noUnits") && jsonObj.has("noShops")
					&& jsonObj.has("noFacilities") && jsonObj.has("leaseStartDate") && jsonObj.has("leaseExpiryDate")
					&& jsonObj.has("tenantName") && jsonObj.has("payementStructure")
					&& jsonObj.has("tenancyContractUpload") && jsonObj.has("buyerSecurityDeposit")
					&& jsonObj.has("buyerCommissionDeposit") && jsonObj.has("thirdPartyVerification")
					&& jsonObj.has("isThirdPartyPayment") && jsonObj.has("verificationHodApproved")
					&& jsonObj.has("valuationReportDocument") && jsonObj.has("valuationHodApproved")
					&& jsonObj.has("propertyTypeTitle") && jsonObj.has("userName") && jsonObj.has("propertyId")) {

				String propertyId = jsonObj.getString("propertyId");
				int id = 0;
				if (propertyId.equals("") || propertyId == null) {
					return "Property Title is Empty!";
				} else {
					Chiraghproperty chiraghproperty2 = propertyRepository
							.findByPropertyId(Integer.parseInt(propertyId));
					id = chiraghproperty2.getPropertyId();
				}
				chiraghproperty.setPropertyId(id);
				chiraghproperty.setPropertyTitle(jsonObj.getString("propertyTitle"));
				chiraghproperty.setPropertyDescription(jsonObj.getString("propertyDescription"));
				chiraghproperty.setLocation(jsonObj.getString("location"));
				chiraghproperty.setSizePerSqft(Float.parseFloat(jsonObj.getString("sizePerSqft")));
				chiraghproperty.setAddress(jsonObj.getString("address"));
				chiraghproperty.setAskingPrice(Float.parseFloat(jsonObj.getString("askingPrice")));
				chiraghproperty.setAreaPermitNo(jsonObj.getString("areaPermitNo"));
				chiraghproperty.setPricePerSqft(Float.parseFloat(jsonObj.getString("pricePerSqft")));
				chiraghproperty.setIsMdApproved(Integer.parseInt(jsonObj.getString("isMdApproved")));
				chiraghproperty.setIsPublished(Integer.parseInt(jsonObj.getString("isPublished")));
				chiraghproperty.setPaymentVerificationCode(jsonObj.getString("paymentVerificationCode"));
				chiraghproperty.setNoOfBedrooms(Integer.parseInt(jsonObj.getString("noOfBedrooms")));
				chiraghproperty.setNoOfBaths(Integer.parseInt(jsonObj.getString("noOfBaths")));
				chiraghproperty.setIsMortgage(Integer.parseInt(jsonObj.getString("isMortgage")));
				chiraghproperty.setMortgageValue(Float.parseFloat(jsonObj.getString("mortgageValue")));
				chiraghproperty.setMortageBank(jsonObj.getString("mortageBank"));
				chiraghproperty.setMortgageYear(Integer.parseInt(jsonObj.getString("mortgageYear")));
				chiraghproperty.setIsRented(Integer.parseInt(jsonObj.getString("isRented")));
				chiraghproperty.setRentalEjariNo(Integer.parseInt(jsonObj.getString("rentalEjariNo")));
				chiraghproperty.setRentalAnnualRent(Integer.parseInt(jsonObj.getString("rentalAnnualRent")));
				chiraghproperty.setRentalPaymentChecks(Integer.parseInt(jsonObj.getString("rentalPaymentChecks")));
				chiraghproperty.setRentalExpiryDate(chiraghUtil.getDate(jsonObj.getString("rentalExpiryDate")));
				chiraghproperty.setOutdoorType(jsonObj.getString("outdoorType"));
				chiraghproperty.setIsFurnished(Integer.parseInt(jsonObj.getString("isFurnished")));
				chiraghproperty.setIsMaidRoom(Integer.parseInt(jsonObj.getString("isMaidRoom")));
				chiraghproperty.setIsSwimmingPool(Integer.parseInt(jsonObj.getString("isSwimmingPool")));
				chiraghproperty.setIsGym(Integer.parseInt(jsonObj.getString("isGym")));
				chiraghproperty.setIsHeliPad(Integer.parseInt(jsonObj.getString("isHeliPad")));
				chiraghproperty.setNoOfParking(Integer.parseInt(jsonObj.getString("noOfParking")));
				chiraghproperty.setNoOfFloors(Integer.parseInt(jsonObj.getString("noOfFloors")));
				chiraghproperty.setPaymentMethod(jsonObj.getString("paymentMethod"));
				chiraghproperty.setSellerSecurityDeposit(jsonObj.getString("sellerSecurityDeposit"));
				chiraghproperty.setSellerCommissionDeposit(jsonObj.getString("sellerCommissionDeposit"));
				chiraghproperty.setAgreeVatCommission(Integer.parseInt(jsonObj.getString("agreeVatCommission")));
				chiraghproperty.setMapLocation(jsonObj.getString("mapLocation"));
				chiraghproperty.setPlotNo(jsonObj.getString("plotNo"));
				chiraghproperty.setTitleDeedNo(jsonObj.getString("titleDeedNo"));
				chiraghproperty.setTypeArea(jsonObj.getString("typeArea"));
				chiraghproperty.setProjectName(jsonObj.getString("projectName"));
				chiraghproperty.setOwnerAssociationNo(jsonObj.getString("ownerAssociationNo"));
				chiraghproperty.setPresentUse(jsonObj.getString("presentUse"));
				chiraghproperty.setCommunityNo(jsonObj.getString("communityNo"));
				chiraghproperty.setPropertyAge(jsonObj.getString("propertyAge"));
				chiraghproperty.setNoFacilities(jsonObj.getString("noFacilities"));
				chiraghproperty.setLeaseStartDate(chiraghUtil.getDate(jsonObj.getString("leaseStartDate")));
				chiraghproperty.setLeaseExpiryDate(chiraghUtil.getDate(jsonObj.getString("leaseExpiryDate")));
				chiraghproperty.setTenantName(jsonObj.getString("tenantName"));
				chiraghproperty.setTenancyContractUpload(jsonObj.getString("tenancyContractUpload"));
				chiraghproperty.setBuyerSecurityDeposit(jsonObj.getString("buyerSecurityDeposit"));
				chiraghproperty.setBuyerCommissionDeposit(jsonObj.getString("buyerCommissionDeposit"));
				chiraghproperty
						.setThirdPartyVerification(Integer.parseInt(jsonObj.getString("thirdPartyVerification")));
				chiraghproperty.setIsThirdPartyPayment(Integer.parseInt(jsonObj.getString("isThirdPartyPayment")));
				chiraghproperty
						.setVerificationHodApproved(Integer.parseInt(jsonObj.getString("verificationHodApproved")));
				chiraghproperty.setValuationHodApproved(Integer.parseInt(jsonObj.getString("valuationHodApproved")));
				chiraghproperty.setScannedTitleDeed(jsonObj.getString("scannedTitleDeed"));
				chiraghproperty.setValuationReportDocument(jsonObj.getString("valuationReportDocument"));
				chiraghproperty.setValuationReportDocument(jsonObj.getString("valuationReportDocument"));
				chiraghproperty.setValuationReportDocument(jsonObj.getString("valuationReportDocument"));
				Propertytype propertytype1 = propertyTypeRepository
						.findBytypeTitle(jsonObj.getString("propertyTypeTitle"));
				chiraghproperty.setPropertytype(propertytype1);
				Chiraghuser chiraghuser = userRepository.findByUserName(jsonObj.getString("userName"));
				chiraghproperty.setChiraghuser(chiraghuser);
				chiraghpropertNew = propertyRepository.save(chiraghproperty);
				rtnObject = objectMapper.writeValueAsString(chiraghpropertNew);
				msg = "success";
			} // end of if
			else {
				msg = "Invalid  Object!";
			}
		} catch (Exception ee) {
			msg = "Error!" + ee.getMessage();
		}

		if (msg.equals("success")) {
			log.info("Output: " + rtnObject);
			log.info("--------------------------------------------------------");
			return rtnObject;
		} else {
			log.info("Output: " + msg);
			log.info("--------------------------------------------------------");
			return msg;
		}
	}

	@RequestMapping(value = "/put/financials", method = RequestMethod.PUT)
	public String updateFinancials(@RequestBody String data) {
		log.info("Post: /api/property/put/financials");
		log.info("Input: " + data);

		Chiraghproperty chiraghproperty = new Chiraghproperty();
		ObjectMapper objectMapper = new ObjectMapper();
		String rtnObject = "";
		String msg = "";
		try {
			Chiraghproperty chiraghproperty2 = null;
			JSONObject jsonObj = new JSONObject(data);
			if (jsonObj.has("originalPrice") && jsonObj.has("listedPrice") && jsonObj.has("paidAmount")
					&& jsonObj.has("serviceCharge") && jsonObj.has("morgageStatus") && jsonObj.has("morgageRegNo")
					&& jsonObj.has("bank") && jsonObj.has("morgageAmount") && jsonObj.has("preClosureCharges")
					&& jsonObj.has("paymentSchedule") && jsonObj.has("date") && jsonObj.has("amount")
					&& jsonObj.has("morgageNoc") && jsonObj.has("propertyId") && jsonObj.has("userName")) {
				String propertyId = jsonObj.getString("propertyId");
				int id = 0;
				if (propertyId.equals("") || propertyId == null) {
					return "Property Title is Empty!";
				} else {
					chiraghproperty2 = propertyRepository.findByPropertyId(Integer.parseInt(propertyId));
					id = chiraghproperty2.getPropertyId();
				}
				// general Details
				chiraghproperty.setPropertyTitle(chiraghproperty2.getPropertyTitle());
				chiraghproperty.setPropertyDescription(chiraghproperty2.getPropertyDescription());
				chiraghproperty.setLocation(chiraghproperty2.getLocation());
				chiraghproperty.setSizePerSqft(chiraghproperty2.getSizePerSqft());
				chiraghproperty.setAddress(chiraghproperty2.getAddress());
				chiraghproperty.setAskingPrice(chiraghproperty2.getAskingPrice());
				chiraghproperty.setAreaPermitNo(chiraghproperty2.getAreaPermitNo());
				chiraghproperty.setPricePerSqft(chiraghproperty2.getPricePerSqft());
				chiraghproperty.setIsMdApproved(chiraghproperty2.getIsMdApproved());
				chiraghproperty.setIsPublished(chiraghproperty2.getIsPublished());
				chiraghproperty.setPaymentVerificationCode(chiraghproperty2.getPaymentVerificationCode());
				chiraghproperty.setNoOfBedrooms(chiraghproperty2.getNoOfBedrooms());
				chiraghproperty.setNoOfBaths(chiraghproperty2.getNoOfBaths());
				chiraghproperty.setIsMortgage(chiraghproperty2.getIsMortgage());
				chiraghproperty.setMortgageValue(chiraghproperty2.getMortgageValue());
				chiraghproperty.setMortageBank(chiraghproperty2.getMortageBank());
				chiraghproperty.setMortgageYear(chiraghproperty2.getMortgageYear());
				chiraghproperty.setIsRented(chiraghproperty2.getIsRented());
				chiraghproperty.setRentalEjariNo(chiraghproperty2.getRentalEjariNo());
				chiraghproperty.setRentalAnnualRent(chiraghproperty2.getRentalAnnualRent());
				chiraghproperty.setRentalPaymentChecks(chiraghproperty2.getRentalPaymentChecks());
				chiraghproperty.setRentalExpiryDate(chiraghproperty2.getRentalExpiryDate());
				chiraghproperty.setOutdoorType(chiraghproperty2.getOutdoorType());
				chiraghproperty.setIsFurnished(chiraghproperty2.getIsFurnished());
				chiraghproperty.setIsMaidRoom(chiraghproperty2.getIsMaidRoom());
				chiraghproperty.setIsSwimmingPool(chiraghproperty2.getIsSwimmingPool());
				chiraghproperty.setIsGym(chiraghproperty2.getIsGym());
				chiraghproperty.setIsHeliPad(chiraghproperty2.getIsHeliPad());
				chiraghproperty.setNoOfParking(chiraghproperty2.getNoOfParking());
				chiraghproperty.setNoOfFloors(chiraghproperty2.getNoOfFloors());
				chiraghproperty.setPaymentMethod(chiraghproperty2.getPaymentMethod());
				chiraghproperty.setSellerSecurityDeposit(chiraghproperty2.getSellerSecurityDeposit());
				chiraghproperty.setSellerCommissionDeposit(chiraghproperty2.getSellerCommissionDeposit());
				chiraghproperty.setAgreeVatCommission(chiraghproperty2.getAgreeVatCommission());
				chiraghproperty.setMapLocation(chiraghproperty2.getMapLocation());
				chiraghproperty.setPlotNo(chiraghproperty2.getPlotNo());
				chiraghproperty.setTitleDeedNo(chiraghproperty2.getTitleDeedNo());
				chiraghproperty.setTypeArea(chiraghproperty2.getTypeArea());
				chiraghproperty.setProjectName(chiraghproperty2.getProjectName());
				chiraghproperty.setOwnerAssociationNo(chiraghproperty2.getOwnerAssociationNo());
				chiraghproperty.setPresentUse(chiraghproperty2.getPresentUse());
				chiraghproperty.setCommunityNo(chiraghproperty2.getCommunityNo());
				chiraghproperty.setPropertyAge(chiraghproperty2.getPropertyAge());
				chiraghproperty.setNoFacilities(chiraghproperty2.getNoFacilities());
				chiraghproperty.setLeaseStartDate(chiraghproperty2.getLeaseStartDate());
				chiraghproperty.setLeaseExpiryDate(chiraghproperty2.getLeaseExpiryDate());
				chiraghproperty.setTenantName(chiraghproperty2.getTenantName());
				chiraghproperty.setTenancyContractUpload(chiraghproperty2.getTenancyContractUpload());
				chiraghproperty.setBuyerSecurityDeposit(chiraghproperty2.getBuyerSecurityDeposit());
				chiraghproperty.setBuyerCommissionDeposit(chiraghproperty2.getBuyerCommissionDeposit());
				chiraghproperty.setThirdPartyVerification(chiraghproperty2.getThirdPartyVerification());
				chiraghproperty.setIsThirdPartyPayment(chiraghproperty2.getIsThirdPartyPayment());
				chiraghproperty.setVerificationHodApproved(chiraghproperty2.getVerificationHodApproved());
				chiraghproperty.setValuationHodApproved(chiraghproperty2.getValuationHodApproved());
				chiraghproperty.setScannedTitleDeed(chiraghproperty2.getScannedTitleDeed());
				chiraghproperty.setValuationReportDocument(chiraghproperty2.getValuationReportDocument());
				chiraghproperty.setPropertytype(chiraghproperty2.getPropertytype());
				Chiraghuser chiraghuser = userRepository.findByUserName(jsonObj.getString("userName"));
				chiraghproperty.setChiraghuser(chiraghuser);

				// financial Details
				chiraghproperty.setPropertyId(id);
				chiraghproperty.setListedPrice(Float.parseFloat(jsonObj.getString("listedPrice")));
				chiraghproperty.setOriginalPrice(Float.parseFloat(jsonObj.getString("originalPrice")));
				chiraghproperty.setPaidAmount(Float.parseFloat(jsonObj.getString("paidAmount")));
				chiraghproperty.setServiceCharge(Float.parseFloat(jsonObj.getString("serviceCharge")));
				chiraghproperty.setMorgageStatus(jsonObj.getString("morgageStatus"));
				chiraghproperty.setMorgageRegNo(jsonObj.getString("morgageRegNo"));
				chiraghproperty.setBank(jsonObj.getString("bank"));
				chiraghproperty.setMorgageAmount(Float.parseFloat(jsonObj.getString("morgageAmount")));
				chiraghproperty.setPreClosureCharges(Float.parseFloat(jsonObj.getString("preClosureCharges")));
				chiraghproperty.setPaymentSchedule(chiraghUtil.getDate(jsonObj.getString("paymentSchedule")));
				chiraghproperty.setDate(chiraghUtil.getDate(jsonObj.getString("date")));
				float a = Float.parseFloat(jsonObj.getString("amount"));
				System.out.println(a);
				chiraghproperty.setAmount(a);
				chiraghproperty.setMorgageNoc(jsonObj.getString("morgageNoc"));
				chiraghpropertNew = propertyRepository.save(chiraghproperty);
				rtnObject = objectMapper.writeValueAsString(chiraghpropertNew);
				msg = "success";
			} // end of if
			else {
				msg = "Invalid  Object!";
			}
		} catch (Exception ee) {
			msg = "Error!" + ee.getMessage();
		}

		if (msg.equals("success")) {
			log.info("Output: " + rtnObject);
			log.info("--------------------------------------------------------");
			return rtnObject;
		} else {
			log.info("Output: " + msg);
			log.info("--------------------------------------------------------");
			return msg;
		}
	}

	@RequestMapping(value = "/put/rentinfo", method = RequestMethod.PUT)
	public String updaterentdetails(@RequestBody String data) {
		log.info("Post: /api/property/put/rentinfo");
		log.info("Input: " + data);

		Chiraghproperty chiraghproperty = new Chiraghproperty();
		ObjectMapper objectMapper = new ObjectMapper();
		String rtnObject = "";
		String msg = "";
		try {
			Chiraghproperty chiraghproperty2 = null;
			JSONObject jsonObj = new JSONObject(data);
			if (jsonObj.has("tenantName") && jsonObj.has("payementStructure") && jsonObj.has("rentalEjariNo")
					&& jsonObj.has("isRented") && jsonObj.has("rentalAnnualRent") && jsonObj.has("leaseStartDate")
					&& jsonObj.has("leaseExpiryDate") && jsonObj.has("tenancyContractUpload")
					&& jsonObj.has("isVacant") && jsonObj.has("propertyId") && jsonObj.has("userName")) {
				String propertyId = jsonObj.getString("propertyId");
				
				if (propertyId.equals("") || propertyId == null) {
					return "Property Id is Empty!";
				} else {
					chiraghproperty2 = propertyRepository.findByPropertyId(Integer.parseInt(propertyId));
					
				}
				// general Details
				chiraghproperty.setPropertyTitle(chiraghproperty2.getPropertyTitle());
				chiraghproperty.setPropertyDescription(chiraghproperty2.getPropertyDescription());
				chiraghproperty.setLocation(chiraghproperty2.getLocation());
				chiraghproperty.setSizePerSqft(chiraghproperty2.getSizePerSqft());
				chiraghproperty.setAddress(chiraghproperty2.getAddress());
				chiraghproperty.setAskingPrice(chiraghproperty2.getAskingPrice());
				chiraghproperty.setAreaPermitNo(chiraghproperty2.getAreaPermitNo());
				chiraghproperty.setPricePerSqft(chiraghproperty2.getPricePerSqft());
				chiraghproperty.setIsMdApproved(chiraghproperty2.getIsMdApproved());
				chiraghproperty.setIsPublished(chiraghproperty2.getIsPublished());
				chiraghproperty.setPaymentVerificationCode(chiraghproperty2.getPaymentVerificationCode());
				chiraghproperty.setNoOfBedrooms(chiraghproperty2.getNoOfBedrooms());
				chiraghproperty.setNoOfBaths(chiraghproperty2.getNoOfBaths());
				chiraghproperty.setIsMortgage(chiraghproperty2.getIsMortgage());
				chiraghproperty.setMortgageValue(chiraghproperty2.getMortgageValue());
				chiraghproperty.setMortageBank(chiraghproperty2.getMortageBank());
				chiraghproperty.setMortgageYear(chiraghproperty2.getMortgageYear());
				chiraghproperty.setOutdoorType(chiraghproperty2.getOutdoorType());
				chiraghproperty.setIsFurnished(chiraghproperty2.getIsFurnished());
				chiraghproperty.setIsMaidRoom(chiraghproperty2.getIsMaidRoom());
				chiraghproperty.setIsSwimmingPool(chiraghproperty2.getIsSwimmingPool());
				chiraghproperty.setIsGym(chiraghproperty2.getIsGym());
				chiraghproperty.setIsHeliPad(chiraghproperty2.getIsHeliPad());
				chiraghproperty.setNoOfParking(chiraghproperty2.getNoOfParking());
				chiraghproperty.setNoOfFloors(chiraghproperty2.getNoOfFloors());
				chiraghproperty.setPaymentMethod(chiraghproperty2.getPaymentMethod());
				chiraghproperty.setSellerSecurityDeposit(chiraghproperty2.getSellerSecurityDeposit());
				chiraghproperty.setSellerCommissionDeposit(chiraghproperty2.getSellerCommissionDeposit());
				chiraghproperty.setAgreeVatCommission(chiraghproperty2.getAgreeVatCommission());
				chiraghproperty.setMapLocation(chiraghproperty2.getMapLocation());
				chiraghproperty.setPlotNo(chiraghproperty2.getPlotNo());
				chiraghproperty.setTitleDeedNo(chiraghproperty2.getTitleDeedNo());
				chiraghproperty.setTypeArea(chiraghproperty2.getTypeArea());
				chiraghproperty.setProjectName(chiraghproperty2.getProjectName());
				chiraghproperty.setOwnerAssociationNo(chiraghproperty2.getOwnerAssociationNo());
				chiraghproperty.setPresentUse(chiraghproperty2.getPresentUse());
				chiraghproperty.setCommunityNo(chiraghproperty2.getCommunityNo());
				chiraghproperty.setPropertyAge(chiraghproperty2.getPropertyAge());
				chiraghproperty.setNoFacilities(chiraghproperty2.getNoFacilities());
				chiraghproperty.setBuyerSecurityDeposit(chiraghproperty2.getBuyerSecurityDeposit());
				chiraghproperty.setBuyerCommissionDeposit(chiraghproperty2.getBuyerCommissionDeposit());
				chiraghproperty.setThirdPartyVerification(chiraghproperty2.getThirdPartyVerification());
				chiraghproperty.setIsThirdPartyPayment(chiraghproperty2.getIsThirdPartyPayment());
				chiraghproperty.setVerificationHodApproved(chiraghproperty2.getVerificationHodApproved());
				chiraghproperty.setValuationHodApproved(chiraghproperty2.getValuationHodApproved());
				chiraghproperty.setScannedTitleDeed(chiraghproperty2.getScannedTitleDeed());
				chiraghproperty.setValuationReportDocument(chiraghproperty2.getValuationReportDocument());
				chiraghproperty.setPropertytype(chiraghproperty2.getPropertytype());
				Chiraghuser chiraghuser = userRepository.findByUserName(jsonObj.getString("userName"));
				chiraghproperty.setChiraghuser(chiraghuser);

				// financial Details
				chiraghproperty.setPropertyId(chiraghproperty2.getPropertyId());
				chiraghproperty.setListedPrice(chiraghproperty2.getListedPrice());
				chiraghproperty.setOriginalPrice(chiraghproperty2.getOriginalPrice());
				chiraghproperty.setPaidAmount(chiraghproperty2.getPaidAmount());
				chiraghproperty.setServiceCharge(chiraghproperty2.getServiceCharge());
				chiraghproperty.setMorgageStatus(chiraghproperty2.getMorgageStatus());
				chiraghproperty.setMorgageRegNo(chiraghproperty2.getMorgageRegNo());
				chiraghproperty.setBank(chiraghproperty2.getBank());
				chiraghproperty.setMorgageAmount(chiraghproperty2.getMorgageAmount());
				chiraghproperty.setPreClosureCharges(chiraghproperty2.getPreClosureCharges());
				chiraghproperty.setPaymentSchedule(chiraghproperty2.getPaymentSchedule());
				chiraghproperty.setDate(chiraghproperty2.getDate());
				chiraghproperty.setAmount(chiraghproperty2.getAmount());
				chiraghproperty.setMorgageNoc(chiraghproperty2.getMorgageNoc());

				// property Rental Details
//				chiraghproperty.setRentalExpiryDate(chiraghproperty2.getRentalExpiryDate());
				chiraghproperty.setIsVacant(Integer.parseInt(jsonObj.getString("isVacant")));
				chiraghproperty.setIsRented(Integer.parseInt(jsonObj.getString("isRented")));
				chiraghproperty.setRentalEjariNo(Integer.parseInt(jsonObj.getString("rentalEjariNo")));
				chiraghproperty.setRentalAnnualRent(Float.parseFloat(jsonObj.getString("rentalAnnualRent")));
//				chiraghproperty.setRentalPaymentChecks(Integer.parseInt(jsonObj.getString("rentalPaymentChecks")));
				chiraghproperty.setLeaseStartDate(chiraghUtil.getDate(jsonObj.getString("leaseStartDate")));
				chiraghproperty.setLeaseExpiryDate(chiraghUtil.getDate(jsonObj.getString("leaseExpiryDate")));
				chiraghproperty.setTenantName(jsonObj.getString("tenantName"));
				chiraghproperty.setTenancyContractUpload(jsonObj.getString("tenancyContractUpload"));
				chiraghpropertNew = propertyRepository.save(chiraghproperty);
				rtnObject = objectMapper.writeValueAsString(chiraghpropertNew);
				msg = "success";
			} // end of if
			else {
				msg = "Invalid  Object!";
			}
		} catch (Exception ee) {
			msg = "Error!" + ee.getMessage();
		}

		if (msg.equals("success")) {
			log.info("Output: " + rtnObject);
			log.info("--------------------------------------------------------");
			return rtnObject;
		} else {
			log.info("Output: " + msg);
			log.info("--------------------------------------------------------");
			return msg;
		}
	}

	@RequestMapping(value = "/put/{id}", method = RequestMethod.PUT)
	public Chiraghproperty update(@PathVariable(value = "id") long id, @RequestBody Chiraghproperty entity) {
		return propertyRepository.save(entity);
	}

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable(value = "id") int id) {
		propertyRepository.deleteById(id);
	}

	@RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
	public Optional<Chiraghproperty> get(@PathVariable(value = "id") int id) {
		return propertyRepository.findById(id);
	}
}// end of class controller
