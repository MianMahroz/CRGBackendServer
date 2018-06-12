package com.bestercapitalmedia.chiragh.seller.paymentstype;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.bestercapitalmedia.chiragh.buyer.paymentstype.BuyerPaymentsType;

public interface SellerPaymentsTypeRepositrory extends CrudRepository<SellerPaymentsType, Integer> {
	
	
	@Query(value = "select * from sellerpaymentstype where seller_Payments_Type_Id=?1 ", nativeQuery = true)
	public SellerPaymentsType findByPaymentTitle(int sellerPaymentsTypeId);


}
