package com.bahaa.SaveTravels.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bahaa.SaveTravels.models.Expense;
import com.bahaa.SaveTravels.repository.ExpenseRepository;

@Service
public class ExpenseService {
	
	private final ExpenseRepository expenserepo;
	
	public ExpenseService(ExpenseRepository expenserepo) {
		this.expenserepo = expenserepo;
	}
	
	public List<Expense> allExpenses(){
		return expenserepo.findAll();
	}
	
	public Expense createExpense(Expense expense) {
		return expenserepo.save(expense);
	}
	public Expense findById(Long id) {
		return expenserepo.findById(id).orElse(null);
	}
	public Expense updateExpense(Expense expense) {
		return expenserepo.save(expense);
	}
	public void deleteExpense(Expense expense) {
		expenserepo.delete(expense);
	}
}
