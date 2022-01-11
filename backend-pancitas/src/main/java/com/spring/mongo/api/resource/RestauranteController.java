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

import com.spring.mongo.api.model.Restaurantes;
import com.spring.mongo.api.respository.RestaurantesRepository;

@RestController // Anotacion que es un controlador
@RequestMapping(value ="/apiPancitas/restaurante")
@CrossOrigin("*")
public class RestauranteController {

	@Autowired 
	private RestaurantesRepository repository;
	
	@PostMapping("/addRestaurante")
	public String saveRestaurante(@RequestBody Restaurantes restaurante) {
		repository.save(restaurante);
		return "Libro Guardado con el Id: "+ restaurante.getId();
	}
	
	@GetMapping("/findAllRestaurante")
	public List<Restaurantes> getRestaurante(){
		//findAll() trae toda la lista
		return repository.findAll();
	}
	
	@GetMapping("/findAllRestaurante/{id}")
	public Optional<Restaurantes> getRestaurante(@PathVariable int id){
		return repository.findById(id);
	}
	
	@DeleteMapping("/deleteRestaurante/{id}")
	public String deleteRestaurante(@PathVariable int id) {
		repository.deleteById(id);
		return "Libro eliminado con el Id: "+ id;
	}
	
	
}
