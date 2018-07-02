package com.bestercapitalmedia.chiragh.property;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

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
import com.bestercapitalmedia.chiragh.property.auctionprocess.Propertyauctionprocess;
import com.bestercapitalmedia.chiragh.property.type.Propertytype;
import com.bestercapitalmedia.chiragh.property.type.PropertytypeRepository;
import com.bestercapitalmedia.chiragh.user.Chiraghuser;
import com.bestercapitalmedia.chiragh.user.UserController;
import com.bestercapitalmedia.chiragh.user.UserRepository;
import com.bestercapitalmedia.chiragh.utill.ChiragUtill;
import com.bestercapitalmedia.chiragh.utill.LogUtill;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

// TODO: Auto-generated Javadoc
/**
 * The Class PropertyController.
 */
@RestController
@RequestMapping("/api/property/")
@SuppressWarnings({ "unchecked", "rawtypes" })
public class PropertyController {

	/** The Constant log. */
	private static final Logger log = LoggerFactory.getLogger(PropertyController.class);

	/** The chiragh util. */
	@Autowired
	ChiragUtill chiraghUtil;

	/** The user repository. */
	@Autowired
	UserRepository userRepository;

	/** The property type repository. */
	@Autowired
	PropertytypeRepository propertyTypeRepository;

	/** The property repository. */
	@Autowired
	private PropertyRepository propertyRepository;

	/** The chiragh property service. */
	@Autowired
	private ChiraghPropertyService chiraghPropertyService;

	/** The log utill. */
	@Autowired
	private LogUtill logUtill;

	/**
	 * Gets the complete properties.
	 *
	 * @param propertyId
	 *            the property id
	 * @param userName
	 *            the user name
	 * @return the complete properties
	 */
	@RequestMapping(value = "/getPropertyById/{propertyId}/{userName}", method = RequestMethod.GET)
	public ResponseEntity getCompleteProperties(@PathVariable(value = "propertyId") int propertyId,
			@PathVariable(value = "userName") String userName) {
		if (userName.equals("") || userName == null) {
			return new ResponseEntity(chiraghUtil.getMessageObject("Invalid Session"), HttpStatus.OK);
		}
		Chiraghproperty chiraghproperty = propertyRepository.findByPropertyId(propertyId);
		// List<Chiraghproperty> propertiesList =
		// chiraghPropertyService.getCompleteProperties();
		if (chiraghproperty != null) {
			return new ResponseEntity(chiraghproperty, HttpStatus.OK);
		} else {
			return new ResponseEntity(chiraghUtil.getMessageObject("Property Not Found!"), HttpStatus.OK);
		}
	}// end of method

	/**
	 * Gets the complete properties.
	 *
	 * @param userName
	 *            the user name
	 * @return the complete properties
	 */
	@RequestMapping(value = "/getCompleteProperties/{userName}", method = RequestMethod.GET)
	public ResponseEntity getCompleteProperties(@PathVariable(value = "userName") String userName) {
		if (userName.equals("") || userName == null) {
			return new ResponseEntity(chiraghUtil.getMessageObject("Invalid Session"), HttpStatus.OK);
		}
		List<Chiraghproperty> propertiesList = chiraghPropertyService.getCompleteProperties();
		if (propertiesList != null) {
			return new ResponseEntity(propertiesList, HttpStatus.OK);
		} else {
			return new ResponseEntity(chiraghUtil.getMessageObject("Property Not Found!"), HttpStatus.OK);
		}
	}// end of method

	/**
	 * Gets the admin seller home.
	 *
	 * @param userName
	 *            the user name
	 * @return the admin seller home
	 */
	@RequestMapping(value = "/getAdminSellerHomeData/{userName}", method = RequestMethod.GET)
	public ResponseEntity getAdminSellerHome(@PathVariable(value = "userName") String userName) {
		if (userName.equals("") || userName == null) {
			return new ResponseEntity(chiraghUtil.getMessageObject("Invalid Session"), HttpStatus.OK);
		}
		ModelMapper mapper = new ModelMapper();
		List<AdminSellerHomeDTO> adminSelelrHomeDtoList = new ArrayList<AdminSellerHomeDTO>();
		List<Chiraghproperty> propertiesList = null;
		propertiesList = chiraghPropertyService.getCompleteProperties();
		propertiesList.stream().map(s -> adminSelelrHomeDtoList.add(mapper.map(s, AdminSellerHomeDTO.class)))
				.collect(Collectors.toList());

		if (propertiesList != null) {
			return new ResponseEntity(adminSelelrHomeDtoList, HttpStatus.OK);
		} else {
			return new ResponseEntity(chiraghUtil.getMessageObject("Property Not Found!"), HttpStatus.OK);
		}
	}// end of method

