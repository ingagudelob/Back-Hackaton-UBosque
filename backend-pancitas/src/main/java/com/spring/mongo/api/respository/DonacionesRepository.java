package com.spring.mongo.api.respository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.spring.mongo.api.model.Donaciones;

public interface DonacionesRepository extends MongoRepository<Donaciones, Integer> {

}
