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

// TODO: Auto-generated Javadoc
/**
 * The Class BuyerBiddingHistoryService.
 */
@Service
public class BuyerBiddingHistoryService {

	/** The user repository. */
	@Autowired
	UserRepository userRepository;
	
	/** The property repository. */
	@Autowired
	private PropertyRepository propertyRepository;
	
	/** The buyerbiddinghistoryrepository. */
	@Autowired
	private BuyerBiddingHistoryRepository buyerbiddinghistoryrepository;
	
	/** The chiraghutil. */
	@Autowired
	private  ChiragUtill chiraghutil;
	
	
	
	/**
	 * Gets the buyer bidding history DTO list.
	 *
	 * @return the buyer bidding history DTO list
	 */
	public List<BuyerBiddingHistoryDTO> getBuyerBiddingHistoryDTOList() {
		ModelMapper modelMapper = new ModelMapper();
		return buyerbiddinghistoryrepository.getAll().stream()
				.map(temp -> modelMapper.map(temp, BuyerBiddingHistoryDTO.class)).collect(Collectors.toList());
		
	}
	
	
	/**
	 * Save.
	 *
	 * @param buyerbidddinghistoryDTO the buyerbidddinghistory DTO
	 * @return the buyer bidding history
	 */
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
