package io.planet_saints_serverless.planet_saints_serverless.repos;

import io.planet_saints_serverless.planet_saints_serverless.model.Events;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventsRepository extends CrudRepository<Events, String> {
}
