package com.bestercapitalmedia.chiragh.property;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bestercapitalmedia.chiragh.property.type.Propertytype;
import com.bestercapitalmedia.chiragh.property.type.PropertytypeRepository;
import com.bestercapitalmedia.chiragh.seller.details.PropertySellerDetailsService;
import com.bestercapitalmedia.chiragh.seller.details.Propertysellerdetails;
import com.bestercapitalmedia.chiragh.user.Chiraghuser;
import com.bestercapitalmedia.chiragh.user.UserRepository;
import com.bestercapitalmedia.chiragh.utill.ChiragUtill;

// TODO: Auto-generated Javadoc
/**
 * The Class ChiraghPropertyService.
 */
@Service
public class ChiraghPropertyService {

	/** The property repository. */
	@Autowired
	private PropertyRepository propertyRepository;
	
	/** The chirag utill. */
	@Autowired
	private ChiragUtill chiragUtill;
	
	/** The propertytype repository. */
	@Autowired
	private PropertytypeRepository propertytypeRepository;
	
	/** The user repository. */
	@Autowired
	private UserRepository userRepository;

	/** The property seller details service. */
	@Autowired
	private PropertySellerDetailsService propertySellerDetailsService;

	
	/**
	 * Gets the complete properties.
	 *
	 * @return the complete properties
	 */
	public List<Chiraghproperty> getCompleteProperties() {
		 return propertyRepository.findCompleteProperties();	 
	}//end of method
	
	/**
	 * Gets the property by ref no.
	 *
	 * @param refNo the ref no
	 * @return the property by ref no
	 */
	public PropertyDetailFetchDTO getPropertyByRefNo(String refNo) {
		ModelMapper mapper = new ModelMapper();
		Chiraghproperty chiraghproperty = propertyRepository.findPropertyByRefNo(refNo);
		if (chiraghproperty != null)
			return mapper.map(chiraghproperty, PropertyDetailFetchDTO.class);
		else
			return null;
	}
	
	/**
	 * Update property details.
	 *
	 * @param chiraghPropertyDetailsDTO the chiragh property details DTO
	 * @param httpServletRequest the http servlet request
	 * @return the chiraghproperty
	 */
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
			Chiraghuser user=userRepository.findByUserName(chiraghPropertyDetailsDTO.getUserName());
			chiraghproperty.setChiraghuser(user);

			Chiraghproperty newChiraghproperty = propertyRepository.save(chiraghproperty);
			return newChiraghproperty;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

	/**
	 * Update property financial details.
	 *
	 * @param chiraghPropertyFinancialsDTO the chiragh property financials DTO
	 * @param httpServletRequest the http servlet request
	 * @return the chiraghproperty
	 */
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

	/**
	 * Update property rent details.
	 *
	 * @param chiraghPropertyRentDetailsDTO the chiragh property rent details DTO
	 * @param httpServletRequest the http servlet request
	 * @return the chiraghproperty
	 */
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
//			chiraghproperty.setLeaseStartDate(chiraghPropertyRentDetailsDTO.getLeaseStartDate());
//			chiraghproperty.setLeaseExpiryDate(chiraghPropertyRentDetailsDTO.getLeaseExpiryDate());
			//these two properties i used in admin panel
			chiraghproperty.setSellerUserName(chiraghPropertyRentDetailsDTO.getSellerUserName());
			chiraghproperty.setDateReceived(new Date());
			chiraghproperty.setLastActionPerformed("Not Started");
			chiraghproperty.setStatus("inprocess");
			return propertyRepository.save(chiraghproperty);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

}
