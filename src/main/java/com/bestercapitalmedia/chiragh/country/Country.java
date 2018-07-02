
package com.bestercapitalmedia.chiragh.country;

import java.io.Serializable;

import java.lang.StringBuilder;

import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.Id;



import com.bestercapitalmedia.chiragh.city.City;

import javax.persistence.*;

// TODO: Auto-generated Javadoc
/**
 * The Class Country.
 */

@Entity
@Table(catalog = "dbchiraghupdated", name = "country")
public class Country implements Serializable {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The country id. */

	@Column(name = "country_Id", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Integer countryId;
	
	/** The name. */

	@Column(name = "name", length = 225)
	@Basic(fetch = FetchType.EAGER)

	
	String name;

	/** The cities. */
	@OneToMany(mappedBy = "country", fetch = FetchType.LAZY)

	java.util.Set<City> cities;

	/**
	 * Sets the country id.
	 *
	 * @param countryId the new country id
	 */
	public void setCountryId(Integer countryId) {
		this.countryId = countryId;
	}

	/**
	 * Gets the country id.
	 *
	 * @return the country id
	 */
	public Integer getCountryId() {
		return this.countryId;
	}

	/**
	 * Sets the name.
	 *
	 * @param name the new name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * Sets the cities.
	 *
	 * @param cities the new cities
	 */
	public void setCities(Set<City> cities) {
		this.cities = cities;
	}

	/**
	 * Gets the cities.
	 *
	 * @return the cities
	 */
	public Set<City> getCities() {
		if (cities == null) {
			cities = new java.util.LinkedHashSet<City>();
		}
		return cities;
	}

	/**
	 * Instantiates a new country.
	 */
	public Country() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 * @param that the that
	 */
	public void copy(Country that) {
		setCountryId(that.getCountryId());
		setName(that.getName());
		setCities(new java.util.LinkedHashSet<City>(that.getCities()));
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 * @return the string
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("countryId=[").append(countryId).append("] ");
		buffer.append("name=[").append(name).append("] ");

		return buffer.toString();
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (int) (prime * result + ((countryId == null) ? 0 : countryId.hashCode()));
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof Country))
			return false;
		Country equalCheck = (Country) obj;
		if ((countryId == null && equalCheck.countryId != null) || (countryId != null && equalCheck.countryId == null))
			return false;
		if (countryId != null && !countryId.equals(equalCheck.countryId))
			return false;
		return true;
	}
}
