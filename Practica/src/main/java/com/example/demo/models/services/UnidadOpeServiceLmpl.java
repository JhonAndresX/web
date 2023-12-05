package com.example.demo.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.models.dao.IUnidadOpeDao;
import com.example.demo.models.entity.UnidadOperativa;

	@Service
	public class UnidadOpeServiceLmpl implements IUnidadOpeService{

		@Autowired
		private IUnidadOpeDao unidadopeDao;
		
		@Override
		@Transactional(readOnly = true)
		public List<UnidadOperativa> findAll() {
			// TODO Auto-generated method stub
			return (List<UnidadOperativa>) unidadopeDao.findAll();
		}

		@Override
		@Transactional
		public UnidadOperativa save(UnidadOperativa unidad) {
			// TODO Auto-generated method stub
			return unidadopeDao.save(unidad);
		}

		@Override
		@Transactional(readOnly = true)
		public UnidadOperativa findById(Long id) {
			// TODO Auto-generated method stub
			return unidadopeDao.findById(id).orElse(null);
		}

		@Override
		@Transactional
		public void delete(Long id) {
			// TODO Auto-generated method stub
			unidadopeDao.deleteById(id);
		}
		

	}

