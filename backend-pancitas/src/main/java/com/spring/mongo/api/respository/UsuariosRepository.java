package com.spring.mongo.api.respository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.spring.mongo.api.model.Usuarios;

public interface UsuariosRepository extends MongoRepository<Usuarios, Integer>{
	
}
