package com.bestercapitalmedia.chiragh.seller.details;

import javax.servlet.http.HttpServletRequest;

import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.multipart.MultipartFile;

import com.bestercapitalmedia.chiragh.property.Chiraghproperty;
import com.bestercapitalmedia.chiragh.property.PropertyRepository;
import com.bestercapitalmedia.chiragh.property.type.Propertytype;
import com.bestercapitalmedia.chiragh.property.type.PropertytypeRepository;
import com.bestercapitalmedia.chiragh.user.Chiraghuser;
import com.bestercapitalmedia.chiragh.user.UserRepository;
import com.bestercapitalmedia.chiragh.utill.ChiragUtill;
import com.bestercapitalmedia.chiragh.utill.LogUtill;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@CrossOrigin
@RequestMapping("/api/Propertysellerdetails")
public class PropertySellerDetailsController {
	private static final Logger log = LoggerFactory.getLogger(PropertySellerDetailsController.class);

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
			HttpServletRequest httpServletRequest)  {
		ObjectMapper mapper = new ObjectMapper();
		if (chiraghUtil.isValidSession(httpServletRequest) == false)
			return new ResponseEntity(chiraghUtil.getMessageObject("Invalid Session!"), HttpStatus.BAD_REQUEST);
		if (!propertySellerDetailsService.validateMultipartFiles(idCard, passport, scannedNotorizedPoa,
				propertySellerDetailDTO.getOwnerType()))
			return new ResponseEntity(chiraghUtil.getMessageObject("Invalid Multipart File"), HttpStatus.BAD_REQUEST);

		PropertySellerDetailDTO newPropertySellerDetailDTO = propertySellerDetailsService
				.savePropertySellerDetails(httpServletRequest, propertySellerDetailDTO, idCard, passport,scannedNotorizedPoa);

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

}