	/**
	 * Gets the property list by user id.
	 *
	 * @param userName
	 *            the user name
	 * @param httpServletRequest
	 *            the http servlet request
	 * @return the property list by user id
	 */
	@RequestMapping(value = "/getAll/{userName}", method = RequestMethod.GET)
	public ResponseEntity getPropertyListByUserId(@PathVariable(value = "userName") String userName,
			HttpServletRequest httpServletRequest) {
		try {

			ObjectMapper objectMapper = new ObjectMapper();
			ModelMapper mapper = new ModelMapper();

			Chiraghuser user = userRepository.findByUserName(userName);
			List<Chiraghproperty> chiraghproperty = propertyRepository.findPropertyByUserId(user.getUserId());
			if (chiraghproperty == null)
				return new ResponseEntity(chiraghUtil.getMessageObject("Property Not Found!"), HttpStatus.OK);
			// List<ChiraghPropertyDetailsDTO> list = chiraghproperty.stream()
			// .map(object -> mapper.map(object,
			// ChiraghPropertyDetailsDTO.class)).collect(Collectors.toList());

			// try {
			// logUtill.inputLog(httpServletRequest,
			// chiraghUtil.getSessionUser(httpServletRequest),
			// "/api/property/getAll/{userId}", objectMapper.writeValueAsString(userId),
			// objectMapper.writeValueAsString(list));
			// } catch (Exception e) {
			// return new ResponseEntity(chiraghUtil.getMessageObject("Log Generation
			// Fail!"), HttpStatus.OK);
			// }
			return new ResponseEntity(chiraghproperty, HttpStatus.OK);

		} catch (Exception e) {
			return new ResponseEntity(chiraghUtil.getMessageObject("Internal Server Error!" + e.getMessage()),
					HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

	/**
	 * Gets the property details by id.
	 *
	 * @param propertyId
	 *            the property id
	 * @param userName
	 *            the user name
	 * @param httpServletRequest
	 *            the http servlet request
	 * @return the property details by id
	 */
	@RequestMapping(value = "/getPropertyDetails/{propertyId}/{userName}", method = RequestMethod.GET)
	public ResponseEntity getPropertyDetailsById(@PathVariable(value = "propertyId") int propertyId,
			@PathVariable(value = "userName") String userName, HttpServletRequest httpServletRequest) {
		try {

			if (userName.equals("") || userName == null) {
				return new ResponseEntity(chiraghUtil.getMessageObject("Invalid Session"), HttpStatus.OK);
			}
			ModelMapper mapper = new ModelMapper();
			ObjectMapper objectMapper = new ObjectMapper();
			Chiraghproperty chiraghproperty = propertyRepository.findByPropertyId(propertyId);
			ChiraghPropertyDetailsDTO chiraghPropertyDetailsDTO = mapper.map(chiraghproperty,
					ChiraghPropertyDetailsDTO.class);
			try {
				logUtill.inputLog(httpServletRequest, userRepository.findByUserName(userName),
						"/api/property/getPropertyDetails/{propertyId}", objectMapper.writeValueAsString(propertyId),
						objectMapper.writeValueAsString(chiraghPropertyDetailsDTO));
			} catch (Exception e) {
				return new ResponseEntity(chiraghUtil.getMessageObject("Log Generation Fail!"), HttpStatus.OK);
			}

			return new ResponseEntity(chiraghPropertyDetailsDTO, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity(chiraghUtil.getMessageObject("Internal Server Error!" + e.getMessage()),
					HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

	/**
	 * Gets the property financial details by id.
	 *
	 * @param propertyId
	 *            the property id
	 * @param userName
	 *            the user name
	 * @param httpServletRequest
	 *            the http servlet request
	 * @return the property financial details by id
	 */
	@RequestMapping(value = "/getPropertyFinancialDetails/{propertyId}/{userName}", method = RequestMethod.GET)
	public ResponseEntity getPropertyFinancialDetailsById(@PathVariable(value = "propertyId") int propertyId,
			@PathVariable(value = "userName") String userName, HttpServletRequest httpServletRequest) {
		try {

			if (userName.equals("") || userName == null) {
				return new ResponseEntity(chiraghUtil.getMessageObject("Invalid Session"), HttpStatus.OK);
			}

			ModelMapper mapper = new ModelMapper();
			ObjectMapper objectMapper = new ObjectMapper();
			Chiraghproperty chiraghproperty = propertyRepository.findByPropertyId(propertyId);
			ChiraghPropertyFinancialsDTO chiraghPropertyDetailsDTO = mapper.map(chiraghproperty,
					ChiraghPropertyFinancialsDTO.class);
			try {
				logUtill.inputLog(httpServletRequest, userRepository.findByUserName(userName),
						"/api/property/getPropertyDetails/{propertyId}", objectMapper.writeValueAsString(propertyId),
						objectMapper.writeValueAsString(chiraghPropertyDetailsDTO));
			} catch (Exception e) {
				return new ResponseEntity(chiraghUtil.getMessageObject("Log Generation Fail!" + e.getMessage()),
						HttpStatus.OK);
			}

			return new ResponseEntity(chiraghPropertyDetailsDTO, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity(chiraghUtil.getMessageObject("Internal Server Error!" + e.getMessage()),
					HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

	/**
	 * Gets the property rental details by id.
	 *
	 * @param propertyId
	 *            the property id
	 * @param userName
	 *            the user name
	 * @param httpServletRequest
	 *            the http servlet request
	 * @return the property rental details by id
	 */
	@RequestMapping(value = "/getPropertyRentalDetails/{propertyId}/{userName}", method = RequestMethod.GET)
	public ResponseEntity getPropertyRentalDetailsById(@PathVariable(value = "propertyId") int propertyId,
			@PathVariable(value = "userName") String userName, HttpServletRequest httpServletRequest) {
		try {

			if (userName.equals("") || userName == null) {
				return new ResponseEntity(chiraghUtil.getMessageObject("Invalid Session"), HttpStatus.OK);
			}

			ModelMapper mapper = new ModelMapper();
			ObjectMapper objectMapper = new ObjectMapper();
			Chiraghproperty chiraghproperty = propertyRepository.findByPropertyId(propertyId);
			ChiraghPropertyRentDetailsDTO chiraghPropertyDetailsDTO = mapper.map(chiraghproperty,
					ChiraghPropertyRentDetailsDTO.class);

			try {
				logUtill.inputLog(httpServletRequest, userRepository.findByUserName(userName),
						"/api/property/getPropertyDetails/{propertyId}", objectMapper.writeValueAsString(propertyId),
						objectMapper.writeValueAsString(chiraghPropertyDetailsDTO));
			} catch (Exception e) {
				return new ResponseEntity(chiraghUtil.getMessageObject("Log Generation Fail!"), HttpStatus.OK);
			}

			return new ResponseEntity(chiraghPropertyDetailsDTO, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity(chiraghUtil.getMessageObject("Internal Server Error!" + e.getMessage()),
					HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

	/**
	 * Update.
	 *
	 * @param chiraghPropertyDetailsDTO
	 *            the chiragh property details DTO
	 * @param httpServletRequest
	 *            the http servlet request
	 * @return the response entity
	 */
	@RequestMapping(value = "/updateProperty/Details", method = RequestMethod.PUT)
	public @ResponseBody ResponseEntity update(@RequestBody ChiraghPropertyDetailsDTO chiraghPropertyDetailsDTO,
			HttpServletRequest httpServletRequest) {
		try {
			String userName = chiraghPropertyDetailsDTO.getUserName();
			if (userName.equals("") || userName == null) {
				return new ResponseEntity(chiraghUtil.getMessageObject("Invalid Session"), HttpStatus.OK);
			}

			ModelMapper modelMapper = new ModelMapper();
			ObjectMapper mapper = new ObjectMapper();
			Chiraghproperty chiraghProperty = chiraghPropertyService.updatePropertyDetails(chiraghPropertyDetailsDTO,
					httpServletRequest);
			if (chiraghProperty == null)
				return new ResponseEntity(chiraghUtil.getMessageObject("Property Updates Ended with Error!"),
						HttpStatus.OK);
			ChiraghPropertyDetailsDTO chiraghPropertyDetailsDTO2 = modelMapper.map(chiraghProperty,
					ChiraghPropertyDetailsDTO.class);
			if (chiraghPropertyDetailsDTO2 == null)
				return new ResponseEntity(chiraghUtil.getMessageObject("Mapping Fail during property updates!!"),
						HttpStatus.OK);

			logUtill.inputLog(httpServletRequest,
					userRepository.findByUserName(chiraghPropertyDetailsDTO.getUserName()),
					"/api/property/updateProperty/Details", mapper.writeValueAsString(chiraghPropertyDetailsDTO),
					mapper.writeValueAsString(chiraghPropertyDetailsDTO2));
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity(chiraghUtil.getMessageObject("Internal Server Error!" + e.getMessage()),
					HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity(chiraghUtil.getMessageObject("Property Details Update Successfully"), HttpStatus.OK);

	}

	/**
	 * Update financials.
	 *
	 * @param chiraghPropertyFinancialsDTO
	 *            the chiragh property financials DTO
	 * @param httpServletRequest
	 *            the http servlet request
	 * @return the response entity
	 */
	@RequestMapping(value = "/updateProperty/FinancialDetails", method = RequestMethod.PUT)
	public @ResponseBody ResponseEntity updateFinancials(
			@RequestBody ChiraghPropertyFinancialsDTO chiraghPropertyFinancialsDTO,
			HttpServletRequest httpServletRequest) {
		try {

			String userName = chiraghPropertyFinancialsDTO.getUserName();
			System.out.println(userName);
			if (userName.equals("") || userName == null) {
				return new ResponseEntity(chiraghUtil.getMessageObject("Invalid Session"), HttpStatus.OK);
			}
			ObjectMapper mapper = new ObjectMapper();
			Chiraghproperty chiraghproperty = chiraghPropertyService
					.updatePropertyFinancialDetails(chiraghPropertyFinancialsDTO, httpServletRequest);
			if (chiraghproperty == null)
				return new ResponseEntity(chiraghUtil.getMessageObject("Property Financial Details Not Updated!"),
						HttpStatus.OK);

			logUtill.inputLog(httpServletRequest,
					userRepository.findByUserName(chiraghPropertyFinancialsDTO.getUserName()),
					"/api/property/updateProperty/FinancialDetails",
					mapper.writeValueAsString(chiraghPropertyFinancialsDTO),
					mapper.writeValueAsString("Property Financial Detail Updated Successfully"));

			return new ResponseEntity(chiraghUtil.getMessageObject("Property Financial Detail Updated Successfully"),
					HttpStatus.OK);

		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity(chiraghUtil.getMessageObject("Internal Server Error!" + e.getMessage()),
					HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

	/**
	 * Update rent details.
	 *
	 * @param chiraghPropertyRentDetailsDTO
	 *            the chiragh property rent details DTO
	 * @param httpServletRequest
	 *            the http servlet request
	 * @return the response entity
	 */
	@RequestMapping(value = "/updateProperty/rentInfo", method = RequestMethod.PUT)
	public ResponseEntity updateRentDetails(@RequestBody ChiraghPropertyRentDetailsDTO chiraghPropertyRentDetailsDTO,
			HttpServletRequest httpServletRequest) {
		try {

			String userName = chiraghPropertyRentDetailsDTO.getUserName();
			if (userName.equals("") || userName == null) {
				return new ResponseEntity(chiraghUtil.getMessageObject("Invalid Session"), HttpStatus.OK);
			}
			ObjectMapper mapper = new ObjectMapper();
			Chiraghproperty chiraghproperty = chiraghPropertyService
					.updatePropertyRentDetails(chiraghPropertyRentDetailsDTO, httpServletRequest);
			if (chiraghproperty == null)
				return new ResponseEntity(chiraghUtil.getMessageObject("Property Rental Info Not Updated!"),
						HttpStatus.OK);

			logUtill.inputLog(httpServletRequest,
					userRepository.findByUserName(chiraghPropertyRentDetailsDTO.getUserName()),
					"/api/property/updateProperty/rentInfo", mapper.writeValueAsString(chiraghPropertyRentDetailsDTO),
					mapper.writeValueAsString("Property Rental Info Updated Successfully"));

			return new ResponseEntity(chiraghUtil.getMessageObject("Property Rental Info Updated Successfully"),
					HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity(chiraghUtil.getMessageObject("Internal Server Error!" + e.getMessage()),
					HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}// end of class controller
