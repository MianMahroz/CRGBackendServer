
package com.bestercapitalmedia.chiragh.buyer.payments;

import java.io.Serializable;

import java.lang.StringBuilder;

import java.util.Set;

import javax.xml.bind.annotation.*;

import com.bestercapitalmedia.chiragh.buyer.paymentstype.Buyerpaymentstype;
import com.bestercapitalmedia.chiragh.user.Chiraghuser;
import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

/**
 */

@Entity

@Table(catalog = "chiraghdatabase", name = "buyerpayments")


public class Buyerpayments implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 */

	@Column(name = "buyer_Payments_Id", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	Integer buyerPaymentsId;
	/**
	 */

	@Column(name = "property_Id")
	@Basic(fetch = FetchType.EAGER)
	Integer propertyId;

	/**
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "user_Id", referencedColumnName = "user_Id") })
	@JsonBackReference
	Chiraghuser chiraghuser;
	/**
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "payment_Type_Id", referencedColumnName = "buyer_Payments_Type_Id") })
	@JsonBackReference
	Buyerpaymentstype buyerpaymentstype;

	/**
	 */
	public void setBuyerPaymentsId(Integer buyerPaymentsId) {
		this.buyerPaymentsId = buyerPaymentsId;
	}

	/**
	 */
	public Integer getBuyerPaymentsId() {
		return this.buyerPaymentsId;
	}

	/**
	 */
	public void setPropertyId(Integer propertyId) {
		this.propertyId = propertyId;
	}

	/**
	 */
	public Integer getPropertyId() {
		return this.propertyId;
	}

	/**
	 */
	public void setChiraghuser(Chiraghuser chiraghuser) {
		this.chiraghuser = chiraghuser;
	}

	/**
	 */
	public Chiraghuser getChiraghuser() {
		return chiraghuser;
	}

	/**
	 */
	public void setBuyerpaymentstype(Buyerpaymentstype buyerpaymentstype) {
		this.buyerpaymentstype = buyerpaymentstype;
	}

	/**
	 */
	public Buyerpaymentstype getBuyerpaymentstype() {
		return buyerpaymentstype;
	}

	/**
	 */
	public Buyerpayments() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(Buyerpayments that) {
		setBuyerPaymentsId(that.getBuyerPaymentsId());
		setPropertyId(that.getPropertyId());
		setChiraghuser(that.getChiraghuser());
		setBuyerpaymentstype(that.getBuyerpaymentstype());
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("buyerPaymentsId=[").append(buyerPaymentsId).append("] ");
		buffer.append("propertyId=[").append(propertyId).append("] ");

		return buffer.toString();
	}

	/**
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (int) (prime * result + ((buyerPaymentsId == null) ? 0 : buyerPaymentsId.hashCode()));
		return result;
	}

	/**
	 */
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof Buyerpayments))
			return false;
		Buyerpayments equalCheck = (Buyerpayments) obj;
		if ((buyerPaymentsId == null && equalCheck.buyerPaymentsId != null) || (buyerPaymentsId != null && equalCheck.buyerPaymentsId == null))
			return false;
		if (buyerPaymentsId != null && !buyerPaymentsId.equals(equalCheck.buyerPaymentsId))
			return false;
		return true;
	}
}
