package com.example.demo.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.entity.CantonD;
import com.example.demo.models.services.ICantonServiceD;

@RestController
@RequestMapping("/api")
public class CantonRestControllerD {

	private ICantonServiceD cantonService;
	
	//ListarParroquia
	@GetMapping("/canton")
	public List<CantonD> index(){
		
		return cantonService.findAll();
	}
	
	//CrearParroquia
	@PostMapping("/canton")
	@ResponseStatus(HttpStatus.CREATED)
	public CantonD create(@RequestBody CantonD canton) {
		
		return cantonService.save(canton);
	}
}
