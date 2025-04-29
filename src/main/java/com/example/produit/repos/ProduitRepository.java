package com.example.produit.repos;

import com.example.produit.entities.Categorie;
import com.example.produit.entities.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProduitRepository extends JpaRepository<Produit,Long> {
    void delete(Produit d);
    Produit findByNomProduit(String nomProduit);
    Produit findByNomProduitAndPrixProduit(String nomProduit,double prixProduit);
    List<Produit> findByNomProduitContains(String nomProduit);

    /*@Query("select p from Produit p where p.nomProduit like %?1 and p.prixProduit > ?2")
    List<Produit> findByNomPrix(String nom, Double prix);*/

    @Query("select p from Produit p where p.nomProduit like %:nom and p.prixProduit > :prix")
    List<Produit> findByNomPrix(@Param("nom") String nom, @Param("prix") Double prix);

    //chercher un produit tout entier en passant son une entité(objet)
    //@Query("select p from Produit p where p.categorie = ?1")
    @Query("select p from Produit p where p.categorie = :cat")
    //List<Produit> findByEntiteCategorie(Categorie categorie);
    List<Produit> findByEntiteCategorie(@Param("cat") Categorie categorie);

    List<Produit> findByCategorieIdCat(Long id);
}
