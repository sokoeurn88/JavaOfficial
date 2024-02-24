package object_oriented_programming;

/*one java file should contains only one public class*/
class Number{
	int a = 100;
	void print() {
		System.out.println(a);
	}
}

class Number2 extends Number {
	int b = 200;
	void show() {
		System.out.println(b);
	}
}

class Number3 extends Number2{
	int c = 300;
	void add(){
		System.out.println(a+b+c);
	}
}


public class Inheritance_in_OOP_Day14 {

	public static void main(String[] args) {
		
		/*Inheritance is acquiring all properties(variable) and behavior(method) from one class to another class
		 * 
		 * extends is a key word
		 * 
		 * Parent class/ based class/ super class 
		 * 
		 * child class/ sub class/ derived class
		 * 
		 * Benefit of using Inheritance
		 * 
		 *  cod re-usability
		 *  avoid duplication
		 *  
		 *  4 types of inheritance
		 *  
		 *  	Single -> one parent - one child
		 *  	Multi level -> one parent -> one child (This child becomes parent of another child) -> parent -> child and so on...
		 *  	Hierarchy -> one parent -> many children
		 *  	multiple -> many parents -> one child
		 *  
		 * 
		 * */ 
		
		
		Number2 n2 = new Number2();
		
		System.out.println(n2.a);
		System.out.println(n2.b);
		
		n2.print(); /*This method already has print method*/
		n2.show();
		
		Number3 n3 = new Number3();
		System.out.println(n3.c);
		n3.add();
		
		
		

	}

}
