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

import com.example.demo.models.entity.ProvinciaJ;
import com.example.demo.models.services.IProvinciaService;

@RestController
@RequestMapping("/api")
public class ProvinciaRestController {

	@Autowired
	private IProvinciaService provinciaService;
	
	@GetMapping("/provincias")
	public List<ProvinciaJ> indext(){
		return provinciaService.findAll();
	}
	
	@GetMapping("/provicias/{id_provincia}")
	public ProvinciaJ show(@PathVariable Long id_provincia) {
		
		return provinciaService.findById(id_provincia);
	}
	
	@PostMapping("/provincias")
	@ResponseStatus(HttpStatus.CREATED)
	public ProvinciaJ create(@RequestBody ProvinciaJ provincias) {
		
		return provinciaService.save(provincias);
	}
	
	@PutMapping("/provincias/{id_provincia}")
	public ProvinciaJ update(@RequestBody ProvinciaJ provincias, @PathVariable Long id_provincia) {
		
		ProvinciaJ provinciaActual = provinciaService.findById(id_provincia);
		
		provinciaActual.setNombre_provincia(provincias.getNombre_provincia());
		
		return provinciaService.save(provinciaActual);
		
	}	
		
		@DeleteMapping("/provincias/{id_provincia}")
		@ResponseStatus(HttpStatus.NO_CONTENT)
		public void delete(@PathVariable Long id_provincia) {
			
			provinciaService.delete(id_provincia);
		}
	}


