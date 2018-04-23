
package com.bestercapitalmedia.chiragh.configurations;

import java.io.Serializable;

import java.lang.StringBuilder;

import javax.xml.bind.annotation.*;

import javax.persistence.*;

/**
 */

@Entity
@Table(catalog = "chiraghdatabase", name = "configurations")

public class Configurations implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 */

	@Column(name = "configurations_Id", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	Integer configurationsId;
	/**
	 */

	@Column(name = "key_Name", length = 25)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String keyName;
	/**
	 */

	@Column(name = "key_Value", length = 25)
	@Basic(fetch = FetchType.EAGER)

	
	String keyValue;

	/**
	 */
	public void setConfigurationsId(Integer configurationsId) {
		this.configurationsId = configurationsId;
	}

	/**
	 */
	public Integer getConfigurationsId() {
		return this.configurationsId;
	}

	/**
	 */
	public void setKeyName(String keyName) {
		this.keyName = keyName;
	}

	/**
	 */
	public String getKeyName() {
		return this.keyName;
	}

	/**
	 */
	public void setKeyValue(String keyValue) {
		this.keyValue = keyValue;
	}

	/**
	 */
	public String getKeyValue() {
		return this.keyValue;
	}

	/**
	 */
	public Configurations() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(Configurations that) {
		setConfigurationsId(that.getConfigurationsId());
		setKeyName(that.getKeyName());
		setKeyValue(that.getKeyValue());
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("configurationsId=[").append(configurationsId).append("] ");
		buffer.append("keyName=[").append(keyName).append("] ");
		buffer.append("keyValue=[").append(keyValue).append("] ");

		return buffer.toString();
	}

	/**
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (int) (prime * result + ((configurationsId == null) ? 0 : configurationsId.hashCode()));
		return result;
	}

	/**
	 */
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof Configurations))
			return false;
		Configurations equalCheck = (Configurations) obj;
		if ((configurationsId == null && equalCheck.configurationsId != null) || (configurationsId != null && equalCheck.configurationsId == null))
			return false;
		if (configurationsId != null && !configurationsId.equals(equalCheck.configurationsId))
			return false;
		return true;
	}
}
