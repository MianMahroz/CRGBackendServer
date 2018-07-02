
package com.bestercapitalmedia.chiragh.city;

import java.io.Serializable;

import java.lang.StringBuilder;

import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.Id;


import com.bestercapitalmedia.chiragh.country.Country;
import com.bestercapitalmedia.chiragh.user.Chiraghuser;
import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

// TODO: Auto-generated Javadoc
/**
 * The Class City.
 */

@Entity

@Table(catalog = "chiraghdatabase", name = "city")

public class City implements Serializable {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The city id. */

	@Column(name = "city_Id", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Integer cityId;
	
	/** The name. */

	@Column(name = "name", length = 225)
	@Basic(fetch = FetchType.EAGER)
	String name;

	/** The country. */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "country_Id", referencedColumnName = "country_Id") })
	@JsonBackReference
	Country country;
	
	/** The chiraghusers. */
	@OneToMany(mappedBy = "city", fetch = FetchType.LAZY)
	java.util.Set<Chiraghuser> chiraghusers;

	/**
	 * Sets the city id.
	 *
	 * @param cityId the new city id
	 */
	public void setCityId(Integer cityId) {
		this.cityId = cityId;
	}

	/**
	 * Gets the city id.
	 *
	 * @return the city id
	 */
	public Integer getCityId() {
		return this.cityId;
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
	 * Sets the country.
	 *
	 * @param country the new country
	 */
	public void setCountry(Country country) {
		this.country = country;
	}

	/**
	 * Gets the country.
	 *
	 * @return the country
	 */
	public Country getCountry() {
		return country;
	}

	/**
	 * Sets the chiraghusers.
	 *
	 * @param chiraghusers the new chiraghusers
	 */
	public void setChiraghusers(Set<Chiraghuser> chiraghusers) {
		this.chiraghusers = chiraghusers;
	}

	/**
	 * Gets the chiraghusers.
	 *
	 * @return the chiraghusers
	 */
	public Set<Chiraghuser> getChiraghusers() {
		if (chiraghusers == null) {
			chiraghusers = new java.util.LinkedHashSet<Chiraghuser>();
		}
		return chiraghusers;
	}

	/**
	 * Instantiates a new city.
	 */
	public City() {
	}

	
}
