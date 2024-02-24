package object_oriented_programming;

class Parent{
	int a = 300;
	void print() {
		System.out.println(a);
	}
}

class Child1 extends Parent{ /*extend keyword can be used only one class*/
	int b = 400;
	void show(int b) {
		System.out.println(b);
	}
}

class Child2 extends Parent {
	int c = 500;
	void add() {
		System.out.println(c+a);
	}
}

public class Hierarchy_Inheritance {

	public static void main(String[] args) {
		
		Child1 c1 = new Child1();
		System.out.println(c1.a);
		System.out.println(c1.b);
		
		c1.print();
		c1.show(700);
		
		Child2 c2 = new Child2();
		System.out.println(c2.a);
		System.out.println(c2.c);
		
		c2.add();
		
		

	}

}
