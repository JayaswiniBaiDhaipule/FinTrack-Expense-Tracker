package com.app.FinTrack.service;

import com.app.FinTrack.model.Expense;
import com.app.FinTrack.repository.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseService {

    @Autowired
    private ExpenseRepository expenseRepository;

//    to get all the expenses
    public List<Expense> getAllExpense(){
        return expenseRepository.findAll();
    }

//    to save an expense
    public void saveExpense(Expense expense) {
        expenseRepository.save(expense);
    }

//    to get an expense by id
    public Expense getExpenseById(Long id) {
        return expenseRepository.findById(id).orElse(null);
    }

//    to delete an expense
    public void deleteExpenseById(Long id) {
        expenseRepository.deleteById(id);
    }


}
