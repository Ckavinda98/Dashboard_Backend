package com.easy2excel.springbootawsdynamodbcrud.service;

import com.easy2excel.springbootawsdynamodbcrud.entity.Product;
import com.easy2excel.springbootawsdynamodbcrud.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    ProductRepository productRepository;

    @Override
    public List<Product> getProductList() {
        return(List<Product>) productRepository.findAll();
    }

//    @Override
//    public Product saveProduct(Product product) {
//        return productRepository.save(product);
//    }

//    @Override
//    public Product getProductById(String index) {
//        return productRepository.findById(index)
//                                .orElseThrow(() -> new ResourceNotFoundException("Product Not Found :" + index));
//    }
//
//    @Override
//    public Product updateProduct(String index, Product product) {
//        productRepository.findById(index)
//                .orElseThrow(() -> new ResourceNotFoundException("Product Not Found"+index));
//        product.setIndex(index);
//        return productRepository.save(product);
//    }
//
//    @Override
//    public void deleteProduct(String id) {
//        productRepository.findById(id)
//                .orElseThrow(() -> new ResourceNotFoundException("Product Not Found :"+id));
//        productRepository.deleteById(id);
//    }
}
