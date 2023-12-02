package com.isitcom.formationSpringboot.demo1.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.isitcom.formationSpringboot.demo1.entities.Categorie;

public interface CategorieRepo extends JpaRepository<Categorie, Long>{
	
     public List <Categorie> findByNomContains(String mc);
	@Query("select p from Categorie p where p.nom like %:x%")
	public List<Categorie> rechercherMC(@Param("x")String mc);

}
