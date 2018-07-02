package com.bestercapitalmedia.chiragh.gateways;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

// TODO: Auto-generated Javadoc
/**
 * The Interface ChiraghPropertyGatewaysRepository.
 */
public interface ChiraghPropertyGatewaysRepository extends CrudRepository<ChiraghPropertyGateways, Integer> {
	
	/**
	 * Find by payment type.
	 *
	 * @param chiraghPropertyGatewaysId the chiragh property gateways id
	 * @return the chiragh property gateways
	 */
	@Query(value = "Select * from chiraghpropertygateways where chiragh_Property_Gateways_Id=?1", nativeQuery = true)
	public ChiraghPropertyGateways findByPaymentType(int chiraghPropertyGatewaysId)  ;

}
