package com.easy2excel.springbootawsdynamodbcrud.repository;

import com.easy2excel.springbootawsdynamodbcrud.entity.Tableone;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
@EnableScan
public interface TableoneRepository extends CrudRepository<Tableone,String> {
}
