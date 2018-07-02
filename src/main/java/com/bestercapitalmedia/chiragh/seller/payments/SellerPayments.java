
package com.bestercapitalmedia.chiragh.seller.payments;

import java.io.Serializable;

import java.lang.StringBuilder;

import java.util.Set;



import com.bestercapitalmedia.chiragh.gateways.ChiraghPropertyGateways;
import com.bestercapitalmedia.chiragh.property.Chiraghproperty;

import com.bestercapitalmedia.chiragh.seller.paymentstype.SellerPaymentsType;
import com.bestercapitalmedia.chiragh.user.Chiraghuser;
import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

// TODO: Auto-generated Javadoc
/**
 * The Class SellerPayments.
 */

@Entity

@Table(catalog = "chiraghdatabase", name = "sellerpayments")


public class SellerPayments implements Serializable {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The payment verification code. */
    @Column(name="payment_Verification_Code")
	int paymentVerificationCode;
	
	/** The seller payments id. */
	@Column(name = "seller_Payments_Id", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	Integer sellerPaymentsId;
	
	/** The amount. */

	@Column(name = "amount", length = 45)
	@Basic(fetch = FetchType.EAGER)

	
	String amount;
	
	/** The payment cc type. */

	@Column(name = "payment_Cc_Type", length = 45)
	@Basic(fetch = FetchType.EAGER)

	
	String paymentCcType;
	
	/** The payment cc message api. */

	@Column(name = "payment_Cc_Message_Api", length = 45)
	@Basic(fetch = FetchType.EAGER)

	
	String paymentCcMessageApi;

	/** The chiraghuser. */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "user_Id", referencedColumnName = "user_Id") })
	 @JsonBackReference
	Chiraghuser chiraghuser;
	
	/** The chiraghpropertygateways. */
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "chiragh_Property_Gateways_Id", referencedColumnName = "chiragh_Property_Gateways_Id") })
	@JsonBackReference
	ChiraghPropertyGateways chiraghpropertygateways;
	
	/** The chiraghproperty. */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "property_Id", referencedColumnName = "property_Id") })
	@JsonBackReference
	Chiraghproperty chiraghproperty;
	
	
	
	/** The sellerpaymentstype. */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "seller_Payments_Type_Id", referencedColumnName = "seller_Payments_Type_Id") })
	@JsonBackReference
	SellerPaymentsType sellerpaymentstype;

	/**
	 * Instantiates a new seller payments.
	 */
	
	
	
	
	
	public SellerPayments() {
	}

	/**
	 * Gets the seller payments id.
	 *
	 * @return the seller payments id
	 */
	public Integer getSellerPaymentsId() {
		return sellerPaymentsId;
	}

	/**
	 * Sets the seller payments id.
	 *
	 * @param sellerPaymentsId the new seller payments id
	 */
	public void setSellerPaymentsId(Integer sellerPaymentsId) {
		this.sellerPaymentsId = sellerPaymentsId;
	}

	/**
	 * Gets the amount.
	 *
	 * @return the amount
	 */
	public String getAmount() {
		return amount;
	}

	/**
	 * Sets the amount.
	 *
	 * @param amount the new amount
	 */
	public void setAmount(String amount) {
		this.amount = amount;
	}

	/**
	 * Gets the payment cc type.
	 *
	 * @return the payment cc type
	 */
	public String getPaymentCcType() {
		return paymentCcType;
	}

	/**
	 * Sets the payment cc type.
	 *
	 * @param paymentCcType the new payment cc type
	 */
	public void setPaymentCcType(String paymentCcType) {
		this.paymentCcType = paymentCcType;
	}

	/**
	 * Gets the payment cc message api.
	 *
	 * @return the payment cc message api
	 */
	public String getPaymentCcMessageApi() {
		return paymentCcMessageApi;
	}

	/**
	 * Sets the payment cc message api.
	 *
	 * @param paymentCcMessageApi the new payment cc message api
	 */
	public void setPaymentCcMessageApi(String paymentCcMessageApi) {
		this.paymentCcMessageApi = paymentCcMessageApi;
	}

	/**
	 * Gets the chiraghuser.
	 *
	 * @return the chiraghuser
	 */
	public Chiraghuser getChiraghuser() {
		return chiraghuser;
	}

	/**
	 * Sets the chiraghuser.
	 *
	 * @param chiraghuser the new chiraghuser
	 */
	public void setChiraghuser(Chiraghuser chiraghuser) {
		this.chiraghuser = chiraghuser;
	}

	/**
	 * Gets the chiraghpropertygateways.
	 *
	 * @return the chiraghpropertygateways
	 */
	public ChiraghPropertyGateways getChiraghpropertygateways() {
		return chiraghpropertygateways;
	}

	/**
	 * Sets the chiraghpropertygateways.
	 *
	 * @param chiraghpropertygateways the new chiraghpropertygateways
	 */
	public void setChiraghpropertygateways(ChiraghPropertyGateways chiraghpropertygateways) {
		this.chiraghpropertygateways = chiraghpropertygateways;
	}

	/**
	 * Gets the chiraghproperty.
	 *
	 * @return the chiraghproperty
	 */
	public Chiraghproperty getChiraghproperty() {
		return chiraghproperty;
	}

	/**
	 * Sets the chiraghproperty.
	 *
	 * @param chiraghproperty the new chiraghproperty
	 */
	public void setChiraghproperty(Chiraghproperty chiraghproperty) {
		this.chiraghproperty = chiraghproperty;
	}

	/**
	 * Gets the sellerpaymentstype.
	 *
	 * @return the sellerpaymentstype
	 */
	public SellerPaymentsType getSellerpaymentstype() {
		return sellerpaymentstype;
	}

	/**
	 * Sets the sellerpaymentstype.
	 *
	 * @param sellerpaymentstype the new sellerpaymentstype
	 */
	public void setSellerpaymentstype(SellerPaymentsType sellerpaymentstype) {
		this.sellerpaymentstype = sellerpaymentstype;
	}

	/**
	 * Gets the payment verification code.
	 *
	 * @return the payment verification code
	 */
	public int getPaymentVerificationCode() {
		return paymentVerificationCode;
	}

	/**
	 * Sets the payment verification code.
	 *
	 * @param paymentVerificationCode the new payment verification code
	 */
	public void setPaymentVerificationCode(int paymentVerificationCode) {
		this.paymentVerificationCode = paymentVerificationCode;
	}
}
