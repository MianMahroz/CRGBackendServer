package com.bestercapitalmedia.chiragh.property;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.json.JSONObject;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bestercapitalmedia.chiragh.city.CityRepository;
import com.bestercapitalmedia.chiragh.property.type.Propertytype;
import com.bestercapitalmedia.chiragh.property.type.PropertytypeRepository;
import com.bestercapitalmedia.chiragh.user.Chiraghuser;
import com.bestercapitalmedia.chiragh.user.UserController;
import com.bestercapitalmedia.chiragh.user.UserRepository;
import com.bestercapitalmedia.chiragh.utill.ChiragUtill;
import com.bestercapitalmedia.chiragh.utill.LogUtill;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@RequestMapping("/api/property/")
@SuppressWarnings({ "unchecked", "rawtypes" })
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
	@Autowired
	private ChiraghPropertyService chiraghPropertyService;
	@Autowired
	private LogUtill logUtill;

	@RequestMapping(value = "/getPropertyDetails/{propertyId}", method = RequestMethod.GET)
	public ResponseEntity getPropertyDetailsById(@PathVariable(value = "propertyId") int propertyId,
			HttpServletRequest httpServletRequest) {
		try {

			if (chiraghUtil.isValidSession(httpServletRequest) == false)
				return new ResponseEntity(chiraghUtil.getMessageObject("Invalid Session!"), HttpStatus.BAD_REQUEST);

			ModelMapper mapper = new ModelMapper();
			ObjectMapper objectMapper = new ObjectMapper();
			Chiraghproperty chiraghproperty = propertyRepository.findByPropertyId(propertyId);
			ChiraghPropertyDetailsDTO chiraghPropertyDetailsDTO = mapper.map(chiraghproperty,
					ChiraghPropertyDetailsDTO.class);
			try {
				logUtill.inputLog(httpServletRequest, chiraghUtil.getSessionUser(httpServletRequest),
						"/api/property/getPropertyDetails/{propertyId}", objectMapper.writeValueAsString(propertyId),
						objectMapper.writeValueAsString(chiraghPropertyDetailsDTO));
			} catch (Exception e) {
				return new ResponseEntity(chiraghUtil.getMessageObject("Log Generation Fail!"), HttpStatus.BAD_REQUEST);
			}

			return new ResponseEntity(chiraghPropertyDetailsDTO, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity(chiraghUtil.getMessageObject("Internal Server Error!" + e.getMessage()),
					HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}
	@RequestMapping(value = "/getPropertyFinancialDetails/{propertyId}", method = RequestMethod.GET)
	public ResponseEntity getPropertyFinancialDetailsById(@PathVariable(value = "propertyId") int propertyId,
			HttpServletRequest httpServletRequest) {
		try {

			if (chiraghUtil.isValidSession(httpServletRequest) == false)
				return new ResponseEntity(chiraghUtil.getMessageObject("Invalid Session!"), HttpStatus.BAD_REQUEST);

			ModelMapper mapper = new ModelMapper();
			ObjectMapper objectMapper = new ObjectMapper();
			Chiraghproperty chiraghproperty = propertyRepository.findByPropertyId(propertyId);
			ChiraghPropertyFinancialsDTO chiraghPropertyDetailsDTO = mapper.map(chiraghproperty,
					ChiraghPropertyFinancialsDTO.class);
			try {
				logUtill.inputLog(httpServletRequest, chiraghUtil.getSessionUser(httpServletRequest),
						"/api/property/getPropertyFinancialDetails/{propertyId}", objectMapper.writeValueAsString(propertyId),
						objectMapper.writeValueAsString(chiraghPropertyDetailsDTO));
			} catch (Exception e) {
				return new ResponseEntity(chiraghUtil.getMessageObject("Log Generation Fail!"), HttpStatus.BAD_REQUEST);
			}

			return new ResponseEntity(chiraghPropertyDetailsDTO, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity(chiraghUtil.getMessageObject("Internal Server Error!" + e.getMessage()),
					HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}
	@RequestMapping(value = "/getPropertyRentalDetails/{propertyId}", method = RequestMethod.GET)
	public ResponseEntity getPropertyRentalDetailsById(@PathVariable(value = "propertyId") int propertyId,
			HttpServletRequest httpServletRequest) {
		try {

			if (chiraghUtil.isValidSession(httpServletRequest) == false)
				return new ResponseEntity(chiraghUtil.getMessageObject("Invalid Session!"), HttpStatus.BAD_REQUEST);

			ModelMapper mapper = new ModelMapper();
			ObjectMapper objectMapper = new ObjectMapper();
			Chiraghproperty chiraghproperty = propertyRepository.findByPropertyId(propertyId);
			ChiraghPropertyRentDetailsDTO chiraghPropertyDetailsDTO = mapper.map(chiraghproperty,
					ChiraghPropertyRentDetailsDTO.class);
			try {
				logUtill.inputLog(httpServletRequest, chiraghUtil.getSessionUser(httpServletRequest),
						"/api/property/getPropertyRentalDetails/{propertyId}", objectMapper.writeValueAsString(propertyId),
						objectMapper.writeValueAsString(chiraghPropertyDetailsDTO));
			} catch (Exception e) {
				return new ResponseEntity(chiraghUtil.getMessageObject("Log Generation Fail!"), HttpStatus.BAD_REQUEST);
			}

			return new ResponseEntity(chiraghPropertyDetailsDTO, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity(chiraghUtil.getMessageObject("Internal Server Error!" + e.getMessage()),
					HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

	@RequestMapping(value = "/updateProperty/Details", method = RequestMethod.PUT)
	public @ResponseBody ResponseEntity update(@RequestBody ChiraghPropertyDetailsDTO chiraghPropertyDetailsDTO,
			HttpServletRequest httpServletRequest) {
		try {

			if (chiraghUtil.isValidSession(httpServletRequest) == false)
				return new ResponseEntity(chiraghUtil.getMessageObject("Invalid Session!"), HttpStatus.BAD_REQUEST);

			ModelMapper modelMapper = new ModelMapper();
			ObjectMapper mapper = new ObjectMapper();
			Chiraghproperty chiraghProperty = chiraghPropertyService.updatePropertyDetails(chiraghPropertyDetailsDTO,
					httpServletRequest);
			if (chiraghProperty == null)
				return new ResponseEntity(chiraghUtil.getMessageObject("Property Updates Ended with Error!"),
						HttpStatus.BAD_REQUEST);
			ChiraghPropertyDetailsDTO chiraghPropertyDetailsDTO2 = modelMapper.map(chiraghProperty,
					ChiraghPropertyDetailsDTO.class);
			if (chiraghPropertyDetailsDTO2 == null)
				return new ResponseEntity(chiraghUtil.getMessageObject("Mapping Fail during property updates!!"),
						HttpStatus.BAD_REQUEST);

			logUtill.inputLog(httpServletRequest, chiraghUtil.getSessionUser(httpServletRequest),
					"/api/property/updateProperty/Details", mapper.writeValueAsString(chiraghPropertyDetailsDTO),
					mapper.writeValueAsString(chiraghPropertyDetailsDTO2));
		} catch (Exception e) {
			return new ResponseEntity(chiraghUtil.getMessageObject("Internal Server Error!" + e.getMessage()),
					HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity(chiraghUtil.getMessageObject("Property Details Update Successfully"), HttpStatus.OK);

	}

	@RequestMapping(value = "/updateProperty/FinancialDetails", method = RequestMethod.PUT)
	public @ResponseBody ResponseEntity updateFinancials(
			@RequestBody ChiraghPropertyFinancialsDTO chiraghPropertyFinancialsDTO,
			HttpServletRequest httpServletRequest) {
		try {
			if (chiraghUtil.isValidSession(httpServletRequest) == false)
				return new ResponseEntity(chiraghUtil.getMessageObject("Invalid Session!"), HttpStatus.BAD_REQUEST);

			ObjectMapper mapper = new ObjectMapper();
			Chiraghproperty chiraghproperty = chiraghPropertyService
					.updatePropertyFinancialDetails(chiraghPropertyFinancialsDTO, httpServletRequest);
			if (chiraghproperty == null)
				return new ResponseEntity(chiraghUtil.getMessageObject("Property Financial Details Not Updated!"),
						HttpStatus.BAD_REQUEST);

			logUtill.inputLog(httpServletRequest, chiraghUtil.getSessionUser(httpServletRequest),
					"/api/property/updateProperty/FinancialDetails",
					mapper.writeValueAsString(chiraghPropertyFinancialsDTO),
					mapper.writeValueAsString("Property Financial Detail Updated Successfully"));

			return new ResponseEntity(chiraghUtil.getMessageObject("Property Financial Detail Updated Successfully"),
					HttpStatus.OK);

		} catch (Exception e) {
			return new ResponseEntity(chiraghUtil.getMessageObject("Internal Server Error!" + e.getMessage()),
					HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

	@RequestMapping(value = "/updateProperty/rentInfo", method = RequestMethod.PUT)
	public ResponseEntity updateRentDetails(@RequestBody ChiraghPropertyRentDetailsDTO chiraghPropertyRentDetailsDTO,
			HttpServletRequest httpServletRequest) {
		try {

			ObjectMapper mapper = new ObjectMapper();
			Chiraghproperty chiraghproperty = chiraghPropertyService
					.updatePropertyRentDetails(chiraghPropertyRentDetailsDTO, httpServletRequest);
			Chiraghproperty newChiraghproperty = propertyRepository.save(chiraghproperty);
			if (newChiraghproperty == null)
				return new ResponseEntity(chiraghUtil.getMessageObject("Property Rental Info Not Updated!"),
						HttpStatus.BAD_REQUEST);

			logUtill.inputLog(httpServletRequest, chiraghUtil.getSessionUser(httpServletRequest),
					"/api/property/updateProperty/FinancialDetails",
					mapper.writeValueAsString(chiraghPropertyRentDetailsDTO),
					mapper.writeValueAsString("Property Rental Info Updated Successfully"));

			return new ResponseEntity(chiraghUtil.getMessageObject("Property Rental Info Updated Successfully"),
					HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity(chiraghUtil.getMessageObject("Internal Server Error!" + e.getMessage()),
					HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}// end of class controller
