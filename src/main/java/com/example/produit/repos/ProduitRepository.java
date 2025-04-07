package com.example.produit.repos;

import com.example.produit.entities.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduitRepository extends JpaRepository<Produit,Long> {
    void delete(Produit d);
}
