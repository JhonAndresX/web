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
@Table(name="canton", uniqueConstraints = {@UniqueConstraint(columnNames = {"id_provincia", "nomnbrecanton"})})
public class CantonD implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nomnbreCanton;
	private Long id_provincia;
	
	@OneToMany(fetch=FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name="id_CantonFk")
	private List<ParroquiaD> parroquias;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomnbreCanton() {
		return nomnbreCanton;
	}

	public void setNomnbreCanton(String nomnbreCanton) {
		this.nomnbreCanton = nomnbreCanton;
	}

	public Long getId_provincia() {
		return id_provincia;
	}

	public void setId_provincia(Long id_provincia) {
		this.id_provincia = id_provincia;
	}

	public List<ParroquiaD> getParroquias() {
		return parroquias;
	}

	public void setParroquias(List<ParroquiaD> parroquias) {
		this.parroquias = parroquias;
	}
	
	
	
}
