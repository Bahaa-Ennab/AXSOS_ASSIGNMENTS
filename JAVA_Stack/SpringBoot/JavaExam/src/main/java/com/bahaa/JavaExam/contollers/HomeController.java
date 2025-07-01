package com.bahaa.JavaExam.contollers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.bahaa.JavaExam.models.LoginUser;
import com.bahaa.JavaExam.models.User;
import com.bahaa.JavaExam.services.TalkService;
import com.bahaa.JavaExam.services.UserService;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
public class HomeController {

	// Add once service is implemented:
	 @Autowired
	 private UserService userSerivce;
	 
	 @Autowired
	 private TalkService talkSerivce;

	@GetMapping("/")
	public String index(Model model) {

		// Bind empty User and LoginUser objects to the JSP
		// to capture the form input
		model.addAttribute("newUser", new User());
		model.addAttribute("newLogin", new LoginUser());
		return "index.jsp";
	}

	@PostMapping("/register")
	public String register(@Valid @ModelAttribute("newUser") User newUser, BindingResult result, Model model,
			HttpSession session) {
		User signedUpUser = userSerivce.register( newUser , result);
		if (result.hasErrors()) {
			model.addAttribute("newLogin", new LoginUser());
			return "index.jsp";
		}
		session.setAttribute("loggedUser", signedUpUser);
		return "redirect:/home";
	}
	
	@GetMapping("/home")
	public String home(HttpSession session, Model model) {
        if (session.getAttribute("loggedUser") != null) {
        	User user = (User) session.getAttribute("loggedUser");
        	model.addAttribute("user",user);
        	model.addAttribute("talks",talkSerivce.findAll());
        	return "home.jsp";
        }
        else {
            return "redirect:/";
        }
	}

	@PostMapping("/userlogin")
	public String login(@Valid @ModelAttribute("newLogin") LoginUser newLogin, BindingResult result, Model model,
			HttpSession session) {

		// Add once service is implemented:
		 User user = userSerivce.Login(newLogin, result);

		if (result.hasErrors()) {
			model.addAttribute("newUser", new User());
			return "index.jsp";
		}
		session.setAttribute("loggedUser", user);
		// No errors!
		// TO-DO Later: Store their ID from the DB in session,
		// in other words, log them in.

		return "redirect:/home";
	}
	
	 @GetMapping("/logout")
	    public String logout(HttpSession session) {
	        session.invalidate();
	        return "redirect:/";
	    }
}