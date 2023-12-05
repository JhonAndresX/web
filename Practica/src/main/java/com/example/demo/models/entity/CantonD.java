package com.example.demo.models.entity;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(name="canton", uniqueConstraints = {@UniqueConstraint(columnNames = {"id_provinciaFK", "nombre_canton"})})
public class CantonD implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nombre_canton;
	private Long id_provinciaFK;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "id_CantonFk")
	private List<ParroquiaD> listaParroquia;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre_canton() {
		return nombre_canton;
	}
	public void setNombre_canton(String nombre_canton) {
		this.nombre_canton = nombre_canton;
	}
	public Long getId_provinciaFK() {
		return id_provinciaFK;
	}
	public void setId_provinciaFK(Long id_provinciaFK) {
		this.id_provinciaFK = id_provinciaFK;
	}
	


}
