package object_oriented_programming;

/* if class is in another package, it needs to be imported
 * how to import
 * 
 * import packagename.classname
 * 
 * */

public class Class_in_Java {
	
	public static void main(String[] args) {
		
		/* Create a object class of Class_in_Java*/
		Class_in_Java2 cij=new Class_in_Java2();
		cij.eid=100;
		cij.ename="Sokoeurn Chhay";
		cij.ejob="QA";
		cij.sal=100000;
		cij.display();
		
		System.out.println();
		
		/* still can print the values without using display methods, it is lengthy*/
		System.out.println(cij.eid);
		System.out.println(cij.ename);
		System.out.println(cij.ejob);
		System.out.println(cij.sal);
		
		System.out.println();
		
		Class_in_Java2 cij2=new Class_in_Java2();
		cij2.eid=101;
		cij2.ename="Kosal";
		cij2.ejob="Technician";
		cij2.sal=120000;
		cij2.display();
		
		/* Object Oriented Programming:
		 * class
		 * object
		 * Polymorphism
		 * Encapsulation
		 * Inheritance
		 * Data Abstraction
		 * 
		 * Class is a collection of attributes and behavior. it is just a name given to a particular group
		 * class is a plan or blueprint
		 * e.g animals--> dog, elephant, horse, etc
		 * 
		 * Object is an instant of a class
		 * 
		 * Attributes is called variable
		 * 
		 * behavior is called method
		 * 
		 * Class is a collection of variables and methods
		 * 
		 * Class is a logical or blue print. logical entity is not take space in memory
		 * 
		 * Class is not take space in the memory
		 * 
		 * How to create a class
		 * class Employee{
		 * variable
		 * method
		 * }
		 * 
		 * 
		 * Object is an instance of a class or object will be created by using a class.
		 * Object is physical entity
		 * Object is take space in memory
		 * We can create objects in a single class
		 * 
		 * How to create a class
		 * 
		 * Employee emp = new Employee();     Object contains variables and methods
		 * 
		 * new is an object
		 * Employee() is a constructor
		 * 
		 * 
		 * class --> variable and methods
		 * 
		 * method --> variables
		 * 
		 * method should not contain another method
		 * 
		 * Obect of a class should be in the main method
		 * 
		 * 
		 */
		
		

	}


}
