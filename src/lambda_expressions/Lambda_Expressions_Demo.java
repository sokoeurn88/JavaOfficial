package lambda_expressions;

@FunctionalInterface /*explicitly assign as functional interace*/
interface Cab{
	public void bookCap();	/*abstract method has no body or block statement*/
}

//class Ola implements Cab{
//	
//	/*
//	public void bookCab() {
//		System.out.println("Ola cab is booked...");
//	}
//	*/
//	
//	/*Lambda expression to replace public void bookCap()*/
//	
//	/*This Lambda expression can place direction when a Ola class is invoked*/
////	()->System.out.println("Ola cab is book...");
//
//	@Override
//	public void bookCap() {
//		// TODO Auto-generated method stub
//		
//	}
//}


public class Lambda_Expressions_Demo {

	public static void main(String[] args) {
		
		/*invoking Ola class, Ola class will implements Cab interface*/
//		Ola ol = new Ola();
//		ol.bookCab();
		
		/*You can use Lambda expression here*/
		Cab ol3 = ()->System.out.println("Ola Cab is booked...");
		ol3.bookCap();
		
		
		/*another way to call Ola class. Cab is the parent interface of Ola. Ola is the child class implements Cab interface*/
//		Cab ol2 = new Ola();
//		ol2.bookCap();
		
		
		/*Why Lambda expression?
		 * 
		 * to bring functional programming in Java
		 * code optimization
		 * 
		 * Lambda expression is anonymous function means
		 * no name
		 * no return type
		 * no access modifier
		 * 
		 * Interface has abstract method
		 * Functional interface means it has only one single abstract method, but it can have multiple default methods and multiple static methods
		 * 
		 * functional Interface are
		 * runnable has run() abstract method
		 * callable has call() as abstract method
		 * comparable has compareTo() as abstract method
		 * ActionListener has actionPerform() as abstract method
		 * 
		 * Functional Interface is used to call Lambda Expression
		 * 
		 * */
		
		

	}

}
