package object_oriented_programming;

public class This_and_Static_keywork_Java_OOPs_Day13 {
	
	String name;
	int age;
	int salary;
	String hometown;
	
//	This_and_Static_keywork_Java_OOPs_Day13(String name, int age){
//		this.name=name;
//		this.age=age;
//	}
	
	void disPlay() {
		System.out.println(name);
		System.out.println(age);
	}
	
	void getAddress(String hometown, int salary) {
		this.hometown=hometown;
		this.salary=salary;
		System.out.println(hometown);
		System.out.println(salary);
	}

	public static void main(String[] args) {
		
		/*This is a keyword presents class and object.
		 * 
		 * This keyword is used to differentiate class object and local object.
		 * 
		 * We can instantiate class variables and local variable through :
		 * constructor 
		 * methods
		 * 
		 * 
		 * */
		
//		This_and_Static_keywork_Java_OOPs_Day13 oc = new This_and_Static_keywork_Java_OOPs_Day13("Sokoeurn",36);
//		oc.disPlay();
		
		This_and_Static_keywork_Java_OOPs_Day13 oc2 = new This_and_Static_keywork_Java_OOPs_Day13();
		oc2.getAddress("Kampot", 100000);
	}

}
