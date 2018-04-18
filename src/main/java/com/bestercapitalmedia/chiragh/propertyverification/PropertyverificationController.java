package com.bestercapitalmedia.chiragh.propertyverification;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bestercapitalmedia.chiragh.city.CityRepository;

@RestController
@RequestMapping("/api/propertyverification/")
public class PropertyverificationController {
	
	@Autowired
	private PropertyverificationRepository propertyverificationRepository;
	
	@RequestMapping(value="/getAll",method=RequestMethod.GET)
	public Iterable<Propertyverification> list() { 
		return propertyverificationRepository.findAll();
	}

	@RequestMapping(value="/post")
	public Propertyverification create(Propertyverification users) {
		return propertyverificationRepository.save(users);
	}


	@RequestMapping(value = "/put/{id}", method = RequestMethod.PUT)
	public Propertyverification update(@PathVariable(value = "id") long id, @RequestBody Propertyverification entity) {
		return propertyverificationRepository.save(entity);
	}

	
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable(value = "id") int id) {
		propertyverificationRepository.deleteById(id);
	}

	@RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
	public Optional<Propertyverification> get(@PathVariable(value = "id") int id) {
		return propertyverificationRepository.findById(id);
	}
}//end of class controller
