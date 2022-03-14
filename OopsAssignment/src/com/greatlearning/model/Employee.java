package com.greatlearning.model;

public class Employee {

	String firstName, lastName;
	
	public String firstName() {
		
		return firstName;
		
	}
	
    public String getlastName() {
		
    	return lastName;
		
	}
	
	public Employee(String firstName,String lastName) {
		
		this.firstName = firstName;
		
		this.lastName = lastName;
	}
}
