package com.jessicagreene.dojosandninjas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jessicagreene.dojosandninjas.models.Dojo;
import com.jessicagreene.dojosandninjas.repositories.DojoRepository;

@Service
public class DojoService {
	@Autowired
	private DojoRepository dojoRepository;
	
	//Read all
	public List<Dojo> findAllDojos() {
		return dojoRepository.findAll();
	}
	
	//Create
	public Dojo createDojo(Dojo dojo) {
		return dojoRepository.save(dojo);
	}
	
	//Read one
	public Dojo findDojoById(Long id) {
		return dojoRepository.findById(id).orElse(null);
	}
	
	//Update
	public Dojo updateDojo(Dojo dojo) {
		return dojoRepository.save(dojo);
	}
	
	//Delete
	public void deleteDojo(Long id) {
		dojoRepository.deleteById(id);
	}
}
