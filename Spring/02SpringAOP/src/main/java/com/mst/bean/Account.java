package com.mst.bean;

import org.springframework.stereotype.Component;

//@Component
public class Account {
	private String accountNumber ;
	private double balance;
	
	public Account(String accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
    
    public void deposit( double amount) throws Exception
    {
    	if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
            throw new Exception("MST Error");
        }
    }
    
    public void withdraw(double amount)
    {
    	if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid withdraw amount");
        }
    }
}
