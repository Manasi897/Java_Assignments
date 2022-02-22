//Write a Java program to break an integer into a sequence of individual digits. 
// Test Data
//Input six non-negative digits: 123456
//Expected Output :
//1 2 3 4 5 6


package com.cybage.assignment2;

public class BreakInteger {
	public static void main(String[] args) {
		int num = 123456;
		System.out.println("Integer:"+num);
		int d1 = num/100000%10;
		int d2 = num/10000%10;
		int d3 = num/1000%10;
		int d4 = num/100%10;
		int d5 = num/10%10;
		int d6 = num%10;
		
		System.out.println(d1+" "+d2+" "+d3+" "+d4+" "+d5+" "+d6);
	}
	
}
