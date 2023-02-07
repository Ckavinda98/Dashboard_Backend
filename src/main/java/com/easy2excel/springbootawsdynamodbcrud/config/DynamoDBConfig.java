package com.easy2excel.springbootawsdynamodbcrud.config;


import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.client.builder.AwsClientBuilder;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import org.socialsignin.spring.data.dynamodb.repository.config.EnableDynamoDBRepositories;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableDynamoDBRepositories(basePackages = "com.easy2excel.springbootawsdynamodbcrud.repository")
public class DynamoDBConfig {
    @Value("dynamodb.us-east-1.amazonaws.com")
    String endpoint;
    @Value("AKIARQJ76BMP4WLC4I5B")
    String accesskey;
    @Value("Jprlb5/rEohSfTjRhccicz+RhbrUGRtTVoe24I02")
    String secretkey;
    @Value("us-east-1")
    String region;

    @Bean
    public AmazonDynamoDB amazonDynamoDB() {
        return AmazonDynamoDBClientBuilder
                .standard()
                .withEndpointConfiguration(
                        new AwsClientBuilder.EndpointConfiguration(endpoint,region))
                .withCredentials(new AWSStaticCredentialsProvider(
                        new BasicAWSCredentials(accesskey,secretkey)))
                .build();
    }


}
