package com.example.demo.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.models.dao.IParroquiaDaoD;
import com.example.demo.models.entity.ParroquiaD;

@Service
public class ParroquiaServicelmplD implements IParroquiaServiceD{

	@Autowired
	private IParroquiaDaoD parroquiaDao;
	
	@Override
	@Transactional(readOnly=true)
	public List<ParroquiaD> findAll() {
		// TODO Auto-generated method stub
		return (List<ParroquiaD>) parroquiaDao.findAll();
	}

}
