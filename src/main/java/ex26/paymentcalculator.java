/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Yesenia Cata
 */

package ex26;

import java.util.Scanner;

public class paymentcalculator {
    public static int calculateMonthsUntilPaidOff(double balance, double apr, double payment) { //returns the number of months
        apr = apr / 365;
        return (int) Math.ceil((-1 / 30.0) * Math.log(1 + balance / payment * (1 - Math.pow(1 + apr, 30))) / Math.log(1 + apr));
        //uses a formula to determine how long it will take to pay off a credit card balance

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); //scans user input
        double balance, apr, payment;

        System.out.print("What is your balance? "); //asks user to enter the balance
        balance = scanner.nextDouble();

        System.out.print("What is the APR on the card (as a percent)? "); //asks user the APR on the card
        apr = scanner.nextDouble();
        apr = apr / 100; //calculates the APR

        System.out.print("What is the monthly payment you can make? "); //asks user the monthly payment
        payment = scanner.nextDouble();

        int months = calculateMonthsUntilPaidOff(balance, apr, payment);
        System.out.println("It will take " + months + " months to pay off this card."); //prints after users input
    }
}