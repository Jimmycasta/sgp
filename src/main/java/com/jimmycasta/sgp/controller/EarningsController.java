package com.jimmycasta.sgp.controller;

import com.jimmycasta.sgp.entity.EarningsEntity;
import com.jimmycasta.sgp.service.EarningsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/ganancias")
public class EarningsController {

    private final EarningsService earningsService;

    @Autowired
    public EarningsController(EarningsService earningsService) {
        this.earningsService = earningsService;

    }

    @GetMapping("/listar")
    public ResponseEntity<List<EarningsEntity>> getAll() {
        return ResponseEntity.ok(this.earningsService.getAll());
    }

    @PostMapping("/guardar")
    public ResponseEntity<EarningsEntity> save(@RequestBody EarningsEntity earnings) {
        return ResponseEntity.ok(this.earningsService.save(earnings));

    }

    @DeleteMapping("/eliminar/{idEarnings}")
    public ResponseEntity<Void> delete(@PathVariable int idEarnings) {
        this.earningsService.delete(idEarnings);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/todo")
    public ResponseEntity<Double> getTotalEarnings() {
        return ResponseEntity.ok(this.earningsService.getAllEarning());
    }

    @GetMapping("/{fechaInicio}/{fechaFin}")
    public ResponseEntity<Double> getEarningsByDate(@PathVariable LocalDate fechaInicio,
                                                    @PathVariable LocalDate fechaFin) {
        return ResponseEntity.ok(this.earningsService.getEarningsByDate(fechaInicio, fechaFin));

    }


}
