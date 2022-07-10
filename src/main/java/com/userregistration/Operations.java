package com.userregistration;

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
}
