package com.collections;

public class Customer {
	private	int customerId;
	private	String customerName;
	private	String city;
	private String	phoneNumber;
	public Customer(int customerId, String customerName, String city, String phoneNumber) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.city = city;
		this.phoneNumber = phoneNumber;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
