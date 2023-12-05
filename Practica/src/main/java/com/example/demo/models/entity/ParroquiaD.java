package com.example.demo.models.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(name="parroquia", uniqueConstraints = {@UniqueConstraint(columnNames = {"id_CantonFk", "nombreParroquia"})})
public class ParroquiaD implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)	
	private Long id;
	private String nombreParroquia;
	private Long id_CantonFk;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombreParroquia() {
		return nombreParroquia;
	}
	public void setNombreParroquia(String nombreParroquia) {
		this.nombreParroquia = nombreParroquia;
	}
	public Long getId_CantonFk() {
		return id_CantonFk;
	}
	public void setId_CantonFk(Long id_CantonFk) {
		this.id_CantonFk = id_CantonFk;
	}
	
	
}
