package com.easy2excel.springbootawsdynamodbcrud.service;

import com.easy2excel.springbootawsdynamodbcrud.entity.Tableone;

import java.util.List;

public interface TableoneService {
    List<Tableone> getProductList();

    List<Tableone> getTableoneList();
}
