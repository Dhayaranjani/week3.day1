package org.department;

import org.college.College;

//This is the Child (Parent) Class Inheriting the parent class using keyword extends
public class Department extends College{
	//Create a method DeptName
	public void deptName() {
		System.out.println("                              ");
		System.out.println("This is from Department Class");
		System.out.println("-----------------------------");
		System.out.println("Department Name is : Holy Cross - Chemistry Dept. ");
	}
}
