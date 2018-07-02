
package com.bestercapitalmedia.chiragh.seller.paymentstype;

import java.io.Serializable;

import java.lang.StringBuilder;

import java.util.Set;

import javax.persistence.Id;



import com.bestercapitalmedia.chiragh.seller.payments.SellerPayments;
import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

// TODO: Auto-generated Javadoc
/**
 * The Class SellerPaymentsType.
 */

@Entity
@Table(catalog = "chiraghdatabase", name = "sellerpaymentstype")


public class SellerPaymentsType implements Serializable {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The seller payments type id. */

	@Column(name = "seller_Payments_Type_Id", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	Integer sellerPaymentsTypeId;
	
	/** The payment title. */

	@Column(name = "payment_Title", length = 45)
	@Basic(fetch = FetchType.EAGER)

	
	String paymentTitle;

	/** The sellerpayments. */
	@OneToOne(mappedBy = "sellerpaymentstype", fetch = FetchType.LAZY)

	@JsonBackReference
	SellerPayments sellerpayments;

	/**
	 * Sets the seller payments type id.
	 *
	 * @param sellerPaymentsTypeId the new seller payments type id
	 */
	public void setSellerPaymentsTypeId(Integer sellerPaymentsTypeId) {
		this.sellerPaymentsTypeId = sellerPaymentsTypeId;
	}

	/**
	 * Gets the seller payments type id.
	 *
	 * @return the seller payments type id
	 */
	public Integer getSellerPaymentsTypeId() {
		return this.sellerPaymentsTypeId;
	}

	/**
	 * Sets the payment title.
	 *
	 * @param paymentTitle the new payment title
	 */
	public void setPaymentTitle(String paymentTitle) {
		this.paymentTitle = paymentTitle;
	}

	/**
	 * Gets the payment title.
	 *
	 * @return the payment title
	 */
	public String getPaymentTitle() {
		return this.paymentTitle;
	}

	/**
	 * Sets the sellerpayments.
	 *
	 * @param sellerpayments the new sellerpayments
	 */
	public void setSellerpayments(SellerPayments sellerpayments) {
		this.sellerpayments = sellerpayments;
	}

	/**
	 * Gets the sellerpayments.
	 *
	 * @return the sellerpayments
	 */
	public SellerPayments getSellerpayments() {
		return sellerpayments;
	}

	/**
	 * Instantiates a new seller payments type.
	 */
	public SellerPaymentsType() {
	}

	
}
