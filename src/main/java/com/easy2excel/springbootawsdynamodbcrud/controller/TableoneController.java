package com.easy2excel.springbootawsdynamodbcrud.controller;

import com.easy2excel.springbootawsdynamodbcrud.entity.Tableone;
import com.easy2excel.springbootawsdynamodbcrud.service.TableoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1")
public class TableoneController {

    final TableoneService tableoneService;
    @Autowired
    public TableoneController(TableoneService tableoneService) {
        this.tableoneService = tableoneService;
    }

    @GetMapping("/tableone")
    public ResponseEntity<List<Tableone>> getTableoneList(){
        return ResponseEntity.ok(tableoneService.getTableoneList());
    }
}
