
package com.bestercapitalmedia.chiragh.configurations;

import java.io.Serializable;

import java.lang.StringBuilder;



import javax.persistence.*;

// TODO: Auto-generated Javadoc
/**
 * The Class Configurations.
 */

@Entity
@Table(catalog = "chiraghdatabase", name = "configurations")

public class Configurations implements Serializable {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The configurations id. */

	@Column(name = "configurations_Id", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	Integer configurationsId;
	
	/** The key name. */

	@Column(name = "key_Name", length = 25)
	@Basic(fetch = FetchType.EAGER)

	
	String keyName;
	
	/** The key value. */

	@Column(name = "key_Value", length = 25)
	@Basic(fetch = FetchType.EAGER)

	
	String keyValue;

	/**
	 * Sets the configurations id.
	 *
	 * @param configurationsId the new configurations id
	 */
	public void setConfigurationsId(Integer configurationsId) {
		this.configurationsId = configurationsId;
	}

	/**
	 * Gets the configurations id.
	 *
	 * @return the configurations id
	 */
	public Integer getConfigurationsId() {
		return this.configurationsId;
	}

	/**
	 * Sets the key name.
	 *
	 * @param keyName the new key name
	 */
	public void setKeyName(String keyName) {
		this.keyName = keyName;
	}

	/**
	 * Gets the key name.
	 *
	 * @return the key name
	 */
	public String getKeyName() {
		return this.keyName;
	}

	/**
	 * Sets the key value.
	 *
	 * @param keyValue the new key value
	 */
	public void setKeyValue(String keyValue) {
		this.keyValue = keyValue;
	}

	/**
	 * Gets the key value.
	 *
	 * @return the key value
	 */
	public String getKeyValue() {
		return this.keyValue;
	}

	/**
	 * Instantiates a new configurations.
	 */
	public Configurations() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 * @param that the that
	 */
	public void copy(Configurations that) {
		setConfigurationsId(that.getConfigurationsId());
		setKeyName(that.getKeyName());
		setKeyValue(that.getKeyValue());
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 * @return the string
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("configurationsId=[").append(configurationsId).append("] ");
		buffer.append("keyName=[").append(keyName).append("] ");
		buffer.append("keyValue=[").append(keyValue).append("] ");

		return buffer.toString();
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (int) (prime * result + ((configurationsId == null) ? 0 : configurationsId.hashCode()));
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
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
