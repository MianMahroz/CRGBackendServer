package com.bestercapitalmedia.chiragh.buyer.details;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

// TODO: Auto-generated Javadoc
/**
 * The Interface PropertyBuyerDetailsRepository.
 */
public interface PropertyBuyerDetailsRepository extends CrudRepository<PropertyBuyerDetails, Integer> {

	/**
	 * Gets the all.
	 *
	 * @return the all
	 */
	@Query(value = "Select * from propertybuyerdetails;", nativeQuery = true)
	public List<PropertyBuyerDetails> getAll();
	
	//@Query(value = "Select * from propertybuyerdetails;", nativeQuery = true)
	//public List<PropertyBuyerDetails> findAll();
}
