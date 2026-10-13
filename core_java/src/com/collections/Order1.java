package com.collections;

public class Order1 {
private int 	orderId;
private String	productName;
private int	quantity;
private double	price;
public Order1(int orderId, String productName, int quantity, double price) {
	super();
	this.orderId = orderId;
	this.productName = productName;
	this.quantity = quantity;
	this.price = price;
}
public int getOrderId() {
	return orderId;
}
public void setOrderId(int orderId) {
	this.orderId = orderId;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
@Override
public String toString() {
	return "Order1 [orderId=" + orderId + ", productName=" + productName + ", quantity=" + quantity + ", price=" + price
			+ "]";
}




}
