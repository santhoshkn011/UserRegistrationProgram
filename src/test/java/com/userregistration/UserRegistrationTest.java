package com.userregistration;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {
    Operations operations = new Operations();
    //Happy test case for first name
    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        boolean result = operations.validFirstName("Santhosh");
        //System.out.println(result);
        Assertions.assertTrue(result);
    }
    //Sad test case for First name
    @Test
    public void givenFirstName_WhenProper_ShouldReturnFalse() {
        boolean result = operations.validFirstName("santhosh");
        System.out.println(result);
        Assertions.assertFalse(result);
    }
    //Happy True test case for Last name
    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        boolean result = operations.validLastName("Nayak");
        //System.out.println(result);
        Assertions.assertTrue(result);
    }
    //Sad test case for Last name
    @Test
    public void givenLastName_WhenProper_ShouldReturnFalse() {
        boolean result = operations.validLastName("nayak4");
        //System.out.println(result);
        Assertions.assertFalse(result);
    }
    // Happy test case for Email Address
    @Test
    public void givenEmailId_WhenProper_ShouldReturnTrue() {
        boolean result = operations.validEmailAddress("santhosh1234@gmail.com");
        //System.out.println(result);
        Assertions.assertTrue(result);
    }
    //Sad test case for Email Address
    @Test
    public void givenEmailId_WhenProper_ShouldReturnFalse() {
        boolean result = operations.validEmailAddress("#santhosh@.gmail.com");
        //System.out.println(result);
        Assertions.assertFalse(result);
    }
    // Happy test case for Mobile number
    @Test
    public void givenMobileNumber_WhenProper_ShouldReturnTrue() {
        boolean result = operations.validMobileNumber("91 9704329740");
        //System.out.println(result);
        Assertions.assertTrue(result);
    }
    //Sad test case for Mobile Number
    @Test
    public void givenMobileNumber_WhenProper_ShouldReturnFalse() {
        boolean result = operations.validMobileNumber("91 9704328");
        //System.out.println(result);
        Assertions.assertFalse(result);
    }
    // Happy test case for Password
    @Test
    public void givenPassword_WhenProper_ShouldReturnTrue() {
        boolean result = operations.validPassword("Santhosh411@nayak");
        //System.out.println(result);
        Assertions.assertTrue(result);
    }
    //Sad test case for Password
    @Test
    public void givenPassword_WhenProper_ShouldReturnFalse() {
        boolean result = operations.validPassword("4asjuidj");
        //System.out.println(result);
        Assertions.assertFalse(result);
    }
}
