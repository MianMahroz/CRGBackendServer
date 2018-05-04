package com.bestercapitalmedia.chiragh.buyer.bidding.history;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.bestercapitalmedia.chiragh.buyer.details.PropertyBuyerDetails;
import com.bestercapitalmedia.chiragh.property.Chiraghproperty;

public interface BuyerBiddingHistoryRepository extends CrudRepository<BuyerBiddingHistory, Integer>{
	
	@Query(value = "select * from buyerbiddinghistory where User_Name=?1  ", nativeQuery = true)
	public BuyerBiddingHistory findByUserName(String userName);
	
	@Query(value = "select * from buyerbiddinghistory where property_Title=?1  ", nativeQuery = true)
	public BuyerBiddingHistory findByPropertyTitle(String propertyTitle);
	
	@Query(value = "Select * from buyerbiddinghistory;", nativeQuery = true)
	public List<BuyerBiddingHistory> getAll();
	
	@Query(value = "Select * from buyerbiddinghistory;", nativeQuery = true)
	public BuyerBiddingHistory findByBidReferenceNo(String bidreferenceno);
	
	
}
