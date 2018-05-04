package com.bestercapitalmedia.chiragh.property;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.bestercapitalmedia.chiragh.buyer.details.PropertyBuyerCurrentAuctionDTO;

public interface PropertyRepository extends CrudRepository<Chiraghproperty, Integer> {
	@Query(value = "select * from ChiraghProperty where property_Title=?1  ", nativeQuery = true)
	public Chiraghproperty findByPropertyTitle(String propertyTitle);

	@Query(value = "select * from ChiraghProperty where property_ID=?1  ", nativeQuery = true)
	public Chiraghproperty findByPropertyId(int propertyId);

	@Query(value = "SELECT c.property_Title,c.property_Description,c.property_Id,c.location,c.no_Of_Bedrooms,c.no_Of_Baths,"
			+ "c.outdoor_Type,c.is_Furnished,c.kitchen_Type,c.is_Maid_Room,c.is_Swimming_Pool,c.is_Gym,"
			+ "c.is_Heli_Pad,c.no_Of_Parking,c.no_Of_Floors" + "c.no_Units,c.no_Shops,c. no_Facilities,c."
			+ " p.bid_Start_Date,p.bid_End_Date,b.bid_Amount,i.image_Name,i.image_Url\r\n"
			+ "FROM propertyauctionprocess p, chiraghproperty c, propertyimages i, propertybidprocess b\r\n"
			+ "WHERE p.property_Id=c.property_Id and i.property_Id=b.property_Id; ", nativeQuery = true)
	public List<PropertyBuyerCurrentAuctionDTO> findBuyerPropertylisting();

	@Query(value = "select * from ChiraghProperty where property_Reference_No=?1  ", nativeQuery = true)
	public Chiraghproperty findPropertyByRefNo(String refNo);

}
