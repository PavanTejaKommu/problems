package com.exceptionhandling;

import java.util.ArrayList;

public class Student {

	public static void main(String[] args) {

		int subject_1 = 20;
		int subject_2= 40;
		int subject_3 = 50;
		int subject_4 = 60;
		int subject_5 = 70;

		StudentMarksEntry stm = new StudentMarksEntry(subject_1, subject_2, subject_3, subject_4, subject_5) {

			public  void validateMarks(){

				ArrayList<Integer> al = new ArrayList<>();
				al.add(null);
				al.add(null);
				al.add(null);
				al.add(null);
				al.add(null);
			

				try {

				} catch (Exception e) {
					// TODO: handle exception
				}

			}
		};
	}
}


