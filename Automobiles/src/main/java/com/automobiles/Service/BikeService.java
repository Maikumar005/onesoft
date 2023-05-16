package com.automobiles.Service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.automobiles.Dao.BikeDao;
import com.automobiles.Entity.Bike;

@Service
public class BikeService {
@Autowired
BikeDao bd;
public String setAllBike( List<Bike> b) {
	return bd.setAllBike(b);
}
public List<Bike> getAllBike() {
	return bd.getAllBike();
}
public List<Bike>getByPrice(int p){
	List<Bike> x=getAllBike();
	List<Bike> z=x.stream().filter(y->y.getPrice()==p).collect(Collectors.toList());
	return z;
}
public Bike getMax(){
	List<Bike>y=getAllBike();
    Bike m= y.stream().max(Comparator.comparing(Bike::getPrice)).get();
 //List<Bike>z=y.stream().filter(c->c.getPrice()==m).collect(Collectors.toList());
 return m;
}
public Bike getMin() {
	List<Bike>y=getAllBike();
	Bike m=y.stream().min(Comparator.comparing(Bike::getPrice)).get();
	return m;
}
public List<Bike>getByRange(int a,int b){
	List<Bike>y=getAllBike();
	List<Bike>z=y.stream().filter(x->(x.getPrice()>a&&x.getPrice()<b)).collect(Collectors.toList());
	return z;
}
public Bike getSecMax(){
	List<Bike>y=getAllBike();                          //x->x.getPrice
	Bike secmax=y.stream().sorted(Comparator.comparing(Bike::getPrice).reversed()).skip(1).findFirst().get();
	return secmax;
}
public Bike getSecMin() {
	List<Bike>y=getAllBike();                          //x->x.getPrice
	Bike secmin=y.stream().sorted(Comparator.comparing(Bike::getPrice)).skip(1).findFirst().get();
	return secmin;
}
}
