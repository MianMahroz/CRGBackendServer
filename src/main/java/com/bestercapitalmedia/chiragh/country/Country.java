
package com.bestercapitalmedia.chiragh.country;

import java.io.Serializable;

import java.lang.StringBuilder;

import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.Id;

import javax.xml.bind.annotation.*;

import com.bestercapitalmedia.chiragh.city.City;

import javax.persistence.*;

/**
 */

@Entity
@Table(catalog = "dbchiraghupdated", name = "country")
public class Country implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 */

	@Column(name = "country_Id", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Integer countryId;
	/**
	 */

	@Column(name = "name", length = 225)
	@Basic(fetch = FetchType.EAGER)

	
	String name;

	/**
	 */
	@OneToMany(mappedBy = "country", fetch = FetchType.LAZY)

	java.util.Set<City> cities;

	/**
	 */
	public void setCountryId(Integer countryId) {
		this.countryId = countryId;
	}

	/**
	 */
	public Integer getCountryId() {
		return this.countryId;
	}

	/**
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 */
	public String getName() {
		return this.name;
	}

	/**
	 */
	public void setCities(Set<City> cities) {
		this.cities = cities;
	}

	/**
	 */
	public Set<City> getCities() {
		if (cities == null) {
			cities = new java.util.LinkedHashSet<City>();
		}
		return cities;
	}

	/**
	 */
	public Country() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(Country that) {
		setCountryId(that.getCountryId());
		setName(that.getName());
		setCities(new java.util.LinkedHashSet<City>(that.getCities()));
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("countryId=[").append(countryId).append("] ");
		buffer.append("name=[").append(name).append("] ");

		return buffer.toString();
	}

	/**
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (int) (prime * result + ((countryId == null) ? 0 : countryId.hashCode()));
		return result;
	}

	/**
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
