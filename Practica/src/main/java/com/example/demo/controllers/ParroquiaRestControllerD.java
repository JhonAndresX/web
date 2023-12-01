package com.example.demo.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.entity.ParroquiaD;
import com.example.demo.models.services.IParroquiaServiceD;

@RestController
@RequestMapping("/api")
public class ParroquiaRestControllerD {

	private IParroquiaServiceD parroquiaService;
	
	//Listar Parroquias
	@GetMapping("/parroquia")
	public List<ParroquiaD> index(){
		
		return parroquiaService.findAll();
	}
	
	//Crear Parroquias
}
