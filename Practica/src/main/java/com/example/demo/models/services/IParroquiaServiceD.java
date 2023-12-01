package com.example.demo.models.services;

import java.util.List;

import com.example.demo.models.entity.ParroquiaD;

public interface IParroquiaServiceD {

	public List<ParroquiaD> findAll();
	
	public ParroquiaD save(ParroquiaD parroquia);
}
