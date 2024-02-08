package array_single_dimension;

import java.util.Arrays;

public class Sorting_Elements_in_Array {

	public static void main(String[] args) {
		
		int a[]= {10,60,20,50,40};
		
		System.out.println(Arrays.toString(a));
		
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		
		
		
		for(int value:a) {
			System.out.println(value);
		}
	}

}
