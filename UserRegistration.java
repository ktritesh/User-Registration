package com.bridgelabz.userregistrationproblem;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	
	public static boolean isValidFirstName(String firstname) {
		String regex = "^[A-Z][a-z]{2,}";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(firstname);
        return m.matches();
	}
	
	public static boolean isValidLastName(String lastname) {
		String regex = "^[A-Z][a-z]{2,}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(lastname);
        return m.matches();
	}
	
	public static boolean isValidEmail(String emailid) {
		String regex = "^[a-zA-Z][a-zA-Z0-9_\\-+]*[.]{0,1}[a-zA-Z0-9_\\-+]{1,}[@][a-zA-Z0-9]{1,}[.][a-zA-Z]{2,}[.]{0,}[a-zA-Z]*$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(emailid);
        return m.matches();
	}
	
	public static boolean isValidMobileNumber(String mobilenumber) {
		String regex = "^[+]{1}[0-9]{2}[ ][0-9]{10}";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(mobilenumber);
        return m.matches();
	}

	public static void main(String[] args) {
		
        String firstName1 = "Ritesh";
        System.out.println( firstName1 + " : " + isValidFirstName(firstName1));
        
        String firstName2 = "ritesh";
        System.out.println( firstName2 + " : " + isValidFirstName(firstName2));
        
        String lastName1 = "Tiwari";
        System.out.println( lastName1 + " : " + isValidLastName(lastName1));
        
        String lastName2 = "tiwari";
        System.out.println( lastName2 + " : " + isValidLastName(lastName2));
        
        String emailId1 = "abc.xyz@bl.co.in";
        System.out.println( emailId1 + " : " + isValidLastName(emailId1));
    
        String emailId2 = "123@bl.co.in";
        System.out.println( emailId2 + " : " + isValidEmail(emailId2));
    
        String number1 = "+91 9919819801";
        System.out.println( number1 + " : " + isValidMobileNumber(number1));
        
        String number2 = "9919819801";
        System.out.println( number2 + " : " + isValidMobileNumber(number2));

	}

}
