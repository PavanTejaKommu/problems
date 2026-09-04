package com.task.two;

public class InsurancePolicy {

	String customerName;
	String policyType ;
	double policyAmount;
	double approvedAmount;
	String policyStatus;


	public InsurancePolicy(String name , String policyType ) {
		this.customerName = name;
		this.policyType = policyType;

	}


	public InsurancePolicy (String name , String type , double policyAmount) {
		this.customerName = name;
		this.policyType= type;
		this.policyAmount = policyAmount;
	}

	public InsurancePolicy(String customerName , String policyType , double policyAmount , 
			double approvedAmount , String policyStatus) {
		this.customerName = customerName;
		this.policyType = policyType;
		this.policyAmount = policyAmount;
		this.approvedAmount = approvedAmount;
		this.policyStatus = policyStatus;

	}


	public void  changePolicyStatus(String policyStatus) {
		this.policyStatus = policyStatus;
		System.out.println("Policy Status Updated succesfully ");
		System.out.println();
		System.out.println("Current Policy status : "+policyStatus);

	}


	public void updateApprovedAmount(double amount) {
		if(amount !=0 && amount > 0) {
		this.approvedAmount = amount;

		System.out.println("Amount updated succesfully ");
		System.out.println("Current approved Amount : "+approvedAmount);
		}else {
			System.err.println("Enter amount above 0 ");
		}
	}

	public void ViewPolicySummary() {
		System.out.println("Customer Name : "+customerName);
		System.out.println("Policy Type : "+policyType);
		System.out.println("Policy Amount : "+policyAmount);
		System.out.println("Approved Amount : "+approvedAmount);
		System.out.println("Policy Status : "+policyStatus);
	}


}
