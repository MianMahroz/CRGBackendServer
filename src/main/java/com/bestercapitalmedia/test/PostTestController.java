package com.bestercapitalmedia.test;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bestercapitalmedia.chiragh.user.Chiraghuser;

// TODO: Auto-generated Javadoc
/**
 * The Class PostTestController.
 */
@RestController
@RequestMapping(value="/test")
public class PostTestController {

	
	/**
	 * Creates the.
	 *
	 * @param chiraghuser the chiraghuser
	 * @return the post test
	 */
	@RequestMapping(value="/post", method = RequestMethod.POST)
	public @ResponseBody PostTest create( @RequestBody PostTest chiraghuser) {
		
		return chiraghuser;
		
	}
}
