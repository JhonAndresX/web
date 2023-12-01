package com.example.demo.models.services;

import java.util.List;

import com.example.demo.models.entity.CantonD;

public interface ICantonServiceD {
	
	public List<CantonD> findAll();
	
	public CantonD save (CantonD canton);

}
