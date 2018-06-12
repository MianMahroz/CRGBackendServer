
package com.bestercapitalmedia.chiragh.seller.payments;

import java.io.Serializable;

import java.lang.StringBuilder;

import java.util.Set;

import javax.xml.bind.annotation.*;

import com.bestercapitalmedia.chiragh.gateways.ChiraghPropertyGateways;
import com.bestercapitalmedia.chiragh.property.Chiraghproperty;

import com.bestercapitalmedia.chiragh.seller.paymentstype.SellerPaymentsType;
import com.bestercapitalmedia.chiragh.user.Chiraghuser;
import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

/**
 */

@Entity

@Table(catalog = "chiraghdatabase", name = "sellerpayments")


public class SellerPayments implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 */
    @Column(name="payment_Verification_Code")
	int paymentVerificationCode;
	
	@Column(name = "seller_Payments_Id", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	Integer sellerPaymentsId;
	/**
	 */

	@Column(name = "amount", length = 45)
	@Basic(fetch = FetchType.EAGER)

	
	String amount;
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
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "chiragh_Property_Gateways_Id", referencedColumnName = "chiragh_Property_Gateways_Id") })
	@JsonBackReference
	ChiraghPropertyGateways chiraghpropertygateways;
	/**
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "property_Id", referencedColumnName = "property_Id") })
	@JsonBackReference
	Chiraghproperty chiraghproperty;
	
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "seller_Payments_Type_Id", referencedColumnName = "seller_Payments_Type_Id") })
	@JsonBackReference
	SellerPaymentsType sellerpaymentstype;

	/**
	 */
	
	
	
	
	
	public SellerPayments() {
	}

	public Integer getSellerPaymentsId() {
		return sellerPaymentsId;
	}

	public void setSellerPaymentsId(Integer sellerPaymentsId) {
		this.sellerPaymentsId = sellerPaymentsId;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getPaymentCcType() {
		return paymentCcType;
	}

	public void setPaymentCcType(String paymentCcType) {
		this.paymentCcType = paymentCcType;
	}

	public String getPaymentCcMessageApi() {
		return paymentCcMessageApi;
	}

	public void setPaymentCcMessageApi(String paymentCcMessageApi) {
		this.paymentCcMessageApi = paymentCcMessageApi;
	}

	public Chiraghuser getChiraghuser() {
		return chiraghuser;
	}

	public void setChiraghuser(Chiraghuser chiraghuser) {
		this.chiraghuser = chiraghuser;
	}

	public ChiraghPropertyGateways getChiraghpropertygateways() {
		return chiraghpropertygateways;
	}

	public void setChiraghpropertygateways(ChiraghPropertyGateways chiraghpropertygateways) {
		this.chiraghpropertygateways = chiraghpropertygateways;
	}

	public Chiraghproperty getChiraghproperty() {
		return chiraghproperty;
	}

	public void setChiraghproperty(Chiraghproperty chiraghproperty) {
		this.chiraghproperty = chiraghproperty;
	}

	public SellerPaymentsType getSellerpaymentstype() {
		return sellerpaymentstype;
	}

	public void setSellerpaymentstype(SellerPaymentsType sellerpaymentstype) {
		this.sellerpaymentstype = sellerpaymentstype;
	}

	public int getPaymentVerificationCode() {
		return paymentVerificationCode;
	}

	public void setPaymentVerificationCode(int paymentVerificationCode) {
		this.paymentVerificationCode = paymentVerificationCode;
	}
}
