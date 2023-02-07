package com.easy2excel.springbootawsdynamodbcrud.service;

import com.easy2excel.springbootawsdynamodbcrud.entity.Tableone;
import com.easy2excel.springbootawsdynamodbcrud.repository.TableoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TableoneServiceImpl implements TableoneService {
    @Autowired
    TableoneRepository tableoneRepository;

    @Override
    public List<Tableone> getProductList() {
        return null;
    }

    @Override
    public List<Tableone> getTableoneList() {
        return (List<Tableone>) tableoneRepository.findAll();
    }
}