package com.example.produit;

import com.example.produit.entities.Categorie;
import com.example.produit.entities.Produit;
import com.example.produit.repos.ProduitRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.List;

@SpringBootTest
class ProduitApplicationTests {

	/*@Test
	void contextLoads() {
	}*/
	@Autowired
	private ProduitRepository produitRepository;

	/*@Test
	public void testCreateProduit(){
		Produit prod = new Produit("14", 2500.0,new Date());
		produitRepository.save(prod);
	}*/

	@Test
	public void testFindProd(){
		Produit d = produitRepository.findById(12l).get();
		System.out.println(d);
	}

	/*@Test
	public void updateProd(){
		Produit d = produitRepository.findById(12l).get();
		System.out.println(d);
		d.setPrixProduit(1501.00);
		d.setNomProduit("Le nom change");
		produitRepository.save(d);
		Produit d2 = produitRepository.findById(12l).get();
		System.out.println(d2);
	}*/

	@Test
	public void deleteProd(){
		Produit d = produitRepository.findById(11l).get();
		produitRepository.delete(d);
	}

	@Test
	public void findAllProd(){
		List<Produit> prods = produitRepository.findAll();
		for (Produit p:prods)
			System.out.println(p);
	}
	@Test
	public void findProdByName(){
		Produit p = produitRepository.findByNomProduit("14");
		System.out.println(p);
	}

	@Test
	public void findProdByNameAndPrixProduit(){
		Produit p = produitRepository.findByNomProduitAndPrixProduit("14",250025);
		System.out.println(p);
	}

	@Test
	public void findProdByNameContains(){
		List<Produit> prods = produitRepository.findByNomProduitContains("1");
		for (Produit p:prods)
			System.out.println(p);
	}

	@Test
	public void findProdByNomPrix(){
		List<Produit> prods = produitRepository.findByNomPrix("PC1",1.0);
		for (Produit p:prods)
			System.out.println(p);
	}

	@Test
	public void findProduitByCat(){
		Categorie cat = new Categorie();
		cat.setIdCat(1l);
		List<Produit> prods = produitRepository.findByEntiteCategorie(cat);
		for(Produit p:prods) {
            System.out.println(p);
        }
	}

	@Test
	public void findByCategorieIdCat(){
		List<Produit> prods = produitRepository.findByCategorieIdCat(1L);
		for(Produit p : prods){
			System.out.println(p);
		}
	}

	@Test
	public void findByOrderByNomProduitAsc(){
		List<Produit> produits = produitRepository.findByOrderByNomProduitDesc();
		System.out.println("les produits par ordre alphabétique");
		for (Produit p : produits){
			System.out.println(p);
		}
	}

	@Test
	public void ascNomproduit(){
		List<Produit> produits = produitRepository.findByOrderNomProduitAscJPQL();
		System.out.println("les produits par ordre alphabétique 2 jpql ");
		for (Produit p : produits){
			System.out.println(p);
		}
	}

}
