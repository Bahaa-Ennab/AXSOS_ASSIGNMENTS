package com.bahaa.JavaExam.controllers;

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

import com.bahaa.JavaExam.models.Team;
import com.bahaa.JavaExam.models.User;
import com.bahaa.JavaExam.services.TeamService;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
public class TeamController {
	
	@Autowired
	private TeamService teamService;
	
	@GetMapping("/team/add-team")
	public String index(Model model, HttpSession session) {
		model.addAttribute("newTeam", new Team());
		return "add_team.jsp";
	}
	
	@PostMapping("/team/create-team")
	public String createTeam(@Valid @ModelAttribute("newTeam") Team team,BindingResult result, Model model, 
			HttpSession session) {
		if (result.hasErrors()) {
			return "add_team.jsp";
		} else {
			User user = (User) session.getAttribute("loggedUser");
			teamService.createTeam(team, user);
			model.addAttribute("user", session.getAttribute("loggedUser"));
			model.addAttribute("team", team);
			return "teamDetails.jsp";
		}
	}
	
	@GetMapping("/team/{id}")
	public String teamDetails(Model model, HttpSession session, @PathVariable Long id) {
		Team team = teamService.findTeamById(id);
		model.addAttribute("user", session.getAttribute("loggedUser"));
		model.addAttribute("team", team);
		return "teamDetails.jsp";
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteTeam(@PathVariable("id") Long id,HttpSession session) {
		teamService.deleteTeam(id);
			return "redirect:/home";
		}
	
	@GetMapping("/team/edit/{id}")
	public String updateTeam(@PathVariable Long id, Model model,HttpSession session) {
		Team team = teamService.findTeamById(id);
		model.addAttribute("user", session.getAttribute("loggedUser"));
		model.addAttribute("editTeam", team);
		return "editTeam.jsp";
	}
	
	@PutMapping("/update-team/{id}")
	public String edit(@Valid @ModelAttribute("editTeam") Team team,BindingResult result,@PathVariable("id") Long id,  Model model,HttpSession session) {
		if (result.hasErrors()) {
			model.addAttribute("editTeam", team);
			return "editTeam.jsp";
		} else {
			teamService.updateTeam(team);				
				return "redirect:/team/{id}";
			}
		}
	

}
