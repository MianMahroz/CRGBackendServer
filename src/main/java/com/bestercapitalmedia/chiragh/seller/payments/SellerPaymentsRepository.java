package com.bestercapitalmedia.chiragh.seller.payments;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

// TODO: Auto-generated Javadoc
/**
 * The Interface SellerPaymentsRepository.
 */
public interface SellerPaymentsRepository extends CrudRepository<SellerPayments, Integer>{
	
	/**
	 * Gets the all.
	 *
	 * @return the all
	 */
	@Query(value = "Select * from sellerpayments;", nativeQuery = true)
	public List<Map<String,String>> getAll();

}
