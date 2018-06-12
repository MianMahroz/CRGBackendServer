package com.bestercapitalmedia.chiragh.gateways;


import java.io.Serializable;
import java.lang.StringBuilder;
import java.util.Set;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonBackReference;
import javax.persistence.*;

@Entity
@Table(catalog = "chiraghdatabase", name = "chiraghpropertygateways")

public class ChiraghPropertyGateways implements Serializable {
	private static final long serialVersionUID = 1L;
	
	
	@Column(name = "chiragh_Property_Gateways_Id", nullable = false)
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	Integer chiragh_Property_Gateways_Id;

	
	@Column(name = "payment_Type", length = 25)
	@Basic(fetch = FetchType.EAGER)

	String paymentType;
	

public Integer getChiragh_Property_Gateways_Id() {
		return chiragh_Property_Gateways_Id;
	}









	public void setChiragh_Property_Gateways_Id(Integer chiragh_Property_Gateways_Id) {
		this.chiragh_Property_Gateways_Id = chiragh_Property_Gateways_Id;
	}









	public String getPaymentType() {
		return paymentType;
	}









	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}









public ChiraghPropertyGateways() {
	
}
}
