package com.task.six;

public class DepartmentStaff  extends Staff{
	
	String departmentName;
	String responsibilityLevel;
	public DepartmentStaff(String staffname, int staffID, String shift, String departmentName,
			String responsibilityLevel) {
		super(staffname, staffID, shift);
		this.departmentName = departmentName;
		this.responsibilityLevel = responsibilityLevel;
		
		System.out.println("Details added succesfully");
	}
	
	
	public void updateResponsibility(String update) {
		responsibilityLevel = update;
		System.out.println("Updated  Responsibility Level");
		
		
	}
	
	
	public void updateDepartment(String updated) {
		
		departmentName = updated;
		System.out.println("Department Name Updated ");
		
	}
	
	public void viewProfile() {
		
		System.out.println("*** Staff Details ***");
		System.out.println("Employee Name "+staffName);
		System.out.println("Employee ID : "+staffID);
		System.out.println("Shift : "+shift);
		System.out.println("Department Name : "+departmentName);
		System.out.println("Responsibility Level : "+responsibilityLevel);
		
		
		
	}
	
	
	
	

}
