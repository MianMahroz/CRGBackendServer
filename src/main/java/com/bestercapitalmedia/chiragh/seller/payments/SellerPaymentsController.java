package com.bestercapitalmedia.chiragh.seller.payments;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.bestercapitalmedia.chiragh.property.PropertyRepository;
import com.bestercapitalmedia.chiragh.seller.paymentstype.SellerPaymentsTypeRepositrory;
import com.bestercapitalmedia.chiragh.user.UserRepository;
import com.bestercapitalmedia.chiragh.utill.ChiragUtill;
import com.bestercapitalmedia.chiragh.utill.LogUtill;
import com.fasterxml.jackson.databind.ObjectMapper;
@RestController
@RequestMapping("/api/sellerpayments")

public class SellerPaymentsController {
	
	private static final Logger log = LoggerFactory.getLogger(SellerPaymentsController.class);
	@Autowired
	private SellerPaymentsRepository sellerpaymentsRepository;
	@Autowired
	private ChiragUtill chiraghUtill;
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private PropertyRepository chiraghropertyRepository;
	@Autowired
	private SellerPaymentsTypeRepositrory sellerpaymentstypeRepository;
	@Autowired
	private LogUtill logUtill;
	@Autowired
	private SellerPaymentsService sellerpaymentsService;
	
	
	

	@RequestMapping(value = "/getAll", method = RequestMethod.GET)
	public @ResponseBody ResponseEntity getAll(HttpServletRequest httpServletRequest) {
		
		try {
			if (chiraghUtill.isValidSession(httpServletRequest) == false)
				return new ResponseEntity(chiraghUtill.getMessageObject("Invalid Session!"), HttpStatus.OK);
	
			ObjectMapper mapper = new ObjectMapper();
			List<Map<String,String>> buyerpayments= sellerpaymentsRepository.getAll();
					
			try {
				logUtill.inputLog(httpServletRequest, chiraghUtill.getSessionUser(httpServletRequest),
						"/api/sellerpayments/getAll", mapper.writeValueAsString(""),
						mapper.writeValueAsString(buyerpayments));
			} catch (Exception e) {
				return new ResponseEntity(chiraghUtill.getMessageObject("Log not Generated"), HttpStatus.OK);
			}
			
			return new ResponseEntity(buyerpayments, HttpStatus.OK);
             
		} catch (Exception e) {
			return new ResponseEntity(chiraghUtill.getMessageObject("Internal Server Error!" + e.getMessage()),
					HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}// end of list method*/

	@RequestMapping(value = "/post", method = RequestMethod.POST)
	public @ResponseBody ResponseEntity create(@Valid @RequestBody SellerPaymentsDTO  sellerpaymentsdto,
			HttpServletRequest httpServletRequest) {
		try {

     		if (chiraghUtill.isValidSession(httpServletRequest) == false)
				return new ResponseEntity(chiraghUtill.getMessageObject("Invalid Session!"), HttpStatus.OK);

			ObjectMapper mapper = new ObjectMapper();
			SellerPaymentsDTO sellerpaymentsDTO =  sellerpaymentsService.save(sellerpaymentsdto, httpServletRequest);
					
             
			if (sellerpaymentsDTO == null)
				return new ResponseEntity(chiraghUtill.getMessageObject("Seller Payments Are Not Submitted!"), HttpStatus.OK);
			try {
				logUtill.inputLog(httpServletRequest, chiraghUtill.getSessionUser(httpServletRequest),
						"/api/sellerpayments/post", mapper.writeValueAsString(sellerpaymentsdto),
						mapper.writeValueAsString(sellerpaymentsDTO));
			} catch (Exception e) {
				return new ResponseEntity(chiraghUtill.getMessageObject("Log not Generated"), HttpStatus.OK);
			}

			return new ResponseEntity("Seller Payments Submitted Successfully", HttpStatus.OK);

		} catch (Exception e) {
			return new ResponseEntity(chiraghUtill.getMessageObject("Internal Server Error!" + e.getMessage()),
					HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	
}
