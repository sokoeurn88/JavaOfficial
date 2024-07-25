package ternaryoperators;

public class TernaryOperators {

	public static void main(String[] args) {
		
		// Syntax => datatype variable = expression ? result1 true : result 2 false
		
		int a = 100, b = 200;
		
		int result = (a>b) ? a : b;		//if the expression is true, print a. otherwise print b
		
		System.out.println(result);
		
		
		
		//Note: Unary Operators: ++ -- = += -= *= /= !
		//Binary Operators (neet 2 varibles) + - and so on
		//Ternary Operators ( need 3 variables) e.g Syntax => datatype variable = expression ? result1 true : result 2 false 
		
		int c = 1, d = 2;
		
		c = d;
		
		d-=1;
		
		
		
		System.out.println(c);
		System.out.println(d);

	}

}
