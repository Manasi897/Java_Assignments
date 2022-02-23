//Assignment #3
//Write a program to demonstrate different access modifiers 

package com.cybage.assignment1;

class Data {
    // private variable
//    private String name;
    protected String name1;
    public String name2;
}
public class AccessModifiers {
//	 Access modifier
	public static void main(String[] main){
        Data d = new Data();
//        d.name = "Cybage";
        d.name1 = "manasi";
        d.name2 = "Rina";
    }
}
