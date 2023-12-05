package com.example.demo.models.entity;

import java.io.Serializable;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "historiasclinicas")
public class HistoriasClinicas implements Serializable {

		private static final long serialVersionUID = 1L;

		@Id
		@Column(length =10)
		private String cedula;
		
		private String nombre_paciente;
		private String apellido_paciente;
		
		@Column(name = "fecha_nacimiento")
		@Temporal(TemporalType.DATE)
		private Date fecha_nacimiento;
		
		@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
		@JoinColumn(name = "cedula")
		private List<RegistroParteDiario> registroDiario;
		  
		public String getCedula() {
			return cedula;
		}
		public void setCedula(String cedula) {
			this.cedula = cedula;
		}
		public String getNombre_paciente() {
			return nombre_paciente;
		}
		public void setNombre_paciente(String nombre_paciente) {
			this.nombre_paciente = nombre_paciente;
		}
		public String getApellido_paciente() {
			return apellido_paciente;
		}
		public void setApellido_paciente(String apellido_paciente) {
			this.apellido_paciente = apellido_paciente;
		}
		public Date getFecha_nacimiento() {
			return fecha_nacimiento;
		}
		public void setFecha_nacimiento(Date fecha_nacimiento) {
			this.fecha_nacimiento = fecha_nacimiento;
		}
		
		
		
}
