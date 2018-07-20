package com.bestercapitalmedia.chiragh.seller.dashboard;

import java.util.List;
import java.util.stream.Collectors;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bestercapitalmedia.chiragh.buyer.bidding.history.BuyerBiddingHistory;
import com.bestercapitalmedia.chiragh.buyer.details.PropertyBuyerCurrentAuctionDTO;
import com.bestercapitalmedia.chiragh.buyer.details.PropertyBuyerDetails;
import com.bestercapitalmedia.chiragh.buyer.details.PropertyBuyerDetailsController;
import com.bestercapitalmedia.chiragh.buyer.details.PropertyBuyerDetailsDTO;
import com.bestercapitalmedia.chiragh.buyer.details.PropertyBuyerDetailsRepository;
import com.bestercapitalmedia.chiragh.property.Chiraghproperty;
import com.bestercapitalmedia.chiragh.property.PropertyRepository;
import com.bestercapitalmedia.chiragh.property.bidfinalize.Propertybidfinalize;
import com.bestercapitalmedia.chiragh.seller.details.PropertySellerDetailDTO;
import com.bestercapitalmedia.chiragh.seller.details.Propertysellerdetails;
import com.bestercapitalmedia.chiragh.utill.ChiragUtill;
import com.bestercapitalmedia.chiragh.utill.LogUtill;
import com.fasterxml.jackson.databind.ObjectMapper;



// TODO: Auto-generated Javadoc
/**
 * The Class SellerDashBoardController.
 */
@RestController
//@CrossOrigin
@RequestMapping("/api/userdashboard")
public class SellerDashBoardController {
	
	/** The Constant log. */
	private static final Logger log = LoggerFactory.getLogger(SellerDashBoardController.class);
	
	/** The chiragh utill. */
	@Autowired
	private ChiragUtill chiraghUtill;
	
	/** The userdashboard service. */
	@Autowired
	private SellerDashBoardService userdashboardService;
	
	/** The log utill. */
	@Autowired
	private LogUtill logUtill;
	
	/** The userdashboard repository. */
	@Autowired
	private SellerDashBoardRepository userdashboardRepository;
	
	/** The property repository. */
	@Autowired
	private PropertyRepository propertyRepository;


	
	/**
	 * Creates the.
	 *
	 * @param sellerbuyerdto the sellerbuyerdto
	 * @param httpServletRequest the http servlet request
	 * @return the response entity
	 */
	@RequestMapping(value = "/post", method = RequestMethod.POST)
	public @ResponseBody ResponseEntity create(@Valid @RequestBody SellingBuyingHistoryDTO sellerbuyerdto,
			HttpServletRequest httpServletRequest) {
		try {

     		if (chiraghUtill.isValidSession(httpServletRequest) == false)
				return new ResponseEntity(chiraghUtill.getMessageObject("Invalid Session!"), HttpStatus.OK);

			ObjectMapper mapper = new ObjectMapper();
			SellingBuyingHistoryDTO sellerbuyerDTO =  userdashboardService.savehistory(sellerbuyerdto, httpServletRequest);
             
			if (sellerbuyerDTO  == null)
				return new ResponseEntity(chiraghUtill.getMessageObject("History Not Saved!"), HttpStatus.OK);
			try {
				logUtill.inputLog(httpServletRequest, chiraghUtill.getSessionUser(httpServletRequest),
						"api/userdashboard/post", mapper.writeValueAsString(sellerbuyerdto),
						mapper.writeValueAsString(sellerbuyerDTO));
			} catch (Exception e) {
				return new ResponseEntity(chiraghUtill.getMessageObject("Log not Generated"), HttpStatus.OK);
			}

			return new ResponseEntity("History Saved Successfully", HttpStatus.OK);

		} catch (Exception e) {
			return new ResponseEntity(chiraghUtill.getMessageObject("Internal Server Error!" + e.getMessage()),
					HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	
}
