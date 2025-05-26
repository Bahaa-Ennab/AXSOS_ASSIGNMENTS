package com.bahaa.Counter;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;

@Controller
public class ResetCounter {
    @RequestMapping("/resetcounter")

    public String resetCounter(HttpSession session) {
    	if(session.getAttribute("count") == null){
    		session.setAttribute("count",0);
    	}else {
    		session.setAttribute("count",0);
    	}
    	return "counter.jsp";
    }
    
}