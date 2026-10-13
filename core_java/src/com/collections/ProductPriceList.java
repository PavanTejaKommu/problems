package com.collections;

import java.util.ArrayList;

public class ProductPriceList {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		
		al.add(23);
		al.add(67);
		al.add(90);
		al.add(45);
		al.add(32);
		al.add(99);
		al.set(1, 101);
		al.set(al.size()-1, 21);
		al.remove(3);
		System.out.println("Price at index 2 : "+al.get(2));
		System.out.println("Total Prices : "+al.size());
		System.out.println("Final List : "+al.getLast());
		
		
	}
}
