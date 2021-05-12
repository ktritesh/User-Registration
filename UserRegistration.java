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
	
	public static boolean isValidPasswordRule1(String password) {
		String regex = "^[a-zA-Z0-9]{8,}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(password);
        return m.matches();
	}
	
	public static boolean isValidPasswordRule2(String password) {
		String regex = "^(?=.*[A-Z])[a-zA-Z\\d]{8,}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(password);
        return m.matches();
	}
	
	public static boolean isValidPasswordRule3(String password) {
		String regex = "^(?=.*[A-Z])(?=.*?[0-9])[a-zA-Z\\d]{8,}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(password);
        return m.matches();
	}
	
	public static boolean isValidPasswordRule4(String password) {
		String regex = "^(?=.*?[A-Z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(password);
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
        System.out.println( emailId1 + " : " + isValidEmail(emailId1));
        
        String number1 = "+91 9919819801";
        System.out.println( number1 + " : " + isValidMobileNumber(number1));
        
        String number2 = "9919819801";
        System.out.println( number2 + " : " + isValidMobileNumber(number2));
        
        String pass1 = "abcdefgh";
        System.out.println( pass1 + " : " + isValidPasswordRule1(pass1));
        
        String pass2 = "ABcdefgh";
        System.out.println( pass2 + " : " + isValidPasswordRule2(pass2));
        
        String pass3 = "ABc1efgh";
        System.out.println( pass3 + " : " + isValidPasswordRule3(pass3));
        
        String pass4 = "ABc1ef#h";
        System.out.println( pass4 + " : " + isValidPasswordRule4(pass4));
        
        String emailId2 = "abc-100@yahoo.com";
        System.out.println( emailId2 + " : " + isValidEmail(emailId2));
        
        String emailId3 = "abc.100@yahoo.com";
        System.out.println( emailId3 + " : " + isValidEmail(emailId3));
        
        String emailId4 = "abc.111@abc.com";
        System.out.println( emailId4 + " : " + isValidEmail(emailId4));
        
        String emailId5 = "abc-100@abc.net";
        System.out.println( emailId5 + " : " + isValidEmail(emailId5));
        
        String emailId6 = "abc.100@abc.com.au";
        System.out.println( emailId6 + " : " + isValidEmail(emailId6));
        
        String emailId7 = "abc@1.com";
        System.out.println( emailId7 + " : " + isValidEmail(emailId7));
        
        String emailId8 = "abc@gmail.com.com";
        System.out.println( emailId8 + " : " + isValidEmail(emailId8));
        
        String emailId9 = "abc+100@gmail.com";
        System.out.println( emailId9 + " : " + isValidEmail(emailId9));

	}

}
