package com.bestercapitalmedia.chiragh.admin.verification;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bestercapitalmedia.chiragh.mail.MailService;
import com.bestercapitalmedia.chiragh.user.Chiraghuser;
import com.bestercapitalmedia.chiragh.user.UserRepository;
import com.bestercapitalmedia.chiragh.utill.ChiragUtill;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@RequestMapping("/api/verification")
public class VerificationController {

	@Autowired
	private MailService mailService;
	@Autowired
	private ChiragUtill chiraghUtil;
	@Autowired
	private UserRepository userRepository; 
	
	
	@RequestMapping(value = "/sentEmail", method = RequestMethod.POST)
	public @ResponseBody ResponseEntity confirmEmailRequest(@RequestBody AdminEmailDTO adminEmailDTO,
			HttpServletRequest httpServletRequest) {
		try {
			String status="";
			String email="";
			 Chiraghuser sellerUser= null;
//			System.out.println(adminEmailDTO.getUserName());
			System.out.println(adminEmailDTO.getData() );
			
			  Chiraghuser chiraghUser=null; 
					  chiraghUser=userRepository.findAdminUserByUserNameNRole(adminEmailDTO.getAdminUser(),adminEmailDTO.getRole());
		     if(chiraghUser==null)
		    	 return new ResponseEntity(chiraghUtil.getMessageObject("User Not Found!"),
							HttpStatus.OK);
		     if(adminEmailDTO.getRole().equals("VerificationUser")) {
		    	sellerUser=  userRepository.findByUserName(adminEmailDTO.getUserName());
		    	 email=sellerUser.getUserEmail();
		     }
		     else if(adminEmailDTO.getRole().equals("VerificationHod")) {
		    	  sellerUser=  userRepository.findByUserName(adminEmailDTO.getAdminUser());
		    	 email=sellerUser.getUserEmail();
		     }
		     
		         
		     if(sellerUser!=null) 
			       status= mailService.sendMail(email, adminEmailDTO.getSubject(),adminEmailDTO.getData());		     
		     
		     return new ResponseEntity(chiraghUtil.getMessageObject(status),
						HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity(chiraghUtil.getMessageObject("Internal Server Error!" + e.getMessage()),
					HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	
	
}//end of class
