package com.bestercapitalmedia.chiragh.property;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.bestercapitalmedia.chiragh.buyer.details.PropertyBuyerCurrentAuctionDTO;

// TODO: Auto-generated Javadoc
/**
 * The Interface PropertyRepository.
 */
public interface PropertyRepository extends CrudRepository<Chiraghproperty, Integer> {
	
	/**
	 * Find by property title.
	 *
	 * @param propertyTitle the property title
	 * @return the chiraghproperty
	 */
	@Query(value = "select * from ChiraghProperty where property_Title=?1  ", nativeQuery = true)
	public Chiraghproperty findByPropertyTitle(String propertyTitle);

	/**
	 * Find by property id.
	 *
	 * @param propertyId the property id
	 * @return the chiraghproperty
	 */
	@Query(value = "select * from ChiraghProperty where property_ID=?1  ", nativeQuery = true)
	public Chiraghproperty findByPropertyId(int propertyId);

	/**
	 * Find complete properties.
	 *
	 * @return the list
	 */
	@Query(value = "select * from ChiraghProperty where status='inprocess'", nativeQuery = true)
	public List<Chiraghproperty> findCompleteProperties();

	/**
	 * Find buyer propertylisting.
	 *
	 * @return the list
	 */
	@Query(value = "SELECT c.property_Title,c.property_Description,c.property_Id,c.location,c.no_Of_Bedrooms,c.no_Of_Baths,"
			+ "c.outdoor_Type,c.is_Furnished,c.kitchen_Type,c.is_Maid_Room,c.is_Swimming_Pool,c.is_Gym,"
			+ "c.is_Heli_Pad,c.no_Of_Parking,c.no_Of_Floors" + "c.no_Units,c.no_Shops,c. no_Facilities,c."
			+ " p.bid_Start_Date,p.bid_End_Date,b.bid_Amount,i.image_Name,i.image_Url\r\n"
			+ "FROM propertyauctionprocess p, chiraghproperty c, propertyimages i, propertybidprocess b\r\n"
			+ "WHERE p.property_Id=c.property_Id and i.property_Id=b.property_Id; ", nativeQuery = true)
	public List<PropertyBuyerCurrentAuctionDTO> findBuyerPropertylisting();

	/**
	 * Find property by ref no.
	 *
	 * @param refNo the ref no
	 * @return the chiraghproperty
	 */
	@Query(value = "select * from ChiraghProperty where property_Reference_No=?1  ", nativeQuery = true)
	public Chiraghproperty findPropertyByRefNo(String refNo);
	
	/**
	 * Find property by user id.
	 *
	 * @param userId the user id
	 * @return the list
	 */
	@Query(value = "select * from ChiraghProperty where user_Id=?1  ", nativeQuery = true)
	public List<Chiraghproperty> findPropertyByUserId(int userId);
	
	/**
	 * Gets the date.
	 *
	 * @return the date
	 */
	@Query(value = "SELECT p.property_Title,pa.final_Amount FROM ChiraghProperty p INNER JOIN propertyAuctionProcess pa  ON p.property_Id=pa.property_Id  ", nativeQuery = true)
	public List<Map<String,String>> getDate();
}
