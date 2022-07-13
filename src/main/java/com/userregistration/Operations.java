package com.userregistration;

//import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Operations {
    public static boolean validFirstName(String fName) throws InvalidFirstNameException{
        /** System.out.println("Enter Your first name");
         String name = sc.next();*/
        //regex function is used to check the first name
        String regex = "^[A-Z]{1}[a-z]{2,}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(fName);
        boolean result = m.matches();
        // if condition is to check the first name is valid or not
        if (!m.matches()){
            throw new InvalidFirstNameException("first Name should start with a Cap and should have minimum 3 chars");
        }
        else
            return true;
    }
    /**
     * This method takes Last Name which starts with Capital letter and throws custom exception if not valid
     * @param lName is used for comparing with regex
     */
    public static boolean validLastName(String lName) throws InvalidLastNameException {
        /**
         System.out.println("Enter the Last name");
         String nameLast = sc.next();*/
        //regix function is used to check the last name
        String regex = "^[A-Z]{1}[a-z]{2,}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(lName);
        boolean result = m.matches();

        // if condition is to check the Last name is valid or not
        if (!m.matches()){
            throw new InvalidLastNameException("Last Name should start with a Cap and should have minimum 3 chars");
        }else
            return true;
    }
    // taking ValidEmailId method
    public static boolean validEmailId(String mailId) throws InvalidEmailIdException{
        /**
         System.out.println("Enter the Email-id : ");
         String mail_id=sc.nextLine();
         */
        //Expression for EmailId
        String rejex="^(?!.*@.*@)[a-z+_-]+(.[a-z0-9])*@[a-z0-9]+(.[a-z])*.[a-z]{2,}";
        //Creating pattern object
        Pattern P1=Pattern.compile(rejex);
        //Creating matcher object
        Matcher M1=P1.matcher(mailId);
        boolean result=M1.matches();
        //Checking whether entered Mail-id is valid or not
        if(!M1.matches()){
            throw new InvalidEmailIdException("enter a valid email address. ");
        }else
            return true;
    }
    /**
     * This method checks if the entered number is valid or not and throws custom exception if not valid
     * @param mobNo takes in the parameter as String representation of number
     * @return it returns a boolean value true if the number is valid
     */
    public static boolean validMobileNumber(String mobNo) throws InvalidMobileNumberException{
        /**
         System.out.println("Enter the Mobile number");
         String  mobileNumber = sc.next();
         */
        //regex function is used to check the Mobile number
        String regex = "^[0-9]{2}\\s[0-9]{10,}$";
        Pattern p1 = Pattern.compile(regex);
        Matcher m1 = p1.matcher(mobNo);
        boolean result = m1.matches();

        // if condition is to check the Mobile number is valid or not
        if (!m1.matches()){
            throw new InvalidMobileNumberException("Enter the Valid Mobile number with county code eg:- 91 8764314432");
        }else
            return true;
    }
    /**
     * Method to check if the password is valid or not and throws custom exception if not valid
     * @param passwrd takes in the passcode string as a parameter
     * @return returns boolean true if the password matches the requirement
     */
    public static boolean validPassword(String passwrd) throws InvalidPasswordException{
        /**
         System.out.println("Enter the Password at-least 1 Special Symbol :- ");
         String password = sc.next();
         */
        /**
         ^ represents starting character of the string.
         (?=.*[0-9]) represents a digit must occur at least once.
         (?=.*[a-z]) represents a lower case alphabet must occur at least once.
         (?=.*[A-Z]) represents an upper case alphabet that must occur at least once.
         (?=.*[@#$%^&-+=()] represents a special character that must occur at least once.
         (?=\\S+$) white spaces don’t allowed in the entire string.
         .{8,} represents at least 8 characters.
         $ represents the end of the string.
         */
        String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()])(?=\\S+$).{8,}$";
        Pattern p1 = Pattern.compile(regex);
        Matcher m1 = p1.matcher(passwrd);
        boolean result = m1.matches();
        // if condition is to check the password is valid or not
        if (!m1.matches()){
            throw new InvalidPasswordException("Password should Contain min 8 chars with at least: 1 capital letter, 1 numeric and 1 special character ");
        }else
            return true;
    }
}
