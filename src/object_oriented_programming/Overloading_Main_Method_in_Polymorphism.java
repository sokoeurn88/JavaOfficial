package object_oriented_programming;

public class Overloading_Main_Method_in_Polymorphism {

	void main(int x) {
		System.out.println(x);
	}
	
	void main(String name) {
		System.out.println(name);
	}
	
	void main(String lastName, String firstName) {
		System.out.println(lastName+" "+firstName);
	}
	
	
	public static void main(String[] args) {
		
		/*To call other methods in the Main Method, we need to create object of the class*/
		Overloading_Main_Method_in_Polymorphism op = new Overloading_Main_Method_in_Polymorphism();
		
		op.main(100);
		
		op.main("Sokoeurn Chhay");
		
		op.main("Chhay", "Sarom");
	}

}
