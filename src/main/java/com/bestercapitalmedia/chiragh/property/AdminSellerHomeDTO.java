package com.bestercapitalmedia.chiragh.property;

import java.util.Date;

public class AdminSellerHomeDTO {

	int propertyId;
	String sellerUserName;
	String lastActionPerformed;
	Date dateReceived;
	Date lastAction;
	String actionPerformedBy;
	
	public String getSellerUserName() {
		return sellerUserName;
	}
	public void setSellerUserName(String sellerUserName) {
		this.sellerUserName = sellerUserName;
	}
	public String getLastActionPerformed() {
		return lastActionPerformed;
	}
	public void setLastActionPerformed(String lastActionPerformed) {
		this.lastActionPerformed = lastActionPerformed;
	}
	public Date getDateReceived() {
		return dateReceived;
	}
	public void setDateReceived(Date dateReceived) {
		this.dateReceived = dateReceived;
	}
	public Date getLastAction() {
		return lastAction;
	}
	public void setLastAction(Date lastAction) {
		this.lastAction = lastAction;
	}
	public String getActionPerformedBy() {
		return actionPerformedBy;
	}
	public void setActionPerformedBy(String actionPerformedBy) {
		this.actionPerformedBy = actionPerformedBy;
	}
	public AdminSellerHomeDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getPropertyId() {
		return propertyId;
	}
	public void setPropertyId(int propertyId) {
		this.propertyId = propertyId;
	}
	
}
