package com.isitcom.formationSpringboot.demo1.entities;


import java.util.*;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity

public class Categorie {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nom;
    @ManyToMany(mappedBy = "categorie", cascade = CascadeType.ALL)
	private List<Produit> liste;
	
}
