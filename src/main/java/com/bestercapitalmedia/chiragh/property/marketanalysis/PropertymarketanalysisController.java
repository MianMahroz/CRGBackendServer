package com.bestercapitalmedia.chiragh.property.marketanalysis;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bestercapitalmedia.chiragh.city.CityRepository;

@RestController
@RequestMapping("/api/propertymarketanalysis/")
public class PropertymarketanalysisController {
	
	@Autowired
	private PropertymarketanalysisRepository propertymarketanalysisRepository;
	
	@RequestMapping(value="/getAll",method=RequestMethod.GET)
	public Iterable<Propertymarketanalysis> list() { 
		return propertymarketanalysisRepository.findAll();
	}

	@RequestMapping(value="/post")
	public Propertymarketanalysis create(Propertymarketanalysis users) {
		return propertymarketanalysisRepository.save(users);
	}


	@RequestMapping(value = "/put/{id}", method = RequestMethod.PUT)
	public Propertymarketanalysis update(@PathVariable(value = "id") long id, @RequestBody Propertymarketanalysis entity) {
		return propertymarketanalysisRepository.save(entity);
	}

	
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable(value = "id") int id) {
		propertymarketanalysisRepository.deleteById(id);
	}

	@RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
	public Optional<Propertymarketanalysis> get(@PathVariable(value = "id") int id) {
		return propertymarketanalysisRepository.findById(id);
	}
}//end of class controller
