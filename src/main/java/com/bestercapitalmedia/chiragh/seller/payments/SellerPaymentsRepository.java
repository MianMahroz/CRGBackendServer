package com.bestercapitalmedia.chiragh.seller.payments;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface SellerPaymentsRepository extends CrudRepository<SellerPayments, Integer>{
	
	@Query(value = "Select * from sellerpayments;", nativeQuery = true)
	public List<Map<String,String>> getAll();

}
