package array_single_dimension;

import java.util.Scanner;

public class Taking_Multi_Input_From_User {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Provide a number");
		int num = sc.nextInt();
		
		System.out.println("Provide another number");
		int num1 = sc.nextInt();
		
		System.out.println("Total of number is: "+ (num+num1));
		
		/* For storing any data types*/
		System.out.println("Provide any data type value");
		Object inputData = sc.next();
		System.out.println("Any given data is : "+ inputData);

	}

}
