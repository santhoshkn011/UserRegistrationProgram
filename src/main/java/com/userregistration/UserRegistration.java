/*
As a User need to
enter a valid First
Name
- First name starts with Cap and has
minimum 3 characters
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
            System.out.println("Press 1 to Check the first name is valid or not");
            choose = sc.nextInt();
            switch (choose) {
                case 1:
                    operations.validFirstName();
                    break;
                default:
                    System.out.println("Invalid: Enter valid details.");
                    break;
            }
            System.out.println("If you want to continue press 1 or to exit press 2");
            select = sc.nextInt();
        } while (select != 2);
    }
}
