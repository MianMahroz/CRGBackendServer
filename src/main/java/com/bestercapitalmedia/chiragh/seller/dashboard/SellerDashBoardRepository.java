package com.bestercapitalmedia.chiragh.seller.dashboard;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.bestercapitalmedia.chiragh.property.bidprocess.Propertybidprocess;

// TODO: Auto-generated Javadoc
/**
 * The Interface SellerDashBoardRepository.
 */
public interface SellerDashBoardRepository extends CrudRepository< SellerDashBoard, Integer> {

	
	
	/**
	 * Find all history.
	 *
	 * @return the list
	 */
	@Query(value = "select * from sellingbuyinghistory ", nativeQuery = true)
	public List<SellerDashBoard>findAllHistory();
	
	/**
	 * Find alls.
	 *
	 * @return the list
	 */
	@Query(value = "select * from sellingbuyinghistory ", nativeQuery = true)
	public List<SellerDashBoard> findAlls();
	
	
	
}

