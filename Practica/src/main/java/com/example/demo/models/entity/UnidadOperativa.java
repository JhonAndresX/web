package com.example.demo.models.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(name="unidad_operativa", uniqueConstraints = {@UniqueConstraint(columnNames = {"id_areaFK"})})

public class UnidadOperativa implements Serializable{
	
		private static final long serialVersionUID = 1L;

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		private String nombre_unidad_operativa;
		private Long id_areaFK;
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getNombre_unidad_operativa() {
			return nombre_unidad_operativa;
		}
		public void setNombre_unidad_operativa(String nombre_unidad_operativa) {
			this.nombre_unidad_operativa = nombre_unidad_operativa;
		}
		public Long getId_areaFK() {
			return id_areaFK;
		}
		public void setId_areaFK(Long id_areaFK) {
			this.id_areaFK = id_areaFK;
		}
		
		

		


	}


