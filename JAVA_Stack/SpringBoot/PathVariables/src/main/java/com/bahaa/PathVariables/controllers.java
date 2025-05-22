package com.bahaa.PathVariables;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controllers {
		    @RequestMapping("/{FirstName}/{LastName}")
		    public String welcome(@PathVariable("FirstName")String FirstName,@PathVariable("LastName")String LastName) {
		    	if(FirstName != null) {
		    		return "hello " + FirstName +" "+LastName;	    		
		    	}
		    	else {
		    		return "hello human";
		    	}
		    }
		    @RequestMapping("/bye/{FirstName}/{LastName}")
		    public String Bye(@PathVariable("FirstName")String FirstName,@PathVariable("LastName")String LastName) {
		    	if(FirstName != null) {
		    		return "bye " + FirstName +" "+LastName;	    		
		    	}
		    	else {
		    		return "bye human";
		    	}
		    }
		    @RequestMapping(value="/daikichi/travel/{city}", method = RequestMethod.GET)
		    public String city(@PathVariable("city")String city){
		      return "Congratulations! You will soon travel to "+city;
		    }
		    @RequestMapping(value="/daikichi/lotto/{num}", method = RequestMethod.GET)
		    public String lotto(@PathVariable("num")Integer num){
		    	if(num%2 == 0) {
		    		return "You will take a grand journey in the near future but be wary of tempting offers.";
		    	}
		    	else {
		    		return "You have enjoyed the fruits of your labor, but now is a great time to spend time with family and friends.";
		    	}
		    }

}
