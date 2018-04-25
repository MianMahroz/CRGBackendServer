package com.bestercapitalmedia.chiragh.seller.details;

import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.bestercapitalmedia.chiragh.property.Chiraghproperty;
import com.bestercapitalmedia.chiragh.property.PropertyRepository;
import com.bestercapitalmedia.chiragh.property.type.Propertytype;
import com.bestercapitalmedia.chiragh.property.type.PropertytypeRepository;
import com.bestercapitalmedia.chiragh.user.Chiraghuser;
import com.bestercapitalmedia.chiragh.user.UserRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@CrossOrigin
@RequestMapping("/api/Propertysellerdetails")
public class PropertySellerDetailsController {
	private static final Logger log = LoggerFactory.getLogger(PropertySellerDetailsController.class);

	@Autowired
	private PropertySellerDetailsRepository propertySellerDetailsRepository;
	@Autowired
	private PropertyRepository propertyRepository;

	@Autowired
	private PropertytypeRepository propertyTypeRepository;

	@Autowired
	private UserRepository userRepository;

	RestTemplate restTemplate;

	private Chiraghproperty newProperty;

	@RequestMapping(value = "/getAll", method = RequestMethod.GET)
	public String list() {
		log.info("GET: /api/Propertysellerdetails/getAll");
		ObjectMapper objectMapper = new ObjectMapper();
		Iterable<Propertysellerdetails> userList = propertySellerDetailsRepository.findAll();
		String rtnObject = "";
		try {
			rtnObject = objectMapper.writeValueAsString(userList);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}

		log.info("Output: " + rtnObject);
		log.info("--------------------------------------------------------");
		return rtnObject;
	}// end of list method

