package com.bestercapitalmedia.chiragh.propertytype;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bestercapitalmedia.chiragh.city.CityRepository;

@RestController
@RequestMapping("/api/propertytype/")
public class PropertytypeController {
	
	@Autowired
	private PropertytypeRepository propertytypeRepository;
	
	@RequestMapping(value="/getAll",method=RequestMethod.GET)
	public Iterable<Propertytype> list() { 
		return propertytypeRepository.findAll();
	}

	@RequestMapping(value="/post")
	public Propertytype create(Propertytype users) {
		return propertytypeRepository.save(users);
	}


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
