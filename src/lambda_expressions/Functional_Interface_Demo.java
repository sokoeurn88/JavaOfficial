package lambda_expressions;

/*It's a functional interface*/
interface Cab2{
	public void bookCab(String source, String destination); /*It's an abstract method*/
}

/*class Ola implement an abstract method in interface Cab*/
//class Ola implements Cab2{
//	public void bookCab(String source, String destination) {
//		System.out.println("Ola is booked from "+source+" to "+destination);
//	}
//	
//	/*Because interface Cab2 is function interface, which has only one abstract method
//	 * we can write Lambda expression to implement an abstact method in interface Cab2*/
//	(source,destination)->System.out.println("Ola is booked from "+source+" to "+destination);
//}




public class Functional_Interface_Demo {

	public static void main(String[] args) {
		
		/*Invoke interface Cab*/
//		Cab2 cab = new Ola();
//		cab.bookCab("Dallas","Houston");
		
		/*We can invoke functional interface Cab2 with Lambda expression. class Ola does not need anymore*/
		
		
		Cab2 cab = (source,destination)->System.out.println("Ola is booked from "+source+ " to "+destination); /*no need data type for parameter*/
		cab.bookCab("Dallas", "Houston");

	}

}
