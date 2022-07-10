/*
As a User need to follow pre-defined Password rules.
Rule1
 – minimum 8

Rule2
– Should have at least 1 Upper Case

Rule3
– Should have at least 1 numeric number in the password

Rule4 – Has exactly 1 Special Character

Characters - NOTE – All rules must be passed
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
                    "\n3. Email Address validation.\n4. Mobile Number Validation\n5. Password Validation");
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
                case 4:
                    operations.validMobileNumber("91 9704329740");
                    break;
                case 5:
                    operations.validPassword();
                    break;
                default:
                    System.out.println("Invalid: Enter valid details.");
                    break;
            }
            System.out.println("If you want to continue press 1 or to exit press 6");
            select = sc.nextInt();
        } while (select != 6);
    }
}
