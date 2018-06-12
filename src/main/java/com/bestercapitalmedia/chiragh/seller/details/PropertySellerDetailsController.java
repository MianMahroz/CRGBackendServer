package com.bestercapitalmedia.chiragh.seller.details;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.servlet.http.HttpServletRequest;

import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.bestercapitalmedia.chiragh.property.Chiraghproperty;
import com.bestercapitalmedia.chiragh.property.PropertyRepository;
import com.bestercapitalmedia.chiragh.property.type.PropertytypeRepository;
import com.bestercapitalmedia.chiragh.user.UserRepository;
import com.bestercapitalmedia.chiragh.utill.ChiragUtill;
import com.bestercapitalmedia.chiragh.utill.Document;
import com.bestercapitalmedia.chiragh.utill.LogUtill;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@CrossOrigin
@SuppressWarnings({ "unchecked", "rawtypes" })
@RequestMapping("/api/Propertysellerdetails")
public class PropertySellerDetailsController {

	@Autowired
	private PropertySellerDetailsRepository propertySellerDetailsRepository;
	@Autowired
	private PropertyRepository propertyRepository;
	@Autowired
	private PropertytypeRepository propertyTypeRepository;
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private PropertySellerDetailsService propertySellerDetailsService;
	private Chiraghproperty newProperty;
	@Autowired
	private LogUtill logUtill;
	@Autowired
	private ChiragUtill chiraghUtil;
    @Autowired
	private Document document;
	
    @RequestMapping(value = "/post",method=RequestMethod.POST)
	public ResponseEntity create(@RequestBody PropertySellerDetailDTO propertySellerDetailDTO,
			HttpServletRequest httpServletRequest) {
		ObjectMapper mapper = new ObjectMapper();
    	String userName=propertySellerDetailDTO.getUserName();
		if (userName.equals("")||userName==null) {
			return new ResponseEntity(chiraghUtil.getMessageObject("Invalid Session!"), HttpStatus.OK);	
		}	
		
//		if (!propertySellerDetailsService.validateMultipartFiles(idCard, passport, scannedNotorizedPoa,
//				propertySellerDetailDTO.getOwnerType()))
//			return new ResponseEntity(chiraghUtil.getMessageObject("Invalid Multipart File"), HttpStatus.OK);
		System.out.println("Enter in method"+propertySellerDetailDTO.getPropertyId());
		PropertySellerDetailDTO newPropertySellerDetailDTO = propertySellerDetailsService.savePropertySellerDetails(
				httpServletRequest, propertySellerDetailDTO);

//		if (newPropertySellerDetailDTO == null)
//			return 0;
//			return new ResponseEntity(chiraghUtil.getMessageObject("Seller Not Saved!"), HttpStatus.OK);
		try {
			logUtill.inputLog(httpServletRequest, userRepository.findByUserName(propertySellerDetailDTO.getUserName()),
					"/api/Propertysellerdetails/post", mapper.writeValueAsString(propertySellerDetailDTO),
					mapper.writeValueAsString(newPropertySellerDetailDTO));
		} catch (Exception e) {
			return new ResponseEntity(chiraghUtil.getMessageObject("Log Generation Fail!"), HttpStatus.OK);
		}
		return new ResponseEntity(newPropertySellerDetailDTO.getPropertySellerId(), HttpStatus.OK);
//		return newPropertySellerDetailDTO.getPropertySellerId();
	}
    @RequestMapping(value = "/updateOwner",method=RequestMethod.PUT)
	public ResponseEntity update(@RequestBody PropertySellerDetailDTO propertySellerDetailDTO,
			HttpServletRequest httpServletRequest) {


    			ObjectMapper mapper = new ObjectMapper();
    	    	String userName=propertySellerDetailDTO.getUserName();
    			if (userName.equals("")||userName==null) {
    				return new ResponseEntity(chiraghUtil.getMessageObject("Invalid Session!"), HttpStatus.OK);	
    			}
//		if (!propertySellerDetailsService.validateMultipartFiles(idCard, passport, scannedNotorizedPoa,
//				propertySellerDetailDTO.getOwnerType()))
//			return new ResponseEntity(chiraghUtil.getMessageObject("Invalid Multipart File"), HttpStatus.OK);
		System.out.println("Enter in  Update method"+propertySellerDetailDTO.getPropertyId()+propertySellerDetailDTO.getOwnerType());
		PropertySellerDetailDTO newPropertySellerDetailDTO = propertySellerDetailsService.savePropertySellerDetails(
				httpServletRequest, propertySellerDetailDTO);

		if (newPropertySellerDetailDTO == null)
			return new ResponseEntity(chiraghUtil.getMessageObject("Seller Not Saved!"), HttpStatus.OK);

		try {
			logUtill.inputLog(httpServletRequest, userRepository.findByUserName(propertySellerDetailDTO.getUserName()),
					"/api/Propertysellerdetails/post", mapper.writeValueAsString(propertySellerDetailDTO),
					mapper.writeValueAsString(newPropertySellerDetailDTO));
		} catch (Exception e) {
			return new ResponseEntity(chiraghUtil.getMessageObject("Log Generation Fail!"), HttpStatus.OK);
		}
		return new ResponseEntity(newPropertySellerDetailDTO.getPropertySellerId(), HttpStatus.OK);
		
	}
	@RequestMapping(value = "/createProperty",method=RequestMethod.POST)
	public ResponseEntity createAngular(@RequestBody String userName,HttpServletRequest httpServletRequest) {
		System.out.println("User Name:"+userName);
		if (userName.equals("")||userName==null) {
			return new ResponseEntity(chiraghUtil.getMessageObject("Invalid Session!"), HttpStatus.OK);	
		}
		Chiraghproperty chiraghproperty=propertySellerDetailsService.createNewPropertyAngular(userName);
		int propertyId=chiraghproperty.getPropertyId();
		ObjectMapper mapper=new ObjectMapper();
		try {
			logUtill.inputLog(httpServletRequest, userRepository.findByUserName(userName),
					"/api/Propertysellerdetails/createProperty", userName,
					mapper.writeValueAsString(propertyId));
		} catch (Exception e) {
			return new ResponseEntity(chiraghUtil.getMessageObject("Log Generation Fail!"), HttpStatus.OK);
		}
		return new ResponseEntity(propertyId, HttpStatus.OK);
	
	}
	
