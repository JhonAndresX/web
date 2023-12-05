package com.example.demo.models.services;

import java.util.List;

import com.example.demo.models.entity.UnidadOperativa;

public interface IUnidadOpeService {

public List<UnidadOperativa> findAll();
	
	public UnidadOperativa save (UnidadOperativa unidadope);
	
	public UnidadOperativa findById(Long id);
	
	public void delete (Long id);
}

