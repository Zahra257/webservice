package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;




@Service
public class PersonneService implements IpersersonneService {
	
	@Autowired
	PersonneDao dao;
	
	
	public Personne ajouter(Personne p)
	{
		return dao.save(p);
		
	}
	
	public Personne selecOne(int id)
	{
		return dao.findById(id).get();
	}
	
	public List<Personne> selectAll()
	{
		return dao.findAll();
	}
	
	public void supprimer(int id)
	{
		dao.deleteById(id);
	}
	
	public void modifier(Personne p)
	{
		dao.save(p);
	}

}
