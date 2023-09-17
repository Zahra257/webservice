package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
//@CrossOrigin("http://localhost:3000")
public class PersonneController {
	
	@Autowired
	IpersersonneService service;
	
	@RequestMapping("/personnes")
	public List<Personne> selectAll()
	{
		List<Personne> liste= service.selectAll();
		
		
		return liste;
		
	}
	@GetMapping("/personnes/{id}")
	public Personne selectById(@PathVariable("id") int id) {
		
		Personne p = service.selecOne(id);
		return p ;
	}

	@PostMapping("/personnes")
	public Personne ajouter(@RequestBody Personne p)
	{
		Personne p2 = service.ajouter(p);
		 return p2;
	}
	
	@DeleteMapping("/personnes/{id}")
	public void supprimer(@PathVariable("id") int id)
	{
		service.supprimer(id);
	}
	
	
	@PutMapping("/personnes/{id}")
	public void modifier(@PathVariable("id") int id , @RequestBody Personne p )
	{
		Personne p2= service.selecOne(id);
		if(p2!=null)
		{  
			p.setId(id);
			service.modifier(p);
		}
	}
}
