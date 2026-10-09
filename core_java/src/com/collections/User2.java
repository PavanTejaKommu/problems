package com.collections;

import java.util.ArrayList;
import java.util.Collections;

public class User2 {
	public static void main(String[] args) {
		ArrayList<User1> al = new ArrayList<>();
		
		User1 obj1 = new User1(23, "Teja", 100000.00, 'M');
		User1 obj2 = new User1(24, "Pavan", 100000.00, 'M');
		User1 obj3 = new User1(23, "Tej", 100000.00, 'M');
		User1 obj4 = new User1(20, "Om Routh", 100000.00, 'M');
		User1 obj5 = new User1(73, "Maruthi", 100000.00, 'M');
		User1 obj6 = new User1(29, "Mehar Ramesh", 100000.00, 'M');
		
		
		al.add(obj1);
		al.add(obj2);
		al.add(obj3);
		al.add(obj4);
		al.add(obj5);
		al.add(obj6);
		
		Collections.sort(al);
		for(User1 u : al) {
			System.out.println(u);
		}
		
		
		
	}

}
