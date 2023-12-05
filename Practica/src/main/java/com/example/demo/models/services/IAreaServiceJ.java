package com.example.demo.models.services;

import java.util.List;

import com.example.demo.models.entity.AreaJ;

public interface IAreaServiceJ {
	
	//FindALL
	public List<AreaJ> findAll();
	
	//SaveALL
	public AreaJ save(AreaJ area);
	
	//FindByID
	public AreaJ findById (Long idAreaPk);
		
	//delete
	public void delete (Long idAreaPk);
}
