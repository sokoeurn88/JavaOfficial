package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Employee {

}

public class ArrayList_Class {

	public static void main(String[] args) {
		
		/* Collection Interface => List Interface => ArrayList Class
		 * ArrayList : store heterogenious data allowed, insertion order preserved (index), duplicate elements allowed, multiple nulls alloweds.
		 * null is unknown, not an empty value
		 * */
		List mylist = new ArrayList();
		
		//store same type of data/ homogenous data, using wrapper class <Integer>, <String>
		ArrayList<Integer> arrayList2 = new ArrayList<Integer>();
		ArrayList<String> arrayList3 = new ArrayList<String>();
		ArrayList<Employee> arrayList4 = new ArrayList<Employee>();
		
		ArrayList arrayList = new ArrayList();
		arrayList.add("sokoeurn");
		arrayList.add(60);
		arrayList.add(200.50);
		arrayList.add("welcome");
		arrayList.add(true);
		arrayList.add(null);
		arrayList.add(null);
		System.out.println(arrayList.size());
		System.out.println(arrayList);
		
		arrayList.remove(5);
		System.out.println(arrayList);
		
		arrayList.set(5, "Chhay");
		System.out.println(arrayList);
		
		System.out.println(arrayList.get(3));
		
		for( Object arr:arrayList) {
			System.out.println(arr);
		}
		
		for(int i=0;i<arrayList.size();i++) {
			System.out.println(i+" "+ arrayList.get(i));
		}
		
		Iterator it = arrayList.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println(arrayList.isEmpty());
		
		arrayList.clear();
		System.out.println(arrayList.isEmpty());
		
		
		
		
		
		

	}

}
