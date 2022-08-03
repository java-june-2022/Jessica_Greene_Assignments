package com.jessicagreene.dojosandninjas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jessicagreene.dojosandninjas.models.Ninja;
import com.jessicagreene.dojosandninjas.repositories.NinjaRepository;

@Service
public class NinjaService {
	@Autowired
	NinjaRepository ninjaRepository;

	//Get all ninjas
	public List<Ninja> findAllNinjas() {
		return ninjaRepository.findAll();
	}
	
	//Create
	public Ninja createNinja(Ninja ninja) {
		return ninjaRepository.save(ninja);
	}
	
	//Read
	public Ninja findNinjaById(Long id) {
		return ninjaRepository.findById(id).orElse(null);
	}
	
	//Update
	public Ninja updateNinja(Ninja ninja) {
		return ninjaRepository.save(ninja);
	}
	
	//Delete
	public void deleteNinja(Long id) {
		ninjaRepository.deleteById(id);
	}
}
