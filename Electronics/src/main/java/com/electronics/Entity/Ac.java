package com.electronics.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="ac")
public class Ac {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String brand;
private int price;
private String color;
private int discount;
private int netprice;
private int rating;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public int getDiscount() {
	return discount;
}
public void setDiscount(int discount) {
	this.discount = discount;
}
public int getNetprice() {
	return netprice;
}
public void setNetprice(int netprice) {
	this.netprice = netprice;
}
public int getRating() {
	return rating;
}
public void setRating(int rating) {
	this.rating = rating;
}

	
}




