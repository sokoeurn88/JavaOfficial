package object_oriented_programming;

public class Polymorphism_Day12 {
	
	int a = 10, b = 20;
	
	/*Method names should be the same.*/
	void sum() {
		System.out.println(a+b);
	}

	/*Number of parameter should be different*/
	void sum(int a, int b) {
		System.out.println(a+b);
	}
	
	/*Data type of parameter should be different*/
	void sum(int a, double b) {
		System.out.println(a+b);
	}
	
	/*Order of parameter should be different*/
	void sum(double b, int a) {
		System.out.println(a+b);
	}
	
	void sum(int a, int b, int c) {
		System.out.println(a+b+c);
	}
	
	
	
	public static void main(String[] args) {
		
		/*Polymorphism - means one thing can have many forms. e.g Shape: circle, triangle, square...etc
		 * water: vapour, ice burge etc...
		 * 
		 * Polymorphism is a method that can have many forms.
		 * 
		 * We can achieve Polymorphism using overloading 
		 * 
		 * Overloading can be method overloading or constructor overloading.
		 * 
		 * method overloading: is same method name, different parameter, different data type, different order, 
		 * e.g void m1(), void m1(String name), void m1(int age); ...etc
		 * 
		 * 4 rules of overloading:
		 * Method names should be the same.
		 * Number of parameter should be different
		 * Data type of parameter should be different
		 * Order of parameter should be different
		 * 
		 * Why overloading?
		 * */ 
		
		/*Create class Object*/
		Polymorphism_Day12 pmObject = new Polymorphism_Day12();
		pmObject.sum();
		
		pmObject.sum(100, 200);
		
		pmObject.sum(300, 400.20);
		
		pmObject.sum(500.50,600);
		
		pmObject.sum(700,800,900);
	}

}
