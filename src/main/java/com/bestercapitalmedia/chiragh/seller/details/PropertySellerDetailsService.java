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

// TODO: Auto-generated Javadoc
/**
 * The Class PropertySellerDetailsService.
 */
@Service
public class PropertySellerDetailsService {

	/** The property seller details repository. */
	@Autowired
	private PropertySellerDetailsRepository propertySellerDetailsRepository;
	
	/** The property repository. */
	@Autowired
	private PropertyRepository propertyRepository;
	
	/** The chirag utill. */
	@Autowired
	private ChiragUtill chiragUtill;
	
	/** The propertytype repository. */
	@Autowired
	private PropertytypeRepository propertytypeRepository;
	
	/** The storage service. */
	@Autowired
	private StorageService storageService;
	
	/** The user repository. */
	@Autowired
	private UserRepository userRepository;

	/**
	 * Validate multipart files.
	 *
	 * @param idcard the idcard
	 * @param passport the passport
	 * @param scannedNotorizedPoa the scanned notorized poa
	 * @param ownerType the owner type
	 * @return true, if successful
	 */
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

	/**
	 * Save property seller details.
	 *
	 * @param httpServletRequest the http servlet request
	 * @param propertySellerDetailDTO the property seller detail DTO
	 * @return the property seller detail DTO
	 */
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

	/**
	 * Gets the property id from session.
	 *
	 * @param httpServletRequest the http servlet request
	 * @return the property id from session
	 */
	public int getPropertyIdFromSession(HttpServletRequest httpServletRequest) {
		try {
			return Integer.parseInt(httpServletRequest.getSession(false).getAttribute("propertyId").toString());
		} catch (Exception e) {
			return 0;
		}
	}

	/**
	 * Creates the new property.
	 *
	 * @param httpServletRequest the http servlet request
	 * @return the chiraghproperty
	 */
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

	/**
	 * Creates the new property angular.
	 *
	 * @param userName the user name
	 * @return the chiraghproperty
	 */
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
			e.printStackTrace();
			return null;
		}

	}

}// end of Class
