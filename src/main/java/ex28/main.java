/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Yesenia Cata
 */
package ex28;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int total = 0;
        for (int i = 0; i < 5; i++) { //uses a loop to stop after 5 inputs
            System.out.print("Enter a number: ");
            total += in.nextInt(); //adds total of inputs
        }
        System.out.println("The total is " + total + "."); //prints out the inputs
    }
}
