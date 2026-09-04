package com.Conditionalstatements;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthPasswordFieldUI;

public class LoginAuthentication {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.println("Enter User Name : ");
String userName = sc.nextLine();

System.out.println("Entyer the password : ");
int password = sc.nextInt();

if(userName.equals("admin")) {
	if(password ==1234) {
		System.out.println("Login is Successful..");
	}
}
	}

}
