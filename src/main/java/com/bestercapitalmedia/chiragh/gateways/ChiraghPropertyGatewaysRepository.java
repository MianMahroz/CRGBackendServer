package com.bestercapitalmedia.chiragh.gateways;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface ChiraghPropertyGatewaysRepository extends CrudRepository<ChiraghPropertyGateways, Integer> {
	
	@Query(value = "Select * from chiraghpropertygateways where chiragh_Property_Gateways_Id=?1", nativeQuery = true)
	public ChiraghPropertyGateways findByPaymentType(int chiraghPropertyGatewaysId)  ;

}
