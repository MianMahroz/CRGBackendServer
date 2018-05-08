package com.bestercapitalmedia.chiragh.seller.details;

import java.util.List;
import java.util.stream.Collectors;

import javax.servlet.http.HttpServletRequest;

import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.bestercapitalmedia.chiragh.property.Chiraghproperty;
import com.bestercapitalmedia.chiragh.property.PropertyRepository;
import com.bestercapitalmedia.chiragh.property.type.PropertytypeRepository;
import com.bestercapitalmedia.chiragh.user.UserRepository;
import com.bestercapitalmedia.chiragh.utill.ChiragUtill;
import com.bestercapitalmedia.chiragh.utill.LogUtill;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@CrossOrigin
@SuppressWarnings({ "unchecked", "rawtypes" })
@RequestMapping("/api/Propertysellerdetails")
public class PropertySellerDetailsController {

	@Autowired
	private PropertySellerDetailsRepository propertySellerDetailsRepository;
	@Autowired
	private PropertyRepository propertyRepository;
	@Autowired
	private PropertytypeRepository propertyTypeRepository;
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private PropertySellerDetailsService propertySellerDetailsService;
	private Chiraghproperty newProperty;
	@Autowired
	private LogUtill logUtill;
	@Autowired
	private ChiragUtill chiraghUtil;

	@RequestMapping(value = "/post")
	public ResponseEntity create(@RequestBody PropertySellerDetailDTO propertySellerDetailDTO,
			@RequestParam("passport") MultipartFile passport, @RequestParam("idCard") MultipartFile idCard,
			@RequestParam("scannedNotorizedPoa") MultipartFile scannedNotorizedPoa,
			HttpServletRequest httpServletRequest) {
		ObjectMapper mapper = new ObjectMapper();
		if (chiraghUtil.isValidSession(httpServletRequest) == false)
			return new ResponseEntity(chiraghUtil.getMessageObject("Invalid Session!"), HttpStatus.BAD_REQUEST);
		if (!propertySellerDetailsService.validateMultipartFiles(idCard, passport, scannedNotorizedPoa,
				propertySellerDetailDTO.getOwnerType()))
			return new ResponseEntity(chiraghUtil.getMessageObject("Invalid Multipart File"), HttpStatus.BAD_REQUEST);

		PropertySellerDetailDTO newPropertySellerDetailDTO = propertySellerDetailsService.savePropertySellerDetails(
				httpServletRequest, propertySellerDetailDTO, idCard, passport, scannedNotorizedPoa);

		if (newPropertySellerDetailDTO == null)
			return new ResponseEntity(chiraghUtil.getMessageObject("Seller Not Saved!"), HttpStatus.BAD_REQUEST);
		try {
			logUtill.inputLog(httpServletRequest, chiraghUtil.getSessionUser(httpServletRequest),
					"/api/user/get/{userName}", mapper.writeValueAsString(propertySellerDetailDTO),
					mapper.writeValueAsString(newPropertySellerDetailDTO));
		} catch (Exception e) {
			return new ResponseEntity(chiraghUtil.getMessageObject("Log Generation Fail!"), HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity(chiraghUtil.getMessageObject("Seller Saved Successfully"), HttpStatus.OK);
	}

	@RequestMapping(value = "/getOwnerDetails/{property_Id}", method = RequestMethod.GET)
	public ResponseEntity getOwnerDetailsById(@PathVariable(value = "property_Id") int property_Id,
			HttpServletRequest httpServletRequest) {
		try {

			if (chiraghUtil.isValidSession(httpServletRequest) == false)
				return new ResponseEntity(chiraghUtil.getMessageObject("Invalid Session!"), HttpStatus.BAD_REQUEST);

			ModelMapper mapper = new ModelMapper();
			ObjectMapper objectMapper = new ObjectMapper();
			List<Propertysellerdetails> propertysellerdetails = propertySellerDetailsRepository
					.findByOwnerByPropertyId(property_Id);
			List<PropertySellerDetailDTO> propertySellerDetailDTO = propertysellerdetails.stream()
					.map(object -> mapper.map(object, PropertySellerDetailDTO.class)).collect(Collectors.toList());

			try {
				logUtill.inputLog(httpServletRequest, chiraghUtil.getSessionUser(httpServletRequest),
						"/api/property/getOwnerDetails/{property_Id}",
						objectMapper.writeValueAsString(property_Id),
						objectMapper.writeValueAsString(propertySellerDetailDTO));
			} catch (Exception e) {
				return new ResponseEntity(chiraghUtil.getMessageObject("Log Generation Fail!"), HttpStatus.BAD_REQUEST);
			}

			return new ResponseEntity(propertySellerDetailDTO, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity(chiraghUtil.getMessageObject("Internal Server Error!" + e.getMessage()),
					HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

	@RequestMapping(value = "/getPoaDetails/{property_Id}", method = RequestMethod.GET)
	public ResponseEntity getPoaDetailsById(@PathVariable(value = "property_Id") int property_Id,
			HttpServletRequest httpServletRequest) {
		try {

			if (chiraghUtil.isValidSession(httpServletRequest) == false)
				return new ResponseEntity(chiraghUtil.getMessageObject("Invalid Session!"), HttpStatus.BAD_REQUEST);

			ModelMapper mapper = new ModelMapper();
			ObjectMapper objectMapper = new ObjectMapper();
			List<Propertysellerdetails> propertysellerdetails = propertySellerDetailsRepository
					.findByPoaByPropertyId(property_Id);
			List<PropertySellerDetailDTO> propertySellerDetailDTO = propertysellerdetails.stream()
					.map(object -> mapper.map(object, PropertySellerDetailDTO.class)).collect(Collectors.toList());

			try {
				logUtill.inputLog(httpServletRequest, chiraghUtil.getSessionUser(httpServletRequest),
						"/api/property/getPoaDetails/{Property_Seller_Id}",
						objectMapper.writeValueAsString(property_Id),
						objectMapper.writeValueAsString(propertySellerDetailDTO));
			} catch (Exception e) {
				return new ResponseEntity(chiraghUtil.getMessageObject("Log Generation Fail!"), HttpStatus.BAD_REQUEST);
			}

			return new ResponseEntity(propertySellerDetailDTO, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity(chiraghUtil.getMessageObject("Internal Server Error!" + e.getMessage()),
					HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

}
