package com.bestercapitalmedia.chiragh.property;

import java.util.Calendar;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class ChiraghPropertyRentDetailsDTO {

	String userName;
	int propertyId;
	Calendar leaseStartDate;
	Calendar leaseExpiryDate;
	String tenantName;
	String tenancyContractUpload;
	String isRented;
	String isVacant;
	Integer rentalEjariNo;
	float rentalAnnualRent;
	Integer rentalPaymentChecks;
	String paymentStructure;
	String sellerUserName;
	Calendar dateReceived;
	
	
	
	public Calendar getLeaseStartDate() {
		return leaseStartDate;
	}
	public void setLeaseStartDate(Calendar leaseStartDate) {
		this.leaseStartDate = leaseStartDate;
	}
	public Calendar getLeaseExpiryDate() {
		return leaseExpiryDate;
	}
	public void setLeaseExpiryDate(Calendar leaseExpiryDate) {
		this.leaseExpiryDate = leaseExpiryDate;
	}
	public String getTenantName() {
		return tenantName;
	}
	public void setTenantName(String tenantName) {
		this.tenantName = tenantName;
	}
	public String getTenancyContractUpload() {
		return tenancyContractUpload;
	}
	public void setTenancyContractUpload(String tenancyContractUpload) {
		this.tenancyContractUpload = tenancyContractUpload;
	}
	
	public Integer getRentalEjariNo() {
		return rentalEjariNo;
	}
	public void setRentalEjariNo(Integer rentalEjariNo) {
		this.rentalEjariNo = rentalEjariNo;
	}
	public float getRentalAnnualRent() {
		return rentalAnnualRent;
	}
	public void setRentalAnnualRent(float rentalAnnualRent) {
		this.rentalAnnualRent = rentalAnnualRent;
	}
	public Integer getRentalPaymentChecks() {
		return rentalPaymentChecks;
	}
	public void setRentalPaymentChecks(Integer rentalPaymentChecks) {
		this.rentalPaymentChecks = rentalPaymentChecks;
	}
	public ChiraghPropertyRentDetailsDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getPropertyId() {
		return propertyId;
	}
	public void setPropertyId(int propertyId) {
		this.propertyId = propertyId;
	}
	public String getPaymentStructure() {
		return paymentStructure;
	}
	public void setPaymentStructure(String paymentStructure) {
		this.paymentStructure = paymentStructure;
	}
	public void setIsRented(String isRented) {
		this.isRented = isRented;
	}
	public void setIsVacant(String isVacant) {
		this.isVacant = isVacant;
	}
	public String getIsRented() {
		return isRented;
	}
	public String getIsVacant() {
		return isVacant;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getSellerUserName() {
		return sellerUserName;
	}
	public void setSellerUserName(String sellerUserName) {
		this.sellerUserName = sellerUserName;
	}
	public Calendar getDateReceived() {
		return dateReceived;
	}
	public void setDateReceived(Calendar dateReceived) {
		this.dateReceived = dateReceived;
	}
	
	
}
