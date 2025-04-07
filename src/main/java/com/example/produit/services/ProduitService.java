package com.example.produit.services;

import com.example.produit.entities.Produit;

import java.util.List;

public interface ProduitService {
    Produit saveProduit(Produit p);
    Produit updateProduit(Produit p);
    void deleteProduit(Produit p);
    void deleteProduitById(Long id);
    Produit getProduitById(Long id);
    List<Produit> getAllProduit();
}
