package com.bestercapitalmedia.chiragh.utill;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bestercapitalmedia.chiragh.systemactivitylogs.SystemActivityLogRepository;
import com.bestercapitalmedia.chiragh.systemactivitylogs.Systemactivitylogs;
import com.bestercapitalmedia.chiragh.user.Chiraghuser;
import com.bestercapitalmedia.chiragh.user.UserRepository;

@Service
public class LogUtill {

	@Autowired
	private SystemActivityLogRepository systemActivityLogRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	public void inputLog(String ip,String userName,String api,String input,String output ) {
		
		Systemactivitylogs systemactivitylogs=new Systemactivitylogs();
		systemactivitylogs.setRemoteIpAddress(ip);
		Chiraghuser chiraghuser=userRepository.findByUserName(userName);
		systemactivitylogs.setChiraghuser(chiraghuser);
		systemactivitylogs.setApi(api);
		systemactivitylogs.setInput(input);
		systemactivitylogs.setOutput(output);
		systemActivityLogRepository.save(systemactivitylogs);
		
	}
}
