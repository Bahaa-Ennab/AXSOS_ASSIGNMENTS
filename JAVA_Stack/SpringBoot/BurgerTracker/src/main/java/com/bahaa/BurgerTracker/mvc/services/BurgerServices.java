package com.bahaa.BurgerTracker.mvc.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.bahaa.BurgerTracker.mvc.models.Burger;
import com.bahaa.BurgerTracker.mvc.repositories.BurgerRepository;

@Service
public class BurgerServices {
	private final BurgerRepository burgerRepository;
	
	public BurgerServices(BurgerRepository burgerRepository) {
		this.burgerRepository = burgerRepository;
	}
	
	public List<Burger> allBurgers(){
		return burgerRepository.findAll();
		}
	public Burger createBurger(Burger burger) {
		return burgerRepository.save(burger);
	}
	public Burger findById(Long id){
        return burgerRepository.findById(id).orElse(null);
	}
	public Burger updateBurger(Burger burger) {
		return burgerRepository.save(burger);
	}
	

}
