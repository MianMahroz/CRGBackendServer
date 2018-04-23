package com.bestercapitalmedia.chiragh.process.seller;

import java.util.List;

import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bestercapitalmedia.chiragh.user.Chiraghuser;
import com.bestercapitalmedia.chiragh.user.UserController;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import javassist.bytecode.stackmap.BasicBlock.Catch;

@RestController
@CrossOrigin
@RequestMapping("/api/sellerprocess/")
public class SellerProcessController {
	private static final Logger log = LoggerFactory.getLogger(SellerProcessController.class);

	@Autowired
	private SellerProcessRepository sellerProcessRepository;

	@RequestMapping(value = "/getAll", method = RequestMethod.GET)
	public String list() {
		log.info("GET: /api/sellerprocess/getAll");
		ObjectMapper objectMapper = new ObjectMapper();
		Iterable<SellerProcess> sellerProcessList = sellerProcessRepository.findAll();
		String rtnObject = "";
		try {
			rtnObject = objectMapper.writeValueAsString(sellerProcessList);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}

		log.info("Output: " + rtnObject);
		log.info("--------------------------------------------------------");
		return rtnObject;
	}// end of list method

	@RequestMapping(value = "/post", method = RequestMethod.POST)
	public String create(@RequestBody String data) {
		log.info("Post: /api/sellerprocess/post");
		log.info("Input: " + data);

		ObjectMapper objectMapper = new ObjectMapper();
		String rtnObject = "";
		String msg = "";

		try {
			JSONObject jsonObject = new JSONObject();
			
		} catch (Exception ee) {

		}

		return "";
	}

}// end of sellerProcessControlelr
