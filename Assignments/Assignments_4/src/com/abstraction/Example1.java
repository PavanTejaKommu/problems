package com.abstraction;



abstract class Area{
	
	
	public abstract void area();

	
	
}


class circle  extends Area{
	
	int radius;
	
	
	public circle(int radius) {
		super();
		this.radius = radius;
	}


	public void area() {
		System.out.println("Area of circle : "+(Math.PI*radius * radius));
		
	}
	
	
}


class rectangle extends Area{
	int length;
	int bredth;
	
	
	public rectangle(int length, int bredth) {
		super();
		this.length = length;
		this.bredth = bredth;
	}


	public void area() {
		System.out.println("Area of Rectangle : "+(length * bredth));
		
	}
	
	
}

public class Example1 {
	public static void main(String[] args) {
		
		
		Area a = new circle(20);
		a.area();
		
		Area a1 = new rectangle(2, 6);
		a1.area();
		
	}

}
