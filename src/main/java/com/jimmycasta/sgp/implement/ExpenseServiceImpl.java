package com.jimmycasta.sgp.implement;

import com.jimmycasta.sgp.entity.ExpenseEntity;
import com.jimmycasta.sgp.repository.ExpenseRepository;
import com.jimmycasta.sgp.service.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseServiceImpl implements ExpenseService {

    private final ExpenseRepository expenseRepository;

    @Autowired
    public ExpenseServiceImpl(ExpenseRepository expenseRepository) {
        this.expenseRepository = expenseRepository;
    }

    @Override
    public ExpenseEntity save(ExpenseEntity expense) {
        return expenseRepository.save(expense);
    }

    @Override
    public List<ExpenseEntity> getAll() {
        return expenseRepository.findAll();
    }

    @Override
    public void delete(int idExpense) {
        expenseRepository.deleteById(idExpense);
    }
}
