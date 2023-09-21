package com.jimmycasta.sgp.repository;

import com.jimmycasta.sgp.entity.ExpenseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpenseRepository extends JpaRepository<ExpenseEntity,Integer> {
}
