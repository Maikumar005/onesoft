package com.products.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.products.Dao.ProductsDao;
import com.products.entity.Products;
@Service
public class ProductsService {
@Autowired
ProductsDao pd;
	public String setProd(Products p) {
		
		return  pd.setProd(p);
	}
	public String setAllProd(List<Products> p) {
		
		return pd.setAllProd(p);
	}
	public List<Products> getAllProd(){
		return pd.getAllProd();
	}

}
