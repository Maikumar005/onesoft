package com.electronics.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="fan")
public class Fan {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String brand;
private int price;
private String color;
private int noOfWings ;
private String material;
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
public int getNoOfWings() {
	return noOfWings;
}
public void setNoOfWings(int noOfWings) {
	this.noOfWings = noOfWings;
}
public String getMaterial() {
	return material;
}
public void setMaterial(String material) {
	this.material = material;
}


}
