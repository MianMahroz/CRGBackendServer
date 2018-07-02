package com.bestercapitalmedia.chiragh.country;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bestercapitalmedia.chiragh.city.CityRepository;

// TODO: Auto-generated Javadoc
/**
 * The Class CountryController.
 */
@RestController
@RequestMapping("/api/country/")
public class CountryController {
	
	/** The country repository. */
	@Autowired
	private CountryRepository countryRepository;
	
	/**
	 * List.
	 *
	 * @return the iterable
	 */
	@RequestMapping(value="/getAll",method=RequestMethod.GET)
	public Iterable<Country> list() { 
		return countryRepository.findAll();
	}

	/**
	 * Creates the.
	 *
	 * @param users the users
	 * @return the country
	 */
	@RequestMapping(value="/post")
	public Country create(Country users) {
		return countryRepository.save(users);
	}


	/**
	 * Update.
	 *
	 * @param id the id
	 * @param entity the entity
	 * @return the country
	 */
	@RequestMapping(value = "/put/{id}", method = RequestMethod.PUT)
	public Country update(@PathVariable(value = "id") long id, @RequestBody Country entity) {
		return countryRepository.save(entity);
	}

	
	/**
	 * Delete.
	 *
	 * @param id the id
	 */
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable(value = "id") int id) {
		countryRepository.deleteById(id);
	}

	/**
	 * Gets the.
	 *
	 * @param id the id
	 * @return the optional
	 */
	@RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
	public Optional<Country> get(@PathVariable(value = "id") int id) {
		return countryRepository.findById(id);
	}
}//end of class controller
