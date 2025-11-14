package com.example.datcao.service;

import com.example.datcao.entity.Product;
import java.util.List;

public interface ProductService {
    List<Product> getAllProduct();
    Product getSingleProduct(int productId);
    void insertProduct(Product product) throws Exception;
}
