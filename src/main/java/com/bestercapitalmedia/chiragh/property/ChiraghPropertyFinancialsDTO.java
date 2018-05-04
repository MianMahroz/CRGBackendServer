package com.bestercapitalmedia.chiragh.property;

import java.util.Calendar;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class ChiraghPropertyFinancialsDTO {

	float listedPrice;
	float originalPrice;
	float paidAmount;
	float serviceCharge;
	String morgageStatus;
	String morgageRegNo;
	String bank;
	float morgageAmount;
	float preClosureCharges;
	Calendar paymentSchedule;
	Calendar date;
	float amount;
	String morgageNoc;
	
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
	public Calendar getPaymentSchedule() {
		return paymentSchedule;
	}
	public void setPaymentSchedule(Calendar paymentSchedule) {
		this.paymentSchedule = paymentSchedule;
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

}
