package com.example.demo.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.models.dao.IParroquiaDaoD;
import com.example.demo.models.entity.ParroquiaD;

public class ICantonServicelmplD implements IParroquiaServiceD{

	@Autowired
	IParroquiaDaoD parroquiaD;
	
	@Override
	@Transactional(readOnly = true)
	public List<ParroquiaD> findAll() {
		// TODO Auto-generated method stub
		return (List<ParroquiaD>) parroquiaD.findAll();
	}

	@Override
	public ParroquiaD save(ParroquiaD parroquia) {
		// TODO Auto-generated method stub
		return parroquiaD.save(parroquia);
	}

}
