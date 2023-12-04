package com.example.demo.models.services;

import java.util.List;

import com.example.demo.models.entity.CantonD;

public interface ICantonService {

public List<CantonD> findAll();
	
	public CantonD save (CantonD canton);
	
	public CantonD findById(Long id);
	
	public void delete (Long id);
}
