package week3.day1;

/*This is step 2 in ClassAct2
2) Overriding
--------------
create the same method(takeVideo) in smartPhone class and execute it.
*/

//Inheriting the parent class which inherits the grandparent class
public class ClassAct1_SmartPhone extends ClassAct1_AndroidPhone {
	
	public void connectWhatApp() {
		System.out.println("Connect the WhatsApp");
	}
	//This is step 2 in Classroom Act2: for Overriding concept// create the same method(takeVideo) in smartPhone class and execute it.
	public void takeVideo() 
	{
		System.out.println("Take Video from Child Class - SmartPhone Class");
	}	
	
	public static void main(String[] args) {
		ClassAct1_SmartPhone smartPhone = new ClassAct1_SmartPhone();
		//Methods from Mobile class 
		smartPhone.sendMsg();
		smartPhone.makeCall();
		smartPhone.saveContact();
		
		//Methods from Andriod class
		smartPhone.takeVideo();
		smartPhone.connectWhatApp();
	}
}
