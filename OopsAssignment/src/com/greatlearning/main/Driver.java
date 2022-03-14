package com.greatlearning.main;

import java.util.Scanner;

import com.greatlearning.model.Employee;

import com.greatlearning.service.CredentialService;

public class Driver {
	
	public static void main (String [] args) {
		
		String department , email;
		
		char [] password;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter the department from the following \n 1. Technical \n 2. Admin \n 3. Human Resource \n 4. Legal");
		
		int dept = sc.nextInt();
		
		System.out.println("Please enter your First Name : ");
		
		String firstName = sc.next();
		
        System.out.println("Please enter your Last Name : ");
		
		String LastName = sc.next();
		
		Employee employee = new Employee (firstName , LastName);
		
		CredentialService cs = new CredentialService();
		
		switch(dept) {
		
		case 1 : department = "tech";
		         email = cs.generateEmailAddress(firstName,LastName,department);
		         password = cs.generatePassword();
		         cs.showCredentials(employee , email , password);
		         break;
		         
		case 2 : department = "admin";
		         email = cs.generateEmailAddress(firstName,LastName,department);
		         password = cs.generatePassword();
		         cs.showCredentials(employee , email , password);
                 break;
                 
		case 3 : department = "hr";
                 email = cs.generateEmailAddress(firstName,LastName,department);
                 password = cs.generatePassword();
                 cs.showCredentials(employee , email , password);
                 break;
        
		case 4 : department = "legal";
                 email = cs.generateEmailAddress(firstName,LastName,department);
                 password = cs.generatePassword();
                 cs.showCredentials(employee , email , password);
                 break;
                 
       default : System.out.println(" Invalid Option ");
                 break;
                 
		}
		
		sc.close();
	}
	

}
