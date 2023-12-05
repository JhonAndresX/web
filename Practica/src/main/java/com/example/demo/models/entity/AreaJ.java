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
@Table (name = "tablaarea", uniqueConstraints = {@UniqueConstraint(columnNames = {"idParroquiaFk", "nombrearea"})})
public class AreaJ implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idAreaPk;
	private Long idParroquiaFk;
	private String nombrearea;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "id_areaFK")
	private List<UnidadOperativa> unidadOperativa;
	
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

	public String getNombrearea() {
		return nombrearea;
	}

	public void setNombrearea(String nombrearea) {
		this.nombrearea = nombrearea;
	}

}
