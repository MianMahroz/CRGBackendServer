
package com.bestercapitalmedia.chiragh.seller.paymentstype;

import java.io.Serializable;

import java.lang.StringBuilder;

import java.util.Set;

import javax.persistence.Id;

import javax.xml.bind.annotation.*;

import com.bestercapitalmedia.chiragh.seller.payments.Sellerpayments;
import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

/**
 */

@Entity
@Table(catalog = "chiraghdatabase", name = "sellerpaymentstype")


public class Sellerpaymentstype implements Serializable {
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
	Sellerpayments sellerpayments;

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
	public void setSellerpayments(Sellerpayments sellerpayments) {
		this.sellerpayments = sellerpayments;
	}

	/**
	 */
	public Sellerpayments getSellerpayments() {
		return sellerpayments;
	}

	/**
	 */
	public Sellerpaymentstype() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(Sellerpaymentstype that) {
		setSellerPaymentsTypeId(that.getSellerPaymentsTypeId());
		setPaymentTitle(that.getPaymentTitle());
		setSellerpayments(that.getSellerpayments());
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("sellerPaymentsTypeId=[").append(sellerPaymentsTypeId).append("] ");
		buffer.append("paymentTitle=[").append(paymentTitle).append("] ");

		return buffer.toString();
	}

	/**
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (int) (prime * result + ((sellerPaymentsTypeId == null) ? 0 : sellerPaymentsTypeId.hashCode()));
		return result;
	}

	/**
	 */
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof Sellerpaymentstype))
			return false;
		Sellerpaymentstype equalCheck = (Sellerpaymentstype) obj;
		if ((sellerPaymentsTypeId == null && equalCheck.sellerPaymentsTypeId != null) || (sellerPaymentsTypeId != null && equalCheck.sellerPaymentsTypeId == null))
			return false;
		if (sellerPaymentsTypeId != null && !sellerPaymentsTypeId.equals(equalCheck.sellerPaymentsTypeId))
			return false;
		return true;
	}
}
