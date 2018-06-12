package com.bestercapitalmedia.chiragh.property;

import java.util.Calendar;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class ChiraghPropertyFinancialsDTO {

	String userName;
	int propertyId;
	float listedPrice;
	float originalPrice;
	float paidAmount;
	float serviceCharge;
	String morgageStatus;
	String morgageRegNo;
	String bank;
	float morgageAmount;
	float preClosureCharges;
	String paymentSchedule;
	Calendar date;
	float amount;
	String morgageNoc;
	float balanceAmount;
	
	public float getListedPrice() {
		return listedPrice;
	}
	public void setListedPrice(float listedPrice) {
		this.listedPrice = listedPrice;
	}
	public float getOriginalPrice() {
		return originalPrice;
	}
	public void setOriginalPrice(float originalPrice) {
		this.originalPrice = originalPrice;
	}
	public float getPaidAmount() {
		return paidAmount;
	}
	public void setPaidAmount(float paidAmount) {
		this.paidAmount = paidAmount;
	}
	public float getServiceCharge() {
		return serviceCharge;
	}
	public void setServiceCharge(float serviceCharge) {
		this.serviceCharge = serviceCharge;
	}
	public String getMorgageStatus() {
		return morgageStatus;
	}
	public void setMorgageStatus(String morgageStatus) {
		this.morgageStatus = morgageStatus;
	}
	public String getMorgageRegNo() {
		return morgageRegNo;
	}
	public void setMorgageRegNo(String morgageRegNo) {
		this.morgageRegNo = morgageRegNo;
	}
	public String getBank() {
		return bank;
	}
	public void setBank(String bank) {
		this.bank = bank;
	}
	public float getMorgageAmount() {
		return morgageAmount;
	}
	public void setMorgageAmount(float morgageAmount) {
		this.morgageAmount = morgageAmount;
	}
	public float getPreClosureCharges() {
		return preClosureCharges;
	}
	public void setPreClosureCharges(float preClosureCharges) {
		this.preClosureCharges = preClosureCharges;
	}
	
	public Calendar getDate() {
		return date;
	}
	public void setDate(Calendar date) {
		this.date = date;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	public String getMorgageNoc() {
		return morgageNoc;
	}
	public void setMorgageNoc(String morgageNoc) {
		this.morgageNoc = morgageNoc;
	}
	public ChiraghPropertyFinancialsDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public float getBalanceAmount() {
		return balanceAmount;
	}
	public void setBalanceAmount(float balanceAmount) {
		this.balanceAmount = balanceAmount;
	}
	public int getPropertyId() {
		return propertyId;
	}
	public void setPropertyId(int propertyId) {
		this.propertyId = propertyId;
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPaymentSchedule() {
		return paymentSchedule;
	}
	public void setPaymentSchedule(String paymentSchedule) {
		this.paymentSchedule = paymentSchedule;
	}
	

}
