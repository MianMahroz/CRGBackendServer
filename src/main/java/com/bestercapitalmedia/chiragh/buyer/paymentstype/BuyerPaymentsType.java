package com.bestercapitalmedia.chiragh.buyer.paymentstype;




import java.io.Serializable;

import java.lang.StringBuilder;

import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.Id;



import com.bestercapitalmedia.chiragh.buyer.payments.BuyerPayments;

import javax.persistence.*;

// TODO: Auto-generated Javadoc
/**
 * The Class BuyerPaymentsType.
 */

@Entity
@Table(catalog = "chiraghdatabase", name = "buyerpaymentstype")
public class BuyerPaymentsType implements Serializable {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;


	/** The buyer payments type id. */
	@Column(name = "buyer_Payments_Type_Id", nullable = false)
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Integer buyerPaymentsTypeId;

	/** The payment title. */
	@Column(name = "payment_Title", length = 45)
	String paymentTitle;
	
	

	/**
	 * Instantiates a new buyer payments type.
	 */
	public BuyerPaymentsType() {
		
	}

	/**
	 * Gets the buyer payments type id.
	 *
	 * @return the buyer payments type id
	 */
	public Integer getBuyerPaymentsTypeId() {
		return buyerPaymentsTypeId;
	}

	/**
	 * Sets the buyer payments type id.
	 *
	 * @param buyerPaymentsTypeId the new buyer payments type id
	 */
	public void setBuyerPaymentsTypeId(Integer buyerPaymentsTypeId) {
		this.buyerPaymentsTypeId = buyerPaymentsTypeId;
	}

	/**
	 * Gets the payment title.
	 *
	 * @return the payment title
	 */
	public String getPaymentTitle() {
		return paymentTitle;
	}

	/**
	 * Sets the payment title.
	 *
	 * @param paymentTitle the new payment title
	 */
	public void setPaymentTitle(String paymentTitle) {
		this.paymentTitle = paymentTitle;
	}

	
	
	
	
	}
