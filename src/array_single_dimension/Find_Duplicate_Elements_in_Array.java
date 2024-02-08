package array_single_dimension;

public class Find_Duplicate_Elements_in_Array {
	public static void main(String args[]) {
		
		int a[]= {100,200,100,200,300,200,400,500,400};
		int duplicatNum=100;
		int counter=0;
		
		for(int value:a) {
//			System.out.println(value);
			if(value==duplicatNum) {
				counter++;
			}
		}
		System.out.println(counter);
	}

}
