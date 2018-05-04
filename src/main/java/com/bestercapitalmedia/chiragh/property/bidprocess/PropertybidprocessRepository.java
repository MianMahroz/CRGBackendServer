package com.bestercapitalmedia.chiragh.property.bidprocess;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;



public interface PropertybidprocessRepository extends CrudRepository<Propertybidprocess, Integer> {
	

@Query(value = "select count(property_Id)  from propertybidprocess where property_ID=?1  ", nativeQuery = true)
	public int findTotalBidPlaced(int propertyId);

}
