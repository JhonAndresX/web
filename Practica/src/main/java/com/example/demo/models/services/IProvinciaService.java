package com.example.demo.models.services;

import java.util.List;

import com.example.demo.models.entity.ProvinciaJ;

public interface IProvinciaService {
	
	public List<ProvinciaJ> findAll();
	
	public ProvinciaJ save (ProvinciaJ provincias);
	
	public ProvinciaJ findById(Long id_provincia);
	
	public void delete (Long id_provincia);

}
