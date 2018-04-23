package com.bestercapitalmedia.chiragh.property;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;



public interface PropertyRepository extends CrudRepository<Chiraghproperty, Integer> {
	@Query(value = "select * from ChiraghProperty where property_Title=?1  ", nativeQuery = true)
	public Chiraghproperty findByPropertyTitle(String propertyTitle);
}
