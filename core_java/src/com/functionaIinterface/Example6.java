package com.functionaIinterface;

import java.util.function.Function;

public class Example6 {


	private  String name ;
	private String designation;
	private double salary;

	Example6(String name , String designation , double salry){
		this.name = name;
		this.designation = designation;
		this.salary= salry;
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





	public static void main(String[] args) {



		Example6 obj = new Example6("Teja \n", " SD \n", 50000.0);


		Function<Example6, String> fun2 = new Function<Example6, String>() {

			@Override
			public String apply(Example6 obj) {
				return ("Name : "+obj.getName()) + ("Designation : "+obj.getDesignation()) + ("salary : "+obj.getSalary());
			}
		};

		System.out.println(fun2.apply(obj));

				Function<String, String> function  = new Function<String, String>() {
					
					@Override
					public String apply(String str) {
						
						return str.toUpperCase();
					}
				};
				
				System.out.println(function.apply("java is awesome "));
	}

}
