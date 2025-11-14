package com.example.datcao.service.impl;

import com.example.datcao.entity.Category;
import com.example.datcao.repository.CategoryRepository;
import com.example.datcao.service.CategoryService;
import java.util.Collections;
import java.util.List;
import org.springframework.transaction.annotation.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {
    private final CategoryRepository categoryRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    @Override
    @Transactional
    public void insertCategory(Category category) {
        categoryRepository.save(category);
    }
}
