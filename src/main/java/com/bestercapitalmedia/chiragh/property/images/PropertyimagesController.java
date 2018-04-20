package com.bestercapitalmedia.chiragh.property.images;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bestercapitalmedia.chiragh.city.CityRepository;

@RestController
@RequestMapping("/api/propertyimages/")
public class PropertyimagesController {
	
	@Autowired
	private PropertyimagesRepository propertyimagesRepository;
	
	@RequestMapping(value="/getAll",method=RequestMethod.GET)
	public Iterable<Propertyimages> list() { 
		return propertyimagesRepository.findAll();
	}

	@RequestMapping(value="/post")
	public Propertyimages create(Propertyimages users) {
		return propertyimagesRepository.save(users);
	}


	@RequestMapping(value = "/put/{id}", method = RequestMethod.PUT)
	public Propertyimages update(@PathVariable(value = "id") long id, @RequestBody Propertyimages entity) {
		return propertyimagesRepository.save(entity);
	}

	
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable(value = "id") int id) {
		propertyimagesRepository.deleteById(id);
	}

	@RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
	public Optional<Propertyimages> get(@PathVariable(value = "id") int id) {
		return propertyimagesRepository.findById(id);
	}
}//end of class controller
