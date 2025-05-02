package com.example.produit.services;

import com.example.produit.entities.Categorie;
import com.example.produit.entities.Produit;

import java.util.List;

public interface ProduitService {
    Produit saveProduit(Produit p);
    Produit updateProduit(Produit p);
    void deleteProduit(Produit p);
    void deleteProduitById(Long id);
    Produit getProduitById(Long id);
    List<Produit> getAllProduit();

    Produit findByNomProduit(String nom);
    List<Produit> findByNomProduitContains(String nom);
    List<Produit> findByNomPrix(String nom,Double Prix);
    List<Produit> findByCategorie(Categorie categorie);
    List<Produit> findByCategorieIdCat(Long id);
    List<Produit> findByOrderByNomProduitAscDesc();
    List<Produit> trierProduitsNomPrix();
}
