package array_single_dimension;

public class Search_Element_in_Array {

	public static void main(String[] args) {
		
		int a[]= {10,20,30,40,50};
		
		/* Search an element in array (linear search)*/
		int searchElement=30;
//		int searchElement=330;
		boolean status=false;
		
		for(int i=0;i<a.length;i++) {
			
//			System.out.println(a[i]);
			if(a[i]==searchElement) {
				System.out.println("Element is found");
				status=true;
				break;
			}
		}
		if(status==false) {
			System.out.println("Element is not found");
		}
		
		
		for(int j:a) {
//			System.out.println(j);
			if(j==searchElement) {
				System.out.println("Found");
				status=true;
				break;
			}
			
		}
		if(status==false) {
			System.out.println("Not found");
		}
	}

}
