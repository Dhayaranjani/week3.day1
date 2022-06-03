package week3.day1;
/*1. Classroom1: Activity - Create 3 classes 
1. Mobile (methods - sendMsg,makeCall,saveContact)
2. AndroidPhone class(take video)
3. Smartphone() (connectWhatsApp)

- Use Inheritence
-------------------
-AndroidPhone extends Mobile and SmartPhone extends AndroidPhone
-Create Object for SmartPhone and execute all methods******
*/

//Parent Class
public class ClassAct1_Mobile {

	public void sendMsg() {
		System.out.println("Send Messages");
	}
	
	public void makeCall() {
		System.out.println("Make Calls");
	}
	
	public void saveContact() {
		System.out.println("Save the Contacts");
	}
	
}
