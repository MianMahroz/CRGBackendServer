package com.bestercapitalmedia.chiragh.seller.details;

import javax.servlet.http.HttpServletRequest;

import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

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
	private ChiragUtill chiraghUtill;

	@RequestMapping(value = "/getAll", method = RequestMethod.GET)
	public String list() {
		log.info("GET: /api/Propertysellerdetails/getAll");
		ObjectMapper objectMapper = new ObjectMapper();
		Iterable<Propertysellerdetails> userList = propertySellerDetailsRepository.findAll();
		String rtnObject = "";
		try {
			rtnObject = objectMapper.writeValueAsString(userList);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}

		log.info("Output: " + rtnObject);
		log.info("--------------------------------------------------------");
		return rtnObject;
	}// end of list method

	@RequestMapping(value = "/post")
	public PropertySellerDetailDTO create(@RequestBody PropertySellerDetailDTO propertySellerDetailDTO,
			HttpServletRequest httpServletRequest) {
	
		if(chiraghUtill.isValidSession(httpServletRequest)==false)
			return null;
		
		PropertySellerDetailDTO newPropertySellerDetailDTO = propertySellerDetailsService
				.savePropertySellerDetails(httpServletRequest, propertySellerDetailDTO);
		try {
			ObjectMapper mapper = new ObjectMapper();
			logUtill.inputLog(httpServletRequest, chiraghUtill.getSessionUser(httpServletRequest),
					"/api/user/registerUser", mapper.writeValueAsString(propertySellerDetailDTO),
					mapper.writeValueAsString(newPropertySellerDetailDTO));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return newPropertySellerDetailDTO;
	}

}
