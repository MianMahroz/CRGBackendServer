
package com.bestercapitalmedia.chiragh.property;

import java.io.Serializable;

import java.lang.StringBuilder;

import java.math.BigDecimal;

import java.util.Calendar;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.xml.bind.annotation.*;

import com.bestercapitalmedia.chiragh.propertybidprocess.Propertybidprocess;
import com.bestercapitalmedia.chiragh.propertybrokerage.Propertybrokerage;
import com.bestercapitalmedia.chiragh.propertyimages.Propertyimages;
import com.bestercapitalmedia.chiragh.propertymarketanalysis.Propertymarketanalysis;
import com.bestercapitalmedia.chiragh.propertytype.Propertytype;
import com.bestercapitalmedia.chiragh.propertyverification.Propertyverification;

import javax.persistence.*;

/**
 */

@Entity
@Table(catalog = "dbchiraghupdated", name = "chiraghproperty")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "TestEntities/com/bestercapitalmedia/chiragh/domain", name = "Chiraghproperty")
@XmlRootElement(namespace = "TestEntities/com/bestercapitalmedia/chiragh/domain")
public class Chiraghproperty implements Serializable {
	private static final long serialVersionUID = 1L;

	

	@Column(name = "property_Id", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Integer propertyId;
	/**
	 */

	@Column(name = "property_Title", length = 225)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String propertyTitle;
	/**
	 */

	@Column(name = "property_Description", length = 225)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String propertyDescription;
	/**
	 */

	@Column(name = "location", length = 225)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String location;
	/**
	 */

	@Column(name = "size_Per_Sqft", precision = 12)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	BigDecimal sizePerSqft;
	/**
	 */

	@Column(name = "address", length = 225)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String address;
	/**
	 */

	@Column(name = "asking_Price", precision = 12)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	BigDecimal askingPrice;
	/**
	 */

	@Column(name = "area_Permit_No", length = 225)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String areaPermitNo;
	/**
	 */

	@Column(name = "property_Reference_No", length = 225)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String propertyReferenceNo;
	/**
	 */

	@Column(name = "price_Per_Sqft", precision = 12)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	BigDecimal pricePerSqft;
	/**
	 */

	@Column(name = "is_Md_Approved")
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	Integer isMdApproved;
	/**
	 */

	@Column(name = "is_Published")
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	Integer isPublished;
	/**
	 */

	@Column(name = "payment_verification_Code", length = 225)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String paymentVerificationCode;
	/**
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "bid_Clock_Starts")
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	Calendar bidClockStarts;
	/**
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "bid_Clock_Ends")
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	Calendar bidClockEnds;
	/**
	 */

	@Column(name = "no_of_Bedrooms")
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	Integer noOfBedrooms;
	/**
	 */

	@Column(name = "no_of_Baths")
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	Integer noOfBaths;
	/**
	 */

	@Column(name = "is_Mortgage")
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	Integer isMortgage;
	/**
	 */

	@Column(name = "mortgage_Value", precision = 12)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	BigDecimal mortgageValue;
	/**
	 */

	@Column(name = "mortage_Bank", length = 45)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String mortageBank;
	/**
	 */

	@Column(name = "mortgage_Year")
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	Integer mortgageYear;
	/**
	 */

	@Column(name = "is_Rented")
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	Integer isRented;
	/**
	 */

	@Column(name = "rental_Ejari_No")
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	Integer rentalEjariNo;
	/**
	 */

	@Column(name = "rental_Annual_Rent")
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	Integer rentalAnnualRent;
	/**
	 */

	@Column(name = "rental_Payment_Checks")
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	Integer rentalPaymentChecks;
	/**
	 */
	@Temporal(TemporalType.DATE)
	@Column(name = "rental_Expiry_Date")
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	Calendar rentalExpiryDate;
	/**
	 */

	@Column(name = "outdoor_Type", length = 225)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String outdoorType;
	/**
	 */

	@Column(name = "is_Furnished")
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	Integer isFurnished;
	/**
	 */

	@Column(name = "kitchen_Type", length = 225)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String kitchenType;
	/**
	 */

	@Column(name = "is_Maid_Room")
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	Integer isMaidRoom;
	/**
	 */

	@Column(name = "is_Swimming_Pool")
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	Integer isSwimmingPool;
	/**
	 */

	@Column(name = "is_Gyma")
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	Integer isGyma;
	/**
	 */

	@Column(name = "no_of_parking")
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	Integer noOfParking;

	/**
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "property_Type_Id", referencedColumnName = "property_Type_Id") })
	@XmlTransient
	Propertytype propertytype;
	/**
	 */
	@OneToMany(mappedBy = "chiraghproperty", fetch = FetchType.LAZY)

	@XmlElement(name = "", namespace = "")
	java.util.Set<Propertymarketanalysis> propertymarketanalysises;
	/**
	 */
	@OneToMany(mappedBy = "chiraghproperty", fetch = FetchType.LAZY)

	@XmlElement(name = "", namespace = "")
	java.util.Set<Propertybidprocess> propertybidprocesses;
	
	@OneToMany(mappedBy = "chiraghproperty", fetch = FetchType.LAZY)
	@XmlElement(name = "", namespace = "")
	java.util.Set<Propertyimages> propertyimageses;
	/**
	 */
	@OneToMany(mappedBy = "chiraghproperty", fetch = FetchType.LAZY)

	@XmlElement(name = "", namespace = "")
	java.util.Set<Propertybrokerage> propertybrokerages;
	/**
	 */
	@OneToMany(mappedBy = "chiraghproperty", fetch = FetchType.LAZY)

	@XmlElement(name = "", namespace = "")
	java.util.Set<Propertyverification> propertyverifications;

	/**
	 */
	public void setPropertyId(Integer propertyId) {
		this.propertyId = propertyId;
	}

	/**
	 */
	public Integer getPropertyId() {
		return this.propertyId;
	}

	/**
	 */
	public void setPropertyTitle(String propertyTitle) {
		this.propertyTitle = propertyTitle;
	}

	/**
	 */
	public String getPropertyTitle() {
		return this.propertyTitle;
	}

	/**
	 */
	public void setPropertyDescription(String propertyDescription) {
		this.propertyDescription = propertyDescription;
	}

	/**
	 */
	public String getPropertyDescription() {
		return this.propertyDescription;
	}

	/**
	 */
	public void setLocation(String location) {
		this.location = location;
	}

	/**
	 */
	public String getLocation() {
		return this.location;
	}

	/**
	 */
	public void setSizePerSqft(BigDecimal sizePerSqft) {
		this.sizePerSqft = sizePerSqft;
	}

	/**
	 */
	public BigDecimal getSizePerSqft() {
		return this.sizePerSqft;
	}

	/**
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 */
	public String getAddress() {
		return this.address;
	}

	/**
	 */
	public void setAskingPrice(BigDecimal askingPrice) {
		this.askingPrice = askingPrice;
	}

	/**
	 */
	public BigDecimal getAskingPrice() {
		return this.askingPrice;
	}

	/**
	 */
	public void setAreaPermitNo(String areaPermitNo) {
		this.areaPermitNo = areaPermitNo;
	}

	/**
	 */
	public String getAreaPermitNo() {
		return this.areaPermitNo;
	}

	/**
	 */
	public void setPropertyReferenceNo(String propertyReferenceNo) {
		this.propertyReferenceNo = propertyReferenceNo;
	}

	/**
	 */
	public String getPropertyReferenceNo() {
		return this.propertyReferenceNo;
	}

	/**
	 */
	public void setPricePerSqft(BigDecimal pricePerSqft) {
		this.pricePerSqft = pricePerSqft;
	}

	/**
	 */
	public BigDecimal getPricePerSqft() {
		return this.pricePerSqft;
	}

	/**
	 */
	public void setIsMdApproved(Integer isMdApproved) {
		this.isMdApproved = isMdApproved;
	}

	/**
	 */
	public Integer getIsMdApproved() {
		return this.isMdApproved;
	}

	/**
	 */
	public void setIsPublished(Integer isPublished) {
		this.isPublished = isPublished;
	}

	/**
	 */
	public Integer getIsPublished() {
		return this.isPublished;
	}

	/**
	 */
	public void setPaymentVerificationCode(String paymentVerificationCode) {
		this.paymentVerificationCode = paymentVerificationCode;
	}

	/**
	 */
	public String getPaymentVerificationCode() {
		return this.paymentVerificationCode;
	}

	/**
	 */
	public void setBidClockStarts(Calendar bidClockStarts) {
		this.bidClockStarts = bidClockStarts;
	}

	/**
	 */
	public Calendar getBidClockStarts() {
		return this.bidClockStarts;
	}

	/**
	 */
	public void setBidClockEnds(Calendar bidClockEnds) {
		this.bidClockEnds = bidClockEnds;
	}

	/**
	 */
	public Calendar getBidClockEnds() {
		return this.bidClockEnds;
	}

	/**
	 */
	public void setNoOfBedrooms(Integer noOfBedrooms) {
		this.noOfBedrooms = noOfBedrooms;
	}

	/**
	 */
	public Integer getNoOfBedrooms() {
		return this.noOfBedrooms;
	}

	/**
	 */
	public void setNoOfBaths(Integer noOfBaths) {
		this.noOfBaths = noOfBaths;
	}

	/**
	 */
	public Integer getNoOfBaths() {
		return this.noOfBaths;
	}

	/**
	 */
	public void setIsMortgage(Integer isMortgage) {
		this.isMortgage = isMortgage;
	}

	/**
	 */
	public Integer getIsMortgage() {
		return this.isMortgage;
	}

	/**
	 */
	public void setMortgageValue(BigDecimal mortgageValue) {
		this.mortgageValue = mortgageValue;
	}

	/**
	 */
	public BigDecimal getMortgageValue() {
		return this.mortgageValue;
	}

	/**
	 */
	public void setMortageBank(String mortageBank) {
		this.mortageBank = mortageBank;
	}

	/**
	 */
	public String getMortageBank() {
		return this.mortageBank;
	}

	/**
	 */
	public void setMortgageYear(Integer mortgageYear) {
		this.mortgageYear = mortgageYear;
	}

	/**
	 */
	public Integer getMortgageYear() {
		return this.mortgageYear;
	}

	/**
	 */
	public void setIsRented(Integer isRented) {
		this.isRented = isRented;
	}

	/**
	 */
	public Integer getIsRented() {
		return this.isRented;
	}

	/**
	 */
	public void setRentalEjariNo(Integer rentalEjariNo) {
		this.rentalEjariNo = rentalEjariNo;
	}

	/**
	 */
	public Integer getRentalEjariNo() {
		return this.rentalEjariNo;
	}

	/**
	 */
	public void setRentalAnnualRent(Integer rentalAnnualRent) {
		this.rentalAnnualRent = rentalAnnualRent;
	}

	/**
	 */
	public Integer getRentalAnnualRent() {
		return this.rentalAnnualRent;
	}

	/**
	 */
	public void setRentalPaymentChecks(Integer rentalPaymentChecks) {
		this.rentalPaymentChecks = rentalPaymentChecks;
	}

	/**
	 */
	public Integer getRentalPaymentChecks() {
		return this.rentalPaymentChecks;
	}

	/**
	 */
	public void setRentalExpiryDate(Calendar rentalExpiryDate) {
		this.rentalExpiryDate = rentalExpiryDate;
	}

	/**
	 */
	public Calendar getRentalExpiryDate() {
		return this.rentalExpiryDate;
	}

	/**
	 */
	public void setOutdoorType(String outdoorType) {
		this.outdoorType = outdoorType;
	}

	/**
	 */
	public String getOutdoorType() {
		return this.outdoorType;
	}

	/**
	 */
	public void setIsFurnished(Integer isFurnished) {
		this.isFurnished = isFurnished;
	}

	/**
	 */
	public Integer getIsFurnished() {
		return this.isFurnished;
	}

	/**
	 */
	public void setKitchenType(String kitchenType) {
		this.kitchenType = kitchenType;
	}

	/**
	 */
	public String getKitchenType() {
		return this.kitchenType;
	}

	/**
	 */
	public void setIsMaidRoom(Integer isMaidRoom) {
		this.isMaidRoom = isMaidRoom;
	}

	/**
	 */
	public Integer getIsMaidRoom() {
		return this.isMaidRoom;
	}

	/**
	 */
	public void setIsSwimmingPool(Integer isSwimmingPool) {
		this.isSwimmingPool = isSwimmingPool;
	}

	/**
	 */
	public Integer getIsSwimmingPool() {
		return this.isSwimmingPool;
	}

	/**
	 */
	public void setIsGyma(Integer isGyma) {
		this.isGyma = isGyma;
	}

	/**
	 */
	public Integer getIsGyma() {
		return this.isGyma;
	}

	/**
	 */
	public void setNoOfParking(Integer noOfParking) {
		this.noOfParking = noOfParking;
	}

	/**
	 */
	public Integer getNoOfParking() {
		return this.noOfParking;
	}

	/**
	 */
	public void setPropertytype(Propertytype propertytype) {
		this.propertytype = propertytype;
	}

	/**
	 */
	public Propertytype getPropertytype() {
		return propertytype;
	}

	/**
	 */
	public void setPropertymarketanalysises(Set<Propertymarketanalysis> propertymarketanalysises) {
		this.propertymarketanalysises = propertymarketanalysises;
	}

	/**
	 */
	public Set<Propertymarketanalysis> getPropertymarketanalysises() {
		if (propertymarketanalysises == null) {
			propertymarketanalysises = new java.util.LinkedHashSet<Propertymarketanalysis>();
		}
		return propertymarketanalysises;
	}

	/**
	 */
	public void setPropertybidprocesses(Set<Propertybidprocess> propertybidprocesses) {
		this.propertybidprocesses = propertybidprocesses;
	}

	/**
	 */
	public Set<Propertybidprocess> getPropertybidprocesses() {
		if (propertybidprocesses == null) {
			propertybidprocesses = new java.util.LinkedHashSet<Propertybidprocess>();
		}
		return propertybidprocesses;
	}

	

	/**
	 */
	public void setPropertyimageses(Set<Propertyimages> propertyimageses) {
		this.propertyimageses = propertyimageses;
	}

	/**
	 */
	public Set<Propertyimages> getPropertyimageses() {
		if (propertyimageses == null) {
			propertyimageses = new java.util.LinkedHashSet<Propertyimages>();
		}
		return propertyimageses;
	}

	/**
	 */
	public void setPropertybrokerages(Set<Propertybrokerage> propertybrokerages) {
		this.propertybrokerages = propertybrokerages;
	}

	/**
	 */
	public Set<Propertybrokerage> getPropertybrokerages() {
		if (propertybrokerages == null) {
			propertybrokerages = new java.util.LinkedHashSet<Propertybrokerage>();
		}
		return propertybrokerages;
	}

	/**
	 */
	public void setPropertyverifications(Set<Propertyverification> propertyverifications) {
		this.propertyverifications = propertyverifications;
	}

	/**
	 */
	public Set<Propertyverification> getPropertyverifications() {
		if (propertyverifications == null) {
			propertyverifications = new java.util.LinkedHashSet<Propertyverification>();
		}
		return propertyverifications;
	}

	/**
	 */
	public Chiraghproperty() {
	}

	
}
