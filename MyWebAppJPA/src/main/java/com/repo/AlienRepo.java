package com.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.Alien;

public interface AlienRepo extends CrudRepository<Alien, Integer>{

	Iterable<Alien> findAllByAid(int aid);
	Iterable<Alien> findAllByAname(String aname);
	Iterable<Alien> findAllByTech(String tech);
	

}
