package com.collections;

import java.util.ArrayList;

public class ArrayList1 {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<>();
		
		al.add(23);
		al.add(33);
		al.add(45);
		al.add(90);
		al.add(43);
		al.add(21);
		al.add(59);
		al.add(37);
	
		al.add(3, 5001);
		al.set(5, 9001);
		al.remove(2);
		System.out.println(al.get(4));
		System.out.println("Total No of Employees : "+al.size());

		System.out.println(al);
	}

}
