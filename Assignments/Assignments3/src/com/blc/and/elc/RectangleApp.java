package com.blc.and.elc;

public class RectangleApp {

	public static void main(String[] args) {


		Rectangle rc = new Rectangle();

		rc.length = 10;
		rc.bredth = 5;
		rc.displayRectangleDetails();
		rc.calculateArea();
		rc.calculatePerimeter();
	}

}
