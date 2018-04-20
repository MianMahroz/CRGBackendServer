
package com.bestercapitalmedia.chiragh.city;

import java.io.Serializable;

import java.lang.StringBuilder;

import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.Id;

import javax.xml.bind.annotation.*;

import com.bestercapitalmedia.chiragh.country.Country;
import com.bestercapitalmedia.chiragh.user.Chiraghuser;

import javax.persistence.*;

/**
 */

@Entity

@Table(catalog = "chiraghdatabase", name = "city")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "TestEntities/com/bestercapitalmedia/chiragh", name = "City")
@XmlRootElement(namespace = "TestEntities/com/bestercapitalmedia/chiragh")
public class City implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 */

	@Column(name = "city_Id", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@XmlElement
	Integer cityId;
	/**
	 */

	@Column(name = "name", length = 225)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String name;

	/**
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "country_Id", referencedColumnName = "country_Id") })
	@XmlTransient
	Country country;
	/**
	 */
	@OneToMany(mappedBy = "city", fetch = FetchType.LAZY)

	@XmlElement(name = "", namespace = "")
	java.util.Set<Chiraghuser> chiraghusers;

	/**
	 */
	public void setCityId(Integer cityId) {
		this.cityId = cityId;
	}

	/**
	 */
	public Integer getCityId() {
		return this.cityId;
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
	public void setCountry(Country country) {
		this.country = country;
	}

	/**
	 */
	public Country getCountry() {
		return country;
	}

	/**
	 */
	public void setChiraghusers(Set<Chiraghuser> chiraghusers) {
		this.chiraghusers = chiraghusers;
	}

	/**
	 */
	public Set<Chiraghuser> getChiraghusers() {
		if (chiraghusers == null) {
			chiraghusers = new java.util.LinkedHashSet<Chiraghuser>();
		}
		return chiraghusers;
	}

	/**
	 */
	public City() {
	}

	
}
