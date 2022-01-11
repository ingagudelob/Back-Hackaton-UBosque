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

import com.spring.mongo.api.model.Usuarios;
import com.spring.mongo.api.respository.UsuariosRepository;


@RestController // Anotacion que es un controlador
@RequestMapping(value ="/apiPancitas/usuarios")
@CrossOrigin("*")
public class UsuariosController {
	
	@Autowired
	private UsuariosRepository repositorio;
	
	

	@PostMapping("/addUsuario")
	public String saveUsuarios(@RequestBody Usuarios usuario) {
	repositorio.save(usuario);
	return "Se agregó una Usuario con el codigo: "+ usuario.getId();
	}
	
	@GetMapping("/finAllUsuarios")
	public List<Usuarios> listarUsuarios(){
	return repositorio.findAll();
	}
	
	@GetMapping("/finAllUsuarios/{id}")
	public Optional<Usuarios> listarUsuarios(@PathVariable int id){
	return repositorio.findById(id);
	}
	

	
	@DeleteMapping("/deleteUsuarios/{id}")
	public String deleteUsuarios(@PathVariable int id){
	repositorio.findById(id);
	return "Usuario eliminada con el id: "+id;
	}
	
	
}
