package io.planet_saints_serverless.planet_saints_serverless.repos;

import io.planet_saints_serverless.planet_saints_serverless.model.Orders;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdersRepository extends CrudRepository<Orders, String> {
}
