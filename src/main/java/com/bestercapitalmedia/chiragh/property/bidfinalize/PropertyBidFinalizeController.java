package com.bestercapitalmedia.chiragh.property.bidfinalize;

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
 * The Class PropertyBidFinalizeController.
 */
@RestController
@RequestMapping("/api/propertybidfinalize/")
public class PropertyBidFinalizeController {
	
	/** The property bid finalize repository. */
	@Autowired
	private PropertyBidFinalizeRepository propertyBidFinalizeRepository;
	
	/**
	 * List.
	 *
	 * @return the iterable
	 */
	@RequestMapping(value="/getAll",method=RequestMethod.GET)
	public Iterable<Propertybidfinalize> list() { 
		return propertyBidFinalizeRepository.findAll();
	}

	/**
	 * Creates the.
	 *
	 * @param users the users
	 * @return the propertybidfinalize
	 */
	@RequestMapping(value="/post")
	public Propertybidfinalize create(Propertybidfinalize users) {
		return propertyBidFinalizeRepository.save(users);
	}


	/**
	 * Update.
	 *
	 * @param id the id
	 * @param entity the entity
	 * @return the propertybidfinalize
	 */
	@RequestMapping(value = "/put/{id}", method = RequestMethod.PUT)
	public Propertybidfinalize update(@PathVariable(value = "id") long id, @RequestBody Propertybidfinalize entity) {
		return propertyBidFinalizeRepository.save(entity);
	}

	
	/**
	 * Delete.
	 *
	 * @param id the id
	 */
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable(value = "id") int id) {
		propertyBidFinalizeRepository.deleteById(id);
	}

	/**
	 * Gets the.
	 *
	 * @param id the id
	 * @return the optional
	 */
	@RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
	public Optional<Propertybidfinalize> get(@PathVariable(value = "id") int id) {
		return propertyBidFinalizeRepository.findById(id);
	}
}//end of class controller
