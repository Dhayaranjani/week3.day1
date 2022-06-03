package org.system;
//Child Class - Inheriting the parent class using keyword extends
//---------------------------------------------------------------
public class Desktop extends Computer{
	//Create a method desktopSize
	public void desktopSize() 
	{
		System.out.println("3. Here is the Desktop Size");
	}
	
	//Create an Object in the main method and call all child class methods	
	public static void main(String[] args) {
		Desktop myDesktop = new Desktop();
		System.out.println("Using Single Inheritance");
		System.out.println("------------------------");
		myDesktop.computerModel();
		myDesktop.computerPrice();
		myDesktop.desktopSize();
	}
}
