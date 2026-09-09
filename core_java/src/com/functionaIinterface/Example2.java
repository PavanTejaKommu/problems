package com.functionaIinterface;

import java.util.function.Predicate;

class Employe{
	private String name ;
	
	private String designation ;
	
	private double salary;
	
	
	Employe(String name , String designation , double salary){
		
		this.name = name ;
		
		this.salary = salary;
		
		this.designation = designation;
		
		
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDesignation() {
		return designation;
	}


	public void setDesignation(String designation) {
		this.designation = designation;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "Employe [name=" + name + ", designation=" + designation + ", salary=" + salary + "]";
	}
	
	
	
	
	
}

public class Example2 {
	
	
	public static void main(String[] args) {
		
	}
	Employe emp = new Employe("teja" , "sd" ,3000);
	
	Predicate<Employe> pr = new Predicate<Employe>() {
		
		@Override
		public boolean test(Employe t) {
			return false;
		}
	};
		
		
		
		


}
