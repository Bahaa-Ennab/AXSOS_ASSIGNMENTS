package com.bahaa.JavaExam.contollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.bahaa.JavaExam.models.Talk;
import com.bahaa.JavaExam.models.User;
import com.bahaa.JavaExam.services.TalkService;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
public class TalkController {
	@Autowired
	private TalkService talkSerivce;

	@GetMapping("/show_addTalk")
	public String index(Model model, HttpSession session) {

		// Bind empty User and LoginUser objects to the JSP
		// to capture the form input
		model.addAttribute("newTalkk", new Talk());
		return "talk.jsp";
	}

	@PostMapping("/addtalk")
	public String createProduct(@Valid @ModelAttribute("newTalkk") Talk talk,BindingResult result, Model model, 
			HttpSession session) {
		if (result.hasErrors()) {
			return "talk.jsp";
		} else {
			User user = (User) session.getAttribute("loggedUser");
			talkSerivce.createTalk(talk, user);
			model.addAttribute("user", session.getAttribute("loggedUser"));
			model.addAttribute("talk", talk);
			return "talkDetails.jsp";
		}
	}

	@GetMapping("/talk/{id}")
	public String index(Model model, HttpSession session, @PathVariable Long id) {
		Talk talk = talkSerivce.findTalkById(id);
		// Bind empty User and LoginUser objects to the JSP
		// to capture the form input
		model.addAttribute("user", session.getAttribute("loggedUser"));
		model.addAttribute("talk", talk);

		return "talkDetails.jsp";
	}

	@DeleteMapping("/delete/{id}")
	public String deletetalk(@PathVariable("id") Long id,HttpSession session) {
			talkSerivce.deletetalk(id);
			return "redirect:/home";
		}
	
	@GetMapping("/update/{id}")
	public String updateTalk(@PathVariable Long id, Model model,HttpSession session) {
		Talk talk = talkSerivce.findTalkById(id);
		model.addAttribute("user", session.getAttribute("loggedUser"));
		model.addAttribute("talkedit", talk);
		return "TalkUpdate.jsp";
	}
	
	@PutMapping("/updatetalk/{id}")
	public String edit(@Valid @ModelAttribute("talkedit") Talk talk,BindingResult result,@PathVariable("id") Long id,  Model model,HttpSession session) {
		if (result.hasErrors()) {
			model.addAttribute("talkedit", talk);
			return "TalkUpdate.jsp";
		} else {
				talkSerivce.updateTalk(talk);				
				return "redirect:/talk/{id}";
			}
		}
	}

