package com.collections;

import java.util.ArrayList;

public class Program4 {
	
	
	/* Add 8 employee IDs.
	Insert 5001 at index 3.
	Replace the employee ID at index 5 with 9001.
	Remove the employee ID at index 2.
	Display the employee ID at index 4.
	Print the total number of employee IDs.
	Display the final list. 
	*/
	
	public static void main(String[] args) {
		
		
		
		
		ArrayList<Integer> al = new ArrayList<>();
		
		al.add(23);
		al.add(33);
		al.add(43);
		al.add(63);
		al.add(26);
		al.add(29);
		al.add(99);
		al.add(57);
		System.out.println(al);
		al.add(3, 5001);
		System.out.println(al);

		al.set(5, 9001);
		System.out.println(al);

		al.remove(2);
		System.out.println(al);

		
		System.out.println(al.get(4));
		System.out.println(" Total No of employees : "+al.size());
		
		System.out.println(al);
		
		
	}

}
