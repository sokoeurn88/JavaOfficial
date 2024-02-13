package lambda_expressions;

import java.util.function.Predicate;

public class Invoke_Lambda_expression_with_Predefined_interface_in_JavaUtilFunction_Package {

	public static void main(String[] args) {
		/*Java.util.package has many pre-defined interfaces
		 * Predicate
		 * function
		 * consumer
		 * supplier
		 * 
		 * Predicate, function, consumer, supplier are used to invoke Lambda expression
		 * 
		 * 
		 *Predicate is pre-defined functional interface that has only one abstract method  test()
		 *interface Predicate is used to check condition
		 *Predicate take only one parameter and alway return a boolean
		 * 
		 * How to write interface Predicate
		 * 
		 * interface Predicate<T>{
		 * 	public abstract boolean test(T t);
		 * }
		 * 
		 * 
		 * */
		
		Predicate<Integer> p = i->(i>10);
		System.out.println(p.test(20));
		System.out.println(p.test(8));
		
		/*requirements: check the length of given String is geater than 4 or not*/
		Predicate<String> p2 = sString->(sString.length()>4);
		System.out.println(p2.test("Sokouern"));
		System.out.println(p2.test("home"));
		
		/*Print Array element whose size is greater than 4 */
		String name[]= {"Dara","Sokoeurn","Kosal","Ksatra","Sothyta"};
		for(String n:name) {
			if(p2.test(n)) {
				System.out.println(n);
			}
			
		}
		
		for(String n:name) {
			if(n.length()>4) {
				System.out.println("=>"+n);
			}
			
		}
		

	}

}
