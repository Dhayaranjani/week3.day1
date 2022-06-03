package org.student;
import org.department.Department;

//Grand Child Class which inherits Parent class 
public class Student extends Department{

	//Create 3 methods studentName(),studentDept(),studentId()
	public void studentName() 
	{
		System.out.println("                              ");
		System.out.println("This is from Student Class");
		System.out.println("--------------------------");		
		System.out.println("Student Name is : Dhaya");
	}

	public void studentDept() 
	{
		System.out.println("Student Department is : Chemistry");
	}

	public void studentId() 
	{
		System.out.println("Student Id is : 702565485");
	}
	
	//Call all your class methods into the Student using multilevel inheritance.
	public static void main(String[] args) {
	//Create an Object for the Class Student
	Student myStudent = new Student();
	
	//Call from College class in org.college package
	myStudent.collegeName();
	myStudent.collegeCode();
	myStudent.collegeRank();
	
	//Call from Department class in org.department package
	myStudent.deptName();
		
	//Call from Student class in org.student package
	myStudent.studentName();
	myStudent.studentDept();
	myStudent.studentId();

	}
}

