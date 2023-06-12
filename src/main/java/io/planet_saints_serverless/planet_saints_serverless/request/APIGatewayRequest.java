package io.planet_saints_serverless.planet_saints_serverless.request;

public class APIGatewayRequest {
    private String httpMethod;
    private OrdersRequest ordersRequest;
    public String getHttpMethod() {
        return httpMethod;
    }
    public void setHttpMethod(String httpMethod) {
        this.httpMethod = httpMethod;
    }
    public OrdersRequest getUserRequest() {
        return ordersRequest;
    }
    public void setUserRequest(OrdersRequest userRequest) {
        this.ordersRequest = userRequest;
    }
}
