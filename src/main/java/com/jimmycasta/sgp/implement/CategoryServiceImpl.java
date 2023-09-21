package com.jimmycasta.sgp.implement;

import com.jimmycasta.sgp.entity.CategoryEntity;
import com.jimmycasta.sgp.repository.CategoryRepository;
import com.jimmycasta.sgp.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;

    @Autowired
    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }


    @Override
    public CategoryEntity save(CategoryEntity category) {
        return categoryRepository.save(category);
    }

    @Override
    public List<CategoryEntity> getAll() {
        return categoryRepository.findAll();
    }

    @Override
    public void delete(int idCategory) {
        categoryRepository.deleteById(idCategory);
    }
}
