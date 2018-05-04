package com.bestercapitalmedia.chiragh.buyer.bidding.history;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.bestercapitalmedia.chiragh.buyer.details.PropertyOwnerDetailsDTO;
import com.bestercapitalmedia.chiragh.property.Chiraghproperty;
import com.bestercapitalmedia.chiragh.property.PropertyRepository;
import com.bestercapitalmedia.chiragh.user.Chiraghuser;
import com.bestercapitalmedia.chiragh.user.UserRepository;
import com.bestercapitalmedia.chiragh.utill.ChiragUtill;

@Service
public class BuyerBiddingHistoryService {

	@Autowired
	UserRepository userRepository;
	@Autowired
	private PropertyRepository propertyRepository;
	@Autowired
	private BuyerBiddingHistoryRepository buyerbiddinghistoryrepository;
	@Autowired
	private  ChiragUtill chiraghutil;
	
	
	
	public List<BuyerBiddingHistoryDTO> getBuyerBiddingHistoryDTOList() {
		ModelMapper modelMapper = new ModelMapper();
		return buyerbiddinghistoryrepository.getAll().stream()
				.map(temp -> modelMapper.map(temp, BuyerBiddingHistoryDTO.class)).collect(Collectors.toList());
		
	}
	
	
	public BuyerBiddingHistory save(BuyerBiddingHistoryDTO buyerbidddinghistoryDTO) {
		
		ModelMapper mapper = new ModelMapper();

		BuyerBiddingHistory buyerbiddinghistory=new BuyerBiddingHistory();
		Chiraghuser chiraghuser = userRepository.findByUserId(buyerbidddinghistoryDTO.getUserId());
		buyerbiddinghistory.setChiraghuser(chiraghuser);
		Chiraghproperty chiraghproperty = propertyRepository.findByPropertyId(buyerbidddinghistoryDTO.getPropertyId());
		buyerbiddinghistory.setChiraghproperty(chiraghproperty);
		buyerbiddinghistory.setBidReferenceNo(chiraghutil.genearteRandomNo("BidReferenceNo"));
		
		BuyerBiddingHistory newbuyerbiddinghistory=buyerbiddinghistoryrepository.save(buyerbiddinghistory);
        
		return newbuyerbiddinghistory;
	
	
	}

}
