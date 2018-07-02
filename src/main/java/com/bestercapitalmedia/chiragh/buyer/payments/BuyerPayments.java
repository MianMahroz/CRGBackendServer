package com.bestercapitalmedia.chiragh.buyer.payments;




import java.io.Serializable;

import java.lang.StringBuilder;

import java.util.Set;

import com.bestercapitalmedia.chiragh.buyer.paymentstype.BuyerPaymentsType;
import com.bestercapitalmedia.chiragh.property.Chiraghproperty;
import com.bestercapitalmedia.chiragh.user.Chiraghuser;
import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

// TODO: Auto-generated Javadoc
/**
 * The Class BuyerPayments.
 */

@Entity
@Table(catalog = "chiraghdatabase", name = "buyerpayments")

public class BuyerPayments implements Serializable {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The buyer payments id. */

	@Column(name = "buyer_Payments_Id", nullable = false)
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Integer buyerPaymentsId;

	/** The buyerpaymentstype. */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "buyer_Payments_Type_Id", referencedColumnName = "buyer_Payments_Type_Id") })
	@JsonBackReference
	BuyerPaymentsType buyerpaymentstype;
	
	/** The chiraghuser. */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "user_Id", referencedColumnName = "user_Id") })
	@JsonBackReference
	Chiraghuser chiraghuser;
	
	/** The chiraghproperty. */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "property_Id", referencedColumnName = "property_Id") })
	@JsonBackReference
	Chiraghproperty chiraghproperty;

	/**
	 * Sets the buyer payments id.
	 *
	 * @param buyerPaymentsId the new buyer payments id
	 */
	public void setBuyerPaymentsId(Integer buyerPaymentsId) {
		this.buyerPaymentsId = buyerPaymentsId;
	}

	/**
	 * Gets the buyer payments id.
	 *
	 * @return the buyer payments id
	 */
	public Integer getBuyerPaymentsId() {
		return this.buyerPaymentsId;
	}

	/**
	 * Sets the buyerpaymentstype.
	 *
	 * @param buyerpaymentstype the new buyerpaymentstype
	 */
	public void setBuyerpaymentstype(BuyerPaymentsType buyerpaymentstype) {
		this.buyerpaymentstype = buyerpaymentstype;
	}

	/**
	 * Gets the buyerpaymentstype.
	 *
	 * @return the buyerpaymentstype
	 */
	public BuyerPaymentsType getBuyerpaymentstype() {
		return buyerpaymentstype;
	}

	/**
	 * Sets the chiraghuser.
	 *
	 * @param chiraghuser the new chiraghuser
	 */
	public void setChiraghuser(Chiraghuser chiraghuser) {
		this.chiraghuser = chiraghuser;
	}

	/**
	 * Gets the chiraghuser.
	 *
	 * @return the chiraghuser
	 */
	public Chiraghuser getChiraghuser() {
		return chiraghuser;
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
	 * Instantiates a new buyer payments.
	 */
	public BuyerPayments() {
	}

	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("buyerPaymentsId=[").append(buyerPaymentsId).append("] ");

		return buffer.toString();
	}

	/**
	 */
	
}
