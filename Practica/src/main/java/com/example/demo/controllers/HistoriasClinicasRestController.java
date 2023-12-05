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

import com.example.demo.models.entity.HistoriasClinicas;
import com.example.demo.models.services.IHistoriasCliService;

@RestController
@RequestMapping("/api")
public class HistoriasClinicasRestController {

	@Autowired
	private IHistoriasCliService historiasservice;

	@GetMapping("/historiasclinicas")
	public List<HistoriasClinicas> indext() {
		return historiasservice.findAll();
	}

	@GetMapping("/historiasclinicas/{cedula}")
	public HistoriasClinicas show(@PathVariable String cedula) {
		return historiasservice.findById(cedula);
	}

	@PostMapping("/historiasclinicas")
	@ResponseStatus(HttpStatus.CREATED)
	public HistoriasClinicas create(@RequestBody HistoriasClinicas historias) {

		return historiasservice.save(historias);
	}

	@PutMapping("/historiasclinicas/{cedula}")
	public HistoriasClinicas update(@RequestBody HistoriasClinicas historias, @PathVariable String cedula) {

		HistoriasClinicas historiasactual = historiasservice.findById(cedula);

		historiasactual.setNombre_paciente(historias.getNombre_paciente());
		historiasactual.setApellido_paciente(historias.getApellido_paciente());
		historiasactual.setFecha_nacimiento(historias.getFecha_nacimiento());
		
		return historiasservice.save(historiasactual);

	}

	@DeleteMapping("/historiasclinicas/{cedula}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable String cedula) {

		historiasservice.delete(cedula);
	}
}
