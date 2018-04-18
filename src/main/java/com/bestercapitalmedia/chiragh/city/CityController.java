package com.bestercapitalmedia.chiragh.city;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bestercapitalmedia.chiragh.country.Country;
import com.bestercapitalmedia.chiragh.country.CountryRepository;

@RestController
@RequestMapping("/api/city/")
public class CityController {
	@Autowired
	private CityRepository cityRepository;
	
	@RequestMapping(value="/getAll",method=RequestMethod.GET)
	public Iterable<City> list() { 
		return cityRepository.findAll();
	}

	@RequestMapping(value="/post")
	public City create(City users) {
		return cityRepository.save(users);
	}


	@RequestMapping(value = "/put/{id}", method = RequestMethod.PUT)
	public City update(@PathVariable(value = "id") long id, @RequestBody City entity) {
		return cityRepository.save(entity);
	}

	
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable(value = "id") int id) {
		cityRepository.deleteById(id);
	}

	@RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
	public Optional<City> get(@PathVariable(value = "id") int id) {
		return cityRepository.findById(id);
	}
}
