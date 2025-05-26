package com.bahaa.DisplayDate;

import java.text.SimpleDateFormat;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Time {
	@RequestMapping("/time")
	public String timeDisplay(Model model) {
		String pattern = "h:mm a";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		String date = simpleDateFormat.format(new java.util.Date());
		model.addAttribute("time",date);
		return "time.jsp";
	}
}
 