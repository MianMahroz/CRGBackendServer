package com.bestercapitalmedia.chiragh.seller.details;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.bestercapitalmedia.chiragh.imageutill.StorageService;
import com.bestercapitalmedia.chiragh.property.ChiraghPropertyDetailsDTO;
import com.bestercapitalmedia.chiragh.property.Chiraghproperty;
import com.bestercapitalmedia.chiragh.property.PropertyRepository;
import com.bestercapitalmedia.chiragh.property.type.Propertytype;
import com.bestercapitalmedia.chiragh.property.type.PropertytypeRepository;
import com.bestercapitalmedia.chiragh.user.ChiraghUserService;
import com.bestercapitalmedia.chiragh.user.Chiraghuser;
import com.bestercapitalmedia.chiragh.user.UserRepository;
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
	@Autowired
	private StorageService storageService;
	@Autowired
	private UserRepository userRepository;

	public boolean validateMultipartFiles(MultipartFile idcard, MultipartFile passport,
			MultipartFile scannedNotorizedPoa, String ownerType) {
		if (ownerType.equals("owner") && idcard != null && passport != null && chiragUtill.checkMineType(idcard)
				&& chiragUtill.checkMineType(passport)) {
			return true;
		} else if (ownerType.equals("poa") && idcard != null && passport != null && scannedNotorizedPoa != null
				&& chiragUtill.checkMineType(idcard) && chiragUtill.checkMineType(passport)
				&& chiragUtill.checkMineType(scannedNotorizedPoa)) {
			return true;
		} else
			return false;
	}

	public PropertySellerDetailDTO savePropertySellerDetails(HttpServletRequest httpServletRequest,
			PropertySellerDetailDTO propertySellerDetailDTO) {
		try {
//			String ownerType = propertySellerDetailDTO.getOwnerType();
			// if (!ownerType.equals("owner") || !ownerType.equals("poa"))
			// return null;

			ModelMapper mapper = new ModelMapper();
			Propertysellerdetails propertysellerdetails = mapper.map(propertySellerDetailDTO,
					Propertysellerdetails.class);
			int propertyId = 0;
			propertyId = propertySellerDetailDTO.getPropertyId();
			System.out.println("ProeprtyID"+propertyId);
			if (propertyId == 0) {
				return null;
			} else {	
				Chiraghproperty chiraghproperty = propertyRepository.findByPropertyId(propertyId);
				propertysellerdetails.setChiraghproperty(chiraghproperty);
				propertysellerdetails
						.setChiraghuser(userRepository.findByUserName(propertySellerDetailDTO.getUserName()));
				
				
				Propertysellerdetails propertysellerdetailsNew = propertySellerDetailsRepository
						.save(propertysellerdetails);
				return mapper.map(propertysellerdetailsNew, PropertySellerDetailDTO.class);
			}

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

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
			chiraghproperty.setPropertyReferenceNo(chiragUtill.genearteRandomNo("Prop"));
			return propertyRepository.save(chiraghproperty);
		} catch (Exception e) {
			return null;
		}

	}

	public Chiraghproperty createNewPropertyAngular(String userName) {
		try {
			Chiraghuser chiraghuser = userRepository.findByUserName(userName);
			// creating new object of Property Type
			Propertytype propertytype = new Propertytype();
			propertytype.setTypeTitle(chiraghuser.getUserName());
			Propertytype newPropertyType = propertytypeRepository.save(propertytype);
			// creating new object of property
			Chiraghproperty chiraghproperty = new Chiraghproperty();
			chiraghproperty.setChiraghuser(chiraghuser);
			chiraghproperty.setPropertytype(newPropertyType);
			chiraghproperty.setPropertyReferenceNo(chiragUtill.genearteRandomNo("Prop"));
			return propertyRepository.save(chiraghproperty);
		} catch (Exception e) {
			return null;
		}

	}

}// end of Class
