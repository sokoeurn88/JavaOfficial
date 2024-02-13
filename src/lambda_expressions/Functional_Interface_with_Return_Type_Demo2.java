package lambda_expressions;

/*It's a functional interface*/
interface Cab3{
	public String bookCab(String source, String destination); /*It's an abstract method*/
}

/*class Ola implement an abstract method in interface Cab*/
//class Ola implements Cab3{
//	public String bookCab(String source, String destination) {
//		System.out.println("Ola is booked from "+source+" to "+destination);
//		return("Total price will be $300.00");
//	}
	
	/*Because interface Cab2 is function interface, which has only one abstract method
	 * we can write Lambda expression to implement an abstact method in interface Cab2*/
//	(source,destination)->{
//		System.out.println("Ola is booked from "+source+" to "+destination);
//		return("Total price will be $300.00");
//	}
//	}





public class Functional_Interface_with_Return_Type_Demo2 {

	public static void main(String[] args) {
		
		/*Invoke interface Cab*/
//		Cab2 cab = new Ola();
//		cab.bookCab("Dallas","Houston");
		
		/*We can invoke functional interface Cab2 with Lambda expression. class Ola does not need anymore*/
		
		
		Cab3 cab4 = (source,destination)->{
			System.out.println("Ola is booked from "+source+" to "+destination);
			return("Total price will be $300.00");
		}; /*no need data type for parameter*/
		System.out.println(cab4.bookCab("Dallas", "Houston")); /*If you are not print, it will return Dallas Houston, not price*/

	}

}
