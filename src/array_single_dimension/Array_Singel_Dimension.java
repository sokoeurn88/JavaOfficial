package array_single_dimension;

public class Array_Singel_Dimension {

	public static void main(String[] args) {
		
		/* Single dimension array, fix array, know size before*/
		int a[] = new int[5];
		a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=500;
		System.out.println(a[1]);
		for(int k:a) {
			System.out.println(k);
		}
		
		/* Multi dimension array, Dynamic array*/
		int b[]= {10,20,30,40,50};
		System.out.println(b[1]);
		System.out.println("Array length is : "+b.length);
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);
		}
		
		/*for each*/
		for(int j:b) {
			System.out.println(j);
		}
				
				
				
	}

}
