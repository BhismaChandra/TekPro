package com.praktikum7.bhisma.praktikumspringbootmongodb.repository.service;

import org.springframework.stereotype.Service;

import com.praktikum7.bhisma.praktikumspringbootmongodb.model.Expense;
import com.praktikum7.bhisma.praktikumspringbootmongodb.repository.ExpenseRepository;

import java.util.List;

@Service
public class ExpenseService {
	
	private final ExpenseRepository expenseRepository;
	
	public ExpenseService(ExpenseRepository expenseRepository) {
		this.expenseRepository = expenseRepository;
	}

	public void addExspense(Expense expense) {
		expenseRepository.insert(expense);
	}
	
	public void updateExspense(Expense expense) {
		Expense savedExpense = expenseRepository.findById(expense.getId()).
				orElseThrow(() -> new RuntimeException(String.format(
						"Cannot Find Expense by ID %s", expense.getId())));

		savedExpense.setExpenseName(expense.getExpenseName());
		savedExpense.setExpenseCategory(expense.getExpenseCategory());
		savedExpense.setExpenseAmount(expense.getExpenseAmount());
		
		expenseRepository.save(savedExpense);
	}
	
	public List<Expense> getAllExspenses() {
		return expenseRepository.findAll();
	}
	
	public Expense getExspenseByName(String name) {
		return expenseRepository.findByName(name).
		orElseThrow(() -> new RuntimeException(String.format(
				"Cannot Find Expense by Name %s", name)));
	}
	
	public void deleteExspense(String id) {
		expenseRepository.deleteById(id);
	}
}
