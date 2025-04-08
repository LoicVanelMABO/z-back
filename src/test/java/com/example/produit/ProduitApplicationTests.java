package com.example.produit;

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

	@Test
	public void updateProd(){
		Produit d = produitRepository.findById(12l).get();
		System.out.println(d);
		d.setPrixProduit(1501.00);
		d.setNomProduit("Le nom change");
		produitRepository.save(d);
		Produit d2 = produitRepository.findById(12l).get();
		System.out.println(d2);
	}

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

}
