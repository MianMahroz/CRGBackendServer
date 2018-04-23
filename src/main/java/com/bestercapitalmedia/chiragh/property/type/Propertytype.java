
package com.bestercapitalmedia.chiragh.property.type;

import java.io.Serializable;

import java.lang.StringBuilder;

import java.util.LinkedHashSet;
import java.util.Set;

import javax.xml.bind.annotation.*;

import com.bestercapitalmedia.chiragh.property.Chiraghproperty;

import javax.persistence.*;

/**
 */

@Entity
@Table(catalog = "chiraghdatabase", name = "propertytype")
public class Propertytype implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 */

	@Column(name = "property_Type_Id", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	Integer propertyTypeId;
	/**
	 */

	@Column(name = "type_Title", length = 225)
	@Basic(fetch = FetchType.EAGER)
	
	String typeTitle;
	/**
	 */

	@Column(name = "type_Classification", length = 225)
	@Basic(fetch = FetchType.EAGER)
	
	String typeClassification;

	/**
	 */
	@OneToMany(mappedBy = "propertytype", fetch = FetchType.LAZY)
	java.util.Set<Chiraghproperty> chiraghproperties;

	/**
	 */
	public void setPropertyTypeId(Integer propertyTypeId) {
		this.propertyTypeId = propertyTypeId;
	}

	/**
	 */
	public Integer getPropertyTypeId() {
		return this.propertyTypeId;
	}

	/**
	 */
	public void setTypeTitle(String typeTitle) {
		this.typeTitle = typeTitle;
	}

	/**
	 */
	public String getTypeTitle() {
		return this.typeTitle;
	}

	/**
	 */
	public void setTypeClassification(String typeClassification) {
		this.typeClassification = typeClassification;
	}

	/**
	 */
	public String getTypeClassification() {
		return this.typeClassification;
	}

	/**
	 */
	public void setChiraghproperties(Set<Chiraghproperty> chiraghproperties) {
		this.chiraghproperties = chiraghproperties;
	}

	/**
	 */
	public Set<Chiraghproperty> getChiraghproperties() {
		if (chiraghproperties == null) {
			chiraghproperties = new java.util.LinkedHashSet<Chiraghproperty>();
		}
		return chiraghproperties;
	}

	/**
	 */
	public Propertytype() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
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
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("propertyTypeId=[").append(propertyTypeId).append("] ");
		buffer.append("typeTitle=[").append(typeTitle).append("] ");
		buffer.append("typeClassification=[").append(typeClassification).append("] ");

		return buffer.toString();
	}

	/**
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (int) (prime * result + ((propertyTypeId == null) ? 0 : propertyTypeId.hashCode()));
		return result;
	}

	/**
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
