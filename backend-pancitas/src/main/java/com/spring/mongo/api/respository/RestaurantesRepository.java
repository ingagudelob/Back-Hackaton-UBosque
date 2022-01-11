package com.spring.mongo.api.respository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.spring.mongo.api.model.Restaurantes;

public interface RestaurantesRepository extends MongoRepository<Restaurantes, Integer> {

}
