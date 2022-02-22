//Assignment # 1
//Create a class Employee  & write Accessors & Mutators
//Create objects with default constructor & set values using mutators.
//Display/print values of attributes of each object created.

package com.cybage.assignment2;

public class Employee {
	private int eid;
	private String name;
	
//	Getters and Setters
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String str = "Employee Details: Id = "+getEid()+"  name = "+getName();
		return str;
	}
	
	void display() {
		System.out.println("Id:"+eid+" EmpName:"+name);
	}
	
	
}
