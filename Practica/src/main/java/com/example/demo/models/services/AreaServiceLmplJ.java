package com.example.demo.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.models.dao.IAreaDao;
import com.example.demo.models.entity.AreaJ;

@Service
public class AreaServiceLmplJ implements IAreaServiceJ{
	
	@Autowired
	private IAreaDao areaDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<AreaJ> findAll() {
		// TODO Auto-generated method stub
		return (List<AreaJ>) areaDao.findAll();
	}

	@Override
	@Transactional
	public AreaJ save(AreaJ area) {
		// TODO Auto-generated method stub
		return areaDao.save(area);
	}

	@Override
	@Transactional(readOnly = true)
	public AreaJ findById(Long idAreaPk) {
		// TODO Auto-generated method stub
		return areaDao.findById(idAreaPk).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long idAreaPk) {
		// TODO Auto-generated method stub
		areaDao.deleteById(idAreaPk);
		
	}
	                            
}
