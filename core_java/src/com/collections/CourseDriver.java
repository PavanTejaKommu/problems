package com.collections;

import java.util.ArrayList;

public class CourseDriver {
	public static void main(String[] args) {
		
		ArrayList<Course> availableCourses = new ArrayList<>();
		ArrayList<Course> enrolledCourses = new ArrayList<>();
		
		Course c1 = new Course("23", "java", 6, 30000.0);
		Course c2 = new Course("45", "python", 8, 25000.0);
		Course c3 = new Course("21", "data science", 7, 30000.0);
		Course c4 = new Course("44", "DevOps", 6, 60000.0);
		Course c5 = new Course("52", "SalesForce", 5, 34000.0);
		Course c6 = new Course("98", "CyberSecurity", 4, 31000.0);
		Course c7 = new Course("101", "Machine Learning", 6, 40000.0);
		 availableCourses.add(c1);
		 availableCourses.add(c2);
		 availableCourses.add(c3);
		 availableCourses.add(c4);
		 availableCourses.add(c5);
		 
		 enrolledCourses.add(c1);
		 enrolledCourses.add(c2);
		 
		 availableCourses.addAll(enrolledCourses);
		 
		 System.out.println("Contails All : "+availableCourses.containsAll(enrolledCourses));
		 availableCourses.remove(3);
		 
		 for(int i =0; i < availableCourses.size();i++) {
			 System.out.println(availableCourses.get(i).getCourseName());
			 System.out.println(availableCourses.get(i).getCourseId());
			 System.out.println(availableCourses.get(i).getDuration());
			 System.out.println(availableCourses.get(i).getFee());
			 System.out.println();
		 }
		 System.out.println("Total No of : "+availableCourses.size());
		
	}

}
