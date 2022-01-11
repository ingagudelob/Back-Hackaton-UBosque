package com.spring.mongo.api.respository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.spring.mongo.api.model.Conductores;

public interface ConductoresRepository extends MongoRepository<Conductores, Integer> {

}
