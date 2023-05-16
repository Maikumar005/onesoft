package com.FinalProduct;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class FinalProductDao {
@Autowired
FinalProductRepository fr;
public String setAllFinalProd(List<FinalProduct> f1) {
	fr.saveAll(f1);
	return "saved all";
}
}
