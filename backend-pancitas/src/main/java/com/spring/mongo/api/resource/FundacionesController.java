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

import com.spring.mongo.api.model.Fundaciones;
import com.spring.mongo.api.respository.FundacionesRepository;

@RestController // Anotacion que es un controlador
@RequestMapping(value ="/apiPancitas/fundaciones")
@CrossOrigin("*")
public class FundacionesController {

	@Autowired 
	private FundacionesRepository repository;
	
	@PostMapping("/addFundacion")
	public String saveFundaciones(@RequestBody Fundaciones fundacion) {
		repository.save(fundacion);
		return "Fundacioneso Guardado con el Id: "+ fundacion.getId();
	}
	
	@GetMapping("/findAllFundaciones")
	public List<Fundaciones> listFundaciones(){
		//findAll() trae toda la lista
		return repository.findAll();
	}
	
	@GetMapping("/findAllFundaciones/{id}")
	public Optional<Fundaciones> listFundaciones(@PathVariable int id){
		return repository.findById(id);
	}
	
	@DeleteMapping("/deleteFundaciones/{id}")
	public String deleteFundaciones(@PathVariable int id) {
		repository.deleteById(id);
		return "Fundacioneso eliminado con el Id: "+ id;
	}
	
	
}
