package lambda_expressions;

import java.util.function.Function;
import java.util.function.Predicate;

public class Function_Interface {

	public static void main(String[] args) {
		/*Function interface is pre-defined interface
		 * is used to return a single value of any data type
		 * it takes any data types as parameter
		 * has one method called test()
		 * is used for operation and getting the value
		 * 
		 * How to write
		 * 
		 * interface Function<Argument type, Return>{
		 *	public abstract returntype apply(T);
		 *}
		 * */
		
		/*Function<parametertype, returntype>{
		 * public abstract returntype apply(anyargumenttype);
		 * }
		 */
		
		Function<Integer, Integer> f = n->n*n;
		System.out.println(f.apply(5));
		System.out.println(f.apply(25));
		System.out.println(f.apply(50));
		System.out.println(f.apply(500));
		
		/* Find the length if any String input*/
		Function<String, Integer> fn = e->e.length();
		System.out.println(fn.apply("Hello"));
		System.out.println(fn.apply("Welcome"));
		System.out.println(fn.apply("Sokoeurn"));
		System.out.println(fn.apply("Kosal"));
	}

}
