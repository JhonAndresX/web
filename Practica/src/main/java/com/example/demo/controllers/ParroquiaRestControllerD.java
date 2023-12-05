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

import com.example.demo.models.entity.ParroquiaD;
import com.example.demo.models.services.IParroquiaServiceD;

@RestController
@RequestMapping("/api")
public class ParroquiaRestControllerD {

	@Autowired
	private IParroquiaServiceD parroquiaService;
	
	//ListarParroquias
	@GetMapping("/parroquia")
	public List<ParroquiaD> index(){
		
		return parroquiaService.findAll();
	}
	
	//CrearParroquias
	@PostMapping("/parroquia")
	@ResponseStatus(HttpStatus.CREATED)
	public ParroquiaD create(@RequestBody ParroquiaD parroquia) {
		
		return parroquiaService.save(parroquia);
	}
	
	//BuscarPorIdParroquia
	@GetMapping("/parroquia/{id}")
	public ParroquiaD show(@PathVariable Long id){
		
		return parroquiaService.findById(id);
	}
	
	//EdiarParroquia
	@PutMapping("/parroquia")
	@ResponseStatus(HttpStatus.CREATED)
	public ParroquiaD update(@RequestBody ParroquiaD parroquia, @PathVariable Long id) {
		
		ParroquiaD parroquiaActual = parroquiaService.findById(id);
		parroquiaActual.setId_CantonFk(parroquia.getId_CantonFk());
		parroquiaActual.setNombreParroquia(parroquia.getNombreParroquia());
		
		return parroquiaService.save(parroquiaActual);
	}
	
	//EliminarParroquia
	@DeleteMapping("/cliente/{id]")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		
		parroquiaService.delete(id);
	}
	
}
