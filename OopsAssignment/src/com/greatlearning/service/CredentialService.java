package com.greatlearning.service;

import java.util.Random;

import com.greatlearning.model.Employee;

public class CredentialService {

	String capitaLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	String smallLetters = "abcdefghijklmnopqrstuvwxyz";
	String numbers = "0123456789";
	String specialCharacters = "!@#$%^&*_+=-/.?<>";
	
	String valuesSet = capitaLetters + smallLetters + numbers + specialCharacters;
	
	public char[] generatePassword(){
		
		Random random = new Random();
		
	    char [] password = new char[8];
	    
	    for (int i=0; i<8; i++) {
	    	
	    	password[i] = valuesSet.charAt(random.nextInt(valuesSet.length()));
	    	
	    }
	    
	    return password;
		
	}
	
	public String generateEmailAddress(String firstName, String lastName, String department) {
		
	    String email = firstName.toLowerCase()+lastName.toLowerCase()+"@"+department+".abc.com";
		
		return email;
		
	}
		
	public void showCredentials (Employee employee, String email , char[] generatePassword ) {
		
		System.out.println();
		System.out.println("Dear "+employee.firstName()+" "+employee.getlastName()+" your generated credentials are as follows");
		System.out.println("Email : "+email);
		System.out.print("Password : ");
		System.out.print(generatePassword);
		
	}
	
	
}
