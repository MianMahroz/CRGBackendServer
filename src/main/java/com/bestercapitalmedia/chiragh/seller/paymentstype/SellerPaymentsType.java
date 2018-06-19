
package com.bestercapitalmedia.chiragh.seller.paymentstype;

import java.io.Serializable;

import java.lang.StringBuilder;

import java.util.Set;

import javax.persistence.Id;



import com.bestercapitalmedia.chiragh.seller.payments.SellerPayments;
import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

/**
 */

@Entity
@Table(catalog = "chiraghdatabase", name = "sellerpaymentstype")


public class SellerPaymentsType implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 */

	@Column(name = "seller_Payments_Type_Id", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	Integer sellerPaymentsTypeId;
	/**
	 */

	@Column(name = "payment_Title", length = 45)
	@Basic(fetch = FetchType.EAGER)

	
	String paymentTitle;

	/**
	 */
	@OneToOne(mappedBy = "sellerpaymentstype", fetch = FetchType.LAZY)

	@JsonBackReference
	SellerPayments sellerpayments;

	/**
	 */
	public void setSellerPaymentsTypeId(Integer sellerPaymentsTypeId) {
		this.sellerPaymentsTypeId = sellerPaymentsTypeId;
	}

	/**
	 */
	public Integer getSellerPaymentsTypeId() {
		return this.sellerPaymentsTypeId;
	}

	/**
	 */
	public void setPaymentTitle(String paymentTitle) {
		this.paymentTitle = paymentTitle;
	}

	/**
	 */
	public String getPaymentTitle() {
		return this.paymentTitle;
	}

	/**
	 */
	public void setSellerpayments(SellerPayments sellerpayments) {
		this.sellerpayments = sellerpayments;
	}

	/**
	 */
	public SellerPayments getSellerpayments() {
		return sellerpayments;
	}

	/**
	 */
	public SellerPaymentsType() {
	}

	
}
