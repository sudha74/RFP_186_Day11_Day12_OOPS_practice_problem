package com.bridgelabz.stock_account_management;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Account account1=new Account(50.00);
        System.out.println("Account Balance:"+ account1.getBalance());
        System.out.println("Enter Credit for adding amount Or debit for Withdrawl");
        Scanner scanner=new Scanner(System.in);
        while (true){
            String choice=scanner.next();
            switch (choice){

                case "Credit":
                    System.out.println("Enter credit Amount for account1");
                    double depositAmount;
                    depositAmount=scanner.nextDouble();
                    account1.credit(depositAmount);
                   
            }
        }

    }
}