	@RequestMapping(value = "/post")
	public String create(@RequestBody String data) {
		log.info("Post: /api/Propertysellerdetails/post");
		log.info("Input: " + data);
		Propertysellerdetails propertysellerdetails = new Propertysellerdetails();
		ObjectMapper objectMapper = new ObjectMapper();
		String rtnObject = "";
		String msg = "";
		try {
			JSONObject jsonObject = new JSONObject(data);
			if (jsonObject.has("firstName") && jsonObject.has("middleName") && jsonObject.has("lastName")
					&& jsonObject.has("emmiratesIdNo") && jsonObject.has("passportNo") && jsonObject.has("telephone")
					&& jsonObject.has("mobile") && jsonObject.has("address")
					&& jsonObject.has("emiratesIdDocumentUpload") && jsonObject.has("poaClearDeedUpload")
					&& jsonObject.has("nationality") && jsonObject.has("idCardNo")
					&& jsonObject.has("passportIdDocumentUpload") && jsonObject.has("idCardExpiration")
					&& jsonObject.has("passportExpiryDate") && jsonObject.has("email")
					&& jsonObject.has("emailVerificationCode") && jsonObject.has("pobox")
					&& jsonObject.has("passportCopyUpload") && jsonObject.has("scannedIdCopy")
					&& jsonObject.has("propertyDocument1Upload") && jsonObject.has("propertyDocument2Upload")
					&& jsonObject.has("propertyDocument3Upload") && jsonObject.has("propertyDocument4Upload")
					&& jsonObject.has("sellerProfilepic") && jsonObject.has("ownerType")
					&& jsonObject.has("poaAgreementExpiry") && jsonObject.has("poaPropertyAuthority")
					&& jsonObject.has("titleDeedUpload") && jsonObject.has("scannedNotorizedCopy")
					&& jsonObject.has("isPoaAccepted") && jsonObject.has("userName")
					&& jsonObject.has("propertyTitle")&& jsonObject.has("propertyId")) {

				propertysellerdetails.setFirstName(jsonObject.getString("firstName"));
				propertysellerdetails.setMiddleName(jsonObject.getString("middleName"));
				propertysellerdetails.setLastName(jsonObject.getString("lastName"));
				propertysellerdetails.setEmmiratesIdNo(jsonObject.getString("emmiratesIdNo"));
				propertysellerdetails.setPassportNo(jsonObject.getString("passportNo"));
				propertysellerdetails.setTelephone(jsonObject.getString("telephone"));
				propertysellerdetails.setMobile(jsonObject.getString("mobile"));
				propertysellerdetails.setAddress(jsonObject.getString("address"));
				propertysellerdetails.setEmiratesIdDocumentUpload(
						Integer.parseInt(jsonObject.getString("emiratesIdDocumentUpload")));
				propertysellerdetails
						.setPoaClearDeedUpload(Integer.parseInt(jsonObject.getString("poaClearDeedUpload")));
				propertysellerdetails.setNationality(jsonObject.getString("nationality"));
				propertysellerdetails.setIdCardNo(jsonObject.getString("idCardNo"));
				propertysellerdetails.setPassportIdDocumentUpload(
						Integer.parseInt(jsonObject.getString("passportIdDocumentUpload")));
				propertysellerdetails.setIdCardExpiration(jsonObject.getString("idCardExpiration"));
				propertysellerdetails.setPassportExpiryDate(jsonObject.getString("passportExpiryDate"));
				propertysellerdetails.setEmail(jsonObject.getString("email"));
				propertysellerdetails.setEmailVerificationCode(jsonObject.getString("emailVerificationCode"));
				propertysellerdetails.setPobox(jsonObject.getString("pobox"));
				propertysellerdetails.setPassportCopyUpload(jsonObject.getString("passportCopyUpload"));
				propertysellerdetails.setScannedIdCopy(jsonObject.getString("scannedIdCopy"));
				propertysellerdetails.setPropertyDocument1Upload(jsonObject.getString("propertyDocument1Upload"));
				propertysellerdetails.setPropertyDocument2Upload(jsonObject.getString("propertyDocument2Upload"));
				propertysellerdetails.setPropertyDocument3Upload(jsonObject.getString("propertyDocument3Upload"));
				propertysellerdetails.setPropertyDocument4Upload(jsonObject.getString("propertyDocument4Upload"));
				propertysellerdetails.setSellerProfilepic(jsonObject.getString("sellerProfilepic"));
				propertysellerdetails.setOwnerType(jsonObject.getString("ownerType"));
				propertysellerdetails.setPoaAgreementExpiry(jsonObject.getString("poaAgreementExpiry"));
				propertysellerdetails.setPoaPropertyAuthority(jsonObject.getString("poaPropertyAuthority"));
				propertysellerdetails.setTitleDeedUpload(jsonObject.getString("titleDeedUpload"));
				propertysellerdetails.setScannedNotorizedCopy(jsonObject.getString("scannedNotorizedCopy"));
				propertysellerdetails.setIsPoaAccepted(Integer.parseInt(jsonObject.getString("isPoaAccepted")));
				Chiraghuser chiraghuser = userRepository.findByUserName(jsonObject.getString("userName"));
				propertysellerdetails.setChiraghuser(chiraghuser);
				int propertyId = 0;
				if (jsonObject.has("propertyId")) {
					String id = jsonObject.getString("propertyId");
					if (id.equals("") || id == null) {
						final String uri = "http://localhost:8080/api/property/post/advance/"
								+ jsonObject.getString("userName");
						RestTemplate restTemplate = new RestTemplate();
						int newPropertyId = restTemplate.getForObject(uri, int.class);
						Chiraghproperty chiraghproperty = propertyRepository.findByPropertyId(newPropertyId);
						propertysellerdetails.setChiraghproperty(chiraghproperty);
						Propertysellerdetails propertysellerdetails2 = propertySellerDetailsRepository
								.save(propertysellerdetails);
						rtnObject = objectMapper.writeValueAsString(propertysellerdetails2);
						msg = "success";
						System.out.println("New Property Id:" + newPropertyId);
					} else {
						try {
							propertyId = Integer.parseInt(jsonObject.getString("propertyId"));
							Chiraghproperty chiraghproperty = propertyRepository.findByPropertyId(propertyId);
							propertysellerdetails.setChiraghproperty(chiraghproperty);
							Propertysellerdetails propertysellerdetails2 = propertySellerDetailsRepository
									.save(propertysellerdetails);
							rtnObject = objectMapper.writeValueAsString(propertysellerdetails2);
							msg = "success";
						} catch (Exception e) {
							msg = e.getMessage();
						}
						
					}

				} else {
					msg = "Object Does not Contain PropertyId";

				}

			} else {
				msg = "Invalid Object!";
			}

		} catch (Exception ee) {
			msg = ee.getMessage();
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

}
