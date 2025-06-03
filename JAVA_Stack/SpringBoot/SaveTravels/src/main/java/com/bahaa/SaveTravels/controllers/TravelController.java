package com.bahaa.SaveTravels.controllers;

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

import com.bahaa.SaveTravels.models.Expense;
import com.bahaa.SaveTravels.services.ExpenseService;

import jakarta.validation.Valid;

@Controller
public class TravelController {
	
	@Autowired
	private ExpenseService expenseService;
	
	@GetMapping("/")
	public String showIndex(@ModelAttribute("expense") Expense expense, Model model) {
		model.addAttribute("expenses",expenseService.allExpenses());
		return "index.jsp";
	}
	
	@PostMapping("/expenses")
	public String create(@Valid @ModelAttribute("expense") Expense expense, BindingResult result) {
		if (result.hasErrors()) {
			return "index.jsp";
		} else {
			expenseService.createExpense(expense);
			return "redirect:/";
		}
	}
	
	@GetMapping("/{id}")
	public String editDetails(@PathVariable Long id, Model model) {
		model.addAttribute("expense", expenseService.findById(id));
		return "edit.jsp";
	}
	
	@PutMapping("/expense/{id}")
	public String edit(@Valid @ModelAttribute("expense") Expense expense, BindingResult result, Model model) {
		if (result.hasErrors()) {
			model.addAttribute("expense", expense);
			return "edit.jsp";
		} else {
			expenseService.updateExpense(expense);
			return "redirect:/";
		}
	}
	
	@DeleteMapping("/delete/{id}")
	public String destroy(@PathVariable("id") Long id) {
		Expense expense = expenseService.findById(id);
		expenseService.deleteExpense(expense);
		return "redirect:/";
	}
	
	@GetMapping("/show/{id}")
	public String showExpense(@PathVariable("id") Long id,@ModelAttribute("expense") Expense expense, Model model) {
		model.addAttribute("expense",expenseService.findById(id));
		return "details.jsp";
	}
	

}
