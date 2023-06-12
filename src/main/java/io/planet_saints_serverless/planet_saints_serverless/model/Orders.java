package io.planet_saints_serverless.planet_saints_serverless.model;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@DynamoDBTable(tableName = "orders-table")
public class Orders {

    @DynamoDBHashKey
    private Long id;

    @DynamoDBAttribute(attributeName = "customer_Name")
    @Size(max = 255)
    private String customerName;

    @DynamoDBAttribute(attributeName = "order_number")
    private Integer order;

}
