package com.example.produit.repos;

import com.example.produit.entities.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProduitRepository extends JpaRepository<Produit,Long> {
    void delete(Produit d);
    Produit findByNomProduit(String nomProduit);
    Produit findByNomProduitAndPrixProduit(String nomProduit,double prixProduit);
    List<Produit> findByNomProduitContains(String nomProduit);

    @Query("select p from Produit p where p.nomProduit like %?1 and p.prixProduit > ?2")
    List<Produit> findByNomPrix(String nom, Double prix);
}
