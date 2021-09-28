/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Yesenia Cata
 */

package ex30;
public class main
{
    public static void main(String[] args)
    {
        for(int i=1;i<=12;i++) //uses for loop to generate table
        {
            for(int j=1;j<=12;j++)
            {
                System.out.print((i*j)+"\t"); //prints multiplication table
            }
            System.out.println();
        }
    }
}