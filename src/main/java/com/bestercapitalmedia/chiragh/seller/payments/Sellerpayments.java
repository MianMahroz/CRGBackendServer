
package com.bestercapitalmedia.chiragh.seller.payments;

import java.io.Serializable;

import java.lang.StringBuilder;

import java.util.Set;

import javax.persistence.Id;

import javax.xml.bind.annotation.*;

import com.bestercapitalmedia.chiragh.property.Chiraghproperty;
import com.bestercapitalmedia.chiragh.seller.paymentstype.Sellerpaymentstype;
import com.bestercapitalmedia.chiragh.user.Chiraghuser;
import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

/**
 */

@Entity

@Table(catalog = "chiraghdatabase", name = "sellerpayments")


public class Sellerpayments implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 */

	@Column(name = "seller_Payments_Id", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	Integer sellerPaymentsId;
	/**
	 */

	@Column(name = "payment_Type_Id")
	@Basic(fetch = FetchType.EAGER)

	
	Integer paymentTypeId;
	/**
	 */

	@Column(name = "payment_Amount", length = 45)
	@Basic(fetch = FetchType.EAGER)

	
	String paymentAmount;
	/**
	 */

	@Column(name = "payment_Cc_Type", length = 45)
	@Basic(fetch = FetchType.EAGER)

	
	String paymentCcType;
	/**
	 */

	@Column(name = "payment_Cc_Message_Api", length = 45)
	@Basic(fetch = FetchType.EAGER)

	
	String paymentCcMessageApi;

	/**
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "user_Id", referencedColumnName = "user_Id") })
	 @JsonBackReference
	Chiraghuser chiraghuser;
	/**
	 */
	@PrimaryKeyJoinColumn
	@OneToOne(fetch = FetchType.LAZY)
	@JsonBackReference
	Sellerpaymentstype sellerpaymentstype;
	/**
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "property_Id", referencedColumnName = "property_Id") })
	@JsonBackReference
	Chiraghproperty chiraghproperty;

	/**
	 */
	public void setSellerPaymentsId(Integer sellerPaymentsId) {
		this.sellerPaymentsId = sellerPaymentsId;
	}

	/**
	 */
	public Integer getSellerPaymentsId() {
		return this.sellerPaymentsId;
	}

	/**
	 */
	public void setPaymentTypeId(Integer paymentTypeId) {
		this.paymentTypeId = paymentTypeId;
	}

	/**
	 */
	public Integer getPaymentTypeId() {
		return this.paymentTypeId;
	}

	/**
	 */
	public void setPaymentAmount(String paymentAmount) {
		this.paymentAmount = paymentAmount;
	}

	/**
	 */
	public String getPaymentAmount() {
		return this.paymentAmount;
	}

	/**
	 */
	public void setPaymentCcType(String paymentCcType) {
		this.paymentCcType = paymentCcType;
	}

	/**
	 */
	public String getPaymentCcType() {
		return this.paymentCcType;
	}

	/**
	 */
	public void setPaymentCcMessageApi(String paymentCcMessageApi) {
		this.paymentCcMessageApi = paymentCcMessageApi;
	}

	/**
	 */
	public String getPaymentCcMessageApi() {
		return this.paymentCcMessageApi;
	}

	/**
	 */
	public void setChiraghuser(Chiraghuser chiraghuser) {
		this.chiraghuser = chiraghuser;
	}

	/**
	 */
	public Chiraghuser getChiraghuser() {
		return chiraghuser;
	}

	/**
	 */
	public void setSellerpaymentstype(Sellerpaymentstype sellerpaymentstype) {
		this.sellerpaymentstype = sellerpaymentstype;
	}

	/**
	 */
	public Sellerpaymentstype getSellerpaymentstype() {
		return sellerpaymentstype;
	}

	/**
	 */
	public void setChiraghproperty(Chiraghproperty chiraghproperty) {
		this.chiraghproperty = chiraghproperty;
	}

	/**
	 */
	public Chiraghproperty getChiraghproperty() {
		return chiraghproperty;
	}

	/**
	 */
	public Sellerpayments() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(Sellerpayments that) {
		setSellerPaymentsId(that.getSellerPaymentsId());
		setPaymentTypeId(that.getPaymentTypeId());
		setPaymentAmount(that.getPaymentAmount());
		setPaymentCcType(that.getPaymentCcType());
		setPaymentCcMessageApi(that.getPaymentCcMessageApi());
		setChiraghuser(that.getChiraghuser());
		setSellerpaymentstype(that.getSellerpaymentstype());
		setChiraghproperty(that.getChiraghproperty());
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("sellerPaymentsId=[").append(sellerPaymentsId).append("] ");
		buffer.append("paymentTypeId=[").append(paymentTypeId).append("] ");
		buffer.append("paymentAmount=[").append(paymentAmount).append("] ");
		buffer.append("paymentCcType=[").append(paymentCcType).append("] ");
		buffer.append("paymentCcMessageApi=[").append(paymentCcMessageApi).append("] ");

		return buffer.toString();
	}

	/**
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (int) (prime * result + ((sellerPaymentsId == null) ? 0 : sellerPaymentsId.hashCode()));
		return result;
	}

	/**
	 */
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof Sellerpayments))
			return false;
		Sellerpayments equalCheck = (Sellerpayments) obj;
		if ((sellerPaymentsId == null && equalCheck.sellerPaymentsId != null) || (sellerPaymentsId != null && equalCheck.sellerPaymentsId == null))
			return false;
		if (sellerPaymentsId != null && !sellerPaymentsId.equals(equalCheck.sellerPaymentsId))
			return false;
		return true;
	}
}
