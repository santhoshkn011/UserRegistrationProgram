package com.userregistration;

public class InvalidMobileNumberException extends Exception {
    public InvalidMobileNumberException(String message) {
        super(message);
    }
}
