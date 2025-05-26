package com.bahaa.Counter;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;

@Controller
public class DisplayCount {
    @RequestMapping("/counter")
    public String index(HttpSession session,Model model) {
    	int count= (int) session.getAttribute("count");
    model.addAttribute("count",count);
    return "counter.jsp";
    }
}
