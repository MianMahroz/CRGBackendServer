
package com.bestercapitalmedia.chiragh.property.type;

import java.io.Serializable;

import java.lang.StringBuilder;

import java.util.LinkedHashSet;
import java.util.Set;



import com.bestercapitalmedia.chiragh.property.Chiraghproperty;

import javax.persistence.*;

// TODO: Auto-generated Javadoc
/**
 * The Class Propertytype.
 */

@Entity
@Table(catalog = "chiraghdatabase", name = "propertytype")
public class Propertytype implements Serializable {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The property type id. */

	@Column(name = "property_Type_Id", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	Integer propertyTypeId;
	
	/** The type title. */

	@Column(name = "type_Title", length = 225)
	@Basic(fetch = FetchType.EAGER)
	
	String typeTitle;
	
	/** The type classification. */

	@Column(name = "type_Classification", length = 225)
	@Basic(fetch = FetchType.EAGER)
	
	String typeClassification;

	/** The chiraghproperties. */
	@OneToMany(mappedBy = "propertytype", fetch = FetchType.LAZY)
	java.util.Set<Chiraghproperty> chiraghproperties;

	/**
	 * Sets the property type id.
	 *
	 * @param propertyTypeId the new property type id
	 */
	public void setPropertyTypeId(Integer propertyTypeId) {
		this.propertyTypeId = propertyTypeId;
	}

	/**
	 * Gets the property type id.
	 *
	 * @return the property type id
	 */
	public Integer getPropertyTypeId() {
		return this.propertyTypeId;
	}

	/**
	 * Sets the type title.
	 *
	 * @param typeTitle the new type title
	 */
	public void setTypeTitle(String typeTitle) {
		this.typeTitle = typeTitle;
	}

	/**
	 * Gets the type title.
	 *
	 * @return the type title
	 */
	public String getTypeTitle() {
		return this.typeTitle;
	}

	/**
	 * Sets the type classification.
	 *
	 * @param typeClassification the new type classification
	 */
	public void setTypeClassification(String typeClassification) {
		this.typeClassification = typeClassification;
	}

	/**
	 * Gets the type classification.
	 *
	 * @return the type classification
	 */
	public String getTypeClassification() {
		return this.typeClassification;
	}

	/**
	 * Sets the chiraghproperties.
	 *
	 * @param chiraghproperties the new chiraghproperties
	 */
	public void setChiraghproperties(Set<Chiraghproperty> chiraghproperties) {
		this.chiraghproperties = chiraghproperties;
	}

	/**
	 * Gets the chiraghproperties.
	 *
	 * @return the chiraghproperties
	 */
	public Set<Chiraghproperty> getChiraghproperties() {
		if (chiraghproperties == null) {
			chiraghproperties = new java.util.LinkedHashSet<Chiraghproperty>();
		}
		return chiraghproperties;
	}

	/**
	 * Instantiates a new propertytype.
	 */
	public Propertytype() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 * @param that the that
	 */
	public void copy(Propertytype that) {
		setPropertyTypeId(that.getPropertyTypeId());
		setTypeTitle(that.getTypeTitle());
		setTypeClassification(that.getTypeClassification());
		setChiraghproperties(new java.util.LinkedHashSet<Chiraghproperty>(that.getChiraghproperties()));
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 * @return the string
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("propertyTypeId=[").append(propertyTypeId).append("] ");
		buffer.append("typeTitle=[").append(typeTitle).append("] ");
		buffer.append("typeClassification=[").append(typeClassification).append("] ");

		return buffer.toString();
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (int) (prime * result + ((propertyTypeId == null) ? 0 : propertyTypeId.hashCode()));
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof Propertytype))
			return false;
		Propertytype equalCheck = (Propertytype) obj;
		if ((propertyTypeId == null && equalCheck.propertyTypeId != null) || (propertyTypeId != null && equalCheck.propertyTypeId == null))
			return false;
		if (propertyTypeId != null && !propertyTypeId.equals(equalCheck.propertyTypeId))
			return false;
		return true;
	}
}
