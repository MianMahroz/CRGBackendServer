package com.bestercapitalmedia.chiragh.seller.details;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.bestercapitalmedia.chiragh.property.Chiraghproperty;

public interface PropertySellerDetailsRepository extends CrudRepository<Propertysellerdetails, Integer> {
	@Query(value = "select * from propertySellerDetails where property_Id=?1 AND owner_Type='owner'  ", nativeQuery = true)
	public List<Propertysellerdetails> findByOwnerByPropertyId(int property_Id);

	@Query(value = "select * from propertySellerDetails where property_Id=?1 AND owner_Type='poa'  ", nativeQuery = true)
	public List<Propertysellerdetails> findByPoaByPropertyId(int property_Id);


}
