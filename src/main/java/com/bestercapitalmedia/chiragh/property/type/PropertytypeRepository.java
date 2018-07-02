package com.bestercapitalmedia.chiragh.property.type;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.bestercapitalmedia.chiragh.user.Chiraghuser;

// TODO: Auto-generated Javadoc
/**
 * The Interface PropertytypeRepository.
 */
public interface PropertytypeRepository extends CrudRepository<Propertytype, Integer> {

	/**
	 * Find bytype title ntype classification.
	 *
	 * @param typeTitle the type title
	 * @param typeClassification the type classification
	 * @return the propertytype
	 */
	@Query(value = "select * from Propertytype where type_Title=?1 AND type_Classification=?2 ", nativeQuery = true)
	public Propertytype findBytypeTitleNtypeClassification(String typeTitle,String typeClassification);

	/**
	 * Find bytype title.
	 *
	 * @param typeTitle the type title
	 * @return the propertytype
	 */
	@Query(value = "select * from Propertytype where type_Title=?1 ", nativeQuery = true)
	public Propertytype findBytypeTitle(String typeTitle);

	/**
	 * Find bytype classification.
	 *
	 * @param typeClassification the type classification
	 * @return the propertytype
	 */
	@Query(value = "select * from Propertytype where type_Classification=?1 ", nativeQuery = true)
	public Propertytype findBytypeClassification(String typeClassification);

	/**
	 * Find by property type id.
	 *
	 * @param property_Type_Id the property type id
	 * @return the propertytype
	 */
	@Query(value = "select * from Propertytype where property_Type_Id=?1 ", nativeQuery = true)
	public Propertytype findByPropertyTypeId(int property_Type_Id);

	/**
	 * Find by property type title.
	 *
	 * @param type_Title the type title
	 * @return the propertytype
	 */
	@Query(value = "select * from Propertytype where type_Title=?1 ", nativeQuery = true)
	public Propertytype findByPropertyTypeTitle(String type_Title);



}
