package com.bestercapitalmedia.chiragh.propertyactivitylogs;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bestercapitalmedia.chiragh.property.Chiraghproperty;
import com.bestercapitalmedia.chiragh.property.PropertyRepository;
import com.bestercapitalmedia.chiragh.utill.ChiragUtill;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@RequestMapping("/api/propertyactivitylogs")
public class PropertyActivityLogsController {

	@Autowired
    PropertyActivityLogsRepository propertyActivityLogsRepository;

	@Autowired
	ChiragUtill chiraghUtil;
	@Autowired
	PropertyRepository propertyRepository;
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ResponseEntity createSystemGeneratedTask( @RequestBody PropertyActivityLogsDTO propertyActivityLogsdto) {
	     System.out.println("Inside method"+propertyActivityLogsdto.getPropertyId());   
		ModelMapper mapper=new ModelMapper();
	       PropertyActivityLogs activityLogs=mapper.map(propertyActivityLogsdto, PropertyActivityLogs.class);
	       Chiraghproperty chiraghproperty=propertyRepository.findByPropertyId(propertyActivityLogsdto.getPropertyId());
	       activityLogs.setChiraghproperty(chiraghproperty);
	       propertyActivityLogsRepository.save(activityLogs);
		   if(activityLogs!=null)
	       return new ResponseEntity(chiraghUtil.getMessageObject("Task Created Successfully"), HttpStatus.OK);
		   else
			  return new ResponseEntity(chiraghUtil.getMessageObject("Task Creation Ended with Error!"), HttpStatus.OK);
	}// end of method
	
	@RequestMapping(value = "/getSystemTaskGeneratedByPropertyId/{propertyId}", method = RequestMethod.GET)
	public ResponseEntity getSystemTaskByPropertyId(@PathVariable(value = "propertyId") int propertyId) {
	       PropertyActivityLogs activityLogs=propertyActivityLogsRepository.getSystemGeneratedTaskByPropertyId(propertyId);      
		   if(activityLogs!=null)
			   return new ResponseEntity(activityLogs, HttpStatus.OK);
		   else
			  return new ResponseEntity(chiraghUtil.getMessageObject("Task Creation Ended with Error!"), HttpStatus.OK);
	}// end of method

	@RequestMapping(value = "/getUserTaskGenerated", method = RequestMethod.GET)
	public ResponseEntity getUserTask() {
	       List<PropertyActivityLogs> activityLogs=propertyActivityLogsRepository.getUserGeneratedTask();      
//           activityLogs.stream().forEach(s->System.out.println(s.getChiraghproperty()));
	       
	       if(activityLogs!=null)
			   return new ResponseEntity(activityLogs, HttpStatus.OK);
		   else
			  return new ResponseEntity(chiraghUtil.getMessageObject("Task Creation Ended with Error!"), HttpStatus.OK);
	}// end of method
	
	@RequestMapping(value = "/getSystemTaskGeneratedByUserName/{userName}", method = RequestMethod.GET)
	public ResponseEntity getSystemTaskByUserName(@PathVariable(value = "userName") String userName) {
		 List<PropertyActivityLogs> activityLogs=propertyActivityLogsRepository.getUserGeneratedTaskByUserName(userName);      
		   if(activityLogs!=null)
			   return new ResponseEntity(activityLogs, HttpStatus.OK);
		   else
			  return new ResponseEntity(chiraghUtil.getMessageObject("Task Creation Ended with Error!"), HttpStatus.OK);
	}// end of method
}
