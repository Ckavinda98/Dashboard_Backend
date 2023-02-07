package com.easy2excel.springbootawsdynamodbcrud.entity;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAutoGeneratedKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import lombok.Data;

@DynamoDBTable(tableName = "crm-es-product-data") // validates if the DynamoDB table exists or not.DynamoDB does not create collection automatically so it is important to create dynamodb before hand

@Data
public class Product {

    @DynamoDBHashKey(attributeName = "deployment") //marking a property as the hash key for a modeled class
    @DynamoDBAutoGeneratedKey              //for making the hashkey property to autogenerate the key & it supports String type only
    private String index;

    @DynamoDBAttribute(attributeName = "ns") //Maps a property to dynamodb table attribute.
    private String ns;

    @DynamoDBAttribute(attributeName = "indexPolicy")
    private String indexPolicy;

    @DynamoDBAttribute(attributeName = "isUser")
    private String isUser;

    @DynamoDBAttribute(attributeName = "isUserRole")
    private String isUserRole;

    @DynamoDBAttribute(attributeName = "prefix")
    private String prefix;

    @DynamoDBAttribute(attributeName = "system")
    private String system;


}