package io.planet_saints_serverless.planet_saints_serverless.config;

import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import io.planet_saints_serverless.planet_saints_serverless.repos.OrdersRepository;
import org.socialsignin.spring.data.dynamodb.repository.config.EnableDynamoDBRepositories;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableDynamoDBRepositories(basePackageClasses = OrdersRepository.class)
public class DynamoDBClient {
    @Value("${aws.auth.accessKeyId}")
    private String accessKeyId;
    @Value("${aws.auth.secretAccessKey}")
    private String secretAccessKey;
    @Value("${aws.auth.region}")
    private String region;
    @Bean
    public AmazonDynamoDB amazonDynamoDB() {
        final BasicAWSCredentials basicAWSCredentials = new BasicAWSCredentials(accessKeyId, secretAccessKey);
        return AmazonDynamoDBClientBuilder
                .standard()
                .withRegion(region)
                .withCredentials(new AWSStaticCredentialsProvider(basicAWSCredentials))
                .build();
    }
}
