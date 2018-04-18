package com.bestercapitalmedia.chiragh.property;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bestercapitalmedia.chiragh.city.CityRepository;

@RestController
@RequestMapping("/api/property/")
public class PropertyController {
	
	@Autowired
	private PropertyRepository propertyRepository;
	
	@RequestMapping(value="/getAll",method=RequestMethod.GET)
	public Iterable<Chiraghproperty> list() { 
		return propertyRepository.findAll();
	}

	@RequestMapping(value="/post")
	public Chiraghproperty create(Chiraghproperty users) {
		return propertyRepository.save(users);
	}


	@RequestMapping(value = "/put/{id}", method = RequestMethod.PUT)
	public Chiraghproperty update(@PathVariable(value = "id") long id, @RequestBody Chiraghproperty entity) {
		return propertyRepository.save(entity);
	}

	
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable(value = "id") int id) {
		propertyRepository.deleteById(id);
	}

	@RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
	public Optional<Chiraghproperty> get(@PathVariable(value = "id") int id) {
		return propertyRepository.findById(id);
	}
}//end of class controller
