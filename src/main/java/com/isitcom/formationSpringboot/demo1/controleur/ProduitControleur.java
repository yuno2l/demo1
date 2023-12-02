package com.isitcom.formationSpringboot.demo1.controleur;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.isitcom.formationSpringboot.demo1.entities.Produit;
import com.isitcom.formationSpringboot.demo1.entities.Categorie;
import com.isitcom.formationSpringboot.demo1.services.IServiceCategorie;
import com.isitcom.formationSpringboot.demo1.services.IServiceProduit;
import java.util.*;

@Controller
public class ProduitControleur {
	@Autowired
	private IServiceProduit sp;
	@Autowired
	private IServiceCategorie sc;
	@GetMapping("/produits")
	public String getAllProducts(Model m)
	{
		List<Produit> liste = sp.getAllProducts();
		m.addAttribute("products", liste);
		
		return "index2";
		
	}
	
	@GetMapping("/search")
	public String rechercher(@RequestParam String mc, Model m) {
		m.addAttribute("products", sp.getProductByMc(mc));
		return "index2";
	}
	
	@GetMapping("/delete/{id}")
	public String supprimerProduit(@PathVariable("id") Long idProduit) {
		sp.deleteProduct(idProduit);
		return "redirect:/produits";
		
	}
	@GetMapping("/categorie")
	public String getAllCategories(Model m) {
		List<Categorie> liste2 = sc.getAllCategories();
		m.addAttribute("categorie",liste2);
		return "categorie";
	}
	
	@GetMapping("/searchCat")
	public String rechercherCat(@RequestParam String mc, Model m) {
		m.addAttribute("categorie",sc.getCategorieByMc(mc));
		return "categorie";
	}
	
	@GetMapping("/deleteCat/{id}")
		public String supprimerCategorie(@PathVariable("id") Long idCategorie) {
			sc.deleteCategorie(idCategorie);
			return "redirect:/categorie";
		
	}
}
