package com.bestercapitalmedia.chiragh.systemactivitylogs;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bestercapitalmedia.chiragh.country.Country;
import com.bestercapitalmedia.chiragh.country.CountryRepository;


// TODO: Auto-generated Javadoc
/**
 * The Class SystemActivityLogController.
 */
@RestController
@RequestMapping("/api/systemactivitylog/")
public class SystemActivityLogController {
	
	/** The system activity log repository. */
	@Autowired
	private SystemActivityLogRepository systemActivityLogRepository;
	
	/**
	 * List.
	 *
	 * @return the iterable
	 */
	@RequestMapping(value="/getAll",method=RequestMethod.GET)
	public Iterable<Systemactivitylogs> list() { 
		return systemActivityLogRepository.findAll();
	}

	/**
	 * Creates the.
	 *
	 * @param systemactivitylogs the systemactivitylogs
	 * @return the systemactivitylogs
	 */
	@RequestMapping(value="/post")
	public @ResponseBody Systemactivitylogs create(@RequestBody Systemactivitylogs systemactivitylogs) {
		return systemActivityLogRepository.save(systemactivitylogs);
	}

	

	/**
	 * Update.
	 *
	 * @param id the id
	 * @param entity the entity
	 * @return the systemactivitylogs
	 */
	@RequestMapping(value = "/put/{id}", method = RequestMethod.PUT)
	public Systemactivitylogs update(@PathVariable(value = "id") long id, @RequestBody Systemactivitylogs entity) {
		return systemActivityLogRepository.save(entity);
	}

	
	/**
	 * Delete.
	 *
	 * @param id the id
	 */
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable(value = "id") int id) {
		systemActivityLogRepository.deleteById(id);
	}

	/**
	 * Gets the.
	 *
	 * @param id the id
	 * @return the optional
	 */
	@RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
	public Optional<Systemactivitylogs> get(@PathVariable(value = "id") int id) {
		return systemActivityLogRepository.findById(id);
	}
}