	@RequestMapping(value = "/getOwners/{propertyId}/{userName}",method=RequestMethod.GET)
	public ResponseEntity getOwners(@PathVariable(value = "propertyId") int propertyId,@PathVariable(value = "userName") String userName,
			HttpServletRequest httpServletRequest) {
		if (userName.equals("")||userName==null) {
			return new ResponseEntity(chiraghUtil.getMessageObject("Invalid Session!"), HttpStatus.OK);	
		}
ObjectMapper mapper=new ObjectMapper();
		ModelMapper modelMapper=new ModelMapper(); 
		List<PropertySellerDetailDTO> sellerDetailDtoList=new ArrayList<PropertySellerDetailDTO>();
		List<Propertysellerdetails> list=propertySellerDetailsRepository.findByOwnerByPropertyId(propertyId);
		list.stream().forEach(s->
		  sellerDetailDtoList.add(modelMapper.map(s, PropertySellerDetailDTO.class))
				);

		try {
			logUtill.inputLog(httpServletRequest, userRepository.findByUserName(userName),
					"/api/Propertysellerdetails/getOwners", mapper.writeValueAsString("propertyId="+propertyId+"-UserName="+userName),
					mapper.writeValueAsString(sellerDetailDtoList));
		} catch (Exception e) {
			return new ResponseEntity(chiraghUtil.getMessageObject("Log Generation Fail!"), HttpStatus.OK);
		}
		return new ResponseEntity(sellerDetailDtoList, HttpStatus.OK);	
		
		
	}//end of getOwners

	@RequestMapping(value = "/getPoas/{propertyId}/{userName}",method=RequestMethod.GET)
	public ResponseEntity getPoa(@PathVariable(value = "propertyId") int propertyId,@PathVariable(value = "userName") String userName,
			HttpServletRequest httpServletRequest) {
	
		if (userName.equals("")||userName==null) {
			return new ResponseEntity(chiraghUtil.getMessageObject("Invalid Session!"), HttpStatus.OK);	
		}
		ObjectMapper mapper=new ObjectMapper();
		ModelMapper modelMapper=new ModelMapper(); 
		List<PropertySellerDetailDTO> sellerDetailDtoList=new ArrayList<PropertySellerDetailDTO>();
		List<Propertysellerdetails> list=propertySellerDetailsRepository.findByPoaByPropertyId(propertyId);
		list.stream().forEach(s->
		  sellerDetailDtoList.add(modelMapper.map(s, PropertySellerDetailDTO.class))
				);
		try {
			logUtill.inputLog(httpServletRequest, userRepository.findByUserName(userName),
					"/api/Propertysellerdetails/getPoas", mapper.writeValueAsString("propertyId="+propertyId+"-UserName="+userName),
					mapper.writeValueAsString(sellerDetailDtoList));
		} catch (Exception e) {
			return new ResponseEntity(chiraghUtil.getMessageObject("Log Generation Fail!"), HttpStatus.OK);
		}
		return new ResponseEntity(sellerDetailDtoList, HttpStatus.OK);	

	}//end of getOwners
	
	@RequestMapping(value = "/saveDocument/{name}/{userName}",method=RequestMethod.POST)
	public ResponseEntity saveDocument(@PathVariable(value = "name") String name,@PathVariable(value = "userName") String userName,
			@RequestParam("file") MultipartFile file,
			HttpServletRequest httpServletRequest) {
		if (userName.equals("")||userName==null) {
			return new ResponseEntity(chiraghUtil.getMessageObject("Invalid Session!"), HttpStatus.OK);	
		}
		
		ObjectMapper mapper=new ObjectMapper();
//		/C://upload-dir/
		String fileName= document.saveMultipartFile("../Chiragh/", name, file);
	     if(fileName.equals("")||fileName.equals(null))
	    	 return null;

			try {
				logUtill.inputLog(httpServletRequest, userRepository.findByUserName(userName),
						"/api/Propertysellerdetails/saveDocument", mapper.writeValueAsString("UserName="+userName),
						mapper.writeValueAsString(fileName));
			} catch (Exception e) {
				return new ResponseEntity(chiraghUtil.getMessageObject("Log Generation Fail!"), HttpStatus.OK);
			}
			return new ResponseEntity(fileName, HttpStatus.OK);	

	}
	
	
}
