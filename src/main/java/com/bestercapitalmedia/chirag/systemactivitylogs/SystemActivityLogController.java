package com.bestercapitalmedia.chirag.systemactivitylogs;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bestercapitalmedia.chiragh.country.Country;
import com.bestercapitalmedia.chiragh.country.CountryRepository;
import com.bestercapitalmedia.chiragh.user.ChiraghUser;

@RestController
@RequestMapping("/api/systemactivitylog/")
public class SystemActivityLogController {
	@Autowired
	private SystemActivityLogRepository systemActivityLogRepository;
	
	@RequestMapping(value="/getAll",method=RequestMethod.GET)
	public Iterable<SystemActivityLog> list() { 
		return systemActivityLogRepository.findAll();
	}

	@RequestMapping(value="/post")
	public SystemActivityLog create(SystemActivityLog users) {
		return systemActivityLogRepository.save(users);
	}

	

	@RequestMapping(value = "/put/{id}", method = RequestMethod.PUT)
	public SystemActivityLog update(@PathVariable(value = "id") long id, @RequestBody SystemActivityLog entity) {
		return systemActivityLogRepository.save(entity);
	}

	
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable(value = "id") int id) {
		systemActivityLogRepository.deleteById(id);
	}

	@RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
	public Optional<SystemActivityLog> get(@PathVariable(value = "id") int id) {
		return systemActivityLogRepository.findById(id);
	}
}
