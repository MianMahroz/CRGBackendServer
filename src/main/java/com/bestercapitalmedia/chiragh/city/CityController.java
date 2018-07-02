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

// TODO: Auto-generated Javadoc
/**
 * The Class CityController.
 */
@RestController
@RequestMapping("/api/city/")
public class CityController {
	
	/** The city repository. */
	@Autowired
	private CityRepository cityRepository;
	
	/**
	 * List.
	 *
	 * @return the iterable
	 */
	@RequestMapping(value="/getAll",method=RequestMethod.GET)
	public Iterable<City> list() { 
		return cityRepository.findAll();
	}

	/**
	 * Creates the.
	 *
	 * @param users the users
	 * @return the city
	 */
	@RequestMapping(value="/post")
	public City create(City users) {
		return cityRepository.save(users);
	}


	/**
	 * Update.
	 *
	 * @param id the id
	 * @param entity the entity
	 * @return the city
	 */
	@RequestMapping(value = "/put/{id}", method = RequestMethod.PUT)
	public City update(@PathVariable(value = "id") long id, @RequestBody City entity) {
		return cityRepository.save(entity);
	}

	
	/**
	 * Delete.
	 *
	 * @param id the id
	 */
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable(value = "id") int id) {
		cityRepository.deleteById(id);
	}

	/**
	 * Gets the.
	 *
	 * @param id the id
	 * @return the optional
	 */
	@RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
	public Optional<City> get(@PathVariable(value = "id") int id) {
		return cityRepository.findById(id);
	}
}
