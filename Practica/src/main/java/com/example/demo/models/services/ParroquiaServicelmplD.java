package com.example.demo.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.models.dao.IParroquiaDaoD;
import com.example.demo.models.entity.CantonD;
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

	@Override
	@Transactional
	public ParroquiaD save(ParroquiaD parroquia) {
		// TODO Auto-generated method stub
		return parroquiaDao.save(parroquia);
	}

	@Override
	public ParroquiaD findById(Long id) {
		// TODO Auto-generated method stub
		return parroquiaDao.findById(id).orElse(null);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		parroquiaDao.deleteById(id);
	}

}
