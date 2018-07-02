package com.bestercapitalmedia.chiragh.buyer.paymentstype;

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

import com.bestercapitalmedia.chiragh.buyer.payments.BuyerPayments;
import com.bestercapitalmedia.chiragh.buyer.payments.BuyerPaymentsRepository;
import com.bestercapitalmedia.chiragh.user.Chiraghuser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;



// TODO: Auto-generated Javadoc
/**
 * The Class BuyerPaymentsTypeController.
 */
@RestController
@RequestMapping("/api/buyerpaymentstype/")

 public class BuyerPaymentsTypeController {
	
	/** The Constant log. */
	private static final Logger log = LoggerFactory.getLogger(BuyerPaymentsTypeController.class);
	
	/** The buyerpaymentstype repository. */
	@Autowired
	private BuyerPaymentsTypeRepository buyerpaymentstypeRepository;
	
	/**
	 * List.
	 *
	 * @return the string
	 */
	@RequestMapping(value = "/getAll", method = RequestMethod.GET)
	public String list() {
		log.info("GET: /api/buyerpaymentstype/getAll");
		ObjectMapper objectMapper = new ObjectMapper();
		Iterable<BuyerPaymentsType> paymenttypeList = buyerpaymentstypeRepository.findAll();
		String rtnObject = "";
		try {
			
			rtnObject = objectMapper.writeValueAsString(paymenttypeList);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}

		log.info("Output: " + rtnObject);
		log.info("--------------------------------------------------------");
		return rtnObject;
	}// end of list method
	
	/**
	 * Gets the msg.
	 *
	 * @return the msg
	 */
	@RequestMapping(value = "/hello")
	public String getMsg() {
		return DigestUtils.md5DigestAsHex("123".getBytes());
	}
     
	/**
	 * Creates the.
	 *
	 * @param data the data
	 * @return the string
	 */
	@RequestMapping(value = "/post")
	public String create(@RequestBody String data) {
		log.info("Post: /api/buyerpaymentstype/post");
		log.info("Input: " + data);
		BuyerPaymentsType buyerPaymentstype = new BuyerPaymentsType();
		ObjectMapper objectMapper = new ObjectMapper();
		String rtnObject = "";

		String msg = "";
		try {
			JSONObject jsonObj = new JSONObject(data);
			 if(jsonObj.has("paymentTitle")) {
				 String paymentTitle = jsonObj.getString("paymentTitle");
				 buyerPaymentstype.setPaymentTitle(paymentTitle);
				 
				 rtnObject = objectMapper.writeValueAsString(buyerPaymentstype);
			       buyerpaymentstypeRepository.save(buyerPaymentstype);
					msg = "success";
			 }
			 else  {
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
	
	
	/**
	 * Update.
	 *
	 * @param data the data
	 * @return the string
	 */
	@RequestMapping(value = "/put/{id}", method = RequestMethod.PUT)
	public String update(@RequestBody String data) {
		log.info("Post: /api/buyerpaymentstype/post");
		log.info("Input: " + data);
		BuyerPaymentsType buyerPaymentstype = new BuyerPaymentsType();
		ObjectMapper objectMapper = new ObjectMapper();
		String rtnObject = "";

		String msg = "";
		try {
			JSONObject jsonObj = new JSONObject(data);
			 if(jsonObj.has("payment_Title")) {
				 
				 String paymentTitle = jsonObj.getString("paymentTitle");
				 buyerPaymentstype.setPaymentTitle(paymentTitle);
				 rtnObject = objectMapper.writeValueAsString(buyerPaymentstype);
			       buyerpaymentstypeRepository.save(buyerPaymentstype);
					msg = "success";
			 }
			 else  {
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
	
	/**
	 * Delete.
	 *
	 * @param id the id
	 */
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable(value = "id") int id) {
		buyerpaymentstypeRepository.deleteById(id);
	}

	/**
	 * Gets the.
	 *
	 * @param id the id
	 * @return the optional
	 */
	@RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
	public Optional<BuyerPaymentsType> get(@PathVariable(value = "id") int id) {
		return buyerpaymentstypeRepository.findById(id);
	}


}
