package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.entity.RegistroParteDiario;
import com.example.demo.models.services.IParroquiaServiceD;
import com.example.demo.models.services.IRegistroParteDiarioService;

@RestController
@RequestMapping("/api")
public class RegistroParteDiarioController {

	@Autowired
	private IRegistroParteDiarioService registroService;
	
	//Listar
	@GetMapping("/registro_parte_diario")
	public List<RegistroParteDiario> index(){
		
		return registroService.findAll();
	}
	
	//Crear
	@PostMapping("/registro_parte_diario")
	@ResponseStatus(HttpStatus.CREATED)
	public RegistroParteDiario create(@RequestBody RegistroParteDiario registro) {
		
		return registroService.save(registro);
	}
	
	//BuscarPorId
	@GetMapping("/registro_parte_diario/{id}")
	public RegistroParteDiario show(@PathVariable Long id) {
		
		return registroService.findById(id);
	}
	
	//Editar
	@PutMapping("/registro_parte_diario")
	@ResponseStatus(HttpStatus.CREATED)
	public RegistroParteDiario update(@RequestBody RegistroParteDiario registro, @PathVariable Long id) {
		
		RegistroParteDiario registros = registroService.findById(id);
		
		registros.setFecha_registro(registro.getFecha_registro());
		registros.setPeso_paciente(registro.getPeso_paciente());
		registros.setTalla_paciente(registro.getTalla_paciente());
		
		return registroService.save(registros);
	}
	
	//Eliminar
	@DeleteMapping("/registro_parte_diario/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		
		registroService.delete(id);
	}
}
