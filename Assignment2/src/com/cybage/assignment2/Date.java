//Write a class Date.  Overload constructor to initialize attributes.
//Create Date objects using non-parameterized & parameterized constructors both.
//Print values of day, month & year for every object.

package com.cybage.assignment2;

public class Date {
	int day;
	int month;
	int year;
	
	Date(int day, int month){
		this.day=day;
		this.month= month;
	}
	
	Date(int year){
		this(8,03);
		this.year=year;
	}
	public Date() {
		
	}

	void display() {
		System.out.println("Date:");
		System.out.println(day+"/"+month+"/"+year);
	}
	
	public static void main(String[] args) {
		Date d = new Date(2022);
		Date d1 = new Date();
		d1.display();
		
		System.out.println("Date:");
		System.out.println(d.day+"/"+d.month+"/"+d.year);
	}
}
