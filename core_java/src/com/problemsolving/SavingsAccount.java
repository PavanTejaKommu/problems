package com.problemsolving;

public class SavingsAccount extends BankAccount {

    private static final double MINIMUM_BALANCE = 1000;

    public SavingsAccount(int accountNumber, String accountHolderName, double balance) {
        super(accountNumber, accountHolderName, balance);
    }

    @Override
    public void withdraw(double amount) {

        if (amount > 0 && getBalance() - amount >= MINIMUM_BALANCE) {

            setBalance(getBalance() - amount);

            System.out.println("Withdraw : " + amount);
            System.out.println("Balance  : " + getBalance());

        } else {

            System.out.println("Withdrawal denied");
            System.out.println("Minimum balance of ₹1000 must be maintained");
        }
    }
}