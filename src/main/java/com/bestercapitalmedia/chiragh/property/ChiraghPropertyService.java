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
			propertyId = chiraghPropertyDetailsDTO.getPropertyId();
			System.out.println("Proeprty Id"+propertyId);
			Chiraghproperty chiraghproperty = mapper.map(chiraghPropertyDetailsDTO, Chiraghproperty.class);
			chiraghproperty.setPropertyId(propertyId);
//			chiraghproperty.setChiraghuser(chiragUtill.getSessionUser(httpServletRequest));
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
			int propertyId =0;
			propertyId =chiraghPropertyFinancialsDTO.getPropertyId();
			System.out.println("Property Id"+propertyId);
			System.out.println("Balance"+chiraghPropertyFinancialsDTO.getBalanceAmount());
			
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
			chiraghproperty.setMorgageNoc(chiraghPropertyFinancialsDTO.getMorgageNoc());
			chiraghproperty.setDate(chiraghPropertyFinancialsDTO.getDate());
			chiraghproperty.setAmount(chiraghPropertyFinancialsDTO.getAmount());
			chiraghproperty.setBalanceAmount(chiraghPropertyFinancialsDTO.getBalanceAmount());
			propertyRepository.save(chiraghproperty);
			return chiraghproperty;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public Chiraghproperty updatePropertyRentDetails(ChiraghPropertyRentDetailsDTO chiraghPropertyRentDetailsDTO,
			HttpServletRequest httpServletRequest) {
		try {
			int propertyId =0;
					propertyId =chiraghPropertyRentDetailsDTO.getPropertyId();
			Chiraghproperty chiraghproperty = propertyRepository.findByPropertyId(propertyId);
			chiraghproperty.setIsRented(chiraghPropertyRentDetailsDTO.getIsRented());
			chiraghproperty.setIsVacant(chiraghPropertyRentDetailsDTO.getIsVacant());
			chiraghproperty.setTenantName(chiraghPropertyRentDetailsDTO.getTenantName());
			chiraghproperty.setPaymentStructure(chiraghPropertyRentDetailsDTO.getPaymentStructure());
			chiraghproperty.setRentalEjariNo(chiraghPropertyRentDetailsDTO.getRentalEjariNo());
			chiraghproperty.setRentalAnnualRent(chiraghPropertyRentDetailsDTO.getRentalAnnualRent());
			chiraghproperty.setTenancyContractUpload(chiraghPropertyRentDetailsDTO.getTenancyContractUpload());
			chiraghproperty.setLeaseStartDate(chiraghPropertyRentDetailsDTO.getLeaseStartDate());
			chiraghproperty.setLeaseExpiryDate(chiraghPropertyRentDetailsDTO.getLeaseExpiryDate());
			return propertyRepository.save(chiraghproperty);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

}
