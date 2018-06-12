package com.bestercapitalmedia.chiragh.buyer.payments;




import java.io.Serializable;

import java.lang.StringBuilder;

import java.util.Set;

import javax.xml.bind.annotation.*;

import com.bestercapitalmedia.chiragh.buyer.paymentstype.BuyerPaymentsType;
import com.bestercapitalmedia.chiragh.property.Chiraghproperty;
import com.bestercapitalmedia.chiragh.user.Chiraghuser;
import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

/**
 */

@Entity
@Table(catalog = "chiraghdatabase", name = "buyerpayments")

public class BuyerPayments implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 */

	@Column(name = "buyer_Payments_Id", nullable = false)
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Integer buyerPaymentsId;

	/**
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "buyer_Payments_Type_Id", referencedColumnName = "buyer_Payments_Type_Id") })
	@JsonBackReference
	BuyerPaymentsType buyerpaymentstype;
	/**
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "user_Id", referencedColumnName = "user_Id") })
	@JsonBackReference
	Chiraghuser chiraghuser;
	/**
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "property_Id", referencedColumnName = "property_Id") })
	@JsonBackReference
	Chiraghproperty chiraghproperty;

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
	public void setBuyerpaymentstype(BuyerPaymentsType buyerpaymentstype) {
		this.buyerpaymentstype = buyerpaymentstype;
	}

	/**
	 */
	public BuyerPaymentsType getBuyerpaymentstype() {
		return buyerpaymentstype;
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
	public BuyerPayments() {
	}

	
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("buyerPaymentsId=[").append(buyerPaymentsId).append("] ");

		return buffer.toString();
	}

	/**
	 */
	
}
