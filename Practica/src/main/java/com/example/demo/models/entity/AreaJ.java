package com.example.demo.models.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "tablaArea")
public class AreaJ implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idAreaPk;
	private Long idParroquiaFk;
	private String nombreArea;
	
	//////// Getter Setter\\\\\\\\\\\
	public Long getIdAreaPk() {
		return idAreaPk;
	}

	public void setIdAreaPk(Long idAreaPk) {
		this.idAreaPk = idAreaPk;
	}

	public Long getIdParroquiaFk() {
		return idParroquiaFk;
	}

	public void setIdParroquiaFk(Long idParroquiaFk) {
		this.idParroquiaFk = idParroquiaFk;
	}

	public String getNombreArea() {
		return nombreArea;
	}

	public void setNombreArea(String nombreArea) {
		this.nombreArea = nombreArea;
	}

}
