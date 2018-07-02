package com.bestercapitalmedia.chiragh.property.brokerage;

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
 * The Class PropertybrokerageController.
 */
@RestController
@RequestMapping("/api/propertybrokerage/")
public class PropertybrokerageController {
	
	/** The propertybrokerage repository. */
	@Autowired
	private PropertybrokerageRepository propertybrokerageRepository;
	
	/**
	 * List.
	 *
	 * @return the iterable
	 */
	@RequestMapping(value="/getAll",method=RequestMethod.GET)
	public Iterable<Propertybrokerage> list() { 
		return propertybrokerageRepository.findAll();
	}

	/**
	 * Creates the.
	 *
	 * @param users the users
	 * @return the propertybrokerage
	 */
	@RequestMapping(value="/post")
	public Propertybrokerage create(Propertybrokerage users) {
		return propertybrokerageRepository.save(users);
	}


	/**
	 * Update.
	 *
	 * @param id the id
	 * @param entity the entity
	 * @return the propertybrokerage
	 */
	@RequestMapping(value = "/put/{id}", method = RequestMethod.PUT)
	public Propertybrokerage update(@PathVariable(value = "id") long id, @RequestBody Propertybrokerage entity) {
		return propertybrokerageRepository.save(entity);
	}

	
	/**
	 * Delete.
	 *
	 * @param id the id
	 */
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable(value = "id") int id) {
		propertybrokerageRepository.deleteById(id);
	}

	/**
	 * Gets the.
	 *
	 * @param id the id
	 * @return the optional
	 */
	@RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
	public Optional<Propertybrokerage> get(@PathVariable(value = "id") int id) {
		return propertybrokerageRepository.findById(id);
	}
}//end of class controller
