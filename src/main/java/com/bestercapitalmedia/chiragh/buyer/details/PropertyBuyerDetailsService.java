package com.bestercapitalmedia.chiragh.buyer.details;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.bestercapitalmedia.chiragh.buyer.bidding.history.BuyerBiddingHistory;
import com.bestercapitalmedia.chiragh.buyer.bidding.history.BuyerBiddingHistoryRepository;
import com.bestercapitalmedia.chiragh.property.Chiraghproperty;
import com.bestercapitalmedia.chiragh.property.PropertyRepository;
import com.bestercapitalmedia.chiragh.user.Chiraghuser;
import com.bestercapitalmedia.chiragh.user.UserRepository;
import com.bestercapitalmedia.chiragh.utill.ChiragUtill;
import com.bestercapitalmedia.chiragh.utill.ValidatedInput;
import com.fasterxml.jackson.databind.ObjectMapper;

// TODO: Auto-generated Javadoc
/**
 * The Class PropertyBuyerDetailsService.
 */
@Service
public class PropertyBuyerDetailsService {

	/** The propertybuyerdetails repository. */
	@Autowired
	private PropertyBuyerDetailsRepository propertybuyerdetailsRepository;
	
	/** The validated input. */
	@Autowired
	private ValidatedInput validatedInput;
	
	/** The chirag utill. */
	@Autowired
	private ChiragUtill chiragUtill;
	
	/** The buyerbiddinghistory repository. */
	@Autowired
	private BuyerBiddingHistoryRepository buyerbiddinghistoryRepository;
	
	/** The files. */
	List<String> files = new ArrayList<String>();
	
	/** The uploaded folder. */
	private static String UPLOADED_FOLDER = "C:\\Users\\hp\\";


	/**
	 * Gets the property owner details list.
	 *
	 * @return the property owner details list
	 */
	public List<PropertyOwnerDetailsDTO> getPropertyOwnerDetailsList() {
		ModelMapper modelMapper = new ModelMapper();
		return propertybuyerdetailsRepository.getAll().stream()
				.map(temp -> modelMapper.map(temp, PropertyOwnerDetailsDTO.class)).collect(Collectors.toList());
		
	}

	/**
	 * Gets the property POA details list.
	 *
	 * @return the property POA details list
	 */
	public List<PropertyPOADetailsDTO> getPropertyPOADetailsList() {
		ModelMapper modelMapper = new ModelMapper();
		return propertybuyerdetailsRepository.getAll().stream()
				.map(temp -> modelMapper.map(temp, PropertyPOADetailsDTO.class)).collect(Collectors.toList());
	}

	/**
	 * Save owner.
	 *
	 * @param propertyownerdetailsDTO the propertyownerdetails DTO
	 * @return the property owner details DTO
	 */
	public PropertyOwnerDetailsDTO saveOwner(PropertyOwnerDetailsDTO propertyownerdetailsDTO) {
		
		ModelMapper mapper = new ModelMapper();
		PropertyBuyerDetails propertyBuyerDetails = mapper.map(propertyownerdetailsDTO, PropertyBuyerDetails.class);
		
		BuyerBiddingHistory buyerbiddinghistory = buyerbiddinghistoryRepository.findByBidReferenceNo(propertyownerdetailsDTO.getBidReferenceNo());
		propertyBuyerDetails.setBuyerbiddinghistory(buyerbiddinghistory);
		
		PropertyBuyerDetails newpropertybuyerdetails = propertybuyerdetailsRepository.save(propertyBuyerDetails);
		
		return mapper.map(newpropertybuyerdetails, PropertyOwnerDetailsDTO.class);
		}
	
      /**
       * Save POA.
       *
       * @param propertypoadetailsDTO the propertypoadetails DTO
       * @return the property POA details DTO
       */
      public PropertyPOADetailsDTO savePOA(PropertyPOADetailsDTO propertypoadetailsDTO) {
		
		ModelMapper mapper = new ModelMapper();
		PropertyBuyerDetails propertyBuyerDetails = mapper.map(propertypoadetailsDTO, PropertyBuyerDetails.class);
		
		BuyerBiddingHistory buyerbiddinghistory = buyerbiddinghistoryRepository.findByBidReferenceNo(propertypoadetailsDTO.getBidReferenceNo());
		propertyBuyerDetails.setBuyerbiddinghistory(buyerbiddinghistory);
		
		PropertyBuyerDetails newpropertybuyerdetails = propertybuyerdetailsRepository.save(propertyBuyerDetails);
		
		return mapper.map(newpropertybuyerdetails, PropertyPOADetailsDTO.class);
	}
      
      /**
       * File uploading.
       *
       * @param file the file
       * @return the string
       */
      public String FileUploading(MultipartFile file) {

  		String msg = "";
  		if (file.isEmpty()) {
  			return "File is Empty";
  		}

  		try {
  			// Get the file and save it somewhere
  			byte[] bytes = file.getBytes();
  			Path path = Paths.get(UPLOADED_FOLDER + file.getOriginalFilename());
  			Files.write(path, bytes);
  			msg = "success";
  		} catch (Exception e) {
  			msg = e.getMessage();
  		}
  		if (msg.equals("success"))
  			return "success";
  		else
  			return msg;

  	}
     
     
}
