package com.bahaa.DojoAndNinjas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bahaa.DojoAndNinjas.models.Dojo;
import com.bahaa.DojoAndNinjas.repository.DojoRepository;

@Service
public class DojoService {
	
	@Autowired
	private DojoRepository Dojorepo;
	
	public Dojo createDojo(Dojo dojo) {
		return Dojorepo.save(dojo); 
	}
	
	public Dojo findById(Long id) {
		return Dojorepo.findById(id).orElse(null);
	}
	
	public List<Dojo> findAll() {
		return Dojorepo.findAll();
	}

}
