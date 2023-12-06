package com.example.demo.models.entity;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
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
@Table(name="registro_parte_diario", uniqueConstraints = {@UniqueConstraint(columnNames = {"codigo", "cedula", "numero_visita"})})
public class RegistroParteDiario implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(length =10)
	private String cedula;
	
	private Date fecha_registro;
	private Long codigo;
	private int numero_visita;
	private double peso_paciente;
	private double talla_paciente;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public Date getFecha_registro() {
		return fecha_registro;
	}
	public void setFecha_registro(Date fecha_registro) {
		this.fecha_registro = fecha_registro;
	}
	public Long getCodigo() {
		return codigo;
	}
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	public int getNumero_visita() {
		return numero_visita;
	}
	public void setNumero_visita(int numero_visita) {
		this.numero_visita = numero_visita;
	}
	public double getPeso_paciente() {
		return peso_paciente;
	}
	public void setPeso_paciente(double peso_paciente) {
		this.peso_paciente = peso_paciente;
	}
	public double getTalla_paciente() {
		return talla_paciente;
	}
	public void setTalla_paciente(double talla_paciente) {
		this.talla_paciente = talla_paciente;
	}
	
	

}
