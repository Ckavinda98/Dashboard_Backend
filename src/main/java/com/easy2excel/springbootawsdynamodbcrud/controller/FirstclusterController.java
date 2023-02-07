//package com.easy2excel.springbootawsdynamodbcrud.controller;
//
//import com.easy2excel.springbootawsdynamodbcrud.entity.Product;
//import com.easy2excel.springbootawsdynamodbcrud.repository.FirstclusterRepository;
//import com.easy2excel.springbootawsdynamodbcrud.service.FirstclusterService;
//import lombok.AllArgsConstructor;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//
//@CrossOrigin
//@RestController
//@RequestMapping
//@AllArgsConstructor
//public class FirstclusterController {
//    private FirstclusterRepository firstclusterRepository;
//    private FirstclusterService firstclusterService;
//
//    @GetMapping("/findAll")
//    public ResponseEntity<List<Product>>  findAll(){
//        return new ResponseEntity<>( firstclusterRepository.findAll(), HttpStatus.ACCEPTED);
//    }
//}
