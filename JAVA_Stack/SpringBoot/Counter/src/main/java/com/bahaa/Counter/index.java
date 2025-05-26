package com.bahaa.Counter;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;

@Controller
public class index {
    @RequestMapping("/")
    public String index(HttpSession session) {
    	if(session.getAttribute("count") == null){
    		session.setAttribute("count",0);
    	}else {
    		int counter = (int) session.getAttribute("count");
    		session.setAttribute("count",counter+1);
    	}
    
    return "index.jsp";
    }
}
