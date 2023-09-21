package com.jimmycasta.sgp.repository;

import com.jimmycasta.sgp.entity.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<CategoryEntity,Integer> {
}
