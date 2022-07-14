package com.userregistration;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {
    //Creating object for operation class in main method
    Operations operations = new Operations();
    //test case for first name
    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        try {
            Assertions.assertTrue(operations.fNameValidate.validateFirstName("Santhosh"));
            System.out.println("First Name is valid");
        }catch (InvalidFirstNameException e){
            System.out.println("Invalid First Name " + e);
        }
    }
    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        try {
            Assertions.assertTrue(operations.lNameValidate.validateLastName(""));
            System.out.println("Last Name is valid");
        }catch (InvalidLastNameException e){
            System.out.println("Invalid last name " + e);
        }
    }
    @Test
    public void givenEmailId_WhenProper_ShouldReturnTrue() {
        try {
            Assertions.assertTrue(operations.emailIDValidate.validateEmailID("santhosh411kn@gmail.com"));
            System.out.println("Email Id is valid ");
        }catch (InvalidEmailIdException e){
            System.out.println("Invalid Email ID " + e);
        }
    }
    @Test
    public void givenMobileNumber_WhenProper_ShouldReturnTrue() {
        try {
            Assertions.assertTrue(operations.mobNumberValidate.validateMobNumber("91 970432974"));
            System.out.println("Mobile number is valid ");
        }catch (InvalidMobileNumberException e){
            System.out.println("Invalid Mobile Number" + e);
        }
    }
    @Test
    public void givenPassword_WhenProper_ShouldReturnTrue()  {
        try {
            Assertions.assertTrue(operations.passwordValidate.validatePassword("YamahaFS100@c"));
            System.out.println("Password is valid");
        }catch (InvalidPasswordException e){
            System.out.println("Invalid Password " + e);
        }
    }
}
