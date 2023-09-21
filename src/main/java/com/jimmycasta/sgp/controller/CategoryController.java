package com.jimmycasta.sgp.controller;

import com.jimmycasta.sgp.entity.CategoryEntity;
import com.jimmycasta.sgp.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categorias")
public class CategoryController {

    private final CategoryService categoryService;

    @Autowired
    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;

    }

    @GetMapping("/listar")
    public ResponseEntity<List<CategoryEntity>> getAll() {
        return ResponseEntity.ok(this.categoryService.getAll());

    }

    @PostMapping("/guardar")
    public ResponseEntity<CategoryEntity> save(@RequestBody CategoryEntity category) {
        return ResponseEntity.ok(this.categoryService.save(category));
    }

    @DeleteMapping("/eliminar/{idCategory}")
    public ResponseEntity<Void> delete(@PathVariable int idCategory) {
        this.categoryService.delete(idCategory);
        return ResponseEntity.ok().build();
    }
}
