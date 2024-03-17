package type_casting;

class Parent{
	String name = "sok";
	void printName() {
		System.out.println(name);
	}
}

class Child extends Parent {
	int age = 35;
	void printAge() {
		System.out.println(age);
	}
}

public class Types_Casting {

	public static void main(String[] args) {
		
		/*Upcasting/ widening casting*/
		
		int price = 100;
		long totalprice = price;
		System.out.println(totalprice);
		
		float onsale = 10.5F;
		double totalsale = onsale;
		System.out.println(totalsale);
		
		
		/* Downcasting/ Narrowing casting*/
		long salary = 10000;
		int anualsalary = (int) salary;
		System.out.println(anualsalary);
		
		double shoesprice = 125.50;
		float totalshoesprice = (float) shoesprice;
		System.out.println(totalshoesprice);
		
		Child c = new Child();
		System.out.println(c.name);
		System.out.println(c.age);
		c.printName();
		c.printAge();
		
		Parent p = new Child();			//upcasting -> lower value into higher value
		System.out.println(p.name);
		//System.out.println(p.age);
		p.printName();
		//p.printAge();
		
		try {
		Parent p1 = new Parent();
		Child c1 = (Child) p1;		//downcasting will through an exception in runtime
		
		System.out.println(c1.name);
		System.out.println(c1.age);
		c1.printName();
		c1.printAge();
		
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		//syntax of type casting: A b = (c) d;
		
		//rule1: d & c are related-> Yes. 
		//Rule2: c must be same or child of A
		//rule3: uderlying object type of d must be same or child of c
		
		try {
		Object o = new String("welcome");
		StringBuffer sb = (StringBuffer) o;		//rule1: yes, rule2: yes, rule3: no   => will through run time error	
		} catch(Exception e) {
			e.getMessage();
		}
		
		Object p2 = new String("welcome");
		String ps = (String) p2;
		System.out.println(ps);
		
	}

}
