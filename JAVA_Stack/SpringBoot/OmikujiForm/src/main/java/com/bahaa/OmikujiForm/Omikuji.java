package com.bahaa.OmikujiForm;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/omikuji")
public class Omikuji {
	@RequestMapping("")
	public String OmikujiDisplay() {
		return "index.jsp";
		
	}
	
	@RequestMapping("/display")
		public String show() {
			
			return"show.jsp";
		}

	
	@PostMapping("/show")
	public String Show_Details(HttpSession session,@RequestParam(value="number")String number,
			@RequestParam(value="city")String city,
			@RequestParam(value="person")String person,
			@RequestParam(value="hobby")String hobby,
			@RequestParam(value="living_thing")String living_thing,
			@RequestParam(value="compliment")String compliment) {
		
		session.setAttribute("living_thing", living_thing);
		session.setAttribute("compliment", compliment);
		session.setAttribute("hobby", hobby);
		session.setAttribute("person", person);
		session.setAttribute("city", city);
		session.setAttribute("number", number);
		return "redirect:/omikuji/display";
	}
	

}
