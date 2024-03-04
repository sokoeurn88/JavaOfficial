package object_oriented_programming;

class NumberData{
	final int a = 100;
	
	int b = 500;
	
	void printValue() {
		System.out.println(a*a);
		
		System.out.println(b);
	}
}


final class NumberSum extends NumberData{
	
	/*method overloading*/
	void printValue() {
		
		System.out.println(a+a);
		
		int b = 600;
		System.out.println(b);
	}
	
}


/*class NumberSum is final. it can't be extend*/

	
//class NumberSum1 extends NumberSum{ 
//	
//	/*method overloading*/
//	void printValue() {
//		System.out.println(a+a);
//	}
//	
//}






public class Final_Keyword {
	
	static int y = 200; /*static y mean default value of y is 200. this value can be changed in child class or any where*/
	
	final int z = 200; /*final y mean final value of y is 200. this value can not be changed any where*/


	public static void main(String[] args) {
		
		NumberData num = new NumberData();
		System.out.println(num.a);
		
//		num.a=200;
		System.out.println(num.a);
		
		num.printValue();
		
		NumberSum ns = new NumberSum();
		ns.printValue();

	}

}
