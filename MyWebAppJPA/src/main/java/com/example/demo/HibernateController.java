
package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.repo.HibernateRepo;

@RestController
public class HibernateController {

	@Autowired
	HibernateRepo hRepo;

	@GetMapping("/getHibURL")
	public List<Alien> getURL() {
		
		System.out.println(hRepo.findAll());
		return hRepo.findAll();

	}
	
	@GetMapping("/getHibURLTech")
	public List<Alien> getURLTech(@RequestParam("tech") String tech) {
		System.out.println(hRepo.findAllByTech(tech));
		return hRepo.findAllByTech(tech);

	}

	@GetMapping("/getHibURLAname")
	public List<Alien> getURLAname(@RequestParam("aname") String aname) {
		System.out.println(hRepo.findAllByAname(aname));
		return hRepo.findAllByAname(aname);

	}
	
	
	@RequestMapping("/getAlienHib")
	public ModelAndView getAlien() {
		System.out.println("1");
		ModelAndView mv = new ModelAndView("display.jsp");
		System.out.println("2");
//		java.util.List<Alien> alien = (java.util.List<Alien>) repo.findAll();
		List<Alien> alien = hRepo.findAll();
		System.out.println("3");
		mv.addObject("aliens",alien);
		System.out.println("4");
		mv.setViewName("display");
		System.out.println("5");
		System.out.println(alien);
		System.out.println("6");
		return mv;
	}
	
	
	@RequestMapping("/getAlienHibAid")
	public ModelAndView getAlien1(@RequestParam int aid) {
		System.out.println("1");
		ModelAndView mv = new ModelAndView("display.jsp");
		System.out.println("2");
		Iterable<Alien> alien = hRepo.findAllByAid(aid);
		System.out.println(alien);
		System.out.println("3");
		mv.addObject("aliens",alien);
		System.out.println("4");
		mv.setViewName("display");
		System.out.println("5");
		System.out.println(alien);
		System.out.println("6");
		return mv;
	}
	
	@RequestMapping("/getAlienHibTech")
	public ModelAndView getAlienHibTech(@RequestParam String tech) {
		System.out.println("1");
		ModelAndView mv = new ModelAndView("display.jsp");
		System.out.println("2");
		Iterable<Alien> alien = hRepo.findAllByTech(tech);
		System.out.println(alien);
		System.out.println("3");
		mv.addObject("aliens",alien);
		System.out.println("4");
		mv.setViewName("display");
		System.out.println("5");
		System.out.println(alien);
		System.out.println("6");
		return mv;
	}
	

}
