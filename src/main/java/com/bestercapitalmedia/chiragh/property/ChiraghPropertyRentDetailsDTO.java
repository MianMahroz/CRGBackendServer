package com.bestercapitalmedia.chiragh.property;

import java.util.Calendar;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

// TODO: Auto-generated Javadoc
/**
 * The Class ChiraghPropertyRentDetailsDTO.
 */
public class ChiraghPropertyRentDetailsDTO {

	/** The user name. */
	String userName;
	
	/** The property id. */
	int propertyId;
	
	/** The lease start date. */
//	Calendar leaseStartDate;
	
	/** The lease expiry date. */
//	Calendar leaseExpiryDate;
	
	/** The tenant name. */
	String tenantName;
	
	/** The tenancy contract upload. */
	String tenancyContractUpload;
	
	/** The is rented. */
	String isRented;
	
	/** The is vacant. */
	String isVacant;
	
	/** The rental ejari no. */
	Integer rentalEjariNo;
	
	/** The rental annual rent. */
	float rentalAnnualRent;
	
	/** The rental payment checks. */
	Integer rentalPaymentChecks;
	
	/** The payment structure. */
	String paymentStructure;
	
	/** The seller user name. */
	String sellerUserName;
	
	/** The date received. */
	Calendar dateReceived;
	
	
	String status;
	/**
	 * Gets the lease start date.
	 *
	 * @return the lease start date
	 */
	
	
	/**
	 * Gets the tenant name.
	 *
	 * @return the tenant name
	 */
	public String getTenantName() {
		return tenantName;
	}
	
	/**
	 * Sets the tenant name.
	 *
	 * @param tenantName the new tenant name
	 */
	public void setTenantName(String tenantName) {
		this.tenantName = tenantName;
	}
	
	/**
	 * Gets the tenancy contract upload.
	 *
	 * @return the tenancy contract upload
	 */
	public String getTenancyContractUpload() {
		return tenancyContractUpload;
	}
	
	/**
	 * Sets the tenancy contract upload.
	 *
	 * @param tenancyContractUpload the new tenancy contract upload
	 */
	public void setTenancyContractUpload(String tenancyContractUpload) {
		this.tenancyContractUpload = tenancyContractUpload;
	}
	
	/**
	 * Gets the rental ejari no.
	 *
	 * @return the rental ejari no
	 */
	public Integer getRentalEjariNo() {
		return rentalEjariNo;
	}
	
	/**
	 * Sets the rental ejari no.
	 *
	 * @param rentalEjariNo the new rental ejari no
	 */
	public void setRentalEjariNo(Integer rentalEjariNo) {
		this.rentalEjariNo = rentalEjariNo;
	}
	
	/**
	 * Gets the rental annual rent.
	 *
	 * @return the rental annual rent
	 */
	public float getRentalAnnualRent() {
		return rentalAnnualRent;
	}
	
	/**
	 * Sets the rental annual rent.
	 *
	 * @param rentalAnnualRent the new rental annual rent
	 */
	public void setRentalAnnualRent(float rentalAnnualRent) {
		this.rentalAnnualRent = rentalAnnualRent;
	}
	
	/**
	 * Gets the rental payment checks.
	 *
	 * @return the rental payment checks
	 */
	public Integer getRentalPaymentChecks() {
		return rentalPaymentChecks;
	}
	
	/**
	 * Sets the rental payment checks.
	 *
	 * @param rentalPaymentChecks the new rental payment checks
	 */
	public void setRentalPaymentChecks(Integer rentalPaymentChecks) {
		this.rentalPaymentChecks = rentalPaymentChecks;
	}
	
	/**
	 * Instantiates a new chiragh property rent details DTO.
	 */
	public ChiraghPropertyRentDetailsDTO() {
		super();
		// TODO Auto-generated constructor stub
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
	 * Gets the payment structure.
	 *
	 * @return the payment structure
	 */
	public String getPaymentStructure() {
		return paymentStructure;
	}
	
	/**
	 * Sets the payment structure.
	 *
	 * @param paymentStructure the new payment structure
	 */
	public void setPaymentStructure(String paymentStructure) {
		this.paymentStructure = paymentStructure;
	}
	
	/**
	 * Sets the checks if is rented.
	 *
	 * @param isRented the new checks if is rented
	 */
	public void setIsRented(String isRented) {
		this.isRented = isRented;
	}
	
	/**
	 * Sets the checks if is vacant.
	 *
	 * @param isVacant the new checks if is vacant
	 */
	public void setIsVacant(String isVacant) {
		this.isVacant = isVacant;
	}
	
	/**
	 * Gets the checks if is rented.
	 *
	 * @return the checks if is rented
	 */
	public String getIsRented() {
		return isRented;
	}
	
	/**
	 * Gets the checks if is vacant.
	 *
	 * @return the checks if is vacant
	 */
	public String getIsVacant() {
		return isVacant;
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
	 * Gets the seller user name.
	 *
	 * @return the seller user name
	 */
	public String getSellerUserName() {
		return sellerUserName;
	}
	
	/**
	 * Sets the seller user name.
	 *
	 * @param sellerUserName the new seller user name
	 */
	public void setSellerUserName(String sellerUserName) {
		this.sellerUserName = sellerUserName;
	}
	
	/**
	 * Gets the date received.
	 *
	 * @return the date received
	 */
	public Calendar getDateReceived() {
		return dateReceived;
	}
	
	/**
	 * Sets the date received.
	 *
	 * @param dateReceived the new date received
	 */
	public void setDateReceived(Calendar dateReceived) {
		this.dateReceived = dateReceived;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
