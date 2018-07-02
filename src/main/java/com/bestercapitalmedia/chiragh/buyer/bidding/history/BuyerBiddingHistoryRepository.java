package com.bestercapitalmedia.chiragh.buyer.bidding.history;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.bestercapitalmedia.chiragh.buyer.details.PropertyBuyerDetails;
import com.bestercapitalmedia.chiragh.property.Chiraghproperty;

// TODO: Auto-generated Javadoc
/**
 * The Interface BuyerBiddingHistoryRepository.
 */
public interface BuyerBiddingHistoryRepository extends CrudRepository<BuyerBiddingHistory, Integer>{
	
	/**
	 * Find by user name.
	 *
	 * @param userName the user name
	 * @return the buyer bidding history
	 */
	@Query(value = "select * from buyerbiddinghistory where User_Name=?1  ", nativeQuery = true)
	public BuyerBiddingHistory findByUserName(String userName);
	
	/**
	 * Find by property title.
	 *
	 * @param propertyTitle the property title
	 * @return the buyer bidding history
	 */
	@Query(value = "select * from buyerbiddinghistory where property_Title=?1  ", nativeQuery = true)
	public BuyerBiddingHistory findByPropertyTitle(String propertyTitle);
	
	/**
	 * Gets the all.
	 *
	 * @return the all
	 */
	@Query(value = "Select * from buyerbiddinghistory;", nativeQuery = true)
	public List<BuyerBiddingHistory> getAll();
	
	/**
	 * Find by bid reference no.
	 *
	 * @param bidreferenceno the bidreferenceno
	 * @return the buyer bidding history
	 */
	@Query(value = "Select * from buyerbiddinghistory;", nativeQuery = true)
	public BuyerBiddingHistory findByBidReferenceNo(String bidreferenceno);
	
	
}
