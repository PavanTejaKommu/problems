package com.taskOne;

public class Servicevehicle  extends Vehicle{
	
	String serviceCenterName;
	String serviceCategory;
	public Servicevehicle(String ownerName, String vehicleNumber, String vehicleType, String serviceCenterName,
			String seviceCategory) {
		super(ownerName, vehicleNumber, vehicleType);
		this.serviceCenterName = serviceCenterName;
		this.serviceCategory = seviceCategory;
		System.out.println("Vehicle Profile has been created ");
		
	}
	
	
	public void updateSErviceCategory(String updated) {
		
		if(updated.equals(serviceCategory)  ||  updated.isBlank()) {
			System.err.println("Please enter a valid details ");
		}else {
		this.serviceCategory = updated;
		System.out.println("Updated service category is : "+serviceCategory);
	}
	}
	
	
	public void updateserviceCenterName(String updated) {
		if(updated.equals(serviceCenterName)  || updated.isBlank()) {
			System.err.println("Please enter a valid details ");
		}else {
		this.serviceCenterName = updated ;
		System.out.println("Service Center Name Updated Succesfully ");
		System.out.println("Updated Service Center Name : "+serviceCenterName);
		
	}
	}
	
	public void display() {
		super.vehicleDetails();
		System.out.println("Service Center Name : "+serviceCenterName);
		System.out.println("Service Category : "+serviceCategory);
	}
	

}
