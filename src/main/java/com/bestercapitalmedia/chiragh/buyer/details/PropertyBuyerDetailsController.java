package com.bestercapitalmedia.chiragh.buyer.details;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.apache.tomcat.util.http.fileupload.FileItemStream;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.method.annotation.MvcUriComponentsBuilder;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.bestercapitalmedia.chiragh.mail.MailService;
import com.bestercapitalmedia.chiragh.property.Chiraghproperty;
import com.bestercapitalmedia.chiragh.property.PropertyRepository;
import com.bestercapitalmedia.chiragh.user.Chiraghuser;
import com.bestercapitalmedia.chiragh.user.UserRegisterationDTO;
import com.bestercapitalmedia.chiragh.user.UserRepository;
import com.bestercapitalmedia.chiragh.utill.ChiragUtill;
import com.bestercapitalmedia.chiragh.utill.LogUtill;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.bestercapitalmedia.chiragh.buyer.bidding.history.BuyerBiddingHistoryRepository;
import com.bestercapitalmedia.chiragh.buyer.details.PropertyBuyerDetailsRepository;

// TODO: Auto-generated Javadoc
/**
 * The Class PropertyBuyerDetailsController.
 */
@RestController
@CrossOrigin
@RequestMapping("/api/buyerdetails")
public class PropertyBuyerDetailsController {

	/** The Constant log. */
	private static final Logger log = LoggerFactory.getLogger(PropertyBuyerDetailsController.class);
	
	/** The buyerdetail repository. */
	@Autowired
	private PropertyBuyerDetailsRepository buyerdetailRepository;
	
	/** The chiragh util. */
	@Autowired
	private ChiragUtill chiraghUtil;
	
	/** The mail service. */
	@Autowired
	private MailService mailService;
	
	/** The property repository. */
	@Autowired
	private PropertyRepository propertyRepository;
	
	/** The user repository. */
	@Autowired
	private UserRepository userRepository;
	
	/** The propertybuyerdetailsservice. */
	@Autowired
	private PropertyBuyerDetailsService propertybuyerdetailsservice;
	
	/** The log utill. */
	@Autowired
	private LogUtill logUtill;
	
	/** The buyer bidding history. */
	@Autowired
     private BuyerBiddingHistoryRepository buyerBiddingHistory;
	
	/** The files. */
	List<String> files = new ArrayList<String>();
	

	/**
	 * Ownerlist.
	 *
	 * @return the list
	 */
	@RequestMapping(value = "ownerdetails/getAll", method = RequestMethod.GET)
	public @ResponseBody List<PropertyOwnerDetailsDTO> ownerlist() {
		return propertybuyerdetailsservice.getPropertyOwnerDetailsList();
	}// end of list method

	/**
	 * Poalist.
	 *
	 * @return the list
	 */
	@RequestMapping(value = "poadetails/getAll", method = RequestMethod.GET)
	public @ResponseBody List<PropertyPOADetailsDTO> poalist() {
		return propertybuyerdetailsservice.getPropertyPOADetailsList();
	}// end of list method

	/**
	 * Gets the msg.
	 *
	 * @return the msg
	 */
	@RequestMapping(value = "/hello")
	public String getMsg() {
		return DigestUtils.md5DigestAsHex("123".getBytes());
	}

