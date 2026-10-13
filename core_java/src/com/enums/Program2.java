package com.enums;

public class Program2 {
	public static void main(String[] args) {
		
		Enum2 enu = Enum2.EAST;
		
		switch(enu) {
		case 	EAST->System.out.println("East");
		case 	WEST->System.out.println("West");
		case 	NORTH->System.out.println("North");
		case 	SOUTH->System.out.println("South");
		}
	}

}
