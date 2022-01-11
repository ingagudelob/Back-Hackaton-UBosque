package com.spring.mongo.api.resource;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.mongo.api.model.Conductores;
import com.spring.mongo.api.respository.ConductoresRepository;

@RestController // Anotacion que es un controlador
@RequestMapping(value ="/apiPancitas/conductores")
@CrossOrigin("*")
public class ConductoresControlller {
	
	// Creamos un objeto de tipo repository de cliente
	@Autowired
	private ConductoresRepository repositorio;
	
	@PostMapping("/addRestaurante")
	public ResponseEntity<Conductores> saveConductor(@RequestBody Conductores conductor) {
		Conductores objConductor = repositorio.save(conductor);
		return new ResponseEntity<Conductores>(objConductor, HttpStatus.OK);
	}
	
	@GetMapping("/listRestaurante")
	public List<Conductores> ListConductor(){ // No se reciben paremetros porq lista todos lo clientes
		return repositorio.findAll();
	}
	
	@GetMapping("/listRestaurante/{id}")
	public Optional<Conductores> ListConductor(@PathVariable int id){
		return repositorio.findById(id);
	}
	
	@GetMapping("/deleteRestaurante/{id}")
	public ResponseEntity<Conductores> deleteConductor(@PathVariable int id) {
		Optional<Conductores> delConductor = repositorio.findById(id);
		System.out.print(delConductor);
		if (delConductor.isPresent()) {
			repositorio.deleteById(id);
			
		}else {
			return new ResponseEntity<Conductores>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<Conductores>(HttpStatus.OK);
		
	}
	
	
}
