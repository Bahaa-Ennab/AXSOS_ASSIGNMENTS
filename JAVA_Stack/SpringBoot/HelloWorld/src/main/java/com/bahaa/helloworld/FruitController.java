package com.bahaa.helloworld;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FruitController {
    @RequestMapping("/fr")
    public String index() {
        return "index.jsp";
    }
} 
