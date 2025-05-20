package org.example.week_3.medium;

public class BankAccount {
    private String accountNumber;
    private int balance;

    public BankAccount(String accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount){
        balance += amount;
        System.out.println("You received " + amount + " tenge. \nYour balance is " + balance + " tenge");
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("You spend " + amount + " tenge. \nYour balance is " + balance + " tenge");
        }
        else {
            System.out.println("Not enough money on balance, action denied. \nYour balance is " + balance + " tenge");
        }
    }

    public int getBalance() {
        return balance;
    }
}
