package array_single_dimension;

import java.util.Arrays;

public class Sorting_String_in_Array {

	public static void main(String[] args) {
		
		char a[]= {'g','z','a','b','c','d','e'};
		
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);
		System.out.println(a);
		
		String s[]= {"Sokoeurn","Kosal","Sarom","Nita"};
		System.out.println(Arrays.toString(s));
		Arrays.sort(s);
		System.out.println(Arrays.toString(s));
	}

}
