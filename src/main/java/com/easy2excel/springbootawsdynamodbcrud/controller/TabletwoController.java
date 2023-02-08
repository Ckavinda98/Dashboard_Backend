package com.easy2excel.springbootawsdynamodbcrud.controller;

import com.easy2excel.springbootawsdynamodbcrud.entity.Tabletwo;
import com.easy2excel.springbootawsdynamodbcrud.service.TabletwoService;
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
public class TabletwoController {
    final TabletwoService tabletwoService;
    @Autowired
    public TabletwoController(TabletwoService tabletwoService) {
        this.tabletwoService = tabletwoService;
    }

    @GetMapping("/tabletwo")
    public ResponseEntity<List<Tabletwo>> getTableoneList(){
        return ResponseEntity.ok(tabletwoService.getTabletwoList());
    }
}
