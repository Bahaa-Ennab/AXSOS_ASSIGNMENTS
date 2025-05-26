package com.bahaa.Counter;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;
@Controller
public class DoupleCount {
    @RequestMapping("/douplecounter")

    public String DoupleCounter(HttpSession session) {
    	if(session.getAttribute("count") == null){
    		session.setAttribute("count",0);
    	}else {
    		int counter = (int) session.getAttribute("count");
    		session.setAttribute("count",counter+2);
    	}
    	return "doublecounter.jsp";
    }
    
}
