package com.task.seven;

public class SubscriptionPlan {
	
	private String subscriberName;
	private String subscriberType;
	private int cost;
	private int paidAmount;
	private String subscriptionStatus;
	public SubscriptionPlan(String subscriberName, String subscriberType, int cost, int paidAmount,
			String subscriptionStatus) {
		
		this.subscriberName = subscriberName;
		this.subscriberType = subscriberType;
		this.cost = cost;
		this.paidAmount = paidAmount;
		this.subscriptionStatus = subscriptionStatus;
	}
	
	public void  updatePayment(int amount) {
		paidAmount += amount;
		System.out.println("Payement updated succesfully");
	}
	
	public void changeStatus(String updated) {
		subscriptionStatus = updated;
		System.out.println("Status updated succesfully");
		
	}
	
	public void viewSummary() {
		System.out.println("Subscriber Name : "+subscriberName);
		System.out.println("Subscriber Type : "+subscriberType);
		System.out.println("Cost : "+cost);
		System.out.println("Paid Amount : "+paidAmount);
		System.out.println("Sybscription Status : "+subscriptionStatus);
	}

}
