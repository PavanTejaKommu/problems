package com.abstraction;

import java.util.Random;
import java.util.Scanner;
import java.util.random.RandomGeneratorFactory;


abstract class Payment{
	public abstract	void processingPayment();
	public abstract	void validatetransaction();
	public abstract void generateTransactionID();
	public Payment() {
		super();
	}
}

class CreditCardPayment  extends Payment{

	String cardNumber;
	String expiryDate ;
	String  cvv;

	public CreditCardPayment(String cardNumber, String expiryDate, String cvv) {
		super();
		this.cardNumber = cardNumber;
		this.expiryDate = expiryDate;
		this.cvv = cvv;
	}

	@Override
	public void processingPayment() {
		System.out.println("Processing  Credit Card Payment ..");

	}

	@Override
	public void validatetransaction() {
		System.out.println("Validating card number, expiry, and CVV.");

	}

	@Override
	public void generateTransactionID() {

		Random r = new Random();
		int id = Math.abs(r.nextInt());
		System.out.println("Generated Transavtion id : "+id);

	}
}

class UPIPayment extends Payment{

	String upiID;
	String phoneNumber;

	public UPIPayment(String upiID, String phoneNumber) {
		super();
		this.upiID = upiID;
		this.phoneNumber = phoneNumber;
	}

	@Override
	public void processingPayment() {
		System.out.println("Processing UPI payment.");			
	}

	@Override
	public void validatetransaction() {
		System.out.println( "Validating UPI ID and phone number.");			
	}

	@Override
	public void generateTransactionID() {
		Random r = new Random();
		int id = Math.abs(r.nextInt());

		System.out.println("Generated transaction ID : "+id);			
	}
}


class PayPalPayment extends Payment{

	String email;
	String authToken;
	public PayPalPayment(String email, String authToken) {
		super();
		this.email = email;
		this.authToken = authToken;
	}
	@Override
	public void processingPayment() {
		System.out.println("Processing PayPal payment.");			
	}
	@Override
	public void validatetransaction() {
		System.out.println( "Validating email and authentication token.");			
	}
	@Override
	public void generateTransactionID() {

		Random r = new Random();
		int id = Math.abs(r.nextInt());
		System.out.println( "Generated transaction ID: "+id);			
	}
}

public class Example2 {

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);



		System.out.println("Choose Payment Option ");

		String str = sc.nextLine();
		String choice = str.toLowerCase();

		switch (choice) {
		case "creditcardpayment": {
			Payment c = new CreditCardPayment("1234567890123456", "12/25", "123");
c.processingPayment();
c.validatetransaction();
c.generateTransactionID();
			break;
		}
		case "upipayment":{
			Payment up = new UPIPayment("teja@upi", "1234567890");
			up.processingPayment();
			up.validatetransaction();
			up.generateTransactionID();
			break;
		}
		case "paypalpayment":{

			Payment p = new PayPalPayment("teja@gmail.com", "abc123");
			p.processingPayment();
			p.validatetransaction();
			p.generateTransactionID();
			break;
		}
		default:
			System.out.println("Invalid Input ");
		}
	}

}
