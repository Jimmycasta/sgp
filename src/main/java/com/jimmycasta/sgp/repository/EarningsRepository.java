package com.jimmycasta.sgp.repository;

import com.jimmycasta.sgp.entity.EarningsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.Optional;

public interface EarningsRepository extends JpaRepository<EarningsEntity, Integer> {

    @Query(value = "SELECT SUM(earnings) FROM  sgpdb.earnings", nativeQuery = true)
    double getAllEarning();

    @Query(value = "SELECT sum(earnings) FROM sgpdb.earnings er WHERE er.date BETWEEN :fechaInicio AND :fechaFin", nativeQuery = true)
    Optional<Double> getEarningsByDate(@Param("fechaInicio") LocalDate fechaInicio, @Param("fechaFin") LocalDate fechaFin);


}
