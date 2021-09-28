/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Yesenia Cata
 */
package ex37;

import java.util.*;

public class main {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in); //scans user input

        System.out.print("What's the minimum length? "); //asks user to enter a password length
        int size = Integer.parseInt(in.nextLine());

        System.out.print("How many special characters? "); //asks user to enter how many special characters
        int special = Integer.parseInt(in.nextLine());

        System.out.print("How many numbers? "); //asks user to enter number of numbers in password
        int numbers = Integer.parseInt(in.nextLine());


        System.out.println("Your password is " + generatePassword(size, special, numbers)); //generates a random password
        //prints password
    }

    public static String generatePassword(int length, int special, int nums)
    {
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz"; //determines string of letters

        String specialCharacters = "!@#$%^&*"; // determines string of characters

        String numbers = "1234567890"; // determines string of numbers

        Random random = new Random(); //uses random generator

        ArrayList<Character> chars = new ArrayList<>(); //uses an array to make a list


        for(int i=0; i<special; i++){ //runs loop for characters
            chars.add(specialCharacters.charAt(random.nextInt(specialCharacters.length())));
        }


        for(int i=0; i<nums; i++){ //runs loop for numbers
            chars.add(numbers.charAt(random.nextInt(numbers.length())));
        }


        for(int i=chars.size()-1; i<length; i++){ //runs loop for letters
            chars.add(letters.charAt(random.nextInt(letters.length())));
        }

        Collections.shuffle(chars);

        String password = "";

        for(Character s : chars)
        {
            password += Character.toString(s);
        }

        // return result String
        return password;
    }
}
