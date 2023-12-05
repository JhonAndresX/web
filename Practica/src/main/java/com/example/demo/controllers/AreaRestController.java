package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.example.demo.models.entity.AreaJ;
import com.example.demo.models.services.IAreaServiceJ;

@ResponseStatus
@RequestMapping("/api")
public class AreaRestController {
	
	@Autowired
	private IAreaServiceJ areaService;
	
	@GetMapping("/tablaArea")
	public List<AreaJ> indext(){
		return areaService.findAll();
	}

}
