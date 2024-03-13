package exceptions;

import java.util.Scanner;

public class Try_Catch_Finally {

	public static void main(String[] args) {
		
		//finally will always execute
		
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
		} finally {
			System.out.println("finally block end the Programs");
		}
		
		
	}

}
