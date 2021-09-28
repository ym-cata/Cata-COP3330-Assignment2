/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Yesenia Cata
 */

package ex40;

import java.util.Date;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Record[] records = { //makes a list of the employee data
                new Record("John", "Johnson", "Manager", new Date(2016, 12, 31)),
                new Record("Tou", "Xiong", "Software Engineer", new Date(2016, 10, 5)),
                new Record("Michaela", "Michaelson", "District Manager", new Date(2015, 12, 19)),
                new Record("Jake", "Jacobson", "Programmer", null),
                new Record("Jacquelyn", "Jockson", "DBA", null),
                new Record("Sally", "Webber", "Web Developer", new Date(2015, 12, 18))
        };
        Scanner sc = new Scanner(System.in); //scans user input
        System.out.print("Enter a search string: "); //asks user to enter a string to search the table
        String target = sc.nextLine();
        System.out.println("\nResults:\n");
        System.out.printf("%-20s | %-20s | %-20s\n", "Name", "Position", "Seperation Date");
        System.out.printf("%-21s|%-22s|%-21s\n", "-".repeat(21), "-".repeat(22), "-".repeat(21));
        for(Record record : records) { //uses for function
            String temp;
            if(record.seperationDate == null) temp = "";
            else  temp = record.seperationDate.toString();
            if(record.firstName.contains(target) || record.lastName.contains(target))
                System.out.printf("%-20s | %-20s | %-20s\n",  record.firstName + " " +
                        record.lastName, record.position, temp);
        }
        sc.close();
    }
}
class Record {
    String firstName;
    String lastName;
    String position;
    Date seperationDate;
    public Record(String firstName, String lastName,
                  String position, Date seperationDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.seperationDate = seperationDate;
    }
}