	/**
	 * Creates the.
	 *
	 * @param data the data
	 * @param httpServletRequest the http servlet request
	 * @return the property owner details DTO
	 */
	@RequestMapping(value = "/ownerdetails/post", method = RequestMethod.POST)
	public @ResponseBody PropertyOwnerDetailsDTO create(@Valid @RequestBody PropertyOwnerDetailsDTO data,
			HttpServletRequest httpServletRequest) {
		ObjectMapper mapper = new ObjectMapper();
		PropertyOwnerDetailsDTO propertyownerdetailsDTO = propertybuyerdetailsservice.saveOwner(data);

		try {
			logUtill.inputLog(httpServletRequest, userRepository.findByUserId(buyerBiddingHistory.findByBidReferenceNo(propertyownerdetailsDTO.getBidReferenceNo()).getChiraghuser().getUserId()),
					"/api/buyerdetails/ownerdetails", mapper.writeValueAsString(data),
					mapper.writeValueAsString(propertyownerdetailsDTO));
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return propertyownerdetailsDTO;
	}
	
	/**
	 * Creates the.
	 *
	 * @param data the data
	 * @param httpServletRequest the http servlet request
	 * @return the property POA details DTO
	 */
	@RequestMapping(value = "/poadetails/put", method = RequestMethod.PUT)
	public @ResponseBody PropertyPOADetailsDTO create(@Valid @RequestBody PropertyPOADetailsDTO data,
			HttpServletRequest httpServletRequest) {
		ObjectMapper mapper = new ObjectMapper();
		PropertyPOADetailsDTO propertypoadetailsDTO = propertybuyerdetailsservice.savePOA(data);

		try {
			logUtill.inputLog(httpServletRequest,userRepository.findByUserId(buyerBiddingHistory.findByBidReferenceNo(propertypoadetailsDTO.getBidReferenceNo()).getChiraghuser().getUserId()),
					"/api/buyerdetails/poadetails", mapper.writeValueAsString(data),
					mapper.writeValueAsString(propertypoadetailsDTO));
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return propertypoadetailsDTO;
	}

	/**
	 * Delete owner.
	 *
	 * @param id the id
	 */
	@RequestMapping(value = "ownerdetails/deleteOwner/{id}", method = RequestMethod.DELETE)
	public void deleteOwner(@PathVariable(value = "id") int id) {
		buyerdetailRepository.deleteById(id);
	}
	
	/**
	 * Delete POA.
	 *
	 * @param id the id
	 */
	@RequestMapping(value = "poadetails/deletePOA/{id}", method = RequestMethod.DELETE)
	public void deletePOA(@PathVariable(value = "id") int id) {
		buyerdetailRepository.deleteById(id);
	}

	/**
	 * Gets the owner.
	 *
	 * @param id the id
	 * @return the owner
	 */
	@RequestMapping(value = "ownerdetails/getOwner/{id}", method = RequestMethod.GET)
	public Optional<PropertyBuyerDetails> getOwner(@PathVariable(value = "id") int id) {
		return buyerdetailRepository.findById(id);
	}

	/**
	 * Gets the poa.
	 *
	 * @param id the id
	 * @return the poa
	 */
	@RequestMapping(value = "poadetails/ getPOA/{id}", method = RequestMethod.GET)
	public Optional<PropertyBuyerDetails> getPOA(@PathVariable(value = "id") int id) {
		return buyerdetailRepository.findById(id);
	}

	/**
	 * Delete all owners.
	 */
	@RequestMapping(value = "ownerdetails/deleteAllOwner", method = RequestMethod.DELETE)
	public void deleteAllOwners() {
		log.info("GET: /api/buyerdetails/ownerdetails/DeleteAllOwner");
		buyerdetailRepository.deleteAll();

	}
	
	/**
	 * Delete all POA.
	 */
	@RequestMapping(value = "POAdetails/deleteAllPOA", method = RequestMethod.DELETE)
	public void deleteAllPOA() {
		log.info("GET: /api/buyerdetails/poadetails/DeleteAllPOA");
		buyerdetailRepository.deleteAll();

	}



	/**
	 * Gets the list files.
	 *
	 * @param model the model
	 * @return the list files
	 */
	@RequestMapping(value = "/getAllFiles", method = RequestMethod.GET)
	public String getListFiles(PropertyBuyerDetails model) {
		String rtnObject = "";

		try {
			// List<String> files = new ArrayList<String>();
			ObjectMapper objectMapper = new ObjectMapper();
			String msg = "";

			List<String> fileNames = files.stream()
					.map(fileName -> MvcUriComponentsBuilder
							.fromMethodName(PropertyBuyerDetailsController.class, "getFile", fileName).build()
							.toString())
					.collect(Collectors.toList());

			rtnObject = objectMapper.writeValueAsString(fileNames);

			msg = "success";
		} catch (Exception ee) {
			throw new RuntimeException("FAIL!");
		}

		return rtnObject;
	}

//	@RequestMapping(value = "/files/{filename:.+}", method = RequestMethod.GET)
//	public Resource getFile(@PathVariable String filename) {
//
//		Resource file = chiraghUtil.loadFile(filename);
//		return file;
//	}

}
