package com.bestercapitalmedia.chiragh.property;

import javax.servlet.http.HttpServletRequest;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bestercapitalmedia.chiragh.property.type.Propertytype;
import com.bestercapitalmedia.chiragh.property.type.PropertytypeRepository;
import com.bestercapitalmedia.chiragh.seller.details.PropertySellerDetailsService;
import com.bestercapitalmedia.chiragh.seller.details.Propertysellerdetails;
import com.bestercapitalmedia.chiragh.utill.ChiragUtill;

@Service
public class ChiraghPropertyService {

	@Autowired
	private PropertyRepository propertyRepository;
	@Autowired
	private ChiragUtill chiragUtill;
	@Autowired
	private PropertytypeRepository propertytypeRepository;

	@Autowired
	private PropertySellerDetailsService propertySellerDetailsService;

	public PropertyDetailFetchDTO getPropertyByRefNo(String refNo) {
		ModelMapper mapper = new ModelMapper();
		Chiraghproperty chiraghproperty = propertyRepository.findPropertyByRefNo(refNo);
		if (chiraghproperty != null)
			return mapper.map(chiraghproperty, PropertyDetailFetchDTO.class);
		else
			return null;
	}
	public Chiraghproperty updatePropertyDetails(ChiraghPropertyDetailsDTO chiraghPropertyDetailsDTO,
			HttpServletRequest httpServletRequest) {
		int propertyId = 0;
		ModelMapper mapper = new ModelMapper();
		try {
			propertyId = propertySellerDetailsService.getPropertyIdFromSession(httpServletRequest);
			Chiraghproperty chiraghproperty = mapper.map(chiraghPropertyDetailsDTO, Chiraghproperty.class);
			chiraghproperty.setPropertyId(propertyId);
			chiraghproperty.setChiraghuser(chiragUtill.getSessionUser(httpServletRequest));
			// Updating property type object
			Propertytype propertytype = propertyRepository.findByPropertyId(propertyId).getPropertytype();
			propertytype.setTypeTitle(chiraghPropertyDetailsDTO.getTypeTitle());
			Propertytype newPropertytype = propertytypeRepository.save(propertytype);
			chiraghproperty.setPropertytype(newPropertytype);

			Chiraghproperty newChiraghproperty = propertyRepository.save(chiraghproperty);
			return newChiraghproperty;
		} catch (Exception e) {
			return null;
		}

	}

	public Chiraghproperty updatePropertyFinancialDetails(ChiraghPropertyFinancialsDTO chiraghPropertyFinancialsDTO,
			HttpServletRequest httpServletRequest) {
		try {
			int propertyId = propertySellerDetailsService.getPropertyIdFromSession(httpServletRequest);
			Chiraghproperty chiraghproperty = propertyRepository.findByPropertyId(propertyId);
			chiraghproperty.setListedPrice(chiraghPropertyFinancialsDTO.getListedPrice());
			chiraghproperty.setOriginalPrice(chiraghPropertyFinancialsDTO.getOriginalPrice());
			chiraghproperty.setPaidAmount(chiraghPropertyFinancialsDTO.getPaidAmount());
			chiraghproperty.setServiceCharge(chiraghPropertyFinancialsDTO.getServiceCharge());
			chiraghproperty.setMorgageStatus(chiraghPropertyFinancialsDTO.getMorgageStatus());
			chiraghproperty.setMorgageRegNo(chiraghPropertyFinancialsDTO.getMorgageRegNo());
			chiraghproperty.setBank(chiraghPropertyFinancialsDTO.getBank());
			chiraghproperty.setMorgageAmount(chiraghPropertyFinancialsDTO.getMorgageAmount());
			chiraghproperty.setPreClosureCharges(chiraghPropertyFinancialsDTO.getPreClosureCharges());
			chiraghproperty.setPaymentSchedule(chiraghPropertyFinancialsDTO.getPaymentSchedule());
			chiraghproperty.setDate(chiraghPropertyFinancialsDTO.getDate());
			chiraghproperty.setAmount(chiraghPropertyFinancialsDTO.getAmount());
			propertyRepository.save(chiraghproperty);
			return chiraghproperty;
		} catch (Exception e) {
			return null;
		}
	}

	public Chiraghproperty updatePropertyRentDetails(ChiraghPropertyRentDetailsDTO chiraghPropertyRentDetailsDTO,
			HttpServletRequest httpServletRequest) {
		try {
			int propertyId = propertySellerDetailsService.getPropertyIdFromSession(httpServletRequest);
			Chiraghproperty chiraghproperty = propertyRepository.findByPropertyId(propertyId);
			chiraghproperty.setIsRented(chiraghPropertyRentDetailsDTO.getIsRented());
			chiraghproperty.setIsVacant(chiraghPropertyRentDetailsDTO.getIsVacant());
			chiraghproperty.setTenantName(chiraghPropertyRentDetailsDTO.getTenantName());
			chiraghproperty.setPayementStructure(chiraghPropertyRentDetailsDTO.getPayementStructure());
			chiraghproperty.setRentalEjariNo(chiraghPropertyRentDetailsDTO.getRentalEjariNo());
			chiraghproperty.setRentalAnnualRent(chiraghPropertyRentDetailsDTO.getRentalAnnualRent());
			chiraghproperty.setTenancyContractUpload(chiraghPropertyRentDetailsDTO.getTenancyContractUpload());
			return propertyRepository.save(chiraghproperty);
		} catch (Exception e) {
			return null;
		}

	}

}
