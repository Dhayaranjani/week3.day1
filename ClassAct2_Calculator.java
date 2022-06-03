package week3.day1;
/*2. Classroom2: Activity
1) Create Class Calculator with below methods: OverLoading
----------------------------------------------------------
-2 methods for add. 1 method will take 2 int arguments, 1 method with 3 int args 
-2 methods for sub. 1 method will take 2 int arguments, 1 method with 2 double args
-2 methods for mul. 1 method will take 2 int arguments, 1 method with 1 double and 1 int args

2) Overriding
--------------
create the same method(takeVideo) in smartPhone class and execute it.
*/
public class ClassAct2_Calculator {
	//Add methods
	public int add(int num1, int num2) 
	{
		return num1 + num2;
	}
	
	public int add(int num1, int num2, int num3)
	{
		return num1 + num2 + num3;
	}
	
	//Subtract methods
	public int sub(int num1, int num2) 
	{
		return num1 - num2;
	}
	
	public double sub(double num1, double num2) 
	{
		return num1 - num2;
	}
	
	//Multiply methods
	public int mul(int num1, int num2) 
	{
		return num1 * num2;
	}
	
	public double mul(double num1, int num2) 
	{
		return num1 * num2;
	}
	
	public static void main(String[] args) 
	{
		//Create Object for the Calculator
		ClassAct2_Calculator myCalc = new ClassAct2_Calculator();
		
		int num1 =10;
		int num2 = 2;
		int num3 = 5;
		int add1 = myCalc.add(num1, num2);
		int add2 = myCalc.add(num1, num2, num3);
		int sub1 = myCalc.sub(num1, num2);
		double sub2 = myCalc.sub(num1, num2);
		int multiply1 = myCalc.mul(num1, num2);
		double multiply2 = myCalc.mul(num1, num2);
		
		System.out.println("Add the 1st num: "+ add1);
		System.out.println("Add the 2nd num: "+ add2);
		System.out.println("Subtract the 1st num: "+ sub1);
		System.out.println("Subtract the 2nd num: "+ sub2);
		System.out.println("Multiply the 1st num: "+ multiply1);
		System.out.println("Multiply the 2nd num: "+ multiply2);

	}
}
