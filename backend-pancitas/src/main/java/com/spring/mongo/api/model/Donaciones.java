package com.spring.mongo.api.model;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

@Document(collection="db_donaciones")
public class Donaciones {
	
	private int id;
	private long nombreDonante;
	private long valorDonacion;
	private String fechaDonacion;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getNombreDonante() {
		return nombreDonante;
	}
	public void setNombreDonante(long nombreDonante) {
		this.nombreDonante = nombreDonante;
	}
	public long getValorDonacion() {
		return valorDonacion;
	}
	public void setValorDonacion(long valorDonacion) {
		this.valorDonacion = valorDonacion;
	}
	public String getFechaDonacion() {
		return fechaDonacion;
	}
	public void setFechaDonacion(String fechaDonacion) {
		this.fechaDonacion = fechaDonacion;
	}
			
}
