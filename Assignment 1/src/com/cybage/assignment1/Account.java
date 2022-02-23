//Assignment #4
//Create account class with different types of constructors

package com.cybage.assignment1;

public class Account {
	private String name;
	
	public Account() {
		System.out.println("Default Constructor.");
		System.out.println(name);
	}
	
	public Account(String name) {
		System.out.println("Parametrized Constructor.");
		System.out.println(name);
	}
}


