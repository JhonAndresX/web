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

import com.example.demo.models.entity.UnidadOperativa;
import com.example.demo.models.services.IUnidadOpeService;

	@RestController
	@RequestMapping("/api")
	public class UnidadOperativaRestController {


			@Autowired
			private IUnidadOpeService UnidadService;
			
			@GetMapping("/unidad_operativa")
			public List<UnidadOperativa> indext(){
				return UnidadService.findAll();
			}
			
			@GetMapping("/unidad_operativa/{id}")
			public UnidadOperativa show(@PathVariable Long id) {
				return UnidadService.findById(id);
			}
			
			@PostMapping("/unidad_operativa")
			@ResponseStatus(HttpStatus.CREATED)
			public UnidadOperativa create(@RequestBody UnidadOperativa unidad) {
				
				return UnidadService.save(unidad);
			}
			
			@PutMapping("/unidad_operativa/{id}")
			public UnidadOperativa update(@RequestBody UnidadOperativa unidad, @PathVariable Long id) {
				
				UnidadOperativa unidadactual = UnidadService.findById(id);
				
				unidadactual.setNombre_unidad_operativa(unidad.getNombre_unidad_operativa());
				
				return UnidadService.save(unidadactual);
				
			}	
				
				@DeleteMapping("/unidad_operativa/{id}")
				@ResponseStatus(HttpStatus.NO_CONTENT)
				public void delete(@PathVariable Long id) {
					
					UnidadService.delete(id);
				}
	}




