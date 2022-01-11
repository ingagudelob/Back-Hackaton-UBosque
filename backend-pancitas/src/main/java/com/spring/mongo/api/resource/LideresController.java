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

import com.spring.mongo.api.model.Lideres;
import com.spring.mongo.api.respository.LiderRepository;

@RestController // Anotacion que es un controlador
@RequestMapping(value ="/apiTienda/lideres")
@CrossOrigin("*")
public class LideresController {
	
	@Autowired
	private LiderRepository repositorio;
	
	// Metodo para agregar un Lider
	@PostMapping("/addLider")
	public String saveLider(@RequestBody Lideres lider) {
		repositorio.save(lider);
		return "Lider creado con id: "+ lider.getId();
	}
	
	// Metodo para listar Lider
	@GetMapping("/listLider")
	public List<Lideres> fynAllLider(){
		return repositorio.findAll();
		
	}
	
	// Metodo para listar un Lider por id
	@GetMapping("/listLider/{id}") 
	public Optional<Lideres> fynAllLider(@PathVariable int id){
		return repositorio.findById(id);
		
	}
	
	// Metodo para eliminar un usuario
	@DeleteMapping("/deleteLider/{id}")
	public String deleteLider(@PathVariable int id) {
		repositorio.deleteById(id);
		return "Lider eliminado con el Id: "+ id;
	}
	
	
}
