package com.student;

public class StudentResult {

	String studentName ;
	int studentID;
	String course;
	double totalMarks;
	int subCount=1;

	public StudentResult (String studentName ,
			int studentID,
			String course,
			double totalMarks) {


		this.studentName = studentName;
		this.studentID = studentID;
		this.course = course;
		this.totalMarks = totalMarks;
		System.out.println("Student Record Created Successfully");

	}


	public void  addMarks(double marks) {
		if(marks<=0) {
			System.out.println("Inavlid input ");
		}else {
			subCount++;


			totalMarks = totalMarks + marks;

			System.out.println("Updated Total Marks : " + totalMarks);
		}

	}

	public void calculateGrade() {
		double avg = totalMarks/subCount;

		if(avg <= 100 && avg >=90 ) {
			System.out.println("Total marks : "+totalMarks);
			System.out.println("Grade A ");

		}else if(avg <= 89 && avg>=80) {
			System.out.println("Total marks : "+totalMarks);
			System.out.println("Grade B ");

		}else if(avg<= 79 && avg>=70) {
			System.out.println("Total marks : "+totalMarks);
			System.out.println("Grade C ");

		}else if(avg <= 69 && avg>=60) {
			System.out.println("Total marks : "+totalMarks);
			System.out.println("Grade D ");

		}else if(avg<60 && avg>=0) {
			System.out.println("Total marks : "+totalMarks);
			System.err.println("Failed ");
		}else {
			System.err.println("please enter valid marks ");
		}



	}

	public void viewTotal() {
		System.out.println("Total Marks : "+totalMarks);
	}

}
