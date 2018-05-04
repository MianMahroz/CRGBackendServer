package com.bestercapitalmedia.chiragh.buyer.details;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface PropertyBuyerDetailsRepository extends CrudRepository<PropertyBuyerDetails, Integer> {

	@Query(value = "Select * from propertybuyerdetails;", nativeQuery = true)
	public List<PropertyBuyerDetails> getAll();
	
	//@Query(value = "Select * from propertybuyerdetails;", nativeQuery = true)
	//public List<PropertyBuyerDetails> findAll();
}
