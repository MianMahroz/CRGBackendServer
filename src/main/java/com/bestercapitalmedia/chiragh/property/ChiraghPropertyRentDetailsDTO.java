package com.bestercapitalmedia.chiragh.property;

import java.util.Calendar;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class ChiraghPropertyRentDetailsDTO {

	Calendar leaseStartDate;
	Calendar leaseExpiryDate;
	String tenantName;
	String tenancyContractUpload;
	Integer isRented;
	Integer isVacant;
	Integer rentalEjariNo;
	float rentalAnnualRent;
	Integer rentalPaymentChecks;
	String payementStructure;
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
	public Integer getIsRented() {
		return isRented;
	}
	public void setIsRented(Integer isRented) {
		this.isRented = isRented;
	}
	public Integer getIsVacant() {
		return isVacant;
	}
	public void setIsVacant(Integer isVacant) {
		this.isVacant = isVacant;
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
	public String getPayementStructure() {
		return payementStructure;
	}
	public void setPayementStructure(String payementStructure) {
		this.payementStructure = payementStructure;
	}
	
}
