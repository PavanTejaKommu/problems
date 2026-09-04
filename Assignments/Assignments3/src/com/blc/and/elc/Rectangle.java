package com.blc.and.elc;

public class Rectangle {

	int  length;
	int  bredth;

	public  void calculateArea() {

		int area = length * bredth;
		System.out.println("Area of Rectangele :"+area);

	}

	public  void calculatePerimeter() {

		int perimeter = 2*(length + bredth);
		System.out.println("Perimeter of the Rectangle : "+perimeter);

	}

	public  void  displayRectangleDetails() {
		System.out.println(" Rectangle length : "+length);
		System.out.println("Rectangle bredth : "+bredth);

	}

}
