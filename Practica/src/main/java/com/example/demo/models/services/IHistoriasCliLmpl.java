package com.example.demo.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.models.dao.IHistoriasCliDao;
import com.example.demo.models.entity.HistoriasClinicas;

@Service
public class IHistoriasCliLmpl implements IHistoriasCliService{

	@Autowired
	private IHistoriasCliDao historiasDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<HistoriasClinicas> findAll() {
		// TODO Auto-generated method stub
		return (List<HistoriasClinicas>) historiasDao.findAll();
	}

	@Override
	@Transactional
	public HistoriasClinicas save(HistoriasClinicas historias) {
		// TODO Auto-generated method stub
		return historiasDao.save(historias);
	}

	@Override
	@Transactional(readOnly = true)
	public HistoriasClinicas findById(String cedula) {
		// TODO Auto-generated method stub
		return historiasDao.findById(cedula).orElse(null);
	}

	@Override
	@Transactional
	public void delete(String cedula) {
		// TODO Auto-generated method stub
		historiasDao.deleteById(cedula);
	}
	




}
