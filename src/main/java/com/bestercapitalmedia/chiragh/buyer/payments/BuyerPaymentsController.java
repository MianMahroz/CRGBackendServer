package com.bestercapitalmedia.chiragh.buyer.payments;

import java.util.Optional;

import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bestercapitalmedia.chiragh.buyer.paymentstype.BuyerPaymentsType;
import com.bestercapitalmedia.chiragh.buyer.paymentstype.BuyerPaymentsTypeRepository;
import com.bestercapitalmedia.chiragh.mail.MailService;
import com.bestercapitalmedia.chiragh.property.Chiraghproperty;
import com.bestercapitalmedia.chiragh.property.PropertyRepository;
import com.bestercapitalmedia.chiragh.user.Chiraghuser;
import com.bestercapitalmedia.chiragh.user.UserRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@RequestMapping("/api/buyerpayments/")

public class BuyerPaymentsController {

	private static final Logger log = LoggerFactory.getLogger(BuyerPaymentsController.class);
	@Autowired
	private BuyerPaymentsRepository buyerpaymentsRepository;

	@Autowired
	private UserRepository userRepository;
	@Autowired
	private PropertyRepository chiraghropertyRepository;
	@Autowired
	private BuyerPaymentsTypeRepository buyerpaymentstypeRepository;

	@RequestMapping(value = "/getAll", method = RequestMethod.GET)
	public String list() {
		log.info("GET: /api/buyerpayments/getAll");
		ObjectMapper objectMapper = new ObjectMapper();
		Iterable<BuyerPayments> buyerList = buyerpaymentsRepository.findAll();
		String rtnObject = "";
		try {

			rtnObject = objectMapper.writeValueAsString(buyerList);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}

		log.info("Output: " + rtnObject);
		log.info("--------------------------------------------------------");
		return rtnObject;
	}// end of list method


	@RequestMapping(value = "/post")
	public String create(@RequestBody String data) {
		log.info("Post: /api/buyerpayments/post");
		log.info("Input: " + data);
		BuyerPayments buyerPayments = new BuyerPayments();
		ObjectMapper objectMapper = new ObjectMapper();
		String rtnObject = "";

		String msg = "";
		try {

			JSONObject jsonObj = new JSONObject(data);
			if (jsonObj.has("userName") && jsonObj.has("propertyTitle") && jsonObj.has("paymentTitle")) {

				Chiraghuser chiraghuser = userRepository.findByUserName(jsonObj.getString("userName"));
				buyerPayments.setChiraghuser(chiraghuser);
				Chiraghproperty chiraghproperty = chiraghropertyRepository
						.findByPropertyTitle(jsonObj.getString("propertyTitle"));
				buyerPayments.setChiraghproperty(chiraghproperty);
				BuyerPaymentsType buyerpaymentstype = buyerpaymentstypeRepository.findBypaymentTitle("paymentTitle");
				buyerPayments.setBuyerpaymentstype(buyerpaymentstype);

				BuyerPayments buyerPayments2=buyerpaymentsRepository.save(buyerPayments);
				rtnObject = objectMapper.writeValueAsString(buyerPayments2);

				msg = "success";
			} // end

			else {
				msg = " Invalid";
			}

		} catch (Exception e) {
			msg = "Error" + e.getMessage();
		} // end of catch

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
	public String update(@RequestBody String data) {
		log.info("Post: /api/buyerpayments/post");
		log.info("Input: " + data);
		BuyerPayments buyerPayments = new BuyerPayments();
		ObjectMapper objectMapper = new ObjectMapper();
		String rtnObject = "";

		String msg = "";
		try {

			JSONObject jsonObj = new JSONObject(data);
			if (jsonObj.has("userName") && jsonObj.has("propertyTitle") && jsonObj.has("paymentTitle")) {

				Chiraghuser chiraghuser = userRepository.findByUserName(jsonObj.getString("userName"));
				buyerPayments.setChiraghuser(chiraghuser);
				Chiraghproperty chiraghproperty = chiraghropertyRepository
						.findByPropertyTitle(jsonObj.getString("propertyTitle"));
				buyerPayments.setChiraghproperty(chiraghproperty);
				BuyerPaymentsType buyerpaymentstype = buyerpaymentstypeRepository.findBypaymentTitle("paymentTitle");
				buyerPayments.setBuyerpaymentstype(buyerpaymentstype);

				BuyerPayments buyerPayments2=buyerpaymentsRepository.save(buyerPayments);
				rtnObject = objectMapper.writeValueAsString(buyerPayments2);

			} // end

			else {
				msg = " Invalid";
			}

		} catch (Exception e) {
			msg = "Error" + e.getMessage();
		} // end of catch

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

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable(value = "id") int id) {
		buyerpaymentsRepository.deleteById(id);
	}

	@RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
	public Optional<BuyerPayments> get(@PathVariable(value = "id") int id) {
		return buyerpaymentsRepository.findById(id);
	}

}
