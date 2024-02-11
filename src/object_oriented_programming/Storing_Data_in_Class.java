package object_oriented_programming;

public class Storing_Data_in_Class {
	
	String familyName;
	int brother;
	int sister;
	
	void printFamily() {
		System.out.println(familyName+" "+brother+" "+sister);
		
	}
	
	void getFamily(String name, int bro, int sis) {
		familyName=name;
		brother=bro;
		sister=sis;
	}
	
	/*Class have a contructor
	 * Constructor is a method, but method name must be same as class name
	 * Contructor is never return a value
	 * no need to write even void 
	 * can take parameters
	 * just for initialize data inot variables
	 * */
	
	Storing_Data_in_Class(String name, int bro, int sis) {
		familyName=name;
		brother=bro;
		sister=sis;
	}

}
