package com.bridgelabz.stock_account_management;

import java.util.Scanner;

public class Account {
    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
   public void credit(double amount){
        balance=balance+amount;

   }

   public void debit(double amount){
        balance=balance-amount;

   }
}
