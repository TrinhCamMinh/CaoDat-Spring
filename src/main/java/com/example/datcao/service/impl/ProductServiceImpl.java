package com.example.datcao.service.impl;

import com.example.datcao.entity.Category;
import com.example.datcao.entity.Product;
import com.example.datcao.repository.CategoryRepository;
import com.example.datcao.repository.ProductRepository;
import com.example.datcao.service.ProductService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;
    private final CategoryRepository categoryRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Product> getAllProduct() {
        return productRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Product getSingleProduct(int productId) {
        return productRepository.findByProductId(productId);
    }

    @Override
    @Transactional
    public void insertProduct(Product product) throws Exception {
        Category category = categoryRepository.findByCategoryId(product.getCategoryId());
        if(category == null) {
            throw new Exception("category was found with this ID");
        }
        productRepository.save(product);
    }
}
