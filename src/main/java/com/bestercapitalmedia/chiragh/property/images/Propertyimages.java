
package com.bestercapitalmedia.chiragh.property.images;

import java.io.Serializable;

import java.lang.StringBuilder;

import java.util.Set;

import javax.persistence.Id;

import javax.xml.bind.annotation.*;

import com.bestercapitalmedia.chiragh.property.Chiraghproperty;
import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

/**
 */

@Entity
@Table(catalog = "chiraghdatabase", name = "propertyimages")
public class Propertyimages implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 */

	@Column(name = "property_Image_Id", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	Integer propertyImageId;
	/**
	 */

	@Column(name = "image_Name", length = 225)
	@Basic(fetch = FetchType.EAGER)

	
	String imageName;
	/**
	 */

	@Column(name = "image_Url", length = 225)
	@Basic(fetch = FetchType.EAGER)

	
	String imageUrl;

	/**
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "property_Id", referencedColumnName = "property_Id") })
	@JsonBackReference
	Chiraghproperty chiraghproperty;

	/**
	 */
	public void setPropertyImageId(Integer propertyImageId) {
		this.propertyImageId = propertyImageId;
	}

	/**
	 */
	public Integer getPropertyImageId() {
		return this.propertyImageId;
	}

	/**
	 */
	public void setImageName(String imageName) {
		this.imageName = imageName;
	}

	/**
	 */
	public String getImageName() {
		return this.imageName;
	}

	/**
	 */
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	/**
	 */
	public String getImageUrl() {
		return this.imageUrl;
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
	public Propertyimages() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(Propertyimages that) {
		setPropertyImageId(that.getPropertyImageId());
		setImageName(that.getImageName());
		setImageUrl(that.getImageUrl());
		setChiraghproperty(that.getChiraghproperty());
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("propertyImageId=[").append(propertyImageId).append("] ");
		buffer.append("imageName=[").append(imageName).append("] ");
		buffer.append("imageUrl=[").append(imageUrl).append("] ");

		return buffer.toString();
	}

	/**
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (int) (prime * result + ((propertyImageId == null) ? 0 : propertyImageId.hashCode()));
		return result;
	}

	/**
	 */
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof Propertyimages))
			return false;
		Propertyimages equalCheck = (Propertyimages) obj;
		if ((propertyImageId == null && equalCheck.propertyImageId != null) || (propertyImageId != null && equalCheck.propertyImageId == null))
			return false;
		if (propertyImageId != null && !propertyImageId.equals(equalCheck.propertyImageId))
			return false;
		return true;
	}
}
