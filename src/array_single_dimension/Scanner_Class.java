package array_single_dimension;

import java.util.Scanner;

public class Scanner_Class {

	public static void main(String[] args) {
		
//		int a=20;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Please provide a number");
		int number=sc.nextInt();
		System.out.println("The given number is: "+number);
		
		System.out.println("Provide a decimal number");
		double num=sc.nextDouble();
		System.out.println("Give decimal number is: "+num);
		
		System.out.println("Please provide a your favourity city:");
		String cityName = sc.next();
		System.out.println("The given cityName is: "+cityName);
		
	}

}
