package com.demo;

public class TestAccess {

	public static void main(String[] args) {
		AccessDemo ad = new AccessDemo();
		ad.publicMethod();
		ad.protectedMethod();
		ad.defaultMethod();
		System.out.println("Private can't acces out side the class");

	}

}
