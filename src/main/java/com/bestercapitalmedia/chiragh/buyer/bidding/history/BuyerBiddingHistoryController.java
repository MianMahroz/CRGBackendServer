package com.bestercapitalmedia.chiragh.buyer.bidding.history;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bestercapitalmedia.chiragh.buyer.details.PropertyOwnerDetailsDTO;
import com.bestercapitalmedia.chiragh.property.Chiraghproperty;
import com.bestercapitalmedia.chiragh.property.PropertyController;
import com.bestercapitalmedia.chiragh.property.PropertyRepository;
import com.bestercapitalmedia.chiragh.property.type.Propertytype;
import com.bestercapitalmedia.chiragh.user.Chiraghuser;
import com.bestercapitalmedia.chiragh.user.UserRepository;
import com.bestercapitalmedia.chiragh.utill.LogUtill;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

// TODO: Auto-generated Javadoc
/**
 * The Class BuyerBiddingHistoryController.
 */
@RestController
@CrossOrigin
@RequestMapping("/api/buyerbiddinghistory")
public class BuyerBiddingHistoryController {

	/** The user repository. */
	@Autowired
	UserRepository userRepository;
	
	/** The property repository. */
	@Autowired
	private PropertyRepository propertyRepository;
	
	/** The buyerbiddinghistoryrepository. */
	@Autowired
	private BuyerBiddingHistoryRepository buyerbiddinghistoryrepository;
	
	/** The buyerbiddinghistoryservice. */
	@Autowired
	private BuyerBiddingHistoryService buyerbiddinghistoryservice;
	
	/** The log utill. */
	@Autowired
	private LogUtill logUtill;

	/** The Constant log. */
	private static final Logger log = LoggerFactory.getLogger(PropertyController.class);

	/**
	 * Ownerlist.
	 *
	 * @return the list
	 */
	@RequestMapping(value = "/getAll", method = RequestMethod.GET)
	public @ResponseBody List<BuyerBiddingHistoryDTO> ownerlist() {
		return buyerbiddinghistoryservice.getBuyerBiddingHistoryDTOList();
	}// end of list method

	/**
	 * Creates the.
	 *
	 * @param data the data
	 * @param httpServletRequest the http servlet request
	 * @return the buyer bidding history DTO
	 */
	@RequestMapping(value = "/post", method = RequestMethod.POST)
	public @ResponseBody BuyerBiddingHistoryDTO create(@Valid @RequestBody BuyerBiddingHistoryDTO data,
			HttpServletRequest httpServletRequest) {
		ObjectMapper mapper = new ObjectMapper();
		ModelMapper modelMapper = new ModelMapper();
		BuyerBiddingHistory buyerbiddinghistory = buyerbiddinghistoryservice.save(data);

		BuyerBiddingHistoryDTO biddingHistoryDTO=modelMapper.map(buyerbiddinghistory, BuyerBiddingHistoryDTO.class);
		
		try {
			logUtill.inputLog(httpServletRequest,
					userRepository.findByUserId(buyerbiddinghistory.getChiraghuser().getUserId()),
					"/api/buyerdetails/ownerdetails", mapper.writeValueAsString(data), mapper.writeValueAsString(biddingHistoryDTO));
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return biddingHistoryDTO ;
	}

}
