package com.collections;

public class User1 implements Comparable<User1> {
	
	private Integer id;
	private String name;
	private double sal;
	
	private char gender;

	public User1(int id, String name, double sal, char gender) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
		this.gender = gender;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	@Override
	public int compareTo(User1 o) {
		
		return this.name.compareTo(name);
	}

	@Override
	public String toString() {
		return "User1 [id=" + id + ", name=" + name + ", sal=" + sal + ", gender=" + gender + "]";
	}
	
	
	

}
