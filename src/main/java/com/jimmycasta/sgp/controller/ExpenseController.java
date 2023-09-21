package com.jimmycasta.sgp.controller;

import com.jimmycasta.sgp.entity.ExpenseEntity;
import com.jimmycasta.sgp.service.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/gastos")
public class ExpenseController {

    private final ExpenseService expenseService;

    @Autowired
    public ExpenseController(ExpenseService expenseService) {
        this.expenseService = expenseService;

    }

    @GetMapping("/listar")
    public ResponseEntity<List<ExpenseEntity>> getAll() {
        return ResponseEntity.ok(this.expenseService.getAll());
    }

    @PostMapping("/guardar")
    public ResponseEntity<ExpenseEntity> save(@RequestBody ExpenseEntity expense) {
        return ResponseEntity.ok(this.expenseService.save(expense));
    }

    @DeleteMapping("/eliminar/{idExpense}")
    public ResponseEntity<Void> delete(@PathVariable int idExpense) {
        expenseService.delete(idExpense);
        return ResponseEntity.ok().build();
    }
}
