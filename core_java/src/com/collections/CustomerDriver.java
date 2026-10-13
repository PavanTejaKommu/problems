package com.collections;

import java.util.ArrayList;

public class CustomerDriver {
	public static void main(String[] args) {
		
		ArrayList<Customer> al = new ArrayList<>();
		
		Customer c1 = new Customer(23, "Teja", "hyd", "9999999999");
		Customer c2 = new Customer(32, "Pavan", "hyd", "9999999999");
		Customer c3 = new Customer(19, "Niky", "chennai", "9999999999");
		Customer c4 = new Customer(45, "Dolly", "benglore", "9999999999");
		Customer c5 = new Customer(67, "Neeel", "mumbai", "9999999999");
		Customer c6 = new Customer(90, "Atli", "vizag", "9999999999");
		
		
		al.add(c1);
		al.add(c2);
		al.add(c3);
		al.add(c4);
		al.add(c5);
		al.add(2, c6);
		al.set(2, c6);
		al.remove(1);
		
		
		
		for(int i =0 ; i < al.size();i++) {
			System.out.println("Customer  Id : "+al.get(i).getCustomerId());
			System.out.println("Customer Name : "+al.get(i).getCustomerName());
			System.out.println("City : "+al.get(i).getCity());
			System.out.println("Phone Number : "+al.get(i).getPhoneNumber());
			System.out.println("---------------");
		}
		System.out.println("Total No of Customers : "+al.size());
		al.clear();
		System.out.println(al.isEmpty());
		
	}

}
