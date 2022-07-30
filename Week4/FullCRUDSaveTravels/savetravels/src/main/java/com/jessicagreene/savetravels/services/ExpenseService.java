package com.jessicagreene.savetravels.services;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.jessicagreene.savetravels.models.Expense;
import com.jessicagreene.savetravels.repositories.ExpenseRepository;

@Service
public class ExpenseService {
	private final ExpenseRepository expenseRepo;
	
	public ExpenseService(ExpenseRepository expenseRepository) {
		this.expenseRepo = expenseRepository;
	}
	
	public ArrayList<Expense> allExpenses() {
		return expenseRepo.findAll();
	}

	public Expense createExpense(Expense expense) {
		return expenseRepo.save(expense);
		
	}
	
	public Expense findExpense(Long id) {
        return expenseRepo.findById(id).orElse(null);
	}

	public Expense updateExpense(Expense expense) {
		return expenseRepo.save(expense);
	}

	public void deleteExpense(Long id) {
		expenseRepo.deleteById(id);
		
	}
}
