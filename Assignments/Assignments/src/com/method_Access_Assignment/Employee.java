package com.method_Access_Assignment;

public class Employee {

	String empName ,empDesignation;
	int empid ;
	double empsal;
	public void setempname(String ename) {
		empName = ename;


	}

	public String getEmpName() {
		return empName;
	} 


	public void setEmpDesignation(String empDesignation) {
		this.empDesignation = empDesignation;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public void setEmpsal(double empsal) {
		this.empsal = empsal;
	}


	public String getEmpDesignation() {
		return empDesignation;
	}
	public int getEmpid() {
		return empid;
	}
		public double getEmpsal() {
			return empsal;
		}
		

	public static void main(String[] args) {



	}

}
