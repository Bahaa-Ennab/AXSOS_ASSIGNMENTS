package com.bahaa.SimpleReceipt;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.ui.Model;
@Controller
public class index {
	
    @RequestMapping("/")
    public String index(Model model) {
        
        String name = "Copper Wire";
        String itemName = "Copper wire";
        double price = 5.25;
        String description = "Metal strips, also an illustration of nanoseconds.";
        String vendor = "Little Things Corner Store";
    
        // Your code here! Add values to the view model to be rendered
        model.addAttribute("name",name);
        model.addAttribute("itemName", itemName);
        model.addAttribute("price", price);
        model.addAttribute("description", description);
        model.addAttribute("vendor", vendor);
    
        return "index.jsp";
    }
 }

