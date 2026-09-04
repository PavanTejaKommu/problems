package com.method_Access_Assignment;

import java.awt.DisplayMode;

public class Students {
	
	
//	write a java program to find the student details 
//	st name 
//	id 
//	st- marks
	String studentname ;
	int studentID;
	int studentMarks;
	
	public void setStudentname(String stuname) {
		studentname = stuname;
	}
	
	public void setStudentID(int stuid) {
		studentID = stuid;
	}
	
	public void setStudentMarks(int stuMarks) {
		studentMarks = stuMarks;
	}
	
	
	public String getStudentname() {
		return studentname;
	}
	
	public int getStudentID() {
		return studentID;
	}
	
	public int getStudentMarks() {
		return studentMarks;
	}
	
	
	public void display() {
		
		System.out.println("Student Name :" +studentname);
		System.out.println("Student ID :"+studentID);
		System.out.println("Student Marks :"+studentMarks);
	}
	
	

	
	
	public static void main(String[] args) {
		
		Students ss = new Students();
		ss.setStudentname("Teja");
		ss.setStudentID(11);
		ss.setStudentMarks(98);
		
		System.out.println("Student Details");
		ss.display();

		
		
		
	}

}
