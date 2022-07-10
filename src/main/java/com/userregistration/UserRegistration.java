/*
As a User need to enter a valid Last Name
- Last name starts with Cap and has minimum 3 characters
 */
package com.userregistration;
import java.util.Scanner;

public class UserRegistration {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Welcome to User Registration problems.");
        //creating object for Operation class
        Operations operations = new Operations();
        int choose;
        int select;
        do {
            System.out.println("Please Select the Options:\n1. Validation of First Name\n2. Validation of Last Name");
            choose = sc.nextInt();
            switch (choose) {
                case 1:
                    operations.validFirstName();
                    break;
                case 2:
                    operations.validLastName();
                    break;
                default:
                    System.out.println("Invalid: Enter valid details.");
                    break;
            }
            System.out.println("If you want to continue press 1 or to exit press 3");
            select = sc.nextInt();
        } while (select != 3);
    }
}
