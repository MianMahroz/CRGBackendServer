package com.bestercapitalmedia.chiragh.seller.dashboard;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.bestercapitalmedia.chiragh.property.bidprocess.Propertybidprocess;

public interface SellerDashBoardRepository extends CrudRepository< SellerDashBoard, Integer> {

	
	
	@Query(value = "select * from sellingbuyinghistory ", nativeQuery = true)
	public List<SellerDashBoard>findAllHistory();
	
	@Query(value = "select * from sellingbuyinghistory ", nativeQuery = true)
	public List<SellerDashBoard> findAlls();
	
	
	
}

