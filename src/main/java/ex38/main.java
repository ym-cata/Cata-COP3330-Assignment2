/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Yesenia Cata
 */

package ex38;
import java.util.*;

public class main
{
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in); //scans user input

        System.out.print("Enter a list of numbers, separated by spaces: "); //asks user to enter a list of numbers
        String data = in.nextLine();

        String list[] = data.split(" ");

        Integer evenList[] = filterEvenNumbers(list); //will return the array of even numbers

        System.out.print("The even numbers are "); //prints what the even numbers are
        for(int i=0; i<evenList.length; i++){
            if(i < evenList.length-1){ //uses for loop
                System.out.print(evenList[i] + " ");
            }
            else
            {
                System.out.print(evenList[i] + ".");
            }
        }
    }

    public static Integer[] filterEvenNumbers(String list[]) {

        // declare an empty array list of Integer
        ArrayList<Integer> newList = new ArrayList<>();


        for(int i=0; i<list.length; i++){

            // convert string number to integer number
            int num = Integer.parseInt(list[i]);

            // check if number is divisible by 2
            if(num % 2 == 0){

                newList.add(num);
            }
        }

        Integer[] arr = new Integer[newList.size()];
        arr = newList.toArray(arr);

        return arr;
    }
}
