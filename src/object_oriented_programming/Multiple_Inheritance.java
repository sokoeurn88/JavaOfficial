package object_oriented_programming;

interface User{
	int age = 36;
	
	void getAge(); /*all abstract methods are public*/
}

interface Customer{
	int balance = 5000;
	void showBalance();
}

class Location{
	int zipcode = 75254;
	void locate() {
		System.out.println("near by location");
	}
}


public class Multiple_Inheritance extends Location implements User, Customer {
	
	/*this method need to change to public */
	public void getAge() { 
		System.out.println(age);
	}
	
	public void showBalance() {
		System.out.println(balance);
	}

	public static void main(String[] args) {
		
		Multiple_Inheritance mi = new Multiple_Inheritance();
		mi.getAge();
		mi.showBalance();
		
		mi.locate();
		
		
		User u = new Multiple_Inheritance();
		u.getAge();
		System.out.println(u.age);
		
		Customer c = new Multiple_Inheritance();
		c.showBalance();
		System.out.println(c.balance);
	}

}
