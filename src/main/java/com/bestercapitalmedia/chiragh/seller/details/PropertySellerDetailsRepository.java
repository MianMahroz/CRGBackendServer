package com.bestercapitalmedia.chiragh.seller.details;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.bestercapitalmedia.chiragh.property.Chiraghproperty;

// TODO: Auto-generated Javadoc
/**
 * The Interface PropertySellerDetailsRepository.
 */
public interface PropertySellerDetailsRepository extends CrudRepository<Propertysellerdetails, Integer> {
	
	/**
	 * Find by owner by property id.
	 *
	 * @param property_Id the property id
	 * @return the list
	 */
//	AND is_Personal_Details_Verified!='true'
	@Query(value = "select * from propertySellerDetails where property_Id=?1 AND owner_Type='owner'  ", nativeQuery = true)
	public List<Propertysellerdetails> findByOwnerByPropertyId(int property_Id);

	/**
	 * Find by poa by property id.
	 *
	 * @param property_Id the property id
	 * @return the list
	 */
//	AND is_Personal_Details_Verified!='true'
	@Query(value = "select * from propertySellerDetails where property_Id=?1 AND owner_Type='poa'  ", nativeQuery = true)
	public List<Propertysellerdetails> findByPoaByPropertyId(int property_Id);


}
