package com.isitcom.formationSpringboot.demo1.services;

import java.util.List;

import com.isitcom.formationSpringboot.demo1.entities.*;

public interface IServiceCategorie {
	public void addCategorie(Categorie c);
	public List<Categorie> getAllCategories();
	public Categorie getCategorie(Long id);
	public void deleteCategorie(Long id);
	List<Categorie> getCategorieByMc(String mc);
	void updateCategorie(Categorie p);
	
}
