package com.spring.mongo.api.respository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.spring.mongo.api.model.Fundaciones;

public interface FundacionesRepository extends MongoRepository<Fundaciones, Integer> {

}
