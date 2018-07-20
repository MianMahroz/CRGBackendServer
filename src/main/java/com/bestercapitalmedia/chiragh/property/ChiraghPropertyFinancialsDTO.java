package com.bestercapitalmedia.chiragh.property;

import java.util.Calendar;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

// TODO: Auto-generated Javadoc
/**
 * The Class ChiraghPropertyFinancialsDTO.
 */
public class ChiraghPropertyFinancialsDTO {

	/** The user name. */
	String userName;
	String bankOther;
	/** The property id. */
	int propertyId;
	
	/** The listed price. */
	float listedPrice;
	
	/** The original price. */
	float originalPrice;
	
	/** The paid amount. */
	float paidAmount;
	
	/** The service charge. */
	float serviceCharge;
	
	/** The morgage status. */
	String morgageStatus;
	
	/** The morgage reg no. */
	String morgageRegNo;
	
	/** The bank. */
	String bank;
	
	/** The morgage amount. */
	float morgageAmount;
	
	/** The pre closure charges. */
	float preClosureCharges;
	
	/** The payment schedule. */
	String paymentSchedule;
	
	/** The date. */
	Calendar date;
	
	/** The amount. */
	float amount;
	
	/** The morgage noc. */
	String morgageNoc;
	
	/** The balance amount. */
	float balanceAmount;
	
	String status;
	/**
	 * Gets the listed price.
	 *
	 * @return the listed price
	 */
	public float getListedPrice() {
		return listedPrice;
	}
	
	/**
	 * Sets the listed price.
	 *
	 * @param listedPrice the new listed price
	 */
	public void setListedPrice(float listedPrice) {
		this.listedPrice = listedPrice;
	}
	
	/**
	 * Gets the original price.
	 *
	 * @return the original price
	 */
	public float getOriginalPrice() {
		return originalPrice;
	}
	
	/**
	 * Sets the original price.
	 *
	 * @param originalPrice the new original price
	 */
	public void setOriginalPrice(float originalPrice) {
		this.originalPrice = originalPrice;
	}
	
	/**
	 * Gets the paid amount.
	 *
	 * @return the paid amount
	 */
	public float getPaidAmount() {
		return paidAmount;
	}
	
	/**
	 * Sets the paid amount.
	 *
	 * @param paidAmount the new paid amount
	 */
	public void setPaidAmount(float paidAmount) {
		this.paidAmount = paidAmount;
	}
	
	/**
	 * Gets the service charge.
	 *
	 * @return the service charge
	 */
	public float getServiceCharge() {
		return serviceCharge;
	}
	
	/**
	 * Sets the service charge.
	 *
	 * @param serviceCharge the new service charge
	 */
	public void setServiceCharge(float serviceCharge) {
		this.serviceCharge = serviceCharge;
	}
	
	/**
	 * Gets the morgage status.
	 *
	 * @return the morgage status
	 */
	public String getMorgageStatus() {
		return morgageStatus;
	}
	
	/**
	 * Sets the morgage status.
	 *
	 * @param morgageStatus the new morgage status
	 */
	public void setMorgageStatus(String morgageStatus) {
		this.morgageStatus = morgageStatus;
	}
	
	/**
	 * Gets the morgage reg no.
	 *
	 * @return the morgage reg no
	 */
	public String getMorgageRegNo() {
		return morgageRegNo;
	}
	
	/**
	 * Sets the morgage reg no.
	 *
	 * @param morgageRegNo the new morgage reg no
	 */
	public void setMorgageRegNo(String morgageRegNo) {
		this.morgageRegNo = morgageRegNo;
	}
	
	/**
	 * Gets the bank.
	 *
	 * @return the bank
	 */
	public String getBank() {
		return bank;
	}
	
	/**
	 * Sets the bank.
	 *
	 * @param bank the new bank
	 */
	public void setBank(String bank) {
		this.bank = bank;
	}
	
	/**
	 * Gets the morgage amount.
	 *
	 * @return the morgage amount
	 */
	public float getMorgageAmount() {
		return morgageAmount;
	}
	
	/**
	 * Sets the morgage amount.
	 *
	 * @param morgageAmount the new morgage amount
	 */
	public void setMorgageAmount(float morgageAmount) {
		this.morgageAmount = morgageAmount;
	}
	
	/**
	 * Gets the pre closure charges.
	 *
	 * @return the pre closure charges
	 */
	public float getPreClosureCharges() {
		return preClosureCharges;
	}
	
	/**
	 * Sets the pre closure charges.
	 *
	 * @param preClosureCharges the new pre closure charges
	 */
	public void setPreClosureCharges(float preClosureCharges) {
		this.preClosureCharges = preClosureCharges;
	}
	
	/**
	 * Gets the date.
	 *
	 * @return the date
	 */
	public Calendar getDate() {
		return date;
	}
	
	/**
	 * Sets the date.
	 *
	 * @param date the new date
	 */
	public void setDate(Calendar date) {
		this.date = date;
	}
	
	/**
	 * Gets the amount.
	 *
	 * @return the amount
	 */
	public float getAmount() {
		return amount;
	}
	
	/**
	 * Sets the amount.
	 *
	 * @param amount the new amount
	 */
	public void setAmount(float amount) {
		this.amount = amount;
	}
	
	/**
	 * Gets the morgage noc.
	 *
	 * @return the morgage noc
	 */
	public String getMorgageNoc() {
		return morgageNoc;
	}
	
	/**
	 * Sets the morgage noc.
	 *
	 * @param morgageNoc the new morgage noc
	 */
	public void setMorgageNoc(String morgageNoc) {
		this.morgageNoc = morgageNoc;
	}
	
	/**
	 * Instantiates a new chiragh property financials DTO.
	 */
	public ChiraghPropertyFinancialsDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Gets the balance amount.
	 *
	 * @return the balance amount
	 */
	public float getBalanceAmount() {
		return balanceAmount;
	}
	
	/**
	 * Sets the balance amount.
	 *
	 * @param balanceAmount the new balance amount
	 */
	public void setBalanceAmount(float balanceAmount) {
		this.balanceAmount = balanceAmount;
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
	 * Gets the user name.
	 *
	 * @return the user name
	 */
	public String getUserName() {
		return userName;
	}
	
	/**
	 * Sets the user name.
	 *
	 * @param userName the new user name
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	/**
	 * Gets the payment schedule.
	 *
	 * @return the payment schedule
	 */
	public String getPaymentSchedule() {
		return paymentSchedule;
	}
	
	/**
	 * Sets the payment schedule.
	 *
	 * @param paymentSchedule the new payment schedule
	 */
	public void setPaymentSchedule(String paymentSchedule) {
		this.paymentSchedule = paymentSchedule;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getBankOther() {
		return bankOther;
	}

	public void setBankOther(String bankOther) {
		this.bankOther = bankOther;
	}
	
	

}
