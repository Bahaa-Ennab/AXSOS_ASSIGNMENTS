package com.bahaa.SaveTravels.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bahaa.SaveTravels.models.Expense;
@Repository
public interface ExpenseRepository extends CrudRepository<Expense, Long>{
	List<Expense> findAll();
}
