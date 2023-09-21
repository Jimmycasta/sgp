package com.jimmycasta.sgp.service;

import com.jimmycasta.sgp.entity.ExpenseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ExpenseService {

    ExpenseEntity save(ExpenseEntity expense);

    List<ExpenseEntity> getAll();

    void delete(int idExpense);
}
