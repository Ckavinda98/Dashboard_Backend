package com.easy2excel.springbootawsdynamodbcrud.service;

import com.easy2excel.springbootawsdynamodbcrud.entity.Tableone;
import com.easy2excel.springbootawsdynamodbcrud.entity.Tabletwo;
import com.easy2excel.springbootawsdynamodbcrud.repository.TabletwoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TabletwoServiceImpl implements TabletwoService{
    @Autowired
    TabletwoRepository tabletwoRepository;

    @Override
    public List<Tableone> getProductList() {
        return null;
    }



    @Override
    public List<Tabletwo> getTabletwoList() {
        return (List<Tabletwo>) tabletwoRepository.findAll();
    }
}
