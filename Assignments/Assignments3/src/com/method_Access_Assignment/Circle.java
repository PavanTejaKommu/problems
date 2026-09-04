package com.method_Access_Assignment;
import java.util.*;
public class Circle {

	public static int radius ;
	public static float area_circle;

	public  static void calculateCircleArea() {
		System.out.println("Circle Details");
		System.out.println("Radius"+radius);
		area_circle = (22/7)*radius*radius;
		System.out.println("Area of Circle :"+area_circle);


	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Radius");
		radius = sc.nextInt();
		calculateCircleArea();


	}
}


