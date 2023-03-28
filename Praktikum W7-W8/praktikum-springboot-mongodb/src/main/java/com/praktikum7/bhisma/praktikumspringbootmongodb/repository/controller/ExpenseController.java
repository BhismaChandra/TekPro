package com.praktikum7.bhisma.praktikumspringbootmongodb.repository.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.praktikum7.bhisma.praktikumspringbootmongodb.model.Expense;
import com.praktikum7.bhisma.praktikumspringbootmongodb.repository.service.ExpenseService;

@RestController
@RequestMapping("/api/controller")
public class ExpenseController {
	
	private final ExpenseService expenseService;
	
	public ExpenseController(ExpenseService expenseService) {
		this.expenseService = expenseService;
	}

	@PostMapping
	public ResponseEntity addExspense(@RequestBody Expense expense) {
		expenseService.addExspense(expense);
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}
	
	@PutMapping
	public ResponseEntity updateExspense(@RequestBody Expense expense) {
		expenseService.updateExspense(expense);
		return ResponseEntity.ok().build();
	}
	
	@GetMapping
	public ResponseEntity<List<Expense>> getAllExspenses() {
		return ResponseEntity.ok(expenseService.getAllExspenses());
	}
	
	@GetMapping("/{name}")
	public ResponseEntity<Expense> getExspenseByName(@PathVariable String name) {
		return ResponseEntity.ok(expenseService.getExspenseByName(name));
	}
	@DeleteMapping("/{id}")
	public ResponseEntity deleteExspense(@PathVariable String id) {
		expenseService.deleteExspense(id);
		return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
	}
}
