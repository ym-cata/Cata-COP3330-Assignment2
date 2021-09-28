/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Yesenia Cata
 */
package ex29;
import java.util.*;


public class main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in); //scans user input
        boolean flag=false;
        while(true)
        {
            try
            {
                System.out.print("What is the rate of return? "); //ask user to enter interest rate
                int r=Integer.parseInt(sc.next());
                System.out.println("It will take "+(72/r)+" years to double your initial investment.");
                flag=true; //uses formula to calculate rate investment
            }
            catch(NumberFormatException e) //uses catch function to determine invalid response
            {
                System.out.println("Sorry. That's not a valid input"); //prints error message
            }
            catch(ArithmeticException e)
            {
                System.out.println("Sorry. That's not a valid input");
            }
            if(flag)
            {
                break;
            }

        }
    }
}