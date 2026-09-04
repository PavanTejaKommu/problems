package com.saticandInstanceMethods;

public class Students {

	public static  String collageName ="NMREC";
	public String studentName = "Teja";
	public int studentId = 1111;

	public static void collegeInfo() {
		System.out.println("Collage Name :" + collageName);

	}
	public void studentInfo() {
		System.out.println("Student Name :" +studentName);
		System.out.println("Student Id   :"+studentId);

	}

	public static void main(String[] args) {

		Students st = new Students();
		st.collegeInfo();
		st.studentInfo();
	}

}
