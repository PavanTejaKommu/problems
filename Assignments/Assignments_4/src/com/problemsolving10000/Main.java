package com.problemsolving10000;

class Animal {
	
	 void sound() {
		 System.out.println("Animal Sound ...");
	 }

}


class Dog extends Main{
	 void sound() {
		 System.out.println("Dog Bark...");
	 }
}

public class Main{
	
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.sound();
		
		
	}
}
