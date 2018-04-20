package com.bestercapitalmedia.chiragh.property.brokerage;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bestercapitalmedia.chiragh.city.CityRepository;

@RestController
@RequestMapping("/api/propertybrokerage/")
public class PropertybrokerageController {
	
	@Autowired
	private PropertybrokerageRepository propertybrokerageRepository;
	
	@RequestMapping(value="/getAll",method=RequestMethod.GET)
	public Iterable<Propertybrokerage> list() { 
		return propertybrokerageRepository.findAll();
	}

	@RequestMapping(value="/post")
	public Propertybrokerage create(Propertybrokerage users) {
		return propertybrokerageRepository.save(users);
	}


	@RequestMapping(value = "/put/{id}", method = RequestMethod.PUT)
	public Propertybrokerage update(@PathVariable(value = "id") long id, @RequestBody Propertybrokerage entity) {
		return propertybrokerageRepository.save(entity);
	}

	
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable(value = "id") int id) {
		propertybrokerageRepository.deleteById(id);
	}

	@RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
	public Optional<Propertybrokerage> get(@PathVariable(value = "id") int id) {
		return propertybrokerageRepository.findById(id);
	}
}//end of class controller
