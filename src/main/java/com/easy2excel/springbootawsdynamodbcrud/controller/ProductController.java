package com.easy2excel.springbootawsdynamodbcrud.controller;

import com.easy2excel.springbootawsdynamodbcrud.entity.Product;
import com.easy2excel.springbootawsdynamodbcrud.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {


    final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }


    @GetMapping("/api/tablethree/allrecodrs")
    public ResponseEntity<List<Product>> getProductList(){
        return ResponseEntity.ok(productService.getProductList());
    }

}
