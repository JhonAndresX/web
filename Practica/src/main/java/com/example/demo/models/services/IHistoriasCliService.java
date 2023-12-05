package com.example.demo.models.services;

import java.util.List;

import com.example.demo.models.entity.HistoriasClinicas;

public interface IHistoriasCliService {

public List<HistoriasClinicas> findAll();
	
	public HistoriasClinicas save (HistoriasClinicas historiascli);
	
	public HistoriasClinicas findById(String cedula);
	
	public void delete (String cedula);
}
