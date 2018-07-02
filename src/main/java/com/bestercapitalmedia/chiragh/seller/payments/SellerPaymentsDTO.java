package com.bestercapitalmedia.chiragh.seller.payments;

// TODO: Auto-generated Javadoc
/**
 * The Class SellerPaymentsDTO.
 */
public class SellerPaymentsDTO {
	
	
	/** The property id. */
	private int propertyId;
	
	/** The payment title. */
	private int paymentTitle;
	
	/** The amount. */
	private String amount;
	
	/** The payment type. */
	private int paymentType;
	
	/** The payment cc type. */
	private String paymentCcType;
    
    /** The payment cc message api. */
    private String paymentCcMessageApi;



	/**
	 * Gets the payment title.
	 *
	 * @return the payment title
	 */
	public int getPaymentTitle() {
		return paymentTitle;
	}



	/**
	 * Sets the payment title.
	 *
	 * @param paymentTitle the new payment title
	 */
	public void setPaymentTitle(int paymentTitle) {
		this.paymentTitle = paymentTitle;
	}



	/**
	 * Gets the payment type.
	 *
	 * @return the payment type
	 */
	public int getPaymentType() {
		return paymentType;
	}



	/**
	 * Sets the payment type.
	 *
	 * @param paymentType the new payment type
	 */
	public void setPaymentType(int paymentType) {
		this.paymentType = paymentType;
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
	 * Gets the property id.
	 *
	 * @return the property id
	 */
	public int getPropertyId() {
		return propertyId;
	}



	/**
	 * Sets the property id.
	 *
	 * @param propertyId the new property id
	 */
	public void setPropertyId(int propertyId) {
		this.propertyId = propertyId;
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
	 * Instantiates a new seller payments DTO.
	 */
	public SellerPaymentsDTO() {
	
}
    
}
