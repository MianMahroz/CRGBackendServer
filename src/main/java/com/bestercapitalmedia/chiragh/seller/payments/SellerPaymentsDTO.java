package com.bestercapitalmedia.chiragh.seller.payments;

public class SellerPaymentsDTO {
	
	
	private int propertyId;
	private int paymentTitle;
	private String amount;
	private int paymentType;
	private String paymentCcType;
    private String paymentCcMessageApi;



	public int getPaymentTitle() {
		return paymentTitle;
	}



	public void setPaymentTitle(int paymentTitle) {
		this.paymentTitle = paymentTitle;
	}



	public int getPaymentType() {
		return paymentType;
	}



	public void setPaymentType(int paymentType) {
		this.paymentType = paymentType;
	}



	public String getAmount() {
		return amount;
	}



	public void setAmount(String amount) {
		this.amount = amount;
	}



	public int getPropertyId() {
		return propertyId;
	}



	public void setPropertyId(int propertyId) {
		this.propertyId = propertyId;
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



	public SellerPaymentsDTO() {
	
}
    
}
