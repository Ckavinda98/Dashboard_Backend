package com.easy2excel.springbootawsdynamodbcrud.controller;

import com.easy2excel.springbootawsdynamodbcrud.entity.Tableone;
import com.easy2excel.springbootawsdynamodbcrud.service.TableoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TableoneController {

    final TableoneService tableoneService;
    @Autowired
    public TableoneController(TableoneService tableoneService) {
        this.tableoneService = tableoneService;
    }

    @GetMapping("/api/tableone/allrecodrs")
    public ResponseEntity<List<Tableone>> getTableoneList(){
        return ResponseEntity.ok(tableoneService.getTableoneList());
    }
}
