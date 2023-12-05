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

import com.example.demo.models.entity.CantonD;
import com.example.demo.models.services.ICantonService;

@RestController
@RequestMapping("/api")
public class CantonRestController {

	@Autowired
	private ICantonService cantonService;

	@GetMapping("/canton")
	public List<CantonD> indext() {
		return cantonService.findAll();
	}

	@GetMapping("/canton/{id}")
	public CantonD show(@PathVariable Long id) {
		return cantonService.findById(id);
	}

	@PostMapping("/canton")
	@ResponseStatus(HttpStatus.CREATED)
	public CantonD create(@RequestBody CantonD canton) {

		return cantonService.save(canton);
	}

	@PutMapping("/canton/{id}")
	public CantonD update(@RequestBody CantonD canton, @PathVariable Long id) {

		CantonD cantonactual = cantonService.findById(id);

		cantonactual.setNombre_canton(canton.getNombre_canton());

		return cantonService.save(cantonactual);

	}

	@DeleteMapping("/canton/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {

		cantonService.delete(id);
	}
}
