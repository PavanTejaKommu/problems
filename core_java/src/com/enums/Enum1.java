package com.enums;

public class Enum1 {

	public static void main(String[] args) {

		Program1 p = Program1.SAT;

		switch (p) {
		case MON,TUE,WED,THURS,FRI-> System.out.println("Ohh its a weak day"); 
		case SAT,SUN -> System.out.println("Its weakend");
		}

	}



}





/*
 * 
 * Enum collection of constant data 
 * it is introduced in java 1.5v 
 * it is a keyword 
 * 
 * 
 */



