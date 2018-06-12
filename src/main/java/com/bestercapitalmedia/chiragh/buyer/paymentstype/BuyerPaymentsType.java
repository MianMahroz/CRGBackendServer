package com.bestercapitalmedia.chiragh.buyer.paymentstype;




import java.io.Serializable;

import java.lang.StringBuilder;

import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.Id;

import javax.xml.bind.annotation.*;

import com.bestercapitalmedia.chiragh.buyer.payments.BuyerPayments;

import javax.persistence.*;

/**
 */

@Entity
@Table(catalog = "chiraghdatabase", name = "buyerpaymentstype")
public class BuyerPaymentsType implements Serializable {
	private static final long serialVersionUID = 1L;


	@Column(name = "buyer_Payments_Type_Id", nullable = false)
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Integer buyerPaymentsTypeId;

	@Column(name = "payment_Title", length = 45)
	String paymentTitle;
	
	

	public BuyerPaymentsType() {
		
	}

	public Integer getBuyerPaymentsTypeId() {
		return buyerPaymentsTypeId;
	}

	public void setBuyerPaymentsTypeId(Integer buyerPaymentsTypeId) {
		this.buyerPaymentsTypeId = buyerPaymentsTypeId;
	}

	public String getPaymentTitle() {
		return paymentTitle;
	}

	public void setPaymentTitle(String paymentTitle) {
		this.paymentTitle = paymentTitle;
	}

	
	
	
	
	}
