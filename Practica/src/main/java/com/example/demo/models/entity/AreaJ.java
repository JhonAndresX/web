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


//	- The value for annotation attribute Table.uniqueConstraints must be some @jakarta.persistence.UniqueConstraint annotation


@Entity
@Table (name = "tablaArea", uniqueConstraints = {@UniqueConstraint(columnNames = {"idParroquiaFk", "nombreArea"})})
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
