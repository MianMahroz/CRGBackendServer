package com.bestercapitalmedia.chiragh.user;

import java.util.List;

import com.bestercapitalmedia.chiragh.property.Chiraghproperty;

public class ChiraghAdminDashboardDTO {
//	String userName;
    List<Chiraghproperty> chiraghproperties;
    
	public List<Chiraghproperty> getChiraghproperties() {
		return chiraghproperties;
	}
	public void setChiraghproperties(List<Chiraghproperty> chiraghproperties) {
		this.chiraghproperties = chiraghproperties;
	}
	public ChiraghAdminDashboardDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
