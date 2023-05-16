package com.FinalProduct;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FinalProductService {
@Autowired
FinalProductDao fd;
public  String setAllFinalProd(List<FinalProduct> f1) {
	return fd.setAllFinalProd(f1);
}
}