package com.jessicagreene.dojosandninjas.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jessicagreene.dojosandninjas.models.Ninja;
@Repository
public interface NinjaRepository extends CrudRepository<Ninja, Long> {
	//Read all
	public List<Ninja> findAll();
}
