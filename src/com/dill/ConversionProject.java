package com.dill;

import java.io.Console;
import java.util.Scanner;

public class ConversionProject {
    public static void main(String[] args) {
    	
    	Scanner in;
    	in = new Scanner(System.in);
    	if (in == null) { 
            System.out.println( 
                "No Scanner available"); 
            return; 
        }
    	System.out.print("Write text to convert: ");
    	String str = in.nextLine();
    	if(str.isEmpty()) {
    		System.out.println( 
                    "No text"); 
                return; 
    	}
    	System.out.print(convert(str));
    }
    
    private static String convert(String value) {
    	String result = "";
    	Integer len = value.length();
    	for (int i = 0; i < len; i++) {
    	    char currentChar = value.charAt(i);
    	    if(Character.isLowerCase(currentChar)) {
    	    	result+=Character.toUpperCase(currentChar);
    	    }else {
    	    	result+=Character.toLowerCase(currentChar);
    	    }
    	}
    	return result;
    }
}