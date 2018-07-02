package com.bestercapitalmedia.chiragh.buyer.paymentstype;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.bestercapitalmedia.chiragh.property.Chiraghproperty;

// TODO: Auto-generated Javadoc
/**
 * The Interface BuyerPaymentsTypeRepository.
 */
public interface BuyerPaymentsTypeRepository extends  CrudRepository<BuyerPaymentsType, Integer>{
	
	/**
	 * Find bypayment title.
	 *
	 * @param paymentTitle the payment title
	 * @return the buyer payments type
	 */
	@Query(value = "select * from buyerpaymentstype where payment_Title=?1  ", nativeQuery = true)
	public BuyerPaymentsType findBypaymentTitle(String paymentTitle);

}
