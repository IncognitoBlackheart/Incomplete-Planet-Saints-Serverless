package io.planet_saints_serverless.planet_saints_serverless.request;

import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrdersRequest {

    private Long id;

    @Size(max = 255)
    private String customerName;

    private Integer order;
}
