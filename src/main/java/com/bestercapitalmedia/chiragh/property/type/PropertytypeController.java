package com.bestercapitalmedia.chiragh.property.type;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bestercapitalmedia.chiragh.city.CityRepository;
import com.bestercapitalmedia.chiragh.user.Chiraghuser;
import com.bestercapitalmedia.chiragh.user.UserController;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@RequestMapping("/api/propertytype/")
public class PropertytypeController {
	private static final Logger log = LoggerFactory.getLogger(PropertytypeController.class);
	@Autowired
	private PropertytypeRepository propertytypeRepository;
	
	@RequestMapping(value="/getAll",method=RequestMethod.GET)
	public Iterable<Propertytype> list() { 
		return propertytypeRepository.findAll();
	}

//	@RequestMapping(value="/post")
//	public String  create(@RequestBody String data) {
//		log.info("Post: /api/propertytype/post");
//		log.info("Input: " + data);
//
//		Chiraghuser user = new Chiraghuser();
//		ObjectMapper objectMapper = new ObjectMapper();
//		String rtnObject = "";
//
//		String msg = "";
//		
//		return propertytypeRepository.save(users);
//	}


	@RequestMapping(value = "/put/{id}", method = RequestMethod.PUT)
	public Propertytype update(@PathVariable(value = "id") long id, @RequestBody Propertytype entity) {
		return propertytypeRepository.save(entity);
	}

	
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable(value = "id") int id) {
		propertytypeRepository.deleteById(id);
	}

	@RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
	public Optional<Propertytype> get(@PathVariable(value = "id") int id) {
		return propertytypeRepository.findById(id);
	}
}//end of class controller
