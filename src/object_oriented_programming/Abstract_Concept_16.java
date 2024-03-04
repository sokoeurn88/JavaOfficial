package object_oriented_programming;

interface Shape{
	
	int length = 10; /*all variable will be final and static*/
	int width = 20;
	
	/*abstract method is allowed. All methods are public */
	void circle();
	
	/*static method is allowed*/
	static void rectangle() {
		System.out.println("This is rectangle in Static Method.");
	}
	
	/*default method is allowed*/
	default void square() {
		System.out.println("Square method as default method interface");
	}
	
}




public class Abstract_Concept_16 implements Shape {
	
	/*in here circle method has default access modifier. because circle method need to implement circle abstract method in interface. it must be specify as public access modifier to match circle abstract interface*/
	public void circle() {
		System.out.println("This is circle just implement");
	}
	
	
	

	public static void main(String[] args) {
		
		
		Abstract_Concept_16 acobj = new Abstract_Concept_16();
		acobj.circle();
		acobj.square();
		
		
		rectangle(); /*because it is static no acobj is needed*/
		
		
		
		/*Abstract is hiding implementation details, and showing only functionality to user
		 * 
		 * Abstract class
		 * 
		 * Interface
		 * 	is the blue print of class
		 * 	syntax: interface Test{ variable and methods }
		 * 	by default has final and static variable
		 * 	contains abstract method (method has only signature but not body(not implementation))
		 * 	methods in interface are public
		 * 	supports multiple inheritance
		 * 	class implements interface ( class extends class, interface extends interface)
		 * 	can create object reference, but we can't instantiate interface
		 * 
		 * x = new Test()
		 * 
		 * x is Object Reference
		 * 
		 * new Test() is object or instantiate
		 * 
		 * e.g You want to Developing Bank App
		 * 
		 * 	1, u have requirements -> you can create interface, and interface methods. But u don't know how design work
		 * 
		 *  2, when u know how to design, u can implement interface 
		 * 
		 * 
		 * 
		 * */ 
		
		
		
		
		
	}




	private static void rectangle() {
		// TODO Auto-generated method stub
		
	}




	}
