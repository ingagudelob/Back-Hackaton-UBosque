package com.spring.mongo.api.resource;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.mongo.api.model.Donaciones;
import com.spring.mongo.api.respository.DonacionesRepository;

@RestController // Anotacion que es un controlador
@RequestMapping(value ="/apiPancitas/donaciones")
@CrossOrigin("*")
public class DonacionesControlller {
	
	// Creamos un objeto de tipo repository de Donaciones
	
	@Autowired
	private DonacionesRepository repositorio;
	
	
	@PostMapping("/addDonaciones")
	public String saveDonaciones(@RequestBody Donaciones donacion) {
		repositorio.save(donacion);
		return "donacion Guardado con el Id: "+ donacion.getId();
	}
	
	@GetMapping("/listDonaciones")
	public List<Donaciones> ListDonaciones(){ // No se reciben paremetros porq lista todos lo clientes
		return repositorio.findAll();
	}
	
	@GetMapping("/listDonaciones/{id}")
	public Optional<Donaciones> ListDonaciones(@PathVariable int id){
		return repositorio.findById(id);
	}
	
	@DeleteMapping("/deleteDonaciones/{id}")
	public String deleteDonaciones(@PathVariable int id) {
		repositorio.deleteById(id);
		return "donacion eliminado con el Id: "+ id;
	}
}
