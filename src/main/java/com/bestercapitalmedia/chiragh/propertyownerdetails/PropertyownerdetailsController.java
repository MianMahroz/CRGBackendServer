package com.bestercapitalmedia.chiragh.propertyownerdetails;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bestercapitalmedia.chiragh.city.CityRepository;

@RestController
@RequestMapping("/api/propertyownerdetails/")
public class PropertyownerdetailsController {
	
	@Autowired
	private PropertyownerdetailsRepository countryRepository;
	
	@RequestMapping(value="/getAll",method=RequestMethod.GET)
	public Iterable<Propertyownerdetails> list() { 
		return countryRepository.findAll();
	}

	@RequestMapping(value="/post")
	public Propertyownerdetails create(Propertyownerdetails users) {
		return countryRepository.save(users);
	}


	@RequestMapping(value = "/put/{id}", method = RequestMethod.PUT)
	public Propertyownerdetails update(@PathVariable(value = "id") long id, @RequestBody Propertyownerdetails entity) {
		return countryRepository.save(entity);
	}

	
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable(value = "id") int id) {
		countryRepository.deleteById(id);
	}

	@RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
	public Optional<Propertyownerdetails> get(@PathVariable(value = "id") int id) {
		return countryRepository.findById(id);
	}
}//end of class controller
