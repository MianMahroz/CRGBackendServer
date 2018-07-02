package com.bestercapitalmedia.chiragh.utill;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bestercapitalmedia.chiragh.systemactivitylogs.SystemActivityLogRepository;
import com.bestercapitalmedia.chiragh.systemactivitylogs.Systemactivitylogs;
import com.bestercapitalmedia.chiragh.user.Chiraghuser;
import com.bestercapitalmedia.chiragh.user.UserRepository;

// TODO: Auto-generated Javadoc
/**
 * The Class LogUtill.
 */
@Service
public class LogUtill {

	/** The system activity log repository. */
	@Autowired
	private SystemActivityLogRepository systemActivityLogRepository;
	
	/** The user repository. */
	@Autowired
	private UserRepository userRepository;
	
	/**
	 * Input log.
	 *
	 * @param httpServletRequest the http servlet request
	 * @param chiraghuser the chiraghuser
	 * @param api the api
	 * @param input the input
	 * @param output the output
	 */
	public void inputLog(HttpServletRequest httpServletRequest,Chiraghuser chiraghuser,String api,String input,String  output ) {
		
		System.out.println(chiraghuser.getUserId());
		
//		Systemactivitylogs systemactivitylogs=new Systemactivitylogs();
//		systemactivitylogs.setRemoteIpAddress(ip);
//		Chiraghuser chiraghuser=userRepository.findByUserName(userName);
//		systemactivitylogs.setChiraghuser(chiraghuser);
//		systemactivitylogs.setApi(api);
//		systemactivitylogs.setInput(input);
//		systemactivitylogs.setOutput(output);
//		systemActivityLogRepository.save(systemactivitylogs);
//		
	}
}
