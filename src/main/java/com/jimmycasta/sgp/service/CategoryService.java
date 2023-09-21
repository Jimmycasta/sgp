package com.jimmycasta.sgp.service;

import com.jimmycasta.sgp.entity.CategoryEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CategoryService {

    CategoryEntity save(CategoryEntity category);

    List<CategoryEntity> getAll();

    void delete(int idCategory);
}
