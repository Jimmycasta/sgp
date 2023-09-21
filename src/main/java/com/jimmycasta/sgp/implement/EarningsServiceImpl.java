package com.jimmycasta.sgp.implement;

import com.jimmycasta.sgp.entity.EarningsEntity;
import com.jimmycasta.sgp.repository.EarningsRepository;
import com.jimmycasta.sgp.service.EarningsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EarningsServiceImpl implements EarningsService {

    private final EarningsRepository earningsRepository;

    @Autowired
    public EarningsServiceImpl(EarningsRepository earningsRepository) {
        this.earningsRepository = earningsRepository;

    }

    @Override
    public List<EarningsEntity> getAll() {
        return this.earningsRepository.findAll();
    }

    @Override
    public EarningsEntity save(EarningsEntity earnings) {
        return this.earningsRepository.save(earnings);
    }

    @Override
    public void delete(int idEarnings) {
        this.earningsRepository.deleteById(idEarnings);
    }
}
