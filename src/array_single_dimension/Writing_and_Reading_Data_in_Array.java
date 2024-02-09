package array_single_dimension;

import java.util.Arrays;
import java.util.Scanner;

public class Writing_and_Reading_Data_in_Array {

	public static void main(String[] args) {
		
		int a[]= new int[5];
		
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<5;i++) {
			System.out.println("Enter a value for position "+i+" :");
//			int num = sc.nextInt();
			a[i]=sc.nextInt();
		}
		System.out.println("Printing array is :"+Arrays.toString(a));
		
		/*Reading data from Array*/
		for(int j:a) {
			System.out.println(j);
		}


	}

}
