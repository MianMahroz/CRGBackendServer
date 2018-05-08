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
	@Autowired
	private StorageService storageService;

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
			PropertySellerDetailDTO propertySellerDetailDTO, MultipartFile idCard, MultipartFile passport,
			MultipartFile scannedNotorizedPoa) {
		try {
			ModelMapper mapper = new ModelMapper();
			Propertysellerdetails propertysellerdetails = mapper.map(propertySellerDetailDTO,
					Propertysellerdetails.class);
			int propertyId = 0;
			propertyId = getPropertyIdFromSession(httpServletRequest);

			if (propertyId == 0) {
				// generate new Property ID
				Chiraghproperty chiraghproperty = createNewProperty(httpServletRequest);
				// saving propertyId in session
				httpServletRequest.getSession(false).setAttribute("propertyId", chiraghproperty.getPropertyId());
				propertysellerdetails.setChiraghproperty(chiraghproperty);
				propertysellerdetails.setChiraghuser(chiragUtill.getSessionUser(httpServletRequest));
				Propertysellerdetails propertysellerdetailsNew = propertySellerDetailsRepository
						.save(propertysellerdetails);
				// saving images of seller
				String path = "/" + chiraghproperty.getPropertyReferenceNo() + "/Seller";
				String fileName = chiraghproperty.getPropertyReferenceNo() + ","
						+ propertysellerdetailsNew.getPropertySellerId();
				storageService.store(idCard, path, fileName + ",idCard");
				storageService.store(passport, path, fileName + ",passport");
				storageService.store(scannedNotorizedPoa, path, fileName + ",scannedNotorizedPoa");
				// updating seller info
				propertysellerdetailsNew.setScannedIdCopy(fileName + ",idCard");
				propertysellerdetailsNew.setPassportCopyUpload(fileName + ",passport");
				propertysellerdetailsNew.setScannedNotorizedCopy(fileName + ",scannedNotorizedPoa");
				propertySellerDetailsRepository.save(propertysellerdetailsNew);

				return mapper.map(propertysellerdetailsNew, PropertySellerDetailDTO.class);
			} else {
				Chiraghproperty chiraghproperty = propertyRepository.findByPropertyId(propertyId);
				propertysellerdetails.setChiraghproperty(chiraghproperty);
				propertysellerdetails.setChiraghuser(chiragUtill.getSessionUser(httpServletRequest));
				Propertysellerdetails propertysellerdetailsNew = propertySellerDetailsRepository
						.save(propertysellerdetails);
				// saving images of seller
				// saving images of seller
				String path = "/" + chiraghproperty.getPropertyReferenceNo() + "/Seller";
				String fileName = chiraghproperty.getPropertyReferenceNo() + ","
						+ propertysellerdetailsNew.getPropertySellerId();
				storageService.store(idCard, path, fileName + ",idCard");
				storageService.store(passport, path, fileName + ",passport");
				storageService.store(scannedNotorizedPoa, path, fileName + ",scannedNotorizedPoa");
				// updating seller info
				propertysellerdetailsNew.setScannedIdCopy(fileName + ",idCard");
				propertysellerdetailsNew.setPassportCopyUpload(fileName + ",passport");
				propertysellerdetailsNew.setScannedNotorizedCopy(fileName + ",scannedNotorizedPoa");
				return mapper.map(propertysellerdetailsNew, PropertySellerDetailDTO.class);
			}

		} catch (Exception e) {

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
			chiraghproperty.setPropertyReferenceNo(chiragUtill.genearteRandomNo("Prop"));
			return propertyRepository.save(chiraghproperty);
		} catch (Exception e) {
			return null;
		}

	}

}// end of Class
