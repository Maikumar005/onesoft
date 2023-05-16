package com.automobiles.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.automobiles.Entity.Bike;
import com.automobiles.Service.BikeService;

@RestController
public class BikeController {
@Autowired
BikeService bs;
@PostMapping("/setallbike")
public String setAllBike(@RequestBody List<Bike> b) {
	return bs.setAllBike(b);
}
@GetMapping("/getallbike")
public List<Bike> getAllBike() {
	return bs.getAllBike();
}
@GetMapping("/getbyprice/{p}")
public List<Bike>getByPrice(@PathVariable int p){
	return bs.getByPrice(p);
}
@GetMapping("/getmax")
public Bike getMax(){
	return bs.getMax();
}
@GetMapping("/getmin")
public Bike getMin() {
	return bs.getMin();
}
@GetMapping("/getbyrange/{a}/{b}")
public List<Bike>getByRange(@PathVariable int a,@PathVariable int b){
	return bs.getByRange(a,b);
}
@GetMapping("/getsecmax")
public Bike getsecmax() {
	return bs.getSecMax();
}

@GetMapping("/getsecmin")
public Bike getsecmin() {
	return bs.getSecMin();
}
}
