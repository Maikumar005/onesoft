package com.automobiles.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="bike")
public class Bike {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String brand;
private int price;
private String color;
private String model;
private String rating;
private String fueltype;
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
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public String getRating() {
	return rating;
}
public void setRating(String rating) {
	this.rating = rating;
}
public String getFueltype() {
	return fueltype;
}
public void setFueltype(String fueltype) {
	this.fueltype = fueltype;
}


}
