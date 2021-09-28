/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Yesenia Cata
 */
package ex33;

import java.util.Random;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        //uses array to store outputs
        String[] responses = {"Yes","No","Maybe","Ask again later"};

        Random random = new Random(); //uses a random generator


        Scanner sc = new Scanner(System.in); //scans user input


        System.out.println("What's your question?"); //asks user to input a question
        String question = sc.nextLine();


        int randomResponseIndex = random.nextInt(responses.length);
        //outputs a random response
        String response = responses[randomResponseIndex];

        System.out.println();
        System.out.println(response);//prints the response
        System.out.println();
    }
}