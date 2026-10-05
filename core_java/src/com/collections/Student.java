package com.collections;

public class Student {
	
	String  name ;
	int id ;
	String course;
	
	public Student(String name, int id, String course) {
		super();
		this.name = name;
		this.id = id;
		this.course = course;
	}
	
	

	@Override
	public String toString() {
		return "\n" + "Student [name=" + name + ", id=" + id + ", course=" + course + "]";
	}
	
	
	
	
	

}
