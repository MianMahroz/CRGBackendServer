package com.bestercapitalmedia.chiragh.property.auctionprocess;

import java.util.List;

import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bestercapitalmedia.chiragh.auction.AuctionController;
import com.bestercapitalmedia.chiragh.user.Chiraghuser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

// TODO: Auto-generated Javadoc
/**
 * The Class PropertyAuctionProcessController.
 */
@RestController
@CrossOrigin
@RequestMapping("/api/propertyactionprocess")
public class PropertyAuctionProcessController {
	
	/** The Constant log. */
	private static final Logger log = LoggerFactory.getLogger(PropertyAuctionProcessController.class);

	/** The property auction process repository. */
	@Autowired
	private PropertyAuctionProcessRepository propertyAuctionProcessRepository;

	/**
	 * List.
	 *
	 * @return the iterable
	 */
	@RequestMapping(value = "/getAll", method = RequestMethod.GET)
	public Iterable<Propertyauctionprocess>list() {
		log.info("GET: /api/propertyactionprocess/getAll");
		ObjectMapper objectMapper = new ObjectMapper();
		Iterable<Propertyauctionprocess> propertyauctionprocessList = propertyAuctionProcessRepository.findAll();
		
		return propertyauctionprocessList;
	}// end of list method

	/**
	 * Creates the.
	 *
	 * @param data the data
	 * @return the string
	 */
	@RequestMapping(value = "/post", method = RequestMethod.POST)
	public String create(@RequestBody String data) {
		log.info("Post: /api/Users/post");
		log.info("Input: " + data);

		ObjectMapper objectMapper = new ObjectMapper();
		String rtnObject = "";
		String msg = "";

		try {
			JSONObject jsonObject = new JSONObject(data);
			if (jsonObject.has("bidStartDate") && jsonObject.has("bidEndDate") && jsonObject.has("finalAmount")
					&& jsonObject.has("isActive") && jsonObject.has("propertyauctionprocesscol")
					&& jsonObject.has("auction") && jsonObject.has("bidStartDate")
					&& jsonObject.has("bidStartDate") && jsonObject.has("bidStartDate")
					&& jsonObject.has("bidStartDate"))
				;

		} catch (Exception ee) {
			msg = ee.getMessage();
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
	}// end of method

}// end of controller
