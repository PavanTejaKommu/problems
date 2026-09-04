package com.loopingstatements;
import java.util.*;
public class StudentMarksReport {
	Scanner sc = new Scanner(System.in);
	int subject1;
	int subject2;
	int subject3;
	int subject4;
	int subject5;
	
	
	public void settingmarks() {
		for(int i =1;i<=5;i++) {
			if(i==1) {
			System.out.println("Enter the marks of Subject"+i +":");
			subject1 = sc.nextInt();
			}else if(i==2) {
			System.out.println("Enter the marks of Subject"+i +":");
			subject2 = sc.nextInt();
			}else if(i==3) {
			System.out.println("Enter the marks of Subject"+i +":");
			subject3 = sc.nextInt();
			}else if(i==4) {
			System.out.println("Enter the marks of Subject"+i +":");
			subject4 = sc.nextInt();
			}else if(i==5) {
			System.out.println("Enter the marks of Subject"+i +":");
			subject5 = sc.nextInt();
			}
		}
		
	}
	
	public void totalmarks() {
		int total= subject1 + subject2 + subject3 + subject4 + subject5;
		System.out.println("Total marks : "+total);
		
		
	}
	public void avgmarks() {
		float avg = (subject1 + subject2 + subject3 + subject4 + subject5)/5;
		System.out.println("Avg marks : "+avg);
		
	}
	
	public void all() {
		settingmarks();
		totalmarks();
		avgmarks();
		
	}

	public static void main(String[] args) {
		StudentMarksReport obj = new StudentMarksReport();
		obj.all();
		
		
	}

}
