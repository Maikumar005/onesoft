package com.products.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.products.Repository.ProductsRepository;
import com.products.entity.Products;

@Repository 
public class ProductsDao {
@Autowired
ProductsRepository pr;
public String setProd(Products p) {
	pr.save(p);
	return "saved";
}
public String setAllProd(List<Products> p) {
	pr.saveAll(p);
	return "saved all";
}
public List<Products> getAllProd(){
	return pr.findAll();
	
}
}
