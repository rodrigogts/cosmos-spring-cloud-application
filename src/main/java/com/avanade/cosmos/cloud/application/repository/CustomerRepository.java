package com.avanade.cosmos.cloud.application.repository;

import com.avanade.cosmos.cloud.application.model.CustomerModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;

@Component
public interface CustomerRepository extends MongoRepository<CustomerModel, String> {
}
