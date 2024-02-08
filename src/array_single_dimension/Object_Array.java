package array_single_dimension;

public class Object_Array {

	public static void main(String[] args) {
		
		Object a[]= {100,10.5,'A',"Welcome",true};
		for(Object x:a) {
			System.out.println(x);
		}
		
		for(int y=0;y<a.length;y++) {
			System.out.println(a[y]);
		}

	}

}
