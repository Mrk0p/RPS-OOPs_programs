package com.bridgelabz.oops_programs;

import java.util.Scanner;

public class BankAccount {
    static Scanner scanner = new Scanner(System.in);
    private double balance;

    public BankAccount(double balance) {
        super();
        this.balance = balance;
    }
    public void debit(double balance) {
        System.out.println("Enter the amount to withdraw .");
        double withdraw = scanner.nextDouble();

        if ( withdraw <= balance && withdraw>0 ) {
            double finalBalance = balance - withdraw;
            System.out.println("Final balance is :"+ finalBalance);
        }
        else if ( withdraw < 0 ) {
            System.out.println("Invalid amount ");
        }
        else {
            System.out.println("Insufficient balance ");
        }
    }

    public static void main(String[] args) {

        System.out.println("Enter the amount in the account ");

        BankAccount account = new BankAccount(scanner.nextDouble());
        account.debit(account.balance);
    }
}
