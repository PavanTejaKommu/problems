package com.collections;

import java.util.ArrayList;

public class OrderDriver2 {
	public static void main(String[] args) {
		Order1 o1 = new Order1(23, "Bag", 4, 3000.00);
		Order1 o2 = new Order1(23, "Glass", 4, 3000.00);
		Order1 o3 = new Order1(23, "Plate", 4, 3000.00);
		Order1 o4 = new Order1(23, "Cup", 4, 3000.00);
		Order1 o5 = new Order1(23, "Spoon", 4, 3000.00);
		Order1 o6 = new Order1(23, "Holder", 4, 3000.00);
		Order1 o7 = new Order1(23, "Tissue", 4, 3000.00);
		
		
		ArrayList<Order1> al = new ArrayList<>();
		
		al.add(o1);
		al.add(o2);
		al.add(o3);
		al.add(o4);
		al.add(o5);
		al.add(o6);
		al.add(4, o6);
		al.set(2, o7);
		System.out.println(al.get(3));
		
		for(int i =0; i < al.size();i++) {
			System.out.println(al.get(i).toString());
		}
		System.out.println("Total No of orders : "+al.size());
		al.clear();
		
		System.out.println("Is Empty : "+al.isEmpty());
	}

}
