package com.bestercapitalmedia.chiragh.auction;

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

import com.bestercapitalmedia.chiragh.user.Chiraghuser;
import com.bestercapitalmedia.chiragh.user.UserController;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@CrossOrigin
@RequestMapping("/api/auction")
public class AuctionController {
	private static final Logger log = LoggerFactory.getLogger(AuctionController.class);
	@Autowired
	private AuctionRepository auctionRepository;

	@RequestMapping(value = "/getAll", method = RequestMethod.GET)
	public String list() {
		log.info("GET: /api/auction/getAll");
		ObjectMapper objectMapper = new ObjectMapper();
		Iterable<Auction> auctionList = auctionRepository.findAll();
		String rtnObject = "";
		try {
			rtnObject = objectMapper.writeValueAsString(auctionList);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}

		log.info("Output: " + rtnObject);
		log.info("--------------------------------------------------------");
		return rtnObject;
	}// end of list method

	@RequestMapping(value = "/post", method = RequestMethod.POST)
	public String create(@RequestBody String data) {
		log.info("Post: /api/auction/post");
		log.info("Input: " + data);

		ObjectMapper objectMapper = new ObjectMapper();
		String rtnObject = "";
		String msg = "";

		try {
			JSONObject jsonObject = new JSONObject(data);
			if (jsonObject.has("auctionDuration") && jsonObject.has("auctionCost") && jsonObject.has("isPublished")
					&& jsonObject.has("securityDeposit")) {
				Auction auction = new Auction();
				auction.setAuctionDuration(jsonObject.getString("auctionDuration"));
				auction.setAuctionCost(jsonObject.getString("auctionCost"));
				auction.setIsPublished(jsonObject.getString("isPublished"));
				auction.setSecurityDeposit(jsonObject.getString("securityDeposit"));
				auctionRepository.save(auction);
				rtnObject = objectMapper.writeValueAsString(auction);
				msg = "success";
			} else {
				msg = "Invalid Object!";
			}

		} catch (Exception e) {
			msg = e.getMessage();
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
	}// end of create

}// end of controller
