	package com.isitcom.formationSpringboot.demo1.services;
	
	import java.util.List;

	import com.isitcom.formationSpringboot.demo1.entities.*;

	
	public interface IServiceProduit {
		public void addProduit(Produit p);
		public List<Produit> getAllProducts();
		public void deleteProduct(Long id);
		public Produit getProductById(Long id);
		public List<Produit> getProductByMc(String mc);
		public void updateProduct(Produit p);
		
		
	
	}
