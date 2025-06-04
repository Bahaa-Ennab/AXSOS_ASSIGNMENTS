package com.bahaa.DojoAndNinjas.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bahaa.DojoAndNinjas.models.Dojo;
import com.bahaa.DojoAndNinjas.models.Ninja;
import com.bahaa.DojoAndNinjas.repository.DojoRepository;
import com.bahaa.DojoAndNinjas.repository.NinjaRepository;
@Service
public class NinjaService {
	
	
	@Autowired
	private NinjaRepository Ninjarepo;

	public Ninja createNinja(Ninja ninja) {
		return Ninjarepo.save(ninja); 
	}

}
