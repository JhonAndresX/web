package com.example.demo.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.models.dao.ICantonDao;
import com.example.demo.models.entity.CantonD;


@Service
public class CantonServiceImpl implements ICantonService{

	@Autowired
	private ICantonDao cantonDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<CantonD> findAll() {
		// TODO Auto-generated method stub
		return (List<CantonD>) cantonDao.findAll();
	}

	@Override
	@Transactional
	public CantonD save(CantonD canton) {
		// TODO Auto-generated method stub
		return cantonDao.save(canton);
	}

	@Override
	@Transactional(readOnly = true)
	public CantonD findById(Long id) {
		// TODO Auto-generated method stub
		return cantonDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		// TODO Auto-generated method stub
		cantonDao.deleteById(id);
	}
	

}
