package com.bestercapitalmedia.chiragh.gateways;


import java.io.Serializable;
import java.lang.StringBuilder;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonBackReference;
import javax.persistence.*;

// TODO: Auto-generated Javadoc
/**
 * The Class ChiraghPropertyGateways.
 */
@Entity
@Table(catalog = "chiraghdatabase", name = "chiraghpropertygateways")

public class ChiraghPropertyGateways implements Serializable {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	
	/** The chiragh property gateways id. */
	@Column(name = "chiragh_Property_Gateways_Id", nullable = false)
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	Integer chiragh_Property_Gateways_Id;

	
	/** The payment type. */
	@Column(name = "payment_Type", length = 25)
	@Basic(fetch = FetchType.EAGER)

	String paymentType;
	

/**
 * Gets the chiragh property gateways id.
 *
 * @return the chiragh property gateways id
 */
public Integer getChiragh_Property_Gateways_Id() {
		return chiragh_Property_Gateways_Id;
	}









	/**
	 * Sets the chiragh property gateways id.
	 *
	 * @param chiragh_Property_Gateways_Id the new chiragh property gateways id
	 */
	public void setChiragh_Property_Gateways_Id(Integer chiragh_Property_Gateways_Id) {
		this.chiragh_Property_Gateways_Id = chiragh_Property_Gateways_Id;
	}









	/**
	 * Gets the payment type.
	 *
	 * @return the payment type
	 */
	public String getPaymentType() {
		return paymentType;
	}









	/**
	 * Sets the payment type.
	 *
	 * @param paymentType the new payment type
	 */
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}









/**
 * Instantiates a new chiragh property gateways.
 */
public ChiraghPropertyGateways() {
	
}
}
