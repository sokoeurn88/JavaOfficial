package lambda_expressions;

import java.util.function.Function;

public class Function_Interface_Chaining {

	public static void main(String[] args) {
		
		Function<Integer,Integer> fn = n->n*2;
		Function<Integer,Integer> fn2 = n->n*n*n;
		
		/*To combine Function Interface, andThen() and compose() are used.*/
		
		System.out.println(fn.andThen(fn2).apply(2)); /*Execution order: 2 will pass to fn, and fn will pass to fn2*/
		System.out.println(fn.compose(fn2).apply(2)); /*Execution order: 2 wipp pass to fn2, and fn2 will pass to fn*/

	}

}
