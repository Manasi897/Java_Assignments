//Write a Java program that reads an integer between 0 and 1000 and adds all the digits in the integer. 
// Test Data
//Input an integer between 0 and 1000: 565
//Expected Output :
//The sum of all digits in 565 is 16

package com.cybage.assignment2;

import java.util.Scanner;

public class TestData {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Integer between 0 to 1000:");
		int num= sc.nextInt();
		
		int firstDigit = num % 10;
        int remainingNumber = num / 10;
        int SecondDigit = remainingNumber % 10;
        remainingNumber = remainingNumber / 10;
        int thirdDigit = remainingNumber % 10;
        remainingNumber = remainingNumber / 10;
        int fourthDigit = remainingNumber % 10;
        int sum = thirdDigit + SecondDigit + firstDigit + fourthDigit;
        
        System.out.println("Sum is:"+sum);
	}
}
