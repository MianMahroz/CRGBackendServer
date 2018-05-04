package com.bestercapitalmedia.chiragh.property;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.json.JSONObject;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bestercapitalmedia.chiragh.city.CityRepository;
import com.bestercapitalmedia.chiragh.property.type.Propertytype;
import com.bestercapitalmedia.chiragh.property.type.PropertytypeRepository;
import com.bestercapitalmedia.chiragh.user.Chiraghuser;
import com.bestercapitalmedia.chiragh.user.UserController;
import com.bestercapitalmedia.chiragh.user.UserRepository;
import com.bestercapitalmedia.chiragh.utill.ChiragUtill;
import com.bestercapitalmedia.chiragh.utill.LogUtill;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@RequestMapping("/api/property/")
public class PropertyController {
	private static final Logger log = LoggerFactory.getLogger(PropertyController.class);

	@Autowired
	ChiragUtill chiraghUtil;
	@Autowired
	UserRepository userRepository;

	@Autowired
	PropertytypeRepository propertyTypeRepository;
	@Autowired
	private PropertyRepository propertyRepository;
	@Autowired
	private ChiraghPropertyService chiraghPropertyService;
	private Chiraghproperty chiraghpropertNew;
	@Autowired
	private LogUtill logUtill;

	@RequestMapping(value = "/getAll", method = RequestMethod.GET)
	public Iterable<Chiraghproperty> list() {
		log.info("GET: /api/property/getAll");
		ObjectMapper objectMapper = new ObjectMapper();
		Iterable<Chiraghproperty> userList = propertyRepository.findAll();
		String rtnObject = "";
		try {
			rtnObject = objectMapper.writeValueAsString(userList);
		} catch (JsonProcessingException e) {

		}

		log.info("Output: " + rtnObject);
		log.info("--------------------------------------------------------");
		return userList;
	}// end of list method

	@RequestMapping(value = "/updateProperty/Details", method = RequestMethod.PUT)
	public @ResponseBody ChiraghPropertyDetailsDTO update(
			@RequestBody ChiraghPropertyDetailsDTO chiraghPropertyDetailsDTO, HttpServletRequest httpServletRequest) {
		try {
			ModelMapper modelMapper = new ModelMapper();
			ObjectMapper mapper = new ObjectMapper();
			Chiraghproperty chiraghProperty = chiraghPropertyService.updatePropertyDetails(chiraghPropertyDetailsDTO,
					httpServletRequest);
			if (chiraghProperty == null)
				return null;
			ChiraghPropertyDetailsDTO chiraghPropertyDetailsDTO2 = modelMapper.map(chiraghProperty,
					ChiraghPropertyDetailsDTO.class);
			if (chiraghPropertyDetailsDTO2 == null)
				return null;

			logUtill.inputLog(httpServletRequest, chiraghProperty.getChiraghuser(), "/api/user/put",
					mapper.writeValueAsString(chiraghPropertyDetailsDTO),
					mapper.writeValueAsString(chiraghPropertyDetailsDTO2));
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return null;

	}

	@RequestMapping(value = "/updateProperty/FinancialDetails", method = RequestMethod.PUT)
	public @ResponseBody ChiraghPropertyFinancialsDTO updateFinancials(
			@RequestBody ChiraghPropertyFinancialsDTO chiraghPropertyFinancialsDTO,
			HttpServletRequest httpServletRequest) {
		ModelMapper mapper = new ModelMapper();
		Chiraghproperty chiraghproperty = chiraghPropertyService
				.updatePropertyFinancialDetails(chiraghPropertyFinancialsDTO, httpServletRequest);
		if (chiraghproperty == null)
			return null;
		else
			return mapper.map(chiraghproperty, ChiraghPropertyFinancialsDTO.class);
	}

	@RequestMapping(value = "/updateProperty/rentInfo", method = RequestMethod.PUT)
	public ChiraghPropertyRentDetailsDTO updateRentDetails(
			@RequestBody ChiraghPropertyRentDetailsDTO chiraghPropertyRentDetailsDTO,
			HttpServletRequest httpServletRequest) {
		ModelMapper mapper = new ModelMapper();
		Chiraghproperty chiraghproperty = chiraghPropertyService
				.updatePropertyRentDetails(chiraghPropertyRentDetailsDTO, httpServletRequest);
		Chiraghproperty newChiraghproperty = propertyRepository.save(chiraghproperty);
		return mapper.map(newChiraghproperty, ChiraghPropertyRentDetailsDTO.class);
	}

	@RequestMapping(value = "/put/{id}", method = RequestMethod.PUT)
	public Chiraghproperty update(@PathVariable(value = "id") long id, @RequestBody Chiraghproperty entity) {
		return propertyRepository.save(entity);
	}

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable(value = "id") int id) {
		propertyRepository.deleteById(id);
	}

	@RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
	public Optional<Chiraghproperty> get(@PathVariable(value = "id") int id) {
		return propertyRepository.findById(id);
	}
}// end of class controller
