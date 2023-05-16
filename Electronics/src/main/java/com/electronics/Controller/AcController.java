package com.electronics.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.electronics.Entity.Ac;
import com.electronics.Service.AcService;
import com.electronics.customException.IdNotFoundException;

@RestController
@RequestMapping("/ac")
public class AcController {
@Autowired
AcService as;

@PostMapping ("/setac")
public String setAc(@RequestBody Ac a) {
	return as.setAc(a);
}

@PostMapping("/setallac")
public String setAllAc(@RequestBody List<Ac> a) {
	return as.setAllAc(a);
}


@GetMapping("/getbyid/{i}")
public Ac getById(@PathVariable int i) throws IdNotFoundException {
	return as.getById(i);	
}
@GetMapping("/getallac")
public List<Ac> getAllAc(){
	return as.getAllAc();
}
@GetMapping("/getnetprice")
public List<Ac> getNetPrice(){
	return as.getNetPrice();
}


@PostMapping("/setallacobjects")
public String setAllAcObj(@RequestBody List<Ac> a) {
	return as.setAllAcObj(a);

}
@PutMapping ("/update/{id}")  
	public String updateAc(@RequestBody Ac a,@PathVariable int id) throws IdNotFoundException {
		return as.updateAc(a,id);
	}
}

