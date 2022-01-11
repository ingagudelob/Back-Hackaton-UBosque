package com.spring.mongo.api.model;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Document(collection="db_alimentos")
public class Alimentos {
	
	private int id;
	private String tipoAlimento;
	private long cantAlimento;
	private String detalleAlimento;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTipoAlimento() {
		return tipoAlimento;
	}
	public void setTipoAlimento(String tipoAlimento) {
		this.tipoAlimento = tipoAlimento;
	}
	public long getCantAlimento() {
		return cantAlimento;
	}
	public void setCantAlimento(long cantAlimento) {
		this.cantAlimento = cantAlimento;
	}
	public String getDetalleAlimento() {
		return detalleAlimento;
	}
	public void setDetalleAlimento(String detalleAlimento) {
		this.detalleAlimento = detalleAlimento;
	}
	

	
		
}
