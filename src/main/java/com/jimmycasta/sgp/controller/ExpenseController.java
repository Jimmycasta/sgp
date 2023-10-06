package com.jimmycasta.sgp.controller;

import com.jimmycasta.sgp.entity.ExpenseEntity;
import com.jimmycasta.sgp.service.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/gastos")
public class ExpenseController {

    private final ExpenseService expensesService;

    @Autowired
    public ExpenseController(ExpenseService expenseService) {
        this.expensesService = expenseService;

    }

    @GetMapping("/listar")
    public ResponseEntity<List<ExpenseEntity>> getAll() {
        return ResponseEntity.ok(this.expensesService.getAll());
    }

    @PostMapping("/guardar")
    public ResponseEntity<ExpenseEntity> save(@RequestBody ExpenseEntity expense) {
        return ResponseEntity.ok(this.expensesService.save(expense));
    }

    @DeleteMapping("/eliminar/{idExpense}")
    public ResponseEntity<Void> delete(@PathVariable int idExpense) {
        expensesService.delete(idExpense);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{fechaInicio}/{fechaFin}/{id}")
    public ResponseEntity<Double> getExpensesByDateAndId(@PathVariable LocalDate fechaInicio,
                                                         @PathVariable LocalDate fechaFin,
                                                         @PathVariable int id) {
        return ResponseEntity.ok(this.expensesService.getExpensesByDateAndId(fechaInicio, fechaFin, id));
    }

    @GetMapping("/{fechaInicio}/{fechaFin}")
    public ResponseEntity<Double> getExpensesByDate(@PathVariable LocalDate fechaInicio,
                                                    @PathVariable LocalDate fechaFin) {
        return ResponseEntity.ok(this.expensesService.getExpensesByDate(fechaInicio, fechaFin) );
    }

}
