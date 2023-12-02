package com.example.demo.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.models.dao.IProvinciaDao;
import com.example.demo.models.entity.ProvinciaJ;



@Service
public class ProvinciaServiceLmpl implements IProvinciaService{
	
	@Autowired
	private IProvinciaDao provinciaDao;	
	
	@Override
	@Transactional (readOnly = true)
	public List<ProvinciaJ> findAll() {
		// TODO Auto-generated method stub
		return (List<ProvinciaJ>) provinciaDao.findAll();
	}
	
	

}
