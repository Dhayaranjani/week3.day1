package week3.day1.Assignment4;
/*Assignment 4: Method Overloading
==================================
Class: Students
Methods: getStudentInfo()

Description: 
Create multiple getStudentInfo() method by passing 
1. id argument alone, 
2. by id & name, 
3. by email & phoneNumber
============================================================*/


//Implementing method overloading
public class Students {
	int getStudId; 
	String getStudName;
	String getStudEmail;
	long getStudPhone;
	
	//Create a method with id argument alone
	public void getStudentInfo(int getStudId) {
		System.out.println("Get Student Infomation from getStudentInfo Method");
		System.out.println("-------------------------------------------------");
		System.out.println("1. getStudentInfo with Id :" + getStudId);
		System.out.println("                              ");
	}

	//Create a method with id and Name
	public void getStudentInfo(int getStudId, String getStudName) {
		System.out.println("2. getStudentInfo with Id : "  + getStudId + " and Student Name : "  + getStudName);
		System.out.println("                              ");
	}
	
	//Create a method with email and Phone number
	public void getStudentInfo(String getStudEmail, long getStudPhone) {
		System.out.println("3. getStudentInfo with Email : " + getStudEmail + " and PhoneNumber : " + getStudPhone);
		System.out.println("                              ");
	}
	
	//Create Object in Main method and call all the methods	
	public static void main(String[] args) {
		Students myStudent = new Students();
		myStudent.getStudentInfo(1001);
		myStudent.getStudentInfo(1001, "DhayaRanjani");
		myStudent.getStudentInfo("dhayaranjani@gmail.com", 6412451789l);
	}

}
