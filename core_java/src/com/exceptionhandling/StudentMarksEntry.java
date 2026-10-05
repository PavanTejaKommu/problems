package com.exceptionhandling;

import java.util.ArrayList;

public class StudentMarksEntry {
	
	 private Integer  subject_1;
	 private int subject_2;
	 private int subject_3;
	 private int subject_4;
	 private int subject_5;
	 private  double totalMarks;
	public StudentMarksEntry(int subject_1, int subject_2, int subject_3, int subject_4, int subject_5) {
		super();
		this.subject_1 = subject_1;
		this.subject_2 = subject_2;
		this.subject_3 = subject_3;
		this.subject_4 = subject_4;
		this.subject_5 = subject_5;
	}
	public int getSubject_1() {
		return subject_1;
	}
	public void setSubject_1(int subject_1) {
		this.subject_1 = subject_1;
	}
	public int getSubject_2() {
		return subject_2;
	}
	public void setSubject_2(int subject_2) {
		this.subject_2 = subject_2;
	}
	public int getSubject_3() {
		return subject_3;
	}
	public void setSubject_3(int subject_3) {
		this.subject_3 = subject_3;
	}
	public int getSubject_4() {
		return subject_4;
	}
	public void setSubject_4(int subject_4) {
		this.subject_4 = subject_4;
	}
	public int getSubject_5() {
		return subject_5;
	}
	public void setSubject_5(int subject_5) {
		this.subject_5 = subject_5;
	}
	public double getTotalMarks() {
		return totalMarks;
	}
	public void setTotalMarks(double totalMarks) {
		this.totalMarks = totalMarks;
	}
	 
	

	
	 
	

}
