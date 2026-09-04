package com.inheritance;

public class Car extends Vehicle {
	
	public void speed() {
		System.out.println("With speed of 80km/h");
	}

	public static void main(String[] args) {

		Car  c= new Car();
		c.run();
		c.speed();
		
	}

}
