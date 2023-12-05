package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.example.demo.models.entity.AreaJ;
import com.example.demo.models.services.IAreaServiceJ;

@ResponseStatus
@RequestMapping("/api")
public class AreaRestController {
	
	@Autowired
	private IAreaServiceJ areaService;
	
	//Listar
	@GetMapping("/tablaArea")
	public List<AreaJ> indext(){
		return areaService.findAll();
	}
	
	//Buscar x id
	@GetMapping("/tablaArea{idAreaPk}")
	public AreaJ show(@PathVariable Long idAreaPk) {
		return areaService.findById(idAreaPk);
	}
	
	//Guardar
	@PostMapping("/tablaArea")
	@ResponseStatus(HttpStatus.CREATED)
	public AreaJ create(@RequestBody AreaJ area) {
		return areaService.save(area);
	}
	
	//Editar Modificar
	@PutMapping("/tablaArea")
	@ResponseStatus(HttpStatus.CREATED)
	public AreaJ update(@RequestBody AreaJ area, @PathVariable Long idAreaPk) {
		
		AreaJ areaActual = areaService.findById(idAreaPk);
		areaActual.setNombreArea(area.getNombreArea());
		
		return areaService.save(areaActual);
		
	}
	
	//Eliminar
	@DeleteMapping("/tablaArea/{idAreaPk}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long idAreaPk) {
		areaService.delete(idAreaPk);
	}
	
		

}
