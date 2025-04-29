package com.example.produit.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@ToString(exclude = "produits")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Categorie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCat;
    private String nomCat;
    private String descriptionCat;
    @OneToMany(mappedBy = "categorie")
    private List<Produit> produits;
}
