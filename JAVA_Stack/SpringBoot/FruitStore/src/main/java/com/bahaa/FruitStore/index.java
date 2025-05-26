package com.bahaa.FruitStore;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class index {
	@RequestMapping("/main")
	public String index(Model model){
		return "index.jsp";
	}

}
