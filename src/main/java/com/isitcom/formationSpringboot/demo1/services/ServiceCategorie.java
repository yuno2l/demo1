package com.isitcom.formationSpringboot.demo1.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isitcom.formationSpringboot.demo1.DAO.CategorieRepo;
import com.isitcom.formationSpringboot.demo1.entities.Categorie;

@Service
public class ServiceCategorie implements IServiceCategorie {
	
	@Autowired
	private CategorieRepo cr;
	

	@Override
	public void addCategorie(Categorie c) {
		// TODO Auto-generated method stub
		cr.save(c);
		
	}

	@Override
	public List<Categorie> getAllCategories() {
		// TODO Auto-generated method stub
		return cr.findAll();
	}

	@Override
	public Categorie getCategorie(Long id) {
		// TODO Auto-generated method stub
		return cr.findById(id).get();
	}

	@Override
	public void deleteCategorie(Long id) {
		// TODO Auto-generated method stub
		cr.deleteById(id);
		
	}

	@Override
	public List<Categorie> getCategorieByMc(String mc) {
		// TODO Auto-generated method stub
		return cr.findByNomContains(mc);
	}

	@Override
	public void updateCategorie(Categorie p) {
		// TODO Auto-generated method stub
		cr.save(p);
	}

}
