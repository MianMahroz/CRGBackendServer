package com.bestercapitalmedia.chiragh.seller.details;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bestercapitalmedia.chiragh.property.ChiraghPropertyDetailsDTO;
import com.bestercapitalmedia.chiragh.property.Chiraghproperty;
import com.bestercapitalmedia.chiragh.property.PropertyRepository;
import com.bestercapitalmedia.chiragh.property.type.Propertytype;
import com.bestercapitalmedia.chiragh.property.type.PropertytypeRepository;
import com.bestercapitalmedia.chiragh.user.Chiraghuser;
import com.bestercapitalmedia.chiragh.utill.ChiragUtill;

@Service
public class PropertySellerDetailsService {

	@Autowired
	private PropertySellerDetailsRepository propertySellerDetailsRepository;
	@Autowired
	private PropertyRepository propertyRepository;
	@Autowired
	private ChiragUtill chiragUtill;
	@Autowired
	private PropertytypeRepository propertytypeRepository;

	public PropertySellerDetailDTO savePropertySellerDetails(HttpServletRequest httpServletRequest,
			PropertySellerDetailDTO propertySellerDetailDTO) {
		try {
			ModelMapper mapper = new ModelMapper();
			Propertysellerdetails propertysellerdetails = mapper.map(propertySellerDetailDTO,
					Propertysellerdetails.class);
			int propertyId = 0;
			propertyId = getPropertyIdFromSession(httpServletRequest);
			System.out.println("Session PropertyID:"+propertyId);
			
			if (propertyId == 0) {
				// generate new Property ID
				Chiraghproperty chiraghproperty = createNewProperty(httpServletRequest);
				// saving propertyId in session
				httpServletRequest.getSession(false).setAttribute("propertyId", chiraghproperty.getPropertyId());

				propertysellerdetails.setChiraghproperty(chiraghproperty);
				propertysellerdetails.setChiraghuser(chiragUtill.getSessionUser(httpServletRequest));
				return mapper.map(propertySellerDetailsRepository.save(propertysellerdetails),
						PropertySellerDetailDTO.class);
			} else {
				propertysellerdetails.setChiraghproperty(propertyRepository.findByPropertyId(propertyId));
				propertysellerdetails.setChiraghuser(chiragUtill.getSessionUser(httpServletRequest));
				return mapper.map(propertySellerDetailsRepository.save(propertysellerdetails),
						PropertySellerDetailDTO.class);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public int getPropertyIdFromSession(HttpServletRequest httpServletRequest) {
		try {
			return Integer.parseInt(httpServletRequest.getSession(false).getAttribute("propertyId").toString());
		} catch (Exception e) {
			return 0;
		}
	}

	public Chiraghproperty createNewProperty(HttpServletRequest httpServletRequest) {
		try {
			Chiraghuser chiraghuser = chiragUtill.getSessionUser(httpServletRequest);
			// creating new object of Property Type
			Propertytype propertytype = new Propertytype();
			propertytype.setTypeTitle(chiraghuser.getUserName());
			Propertytype newPropertyType = propertytypeRepository.save(propertytype);
			// creating new object of property
			Chiraghproperty chiraghproperty = new Chiraghproperty();
			chiraghproperty.setChiraghuser(chiraghuser);
			chiraghproperty.setPropertytype(newPropertyType);
			return propertyRepository.save(chiraghproperty);
		} catch (Exception e) {
			return null;
		}

	}

	
}// end of Class
