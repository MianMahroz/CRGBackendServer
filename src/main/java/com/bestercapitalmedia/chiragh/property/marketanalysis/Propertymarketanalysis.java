
package com.bestercapitalmedia.chiragh.property.marketanalysis;

import java.io.Serializable;

import java.lang.StringBuilder;


import java.util.Set;

import javax.persistence.Id;

import javax.xml.bind.annotation.*;

import org.hibernate.annotations.GeneratorType;

import com.bestercapitalmedia.chiragh.property.Chiraghproperty;
import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

/**
 */

@Entity
@Table(catalog = "chiraghdatabase", name = "propertymarketanalysis")
public class Propertymarketanalysis implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 */

	@Column(name = "property_Market_Analysis", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	Integer propertyMarketAnalysisField;
	/**
	 */

	@Column(name = "property_Area", length = 225)
	@Basic(fetch = FetchType.EAGER)

	
	String propertyArea;
	/**
	 */

	@Column(name = "property_Amount", precision = 12)
	@Basic(fetch = FetchType.EAGER)

	
	float propertyAmount;
	/**
	 */

	@Column(name = "lowest_Bid", precision = 12)
	@Basic(fetch = FetchType.EAGER)

	
	float lowestBid;
	/**
	 */

	@Column(name = "highest_Bid", precision = 12)
	@Basic(fetch = FetchType.EAGER)

	
	float highestBid;
	/**
	 */

	@Column(name = "recommended_Price", precision = 12)
	@Basic(fetch = FetchType.EAGER)

	
	float recommendedPrice;
	/**
	 */

	@Column(name = "current_Price", precision = 12)
	@Basic(fetch = FetchType.EAGER)

	
	float currentPrice;
	/**
	 */

	@Column(name = "percentage_Increased_Since_Last_Year", precision = 12)
	@Basic(fetch = FetchType.EAGER)

	
	float percentageIncreasedSinceLastYear;
	/**
	 */

	@Column(name = "price_Per_Sqft", precision = 12)
	@Basic(fetch = FetchType.EAGER)

	
	float pricePerSqft;

	/**
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "property_Id", referencedColumnName = "property_Id") })
	@JsonBackReference
	Chiraghproperty chiraghproperty;

	/**
	 */
	public void setPropertyMarketAnalysisField(Integer propertyMarketAnalysisField) {
		this.propertyMarketAnalysisField = propertyMarketAnalysisField;
	}

	/**
	 */
	public Integer getPropertyMarketAnalysisField() {
		return this.propertyMarketAnalysisField;
	}

	/**
	 */
	public void setPropertyArea(String propertyArea) {
		this.propertyArea = propertyArea;
	}

	/**
	 */
	public String getPropertyArea() {
		return this.propertyArea;
	}

	/**
	 */
	public void setPropertyAmount(float propertyAmount) {
		this.propertyAmount = propertyAmount;
	}

	/**
	 */
	public float getPropertyAmount() {
		return this.propertyAmount;
	}

	/**
	 */
	public void setLowestBid(float lowestBid) {
		this.lowestBid = lowestBid;
	}

	/**
	 */
	public float getLowestBid() {
		return this.lowestBid;
	}

	/**
	 */
	public void setHighestBid(float highestBid) {
		this.highestBid = highestBid;
	}

	/**
	 */
	public float getHighestBid() {
		return this.highestBid;
	}

	/**
	 */
	public void setRecommendedPrice(float recommendedPrice) {
		this.recommendedPrice = recommendedPrice;
	}

	/**
	 */
	public float getRecommendedPrice() {
		return this.recommendedPrice;
	}

	/**
	 */
	public void setCurrentPrice(float currentPrice) {
		this.currentPrice = currentPrice;
	}

	/**
	 */
	public float getCurrentPrice() {
		return this.currentPrice;
	}

	/**
	 */
	public void setPercentageIncreasedSinceLastYear(float percentageIncreasedSinceLastYear) {
		this.percentageIncreasedSinceLastYear = percentageIncreasedSinceLastYear;
	}

	/**
	 */
	public float getPercentageIncreasedSinceLastYear() {
		return this.percentageIncreasedSinceLastYear;
	}

	/**
	 */
	public void setPricePerSqft(float pricePerSqft) {
		this.pricePerSqft = pricePerSqft;
	}

	/**
	 */
	public float getPricePerSqft() {
		return this.pricePerSqft;
	}

	/**
	 */
	public void setChiraghproperty(Chiraghproperty chiraghproperty) {
		this.chiraghproperty = chiraghproperty;
	}

	/**
	 */
	public Chiraghproperty getChiraghproperty() {
		return chiraghproperty;
	}

	/**
	 */
	public Propertymarketanalysis() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
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

	/**
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (int) (prime * result + ((propertyMarketAnalysisField == null) ? 0 : propertyMarketAnalysisField.hashCode()));
		return result;
	}

	/**
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
