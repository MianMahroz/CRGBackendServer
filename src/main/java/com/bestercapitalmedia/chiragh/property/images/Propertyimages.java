
package com.bestercapitalmedia.chiragh.property.images;

import java.io.Serializable;

import java.lang.StringBuilder;

import java.util.Set;

import javax.persistence.Id;



import com.bestercapitalmedia.chiragh.property.Chiraghproperty;
import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

// TODO: Auto-generated Javadoc
/**
 * The Class Propertyimages.
 */

@Entity
@Table(catalog = "chiraghdatabase", name = "propertyimages")
public class Propertyimages implements Serializable {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The property image id. */

	@Column(name = "property_Image_Id", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	Integer propertyImageId;
	
	/** The image name. */

	@Column(name = "image_Name", length = 225)
	@Basic(fetch = FetchType.EAGER)

	
	String imageName;
	
	/** The image url. */

	@Column(name = "image_Url", length = 225)
	@Basic(fetch = FetchType.EAGER)

	
	String imageUrl;

	/** The chiraghproperty. */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "property_Id", referencedColumnName = "property_Id") })
	@JsonBackReference
	Chiraghproperty chiraghproperty;

	/**
	 * Sets the property image id.
	 *
	 * @param propertyImageId the new property image id
	 */
	public void setPropertyImageId(Integer propertyImageId) {
		this.propertyImageId = propertyImageId;
	}

	/**
	 * Gets the property image id.
	 *
	 * @return the property image id
	 */
	public Integer getPropertyImageId() {
		return this.propertyImageId;
	}

	/**
	 * Sets the image name.
	 *
	 * @param imageName the new image name
	 */
	public void setImageName(String imageName) {
		this.imageName = imageName;
	}

	/**
	 * Gets the image name.
	 *
	 * @return the image name
	 */
	public String getImageName() {
		return this.imageName;
	}

	/**
	 * Sets the image url.
	 *
	 * @param imageUrl the new image url
	 */
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	/**
	 * Gets the image url.
	 *
	 * @return the image url
	 */
	public String getImageUrl() {
		return this.imageUrl;
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
	 * Instantiates a new propertyimages.
	 */
	public Propertyimages() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 * @param that the that
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
	 * @return the string
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("propertyImageId=[").append(propertyImageId).append("] ");
		buffer.append("imageName=[").append(imageName).append("] ");
		buffer.append("imageUrl=[").append(imageUrl).append("] ");

		return buffer.toString();
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (int) (prime * result + ((propertyImageId == null) ? 0 : propertyImageId.hashCode()));
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
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
