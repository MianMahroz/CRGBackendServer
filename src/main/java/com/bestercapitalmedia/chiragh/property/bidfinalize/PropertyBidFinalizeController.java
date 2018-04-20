package com.bestercapitalmedia.chiragh.property.bidfinalize;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bestercapitalmedia.chiragh.city.CityRepository;

@RestController
@RequestMapping("/api/propertybidfinalize/")
public class PropertyBidFinalizeController {
	
	@Autowired
	private PropertyBidFinalizeRepository propertyBidFinalizeRepository;
	
	@RequestMapping(value="/getAll",method=RequestMethod.GET)
	public Iterable<Propertybidfinalize> list() { 
		return propertyBidFinalizeRepository.findAll();
	}

	@RequestMapping(value="/post")
	public Propertybidfinalize create(Propertybidfinalize users) {
		return propertyBidFinalizeRepository.save(users);
	}


	@RequestMapping(value = "/put/{id}", method = RequestMethod.PUT)
	public Propertybidfinalize update(@PathVariable(value = "id") long id, @RequestBody Propertybidfinalize entity) {
		return propertyBidFinalizeRepository.save(entity);
	}

	
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable(value = "id") int id) {
		propertyBidFinalizeRepository.deleteById(id);
	}

	@RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
	public Optional<Propertybidfinalize> get(@PathVariable(value = "id") int id) {
		return propertyBidFinalizeRepository.findById(id);
	}
}//end of class controller
