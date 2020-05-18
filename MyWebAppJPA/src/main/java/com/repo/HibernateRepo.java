
  package com.repo;
  
  import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.Alien;
  
  public interface HibernateRepo extends JpaRepository<Alien, Long>{

	List<Alien> findAllByTech(String tech);

//	List<Alien> findAllByName(String aname);

	List<Alien> findAllByAname(String aname);

	Iterable<Alien> findAllByAid(int aid);
  
  }
 