package lambda_expressions;

import java.util.function.Predicate;

public class Combine_Predicate_Pre_defined_interface {

	public static void main(String[] args) {
		
		int arr[]= {40,45,50,55,60};
		
		Predicate<Integer> p = i->i%2==0;
		Predicate<Integer> p2 = i->i>50;
		
		for(int e:arr) {
			if(p.and(p2).test(e)) {
				System.out.println(e);
			}
			
		}
		
		for(int e:arr) {
			if(p.or(p2).test(e)) {
				System.out.println(e);
			}
			
		}
		
		/*negate() means negative of the value, if it true, it become false. if it is false, it becomes true*/
		for(int e:arr) {
			if(p.negate().test(e)) {
				System.out.println(e);
			}
			
		}
		
		

	}

}
