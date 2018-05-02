package com.bestercapitalmedia.test;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bestercapitalmedia.chiragh.user.Chiraghuser;

@RestController
@RequestMapping(value="/test")
public class PostTestController {

	
	@RequestMapping(value="/post", method = RequestMethod.POST)
	public @ResponseBody PostTest create( @RequestBody PostTest chiraghuser) {
		
		return chiraghuser;
		
	}
}
