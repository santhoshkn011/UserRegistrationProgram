/*
As a User need to enter a valid email - E.g. abc.xyz@bl.co.in - Email has 3 mandatory parts (abc, bl & co) and 2 optional (xyz & in) with
precise @ and . positions
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
            System.out.println("Please Select the Options:\n1. Validation of First Name\n2. Validation of Last Name" +
                    "\n3. Email Address validation.");
            choose = sc.nextInt();
            switch (choose) {
                case 1:
                    operations.validFirstName();
                    break;
                case 2:
                    operations.validLastName();
                    break;
                case 3:
                    operations.validEmailAddress();
                    break;
                default:
                    System.out.println("Invalid: Enter valid details.");
                    break;
            }
            System.out.println("If you want to continue press 1 or to exit press 4");
            select = sc.nextInt();
        } while (select != 4);
    }
}
