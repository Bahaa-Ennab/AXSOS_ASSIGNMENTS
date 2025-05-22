package com.bahaa.HelloHuman;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class index {
	    @RequestMapping("/")
	    public String welcome(@RequestParam(value = "q", required = false) String FirstName,@RequestParam(value = "l", required = false) String LastName) {
	    	if(FirstName != null) {
	    		return "hello " + FirstName +" "+LastName;	    		
	    	}
	    	else {
	    		return "hello human";
	    	}
	    }
}

