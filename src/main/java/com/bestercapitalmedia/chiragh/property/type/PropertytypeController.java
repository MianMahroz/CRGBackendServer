package com.bestercapitalmedia.chiragh.property.type;

import java.util.Optional;

import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bestercapitalmedia.chiragh.city.CityRepository;
import com.bestercapitalmedia.chiragh.user.Chiraghuser;
import com.bestercapitalmedia.chiragh.user.UserController;
import com.bestercapitalmedia.chiragh.utill.ChiragUtill;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@RequestMapping("/api/propertytype/")
public class PropertytypeController {
	private static final Logger log = LoggerFactory.getLogger(PropertytypeController.class);
	@Autowired
	private PropertytypeRepository propertytypeRepository;

	@Autowired
	private ChiragUtill chiraghUtil;

	@RequestMapping(value = "/getAll", method = RequestMethod.GET)
	public Iterable<Propertytype> list() {
		return propertytypeRepository.findAll();
	}

	@RequestMapping(value = "/post")
	public String create(@RequestBody String data) {
		log.info("Post: /api/propertytype/post");
		log.info("Input: " + data);

		Propertytype propertytype = new Propertytype();
		ObjectMapper objectMapper = new ObjectMapper();
		String rtnObject = "";
		String msg = "";

		try {
			JSONObject jsonObj = new JSONObject(data);
			if (jsonObj.has("typeTitle") && jsonObj.has("typeClassification")) {
				String typeTitle = "";
				typeTitle = jsonObj.getString("typeTitle");
				System.out.println("Type Title" + typeTitle);
				String typeClassification = "";
				typeClassification = jsonObj.getString("typeClassification");
				if (typeTitle.equals("") || typeTitle == null) {
					return "Property Type Title is Empty!";
				} // end of inner if
				else {
					String status = chiraghUtil.textInputValidation(typeTitle);
					if (status.equals("valid"))
						propertytype.setTypeTitle(typeTitle);
					else
						return "Invalid Property Type Title!";
				} // end of type title outer else
					// start of type classification validation
				if (typeClassification.equals("") || typeClassification == null) {

					return "Property Classification is Empty!";
				} // end of inner if
				else {
					String status = chiraghUtil.textInputValidation(typeClassification);
					if (status.equals("valid"))
						propertytype.setTypeClassification(typeClassification);
					else
						return "Invalid Property Classification Field!";

				} // end of classification field else
				propertytypeRepository.save(propertytype);
				Propertytype propertytype2 = propertytypeRepository.findBytypeTitleNtypeClassification(typeTitle,
						typeClassification);
				if (propertytype2 == null)
					return "Data is not Retrived!";
				else
					rtnObject = objectMapper.writeValueAsString(propertytype2);

				msg = "success";
			} else {
				return "Invalid Object!";
			}

		} catch (Exception e) {
			msg = "Error:" + e.getMessage();
		}
		if (msg.equals("success")) {
			log.info("Output: " + rtnObject);
			log.info("--------------------------------------------------------");
			return rtnObject;
		} else {
			log.info("Output: " + msg);
			log.info("--------------------------------------------------------");
			return msg;
		}

	}

	@RequestMapping(value = "/put/{id}", method = RequestMethod.PUT)
	public Propertytype update(@PathVariable(value = "id") long id, @RequestBody Propertytype entity) {
		return propertytypeRepository.save(entity);
	}

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable(value = "id") int id) {
		propertytypeRepository.deleteById(id);
	}

	@RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
	public Optional<Propertytype> get(@PathVariable(value = "id") int id) {
		return propertytypeRepository.findById(id);
	}
}// end of class controller
