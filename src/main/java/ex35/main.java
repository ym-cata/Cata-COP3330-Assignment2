/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Yesenia Cata
 */

package ex35;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);//scans user input
        String name = null;
        ArrayList<String> nameList = new ArrayList<String>();//uses an array to list the names

        do {
            System.out.println("Enter a name:"); //asks user to enter a name
            name= input.nextLine();

            if(!name.isBlank() && !name.isEmpty())
                nameList.add(name);
        }while(!name.isBlank() && !name.isEmpty());


        Random random = new Random(); //generates a random reponse
        int randomIndex = random.nextInt(nameList.size());


        System.out.println("The winner is... "+nameList.get(randomIndex));
        //prints the winner from the random index
    }

}