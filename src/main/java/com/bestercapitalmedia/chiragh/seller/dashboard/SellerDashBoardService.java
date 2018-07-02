package com.bestercapitalmedia.chiragh.seller.dashboard;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import javax.servlet.http.HttpServletRequest;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bestercapitalmedia.chiragh.buyer.bidding.history.BuyerBiddingHistory;
import com.bestercapitalmedia.chiragh.buyer.bidding.history.BuyerBiddingHistoryRepository;
import com.bestercapitalmedia.chiragh.buyer.details.PropertyBuyerDetails;
import com.bestercapitalmedia.chiragh.buyer.details.PropertyBuyerDetailsDTO;
import com.bestercapitalmedia.chiragh.buyer.details.PropertyBuyerDetailsRepository;
import com.bestercapitalmedia.chiragh.property.bidprocess.Propertybidprocess;
import com.bestercapitalmedia.chiragh.property.bidprocess.PropertybidprocessRepository;
import com.bestercapitalmedia.chiragh.seller.details.PropertySellerDetailsRepository;
import com.bestercapitalmedia.chiragh.seller.details.Propertysellerdetails;
import com.bestercapitalmedia.chiragh.user.Chiraghuser;



// TODO: Auto-generated Javadoc
/**
 * The Class SellerDashBoardService.
 */
@Service
public class SellerDashBoardService {
	
	/** The propertybidprocess repository. */
	@Autowired
	PropertybidprocessRepository propertybidprocessRepository;
	
	/** The buyerbiddinghistory repository. */
	@Autowired
	BuyerBiddingHistoryRepository buyerbiddinghistoryRepository;
	
	/** The propertybuyerdetails repository. */
	@Autowired
	PropertyBuyerDetailsRepository propertybuyerdetailsRepository;
	
	/** The propertysellerdetails repository. */
	@Autowired
	PropertySellerDetailsRepository propertysellerdetailsRepository;
	
	/** The userdashboard repository. */
	@Autowired
	SellerDashBoardRepository userdashboardRepository;
	
	/**
	 * Savehistory.
	 *
	 * @param sellerbuyerDTO the sellerbuyer DTO
	 * @param httpServletRequest the http servlet request
	 * @return the selling buying history DTO
	 */
	public SellingBuyingHistoryDTO savehistory(SellingBuyingHistoryDTO sellerbuyerDTO,
			HttpServletRequest httpServletRequest) {
		
//		try {
			ModelMapper modelmapper = new ModelMapper();
//			SellerDashBoard userdashboard = modelmapper.map(sellerbuyerDTO,
//					SellerDashBoard.class);
//			
//			int bidId = sellerbuyerDTO.getBidId();
//			Propertybidprocess  propertybidprocess = propertybidprocessRepository.findByBidId(bidId);
//			
//			int propertyId= propertybidprocess.getChiraghproperty().getPropertyId();
//			if(propertyId!=0) {
//			userdashboard.setPropertyId(propertyId);
//			}
//			int userId=propertybidprocess.getChiraghuser().getUserId();
//			
//			BuyerBiddingHistory buyerbiddinghistory = buyerbiddinghistoryRepository.findBuyerExisting(userId, propertyId);
//			int buyerbiddinghistoryId=buyerbiddinghistory.getBuyerBiddingHistoryId();
//			
//			List<PropertyBuyerDetails> propertybuyerdetails=propertybuyerdetailsRepository.findBuyerByHistoryId(buyerbiddinghistoryId);
//			String buyerIds=propertybuyerdetails.stream()
//			                     .map(s->s.getPropertyBuyerId())
//			                     .collect(Collectors.toList()).toString();
//			System.out.println("BuyerIds:"+buyerIds);
//			System.out.println("BuyeruserId:"+userId);
//			
//			userdashboard.setBuyerIds(buyerIds);
//			userdashboard.setBuyerUserIds(userId);
//			
//			List<Propertysellerdetails> propertysellerdetails=propertysellerdetailsRepository.findSellerByPropertyId(propertyId);
//			String sellerIds=propertysellerdetails.stream()
//					.map(s->s.getPropertySellerId()).collect(Collectors.toList()).toString();
//			
//			System.out.println("SellerId:"+sellerIds);
//			userdashboard.setSellerIds(sellerIds);
//			
//			List<Integer> i =propertysellerdetails
//			                     .stream()
//			                     .map(s->s.getChiraghuser().getUserId()).collect(Collectors.toList());
//			int currentSellerUserIds=i.get(0);
//
//			System.out.println("SellerUserId:"+currentSellerUserIds);
////			System.out.println("SellerUserId:"+sellerUserId);
//     		userdashboard.setSellerUserIds(currentSellerUserIds);
//			SellerDashBoard newuserdashboard = userdashboardRepository.save(userdashboard);
			
			return null;
			
		}

//		catch (Exception e) {
//			e.printStackTrace();
//		}
//		
//		return null;
//}
}