package com.easy2excel.springbootawsdynamodbcrud.service;

import com.easy2excel.springbootawsdynamodbcrud.entity.Tableone;
import com.easy2excel.springbootawsdynamodbcrud.entity.Tabletwo;

import java.util.List;

public interface TabletwoService {


    List<Tableone> getProductList();

    List<Tabletwo> getTabletwoList();
}
