package com.bestercapitalmedia.chiragh.auction;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.json.JSONObject;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bestercapitalmedia.chiragh.property.Chiraghproperty;
import com.bestercapitalmedia.chiragh.property.PropertyRepository;
import com.bestercapitalmedia.chiragh.user.Chiraghuser;
import com.bestercapitalmedia.chiragh.user.UserController;
import com.bestercapitalmedia.chiragh.utill.ChiragUtill;
import com.bestercapitalmedia.chiragh.utill.LogUtill;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@CrossOrigin
@RequestMapping("/api/auction")
public class AuctionController {
	private static final Logger log = LoggerFactory.getLogger(AuctionController.class);
	@Autowired
	private AuctionRepository auctionRepository;
	@Autowired
	private PropertyRepository propertyRepository;
	@Autowired
	private AuctionService auctionService;
	@Autowired
	private ChiragUtill chiraghUtill;
	@Autowired
	private LogUtill logUtill;

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

	@RequestMapping(value = "/saveAuction", method = RequestMethod.POST)
	public @ResponseBody ResponseEntity create(
			@RequestBody ChiraghPropertyAuctionDetailsDTO chiraghPropertyAuctionDetailsDTO,
			HttpServletRequest httpServletRequest) {
		ObjectMapper mapper = new ObjectMapper();
		try {
			
			Auction auction = auctionService.saveAuction(chiraghPropertyAuctionDetailsDTO, httpServletRequest);
			if (auction == null) {
				httpServletRequest.getSession(false).setAttribute("propertyId", 0);
				return new ResponseEntity(chiraghUtill.getMessageObject("Property Auctioning Fail with an error!!"),
						HttpStatus.BAD_REQUEST);
				
			}
			httpServletRequest.getSession(false).setAttribute("propertyId", 0);
			logUtill.inputLog(httpServletRequest, chiraghUtill.getSessionUser(httpServletRequest),
					"/api/auction/saveAuction", mapper.writeValueAsString(chiraghPropertyAuctionDetailsDTO),
					mapper.writeValueAsString("Property added for auctioning"));
			
		} catch (Exception e) {
			httpServletRequest.getSession(false).setAttribute("propertyId", 0);
			return new ResponseEntity(chiraghUtill.getMessageObject("Internal Server Error!" + e.getMessage()),
					HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity(chiraghUtill.getMessageObject("roperty added for auctioning"), HttpStatus.OK);
		
	}// end of create

}// end of controller
