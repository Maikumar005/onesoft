package com.automobiles.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.automobiles.Entity.Bike;
import com.automobiles.Repository.BikeRepository;

@Repository
public class BikeDao {
@Autowired
BikeRepository br;
public String setAllBike( List<Bike> b) {
	br.saveAll(b);
	return "saved all";
}
public List<Bike> getAllBike() {
	return br.findAll();
}

}
