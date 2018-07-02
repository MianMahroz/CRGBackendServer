
package com.bestercapitalmedia.chiragh.property.marketanalysis;

import java.io.Serializable;

import java.lang.StringBuilder;


import java.util.Set;

import javax.persistence.Id;



import org.hibernate.annotations.GeneratorType;

import com.bestercapitalmedia.chiragh.property.Chiraghproperty;
import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

// TODO: Auto-generated Javadoc
/**
 * The Class Propertymarketanalysis.
 */

@Entity
@Table(catalog = "chiraghdatabase", name = "propertymarketanalysis")
public class Propertymarketanalysis implements Serializable {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The property market analysis field. */

	@Column(name = "property_Market_Analysis", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	Integer propertyMarketAnalysisField;
	
	/** The property area. */

	@Column(name = "property_Area", length = 225)
	@Basic(fetch = FetchType.EAGER)

	
	String propertyArea;
	
	/** The property amount. */

	@Column(name = "property_Amount", precision = 12)
	@Basic(fetch = FetchType.EAGER)

	
	float propertyAmount;
	
	/** The lowest bid. */

	@Column(name = "lowest_Bid", precision = 12)
	@Basic(fetch = FetchType.EAGER)

	
	float lowestBid;
	
	/** The highest bid. */

	@Column(name = "highest_Bid", precision = 12)
	@Basic(fetch = FetchType.EAGER)

	
	float highestBid;
	
	/** The recommended price. */

	@Column(name = "recommended_Price", precision = 12)
	@Basic(fetch = FetchType.EAGER)

	
	float recommendedPrice;
	
	/** The current price. */

	@Column(name = "current_Price", precision = 12)
	@Basic(fetch = FetchType.EAGER)

	
	float currentPrice;
	
	/** The percentage increased since last year. */

	@Column(name = "percentage_Increased_Since_Last_Year", precision = 12)
	@Basic(fetch = FetchType.EAGER)

	
	float percentageIncreasedSinceLastYear;
	
	/** The price per sqft. */

	@Column(name = "price_Per_Sqft", precision = 12)
	@Basic(fetch = FetchType.EAGER)

	
	float pricePerSqft;

	/** The chiraghproperty. */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "property_Id", referencedColumnName = "property_Id") })
	@JsonBackReference
	Chiraghproperty chiraghproperty;

	/**
	 * Sets the property market analysis field.
	 *
	 * @param propertyMarketAnalysisField the new property market analysis field
	 */
	public void setPropertyMarketAnalysisField(Integer propertyMarketAnalysisField) {
		this.propertyMarketAnalysisField = propertyMarketAnalysisField;
	}

	/**
	 * Gets the property market analysis field.
	 *
	 * @return the property market analysis field
	 */
	public Integer getPropertyMarketAnalysisField() {
		return this.propertyMarketAnalysisField;
	}

	/**
	 * Sets the property area.
	 *
	 * @param propertyArea the new property area
	 */
	public void setPropertyArea(String propertyArea) {
		this.propertyArea = propertyArea;
	}

	/**
	 * Gets the property area.
	 *
	 * @return the property area
	 */
	public String getPropertyArea() {
		return this.propertyArea;
	}

	/**
	 * Sets the property amount.
	 *
	 * @param propertyAmount the new property amount
	 */
	public void setPropertyAmount(float propertyAmount) {
		this.propertyAmount = propertyAmount;
	}

	/**
	 * Gets the property amount.
	 *
	 * @return the property amount
	 */
	public float getPropertyAmount() {
		return this.propertyAmount;
	}

	/**
	 * Sets the lowest bid.
	 *
	 * @param lowestBid the new lowest bid
	 */
	public void setLowestBid(float lowestBid) {
		this.lowestBid = lowestBid;
	}

	/**
	 * Gets the lowest bid.
	 *
	 * @return the lowest bid
	 */
	public float getLowestBid() {
		return this.lowestBid;
	}

	/**
	 * Sets the highest bid.
	 *
	 * @param highestBid the new highest bid
	 */
	public void setHighestBid(float highestBid) {
		this.highestBid = highestBid;
	}

	/**
	 * Gets the highest bid.
	 *
	 * @return the highest bid
	 */
	public float getHighestBid() {
		return this.highestBid;
	}

	/**
	 * Sets the recommended price.
	 *
	 * @param recommendedPrice the new recommended price
	 */
	public void setRecommendedPrice(float recommendedPrice) {
		this.recommendedPrice = recommendedPrice;
	}

	/**
	 * Gets the recommended price.
	 *
	 * @return the recommended price
	 */
	public float getRecommendedPrice() {
		return this.recommendedPrice;
	}

	/**
	 * Sets the current price.
	 *
	 * @param currentPrice the new current price
	 */
	public void setCurrentPrice(float currentPrice) {
		this.currentPrice = currentPrice;
	}

	/**
	 * Gets the current price.
	 *
	 * @return the current price
	 */
	public float getCurrentPrice() {
		return this.currentPrice;
	}

	/**
	 * Sets the percentage increased since last year.
	 *
	 * @param percentageIncreasedSinceLastYear the new percentage increased since last year
	 */
	public void setPercentageIncreasedSinceLastYear(float percentageIncreasedSinceLastYear) {
		this.percentageIncreasedSinceLastYear = percentageIncreasedSinceLastYear;
	}

	/**
	 * Gets the percentage increased since last year.
	 *
	 * @return the percentage increased since last year
	 */
	public float getPercentageIncreasedSinceLastYear() {
		return this.percentageIncreasedSinceLastYear;
	}

	/**
	 * Sets the price per sqft.
	 *
	 * @param pricePerSqft the new price per sqft
	 */
	public void setPricePerSqft(float pricePerSqft) {
		this.pricePerSqft = pricePerSqft;
	}

	/**
	 * Gets the price per sqft.
	 *
	 * @return the price per sqft
	 */
	public float getPricePerSqft() {
		return this.pricePerSqft;
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
	 * Gets the chiraghproperty.
	 *
	 * @return the chiraghproperty
	 */
	public Chiraghproperty getChiraghproperty() {
		return chiraghproperty;
	}

	/**
	 * Instantiates a new propertymarketanalysis.
	 */
	public Propertymarketanalysis() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 * @param that the that
	 */
	public void copy(Propertymarketanalysis that) {
		setPropertyMarketAnalysisField(that.getPropertyMarketAnalysisField());
		setPropertyArea(that.getPropertyArea());
		setPropertyAmount(that.getPropertyAmount());
		setLowestBid(that.getLowestBid());
		setHighestBid(that.getHighestBid());
		setRecommendedPrice(that.getRecommendedPrice());
		setCurrentPrice(that.getCurrentPrice());
		setPercentageIncreasedSinceLastYear(that.getPercentageIncreasedSinceLastYear());
		setPricePerSqft(that.getPricePerSqft());
		setChiraghproperty(that.getChiraghproperty());
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 * @return the string
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("propertyMarketAnalysisField=[").append(propertyMarketAnalysisField).append("] ");
		buffer.append("propertyArea=[").append(propertyArea).append("] ");
		buffer.append("propertyAmount=[").append(propertyAmount).append("] ");
		buffer.append("lowestBid=[").append(lowestBid).append("] ");
		buffer.append("highestBid=[").append(highestBid).append("] ");
		buffer.append("recommendedPrice=[").append(recommendedPrice).append("] ");
		buffer.append("currentPrice=[").append(currentPrice).append("] ");
		buffer.append("percentageIncreasedSinceLastYear=[").append(percentageIncreasedSinceLastYear).append("] ");
		buffer.append("pricePerSqft=[").append(pricePerSqft).append("] ");

		return buffer.toString();
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (int) (prime * result + ((propertyMarketAnalysisField == null) ? 0 : propertyMarketAnalysisField.hashCode()));
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof Propertymarketanalysis))
			return false;
		Propertymarketanalysis equalCheck = (Propertymarketanalysis) obj;
		if ((propertyMarketAnalysisField == null && equalCheck.propertyMarketAnalysisField != null) || (propertyMarketAnalysisField != null && equalCheck.propertyMarketAnalysisField == null))
			return false;
		if (propertyMarketAnalysisField != null && !propertyMarketAnalysisField.equals(equalCheck.propertyMarketAnalysisField))
			return false;
		return true;
	}
}
