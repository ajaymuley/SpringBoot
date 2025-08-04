package com.entity;

public class Product1 {

	int pid;
	String pname;
	String category;
	double price;
	
	public Product1() {
		super();
	}
	
	public Product1(int pid, String pname, String category, double price) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.category = category;
		this.price = price;
	}
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}
