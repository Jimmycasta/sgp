package com.jimmycasta.sgp.service;

import com.jimmycasta.sgp.entity.EarningsEntity;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public interface EarningsService {

    List<EarningsEntity> getAll();

    EarningsEntity save(EarningsEntity earnings);

    void delete(int idEarnings);

    double getAllEarning();

    double getEarningsByDate(LocalDate fechaInicio, LocalDate fechaFin);


}
