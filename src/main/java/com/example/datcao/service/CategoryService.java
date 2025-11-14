package com.example.datcao.service;

import com.example.datcao.entity.Category;
import java.util.List;

public interface CategoryService {
    List<Category> getAllCategories();
    void insertCategory(Category category);
}
