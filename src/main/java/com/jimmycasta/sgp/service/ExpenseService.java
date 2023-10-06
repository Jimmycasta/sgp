package com.jimmycasta.sgp.service;

import com.jimmycasta.sgp.entity.ExpenseEntity;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public interface ExpenseService {

    ExpenseEntity save(ExpenseEntity expense);

    List<ExpenseEntity> getAll();

    void delete(int idExpense);

    double getExpensesByDateAndId(LocalDate fechaInicio, LocalDate fechaFin, Integer id);

    double getExpensesByDate(LocalDate fechaInicio, LocalDate fechaFin);
}
