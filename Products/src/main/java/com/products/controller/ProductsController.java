package com.products.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.products.Service.ProductsService;
import com.products.entity.Products;

@RestController
public class ProductsController {
@Autowired
ProductsService ps;
@PostMapping("/setprod")
public String setProd(@RequestBody Products p) {
	return ps.setProd(p);
}
@PostMapping("/setallprod")
public String setAllProd(@RequestBody List<Products> p) {
	return ps.setAllProd(p);
}
@GetMapping("/getallprod")
public List<Products> getAllProd(){
	return ps.getAllProd();
}

}
