package com.userregistration;

//import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Operations {
    //Taking user input
    //static Scanner sc = new Scanner(System.in);
    // taking ValidFirstName method
    // taking fname is the first name
    public static boolean validFirstName(String fName) {
        /** System.out.println("Enter Your first name");
         String name = sc.next();*/
        //regix function is used to check the first name
        String regex = "^[A-Z]{1}[a-z]{2,}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(fName);
        boolean result = m.matches();
        // if condition is to check the first name is valid or not
        /**
         if (result)
         System.out.println("Your First name is valid");
         else
         System.out.println("Your First name is invalid");
         */
        return result;
    }
    // taking ValidLastName method
    public static boolean validLastName(String lName) {
        /**
         System.out.println("Enter the Last name");
         String nameLast = sc.next();*/
        //regix function is used to check the first name
        String regex = "^[A-Z]{1}[a-z]{2,}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(lName);
        boolean result = m.matches();
        /**
         // if condition is to check the Last name is valid or not
         if (result)
         System.out.println("Your Last name is valid");
         else
         System.out.println("Your Last name is invalid");
         */
        return result;
    }
    // taking ValidEmailId method
    public static boolean validEmailAddress(String emailAddress){
        /**
         System.out.println("Enter the Email-id : ");
         String mail_id=sc.nextLine();
         */
        //Expression for EmailId
        String rejex="^(?!.*@.*@)[a-z+_-]+(.[a-z0-9])*@[a-z0-9]+(.[a-z])*.[a-z]{2,}$";
        //Creating pattern object
        Pattern P1 = Pattern.compile(rejex);
        //Creating matcher object
        Matcher M1 = P1.matcher(emailAddress);
        boolean result = M1.matches();
        //Checking whether entered Mail-id is valid or not
        /**
         if(result)
         System.out.println("Entered EmailId is Valid");
         else
         System.out.println("Entered EmailId is Invalid");
         */
        return result;
    }
    // Taking validMobileNumber Method
    public static boolean validMobileNumber(String mobNo){
        /**
         System.out.println("Enter the Mobile number");
         String  mobileNumber = sc.next();
         */
        //regix function is used to check the Mobile number
        String regex = "^[0-9]{2}\\s{0,1}[0-9]{10,}$";
        Pattern p1 = Pattern.compile(regex);
        Matcher m1 = p1.matcher(mobNo);
        boolean result = m1.matches();
        /**
         // if condition is to check the LMobile number is valid or not
         if (result)
         System.out.println("Your Mobile number is valid");
         else
         System.out.println("Your Mobile number is invalid");
         */
        return result;
    }
    // taking ValidPassword method
    public static boolean validPassword(String passwrd){
        /**
         System.out.println("Enter the Password atleast 1 Special Symbol4 :- ");
         String password = sc.next();
         */
        /**
         * (?=.*[A-Z]) represents an upper case character that must occur at least once.
         * (?=.*[0-9]) represents a digit must occur at least once.
         * (?+.*[@#$%^&*()-+=] represent the special symbol at least once.
         * (?=.*[a-zA-z0-9]) represents a lower case character or number  must occur at least once.
         * {8,} represents at least 8 or more characters.
         */
        String regex = "^(?=.*[A-z])(?=.*[0-9])(?=.*[@#$%^&*()-+=])([a-zA-Z0-9@._-]).{8,}$";
        Pattern p1 = Pattern.compile(regex);
        Matcher m1 = p1.matcher(passwrd);
        boolean result = m1.matches();
        /**
         // if condition is to check the password is valid or not
         if (result)
         System.out.println("Your Password is valid");
         else
         System.out.println("Your Password is invalid should have at-least 1 special character");
         */
        return result;
    }
}
