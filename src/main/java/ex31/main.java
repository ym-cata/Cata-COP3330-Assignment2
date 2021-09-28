/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Yesenia Cata
 */

package ex31;

import java.util.*;
import java.lang.*;
import java.io.*;


public class main
{
    public static void main (String[] args) throws java.lang.Exception
    {

        int restingHR,age;
        Scanner sc=new Scanner(System.in); //scans user input
        restingHR = sc.nextInt(); //asks user restingHR
        age = sc.nextInt(); //asks user age

        System.out.println("Resting Pulse: " + restingHR + " Age: " + age); //prints based on the user input

        int intensity = 55;
        System.out.println("Intensity | Rate "); //prints the intensity and the rate
        System.out.println("------------------------");

        while(intensity<96){
            int Target = (((220 - age) - restingHR) * intensity) + restingHR; //uses formula to target HR
            System.out.println(intensity+"% | "+Target +"bpm");
            intensity+=5;
        }
    }
}