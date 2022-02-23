//Assignment #2
//Write a program to print size of different data types in java

package com.cybage.assignment1;

public class DataTypes {
	public static void main (String[] args)
    {
			System.out.println("Size of datatypes:");
            System.out.println("integer:"+ (Integer.SIZE/8)+" bytes");
            System.out.println("byte   :"+ (Byte.SIZE/8)+" byte");
            System.out.println("float  :"+ (Float.SIZE/8)+" bytes");
            System.out.println("double :"+ (Double.SIZE/8)+" bytes");
            System.out.println("Short  :"+ (Short.SIZE/8)+" bytes");
            System.out.println("long   :"+ (Long.SIZE/8)+" bytes");
            System.out.println("char   :"+ (Character.SIZE/8)+" bytes");
    }
}
