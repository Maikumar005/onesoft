package com.electronics.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.electronics.Dao.AcDao;
import com.electronics.Entity.Ac;
import com.electronics.customException.IdNotFoundException;

@Service
public class AcService {
@Autowired
AcDao ad;

public String setAc(Ac a) {
	a.setNetprice(a.getPrice()-(a.getPrice()*a.getDiscount()/100));
	return ad.setAc(a);
}
public String setAllAc(List<Ac> a) {
	return ad.setAllAc(a);
}
public Ac getById(int i) throws IdNotFoundException {
	return ad.getById(i);
}
public List<Ac> getAllAc(){
	return ad.getAllAc();
}
public List<Ac>getNetPrice(){
	List<Ac> x=getAllAc();
	for (Ac a:x) {
		a.setNetprice(a.getPrice()-(a.getPrice()*a.getDiscount()/100));
	}
	return x;
}
public String setAllAcObj(List<Ac> a) {
	for(Ac x:a) {
		x.setNetprice(x.getPrice()-x.getPrice()*x.getDiscount()/100);
	}
	return ad.setAllAcObj(a);
	}
public String updateAc(Ac a,int id) throws IdNotFoundException {
	Ac x=getById(id);
	Ac y=a;
	x.setBrand(y.getBrand());         //in PutMapping if we update single field in object i will make rest fields in object as null
    x.setPrice(y.getPrice());         //PutMapping update entire object (we can use PatchMapping to update single field        
	x.setDiscount(y.getDiscount());
	x.setRating(y.getRating());
	setAc(x);
	return "updated";
	}
}