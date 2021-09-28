/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Yesenia Cata
 */
package ex39;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class main
{
    public static void main(String[] args)
    {
        Employee[] employees = { //determines the employee names and identifiers
                new Employee("John","Johnson","Manager",20161231),
                new Employee("Tou","Xiong","Software Engineer",20161005),
                new Employee("Michaela", "Michaelson", "District Manager", 20151219),
                new Employee("Jake","Jacobson","Programmer",00000000),
                new Employee("Jackquelyn", "Jackson", "DBA",00000000),
                new Employee("Sally","Webber","Web Developer",20151218)
        };

        List<Employee> list = Arrays.asList(employees); //uses an array to make a list of employees

        System.out.println("Complete Employee list:"); //prints out all employee names
        list.stream().forEach(System.out::println);

        Function<Employee, String> byFirstName = Employee::getFirstName; //gets first and last name
        Function<Employee, String> byLastName = Employee::getLastName;

        Comparator<Employee> lastThenFirst =
                Comparator.comparing(byLastName).thenComparing(byFirstName);

        System.out.printf(
                "%nEmployees in ascending order by last name then first:%n");
        list.stream()
                .sorted(lastThenFirst)
                .forEach(System.out::println);
    }
}
class Employee
{
    private String firstName;
    private String lastName;

    private String department;
    private double separationDate;

    public Employee(String firstName, String lastName,
                    String department,double separationDate)
    {
        this.firstName = firstName;
        this.lastName = lastName;

        this.department = department;
        this.separationDate=separationDate;
    }

    // sets firstName
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    // gets firstName
    public String getFirstName()
    {
        return firstName;
    }

    // sets lastName
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    // gets lastName
    public String getLastName()
    {
        return lastName;
    }


    // sets department
    public void setDepartment(String department)
    {
        this.department = department;
    }

    // gets department
    public String getDepartment()
    {
        return department;
    }

    public void setseparationDate(double separationDate)
    {
        this.separationDate = separationDate;
    }

    // gets salary
    public double getseparationDate()
    {
        return separationDate;
    }

    public String getName()
    {
        return String.format("%s %s", getFirstName(), getLastName());
    }

    public String toString()
    {
        return String.format("%-8s %-8s %s %8.0f",
                getFirstName(), getLastName(), getDepartment(),getseparationDate());
    }
}