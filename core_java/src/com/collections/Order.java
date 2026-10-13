package com.collections;

public class Order {
	Integer id  = 123;
	String productName;
	Double price;
	Double quantity;
	
	public Order(String productName, double price, double quantity) {
	
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", productName=" + productName + ", price=" + price + ", quantity=" + quantity + "]";
	}
	
	

}
