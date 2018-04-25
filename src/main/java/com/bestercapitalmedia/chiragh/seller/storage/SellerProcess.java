package com.bestercapitalmedia.chiragh.seller.storage;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="seller_Process")
public class SellerProcess {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="process_Id")
    private int processId;	
	
	
	
	
}
