package com.cybage.assignment2;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee emp = new Employee();
		Employee emp1 = new Employee();
		
		emp1.display();
		emp.setEid(1);
		emp.setName("Nihar");
		
		System.out.println(emp.toString());
	}
}
