package com.example.demo;

import java.util.Iterator;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.repo.AlienRepo;

import antlr.collections.List;
import antlr.collections.impl.LList;

@Controller
@RestController
public class AlienController {

	@Autowired
	AlienRepo repo;
	
	
	@RequestMapping("/")
	@ResponseBody
	public String home() {
		return "home.jsp";
	}
	@RequestMapping("/getAlien")
	public ModelAndView getAlien() {
		
		System.out.println("1");
		ModelAndView mv = new ModelAndView("display.jsp");
		System.out.println("2");
//		java.util.List<Alien> alien = (java.util.List<Alien>) repo.findAll();
		Iterable<Alien> alien = repo.findAll();
		System.out.println("3");
		mv.addObject("aliens",alien);
		System.out.println("4");
		mv.setViewName("display");
		System.out.println("5");
		System.out.println(alien);
		System.out.println("6");
		return mv;
	}
	
	@RequestMapping("/getAlienAid")
	public ModelAndView getAlien1(@RequestParam int aid) {
		System.out.println("1");
		ModelAndView mv = new ModelAndView("display.jsp");
		System.out.println("2");
		Iterable<Alien> alien = repo.findAllByAid(aid);
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
	
	@RequestMapping("/getAlienName")
	public ModelAndView getAlienName(@RequestParam String aname) {
		System.out.println("1");
		ModelAndView mv = new ModelAndView("display.jsp");
		System.out.println("2");
		Iterable<Alien> alien = repo.findAllByAname(aname);
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
	
	@RequestMapping("/getAlienTech")
	public ModelAndView getAlienTech(@RequestParam String tech) {
		System.out.println("1");
		ModelAndView mv = new ModelAndView("display.jsp");
		System.out.println("2");
		Iterable<Alien> alien = repo.findAllByTech(tech);
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
	
	@RequestMapping("/getURL")
	public java.util.List<Alien> getURL() {
		System.out.println(repo.findAll());
		return (java.util.List<Alien>) repo.findAll();
	}
	
	@RequestMapping("/getURLAid")
	public java.util.List<Alien> getURLAid(@RequestParam("aid") int aid) {
		
		return (java.util.List<Alien>) repo.findAllByAid(aid);
	}
	
	@RequestMapping("/getURLAname")
	public java.util.List<Alien> getURLAname(@RequestParam("aname") String aname) {
		
		return (java.util.List<Alien>) repo.findAllByAname(aname);
	}
	
	
	@RequestMapping("/getURLTech")
	public java.util.List<Alien> getURLTech(@RequestParam("tech") String tech) {
		
		return (java.util.List<Alien>) repo.findAllByTech(tech);
	}
	
}
