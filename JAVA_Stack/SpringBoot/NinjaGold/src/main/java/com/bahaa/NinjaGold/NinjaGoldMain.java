package com.bahaa.NinjaGold;
import java.util.ArrayList;
import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;

@Controller
public class NinjaGoldMain {
	public ArrayList<LogEntry> gold= new ArrayList<LogEntry>();
	
	@RequestMapping("/")
	public String index(HttpSession session) {
		if(session.getAttribute("result")== null) {
			session.setAttribute("result", 0);
		}
		return "index.jsp";
	}	
	@RequestMapping("/counter")
	public String counter(HttpSession session,
	                      @RequestParam(value = "farm", required = false) String farm,
	                      @RequestParam(value = "cave", required = false) String cave,
	                      @RequestParam(value = "house", required = false) String house,
	                      @RequestParam(value = "quest", required = false) String quest) {

	    Random number = new Random();


	    int result = (int) session.getAttribute("result");
	 

	    if (farm != null) {
	        int randomNum = number.nextInt(10) + 10;
	        result += randomNum;
	        gold.add(new LogEntry("You entered a farm and earned " + randomNum + " gold.", "green"));
	    }

	    if (cave != null) {
	        int randomNum = number.nextInt(5) + 5;
	        result += randomNum;
	        gold.add(new LogEntry("You entered a cave and earned " + randomNum + " gold.", "green"));
	    }

	    if (house != null) {
	        int randomNum = number.nextInt(3) + 2;
	        result += randomNum;
	        gold.add(new LogEntry("You entered a house and earned " + randomNum + " gold.", "green"));
	    }

	    if (quest != null) {
	        int randomNum = number.nextInt(101) - 50;
	        result += randomNum;
	        if (randomNum >= 0) {
	        	gold.add(new LogEntry("You completed a quest and earned " + randomNum + " gold.", "green"));
	        } else {
	        	gold.add(new LogEntry("You failed a quest and lost " + Math.abs(randomNum) + " gold.", "red"));
	        }
	    }

	    session.setAttribute("result", result);
	    session.setAttribute("log", gold);

	    return "redirect:/";
	}

}
