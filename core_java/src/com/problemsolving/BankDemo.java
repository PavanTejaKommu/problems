package com.problemsolving;

public class BankDemo {

    public static void main(String[] args) {

        BankAccount account;

        account = new SavingsAccount(101, "Rahul", 20000);

        System.out.println("===== Savings Account =====");

        account.displayDetails();

        System.out.println();

        account.deposit(5000);

        System.out.println();

        account.withdraw(10000);

        System.out.println();

        account.withdraw(14500);

        System.out.println("\n============================\n");

        account = new CurrentAccount(102, "Akhil", 20000);

        System.out.println("===== Current Account =====");

        account.displayDetails();

        System.out.println();

        account.deposit(5000);

        System.out.println();

        account.withdraw(25000);

        System.out.println();

        account.withdraw(5001);
    }
}