package com.problemsolving;

public class CurrentAccount extends BankAccount {

    private static final double OVERDRAFT_LIMIT = 5000;

    public CurrentAccount(int accountNumber, String accountHolderName, double balance) {
        super(accountNumber, accountHolderName, balance);
    }

    @Override
    public void withdraw(double amount) {

        if (amount > 0 && getBalance() - amount >= -OVERDRAFT_LIMIT) {

            setBalance(getBalance() - amount);

            System.out.println("Withdraw : " + amount);
            System.out.println("Balance  : " + getBalance());

        } else {

            System.out.println("Withdrawal denied");
            System.out.println("Overdraft limit of ₹5000 exceeded");
        }
    }
}