package object_oriented_programming;

public class Static_Keyword2 {
	
	public static void main(String[] args) {
		
		/*Static keyword can be applied for variable and method
		 * static variable
		 * static method
		 * non-static variables
		 * non-static methods
		 * 
		 * Static method can access static variable and static method directly
		 * 
		 * e.g public static void main(String[] args){}; can access static variable and method without crating 
		 * class object e.g Static_Keyword sw = new Static_Keyword();
		 * 
		 * Static method can access non-static variable and non-static method through class obejct.
		 * 
		 *non-static method can access everything: static variable, non-static variable, static method, non-static method
		 *
		 * */
		
		
		/*main method: public static void main(String[] args) can access static int a = 10, and static void main(String name){};*/
		System.out.println(Static_Keyword.a); /*When calling in different class, class name has to used to called static varible and static method*/
		Static_Keyword.main("sokoeurn");
		
		/*man(String[] args){} is static. it can't access non-static variable(int b = 20) and method(void main())
		 *main(String[] args){} is static. it can't access non-static variable and method through class object creation*/
		Static_Keyword sk = new Static_Keyword();
		System.out.println(sk.b);
		sk.main();
		
		/*But when you call class object is needed*/
		sk.print();
		
		
	}

}
