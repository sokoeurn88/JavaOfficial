package exceptions;

import java.util.Scanner;

public class Exceptions_Handling {

	public static void main(String[] args) {
		
		/*Exceptions: event causing the program to terminate. 
		 * it is user mistake.
		 * 
		 * 2 types of exceptions:
		 * 
		 * checked exceptions: are exceptions identified by java compiler. e.g InteruptedException, FileNotFoundException, IOException etc...
		 * 
		 * Unchecked exceptions: are exceptions are not identified by java compiler. e.g ArithmeticException, NullPointerException, ArrayIndexOutOfBoundsExceptions etc...
		 * 
		 * Errors:
		 * syntax errors
		 * logic error : syntax is right, but output is wrong
		 * */
		
		//example1
		System.out.println("Program starts");
		System.out.println("Type in number");
		
		Scanner sc = new Scanner(System.in);
		int userNum = sc.nextInt();
		
		//if u know exactly which statement might through exeception put in try block. try{} catch(NameExceptionClass object){message}. 
		
		try {
			System.out.println("Given nuber is: "+100/userNum);		//ArithmeticException
		} catch(ArithmeticException e) {
			System.out.println("Invalid data");
		}
		
		System.out.println("Program ends");
		

		//example2
		int number[]=new int[5];
		System.out.println("Enter position 0-4");		//ArrayIndexOutOfBoundsException
		
		try {
			int post = sc.nextInt();
			System.out.println("Enter a value");
			int value = sc.nextInt();
		
			number[post]=value;
			System.out.println(number[post]);
			
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		
		
		//if u do not know if type of exceptions will through. using this: try{} catch(Exception e){}. Exception is the parent class of all others exceptions

		//example3. Exception e is the generic exception
		try {
			String greeting = "Welcome";			//NumberFormatException
			int g = Integer.parseInt(greeting);
			System.out.println(g);
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		

		//Example4
		try {
			String name = null;
			System.out.println(name.length());		//NullPointerException
			
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	
	
		System.out.println("program finally ended");
	

	
	}

}
