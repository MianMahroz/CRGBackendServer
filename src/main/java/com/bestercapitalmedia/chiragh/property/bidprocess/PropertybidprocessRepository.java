package com.bestercapitalmedia.chiragh.property.bidprocess;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;



// TODO: Auto-generated Javadoc
/**
 * The Interface PropertybidprocessRepository.
 */
public interface PropertybidprocessRepository extends CrudRepository<Propertybidprocess, Integer> {
	

/**
 * Find total bid placed.
 *
 * @param propertyId the property id
 * @return the int
 */
@Query(value = "select count(property_Id)  from propertybidprocess where property_ID=?1  ", nativeQuery = true)
	public int findTotalBidPlaced(int propertyId);

}
