package com.electronics.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.electronics.Entity.Ac;
import com.electronics.Repository.AcRepository;
import com.electronics.customException.IdNotFoundException;

@Repository
public class AcDao {
@Autowired
AcRepository ar;

public String setAc(Ac a) {
	ar.save(a);
	return "saved";
}
public String setAllAc(List<Ac> a) {
	ar.saveAll(a);
	return "saved All";
}
public Ac getById(int i) throws IdNotFoundException {
 // return ar.findById(i).get();
 return ar.findById(i).orElseThrow(()->new IdNotFoundException("id out of bounds"));
}
public List<Ac> getAllAc(){
	return ar.findAll();

}
public String setAllAcObj(List<Ac> a) {
	ar.saveAll(a);
	return "saved all";
}

}
