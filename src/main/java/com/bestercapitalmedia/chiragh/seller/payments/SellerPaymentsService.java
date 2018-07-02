package com.bestercapitalmedia.chiragh.seller.payments;

import javax.servlet.http.HttpServletRequest;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bestercapitalmedia.chiragh.buyer.payments.BuyerPayments;

import com.bestercapitalmedia.chiragh.buyer.payments.BuyerPaymentsRepository;
import com.bestercapitalmedia.chiragh.buyer.paymentstype.BuyerPaymentsType;
import com.bestercapitalmedia.chiragh.buyer.paymentstype.BuyerPaymentsTypeRepository;
import com.bestercapitalmedia.chiragh.gateways.ChiraghPropertyGateways;
import com.bestercapitalmedia.chiragh.gateways.ChiraghPropertyGatewaysRepository;
import com.bestercapitalmedia.chiragh.property.Chiraghproperty;
import com.bestercapitalmedia.chiragh.property.PropertyRepository;

import com.bestercapitalmedia.chiragh.seller.paymentstype.SellerPaymentsType;
import com.bestercapitalmedia.chiragh.seller.paymentstype.SellerPaymentsTypeRepositrory;
import com.bestercapitalmedia.chiragh.user.Chiraghuser;
import com.bestercapitalmedia.chiragh.user.UserRepository;
import com.bestercapitalmedia.chiragh.utill.ChiragUtill;
import com.bestercapitalmedia.chiragh.utill.LogUtill;

// TODO: Auto-generated Javadoc
/**
 * The Class SellerPaymentsService.
 */
@Service
public class SellerPaymentsService {
	
	/** The sellerpayments repository. */
	@Autowired
	private SellerPaymentsRepository sellerpaymentsRepository;
	
	/** The chiragh utill. */
	@Autowired
	private ChiragUtill chiraghUtill;
	
	/** The user repository. */
	@Autowired
	private UserRepository userRepository;
	
	/** The chiraghroperty repository. */
	@Autowired
	private PropertyRepository chiraghropertyRepository;
	
	/** The sellerpaymentstype repository. */
	@Autowired
	private SellerPaymentsTypeRepositrory sellerpaymentstypeRepository;
	
	/** The log utill. */
	@Autowired
	private LogUtill logUtill;
	
	/** The chiraghpropertygateways repository. */
	@Autowired
	private ChiraghPropertyGatewaysRepository chiraghpropertygatewaysRepository;

	
	
	
	/**
	 * Save.
	 *
	 * @param sellerpaymentsDTO the sellerpayments DTO
	 * @param httpServletRequest the http servlet request
	 * @return the seller payments DTO
	 */
	public SellerPaymentsDTO save(SellerPaymentsDTO  sellerpaymentsDTO,
			HttpServletRequest httpServletRequest) {

		try {
			ModelMapper modelmapper = new ModelMapper();
			SellerPayments sellerpayments = modelmapper.map(sellerpaymentsDTO,
					SellerPayments.class);
	
			int userId = chiraghUtill.getSessionUser(httpServletRequest).getUserId();
			System.out.println("userId:"+userId);
	        int propertyId=sellerpaymentsDTO.getPropertyId();
	        System.out.println("propertyId:"+propertyId);
	        int paymentTitle=sellerpaymentsDTO.getPaymentTitle();
	        System.out.println("paymentTitle:"+paymentTitle);
	        int paymentType =sellerpaymentsDTO.getPaymentType();
	        System.out.println("paymentType:"+paymentType);
	        
	        
	        Chiraghuser chiraghuser = userRepository.findByUserId(userId);
	        System.out.println("chiraghuser:"+chiraghuser.getUserId());
	        sellerpayments.setChiraghuser(chiraghuser);
	        SellerPaymentsType sellerpaymentstype = sellerpaymentstypeRepository.findByPaymentTitle(paymentTitle);
	        System.out.println("sellerpaymentstype:"+sellerpaymentstype.getPaymentTitle());
	        sellerpayments.setSellerpaymentstype(sellerpaymentstype);
	        ChiraghPropertyGateways chiraghpropertygateways=chiraghpropertygatewaysRepository.findByPaymentType(paymentType);
	        System.out.println("chiraghpropertygateways:"+chiraghpropertygateways.getPaymentType());
	        sellerpayments.setChiraghpropertygateways(chiraghpropertygateways);
	        Chiraghproperty chiraghproperty = chiraghropertyRepository.findByPropertyId(propertyId);
	        System.out.println("chiraghproperty:"+chiraghproperty.getPropertyId());
	        sellerpayments.setChiraghproperty(chiraghproperty);
	        sellerpayments.setAmount(sellerpaymentsDTO.getAmount());
	        sellerpayments.setPaymentCcType(sellerpaymentsDTO.getPaymentCcType());
	        sellerpayments.setPaymentCcMessageApi(sellerpaymentsDTO.getPaymentCcMessageApi());
	        SellerPayments sellerPayments2=sellerpaymentsRepository.save(sellerpayments);
	        
	        return modelmapper.map(sellerPayments2, SellerPaymentsDTO.class);
	        

}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}}

