package com.bestercapitalmedia.chiragh.property.type;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.bestercapitalmedia.chiragh.user.Chiraghuser;

public interface PropertytypeRepository extends CrudRepository<Propertytype, Integer> {

	@Query(value = "select * from Propertytype where type_Title=?1 AND type_Classification=?2 ", nativeQuery = true)
	public Propertytype findBytypeTitleNtypeClassification(String typeTitle,String typeClassification);

	@Query(value = "select * from Propertytype where type_Title=?1 ", nativeQuery = true)
	public Propertytype findBytypeTitle(String typeTitle);

	@Query(value = "select * from Propertytype where type_Classification=?2 ", nativeQuery = true)
	public Propertytype findBytypeClassification(String typeClassification);




}
