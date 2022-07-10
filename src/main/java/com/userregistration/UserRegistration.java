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
            System.out.println("Press 1: Email Address Validation\n2. Exit");
            choose = sc.nextInt();
            switch (choose) {
                case 1:
                    operations.validEmailAddress();
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

/*
Should clear all email samples
Sample Emails to Test
A. Valid Emails
• 1. abc@yahoo.com,
• 2. abc-100@yahoo.com,
• 3. abc.100@yahoo.com
• 2. abc111@abc.com,
• 4. abc-100@abc.net,
• 5. abc.100@abc.com.au
• 6. abc@1.com,
• 7. abc@gmail.com.com
• 8. abc+100@gmail.com


B. Invalid Emails (TLD - Top Level Domains)
1. abc – must contains “@” symbol
2. abc@.com.my – tld can not start with dot “.”
3. abc123@gmail.a – “.a” is not a valid tld, last tld must contains at least two
characters
4. abc123@.com – tld can not start with dot “.”
5. abc123@.com.com – tld can not start with dot “.”
6. .abc@abc.com – email’s 1st character can not start with “.”
7. abc()*@gmail.com – email’s is only allow character, digit, underscore and dash
8. abc@%*.com – email’s tld is only allow character and digit
9. abc..2002@gmail.com – double dots “.” are not allow
10. abc.@gmail.com – email’s last character can not end with dot “.”
11. abc@abc@gmail.com – double “@” is not allow
12. abc@gmail.com.1a -email’s tld which has two characters can not contain digit
13. abc@gmail.com.aa.au - cannot have multiple email’s tld
*/

