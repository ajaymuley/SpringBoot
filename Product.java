package com.entity;

public class Product {

	
	int id;
	String name;
	int price;
	String Category;
	
	public Product() {
		super();
	}
	
	public Product(int id, String name, int price, String category) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		Category = category;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getCategory() {
		return Category;
	}
	public void setCategory(String category) {
		Category = category;
	}
	
	
	
}
