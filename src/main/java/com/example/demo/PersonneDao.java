package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonneDao extends JpaRepository<Personne, Integer> {

	
	/*public Personne findByNomAndPrenom(String nom);
	
	@Query("select p from Personne p where p.nom=:n")
	public Personne chercherParNom(@Param("n") String nom);*/
	
	
	
}
