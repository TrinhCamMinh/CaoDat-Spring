package com.example.datcao.controller;

import com.example.datcao.entity.Product;
import com.example.datcao.service.ProductService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/products", produces = MediaType.APPLICATION_JSON_VALUE)
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @GetMapping
    public ResponseEntity<List<Product>> getAllProduct() {
        return ResponseEntity.ok(productService.getAllProduct());
    }

    @GetMapping("{productId}")
    public ResponseEntity<Product> getSingleProduct(@PathVariable("productId") int productId) {
        return ResponseEntity.ok(productService.getSingleProduct(productId));
    }

    @PostMapping
    public ResponseEntity<String> insertProduct(@RequestBody Product product) throws Exception {
        productService.insertProduct(product);
        return ResponseEntity.ok("Product inserted successfully");
    }
}
