package com.isitcom.formationSpringboot.demo1.restControleur;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.isitcom.formationSpringboot.demo1.entities.Produit;
import com.isitcom.formationSpringboot.demo1.services.IServiceProduit;

import lombok.AllArgsConstructor;
//@CrossOrigin to use the api with angular
@RestController
@AllArgsConstructor
@RequestMapping("/api")
public class ProduitRestControleur {

	private IServiceProduit sp;
	@GetMapping("/produit")
	public List<Produit> getAllProdutcts()
	{
		return sp.getAllProducts();
	}
	
	@GetMapping("/findProduitByMc/{mc}")
	public List<Produit> getProduitByMc(@PathVariable String mc){
		return sp.getProductByMc(mc);
	}
	
	
	@PostMapping("/addProduct")
	public List<Produit> addProd(@RequestBody Produit p){
		sp.addProduit(p);
		return sp.getAllProducts();
	}
	
	@PutMapping("/updateProduct")
	public List<Produit> updateproduct(@RequestBody Produit p){
		sp.updateProduct(p);
		return sp.getAllProducts();
	}
	
	@DeleteMapping("/deleteProduct")
	public List<Produit> deleteproduct(@RequestBody Long id){
		sp.deleteProduct(id);
		return sp.getAllProducts();
	}
	
}	
