package com.easy2excel.springbootawsdynamodbcrud.controller;

import com.easy2excel.springbootawsdynamodbcrud.entity.Tabletwo;
import com.easy2excel.springbootawsdynamodbcrud.service.TabletwoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TabletwoController {
    final TabletwoService tabletwoService;
    @Autowired
    public TabletwoController(TabletwoService tabletwoService) {
        this.tabletwoService = tabletwoService;
    }

    @GetMapping("/api/tabletwo/allrecodrs")
    public ResponseEntity<List<Tabletwo>> getTableoneList(){
        return ResponseEntity.ok(tabletwoService.getTabletwoList());
    }
}
