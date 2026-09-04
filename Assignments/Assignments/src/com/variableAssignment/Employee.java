package com.variableAssignment;

public class Employee {

	public static  String employeename = "Teja";
	public static int  emplotyeesalary = 35000;
	public int employeeAge = 25;
	public long employeePhoneNumber = 9876543210L;

	public static void main(String[] args) {

		Employee ed = new Employee();

		System.out.println( Employee.employeename);
		System.out.println(	Employee.emplotyeesalary);
		System.out.println(ed.employeeAge);
		System.out.println(ed.employeePhoneNumber);

		System.out.println();

		Employee ed2 = new Employee();
		System.out.println(ed2.employeename);
		System.out.println(ed2.emplotyeesalary);
		System.out.println(	ed2.employeeAge);
		System.out.println(ed2.employeePhoneNumber);
	}

}
