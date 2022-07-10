package com.userregistration;

import java.io.BufferedReader;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Operations {
    static Scanner sc = new Scanner(System.in);
    // taking ValidFirstName method
    public static boolean validFirstName() {
        System.out.print("Enter the first name: ");
        String name = sc.next();
        //regex method to check the first name(First letter is Cap and has min 3 characters)
        String regex = "^[A-Z]{1}[a-z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher match = pattern.matcher(name);
        boolean result = match.matches();
        // if condition is to check the first name is valid or not
        if (result) {
            System.out.println("Your First name is valid");
        }
        else {
            System.out.println("Your First name is invalid");
        }
        return result;
    }
    //method to check the last name
    public static boolean validLastName() {
        System.out.print("Enter the Last name: ");
        String nameLast = sc.next();
        //regex function is used to check the first name
        String regix = "^[A-Z]{1}[a-z]{2,}$";
        Pattern p = Pattern.compile(regix);
        Matcher m = p.matcher(nameLast);
        boolean result = m.matches();
        // if condition is to check the Last name is valid or not
        if (result)
            System.out.println("Your Last name is valid");
        else
            System.out.println("Your Last name is invalid");
        return result;
    }
    // Method to check email.
    public static boolean validEmailAddress(){
        System.out.print("Enter the Email Address:  ");
        String emailId = sc.next();
        /*
        E.g. abc.xyz@bl.co.in - Email has 3 mandatory parts (abc, bl & co) and 2 optional (xyz & in) with precise @ and . positions
        */
        String regex = "^[a-z]{3}[a-zA-z.]{0,}+@+bl.co+[a-z.]{0,}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(emailId);
        boolean result = m.matches();
        // if condition is to check the email address is valid or not
        if (result)
            System.out.println("Your Email Address is valid");
        else
            System.out.println("Your Email Address is invalid");
        return result;
    }
    // Method to check mobile number.
    public static boolean validMobileNumber(String mobNumber) {
        String regex = "^[0-9]{2}\\s{0,1}[0-9]{10,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(mobNumber);
        boolean result = matcher.matches();
        // if condition is to check the email address is valid or not
        if (result)
            System.out.println("Your Mobile Number is valid");
        else
            System.out.println("Your Mobile Number is invalid");
        return result;
    }
    // Method for the password validation
    public static boolean validPassword(){
        System.out.print("Enter the Password: ");
        String password = sc.next();
        String regex = "^(?=.*[A-z])(?=.*[0-9])([a-zA-Z0-9@._-]).{8,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        boolean result = matcher.matches();
        // if condition is to check the password is valid or not
        if (result)
            System.out.println("This is the valid password");
        else
            System.out.println("Your Password is invalid.");
        return result;
    }
}
