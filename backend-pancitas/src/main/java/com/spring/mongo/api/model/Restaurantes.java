package com.spring.mongo.api.model;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Document(collection="db_restaurantes")
public class Restaurantes {
	
    private int id;
    private String nombreRestaurante;
    private String contactoRestaurante;
    private String emailRestaurante;
    private String ciudadRestaurante;
    private String dirRestaurante;
  
	private String teflRestaurante;
    private String passRestaurante;
    private int platos;
    private int productos;
    
    public int getPlatos() {
  		return platos;
  	}
  	public void setPlatos(int platos) {
  		this.platos = platos;
  	}
  	public int getProductos() {
  		return productos;
  	}
  	public void setProductos(int productos) {
  		this.productos = productos;
  	}
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombreRestaurante() {
		return nombreRestaurante;
	}
	public void setNombreRestaurante(String nombreRestaurante) {
		this.nombreRestaurante = nombreRestaurante;
	}
	public String getContactoRestaurante() {
		return contactoRestaurante;
	}
	public void setContactoRestaurante(String contactoRestaurante) {
		this.contactoRestaurante = contactoRestaurante;
	}
	public String getEmailRestaurante() {
		return emailRestaurante;
	}
	public void setEmailRestaurante(String emailRestaurante) {
		this.emailRestaurante = emailRestaurante;
	}
	public String getCiudadRestaurante() {
		return ciudadRestaurante;
	}
	public void setCiudadRestaurante(String ciudadRestaurante) {
		this.ciudadRestaurante = ciudadRestaurante;
	}
	public String getDirRestaurante() {
		return dirRestaurante;
	}
	public void setDirRestaurante(String dirRestaurante) {
		this.dirRestaurante = dirRestaurante;
	}
	public String getTeflRestaurante() {
		return teflRestaurante;
	}
	public void setTeflRestaurante(String teflRestaurante) {
		this.teflRestaurante = teflRestaurante;
	}
	public String getPassRestaurante() {
		return passRestaurante;
	}
	public void setPassRestaurante(String passRestaurante) {
		this.passRestaurante = passRestaurante;
	}
    
    
}
