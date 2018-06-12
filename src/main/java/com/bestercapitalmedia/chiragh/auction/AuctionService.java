package com.bestercapitalmedia.chiragh.auction;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bestercapitalmedia.chiragh.property.Chiraghproperty;
import com.bestercapitalmedia.chiragh.property.PropertyRepository;
import com.bestercapitalmedia.chiragh.seller.details.PropertySellerDetailsService;

@Service
public class AuctionService {

	@Autowired
	private PropertySellerDetailsService propertySellerDetailsService;

	@Autowired
	private PropertyRepository propertyRepository;
	@Autowired
	private AuctionRepository auctionRepository;

	public Auction saveAuction(ChiraghPropertyAuctionDetailsDTO chiraghPropertyAuctionDetailsDTO,
			HttpServletRequest httpServletRequest) {
		try {
			
//			Calendar c=chiraghPropertyAuctionDetailsDTO.getAuctionStartDate();
//			c.add(Calendar.DATE, Integer.parseInt(chiraghPropertyAuctionDetailsDTO.getAuctionDuration()));
			ModelMapper mapper = new ModelMapper();
			int propertyId = chiraghPropertyAuctionDetailsDTO.getPropertyId();
			Chiraghproperty chiraghproperty = propertyRepository.findByPropertyId(propertyId);
			Auction auction = mapper.map(chiraghPropertyAuctionDetailsDTO, Auction.class);
//			System.out.println(c.getTime());
//			auction.setAuctionEndDate(c);
			auction.setChiraghproperty(chiraghproperty);
			return auctionRepository.save(auction);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}
