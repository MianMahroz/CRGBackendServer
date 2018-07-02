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

// TODO: Auto-generated Javadoc
/**
 * The Class AuctionController.
 */
@RestController
@CrossOrigin
@RequestMapping("/api/auction")
public class AuctionController {
	
	/** The Constant log. */
	private static final Logger log = LoggerFactory.getLogger(AuctionController.class);
	
	/** The auction repository. */
	@Autowired
	private AuctionRepository auctionRepository;
	
	/** The property repository. */
	@Autowired
	private PropertyRepository propertyRepository;
	
	/** The auction service. */
	@Autowired
	private AuctionService auctionService;
	
	/** The chiragh utill. */
	@Autowired
	private ChiragUtill chiraghUtill;
	
	/** The log utill. */
	@Autowired
	private LogUtill logUtill;

	/**
	 * List.
	 *
	 * @return the string
	 */
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

	/**
	 * Creates the.
	 *
	 * @param chiraghPropertyAuctionDetailsDTO the chiragh property auction details DTO
	 * @param httpServletRequest the http servlet request
	 * @return the response entity
	 */
	@RequestMapping(value = "/saveAuction", method = RequestMethod.POST)
	public @ResponseBody ResponseEntity create(
			@RequestBody ChiraghPropertyAuctionDetailsDTO chiraghPropertyAuctionDetailsDTO,
			HttpServletRequest httpServletRequest) {
		ObjectMapper mapper = new ObjectMapper();
		try {
			if(chiraghPropertyAuctionDetailsDTO.getUserName() == null||chiraghPropertyAuctionDetailsDTO.getUserName().equals("")) {

				return new ResponseEntity(chiraghUtill.getMessageObject("Invalid Session!"),
						HttpStatus.INTERNAL_SERVER_ERROR);
				}
			System.out.println(chiraghPropertyAuctionDetailsDTO.getAuctionStartDate());
			
			Auction auction = auctionService.saveAuction(chiraghPropertyAuctionDetailsDTO, httpServletRequest);
		if(auction==null) {
			return null;
		}
//			logUtill.inputLog(httpServletRequest, chiraghUtill.getSessionUser(httpServletRequest),
//					"/api/auction/saveAuction", mapper.writeValueAsString(chiraghPropertyAuctionDetailsDTO),
//					mapper.writeValueAsString("Property added for auctioning"));
//			
		} catch (Exception e) {
	
			return new ResponseEntity(chiraghUtill.getMessageObject("Internal Server Error!" + e.getMessage()),
					HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity(chiraghUtill.getMessageObject("Property added for auction"), HttpStatus.OK);
		
	}// end of create

}// end of controller
