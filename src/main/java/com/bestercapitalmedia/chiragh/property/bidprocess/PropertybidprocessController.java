package com.bestercapitalmedia.chiragh.property.bidprocess;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bestercapitalmedia.chiragh.city.CityRepository;

@RestController
@RequestMapping("/api/propertybidprocess/")
public class PropertybidprocessController {
	
	@Autowired
	private PropertybidprocessRepository propertybidprocessRepository;
	
	@RequestMapping(value="/getAll",method=RequestMethod.GET)
	public Iterable<Propertybidprocess> list() { 
		return propertybidprocessRepository.findAll();
	}

	@RequestMapping(value="/post")
	public Propertybidprocess create(Propertybidprocess users) {
		return propertybidprocessRepository.save(users);
	}


	@RequestMapping(value = "/put/{id}", method = RequestMethod.PUT)
	public Propertybidprocess update(@PathVariable(value = "id") long id, @RequestBody Propertybidprocess entity) {
		return propertybidprocessRepository.save(entity);
	}

	
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable(value = "id") int id) {
		propertybidprocessRepository.deleteById(id);
	}

	@RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
	public Optional<Propertybidprocess> get(@PathVariable(value = "id") int id) {
		return propertybidprocessRepository.findById(id);
	}
}//end of class controller
