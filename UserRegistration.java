package com.bridgelabz.userregistrationproblem;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	
	public static boolean isValidFirstName(String firstname) {
		
		String regex = "^[A-Z][a-z]{2,}";
		
        Pattern p = Pattern.compile(regex);
        
        if (firstname == null) {
            return false;
        }
        
        Matcher m = p.matcher(firstname);
        return m.matches();
	}

	public static void main(String[] args) {
		
		// Test Case 
        String name1 = "Ritesh";
        System.out.println( name1 + " : " + isValidFirstName(name1));
        
		// Test Case 
        String name2 = "ritesh";
        System.out.println( name2 + " : " + isValidFirstName(name2));

	}

}
