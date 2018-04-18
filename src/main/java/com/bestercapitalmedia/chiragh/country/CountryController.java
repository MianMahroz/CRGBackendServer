package com.bestercapitalmedia.chiragh.country;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bestercapitalmedia.chiragh.city.CityRepository;

@RestController
@RequestMapping("/api/country/")
public class CountryController {
	
	@Autowired
	private CountryRepository countryRepository;
	
	@RequestMapping(value="/getAll",method=RequestMethod.GET)
	public Iterable<Country> list() { 
		return countryRepository.findAll();
	}

	@RequestMapping(value="/post")
	public Country create(Country users) {
		return countryRepository.save(users);
	}


	@RequestMapping(value = "/put/{id}", method = RequestMethod.PUT)
	public Country update(@PathVariable(value = "id") long id, @RequestBody Country entity) {
		return countryRepository.save(entity);
	}

	
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable(value = "id") int id) {
		countryRepository.deleteById(id);
	}

	@RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
	public Optional<Country> get(@PathVariable(value = "id") int id) {
		return countryRepository.findById(id);
	}
}//end of class controller
