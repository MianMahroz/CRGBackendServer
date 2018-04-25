package com.bestercapitalmedia.chiragh.process.seller;

import java.util.List;
import java.util.Optional;

import org.apache.commons.lang3.RandomStringUtils;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bestercapitalmedia.chiragh.property.Chiraghproperty;
import com.bestercapitalmedia.chiragh.seller.details.Propertysellerdetails;
import com.bestercapitalmedia.chiragh.user.Chiraghuser;
import com.bestercapitalmedia.chiragh.user.UserController;
import com.bestercapitalmedia.chiragh.user.UserRepository;
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

	@Autowired
	private UserRepository userRepository;

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

	@RequestMapping(value = "/post")
	public String create(@RequestBody String data) {
		log.info("Post: /api/sellerprocess/post");
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
					&& jsonObject.has("isPoaAccepted") && jsonObject.has("userName") && jsonObject.has("propertyTitle")
					&& jsonObject.has("propertyCode")) {

				if (jsonObject.has("propertyCode")) {

					try {
						String propertyCode = jsonObject.getString("propertyCode");
						if (propertyCode.equals("") || propertyCode == null) {
							propertyCode = RandomStringUtils.randomAlphanumeric(8);
						} else {
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
							propertysellerdetails.setPoaClearDeedUpload(
									Integer.parseInt(jsonObject.getString("poaClearDeedUpload")));
							propertysellerdetails.setNationality(jsonObject.getString("nationality"));
							propertysellerdetails.setIdCardNo(jsonObject.getString("idCardNo"));
							propertysellerdetails.setPassportIdDocumentUpload(
									Integer.parseInt(jsonObject.getString("passportIdDocumentUpload")));
							propertysellerdetails.setIdCardExpiration(jsonObject.getString("idCardExpiration"));
							propertysellerdetails.setPassportExpiryDate(jsonObject.getString("passportExpiryDate"));
							propertysellerdetails.setEmail(jsonObject.getString("email"));
							propertysellerdetails
									.setEmailVerificationCode(jsonObject.getString("emailVerificationCode"));
							propertysellerdetails.setPobox(jsonObject.getString("pobox"));
							propertysellerdetails.setPassportCopyUpload(jsonObject.getString("passportCopyUpload"));
							propertysellerdetails.setScannedIdCopy(jsonObject.getString("scannedIdCopy"));
							propertysellerdetails
									.setPropertyDocument1Upload(jsonObject.getString("propertyDocument1Upload"));
							propertysellerdetails
									.setPropertyDocument2Upload(jsonObject.getString("propertyDocument2Upload"));
							propertysellerdetails
									.setPropertyDocument3Upload(jsonObject.getString("propertyDocument3Upload"));
							propertysellerdetails
									.setPropertyDocument4Upload(jsonObject.getString("propertyDocument4Upload"));
							propertysellerdetails.setSellerProfilepic(jsonObject.getString("sellerProfilepic"));
							propertysellerdetails.setOwnerType(jsonObject.getString("ownerType"));
							propertysellerdetails.setPoaAgreementExpiry(jsonObject.getString("poaAgreementExpiry"));
							propertysellerdetails.setPoaPropertyAuthority(jsonObject.getString("poaPropertyAuthority"));
							propertysellerdetails.setTitleDeedUpload(jsonObject.getString("titleDeedUpload"));
							propertysellerdetails.setScannedNotorizedCopy(jsonObject.getString("scannedNotorizedCopy"));
							propertysellerdetails
									.setIsPoaAccepted(Integer.parseInt(jsonObject.getString("isPoaAccepted")));
							Chiraghuser chiraghuser = null;
							String userName = "";
							userName = jsonObject.getString("userName");
							if (userName.equals("") || userName == null) {
								return "Invalid UserName!";
							} else {
								chiraghuser = (Chiraghuser) userRepository.findByUserName(userName);
							}
							propertysellerdetails.setChiraghuser(chiraghuser);
							rtnObject = objectMapper.writeValueAsString(propertysellerdetails);
							SellerProcess sellerProcess = new SellerProcess();
							sellerProcess.setOwnerDetails(rtnObject);
							sellerProcessRepository.save(sellerProcess);
							msg = "success";
						}
					} catch (Exception e) {
						return "" + e.getMessage();
					}

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

}// end of sellerProcessControlelr
