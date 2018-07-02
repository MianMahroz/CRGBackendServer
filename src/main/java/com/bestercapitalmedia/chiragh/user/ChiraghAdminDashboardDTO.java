package com.bestercapitalmedia.chiragh.user;

import java.util.List;

import com.bestercapitalmedia.chiragh.property.Chiraghproperty;

// TODO: Auto-generated Javadoc
/**
 * The Class ChiraghAdminDashboardDTO.
 */
public class ChiraghAdminDashboardDTO {

/** The chiraghproperties. */
//	String userName;
    List<Chiraghproperty> chiraghproperties;
    
	/**
	 * Gets the chiraghproperties.
	 *
	 * @return the chiraghproperties
	 */
	public List<Chiraghproperty> getChiraghproperties() {
		return chiraghproperties;
	}
	
	/**
	 * Sets the chiraghproperties.
	 *
	 * @param chiraghproperties the new chiraghproperties
	 */
	public void setChiraghproperties(List<Chiraghproperty> chiraghproperties) {
		this.chiraghproperties = chiraghproperties;
	}
	
	/**
	 * Instantiates a new chiragh admin dashboard DTO.
	 */
	public ChiraghAdminDashboardDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
