package com.example.demo.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.models.dao.IRegistroParteDarioDao;
import com.example.demo.models.entity.RegistroParteDiario;

@Service
public class RegistroParteDiariolmpl implements IRegistroParteDiarioService{

	@Autowired
	private IRegistroParteDarioDao registros;
	
	@Override
	@Transactional(readOnly = true)
	public List<RegistroParteDiario> findAll() {
		// TODO Auto-generated method stub
		return (List<RegistroParteDiario>) registros.findAll();
	}

	@Override
	public RegistroParteDiario save(RegistroParteDiario registro) {
		// TODO Auto-generated method stub
		return registros.save(registro);
	}

	@Override
	public RegistroParteDiario findById(Long id) {
		// TODO Auto-generated method stub
		return registros.findById(id).orElse(null);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		registros.deleteById(id);
	}

}
