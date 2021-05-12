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

	public static void main(String[] args) {
		
        String firstName1 = "Ritesh";
        System.out.println( firstName1 + " : " + isValidFirstName(firstName1));
        
        String firstName2 = "ritesh";
        System.out.println( firstName2 + " : " + isValidFirstName(firstName2));
        
        String lastName1 = "Tiwari";
        System.out.println( lastName1 + " : " + isValidLastName(lastName1));
        
        String lastName2 = "tiwari";
        System.out.println( lastName2 + " : " + isValidLastName(lastName2));

	}

}
