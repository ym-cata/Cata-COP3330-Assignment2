/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Yesenia Cata
 */

package ex27;
import java.util.Scanner;
import java.util.regex.Pattern;

public class main {
    static String data = "";

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); //scans all user input

        System.out.print("Enter the first name: "); //asks user to input first name
        String firstName = input.nextLine();
        System.out.print("Enter the last name: "); //asks user to input last name
        String lastName = input.nextLine();
        System.out.print("Enter the ZIP code: "); //asks user to enter zip code
        String zip = input.nextLine();
        System.out.print("Enter the employee ID: "); //asks user to enter employee id
        String employeeID = input.nextLine();

        // calls all input
        validateInput(firstName, lastName, zip, employeeID);

    }

    // validates all fields
    public static void validateInput(String firstName, String lastName, String zip, String employeeID) {
        boolean first = validateFirstName(firstName);
        boolean last = validateLastName(lastName);
        boolean idFlag = validateEmployeeID(employeeID);
        boolean zipFlag = validateZipCode(zip);
        if (first && last && zipFlag && idFlag) {
            data = "There were no errors found.";
        }
        System.out.println(data);
    }

    // validation for the first name
    public static boolean validateFirstName(String firstName) {
        boolean status = true;
        // check length of first name be at least 2 characters
        if (firstName.length() < 2) {
            data = data + "The first name must be at least 2 characters long.\n"; //uses if statement to determine what would print based on what the user inputs
            status = false;
        }
        if (firstName.length() == 0) {
            data = data + "The first name must be filled in.\n";
            status = false;
        }
        return status;
    }

    //validation for the last name
    public static boolean validateLastName(String lastName) {
        boolean status = true;
        // check length of first name be at least 2 characters
        if (lastName.length() < 2) {
            data = data + "The last name must be at least 2 characters long.\n";
            status = false;
        }
        if (lastName.length() == 0) {
            System.out.println("The last name must be filled in.");
            status = false;
        }
        return status;
    }

    // validation for zip code
    public static boolean validateZipCode(String zip) {
        boolean status = true;
        try {
            int number = Integer.parseInt(zip);
            if (zip.length() != 5) { //uses if statement
                data = data + "The zipcode must be a 5 digit number.\n";
                status = false;
            }
        } catch (Exception e) {
            data = data + "The zipcode must be a 5 digit number.\n";
            status = false;
        }
        return status;
    }

    // validation for employee id
    public static boolean validateEmployeeID(String employeeID) {
        String pattern = "[a-zA-Z]{2}[-]{1}[0-9]{4}"; //identifies the pattern of the ID
        if (!Pattern.matches(pattern, employeeID)) {
            data = data + "The employee ID must be in the format of AA-1234.\n";
            return false;
        }
        return true;
    }

}