/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Yesenia Cata
 */

package ex34;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        //uses an array to create a list of the employee names
        ArrayList<String> employees = new ArrayList<String>(Arrays.asList("John Smith","Jackie Jackson","Chris Jones","Amanda Cullen","Jeremy Goodwin"));
        printEmployees(employees); //prints the employees

        Scanner sc = new Scanner(System.in); //scans user input

        System.out.println();
        System.out.println("Enter an employee name to remove: "); //asks user to input employee name
        String nameToRemove = sc.nextLine();

        employees.remove(nameToRemove);//removes the employee name from list

        System.out.println();
        printEmployees(employees);//print employees
    }


    public static void printEmployees(ArrayList<String> employees) {
        System.out.println("There are "+employees.size()+" employees: ");
        for(String emp:employees) {
            System.out.println(emp);
        }
    }
}