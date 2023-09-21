package com.jimmycasta.sgp.repository;

import com.jimmycasta.sgp.entity.EarningsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EarningsRepository extends JpaRepository<EarningsEntity, Integer> {
}
