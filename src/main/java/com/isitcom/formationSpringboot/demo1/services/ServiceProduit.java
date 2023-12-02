package com.isitcom.formationSpringboot.demo1.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isitcom.formationSpringboot.demo1.DAO.ProduitRepo;
import com.isitcom.formationSpringboot.demo1.entities.Produit;
@Service
public class ServiceProduit implements IServiceProduit{
	
	@Autowired
	private ProduitRepo pr;
	

	@Override
	public void addProduit(Produit p) {
		// TODO Auto-generated method stub
		pr.save(p);
		
	}

	@Override
	public List<Produit> getAllProducts() {
		// TODO Auto-generated method stub
		return pr.findAll();
	}

	@Override
	public void deleteProduct(Long id) {
		// TODO Auto-generated method stub
		pr.deleteById(id);
		
	}

	@Override
	public Produit getProductById(Long id) {
		// TODO Auto-generated method stub
		
		return pr.findById(id).get();
	}

	@Override
	public List<Produit> getProductByMc(String mc) {
		// TODO Auto-generated method stub
		return pr.findByNomContains(mc);
	}

	@Override
	public void updateProduct(Produit p) {
		// TODO Auto-generated method stub
		pr.save(p);
		
	}

}
