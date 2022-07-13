package com.userregistration;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {
    Operations operations = new Operations();
    // test case for first name
    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        try {
            Assertions.assertTrue(Operations.validFirstName("Santhosh"));
            System.out.println("Valid First Name.");
        }catch (InvalidFirstNameException e){
            System.out.println("Invalid First Name: " + e);
        }
    }
    //test case for Last name
    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        try {
            Assertions.assertTrue(Operations.validLastName("nayak"));
            System.out.println("Valid Last name");
        }catch (InvalidLastNameException e){
            System.out.println("Invalid Last Name: " + e);
        }
    }
    //test case for Email Id
    @Test
    public void givenEmailId_WhenProper_ShouldReturnTrue() {
        try {
            Assertions.assertTrue(Operations.validEmailId("santhosh123@gmail.com"));
            System.out.println("Valid Email Address.");
        }catch (InvalidEmailIdException e){
            System.out.println("Invalid Email ID: " + e);
        }
    }
    // test case for Mobile number
    @Test
    public void givenMobileNumber_WhenProper_ShouldReturnTrue() {
        try {
            Assertions.assertTrue(Operations.validMobileNumber("91 987654321"));
            System.out.println("Valid mobile Number.");
        }catch (InvalidMobileNumberException e){
            System.out.println("Invalid Mobile Number: " + e);
        }
    }
    // test case for Password
    @Test
    public void givenPassword_WhenProper_ShouldReturnTrue()  {
        try {
            Assertions.assertTrue(Operations.validPassword("Santhosh@kumar11"));
            System.out.println("Valid Password.");
        }catch (InvalidPasswordException e){
            System.out.println("Invalid Password: " + e);
        }
    }
}
