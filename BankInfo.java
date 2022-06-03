package week3.day1.Assignment3;
/*Assignment3:
============
Class     :BankInfo
Methods :saving(),fixed(),deposit()

Class     :AxisBank
Methods :deposit()
Description:
You have to override the method deposit in AxisBank.
=================================================================*/

//Child Class Inherits the parent class
public class BankInfo extends AxisBank {
	//Create 3 methods saving(),fixed(),deposit()
	public void saving() {
		System.out.println("This is from Bank Info Class");
		System.out.println("----------------------------");
		System.out.println("This is the method Savings");
	}
	
	public void fixed() {
		System.out.println("This is the method fixed");
	}
	
	public void deposit() {
		System.out.println("This is the Deposit Method - BankInfo Class");
	}

	//You have to override the method deposit in AxisBank.*/
	public static void main(String[] args) {
		//Create an Object for the class 
		BankInfo myBankInfo = new BankInfo();
		myBankInfo.saving();
		myBankInfo.fixed();
		myBankInfo.deposit();
	}
}
