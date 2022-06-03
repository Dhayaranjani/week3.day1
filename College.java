package org.college;
/*Assignment2:
=============
Package   :org.college
Class     :College
Methods   :collegeName(),collegeCode(),collegeRank()

Package   :org.department
Class     :Department
Methods   :deptName()
 
Package   :org.student
Class     :Student
Methods   :studentName(),studentDept(),studentId()
Description:
create above 3 class and call all your class methods into the Student using multilevel inheritance.*/

//This is the Main Parent - (Grand Parent Class)
//Create 3 methods collegeName(),collegeCode(),collegeRank(),
public class College {
	
	public void collegeName() {
		System.out.println("This is from College Class");
		System.out.println("--------------------------");
		System.out.println("My College Name is : Holy Cross College-Trichy");
	}
	
	public void collegeCode() {
		System.out.println("My College Code : Womens College ");
	}
	
	public void collegeRank() {
		System.out.println("My College Rank is : Rank 1");
	}

}
