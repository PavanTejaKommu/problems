package com.collections;

import java.util.ArrayList;
import java.util.Collections;

public class StudenttDetails {
	public static void main(String[] args) {
		
		ArrayList<Student> list = new ArrayList<>();

		Collections.synchronizedList(list);


		list.add(new Student("Teja", 25000, "CSE"));
		list.add(new Student("Pavan", 35000, "ECE"));
		list.add(new Student("Niky", 12000, "CSE"));
		
		
		list.add(new Student("Ram", 55000, "EEE"));
		
		list.add(new Student("Lekhan", 31000, "Mech"));
		list.add(new Student("Rahul", 56000, "EEE"));
		list.add(new Student("Nithish", 75000, "Civil"));


		//		System.out.println(list.toString());	
		for(Student st : list) {
			System.out.println(st);
		}

		System.out.println(list.size());

	}

}
