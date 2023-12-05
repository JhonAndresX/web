package com.example.demo.models.services;

import java.util.List;

import com.example.demo.models.entity.RegistroParteDiario;

public interface IRegistroParteDiarioService {

	public List<RegistroParteDiario> findAll();
	
	public RegistroParteDiario save(RegistroParteDiario registro);
	
	public RegistroParteDiario findById(Long id);
	
	public void delete(Long id);
}
