package com.scanner;
import java.util.*;
public class Example3 {
	Scanner sc = new Scanner(System.in);
	String id = "admin@123";
	String password = "admin123";
	int attempts = 0;
	public void check() {
		
		do {
			System.out.println("Please enter the user Id  : ");
			
			String checkId = sc.nextLine();
			
			
		}while(attempts < 3);
			
		
		
	}

	public static void main(String[] args) {

		
		
	}

}
