package com.jimmycasta.sgp.repository;

import com.jimmycasta.sgp.entity.ExpenseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.Optional;

public interface ExpenseRepository extends JpaRepository<ExpenseEntity,Integer> {

    @Query(value = "SELECT SUM(amount) FROM sgpdb.expenses e WHERE e.id_category = :id AND e.date BETWEEN :fechaInicio AND :fechaFin", nativeQuery = true)
    Optional<Double> getExpensesByDateAndId(@Param("fechaInicio") LocalDate fechaInicio, @Param("fechaFin") LocalDate fechaFin, @Param("id") Integer id);

    @Query(value = "SELECT SUM(amount) FROM sgpdb.expenses WHERE date BETWEEN :fechaInicio AND :fechaFin", nativeQuery = true)
    Optional<Double> getExpensesByDate(@Param("fechaInicio") LocalDate fechaInicio, @Param("fechaFin") LocalDate fechaFin);

}
