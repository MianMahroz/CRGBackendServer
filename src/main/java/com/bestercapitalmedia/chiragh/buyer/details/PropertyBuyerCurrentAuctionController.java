package com.bestercapitalmedia.chiragh.buyer.details;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bestercapitalmedia.chiragh.property.PropertyController;
import com.bestercapitalmedia.chiragh.property.PropertyRepository;
import com.bestercapitalmedia.chiragh.property.bidprocess.PropertybidprocessRepository;
import com.bestercapitalmedia.chiragh.utill.ChiragUtill;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;


@RestController
@RequestMapping("/api/buyerlisting/")
public class PropertyBuyerCurrentAuctionController {
	
	private static final Logger log = LoggerFactory.getLogger(PropertyController.class);

	@Autowired
	ChiragUtill chiraghUtil;
	@Autowired
	PropertyRepository propertyRepository;
	@Autowired
	PropertybidprocessRepository propertybidprocessRepository;
	
	@RequestMapping(value = "/getAll", method = RequestMethod.GET)
	public Iterable<PropertyBuyerCurrentAuctionDTO> list() {
		Iterable<PropertyBuyerCurrentAuctionDTO> buyerListing = propertyRepository.findBuyerPropertylisting();
        buyerListing.forEach(p->p.setTotalBidPlaced(propertybidprocessRepository.findTotalBidPlaced(p.getPropertyId())));
        
			return buyerListing;
	}// end of list method
}
