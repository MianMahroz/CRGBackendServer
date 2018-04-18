
package com.bestercapitalmedia.chiragh.city;

import java.io.Serializable;

import java.lang.StringBuilder;

import java.util.LinkedHashSet;
import java.util.Set;

import javax.xml.bind.annotation.*;

import com.bestercapitalmedia.chiragh.country.Country;
import com.bestercapitalmedia.chiragh.user.ChiraghUser;

import javax.persistence.*;

/**
 */

@Entity

@Table(catalog = "dbchiraghupdated", name = "city")

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
//	@OneToMany(mappedBy = "chiraghUsers", fetch = FetchType.LAZY)
//	@XmlElement(name = "", namespace = "")
//	java.util.Set<ChiraghUser> chiraghUsers;

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
	public City() {
	}

	
}
